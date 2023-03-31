package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class NativeAd extends JsonAd {
    private static final long serialVersionUID = 1;
    private NativeAdPreferences config;

    public NativeAd(Context context, NativeAdPreferences nativeAdPreferences) {
        super(context, AdPreferences.Placement.INAPP_NATIVE);
        this.config = nativeAdPreferences;
    }

    /* renamed from: a */
    public void mo30023a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C9326a(this.f38612a, this, adPreferences, adEventListener, this.config).mo30659c();
    }
}
