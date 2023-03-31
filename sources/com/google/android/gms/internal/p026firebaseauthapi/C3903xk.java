package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.xk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3903xk extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3903xk zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public C3325g1 zze = C3325g1.f22056b;

    static {
        C3903xk xkVar = new C3903xk();
        zzb = xkVar;
        C3425j2.m25862j(C3903xk.class, xkVar);
    }

    private C3903xk() {
    }

    /* renamed from: A */
    public static C3871wk m27391A() {
        return (C3871wk) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3903xk m27393C(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3903xk) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: D */
    public final C3325g1 mo17052D() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new C3903xk();
        } else {
            if (i2 == 4) {
                return new C3871wk((C3839vk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo17053z() {
        return this.zzd;
    }
}
