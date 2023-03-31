package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ik */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3410ik extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3410ik zzb;
    private String zzd = "";

    static {
        C3410ik ikVar = new C3410ik();
        zzb = ikVar;
        C3425j2.m25862j(C3410ik.class, ikVar);
    }

    private C3410ik() {
    }

    /* renamed from: A */
    public static C3410ik m25816A() {
        return zzb;
    }

    /* renamed from: B */
    public static C3410ik m25817B(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3410ik) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: C */
    public final String mo16185C() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new C3410ik();
        } else {
            if (i2 == 4) {
                return new C3377hk((C3344gk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
