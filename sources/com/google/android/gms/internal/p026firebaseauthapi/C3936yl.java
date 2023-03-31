package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.yl */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3936yl implements C3181bm {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15745a(String str, Provider provider) throws GeneralSecurityException {
        if (provider == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, provider);
    }
}
