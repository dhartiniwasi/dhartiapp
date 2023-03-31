package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.sg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3736sg extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3736sg zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private int zze;

    static {
        C3736sg sgVar = new C3736sg();
        zzb = sgVar;
        C3425j2.m25862j(C3736sg.class, sgVar);
    }

    private C3736sg() {
    }

    /* renamed from: A */
    public static C3703rg m26914A() {
        return (C3703rg) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3736sg m26916C(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3736sg) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        } else if (i2 == 3) {
            return new C3736sg();
        } else {
            if (i2 == 4) {
                return new C3703rg((C3670qg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo16759z() {
        return this.zzd;
    }
}
