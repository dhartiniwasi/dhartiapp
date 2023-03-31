package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* renamed from: com.google.android.gms.internal.ads.aw */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2193aw extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2193aw zzb;
    private int zze;
    private String zzf = "";
    private by3 zzg = sx3.m20713x();
    private int zzh = AdError.NETWORK_ERROR_CODE;
    private int zzi = AdError.NETWORK_ERROR_CODE;
    private int zzj = AdError.NETWORK_ERROR_CODE;

    static {
        C2193aw awVar = new C2193aw();
        zzb = awVar;
        sx3.m20701B(C2193aw.class, awVar);
    }

    private C2193aw() {
    }

    /* renamed from: H */
    public static C2193aw m10021H() {
        return zzb;
    }

    /* renamed from: I */
    static /* synthetic */ void m10022I(C2193aw awVar, String str) {
        str.getClass();
        awVar.zze |= 1;
        awVar.zzf = str;
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
            return sx3.m20700A(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zze", "zzf", "zzg", C3009wv.class, "zzh", wx3, "zzi", wx3, "zzj", wx3});
        } else if (i2 == 3) {
            return new C2193aw();
        } else {
            if (i2 == 4) {
                return new C3120zv((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
