package com.startapp.sdk.adsbase.adlisteners;

import com.startapp.sdk.adsbase.C9381Ad;

/* compiled from: Sta */
public interface AdDisplayListener {
    void adClicked(C9381Ad ad);

    void adDisplayed(C9381Ad ad);

    void adHidden(C9381Ad ad);

    void adNotDisplayed(C9381Ad ad);
}
