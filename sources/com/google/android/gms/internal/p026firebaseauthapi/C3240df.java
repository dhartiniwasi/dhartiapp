package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.df */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3240df extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3240df zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private C3339gf zze;

    static {
        C3240df dfVar = new C3240df();
        zzb = dfVar;
        C3425j2.m25862j(C3240df.class, dfVar);
    }

    private C3240df() {
    }

    /* renamed from: A */
    public static C3207cf m25420A() {
        return (C3207cf) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3240df m25422C(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3240df) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: F */
    static /* synthetic */ void m25424F(C3240df dfVar, C3339gf gfVar) {
        gfVar.getClass();
        dfVar.zze = gfVar;
    }

    /* renamed from: D */
    public final C3339gf mo15954D() {
        C3339gf gfVar = this.zze;
        return gfVar == null ? C3339gf.m25665C() : gfVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new C3240df();
        } else {
            if (i2 == 4) {
                return new C3207cf((C3174bf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo15955z() {
        return this.zzd;
    }
}
