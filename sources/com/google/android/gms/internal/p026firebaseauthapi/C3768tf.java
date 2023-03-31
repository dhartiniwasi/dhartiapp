package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.tf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3768tf extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3768tf zzb;
    private C3866wf zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        C3768tf tfVar = new C3768tf();
        zzb = tfVar;
        C3425j2.m25862j(C3768tf.class, tfVar);
    }

    private C3768tf() {
    }

    /* renamed from: A */
    public static C3735sf m27007A() {
        return (C3735sf) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3768tf m27009C() {
        return zzb;
    }

    /* renamed from: D */
    public static C3768tf m27010D(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3768tf) C3425j2.m25867w(zzb, g1Var, w1Var);
    }

    /* renamed from: F */
    static /* synthetic */ void m27011F(C3768tf tfVar, C3866wf wfVar) {
        wfVar.getClass();
        tfVar.zzd = wfVar;
    }

    /* renamed from: E */
    public final C3866wf mo16809E() {
        C3866wf wfVar = this.zzd;
        return wfVar == null ? C3866wf.m27288C() : wfVar;
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
            return new C3768tf();
        } else {
            if (i2 == 4) {
                return new C3735sf((C3702rf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo16810z() {
        return this.zze;
    }
}
