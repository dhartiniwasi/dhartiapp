package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* renamed from: com.google.android.gms.internal.ads.ew */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2341ew extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2341ew zzb;
    private int zze;
    private String zzf = "";
    private C3011wx zzg;
    private int zzh;
    private C3085yx zzi;
    private int zzj;
    private int zzk = AdError.NETWORK_ERROR_CODE;
    private int zzl = AdError.NETWORK_ERROR_CODE;
    private int zzm = AdError.NETWORK_ERROR_CODE;

    static {
        C2341ew ewVar = new C2341ew();
        zzb = ewVar;
        sx3.m20701B(C2341ew.class, ewVar);
    }

    private C2341ew() {
    }

    /* renamed from: H */
    public static C2341ew m12278H() {
        return zzb;
    }

    /* renamed from: I */
    static /* synthetic */ void m12279I(C2341ew ewVar, String str) {
        ewVar.zze |= 1;
        ewVar.zzf = str;
    }

    /* renamed from: J */
    static /* synthetic */ void m12280J(C2341ew ewVar, C3085yx yxVar) {
        yxVar.getClass();
        ewVar.zzi = yxVar;
        ewVar.zze |= 8;
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            wx3 wx3 = C2565kw.f12309a;
            return sx3.m20700A(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", wx3, "zzl", wx3, "zzm", wx3});
        } else if (i2 == 3) {
            return new C2341ew();
        } else {
            if (i2 == 4) {
                return new C2304dw((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
