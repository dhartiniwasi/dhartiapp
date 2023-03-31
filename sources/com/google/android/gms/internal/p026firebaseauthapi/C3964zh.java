package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zh */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3964zh extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3964zh zzb;
    /* access modifiers changed from: private */
    public int zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public C3325g1 zzf = C3325g1.f22056b;

    static {
        C3964zh zhVar = new C3964zh();
        zzb = zhVar;
        C3425j2.m25862j(C3964zh.class, zhVar);
    }

    private C3964zh() {
    }

    /* renamed from: B */
    public static C3964zh m27567B() {
        return zzb;
    }

    /* renamed from: z */
    public static C3932yh m27571z() {
        return (C3932yh) zzb.mo16211s();
    }

    /* renamed from: C */
    public final C3325g1 mo17115C() {
        return this.zzf;
    }

    /* renamed from: E */
    public final int mo17116E() {
        int i = this.zzd;
        int i2 = 5;
        if (i == 0) {
            i2 = 2;
        } else if (i == 2) {
            i2 = 4;
        } else if (i != 3) {
            i2 = i != 4 ? i != 5 ? 0 : 7 : 6;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    /* renamed from: F */
    public final int mo17117F() {
        int b = C3342gi.m25671b(this.zze);
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
            return C3425j2.m25861f(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C3964zh();
        } else {
            if (i2 == 4) {
                return new C3932yh((C3900xh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
