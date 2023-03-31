package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.startapp.C9592v0;
import com.startapp.sdk.adsbase.C9381Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;

/* renamed from: com.startapp.sdk.ads.nativead.a */
/* compiled from: Sta */
public class C9326a extends C9592v0 {

    /* renamed from: i */
    public NativeAdPreferences f38387i;

    public C9326a(Context context, C9381Ad ad, AdPreferences adPreferences, AdEventListener adEventListener, NativeAdPreferences nativeAdPreferences) {
        super(context, ad, adPreferences, adEventListener, AdPreferences.Placement.INAPP_NATIVE);
        this.f38387i = nativeAdPreferences;
    }

    /* renamed from: a */
    public void mo29446a(C9381Ad ad) {
    }

    /* renamed from: d */
    public GetAdRequest mo29447d() {
        GetAdRequest d = super.mo29447d();
        if (d == null) {
            return null;
        }
        d.f38918q0 = this.f38387i.getAdsNumber();
        if (this.f38387i.getImageSize() != null) {
            d.f39494L = this.f38387i.getImageSize().getWidth();
            d.f39495M = this.f38387i.getImageSize().getHeight();
        } else {
            int primaryImageSize = this.f38387i.getPrimaryImageSize();
            int i = 2;
            if (primaryImageSize == -1) {
                primaryImageSize = 2;
            }
            d.f38902L0 = Integer.toString(primaryImageSize);
            int secondaryImageSize = this.f38387i.getSecondaryImageSize();
            if (secondaryImageSize != -1) {
                i = secondaryImageSize;
            }
            d.f38903M0 = Integer.toString(i);
        }
        if (this.f38387i.isContentAd()) {
            d.f38904N0 = this.f38387i.isContentAd();
        }
        return d;
    }
}
