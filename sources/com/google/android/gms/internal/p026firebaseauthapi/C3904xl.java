package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.xl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3904xl implements C3181bm {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15745a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return KeyPairGenerator.getInstance(str);
        }
        return KeyPairGenerator.getInstance(str, provider);
    }
}
