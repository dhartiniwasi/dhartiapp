package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.lk */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3509lk extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3509lk zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private C3608ok zze;

    static {
        C3509lk lkVar = new C3509lk();
        zzb = lkVar;
        C3425j2.m25862j(C3509lk.class, lkVar);
    }

    private C3509lk() {
    }

    /* renamed from: A */
    public static C3476kk m26115A() {
        return (C3476kk) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3509lk m26117C(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3509lk) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: F */
    static /* synthetic */ void m26119F(C3509lk lkVar, C3608ok okVar) {
        okVar.getClass();
        lkVar.zze = okVar;
    }

    /* renamed from: D */
    public final C3608ok mo16339D() {
        C3608ok okVar = this.zze;
        return okVar == null ? C3608ok.m26388B() : okVar;
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
            return new C3509lk();
        } else {
            if (i2 == 4) {
                return new C3476kk((C3443jk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo16340z() {
        return this.zzd;
    }
}
