package com.startapp;

import android.content.Context;
import com.startapp.sdk.ads.offerWall.offerWallJson.OfferWall3DAd;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.startapp.m3 */
/* compiled from: Sta */
public class C9127m3 extends C9592v0 {
    public C9127m3(Context context, OfferWall3DAd offerWall3DAd, AdPreferences adPreferences, AdEventListener adEventListener) {
        super(context, offerWall3DAd, adPreferences, adEventListener, AdPreferences.Placement.INAPP_OFFER_WALL);
    }

    /* renamed from: a */
    public void mo29446a(C9381Ad ad) {
        OfferWall3DAd offerWall3DAd = (OfferWall3DAd) ad;
        List<AdDetails> g = offerWall3DAd.mo30512g();
        C9677z5 a = C8823a6.f36412b.mo29085a(offerWall3DAd.mo30205h());
        a.getClass();
        a.f39553b = new ArrayList();
        a.f39554c = "";
        if (g != null) {
            for (AdDetails a2 : g) {
                a.mo31514a(a2);
            }
        }
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
