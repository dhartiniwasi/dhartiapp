package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: com.google.android.gms.internal.ads.cn */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2258cn implements C3111zm {

    /* renamed from: a */
    private final int f7839a;

    /* renamed from: b */
    private MediaCodecInfo[] f7840b;

    public C2258cn(boolean z) {
        this.f7839a = z ? 1 : 0;
    }

    /* renamed from: a */
    private final void m11012a() {
        if (this.f7840b == null) {
            this.f7840b = new MediaCodecList(this.f7839a).getCodecInfos();
        }
    }

    /* renamed from: b */
    public final boolean mo8883b() {
        return true;
    }

    /* renamed from: s */
    public final MediaCodecInfo mo8884s(int i) {
        m11012a();
        return this.f7840b[i];
    }

    /* renamed from: t */
    public final boolean mo8885t(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    public final int zza() {
        m11012a();
        return this.f7840b.length;
    }
}
