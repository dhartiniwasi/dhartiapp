package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class lj3 {

    /* renamed from: a */
    int[] f12820a;

    /* renamed from: b */
    private final int f12821b;

    public lj3(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f12820a = hj3.m13878d(bArr);
            this.f12821b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* renamed from: f */
    private final void m16049f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length == mo11716a()) {
            int remaining = byteBuffer2.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer c = mo12033c(bArr, this.f12821b + i2);
                if (i2 == i - 1) {
                    gu3.m13538a(byteBuffer, byteBuffer2, c, remaining % 64);
                } else {
                    gu3.m13538a(byteBuffer, byteBuffer2, c, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo11716a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo11716a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int[] mo11717b(int[] iArr, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final ByteBuffer mo12033c(byte[] bArr, int i) {
        int[] b = mo11717b(hj3.m13878d(bArr), i);
        int[] iArr = (int[]) b.clone();
        hj3.m13877c(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            b[i2] = b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }

    /* renamed from: d */
    public final void mo12034d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length) {
            m16049f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: e */
    public final byte[] mo12035e(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        m16049f(bArr, allocate, byteBuffer);
        return allocate.array();
    }
}
