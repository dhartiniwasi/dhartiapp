package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xt3 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final xt3 zzb;
    private int zze;

    static {
        xt3 xt3 = new xt3();
        zzb = xt3;
        sx3.m20701B(xt3.class, xt3);
    }

    private xt3() {
    }

    /* renamed from: H */
    public static xt3 m23539H() {
        return zzb;
    }

    /* renamed from: I */
    public static xt3 m23540I(jw3 jw3, ex3 ex3) throws ey3 {
        return (xt3) sx3.m20707q(zzb, jw3, ex3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new xt3();
        } else {
            if (i2 == 4) {
                return new wt3((vt3) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
