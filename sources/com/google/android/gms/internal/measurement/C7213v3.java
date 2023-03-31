package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.v3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7213v3 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7213v3 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private boolean zzg;
    private C7091n9 zzh = C6995h9.m40157n();

    static {
        C7213v3 v3Var = new C7213v3();
        zza = v3Var;
        C6995h9.m40161u(C7213v3.class, v3Var);
    }

    private C7213v3() {
    }

    /* renamed from: E */
    public static C7213v3 m41004E() {
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
            return C6995h9.m40160r(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", C7181t3.f32108a, "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new C7213v3();
        } else {
            if (i2 == 4) {
                return new C7149r3((C6921d3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final int mo23937C() {
        return this.zzh.size();
    }

    /* renamed from: F */
    public final String mo23938F() {
        return this.zzf;
    }

    /* renamed from: G */
    public final List mo23939G() {
        return this.zzh;
    }

    /* renamed from: H */
    public final boolean mo23940H() {
        return this.zzg;
    }

    /* renamed from: I */
    public final boolean mo23941I() {
        return (this.zzd & 4) != 0;
    }

    /* renamed from: J */
    public final boolean mo23942J() {
        return (this.zzd & 2) != 0;
    }

    /* renamed from: K */
    public final boolean mo23943K() {
        return (this.zzd & 1) != 0;
    }

    /* renamed from: L */
    public final int mo23944L() {
        int a = C7197u3.m40968a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }
}
