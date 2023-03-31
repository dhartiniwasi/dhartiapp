package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class gf4 implements df4 {

    /* renamed from: a */
    private final int f9896a;

    /* renamed from: b */
    private MediaCodecInfo[] f9897b;

    public gf4(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.f9896a = i;
    }

    /* renamed from: d */
    private final void m13277d() {
        if (this.f9897b == null) {
            this.f9897b = new MediaCodecList(this.f9896a).getCodecInfos();
        }
    }

    /* renamed from: a */
    public final boolean mo9565a() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo9566b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    /* renamed from: c */
    public final boolean mo9567c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    /* renamed from: s */
    public final MediaCodecInfo mo9568s(int i) {
        m13277d();
        return this.f9897b[i];
    }

    public final int zza() {
        m13277d();
        return this.f9897b.length;
    }
}
