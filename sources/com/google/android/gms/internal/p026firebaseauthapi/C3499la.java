package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.la */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3499la extends C3369hc {
    public C3499la() {
        super(C3178bj.class, C3277ej.class, new C3433ja(C3920y5.class));
    }

    /* renamed from: l */
    static /* bridge */ /* synthetic */ C3467kb m26087l(int i, int i2, int i3, int i4) {
        C3901xi z = C3933yi.m27459z();
        z.mo17047l(i);
        z.mo17046k(i2);
        z.mo17045j(i3);
        C3804ui z2 = C3837vi.m27232z();
        z2.mo16878j((C3933yi) z.mo16062e());
        return new C3467kb((C3837vi) z2.mo16062e(), i4);
    }

    /* renamed from: a */
    public final C3500lb mo15786a() {
        return new C3466ka(this, C3837vi.class);
    }

    /* renamed from: b */
    public final C3409ij mo15787b() {
        return C3409ij.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: c */
    public final /* synthetic */ C3591o3 mo15788c(C3325g1 g1Var) throws C3689r2 {
        return C3178bj.m25127C(g1Var, C3852w1.m27266a());
    }

    /* renamed from: d */
    public final String mo15789d() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15790e(C3591o3 o3Var) throws GeneralSecurityException {
        C3178bj bjVar = (C3178bj) o3Var;
        if (bjVar.mo15804E().mo16057z()) {
            throw new GeneralSecurityException("Private key is empty.");
        } else if (bjVar.mo15805J()) {
            C3544mm.m26218c(bjVar.mo15806z(), 0);
            C3598oa.m26361a(bjVar.mo15803D().mo15989A());
        } else {
            throw new GeneralSecurityException("Missing public key.");
        }
    }

    /* renamed from: k */
    public final /* synthetic */ C3591o3 mo16095k(C3591o3 o3Var) throws GeneralSecurityException {
        return ((C3178bj) o3Var).mo15803D();
    }
}
