package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import p087l4.C4933e;
import p087l4.C4934f;
import p087l4.C4942n;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public interface MediationInterstitialAdapter extends C4934f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, C4942n nVar, Bundle bundle, C4933e eVar, Bundle bundle2);

    void showInterstitial();
}
