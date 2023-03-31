package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.wf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3866wf extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3866wf zzb;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        C3866wf wfVar = new C3866wf();
        zzb = wfVar;
        C3425j2.m25862j(C3866wf.class, wfVar);
    }

    private C3866wf() {
    }

    /* renamed from: A */
    public static C3834vf m27286A() {
        return (C3834vf) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3866wf m27288C() {
        return zzb;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        } else if (i2 == 3) {
            return new C3866wf();
        } else {
            if (i2 == 4) {
                return new C3834vf((C3801uf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo16992z() {
        return this.zzd;
    }
}
