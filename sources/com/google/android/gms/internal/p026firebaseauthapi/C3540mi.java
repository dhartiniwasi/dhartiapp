package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.mi */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3540mi extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3540mi zzb;
    private C3639pi zzd;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        C3540mi miVar = new C3540mi();
        zzb = miVar;
        C3425j2.m25862j(C3540mi.class, miVar);
    }

    private C3540mi() {
    }

    /* renamed from: A */
    public static C3507li m26206A() {
        return (C3507li) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3540mi m26208C() {
        return zzb;
    }

    /* renamed from: D */
    public static C3540mi m26209D(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3540mi) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: F */
    static /* synthetic */ void m26210F(C3540mi miVar, C3639pi piVar) {
        piVar.getClass();
        miVar.zzd = piVar;
    }

    /* renamed from: E */
    public final C3639pi mo16396E() {
        C3639pi piVar = this.zzd;
        return piVar == null ? C3639pi.m26487C() : piVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C3540mi();
        } else {
            if (i2 == 4) {
                return new C3507li((C3474ki) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo16397z() {
        return this.zze;
    }
}
