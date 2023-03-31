package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7133q3 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7133q3 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private C7021j3 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C7133q3 q3Var = new C7133q3();
        zza = q3Var;
        C6995h9.m40161u(C7133q3.class, q3Var);
    }

    private C7133q3() {
    }

    /* renamed from: E */
    public static C7117p3 m40621E() {
        return (C7117p3) zza.mo23500y();
    }

    /* renamed from: H */
    static /* synthetic */ void m40623H(C7133q3 q3Var, String str) {
        q3Var.zzd |= 2;
        q3Var.zzf = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C7133q3();
        } else {
            if (i2 == 4) {
                return new C7117p3((C6921d3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final int mo23740C() {
        return this.zze;
    }

    /* renamed from: D */
    public final C7021j3 mo23741D() {
        C7021j3 j3Var = this.zzg;
        return j3Var == null ? C7021j3.m40239D() : j3Var;
    }

    /* renamed from: G */
    public final String mo23742G() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean mo23743I() {
        return this.zzh;
    }

    /* renamed from: J */
    public final boolean mo23744J() {
        return this.zzi;
    }

    /* renamed from: K */
    public final boolean mo23745K() {
        return this.zzj;
    }

    /* renamed from: L */
    public final boolean mo23746L() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: M */
    public final boolean mo23747M() {
        return (this.zzd & 32) != 0;
    }
}
