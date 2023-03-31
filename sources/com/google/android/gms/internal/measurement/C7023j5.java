package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7023j5 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7023j5 zza;
    private int zzd;
    private int zze;
    private C7075m9 zzf = C6995h9.m40155l();

    static {
        C7023j5 j5Var = new C7023j5();
        zza = j5Var;
        C6995h9.m40161u(C7023j5.class, j5Var);
    }

    private C7023j5() {
    }

    /* renamed from: F */
    public static C7007i5 m40251F() {
        return (C7007i5) zza.mo23500y();
    }

    /* renamed from: I */
    static /* synthetic */ void m40253I(C7023j5 j5Var, int i) {
        j5Var.zzd |= 1;
        j5Var.zze = i;
    }

    /* renamed from: J */
    static /* synthetic */ void m40254J(C7023j5 j5Var, Iterable iterable) {
        C7075m9 m9Var = j5Var.zzf;
        if (!m9Var.mo23698e()) {
            j5Var.zzf = C6995h9.m40156m(m9Var);
        }
        C7121p7.m40558g(iterable, j5Var.zzf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        } else if (i2 == 3) {
            return new C7023j5();
        } else {
            if (i2 == 4) {
                return new C7007i5((C7006i4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final int mo23553C() {
        return this.zzf.size();
    }

    /* renamed from: D */
    public final int mo23554D() {
        return this.zze;
    }

    /* renamed from: E */
    public final long mo23555E(int i) {
        return this.zzf.mo23255g(i);
    }

    /* renamed from: H */
    public final List mo23556H() {
        return this.zzf;
    }

    /* renamed from: K */
    public final boolean mo23557K() {
        return (this.zzd & 1) != 0;
    }
}
