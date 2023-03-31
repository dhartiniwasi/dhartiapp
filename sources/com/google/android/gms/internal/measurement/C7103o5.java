package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.o5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7103o5 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7103o5 zza;
    private C7091n9 zzd = C6995h9.m40157n();

    static {
        C7103o5 o5Var = new C7103o5();
        zza = o5Var;
        C6995h9.m40161u(C7103o5.class, o5Var);
    }

    private C7103o5() {
    }

    /* renamed from: E */
    public static C7103o5 m40489E() {
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
            return C6995h9.m40160r(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C7135q5.class});
        } else if (i2 == 3) {
            return new C7103o5();
        } else {
            if (i2 == 4) {
                return new C7087n5((C7071m5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final int mo23723C() {
        return this.zzd.size();
    }

    /* renamed from: F */
    public final List mo23724F() {
        return this.zzd;
    }
}
