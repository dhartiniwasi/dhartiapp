package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.y7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3922y7 extends C3533mb {
    C3922y7() {
        super(C3406ig.class, new C3858w7(C3758t5.class));
    }

    /* renamed from: k */
    static /* bridge */ /* synthetic */ C3467kb m27426k(int i, int i2) {
        C3472kg A = C3505lg.m26105A();
        A.mo16261j(i);
        return new C3467kb((C3505lg) A.mo16062e(), i2);
    }

    /* renamed from: a */
    public final C3500lb mo15786a() {
        return new C3890x7(this, C3505lg.class);
    }

    /* renamed from: b */
    public final C3409ij mo15787b() {
        return C3409ij.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C3591o3 mo15788c(C3325g1 g1Var) throws C3689r2 {
        return C3406ig.m25805C(g1Var, C3852w1.m27266a());
    }

    /* renamed from: d */
    public final String mo15789d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15790e(C3591o3 o3Var) throws GeneralSecurityException {
        C3406ig igVar = (C3406ig) o3Var;
        C3544mm.m26218c(igVar.mo16178z(), 0);
        C3544mm.m26217b(igVar.mo16177D().mo15875f());
    }

    /* renamed from: f */
    public final int mo16384f() {
        return 2;
    }
}
