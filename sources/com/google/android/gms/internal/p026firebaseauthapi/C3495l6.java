package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.l6 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3495l6 {
    /* renamed from: a */
    public static C3462k6 m26080a(String str) throws GeneralSecurityException {
        C3462k6 k6Var = (C3462k6) C3265e7.m25481l().get(str);
        if (k6Var != null) {
            return k6Var;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
