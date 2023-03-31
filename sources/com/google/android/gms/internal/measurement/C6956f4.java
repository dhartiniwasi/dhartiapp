package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.f4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6956f4 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C6956f4 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C6956f4 f4Var = new C6956f4();
        zza = f4Var;
        C6995h9.m40161u(C6956f4.class, f4Var);
    }

    private C6956f4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C6956f4();
        } else {
            if (i2 == 4) {
                return new C6939e4((C7229w3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
