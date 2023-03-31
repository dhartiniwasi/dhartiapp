package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.qm */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2778qm {

    /* renamed from: a */
    public final String f16464a;

    /* renamed from: b */
    public final boolean f16465b;

    /* renamed from: c */
    public final boolean f16466c;

    /* renamed from: d */
    public final boolean f16467d;

    /* renamed from: e */
    private final String f16468e;

    /* renamed from: f */
    private final MediaCodecInfo.CodecCapabilities f16469f;

    private C2778qm(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        Objects.requireNonNull(str);
        this.f16464a = str;
        this.f16468e = str2;
        this.f16469f = codecCapabilities;
        boolean z3 = true;
        this.f16465b = !z && codecCapabilities != null && C2893tq.f18208a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        this.f16466c = codecCapabilities != null && C2893tq.f18208a >= 21 && codecCapabilities.isFeatureSupported("tunneled-playback");
        if (!z2 && (codecCapabilities == null || C2893tq.f18208a < 21 || !codecCapabilities.isFeatureSupported("secure-playback"))) {
            z3 = false;
        }
        this.f16467d = z3;
    }

    /* renamed from: a */
    public static C2778qm m19281a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new C2778qm(str, str2, codecCapabilities, z, z2);
    }

    /* renamed from: b */
    public static C2778qm m19282b(String str) {
        return new C2778qm("OMX.google.raw.decoder", (String) null, (MediaCodecInfo.CodecCapabilities) null, false, false);
    }

    /* renamed from: h */
    private final void m19283h(String str) {
        String str2 = this.f16464a;
        String str3 = this.f16468e;
        String str4 = C2893tq.f18212e;
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + str2 + ", " + str3 + "] [" + str4 + "]");
    }

    /* renamed from: i */
    private static boolean m19284i(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d);
    }

    /* renamed from: c */
    public final boolean mo13570c(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f16469f;
        if (codecCapabilities == null) {
            m19283h("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m19283h("channelCount.aCaps");
            return false;
        } else if (audioCapabilities.getMaxInputChannelCount() >= i) {
            return true;
        } else {
            m19283h("channelCount.support, " + i);
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo13571d(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f16469f;
        if (codecCapabilities == null) {
            m19283h("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m19283h("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            m19283h("sampleRate.support, " + i);
            return false;
        }
    }

    /* renamed from: e */
    public final boolean mo13572e(String str) {
        if (str == null || this.f16468e == null) {
            return true;
        }
        String trim = str.trim();
        String str2 = (trim.startsWith("avc1") || trim.startsWith("avc3")) ? "video/avc" : (trim.startsWith("hev1") || trim.startsWith("hvc1")) ? "video/hevc" : trim.startsWith("vp9") ? "video/x-vnd.on2.vp9" : trim.startsWith("vp8") ? "video/x-vnd.on2.vp8" : trim.startsWith("mp4a") ? "audio/mp4a-latm" : (trim.startsWith("ac-3") || trim.startsWith("dac3")) ? "audio/ac3" : (trim.startsWith("ec-3") || trim.startsWith("dec3")) ? "audio/eac3" : (trim.startsWith("dtsc") || trim.startsWith("dtse")) ? "audio/vnd.dts" : (trim.startsWith("dtsh") || trim.startsWith("dtsl")) ? "audio/vnd.dts.hd" : trim.startsWith("opus") ? "audio/opus" : trim.startsWith("vorbis") ? "audio/vorbis" : null;
        if (str2 == null) {
            return true;
        }
        if (!this.f16468e.equals(str2)) {
            m19283h("codec.mime " + str + ", " + str2);
            return false;
        }
        Pair b = C2295dn.m11568b(str);
        if (b == null) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mo13574g()) {
            if (codecProfileLevel.profile == ((Integer) b.first).intValue() && codecProfileLevel.level >= ((Integer) b.second).intValue()) {
                return true;
            }
        }
        m19283h("codec.profileLevel, " + str + ", " + str2);
        return false;
    }

    /* renamed from: f */
    public final boolean mo13573f(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f16469f;
        if (codecCapabilities == null) {
            m19283h("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m19283h("sizeAndRate.vCaps");
            return false;
        } else if (m19284i(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !m19284i(videoCapabilities, i2, i, d)) {
                m19283h("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
                return false;
            }
            String str = this.f16464a;
            String str2 = this.f16468e;
            String str3 = C2893tq.f18212e;
            StringBuilder sb = new StringBuilder();
            sb.append("AssumedSupport [");
            sb.append("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
            sb.append("] [");
            sb.append(str);
            sb.append(", ");
            sb.append(str2);
            sb.append("] [");
            sb.append(str3);
            sb.append("]");
            Log.d("MediaCodecInfo", sb.toString());
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.MediaCodecInfo.CodecProfileLevel[] mo13574g() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f16469f
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C2778qm.mo13574g():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }
}
