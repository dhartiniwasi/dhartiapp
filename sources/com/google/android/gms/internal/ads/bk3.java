package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class bk3 {

    /* renamed from: a */
    private final MediaCodec.CryptoInfo f7337a;

    /* renamed from: b */
    private final MediaCodec.CryptoInfo.Pattern f7338b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ bk3(MediaCodec.CryptoInfo cryptoInfo, aj3 aj3) {
        this.f7337a = cryptoInfo;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m10449a(bk3 bk3, int i, int i2) {
        bk3.f7338b.set(i, i2);
        bk3.f7337a.setPattern(bk3.f7338b);
    }
}
