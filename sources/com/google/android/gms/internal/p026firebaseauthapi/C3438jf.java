package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.jf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3438jf extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3438jf zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private C3669qf zze;
    private C3441ji zzf;

    static {
        C3438jf jfVar = new C3438jf();
        zzb = jfVar;
        C3425j2.m25862j(C3438jf.class, jfVar);
    }

    private C3438jf() {
    }

    /* renamed from: A */
    public static C3405if m25898A() {
        return (C3405if) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3438jf m25900C(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3438jf) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: G */
    static /* synthetic */ void m25902G(C3438jf jfVar, C3669qf qfVar) {
        qfVar.getClass();
        jfVar.zze = qfVar;
    }

    /* renamed from: H */
    static /* synthetic */ void m25903H(C3438jf jfVar, C3441ji jiVar) {
        jiVar.getClass();
        jfVar.zzf = jiVar;
    }

    /* renamed from: D */
    public final C3669qf mo16217D() {
        C3669qf qfVar = this.zze;
        return qfVar == null ? C3669qf.m26562C() : qfVar;
    }

    /* renamed from: E */
    public final C3441ji mo16218E() {
        C3441ji jiVar = this.zzf;
        return jiVar == null ? C3441ji.m25916C() : jiVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C3438jf();
        } else {
            if (i2 == 4) {
                return new C3405if((C3372hf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo16219z() {
        return this.zzd;
    }
}
