package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.iw */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2491iw extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2491iw zzb;
    private int zze;
    private int zzf;
    private C3085yx zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        C2491iw iwVar = new C2491iw();
        zzb = iwVar;
        sx3.m20701B(C2491iw.class, iwVar);
    }

    private C2491iw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", C2416gw.f10076a, "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new C2491iw();
        } else {
            if (i2 == 4) {
                return new C2379fw((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
