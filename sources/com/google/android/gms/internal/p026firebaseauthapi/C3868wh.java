package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.wh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3868wh extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3868wh zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private C3671qh zze;
    /* access modifiers changed from: private */
    public C3325g1 zzf;
    /* access modifiers changed from: private */
    public C3325g1 zzg;

    static {
        C3868wh whVar = new C3868wh();
        zzb = whVar;
        C3425j2.m25862j(C3868wh.class, whVar);
    }

    private C3868wh() {
        C3325g1 g1Var = C3325g1.f22056b;
        this.zzf = g1Var;
        this.zzg = g1Var;
    }

    /* renamed from: B */
    public static C3836vh m27292B() {
        return (C3836vh) zzb.mo16211s();
    }

    /* renamed from: D */
    public static C3868wh m27294D() {
        return zzb;
    }

    /* renamed from: E */
    public static C3868wh m27295E(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3868wh) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: J */
    static /* synthetic */ void m27297J(C3868wh whVar, C3671qh qhVar) {
        qhVar.getClass();
        whVar.zze = qhVar;
    }

    /* renamed from: A */
    public final C3671qh mo16993A() {
        C3671qh qhVar = this.zze;
        return qhVar == null ? C3671qh.m26573C() : qhVar;
    }

    /* renamed from: F */
    public final C3325g1 mo16994F() {
        return this.zzf;
    }

    /* renamed from: G */
    public final C3325g1 mo16995G() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C3868wh();
        } else {
            if (i2 == 4) {
                return new C3836vh((C3803uh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo16996z() {
        return this.zzd;
    }
}
