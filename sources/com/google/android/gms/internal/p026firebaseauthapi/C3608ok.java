package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ok */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3608ok extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3608ok zzb;
    private String zzd = "";
    private C3607oj zze;

    static {
        C3608ok okVar = new C3608ok();
        zzb = okVar;
        C3425j2.m25862j(C3608ok.class, okVar);
    }

    private C3608ok() {
    }

    /* renamed from: B */
    public static C3608ok m26388B() {
        return zzb;
    }

    /* renamed from: C */
    public static C3608ok m26389C(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3608ok) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: D */
    public final String mo16513D() {
        return this.zzd;
    }

    /* renamed from: E */
    public final boolean mo16514E() {
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
            return C3425j2.m25861f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new C3608ok();
        } else {
            if (i2 == 4) {
                return new C3575nk((C3542mk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final C3607oj mo16515z() {
        C3607oj ojVar = this.zze;
        return ojVar == null ? C3607oj.m26378B() : ojVar;
    }
}
