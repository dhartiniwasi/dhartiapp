package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* renamed from: com.google.android.gms.internal.ads.oy */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2715oy extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2715oy zzb;
    private int zze;
    private int zzf = AdError.NETWORK_ERROR_CODE;
    private C2381fy zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;

    static {
        C2715oy oyVar = new C2715oy();
        zzb = oyVar;
        sx3.m20701B(C2715oy.class, oyVar);
    }

    private C2715oy() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zze", "zzf", C2565kw.f12309a, "zzg", "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new C2715oy();
        } else {
            if (i2 == 4) {
                return new C2678ny((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
