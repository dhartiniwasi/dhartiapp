package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.offerWall.offerWallHtml.OfferWallAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;

/* renamed from: com.startapp.l3 */
/* compiled from: Sta */
public class C9110l3 extends C9573u0 {
    public C9110l3(Context context, OfferWallAd offerWallAd, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, offerWallAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OFFER_WALL, true);
    }

    /* renamed from: a */
    public void mo29470a(boolean z) {
        super.mo29470a(z);
        mo31302c(z);
    }

    /* renamed from: d */
    public GetAdRequest mo29447d() {
        GetAdRequest d = super.mo29447d();
        if (d == null) {
            return null;
        }
        d.f38918q0 = AdsCommonMetaData.f38625h.mo30475t();
        return d;
    }
}
