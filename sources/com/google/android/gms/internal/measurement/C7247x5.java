package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.x5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7247x5 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7247x5 zza;
    private int zzd;
    private int zze;
    private C7091n9 zzf = C6995h9.m40157n();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        C7247x5 x5Var = new C7247x5();
        zza = x5Var;
        C6995h9.m40161u(C7247x5.class, x5Var);
    }

    private C7247x5() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", C7215v5.f32148a, "zzf", C7247x5.class, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C7247x5();
        } else {
            if (i2 == 4) {
                return new C7183t5((C7071m5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final double mo23979C() {
        return this.zzj;
    }

    /* renamed from: E */
    public final String mo23980E() {
        return this.zzg;
    }

    /* renamed from: F */
    public final String mo23981F() {
        return this.zzh;
    }

    /* renamed from: G */
    public final List mo23982G() {
        return this.zzf;
    }

    /* renamed from: H */
    public final boolean mo23983H() {
        return this.zzi;
    }

    /* renamed from: I */
    public final boolean mo23984I() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: J */
    public final boolean mo23985J() {
        return (this.zzd & 16) != 0;
    }

    /* renamed from: K */
    public final boolean mo23986K() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: L */
    public final int mo23987L() {
        int a = C7231w5.m41060a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
