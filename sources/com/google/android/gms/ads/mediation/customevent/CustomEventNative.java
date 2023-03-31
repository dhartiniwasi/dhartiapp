package com.google.android.gms.ads.mediation.customevent;

import android.content.Context;
import android.os.Bundle;
import p087l4.C4947s;
import p094m4.C5043a;
import p094m4.C5046d;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public interface CustomEventNative extends C5043a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, C5046d dVar, String str, C4947s sVar, Bundle bundle);
}
