package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* renamed from: com.google.android.gms.internal.ads.jc */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2508jc extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2508jc zzb;
    private int zze;
    private long zzf = -1;
    private int zzg = AdError.NETWORK_ERROR_CODE;

    static {
        C2508jc jcVar = new C2508jc();
        zzb = jcVar;
        sx3.m20701B(C2508jc.class, jcVar);
    }

    private C2508jc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zze", "zzf", "zzg", C2953vc.f19003a});
        } else if (i2 == 3) {
            return new C2508jc();
        } else {
            if (i2 == 4) {
                return new C2470ic((C3026xb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
