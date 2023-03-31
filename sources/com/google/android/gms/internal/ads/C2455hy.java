package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* renamed from: com.google.android.gms.internal.ads.hy */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2455hy extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2455hy zzb;
    private int zze;
    private C3085yx zzf;
    private int zzg = AdError.NETWORK_ERROR_CODE;
    private C2381fy zzh;
    private C3011wx zzi;

    static {
        C2455hy hyVar = new C2455hy();
        zzb = hyVar;
        sx3.m20701B(C2455hy.class, hyVar);
    }

    private C2455hy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zze", "zzf", "zzg", C2565kw.f12309a, "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C2455hy();
        } else {
            if (i2 == 4) {
                return new C2418gy((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
