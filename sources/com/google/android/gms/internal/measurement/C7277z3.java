package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.z3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7277z3 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7277z3 zza;
    private int zzd;
    private String zze = "";
    private C7091n9 zzf = C6995h9.m40157n();
    private boolean zzg;

    static {
        C7277z3 z3Var = new C7277z3();
        zza = z3Var;
        C6995h9.m40161u(C7277z3.class, z3Var);
    }

    private C7277z3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", C6956f4.class, "zzg"});
        } else if (i2 == 3) {
            return new C7277z3();
        } else {
            if (i2 == 4) {
                return new C7261y3((C7229w3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final String mo24030D() {
        return this.zze;
    }
}
