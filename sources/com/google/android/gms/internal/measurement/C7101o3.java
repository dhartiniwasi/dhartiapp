package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.o3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7101o3 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7101o3 zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C7101o3 o3Var = new C7101o3();
        zza = o3Var;
        C6995h9.m40161u(C7101o3.class, o3Var);
    }

    private C7101o3() {
    }

    /* renamed from: D */
    public static C7101o3 m40474D() {
        return zza;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", C7069m3.f31819a, "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C7101o3();
        } else {
            if (i2 == 4) {
                return new C7037k3((C6921d3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: E */
    public final String mo23711E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final String mo23712F() {
        return this.zzi;
    }

    /* renamed from: G */
    public final String mo23713G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final boolean mo23714H() {
        return this.zzf;
    }

    /* renamed from: I */
    public final boolean mo23715I() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: J */
    public final boolean mo23716J() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: K */
    public final boolean mo23717K() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: L */
    public final boolean mo23718L() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: M */
    public final boolean mo23719M() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: N */
    public final int mo23720N() {
        int a = C7085n3.m40429a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
