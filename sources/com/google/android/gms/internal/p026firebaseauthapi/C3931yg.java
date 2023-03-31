package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.yg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3931yg extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3931yg zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private int zze;

    static {
        C3931yg ygVar = new C3931yg();
        zzb = ygVar;
        C3425j2.m25862j(C3931yg.class, ygVar);
    }

    private C3931yg() {
    }

    /* renamed from: A */
    public static C3899xg m27445A() {
        return (C3899xg) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3931yg m27447C(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3931yg) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new C3931yg();
        } else {
            if (i2 == 4) {
                return new C3899xg((C3867wg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo17075z() {
        return this.zzd;
    }
}
