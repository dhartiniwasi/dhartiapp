package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.f3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6955f3 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C6955f3 zza;
    private int zzd;
    private int zze;
    private C7091n9 zzf = C6995h9.m40157n();
    private C7091n9 zzg = C6995h9.m40157n();
    private boolean zzh;
    private boolean zzi;

    static {
        C6955f3 f3Var = new C6955f3();
        zza = f3Var;
        C6995h9.m40161u(C6955f3.class, f3Var);
    }

    private C6955f3() {
    }

    /* renamed from: K */
    static /* synthetic */ void m39999K(C6955f3 f3Var, int i, C7133q3 q3Var) {
        q3Var.getClass();
        C7091n9 n9Var = f3Var.zzf;
        if (!n9Var.mo23698e()) {
            f3Var.zzf = C6995h9.m40158o(n9Var);
        }
        f3Var.zzf.set(i, q3Var);
    }

    /* renamed from: L */
    static /* synthetic */ void m40000L(C6955f3 f3Var, int i, C6989h3 h3Var) {
        h3Var.getClass();
        C7091n9 n9Var = f3Var.zzg;
        if (!n9Var.mo23698e()) {
            f3Var.zzg = C6995h9.m40158o(n9Var);
        }
        f3Var.zzg.set(i, h3Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", C7133q3.class, "zzg", C6989h3.class, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C6955f3();
        } else {
            if (i2 == 4) {
                return new C6938e3((C6921d3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final int mo23402C() {
        return this.zze;
    }

    /* renamed from: D */
    public final int mo23403D() {
        return this.zzg.size();
    }

    /* renamed from: E */
    public final int mo23404E() {
        return this.zzf.size();
    }

    /* renamed from: G */
    public final C6989h3 mo23405G(int i) {
        return (C6989h3) this.zzg.get(i);
    }

    /* renamed from: H */
    public final C7133q3 mo23406H(int i) {
        return (C7133q3) this.zzf.get(i);
    }

    /* renamed from: I */
    public final List mo23407I() {
        return this.zzg;
    }

    /* renamed from: J */
    public final List mo23408J() {
        return this.zzf;
    }

    /* renamed from: M */
    public final boolean mo23409M() {
        return (this.zzd & 1) != 0;
    }
}
