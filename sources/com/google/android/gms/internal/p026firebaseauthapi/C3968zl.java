package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Provider;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3968zl implements C3181bm {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15745a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return MessageDigest.getInstance(str);
        }
        return MessageDigest.getInstance(str, provider);
    }
}
