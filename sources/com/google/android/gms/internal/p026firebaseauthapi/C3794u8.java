package com.google.android.gms.internal.p026firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class C3794u8 {

    /* renamed from: a */
    int[] f22772a;

    /* renamed from: b */
    private final int f22773b;

    public C3794u8(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length == 32) {
            this.f22772a = C3662q8.m26552d(bArr);
            this.f22773b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo16806a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract int[] mo16807b(int[] iArr, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final ByteBuffer mo16866c(byte[] bArr, int i) {
        int[] b = mo16807b(C3662q8.m26552d(bArr), i);
        int[] iArr = (int[]) b.clone();
        C3662q8.m26551c(iArr);
        for (int i2 = 0; i2 < 16; i2++) {
            b[i2] = b[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b, 0, 16);
        return order;
    }

    /* renamed from: d */
    public final byte[] mo16867d(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length == mo16806a()) {
            int remaining = byteBuffer.remaining();
            int i = (remaining / 64) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                ByteBuffer c = mo16866c(bArr, this.f22773b + i2);
                if (i2 == i - 1) {
                    C3411il.m25821a(allocate, byteBuffer, c, remaining % 64);
                } else {
                    C3411il.m25821a(allocate, byteBuffer, c, 64);
                }
            }
            return allocate.array();
        }
        throw new GeneralSecurityException("The nonce length (in bytes) must be " + mo16806a());
    }
}
