package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.bj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3178bj extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3178bj zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private C3277ej zze;
    /* access modifiers changed from: private */
    public C3325g1 zzf = C3325g1.f22056b;

    static {
        C3178bj bjVar = new C3178bj();
        zzb = bjVar;
        C3425j2.m25862j(C3178bj.class, bjVar);
    }

    private C3178bj() {
    }

    /* renamed from: A */
    public static C3145aj m25125A() {
        return (C3145aj) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3178bj m25127C(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3178bj) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: G */
    static /* synthetic */ void m25129G(C3178bj bjVar, C3277ej ejVar) {
        ejVar.getClass();
        bjVar.zze = ejVar;
    }

    /* renamed from: D */
    public final C3277ej mo15803D() {
        C3277ej ejVar = this.zze;
        return ejVar == null ? C3277ej.m25513D() : ejVar;
    }

    /* renamed from: E */
    public final C3325g1 mo15804E() {
        return this.zzf;
    }

    /* renamed from: J */
    public final boolean mo15805J() {
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
            return new C3178bj();
        } else {
            if (i2 == 4) {
                return new C3145aj((C3965zi) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo15806z() {
        return this.zzd;
    }
}
