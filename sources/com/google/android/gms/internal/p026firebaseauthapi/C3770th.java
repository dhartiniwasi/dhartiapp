package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.th */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3770th extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3770th zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private C3868wh zze;
    /* access modifiers changed from: private */
    public C3325g1 zzf = C3325g1.f22056b;

    static {
        C3770th thVar = new C3770th();
        zzb = thVar;
        C3425j2.m25862j(C3770th.class, thVar);
    }

    private C3770th() {
    }

    /* renamed from: A */
    public static C3737sh m27016A() {
        return (C3737sh) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3770th m27018C(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3770th) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: G */
    static /* synthetic */ void m27020G(C3770th thVar, C3868wh whVar) {
        whVar.getClass();
        thVar.zze = whVar;
    }

    /* renamed from: D */
    public final C3868wh mo16811D() {
        C3868wh whVar = this.zze;
        return whVar == null ? C3868wh.m27294D() : whVar;
    }

    /* renamed from: E */
    public final C3325g1 mo16812E() {
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
            return new C3770th();
        } else {
            if (i2 == 4) {
                return new C3737sh((C3704rh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo16813z() {
        return this.zzd;
    }
}
