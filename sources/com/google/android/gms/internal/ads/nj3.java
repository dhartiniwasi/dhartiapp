package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class nj3 {

    /* renamed from: a */
    private final lj3 f14045a;

    /* renamed from: b */
    private final lj3 f14046b;

    public nj3(byte[] bArr) throws GeneralSecurityException {
        if (tj3.m21050a(1)) {
            this.f14045a = mo12364a(bArr, 1);
            this.f14046b = mo12364a(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    /* renamed from: e */
    private final byte[] m17150e(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = new byte[32];
        this.f14046b.mo12033c(bArr, 0).get(bArr2);
        return bArr2;
    }

    /* renamed from: f */
    private static byte[] m17151f(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length;
        int i = length & 15;
        int i2 = i == 0 ? length : (length + 16) - i;
        int remaining = byteBuffer.remaining();
        int i3 = remaining % 16;
        int i4 = (i3 == 0 ? remaining : (remaining + 16) - i3) + i2;
        ByteBuffer order = ByteBuffer.allocate(i4 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(i2);
        order.put(byteBuffer);
        order.position(i4);
        order.putLong((long) length);
        order.putLong((long) remaining);
        return order.array();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract lj3 mo12364a(byte[] bArr, int i) throws InvalidKeyException;

    /* renamed from: b */
    public final void mo12640b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= bArr2.length + 16) {
            int position = byteBuffer.position();
            this.f14045a.mo12034d(byteBuffer, bArr, bArr2);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            byte[] a = qj3.m19237a(m17150e(bArr), m17151f(bArr3, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(a);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* renamed from: c */
    public final byte[] mo12641c(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                if (gu3.m13539b(qj3.m19237a(m17150e(bArr), m17151f(bArr2, byteBuffer)), bArr3)) {
                    byteBuffer.position(position);
                    return this.f14045a.mo12035e(bArr, byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    /* renamed from: d */
    public final byte[] mo12642d(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        int length = bArr2.length;
        if (length <= 2147483631) {
            ByteBuffer allocate = ByteBuffer.allocate(length + 16);
            mo12640b(allocate, bArr, bArr2, bArr3);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}
