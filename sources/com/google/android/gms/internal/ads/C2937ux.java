package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ux */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2937ux extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2937ux zzb;
    private int zze;
    private String zzf = "";
    private int zzg;
    private C3011wx zzh;

    static {
        C2937ux uxVar = new C2937ux();
        zzb = uxVar;
        sx3.m20701B(C2937ux.class, uxVar);
    }

    private C2937ux() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", C2565kw.f12309a, "zzh"});
        } else if (i2 == 3) {
            return new C2937ux();
        } else {
            if (i2 == 4) {
                return new C2900tx((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
