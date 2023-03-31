package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.mf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3537mf extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3537mf zzb;
    private C3768tf zzd;
    private C3540mi zze;

    static {
        C3537mf mfVar = new C3537mf();
        zzb = mfVar;
        C3425j2.m25862j(C3537mf.class, mfVar);
    }

    private C3537mf() {
    }

    /* renamed from: B */
    public static C3537mf m26193B(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3537mf) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: E */
    static /* synthetic */ void m26194E(C3537mf mfVar, C3768tf tfVar) {
        tfVar.getClass();
        mfVar.zzd = tfVar;
    }

    /* renamed from: F */
    static /* synthetic */ void m26195F(C3537mf mfVar, C3540mi miVar) {
        miVar.getClass();
        mfVar.zze = miVar;
    }

    /* renamed from: z */
    public static C3504lf m26196z() {
        return (C3504lf) zzb.mo16211s();
    }

    /* renamed from: C */
    public final C3768tf mo16393C() {
        C3768tf tfVar = this.zzd;
        return tfVar == null ? C3768tf.m27009C() : tfVar;
    }

    /* renamed from: D */
    public final C3540mi mo16394D() {
        C3540mi miVar = this.zze;
        return miVar == null ? C3540mi.m26208C() : miVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new C3537mf();
        } else {
            if (i2 == 4) {
                return new C3504lf((C3471kf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
