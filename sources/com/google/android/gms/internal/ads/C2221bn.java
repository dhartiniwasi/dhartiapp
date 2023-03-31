package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: com.google.android.gms.internal.ads.bn */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2221bn implements C3111zm {
    /* synthetic */ C2221bn(C2184an anVar) {
    }

    /* renamed from: b */
    public final boolean mo8883b() {
        return false;
    }

    /* renamed from: s */
    public final MediaCodecInfo mo8884s(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    /* renamed from: t */
    public final boolean mo8885t(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    public final int zza() {
        return MediaCodecList.getCodecCount();
    }
}
