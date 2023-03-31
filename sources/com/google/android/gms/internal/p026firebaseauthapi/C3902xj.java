package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.xj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3902xj extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3902xj zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private C3590o2 zze = C3425j2.m25869y();

    static {
        C3902xj xjVar = new C3902xj();
        zzb = xjVar;
        C3425j2.m25862j(C3902xj.class, xjVar);
    }

    private C3902xj() {
    }

    /* renamed from: B */
    public static C3805uj m27381B() {
        return (C3805uj) zzb.mo16211s();
    }

    /* renamed from: E */
    public static C3902xj m27383E(byte[] bArr, C3852w1 w1Var) throws C3689r2 {
        return (C3902xj) C3425j2.m25868x(zzb, bArr, w1Var);
    }

    /* renamed from: H */
    static /* synthetic */ void m27385H(C3902xj xjVar, C3870wj wjVar) {
        wjVar.getClass();
        C3590o2 o2Var = xjVar.zze;
        if (!o2Var.mo16476e()) {
            xjVar.zze = C3425j2.m25859d(o2Var);
        }
        xjVar.zze.add(wjVar);
    }

    /* renamed from: A */
    public final int mo17048A() {
        return this.zzd;
    }

    /* renamed from: C */
    public final C3870wj mo17049C(int i) {
        return (C3870wj) this.zze.get(i);
    }

    /* renamed from: F */
    public final List mo17050F() {
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
            return C3425j2.m25861f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", C3870wj.class});
        } else if (i2 == 3) {
            return new C3902xj();
        } else {
            if (i2 == 4) {
                return new C3805uj((C3772tj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo17051z() {
        return this.zze.size();
    }
}
