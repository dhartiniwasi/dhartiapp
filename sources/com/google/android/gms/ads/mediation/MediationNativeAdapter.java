package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import p087l4.C4934f;
import p087l4.C4944p;
import p087l4.C4947s;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public interface MediationNativeAdapter extends C4934f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, C4944p pVar, Bundle bundle, C4947s sVar, Bundle bundle2);
}
