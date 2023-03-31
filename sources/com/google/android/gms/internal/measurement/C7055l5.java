package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7055l5 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7055l5 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        C7055l5 l5Var = new C7055l5();
        zza = l5Var;
        C6995h9.m40161u(C7055l5.class, l5Var);
    }

    private C7055l5() {
    }

    /* renamed from: F */
    public static C7039k5 m40337F() {
        return (C7039k5) zza.mo23500y();
    }

    /* renamed from: J */
    static /* synthetic */ void m40339J(C7055l5 l5Var, long j) {
        l5Var.zzd |= 1;
        l5Var.zze = j;
    }

    /* renamed from: K */
    static /* synthetic */ void m40340K(C7055l5 l5Var, String str) {
        str.getClass();
        l5Var.zzd |= 2;
        l5Var.zzf = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m40341L(C7055l5 l5Var, String str) {
        str.getClass();
        l5Var.zzd |= 4;
        l5Var.zzg = str;
    }

    /* renamed from: M */
    static /* synthetic */ void m40342M(C7055l5 l5Var) {
        l5Var.zzd &= -5;
        l5Var.zzg = zza.zzg;
    }

    /* renamed from: N */
    static /* synthetic */ void m40343N(C7055l5 l5Var, long j) {
        l5Var.zzd |= 8;
        l5Var.zzh = j;
    }

    /* renamed from: O */
    static /* synthetic */ void m40344O(C7055l5 l5Var) {
        l5Var.zzd &= -9;
        l5Var.zzh = 0;
    }

    /* renamed from: P */
    static /* synthetic */ void m40345P(C7055l5 l5Var, double d) {
        l5Var.zzd |= 32;
        l5Var.zzj = d;
    }

    /* renamed from: Q */
    static /* synthetic */ void m40346Q(C7055l5 l5Var) {
        l5Var.zzd &= -33;
        l5Var.zzj = 0.0d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C7055l5();
        } else {
            if (i2 == 4) {
                return new C7039k5((C7006i4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final double mo23624C() {
        return this.zzj;
    }

    /* renamed from: D */
    public final long mo23625D() {
        return this.zzh;
    }

    /* renamed from: E */
    public final long mo23626E() {
        return this.zze;
    }

    /* renamed from: H */
    public final String mo23627H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final String mo23628I() {
        return this.zzg;
    }

    /* renamed from: R */
    public final boolean mo23629R() {
        return (this.zzd & 32) != 0;
    }

    /* renamed from: S */
    public final boolean mo23630S() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: T */
    public final boolean mo23631T() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: U */
    public final boolean mo23632U() {
        return (this.zzd & 4) != 0;
    }
}
