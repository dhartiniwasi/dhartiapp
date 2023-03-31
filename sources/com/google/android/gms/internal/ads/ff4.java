package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ff4 implements df4 {
    /* synthetic */ ff4(ef4 ef4) {
    }

    /* renamed from: a */
    public final boolean mo9565a() {
        return false;
    }

    /* renamed from: b */
    public final boolean mo9566b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    /* renamed from: c */
    public final boolean mo9567c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    /* renamed from: s */
    public final MediaCodecInfo mo9568s(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public final int zza() {
        return MediaCodecList.getCodecCount();
    }
}
