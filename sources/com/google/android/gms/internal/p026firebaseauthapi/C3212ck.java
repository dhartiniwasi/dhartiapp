package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.ck */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3212ck extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3212ck zzb;
    /* access modifiers changed from: private */
    public int zzd;
    private C3590o2 zze = C3425j2.m25869y();

    static {
        C3212ck ckVar = new C3212ck();
        zzb = ckVar;
        C3425j2.m25862j(C3212ck.class, ckVar);
    }

    private C3212ck() {
    }

    /* renamed from: D */
    static /* synthetic */ void m25339D(C3212ck ckVar, C3179bk bkVar) {
        bkVar.getClass();
        C3590o2 o2Var = ckVar.zze;
        if (!o2Var.mo16476e()) {
            ckVar.zze = C3425j2.m25859d(o2Var);
        }
        ckVar.zze.add(bkVar);
    }

    /* renamed from: z */
    public static C3966zj m25340z() {
        return (C3966zj) zzb.mo16211s();
    }

    /* renamed from: A */
    public final C3179bk mo15907A(int i) {
        return (C3179bk) this.zze.get(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", C3179bk.class});
        } else if (i2 == 3) {
            return new C3212ck();
        } else {
            if (i2 == 4) {
                return new C3966zj((C3934yj) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
