package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uv */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public enum C2935uv implements ux3 {
    AD_FORMAT_TYPE_UNSPECIFIED(0),
    BANNER(1),
    INTERSTITIAL(2),
    NATIVE_EXPRESS(3),
    NATIVE_CONTENT(4),
    NATIVE_APP_INSTALL(5),
    NATIVE_CUSTOM_TEMPLATE(6),
    DFP_BANNER(7),
    DFP_INTERSTITIAL(8),
    REWARD_BASED_VIDEO_AD(9),
    BANNER_SEARCH_ADS(10);
    

    /* renamed from: u */
    private static final vx3 f18747u = null;

    /* renamed from: a */
    private final int f18749a;

    static {
        f18747u = new C2861sv();
    }

    private C2935uv(int i) {
        this.f18749a = i;
    }

    /* renamed from: a */
    public static C2935uv m21865a(int i) {
        switch (i) {
            case 0:
                return AD_FORMAT_TYPE_UNSPECIFIED;
            case 1:
                return BANNER;
            case 2:
                return INTERSTITIAL;
            case 3:
                return NATIVE_EXPRESS;
            case 4:
                return NATIVE_CONTENT;
            case 5:
                return NATIVE_APP_INSTALL;
            case 6:
                return NATIVE_CUSTOM_TEMPLATE;
            case 7:
                return DFP_BANNER;
            case 8:
                return DFP_INTERSTITIAL;
            case 9:
                return REWARD_BASED_VIDEO_AD;
            case 10:
                return BANNER_SEARCH_ADS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static wx3 m21866b() {
        return C2898tv.f18264a;
    }

    public final String toString() {
        return Integer.toString(this.f18749a);
    }

    public final int zza() {
        return this.f18749a;
    }
}
