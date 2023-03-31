package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.t8 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3761t8 extends C3794u8 {
    public C3761t8(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    /* renamed from: a */
    public final int mo16806a() {
        return 12;
    }

    /* renamed from: b */
    public final int[] mo16807b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            C3662q8.m26550b(iArr2, this.f22772a);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(length * 32)}));
    }
}
