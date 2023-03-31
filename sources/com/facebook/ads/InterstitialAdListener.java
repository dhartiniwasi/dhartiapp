package com.facebook.ads;

import androidx.annotation.Keep;

@Keep
public interface InterstitialAdListener extends AdListener {
    void onInterstitialDismissed(C1969Ad ad);

    void onInterstitialDisplayed(C1969Ad ad);
}
