package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import p087l4.C4933e;
import p094m4.C5043a;
import p094m4.C5045c;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public interface CustomEventInterstitial extends C5043a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, C5045c cVar, String str, C4933e eVar, Bundle bundle);

    void showInterstitial();
}
