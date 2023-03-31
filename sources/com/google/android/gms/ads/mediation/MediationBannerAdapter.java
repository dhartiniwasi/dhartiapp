package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import p087l4.C4933e;
import p087l4.C4934f;
import p087l4.C4937i;
import p179z3.C6337h;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public interface MediationBannerAdapter extends C4934f {
    View getBannerView();

    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, C4937i iVar, Bundle bundle, C6337h hVar, C4933e eVar, Bundle bundle2);
}
