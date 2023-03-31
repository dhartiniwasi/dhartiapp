package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ke */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3470ke implements C3133a7 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f22295a = Logger.getLogger(C3470ke.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final byte[] f22296b = {0};

    C3470ke() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo15717a(C3953z6 z6Var) throws GeneralSecurityException {
        for (List it : z6Var.mo17097d()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    C3825v6 v6Var = (C3825v6) it2.next();
                    if (v6Var.mo16934b() instanceof C3338ge) {
                        C3338ge geVar = (C3338ge) v6Var.mo16934b();
                        C3643pm b = C3643pm.m26493b(v6Var.mo16938f());
                        if (!b.equals(geVar.mo16078c())) {
                            String valueOf = String.valueOf(geVar.mo16077b());
                            String obj = geVar.mo16078c().toString();
                            String obj2 = b.toString();
                            throw new GeneralSecurityException("Mac Key with parameters " + valueOf + " has wrong output prefix (" + obj + ") instead of (" + obj2 + ")");
                        }
                    }
                }
            }
        }
        return new C3437je(z6Var, (C3404ie) null);
    }

    /* renamed from: d */
    public final Class mo15718d() {
        return C3693r6.class;
    }

    public final Class zza() {
        return C3693r6.class;
    }
}
