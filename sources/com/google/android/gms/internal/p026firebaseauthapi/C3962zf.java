package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3962zf extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3962zf zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private C3307fg zze;
    /* access modifiers changed from: private */
    public C3325g1 zzf = C3325g1.f22056b;

    static {
        C3962zf zfVar = new C3962zf();
        zzb = zfVar;
        C3425j2.m25862j(C3962zf.class, zfVar);
    }

    private C3962zf() {
    }

    /* renamed from: A */
    public static C3930yf m27556A() {
        return (C3930yf) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3962zf m27558C(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3962zf) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: G */
    static /* synthetic */ void m27560G(C3962zf zfVar, C3307fg fgVar) {
        fgVar.getClass();
        zfVar.zze = fgVar;
    }

    /* renamed from: D */
    public final C3307fg mo17112D() {
        C3307fg fgVar = this.zze;
        return fgVar == null ? C3307fg.m25573C() : fgVar;
    }

    /* renamed from: E */
    public final C3325g1 mo17113E() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C3962zf();
        } else {
            if (i2 == 4) {
                return new C3930yf((C3898xf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo17114z() {
        return this.zzd;
    }
}
