package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ad */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2174ad extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2174ad zzb;
    private int zze;
    private String zzf = "";

    static {
        C2174ad adVar = new C2174ad();
        zzb = adVar;
        sx3.m20701B(C2174ad.class, adVar);
    }

    private C2174ad() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new C2174ad();
        } else {
            if (i2 == 4) {
                return new C3101zc((C3026xb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
