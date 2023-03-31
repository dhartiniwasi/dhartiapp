package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7021j3 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7021j3 zza;
    private int zzd;
    private C7213v3 zze;
    private C7101o3 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        C7021j3 j3Var = new C7021j3();
        zza = j3Var;
        C6995h9.m40161u(C7021j3.class, j3Var);
    }

    private C7021j3() {
    }

    /* renamed from: D */
    public static C7021j3 m40239D() {
        return zza;
    }

    /* renamed from: H */
    static /* synthetic */ void m40240H(C7021j3 j3Var, String str) {
        j3Var.zzd |= 8;
        j3Var.zzh = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C7021j3();
        } else {
            if (i2 == 4) {
                return new C7005i3((C6921d3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: E */
    public final C7101o3 mo23545E() {
        C7101o3 o3Var = this.zzf;
        return o3Var == null ? C7101o3.m40474D() : o3Var;
    }

    /* renamed from: F */
    public final C7213v3 mo23546F() {
        C7213v3 v3Var = this.zze;
        return v3Var == null ? C7213v3.m41004E() : v3Var;
    }

    /* renamed from: G */
    public final String mo23547G() {
        return this.zzh;
    }

    /* renamed from: I */
    public final boolean mo23548I() {
        return this.zzg;
    }

    /* renamed from: J */
    public final boolean mo23549J() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: K */
    public final boolean mo23550K() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: L */
    public final boolean mo23551L() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: M */
    public final boolean mo23552M() {
        return (this.zzd & 1) != 0;
    }
}
