package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.jh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3440jh extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3440jh zzb;
    private C3607oj zzd;

    static {
        C3440jh jhVar = new C3440jh();
        zzb = jhVar;
        C3425j2.m25862j(C3440jh.class, jhVar);
    }

    private C3440jh() {
    }

    /* renamed from: B */
    public static C3440jh m25909B() {
        return zzb;
    }

    /* renamed from: D */
    static /* synthetic */ void m25910D(C3440jh jhVar, C3607oj ojVar) {
        ojVar.getClass();
        jhVar.zzd = ojVar;
    }

    /* renamed from: z */
    public static C3407ih m25911z() {
        return (C3407ih) zzb.mo16211s();
    }

    /* renamed from: C */
    public final C3607oj mo16220C() {
        C3607oj ojVar = this.zzd;
        return ojVar == null ? C3607oj.m26378B() : ojVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new C3440jh();
        } else {
            if (i2 == 4) {
                return new C3407ih((C3374hh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
