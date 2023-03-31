package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;

/* renamed from: com.startapp.i3 */
/* compiled from: Sta */
public class C9022i3 extends C9573u0 {

    /* renamed from: m */
    public int f36948m = 0;

    public C9022i3(Context context, HtmlAd htmlAd, int i, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, htmlAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER, false);
        this.f36948m = i;
    }

    /* renamed from: a */
    public void mo29470a(boolean z) {
        super.mo29470a(z);
        mo31302c(z);
    }

    /* renamed from: d */
    public GetAdRequest mo29447d() {
        BannerStandardAd bannerStandardAd = (BannerStandardAd) this.f38770b;
        C9181o0 o0Var = new C9181o0();
        mo30657a((GetAdRequest) o0Var);
        o0Var.f39494L = bannerStandardAd.mo30505p();
        o0Var.f39495M = bannerStandardAd.mo30498i();
        o0Var.f38891A0 = this.f36948m;
        o0Var.f38918q0 = BannerMetaData.f38219b.mo29957a().mo29968f();
        o0Var.f37969U0 = bannerStandardAd.mo30071w();
        o0Var.f37970V0 = bannerStandardAd.mo30069u();
        o0Var.mo29776f(this.f38769a);
        return o0Var;
    }
}
