package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.n9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3564n9 extends C3369hc {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final byte[] f22413e = new byte[0];

    C3564n9() {
        super(C3770th.class, C3868wh.class, new C3498l9(C3920y5.class));
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ C3467kb m26295m(int i, int i2, int i3, C3462k6 k6Var, byte[] bArr, int i4) {
        C3674qk qkVar;
        C3506lh z = C3539mh.m26203z();
        C3932yh z2 = C3964zh.m27571z();
        z2.mo17077k(4);
        z2.mo17078l(5);
        z2.mo17076j(C3325g1.m25613u(bArr));
        C3964zh zhVar = (C3964zh) z2.mo16062e();
        C3574nj z3 = C3607oj.m26382z();
        z3.mo16463k(k6Var.mo16254b());
        z3.mo16464l(C3325g1.m25613u(k6Var.mo16255c()));
        int d = k6Var.mo16256d() - 1;
        if (d == 0) {
            qkVar = C3674qk.TINK;
        } else if (d == 1) {
            qkVar = C3674qk.LEGACY;
        } else if (d != 2) {
            qkVar = C3674qk.CRUNCHY;
        } else {
            qkVar = C3674qk.RAW;
        }
        z3.mo16462j(qkVar);
        C3407ih z4 = C3440jh.m25911z();
        z4.mo16179j((C3607oj) z3.mo16062e());
        C3605oh A = C3671qh.m26571A();
        A.mo16506k(zhVar);
        A.mo16505j((C3440jh) z4.mo16062e());
        A.mo16507l(i3);
        z.mo16336j((C3671qh) A.mo16062e());
        return new C3467kb((C3539mh) z.mo16062e(), i4);
    }

    /* renamed from: a */
    public final C3500lb mo15786a() {
        return new C3531m9(this, C3539mh.class);
    }

    /* renamed from: b */
    public final C3409ij mo15787b() {
        return C3409ij.ASYMMETRIC_PRIVATE;
    }

    /* renamed from: c */
    public final /* synthetic */ C3591o3 mo15788c(C3325g1 g1Var) throws C3689r2 {
        return C3770th.m27018C(g1Var, C3852w1.m27266a());
    }

    /* renamed from: d */
    public final String mo15789d() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15790e(C3591o3 o3Var) throws GeneralSecurityException {
        C3770th thVar = (C3770th) o3Var;
        if (!thVar.mo16812E().mo16057z()) {
            C3544mm.m26218c(thVar.mo16813z(), 0);
            C3860w9.m27274a(thVar.mo16811D().mo16993A());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    /* renamed from: k */
    public final /* synthetic */ C3591o3 mo16095k(C3591o3 o3Var) throws GeneralSecurityException {
        return ((C3770th) o3Var).mo16811D();
    }
}
