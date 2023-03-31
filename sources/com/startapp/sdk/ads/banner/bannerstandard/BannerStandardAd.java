package com.startapp.sdk.ads.banner.bannerstandard;

import android.content.Context;
import com.startapp.C9022i3;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class BannerStandardAd extends HtmlAd {
    private static final long serialVersionUID = 1;
    private int bannerType;
    private boolean fixedSize;
    private int offset = 0;

    public BannerStandardAd(Context context, int i) {
        super(context, AdPreferences.Placement.INAPP_BANNER);
        this.offset = i;
    }

    /* renamed from: a */
    public void mo30023a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C9022i3(this.f38612a, this, this.offset, adPreferences, adEventListener).mo30659c();
        this.offset++;
    }

    /* renamed from: b */
    public void mo30067b(boolean z) {
        this.fixedSize = z;
    }

    /* renamed from: c */
    public void mo30068c(int i) {
        this.bannerType = i;
    }

    /* renamed from: u */
    public int mo30069u() {
        return this.bannerType;
    }

    /* renamed from: v */
    public int mo30070v() {
        return this.offset;
    }

    /* renamed from: w */
    public boolean mo30071w() {
        return this.fixedSize;
    }
}
