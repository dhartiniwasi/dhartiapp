package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.vi */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3837vi extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3837vi zzb;
    private C3933yi zzd;

    static {
        C3837vi viVar = new C3837vi();
        zzb = viVar;
        C3425j2.m25862j(C3837vi.class, viVar);
    }

    private C3837vi() {
    }

    /* renamed from: B */
    public static C3837vi m27230B(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3837vi) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: D */
    static /* synthetic */ void m27231D(C3837vi viVar, C3933yi yiVar) {
        yiVar.getClass();
        viVar.zzd = yiVar;
    }

    /* renamed from: z */
    public static C3804ui m27232z() {
        return (C3804ui) zzb.mo16211s();
    }

    /* renamed from: C */
    public final C3933yi mo16953C() {
        C3933yi yiVar = this.zzd;
        return yiVar == null ? C3933yi.m27455B() : yiVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new C3837vi();
        } else {
            if (i2 == 4) {
                return new C3804ui((C3771ti) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
