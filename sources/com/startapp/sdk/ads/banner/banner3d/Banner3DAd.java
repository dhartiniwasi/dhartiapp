package com.startapp.sdk.ads.banner.banner3d;

import android.content.Context;
import com.startapp.C8996h3;
import com.startapp.sdk.adsbase.JsonAd;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class Banner3DAd extends JsonAd {
    private static final long serialVersionUID = 1;
    private boolean fixedSize;
    private int offset;

    public Banner3DAd(Context context, int i) {
        super(context, AdPreferences.Placement.INAPP_BANNER);
        this.offset = i;
    }

    /* renamed from: a */
    public void mo30023a(AdPreferences adPreferences, AdEventListener adEventListener) {
        new C8996h3(this.f38612a, this, this.offset, adPreferences, adEventListener).mo30659c();
        this.offset++;
    }

    /* renamed from: b */
    public void mo30024b(boolean z) {
        this.fixedSize = z;
    }

    /* renamed from: h */
    public int mo30025h() {
        return this.offset;
    }

    /* renamed from: i */
    public boolean mo30026i() {
        return this.fixedSize;
    }
}
