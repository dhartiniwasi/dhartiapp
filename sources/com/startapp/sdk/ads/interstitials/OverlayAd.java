package com.startapp.sdk.ads.interstitials;

import android.content.Context;
import com.startapp.C9146n3;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class OverlayAd extends InterstitialAd {
    private static final long serialVersionUID = 1;

    public OverlayAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_OVERLAY);
    }

    /* renamed from: a */
    public void mo30023a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C9146n3(this.f38612a, this, adPreferences, adEventListener).mo30659c();
    }
}
