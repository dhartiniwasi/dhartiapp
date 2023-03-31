package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* renamed from: com.google.android.gms.internal.ads.ky */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2567ky extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2567ky zzb;
    private int zze;
    private int zzf = AdError.NETWORK_ERROR_CODE;
    private C2381fy zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    static {
        C2567ky kyVar = new C2567ky();
        zzb = kyVar;
        sx3.m20701B(C2567ky.class, kyVar);
    }

    private C2567ky() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zze", "zzf", C2565kw.f12309a, "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new C2567ky();
        } else {
            if (i2 == 4) {
                return new C2493iy((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
