package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fv */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public enum C2378fv implements ux3 {
    AD_INITIATER_UNSPECIFIED(0),
    BANNER(1),
    DFP_BANNER(2),
    INTERSTITIAL(3),
    DFP_INTERSTITIAL(4),
    NATIVE_EXPRESS(5),
    AD_LOADER(6),
    REWARD_BASED_VIDEO_AD(7),
    BANNER_SEARCH_ADS(8),
    GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
    APP_OPEN(10),
    REWARDED_INTERSTITIAL(11);
    

    /* renamed from: v */
    private static final vx3 f9465v = null;

    /* renamed from: a */
    private final int f9467a;

    static {
        f9465v = new C2303dv();
    }

    private C2378fv(int i) {
        this.f9467a = i;
    }

    /* renamed from: a */
    public static C2378fv m12853a(int i) {
        switch (i) {
            case 0:
                return AD_INITIATER_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return DFP_BANNER;
            case 3:
                return INTERSTITIAL;
            case 4:
                return DFP_INTERSTITIAL;
            case 5:
                return NATIVE_EXPRESS;
            case 6:
                return AD_LOADER;
            case 7:
                return REWARD_BASED_VIDEO_AD;
            case 8:
                return BANNER_SEARCH_ADS;
            case 9:
                return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
            case 10:
                return APP_OPEN;
            case 11:
                return REWARDED_INTERSTITIAL;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static wx3 m12854b() {
        return C2340ev.f8952a;
    }

    public final String toString() {
        return Integer.toString(this.f9467a);
    }

    public final int zza() {
        return this.f9467a;
    }
}
