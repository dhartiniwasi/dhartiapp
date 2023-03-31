package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.v7 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3826v7 extends C3533mb {
    C3826v7() {
        super(C3962zf.class, new C3760t7(C3758t5.class));
    }

    /* renamed from: k */
    static /* bridge */ /* synthetic */ C3467kb m27202k(int i, int i2, int i3) {
        C3175bg A = C3208cg.m25329A();
        A.mo15799j(i);
        C3274eg A2 = C3307fg.m25571A();
        A2.mo15987j(16);
        A.mo15800k((C3307fg) A2.mo16062e());
        return new C3467kb((C3208cg) A.mo16062e(), i3);
    }

    /* renamed from: a */
    public final C3500lb mo15786a() {
        return new C3793u7(this, C3208cg.class);
    }

    /* renamed from: b */
    public final C3409ij mo15787b() {
        return C3409ij.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C3591o3 mo15788c(C3325g1 g1Var) throws C3689r2 {
        return C3962zf.m27558C(g1Var, C3852w1.m27266a());
    }

    /* renamed from: d */
    public final String mo15789d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15790e(C3591o3 o3Var) throws GeneralSecurityException {
        C3962zf zfVar = (C3962zf) o3Var;
        C3544mm.m26218c(zfVar.mo17114z(), 0);
        C3544mm.m26217b(zfVar.mo17113E().mo15875f());
        if (zfVar.mo17112D().mo16027z() != 12 && zfVar.mo17112D().mo16027z() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
