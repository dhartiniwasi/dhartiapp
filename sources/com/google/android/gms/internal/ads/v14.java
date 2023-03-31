package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class v14 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final v14 zzb;
    private int zze;
    private jw3 zzf = jw3.f11808b;

    static {
        v14 v14 = new v14();
        zzb = v14;
        sx3.m20701B(v14.class, v14);
    }

    private v14() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new v14();
        } else {
            if (i2 == 4) {
                return new u14((g14) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
