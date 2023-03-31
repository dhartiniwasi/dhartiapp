package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.n4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7086n4 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7086n4 zza;
    private int zzd;
    private int zze;
    private C6991h5 zzf;
    private C6991h5 zzg;
    private boolean zzh;

    static {
        C7086n4 n4Var = new C7086n4();
        zza = n4Var;
        C6995h9.m40161u(C7086n4.class, n4Var);
    }

    private C7086n4() {
    }

    /* renamed from: D */
    public static C7070m4 m40430D() {
        return (C7070m4) zza.mo23500y();
    }

    /* renamed from: H */
    static /* synthetic */ void m40432H(C7086n4 n4Var, int i) {
        n4Var.zzd |= 1;
        n4Var.zze = i;
    }

    /* renamed from: I */
    static /* synthetic */ void m40433I(C7086n4 n4Var, C6991h5 h5Var) {
        h5Var.getClass();
        n4Var.zzf = h5Var;
        n4Var.zzd |= 2;
    }

    /* renamed from: J */
    static /* synthetic */ void m40434J(C7086n4 n4Var, C6991h5 h5Var) {
        n4Var.zzg = h5Var;
        n4Var.zzd |= 4;
    }

    /* renamed from: K */
    static /* synthetic */ void m40435K(C7086n4 n4Var, boolean z) {
        n4Var.zzd |= 8;
        n4Var.zzh = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C7086n4();
        } else {
            if (i2 == 4) {
                return new C7070m4((C7006i4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final int mo23688C() {
        return this.zze;
    }

    /* renamed from: F */
    public final C6991h5 mo23689F() {
        C6991h5 h5Var = this.zzf;
        return h5Var == null ? C6991h5.m40123J() : h5Var;
    }

    /* renamed from: G */
    public final C6991h5 mo23690G() {
        C6991h5 h5Var = this.zzg;
        return h5Var == null ? C6991h5.m40123J() : h5Var;
    }

    /* renamed from: L */
    public final boolean mo23691L() {
        return this.zzh;
    }

    /* renamed from: M */
    public final boolean mo23692M() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: N */
    public final boolean mo23693N() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: O */
    public final boolean mo23694O() {
        return (this.zzd & 4) != 0;
    }
}
