package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.b4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6888b4 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C6888b4 zza;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C6888b4 b4Var = new C6888b4();
        zza = b4Var;
        C6995h9.m40161u(C6888b4.class, b4Var);
    }

    private C6888b4() {
    }

    /* renamed from: F */
    static /* synthetic */ void m39578F(C6888b4 b4Var, String str) {
        str.getClass();
        b4Var.zzd |= 1;
        b4Var.zze = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C6888b4();
        } else {
            if (i2 == 4) {
                return new C6871a4((C7229w3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final int mo23047C() {
        return this.zzh;
    }

    /* renamed from: E */
    public final String mo23048E() {
        return this.zze;
    }

    /* renamed from: G */
    public final boolean mo23049G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final boolean mo23050H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final boolean mo23051I() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: J */
    public final boolean mo23052J() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: K */
    public final boolean mo23053K() {
        return (this.zzd & 8) != 0;
    }
}
