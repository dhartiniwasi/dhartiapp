package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.mh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3539mh extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3539mh zzb;
    private C3671qh zzd;

    static {
        C3539mh mhVar = new C3539mh();
        zzb = mhVar;
        C3425j2.m25862j(C3539mh.class, mhVar);
    }

    private C3539mh() {
    }

    /* renamed from: B */
    public static C3539mh m26201B(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3539mh) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: D */
    static /* synthetic */ void m26202D(C3539mh mhVar, C3671qh qhVar) {
        qhVar.getClass();
        mhVar.zzd = qhVar;
    }

    /* renamed from: z */
    public static C3506lh m26203z() {
        return (C3506lh) zzb.mo16211s();
    }

    /* renamed from: C */
    public final C3671qh mo16395C() {
        C3671qh qhVar = this.zzd;
        return qhVar == null ? C3671qh.m26573C() : qhVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new C3539mh();
        } else {
            if (i2 == 4) {
                return new C3506lh((C3473kh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
