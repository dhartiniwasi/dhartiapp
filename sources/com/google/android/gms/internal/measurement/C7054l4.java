package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7054l4 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7054l4 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        C7054l4 l4Var = new C7054l4();
        zza = l4Var;
        C6995h9.m40161u(C7054l4.class, l4Var);
    }

    private C7054l4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C7054l4();
        } else {
            if (i2 == 4) {
                return new C7038k4((C7006i4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
