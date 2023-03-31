package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.z9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3956z9 implements C3169ba {
    C3956z9() {
    }

    /* renamed from: a */
    public final byte[] mo15793a(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException {
        if (bArr.length == 32) {
            return new C3827v8(bArr).mo16981c(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }

    /* renamed from: d */
    public final byte[] mo15794d() {
        return C3598oa.f22455k;
    }

    public final int zza() {
        return 32;
    }
}
