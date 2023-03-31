package com.startapp.sdk.ads.interstitials;

import android.content.Context;
import com.startapp.C9184o3;
import com.startapp.sdk.ads.video.VideoEnabledAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class ReturnAd extends VideoEnabledAd {
    private static final long serialVersionUID = 1;

    public ReturnAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_RETURN);
    }

    /* renamed from: a */
    public void mo30023a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C9184o3(this.f38612a, this, adPreferences, adEventListener).mo30659c();
    }

    /* renamed from: e */
    public long mo30105e() {
        return CacheMetaData.f38782a.mo30676a().mo30667e();
    }
}
