package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.qh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3671qh extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3671qh zzb;
    private C3964zh zzd;
    private C3440jh zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        C3671qh qhVar = new C3671qh();
        zzb = qhVar;
        C3425j2.m25862j(C3671qh.class, qhVar);
    }

    private C3671qh() {
    }

    /* renamed from: A */
    public static C3605oh m26571A() {
        return (C3605oh) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3671qh m26573C() {
        return zzb;
    }

    /* renamed from: E */
    static /* synthetic */ void m26574E(C3671qh qhVar, C3964zh zhVar) {
        zhVar.getClass();
        qhVar.zzd = zhVar;
    }

    /* renamed from: F */
    static /* synthetic */ void m26575F(C3671qh qhVar, C3440jh jhVar) {
        jhVar.getClass();
        qhVar.zze = jhVar;
    }

    /* renamed from: D */
    public final C3964zh mo16600D() {
        C3964zh zhVar = this.zzd;
        return zhVar == null ? C3964zh.m27567B() : zhVar;
    }

    /* renamed from: G */
    public final int mo16601G() {
        int i = this.zzf;
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
            return C3425j2.m25861f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C3671qh();
        } else {
            if (i2 == 4) {
                return new C3605oh((C3572nh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final C3440jh mo16602z() {
        C3440jh jhVar = this.zze;
        return jhVar == null ? C3440jh.m25909B() : jhVar;
    }
}
