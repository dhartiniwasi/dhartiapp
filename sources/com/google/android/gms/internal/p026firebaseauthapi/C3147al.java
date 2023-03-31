package com.google.android.gms.internal.p026firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.al */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class C3147al extends C3425j2 implements C3624p3 {
    /* access modifiers changed from: private */
    public static final C3147al zzb;
    private int zzd;

    static {
        C3147al alVar = new C3147al();
        zzb = alVar;
        C3425j2.m25862j(C3147al.class, alVar);
    }

    private C3147al() {
    }

    /* renamed from: A */
    public static C3147al m25040A() {
        return zzb;
    }

    /* renamed from: B */
    public static C3147al m25041B(C3325g1 g1Var, C3852w1 w1Var) throws C3689r2 {
        return (C3147al) C3425j2.m25867w(zzb, g1Var, w1Var);
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
            return new C3147al();
        } else {
            if (i2 == 4) {
                return new C3967zk((C3935yk) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
