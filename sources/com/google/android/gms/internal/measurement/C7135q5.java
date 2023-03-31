package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.q5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7135q5 extends C6995h9 implements C7108oa {
    /* access modifiers changed from: private */
    public static final C7135q5 zza;
    private int zzd;
    private String zze = "";
    private C7091n9 zzf = C6995h9.m40157n();

    static {
        C7135q5 q5Var = new C7135q5();
        zza = q5Var;
        C6995h9.m40161u(C7135q5.class, q5Var);
    }

    private C7135q5() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final Object mo23001B(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return C6995h9.m40160r(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", C7247x5.class});
        } else if (i2 == 3) {
            return new C7135q5();
        } else {
            if (i2 == 4) {
                return new C7119p5((C7071m5) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zza;
        }
    }

    /* renamed from: D */
    public final String mo23765D() {
        return this.zze;
    }

    /* renamed from: E */
    public final List mo23766E() {
        return this.zzf;
    }
}
