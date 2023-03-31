package com.startapp.sdk.ads.video;

import android.content.Context;
import com.startapp.C8867bf;
import com.startapp.C9065k5;
import com.startapp.C9605vb;
import com.startapp.C9644xb;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class VideoEnabledAd extends InterstitialAd {
    private static final long serialVersionUID = 1;
    private VideoAdDetails videoAdDetails = null;

    public VideoEnabledAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
    }

    /* renamed from: a */
    public void mo30023a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C9352b(this.f38612a, this, adPreferences, adEventListener, this.placement).mo30659c();
    }

    /* renamed from: c */
    public void mo30294c(String str) {
        super.mo30294c(str);
        String a = C9605vb.m50452a(str, "@videoJson@", "@videoJson@");
        if (a != null) {
            VideoAdDetails videoAdDetails2 = (VideoAdDetails) C9065k5.m48755a(a, VideoAdDetails.class);
            this.videoAdDetails = videoAdDetails2;
            if (videoAdDetails2 != null) {
                videoAdDetails2.mo30290o();
            }
        }
    }

    /* renamed from: u */
    public boolean mo30092u() {
        return this.videoAdDetails != null;
    }

    /* renamed from: v */
    public void mo30295v() {
        this.videoAdDetails = null;
    }

    /* renamed from: w */
    public VideoAdDetails mo30296w() {
        return this.videoAdDetails;
    }

    /* renamed from: a */
    public void mo30293a(C9644xb xbVar, VideoConfig videoConfig, C8867bf bfVar) {
        this.videoAdDetails = new VideoAdDetails(xbVar, videoConfig, bfVar);
        Integer num = xbVar.f39406q;
        if (num != null && xbVar.f39407r != null) {
            if (num.intValue() > xbVar.f39407r.intValue()) {
                mo30491a(SplashConfig.Orientation.LANDSCAPE);
            } else {
                mo30491a(SplashConfig.Orientation.PORTRAIT);
            }
        }
    }
}
