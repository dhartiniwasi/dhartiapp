package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.banner3d.Banner3DAd;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;

/* renamed from: com.startapp.h3 */
/* compiled from: Sta */
public class C8996h3 extends C9592v0 {

    /* renamed from: i */
    public int f36890i = 0;

    public C8996h3(Context context, Banner3DAd banner3DAd, int i, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, banner3DAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_BANNER);
        this.f36890i = i;
    }

    /* renamed from: a */
    public void mo29446a(C9381Ad ad) {
    }

    /* renamed from: d */
    public GetAdRequest mo29447d() {
        C9181o0 o0Var = new C9181o0();
        mo30657a((GetAdRequest) o0Var);
        o0Var.f38918q0 = BannerMetaData.f38219b.mo29957a().mo29961a();
        o0Var.f38891A0 = this.f36890i;
        o0Var.f37969U0 = ((Banner3DAd) this.f38770b).mo30026i();
        o0Var.mo29776f(this.f38769a);
        return o0Var;
    }
}
