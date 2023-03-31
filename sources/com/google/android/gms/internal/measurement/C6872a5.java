package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.a5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6872a5 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C6872a5 zza;
    private C7091n9 zzd = C6995h9.m40157n();

    static {
        C6872a5 a5Var = new C6872a5();
        zza = a5Var;
        C6995h9.m40161u(C6872a5.class, a5Var);
    }

    private C6872a5() {
    }

    /* renamed from: C */
    public static C7278z4 m39460C() {
        return (C7278z4) zza.mo23500y();
    }

    /* renamed from: G */
    static /* synthetic */ void m39462G(C6872a5 a5Var, C6906c5 c5Var) {
        c5Var.getClass();
        C7091n9 n9Var = a5Var.zzd;
        if (!n9Var.mo23698e()) {
            a5Var.zzd = C6995h9.m40158o(n9Var);
        }
        a5Var.zzd.add(c5Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C6906c5.class});
        } else if (i2 == 3) {
            return new C6872a5();
        } else {
            if (i2 == 4) {
                return new C7278z4((C7006i4) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: E */
    public final C6906c5 mo23002E(int i) {
        return (C6906c5) this.zzd.get(0);
    }

    /* renamed from: F */
    public final List mo23003F() {
        return this.zzd;
    }
}
