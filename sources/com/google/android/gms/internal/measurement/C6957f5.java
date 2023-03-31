package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6957f5 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C6957f5 zza;
    private int zzd;
    private int zze = 1;
    private C7091n9 zzf = C6995h9.m40157n();

    static {
        C6957f5 f5Var = new C6957f5();
        zza = f5Var;
        C6995h9.m40161u(C6957f5.class, f5Var);
    }

    private C6957f5() {
    }

    /* renamed from: C */
    public static C6923d5 m40012C() {
        return (C6923d5) zza.mo23500y();
    }

    /* renamed from: E */
    static /* synthetic */ void m40014E(C6957f5 f5Var, C7182t4 t4Var) {
        t4Var.getClass();
        C7091n9 n9Var = f5Var.zzf;
        if (!n9Var.mo23698e()) {
            f5Var.zzf = C6995h9.m40158o(n9Var);
        }
        f5Var.zzf.add(t4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", C6940e5.f31666a, "zzf", C7182t4.class});
        } else if (i2 == 3) {
            return new C6957f5();
        } else {
            if (i2 == 4) {
                return new C6923d5((C7006i4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
