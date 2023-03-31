package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6989h3 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C6989h3 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private C7091n9 zzg = C6995h9.m40157n();
    private boolean zzh;
    private C7101o3 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        C6989h3 h3Var = new C6989h3();
        zza = h3Var;
        C6995h9.m40161u(C6989h3.class, h3Var);
    }

    private C6989h3() {
    }

    /* renamed from: E */
    public static C6972g3 m40100E() {
        return (C6972g3) zza.mo23500y();
    }

    /* renamed from: K */
    static /* synthetic */ void m40102K(C6989h3 h3Var, String str) {
        h3Var.zzd |= 2;
        h3Var.zzf = str;
    }

    /* renamed from: L */
    static /* synthetic */ void m40103L(C6989h3 h3Var, int i, C7021j3 j3Var) {
        j3Var.getClass();
        C7091n9 n9Var = h3Var.zzg;
        if (!n9Var.mo23698e()) {
            h3Var.zzg = C6995h9.m40158o(n9Var);
        }
        h3Var.zzg.set(i, j3Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", C7021j3.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        } else if (i2 == 3) {
            return new C6989h3();
        } else {
            if (i2 == 4) {
                return new C6972g3((C6921d3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final int mo23461C() {
        return this.zzg.size();
    }

    /* renamed from: D */
    public final int mo23462D() {
        return this.zze;
    }

    /* renamed from: G */
    public final C7021j3 mo23463G(int i) {
        return (C7021j3) this.zzg.get(i);
    }

    /* renamed from: H */
    public final C7101o3 mo23464H() {
        C7101o3 o3Var = this.zzi;
        return o3Var == null ? C7101o3.m40474D() : o3Var;
    }

    /* renamed from: I */
    public final String mo23465I() {
        return this.zzf;
    }

    /* renamed from: J */
    public final List mo23466J() {
        return this.zzg;
    }

    /* renamed from: M */
    public final boolean mo23467M() {
        return this.zzj;
    }

    /* renamed from: N */
    public final boolean mo23468N() {
        return this.zzk;
    }

    /* renamed from: O */
    public final boolean mo23469O() {
        return this.zzl;
    }

    /* renamed from: P */
    public final boolean mo23470P() {
        return (this.zzd & 8) != 0;
    }

    /* renamed from: Q */
    public final boolean mo23471Q() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: R */
    public final boolean mo23472R() {
        return (this.zzd & 64) != 0;
    }
}
