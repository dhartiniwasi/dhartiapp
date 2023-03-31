package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.internal.ads.pm0;
import java.util.Objects;
import p087l4.C4933e;
import p087l4.C4937i;
import p087l4.C4942n;
import p087l4.C4944p;
import p087l4.C4947s;
import p179z3.C6321a;
import p179z3.C6337h;

@KeepName
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: e */
    static final C6321a f5976e = new C6321a(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");

    /* renamed from: a */
    private View f5977a;

    /* renamed from: b */
    CustomEventBanner f5978b;

    /* renamed from: c */
    CustomEventInterstitial f5979c;

    /* renamed from: d */
    CustomEventNative f5980d;

    /* renamed from: a */
    private static Object m9011a(Class cls, String str) {
        Objects.requireNonNull(str);
        try {
            return cls.cast(Class.forName(str).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Throwable th) {
            String message = th.getMessage();
            pm0.m18667g("Could not instantiate custom event adapter: " + str + ". " + message);
            return null;
        }
    }

    public View getBannerView() {
        return this.f5977a;
    }

    public void onDestroy() {
        CustomEventBanner customEventBanner = this.f5978b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f5979c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f5980d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    public void onPause() {
        CustomEventBanner customEventBanner = this.f5978b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f5979c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f5980d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    public void onResume() {
        CustomEventBanner customEventBanner = this.f5978b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f5979c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f5980d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    public void requestBannerAd(Context context, C4937i iVar, Bundle bundle, C6337h hVar, C4933e eVar, Bundle bundle2) {
        Bundle bundle3;
        CustomEventBanner customEventBanner = (CustomEventBanner) m9011a(CustomEventBanner.class, bundle.getString("class_name"));
        this.f5978b = customEventBanner;
        if (customEventBanner == null) {
            iVar.mo13770n(this, f5976e);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        CustomEventBanner customEventBanner2 = this.f5978b;
        Objects.requireNonNull(customEventBanner2);
        Context context2 = context;
        customEventBanner2.requestBannerAd(context2, new C2040a(this, iVar), bundle.getString("parameter"), hVar, eVar, bundle3);
    }

    public void requestInterstitialAd(Context context, C4942n nVar, Bundle bundle, C4933e eVar, Bundle bundle2) {
        Bundle bundle3;
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) m9011a(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.f5979c = customEventInterstitial;
        if (customEventInterstitial == null) {
            nVar.mo13759c(this, f5976e);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        CustomEventInterstitial customEventInterstitial2 = this.f5979c;
        Objects.requireNonNull(customEventInterstitial2);
        Context context2 = context;
        customEventInterstitial2.requestInterstitialAd(context2, new C2041b(this, this, nVar), bundle.getString("parameter"), eVar, bundle3);
    }

    public void requestNativeAd(Context context, C4944p pVar, Bundle bundle, C4947s sVar, Bundle bundle2) {
        Bundle bundle3;
        CustomEventNative customEventNative = (CustomEventNative) m9011a(CustomEventNative.class, bundle.getString("class_name"));
        this.f5980d = customEventNative;
        if (customEventNative == null) {
            pVar.mo13764h(this, f5976e);
            return;
        }
        if (bundle2 == null) {
            bundle3 = null;
        } else {
            bundle3 = bundle2.getBundle(bundle.getString("class_name"));
        }
        CustomEventNative customEventNative2 = this.f5980d;
        Objects.requireNonNull(customEventNative2);
        Context context2 = context;
        customEventNative2.requestNativeAd(context2, new C2042c(this, pVar), bundle.getString("parameter"), sVar, bundle3);
    }

    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.f5979c;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
