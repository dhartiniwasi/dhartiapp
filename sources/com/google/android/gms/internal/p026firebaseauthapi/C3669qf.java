package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.qf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3669qf extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3669qf zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private C3866wf zze;
    /* access modifiers changed from: private */
    public C3325g1 zzf = C3325g1.f22056b;

    static {
        C3669qf qfVar = new C3669qf();
        zzb = qfVar;
        C3425j2.m25862j(C3669qf.class, qfVar);
    }

    private C3669qf() {
    }

    /* renamed from: A */
    public static C3636pf m26560A() {
        return (C3636pf) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3669qf m26562C() {
        return zzb;
    }

    /* renamed from: D */
    public static C3669qf m26563D(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3669qf) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: H */
    static /* synthetic */ void m26565H(C3669qf qfVar, C3866wf wfVar) {
        wfVar.getClass();
        qfVar.zze = wfVar;
    }

    /* renamed from: E */
    public final C3866wf mo16597E() {
        C3866wf wfVar = this.zze;
        return wfVar == null ? C3866wf.m27288C() : wfVar;
    }

    /* renamed from: F */
    public final C3325g1 mo16598F() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C3669qf();
        } else {
            if (i2 == 4) {
                return new C3636pf((C3603of) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo16599z() {
        return this.zzd;
    }
}
