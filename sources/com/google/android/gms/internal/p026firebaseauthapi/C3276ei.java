package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ei */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3276ei extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3276ei zzb;
    /* access modifiers changed from: private */
    public C3325g1 zzd = C3325g1.f22056b;
    private C3212ck zze;

    static {
        C3276ei eiVar = new C3276ei();
        zzb = eiVar;
        C3425j2.m25862j(C3276ei.class, eiVar);
    }

    private C3276ei() {
    }

    /* renamed from: B */
    public static C3276ei m25505B(byte[] bArr, C3852w1 w1Var) throws C3689r2 {
        return (C3276ei) C3425j2.m25868x(zzb, bArr, w1Var);
    }

    /* renamed from: E */
    static /* synthetic */ void m25507E(C3276ei eiVar, C3212ck ckVar) {
        ckVar.getClass();
        eiVar.zze = ckVar;
    }

    /* renamed from: z */
    public static C3243di m25508z() {
        return (C3243di) zzb.mo16211s();
    }

    /* renamed from: C */
    public final C3325g1 mo15988C() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new C3276ei();
        } else {
            if (i2 == 4) {
                return new C3243di((C3210ci) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
