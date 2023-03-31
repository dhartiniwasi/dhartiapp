package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.fg */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3307fg extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3307fg zzb;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        C3307fg fgVar = new C3307fg();
        zzb = fgVar;
        C3425j2.m25862j(C3307fg.class, fgVar);
    }

    private C3307fg() {
    }

    /* renamed from: A */
    public static C3274eg m25571A() {
        return (C3274eg) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3307fg m25573C() {
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
            return new C3307fg();
        } else {
            if (i2 == 4) {
                return new C3274eg((C3241dg) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo16027z() {
        return this.zzd;
    }
}
