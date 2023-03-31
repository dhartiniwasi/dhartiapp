package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rb */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2804rb extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2804rb zzb;
    private int zze;
    private C2878tb zzf;
    private C2989wb zzg;

    static {
        C2804rb rbVar = new C2804rb();
        zzb = rbVar;
        sx3.m20701B(C2804rb.class, rbVar);
    }

    private C2804rb() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C2804rb();
        } else {
            if (i2 == 4) {
                return new C2767qb((C2729pb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
