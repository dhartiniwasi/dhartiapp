package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.cg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3208cg extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3208cg zzb;
    private C3307fg zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        C3208cg cgVar = new C3208cg();
        zzb = cgVar;
        C3425j2.m25862j(C3208cg.class, cgVar);
    }

    private C3208cg() {
    }

    /* renamed from: A */
    public static C3175bg m25329A() {
        return (C3175bg) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3208cg m25331C(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3208cg) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: E */
    static /* synthetic */ void m25332E(C3208cg cgVar, C3307fg fgVar) {
        fgVar.getClass();
        cgVar.zzd = fgVar;
    }

    /* renamed from: D */
    public final C3307fg mo15905D() {
        C3307fg fgVar = this.zzd;
        return fgVar == null ? C3307fg.m25573C() : fgVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new C3208cg();
        } else {
            if (i2 == 4) {
                return new C3175bg((C3142ag) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo15906z() {
        return this.zze;
    }
}
