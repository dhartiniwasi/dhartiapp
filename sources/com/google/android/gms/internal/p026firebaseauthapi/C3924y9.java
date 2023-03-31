package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.y9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3924y9 implements C3169ba {

    /* renamed from: a */
    private final int f22948a;

    C3924y9(int i) throws InvalidAlgorithmParameterException {
        if (i == 16 || i == 32) {
            this.f22948a = i;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + i);
    }

    /* renamed from: a */
    public final byte[] mo15793a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        int length = bArr.length;
        if (length == this.f22948a) {
            return new C3728s8(bArr, false).mo16751a(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }

    /* renamed from: d */
    public final byte[] mo15794d() throws GeneralSecurityException {
        int i = this.f22948a;
        if (i == 16) {
            return C3598oa.f22453i;
        }
        if (i == 32) {
            return C3598oa.f22454j;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    public final int zza() {
        return this.f22948a;
    }
}
