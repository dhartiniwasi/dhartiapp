package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.gf */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3339gf extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3339gf zzb;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        C3339gf gfVar = new C3339gf();
        zzb = gfVar;
        C3425j2.m25862j(C3339gf.class, gfVar);
    }

    private C3339gf() {
    }

    /* renamed from: A */
    public static C3306ff m25663A() {
        return (C3306ff) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3339gf m25665C() {
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
            return new C3339gf();
        } else {
            if (i2 == 4) {
                return new C3306ff((C3273ef) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo16079z() {
        return this.zzd;
    }
}
