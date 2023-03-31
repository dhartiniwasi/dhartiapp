package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ji */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3441ji extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3441ji zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private C3639pi zze;
    /* access modifiers changed from: private */
    public C3325g1 zzf = C3325g1.f22056b;

    static {
        C3441ji jiVar = new C3441ji();
        zzb = jiVar;
        C3425j2.m25862j(C3441ji.class, jiVar);
    }

    private C3441ji() {
    }

    /* renamed from: A */
    public static C3408ii m25914A() {
        return (C3408ii) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3441ji m25916C() {
        return zzb;
    }

    /* renamed from: D */
    public static C3441ji m25917D(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3441ji) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: H */
    static /* synthetic */ void m25919H(C3441ji jiVar, C3639pi piVar) {
        piVar.getClass();
        jiVar.zze = piVar;
    }

    /* renamed from: E */
    public final C3639pi mo16221E() {
        C3639pi piVar = this.zze;
        return piVar == null ? C3639pi.m26487C() : piVar;
    }

    /* renamed from: F */
    public final C3325g1 mo16222F() {
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
            return new C3441ji();
        } else {
            if (i2 == 4) {
                return new C3408ii((C3375hi) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo16223z() {
        return this.zzd;
    }
}
