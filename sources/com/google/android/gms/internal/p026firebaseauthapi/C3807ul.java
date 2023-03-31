package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Cipher;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ul */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3807ul implements C3181bm {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15745a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }
}
