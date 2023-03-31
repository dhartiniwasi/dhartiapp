package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.t4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7182t4 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7182t4 zza;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        C7182t4 t4Var = new C7182t4();
        zza = t4Var;
        C6995h9.m40161u(C7182t4.class, t4Var);
    }

    private C7182t4() {
    }

    /* renamed from: C */
    public static C7166s4 m40925C() {
        return (C7166s4) zza.mo23500y();
    }

    /* renamed from: E */
    static /* synthetic */ void m40927E(C7182t4 t4Var, String str) {
        str.getClass();
        t4Var.zzd |= 1;
        t4Var.zze = str;
    }

    /* renamed from: F */
    static /* synthetic */ void m40928F(C7182t4 t4Var, long j) {
        t4Var.zzd |= 2;
        t4Var.zzf = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C7182t4();
        } else {
            if (i2 == 4) {
                return new C7166s4((C7006i4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }
}
