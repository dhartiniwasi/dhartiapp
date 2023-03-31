package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.s5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7167s5 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7167s5 zza;
    private int zzd;
    private C7091n9 zze = C6995h9.m40157n();
    private C7103o5 zzf;

    static {
        C7167s5 s5Var = new C7167s5();
        zza = s5Var;
        C6995h9.m40161u(C7167s5.class, s5Var);
    }

    private C7167s5() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", C7247x5.class, "zzf"});
        } else if (i2 == 3) {
            return new C7167s5();
        } else {
            if (i2 == 4) {
                return new C7151r5((C7071m5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: C */
    public final C7103o5 mo23871C() {
        C7103o5 o5Var = this.zzf;
        return o5Var == null ? C7103o5.m40489E() : o5Var;
    }

    /* renamed from: E */
    public final List mo23872E() {
        return this.zze;
    }
}
