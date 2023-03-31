package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7118p4 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7118p4 zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        C7118p4 p4Var = new C7118p4();
        zza = p4Var;
        C6995h9.m40161u(C7118p4.class, p4Var);
    }

    private C7118p4() {
    }

    /* renamed from: E */
    public static C7102o4 m40548E() {
        return (C7102o4) zza.mo23500y();
    }

    /* renamed from: G */
    static /* synthetic */ void m40550G(C7118p4 p4Var, int i) {
        p4Var.zzd |= 1;
        p4Var.zze = i;
    }

    /* renamed from: H */
    static /* synthetic */ void m40551H(C7118p4 p4Var, long j) {
        p4Var.zzd |= 2;
        p4Var.zzf = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C7118p4();
        } else {
            if (i2 == 4) {
                return new C7102o4((C7006i4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final int mo23732C() {
        return this.zze;
    }

    /* renamed from: D */
    public final long mo23733D() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean mo23734I() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: J */
    public final boolean mo23735J() {
        return (this.zzd & 1) != 0;
    }
}
