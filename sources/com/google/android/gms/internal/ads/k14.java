package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class k14 extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final k14 zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private jw3 zzh = jw3.f11808b;

    static {
        k14 k14 = new k14();
        zzb = k14;
        sx3.m20701B(k14.class, k14);
    }

    private k14() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zze", "zzf", j14.f11179a, "zzg", "zzh"});
        } else if (i2 == 3) {
            return new k14();
        } else {
            if (i2 == 4) {
                return new i14((g14) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
