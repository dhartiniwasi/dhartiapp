package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.pi */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3639pi extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3639pi zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        C3639pi piVar = new C3639pi();
        zzb = piVar;
        C3425j2.m25862j(C3639pi.class, piVar);
    }

    private C3639pi() {
    }

    /* renamed from: A */
    public static C3606oi m26485A() {
        return (C3606oi) zzb.mo16211s();
    }

    /* renamed from: C */
    public static C3639pi m26487C() {
        return zzb;
    }

    /* renamed from: E */
    public final int mo16552E() {
        int b = C3342gi.m25671b(this.zzd);
        if (b == 0) {
            return 1;
        }
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final Object mo15734q(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C3425j2.m25861f(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        } else if (i2 == 3) {
            return new C3639pi();
        } else {
            if (i2 == 4) {
                return new C3606oi((C3573ni) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    /* renamed from: z */
    public final int mo16553z() {
        return this.zze;
    }
}
