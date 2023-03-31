package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ej */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3277ej extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3277ej zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private C3933yi zze;
    /* access modifiers changed from: private */
    public C3325g1 zzf = C3325g1.f22056b;

    static {
        C3277ej ejVar = new C3277ej();
        zzb = ejVar;
        C3425j2.m25862j(C3277ej.class, ejVar);
    }

    private C3277ej() {
    }

    /* renamed from: B */
    public static C3244dj m25511B() {
        return (C3244dj) zzb.mo16211s();
    }

    /* renamed from: D */
    public static C3277ej m25513D() {
        return zzb;
    }

    /* renamed from: E */
    public static C3277ej m25514E(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3277ej) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: H */
    static /* synthetic */ void m25516H(C3277ej ejVar, C3933yi yiVar) {
        yiVar.getClass();
        ejVar.zze = yiVar;
    }

    /* renamed from: A */
    public final C3933yi mo15989A() {
        C3933yi yiVar = this.zze;
        return yiVar == null ? C3933yi.m27455B() : yiVar;
    }

    /* renamed from: F */
    public final C3325g1 mo15990F() {
        return this.zzf;
    }

    /* renamed from: K */
    public final boolean mo15991K() {
        return this.zze != null;
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
            return new C3277ej();
        } else {
            if (i2 == 4) {
                return new C3244dj((C3211cj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo15992z() {
        return this.zzd;
    }
}
