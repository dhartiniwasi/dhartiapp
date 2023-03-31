package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.lg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3505lg extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3505lg zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private int zze;

    static {
        C3505lg lgVar = new C3505lg();
        zzb = lgVar;
        C3425j2.m25862j(C3505lg.class, lgVar);
    }

    private C3505lg() {
    }

    /* renamed from: A */
    public static C3472kg m26105A() {
        return (C3472kg) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3505lg m26107C(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3505lg) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new C3505lg();
        } else {
            if (i2 == 4) {
                return new C3472kg((C3439jg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo16335z() {
        return this.zzd;
    }
}
