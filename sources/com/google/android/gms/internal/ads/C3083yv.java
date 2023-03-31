package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yv */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3083yv extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C3083yv zzb;
    private int zze;
    private String zzf = "";
    private by3 zzg = sx3.m20713x();
    private int zzh;

    static {
        C3083yv yvVar = new C3083yv();
        zzb = yvVar;
        sx3.m20701B(C3083yv.class, yvVar);
    }

    private C3083yv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zze", "zzf", "zzg", C3009wv.class, "zzh", C2565kw.f12309a});
        } else if (i2 == 3) {
            return new C3083yv();
        } else {
            if (i2 == 4) {
                return new C3046xv((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
