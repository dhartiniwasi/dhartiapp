package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.wv */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3009wv extends sx3 implements dz3 {
    /* access modifiers changed from: private */
    public static final C3009wv zzb;
    private int zze;
    private int zzf;
    private C2863sx zzg;

    static {
        C3009wv wvVar = new C3009wv();
        zzb = wvVar;
        sx3.m20701B(C3009wv.class, wvVar);
    }

    private C3009wv() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final Object mo8196E(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return sx3.m20700A(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", C2935uv.m21866b(), "zzg"});
        } else if (i2 == 3) {
            return new C3009wv();
        } else {
            if (i2 == 4) {
                return new C2972vv((C2266cv) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
