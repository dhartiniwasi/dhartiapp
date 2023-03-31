package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.C1969Ad;

public interface FullScreenAd extends C1969Ad {

    @Keep
    public interface ShowAdConfig {
    }

    @Keep
    public interface ShowConfigBuilder {
        ShowAdConfig build();
    }

    C1969Ad.LoadConfigBuilder buildLoadAdConfig();

    ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
