package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7246x4 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7246x4 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private C7054l4 zzg;

    static {
        C7246x4 x4Var = new C7246x4();
        zza = x4Var;
        C6995h9.m40161u(C7246x4.class, x4Var);
    }

    private C7246x4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C7246x4();
        } else {
            if (i2 == 4) {
                return new C7230w4((C7006i4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
