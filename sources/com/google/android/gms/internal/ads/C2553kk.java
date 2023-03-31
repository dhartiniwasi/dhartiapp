package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* renamed from: com.google.android.gms.internal.ads.kk */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2553kk {

    /* renamed from: a */
    private final MediaCodec.CryptoInfo f12132a;

    /* renamed from: b */
    private final MediaCodec.CryptoInfo.Pattern f12133b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ C2553kk(MediaCodec.CryptoInfo cryptoInfo, C2516jk jkVar) {
        this.f12132a = cryptoInfo;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m15446a(C2553kk kkVar, int i, int i2) {
        kkVar.f12133b.set(0, 0);
        kkVar.f12132a.setPattern(kkVar.f12133b);
    }
}
