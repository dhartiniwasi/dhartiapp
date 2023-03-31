package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.gl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3345gl implements C3758t5 {

    /* renamed from: a */
    private final C3728s8 f22073a;

    public C3345gl(byte[] bArr) throws GeneralSecurityException {
        if (C3201c9.m25322a(2)) {
            this.f22073a = new C3728s8(bArr, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    /* renamed from: a */
    public final byte[] mo15791a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.f22073a.mo16751a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }

    /* renamed from: b */
    public final byte[] mo15792b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}
