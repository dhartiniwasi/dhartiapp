package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.tb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3764tb {

    /* renamed from: a */
    public static final C3668qe f22735a = new C3731sb((C3698rb) null);

    /* renamed from: a */
    public static C3865we m26996a(C3953z6 z6Var) {
        C3429j6 j6Var;
        C3734se seVar = new C3734se();
        seVar.mo16754b(z6Var.mo17095b());
        for (List it : z6Var.mo17097d()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C3825v6 v6Var = (C3825v6) it2.next();
                    int g = v6Var.mo16939g() - 2;
                    if (g == 1) {
                        j6Var = C3429j6.f22212b;
                    } else if (g == 2) {
                        j6Var = C3429j6.f22213c;
                    } else if (g == 3) {
                        j6Var = C3429j6.f22214d;
                    } else {
                        throw new IllegalStateException("Unknown key status");
                    }
                    seVar.mo16753a(j6Var, v6Var.mo16933a(), v6Var.mo16935c());
                }
            }
        }
        if (z6Var.mo17094a() != null) {
            seVar.mo16755c(z6Var.mo17094a().mo16933a());
        }
        try {
            return seVar.mo16756d();
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
