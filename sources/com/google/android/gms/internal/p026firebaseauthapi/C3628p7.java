package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.p7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3628p7 extends C3533mb {
    C3628p7() {
        super(C3438jf.class, new C3562n7(C3758t5.class));
    }

    /* renamed from: k */
    static /* bridge */ /* synthetic */ C3467kb m26454k(int i, int i2, int i3, int i4, int i5, int i6) {
        C3735sf A = C3768tf.m27007A();
        C3834vf A2 = C3866wf.m27286A();
        A2.mo16946j(16);
        A.mo16758k((C3866wf) A2.mo16062e());
        A.mo16757j(i);
        C3507li A3 = C3540mi.m26206A();
        C3606oi A4 = C3639pi.m26485A();
        A4.mo16509k(5);
        A4.mo16508j(i4);
        A3.mo16338k((C3639pi) A4.mo16062e());
        A3.mo16337j(32);
        C3504lf z = C3537mf.m26196z();
        z.mo16333j((C3768tf) A.mo16062e());
        z.mo16334k((C3540mi) A3.mo16062e());
        return new C3467kb((C3537mf) z.mo16062e(), i6);
    }

    /* renamed from: a */
    public final C3500lb mo15786a() {
        return new C3595o7(this, C3537mf.class);
    }

    /* renamed from: b */
    public final C3409ij mo15787b() {
        return C3409ij.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C3591o3 mo15788c(C3325g1 g1Var) throws C3689r2 {
        return C3438jf.m25900C(g1Var, C3852w1.m27266a());
    }

    /* renamed from: d */
    public final String mo15789d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15790e(C3591o3 o3Var) throws GeneralSecurityException {
        C3438jf jfVar = (C3438jf) o3Var;
        C3544mm.m26218c(jfVar.mo16219z(), 0);
        new C3727s7();
        C3727s7.m26886l(jfVar.mo16217D());
        new C3766td();
        C3766td.m26998l(jfVar.mo16218E());
    }

    /* renamed from: f */
    public final int mo16384f() {
        return 2;
    }
}
