package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import p087l4.C4933e;
import p094m4.C5043a;
import p094m4.C5044b;
import p179z3.C6337h;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public interface CustomEventBanner extends C5043a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, C5044b bVar, String str, C6337h hVar, C4933e eVar, Bundle bundle);
}
