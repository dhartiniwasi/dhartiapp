package com.google.android.gms.internal.p026firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.w8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class C3859w8 {

    /* renamed from: a */
    private final C3794u8 f22863a;

    /* renamed from: b */
    private final C3794u8 f22864b;

    public C3859w8(byte[] bArr) throws GeneralSecurityException {
        if (C3201c9.m25322a(1)) {
            this.f22863a = mo16940a(bArr, 1);
            this.f22864b = mo16940a(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract C3794u8 mo16940a(byte[] bArr, int i) throws InvalidKeyException;

    /* renamed from: b */
    public final byte[] mo16980b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= 16) {
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            try {
                byte[] bArr4 = new byte[32];
                this.f22864b.mo16866c(bArr, 0).get(bArr4);
                int remaining = byteBuffer.remaining();
                int i = remaining % 16;
                int i2 = i == 0 ? remaining : (remaining + 16) - i;
                ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
                order.put(bArr2);
                order.position(0);
                order.put(byteBuffer);
                order.position(i2);
                order.putLong(0);
                order.putLong((long) remaining);
                if (C3411il.m25822b(C3955z8.m27539a(bArr4, order.array()), bArr3)) {
                    byteBuffer.position(position);
                    return this.f22863a.mo16867d(bArr, byteBuffer);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    /* renamed from: c */
    public final byte[] mo16981c(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return mo16980b(ByteBuffer.wrap(bArr2), bArr, bArr3);
    }
}
