package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* renamed from: com.google.android.gms.internal.ads.ox */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2714ox extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C2714ox zzb;
    private int zze;
    private int zzf = AdError.NETWORK_ERROR_CODE;
    private int zzg = AdError.NETWORK_ERROR_CODE;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private C2789qx zzp;

    static {
        C2714ox oxVar = new C2714ox();
        zzb = oxVar;
        sx3.m20701B(C2714ox.class, oxVar);
    }

    private C2714ox() {
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
            return sx3.m20700A(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zze", "zzf", wx3, "zzg", wx3, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        } else if (i2 == 3) {
            return new C2714ox();
        } else {
            if (i2 == 4) {
                return new C2677nx((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
