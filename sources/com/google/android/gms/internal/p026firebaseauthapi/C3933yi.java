package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.yi */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3933yi extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3933yi zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        C3933yi yiVar = new C3933yi();
        zzb = yiVar;
        C3425j2.m25862j(C3933yi.class, yiVar);
    }

    private C3933yi() {
    }

    /* renamed from: B */
    public static C3933yi m27455B() {
        return zzb;
    }

    /* renamed from: z */
    public static C3901xi m27459z() {
        return (C3901xi) zzb.mo16211s();
    }

    /* renamed from: C */
    public final int mo17079C() {
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

    /* renamed from: D */
    public final int mo17080D() {
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

    /* renamed from: E */
    public final int mo17081E() {
        int i = this.zzd;
        int i2 = 4;
        if (i == 0) {
            i2 = 2;
        } else if (i == 1) {
            i2 = 3;
        } else if (i != 2) {
            i2 = i != 3 ? i != 4 ? 0 : 6 : 5;
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
            return C3425j2.m25861f(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C3933yi();
        } else {
            if (i2 == 4) {
                return new C3901xi((C3869wi) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
