package com.google.android.gms.internal.p026firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.td */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3766td extends C3533mb {
    public C3766td() {
        super(C3441ji.class, new C3700rd(C3693r6.class));
    }

    /* renamed from: l */
    public static final void m26998l(C3441ji jiVar) throws GeneralSecurityException {
        C3544mm.m26218c(jiVar.mo16223z(), 0);
        if (jiVar.mo16222F().mo15875f() >= 16) {
            m27000n(jiVar.mo16221E());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* renamed from: m */
    static /* bridge */ /* synthetic */ C3467kb m26999m(int i, int i2, int i3, int i4) {
        C3507li A = C3540mi.m26206A();
        C3606oi A2 = C3639pi.m26485A();
        A2.mo16509k(i3);
        A2.mo16508j(i2);
        A.mo16338k((C3639pi) A2.mo16062e());
        A.mo16337j(i);
        return new C3467kb((C3540mi) A.mo16062e(), i4);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m27000n(C3639pi piVar) throws GeneralSecurityException {
        if (piVar.mo16553z() >= 10) {
            int E = piVar.mo16552E() - 2;
            if (E != 1) {
                if (E != 2) {
                    if (E != 3) {
                        if (E != 4) {
                            if (E != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (piVar.mo16553z() > 28) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (piVar.mo16553z() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (piVar.mo16553z() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (piVar.mo16553z() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (piVar.mo16553z() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    /* renamed from: a */
    public final C3500lb mo15786a() {
        return new C3733sd(this, C3540mi.class);
    }

    /* renamed from: b */
    public final C3409ij mo15787b() {
        return C3409ij.SYMMETRIC;
    }

    /* renamed from: c */
    public final /* synthetic */ C3591o3 mo15788c(C3325g1 g1Var) throws C3689r2 {
        return C3441ji.m25917D(g1Var, C3852w1.m27266a());
    }

    /* renamed from: d */
    public final String mo15789d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo15790e(C3591o3 o3Var) throws GeneralSecurityException {
        m26998l((C3441ji) o3Var);
    }

    /* renamed from: f */
    public final int mo16384f() {
        return 2;
    }
}
