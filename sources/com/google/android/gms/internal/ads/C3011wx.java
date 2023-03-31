package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wx */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3011wx extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C3011wx zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C3011wx wxVar = new C3011wx();
        zzb = wxVar;
        sx3.m20701B(C3011wx.class, wxVar);
    }

    private C3011wx() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new C3011wx();
        } else {
            if (i2 == 4) {
                return new C2974vx((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
