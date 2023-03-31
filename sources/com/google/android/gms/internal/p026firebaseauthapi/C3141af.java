package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.af */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3141af extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3141af zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public C3325g1 zze = C3325g1.f22056b;
    private C3339gf zzf;

    static {
        C3141af afVar = new C3141af();
        zzb = afVar;
        C3425j2.m25862j(C3141af.class, afVar);
    }

    private C3141af() {
    }

    /* renamed from: A */
    public static C3961ze m25021A() {
        return (C3961ze) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3141af m25023C(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3141af) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: H */
    static /* synthetic */ void m25026H(C3141af afVar, C3339gf gfVar) {
        gfVar.getClass();
        afVar.zzf = gfVar;
    }

    /* renamed from: D */
    public final C3339gf mo15732D() {
        C3339gf gfVar = this.zzf;
        return gfVar == null ? C3339gf.m25665C() : gfVar;
    }

    /* renamed from: E */
    public final C3325g1 mo15733E() {
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
            return C3425j2.m25861f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C3141af();
        } else {
            if (i2 == 4) {
                return new C3961ze((C3929ye) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo15735z() {
        return this.zzd;
    }
}
