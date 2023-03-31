package com.startapp.sdk.adsbase.adlisteners;

import com.startapp.sdk.adsbase.C9381Ad;

/* compiled from: Sta */
public interface AdEventListener {
    void onFailedToReceiveAd(C9381Ad ad);

    void onReceiveAd(C9381Ad ad);
}
