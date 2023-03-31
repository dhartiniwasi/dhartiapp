package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.wj */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3870wj extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3870wj zzb;
    private C3442jj zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        C3870wj wjVar = new C3870wj();
        zzb = wjVar;
        C3425j2.m25862j(C3870wj.class, wjVar);
    }

    private C3870wj() {
    }

    /* renamed from: B */
    public static C3838vj m27305B() {
        return (C3838vj) zzb.mo16211s();
    }

    /* renamed from: E */
    static /* synthetic */ void m27307E(C3870wj wjVar, C3442jj jjVar) {
        jjVar.getClass();
        wjVar.zzd = jjVar;
    }

    /* renamed from: A */
    public final C3442jj mo16997A() {
        C3442jj jjVar = this.zzd;
        return jjVar == null ? C3442jj.m25926C() : jjVar;
    }

    /* renamed from: D */
    public final C3674qk mo16998D() {
        C3674qk a = C3674qk.m26581a(this.zzg);
        return a == null ? C3674qk.UNRECOGNIZED : a;
    }

    /* renamed from: H */
    public final boolean mo16999H() {
        return this.zzd != null;
    }

    /* renamed from: J */
    public final int mo17000J() {
        int i = this.zze;
        int i2 = 3;
        if (i == 0) {
            i2 = 2;
        } else if (i != 1) {
            i2 = i != 2 ? i != 3 ? 0 : 5 : 4;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C3870wj();
        } else {
            if (i2 == 4) {
                return new C3838vj((C3772tj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo17001z() {
        return this.zzf;
    }
}
