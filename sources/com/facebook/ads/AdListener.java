package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.internal.bench.Benchmark;

@Keep
public interface AdListener {
    @Benchmark
    void onAdClicked(C1969Ad ad);

    @Benchmark
    void onAdLoaded(C1969Ad ad);

    @Benchmark
    void onError(C1969Ad ad, AdError adError);

    @Benchmark
    void onLoggingImpression(C1969Ad ad);
}
