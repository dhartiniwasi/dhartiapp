package com.startapp.sdk.ads.offerWall.offerWallJson;

import android.content.Context;
import android.content.Intent;
import com.startapp.C8823a6;
import com.startapp.C8870c1;
import com.startapp.C9023i4;
import com.startapp.C9127m3;
import com.startapp.C9605vb;
import com.startapp.C9677z5;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.adsbase.ActivityExtra;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.C9440d;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.UUID;

/* compiled from: Sta */
public class OfferWall3DAd extends JsonAd implements C9440d {

    /* renamed from: c */
    public static String f38388c = null;
    private static final long serialVersionUID = 1;
    private final String uuid = UUID.randomUUID().toString();

    public OfferWall3DAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_OFFER_WALL);
        if (f38388c == null) {
            f38388c = C9605vb.m50447a(context);
        }
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo30088a(String str) {
        C9677z5 a = C8823a6.f36412b.mo29085a(this.uuid);
        StringBuilder a2 = C8870c1.m48422a("&position=");
        a2.append(C9396a.m49771a());
        a.f39554c = a2.toString();
        ActivityExtra activityExtra = this.activityExtra;
        boolean a3 = activityExtra != null ? activityExtra.mo30414a() : false;
        if (super.mo30091d()) {
            mo30415a(NotDisplayedReason.AD_EXPIRED);
            return false;
        }
        Intent intent = new Intent(this.f38612a, List3DActivity.class);
        intent.putExtra("adInfoOverride", getAdInfoOverride());
        intent.putExtra("fullscreen", a3);
        intent.putExtra("adTag", str);
        intent.putExtra("lastLoadTime", super.mo30089b());
        intent.putExtra("adCacheTtl", super.mo30090c());
        intent.putExtra("position", C9396a.m49771a());
        intent.putExtra("listModelUuid", this.uuid);
        intent.addFlags(343932928);
        try {
            this.f38612a.startActivity(intent);
            if (AdsConstants.f38631f.booleanValue()) {
                return true;
            }
            setState(C9381Ad.AdState.UN_INITIALIZED);
            return true;
        } catch (Throwable th) {
            C9023i4.m48681a(th);
            return false;
        }
    }

    /* renamed from: b */
    public Long mo30089b() {
        return super.mo30089b();
    }

    /* renamed from: c */
    public Long mo30090c() {
        return super.mo30090c();
    }

    /* renamed from: d */
    public boolean mo30091d() {
        return super.mo30091d();
    }

    /* renamed from: h */
    public String mo30205h() {
        return this.uuid;
    }

    /* renamed from: a */
    public void mo30023a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C9127m3(this.f38612a, this, adPreferences, adEventListener).mo30659c();
    }

    /* renamed from: a */
    public boolean mo30087a() {
        return super.mo30087a();
    }

    /* renamed from: a */
    public void mo30086a(boolean z) {
        super.mo30086a(z);
    }
}
