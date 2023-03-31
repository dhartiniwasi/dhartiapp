package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.eb */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C3269eb {

    /* renamed from: a */
    private final C3643pm f21987a;

    /* renamed from: b */
    private final Class f21988b;

    /* synthetic */ C3269eb(C3643pm pmVar, Class cls, C3236db dbVar) {
        this.f21987a = pmVar;
        this.f21988b = cls;
    }

    /* renamed from: b */
    public static C3269eb m25494b(C3203cb cbVar, C3643pm pmVar, Class cls) {
        return new C3170bb(pmVar, cls, cbVar);
    }

    /* renamed from: a */
    public abstract C3132a6 mo15796a(C3501lc lcVar, C3331g7 g7Var) throws GeneralSecurityException;

    /* renamed from: c */
    public final C3643pm mo15984c() {
        return this.f21987a;
    }

    /* renamed from: d */
    public final Class mo15985d() {
        return this.f21988b;
    }
}
