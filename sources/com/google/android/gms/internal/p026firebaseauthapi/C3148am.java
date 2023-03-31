package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.am */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3148am implements C3181bm {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15745a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Signature.getInstance(str);
        }
        return Signature.getInstance(str, provider);
    }
}
