package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class pe4 {

    /* renamed from: a */
    public final String f15824a;

    /* renamed from: b */
    public final String f15825b;

    /* renamed from: c */
    public final String f15826c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f15827d;

    /* renamed from: e */
    public final boolean f15828e;

    /* renamed from: f */
    public final boolean f15829f;

    /* renamed from: g */
    public final boolean f15830g;

    /* renamed from: h */
    private final boolean f15831h;

    pe4(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Objects.requireNonNull(str);
        this.f15824a = str;
        this.f15825b = str2;
        this.f15826c = str3;
        this.f15827d = codecCapabilities;
        this.f15830g = z;
        this.f15828e = z4;
        this.f15829f = z6;
        this.f15831h = d90.m11369h(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if ("Nexus 10".equals(r3) == false) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.pe4 m18593c(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.pe4 r11 = new com.google.android.gms.internal.ads.pe4
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L_0x003b
            int r3 = com.google.android.gms.internal.ads.gb2.f9812a
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x003b
            r5 = 22
            if (r3 > r5) goto L_0x0039
            java.lang.String r3 = com.google.android.gms.internal.ads.gb2.f9815d
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x0028
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0039
        L_0x0028:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L_0x003b
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r8 = 1
            goto L_0x003c
        L_0x003b:
            r8 = 0
        L_0x003c:
            r3 = 21
            if (r4 == 0) goto L_0x004e
            int r5 = com.google.android.gms.internal.ads.gb2.f9812a
            if (r5 < r3) goto L_0x004e
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x004e
            r9 = 1
            goto L_0x004f
        L_0x004e:
            r9 = 0
        L_0x004f:
            if (r20 != 0) goto L_0x0062
            if (r4 == 0) goto L_0x0060
            int r5 = com.google.android.gms.internal.ads.gb2.f9812a
            if (r5 < r3) goto L_0x0060
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r10 = 0
            goto L_0x0063
        L_0x0062:
            r10 = 1
        L_0x0063:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pe4.m18593c(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.pe4");
    }

    /* renamed from: h */
    private static Point m18594h(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(gb2.m13145O(i, widthAlignment) * widthAlignment, gb2.m13145O(i2, heightAlignment) * heightAlignment);
    }

    /* renamed from: i */
    private final void m18595i(String str) {
        String str2 = this.f15824a;
        String str3 = this.f15825b;
        String str4 = gb2.f9816e;
        ot1.m18056a("MediaCodecInfo", "NoSupport [" + str + "] [" + str2 + ", " + str3 + "] [" + str4 + "]");
    }

    /* renamed from: j */
    private static boolean m18596j(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point h = m18594h(videoCapabilities, i, i2);
        int i3 = h.x;
        int i4 = h.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* renamed from: a */
    public final Point mo13261a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15827d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m18594h(videoCapabilities, i, i2);
    }

    /* renamed from: b */
    public final oz3 mo13262b(C2388g4 g4Var, C2388g4 g4Var2) {
        int i = true != gb2.m13186t(g4Var.f9673l, g4Var2.f9673l) ? 8 : 0;
        if (this.f15831h) {
            if (g4Var.f9681t != g4Var2.f9681t) {
                i |= 1024;
            }
            if (!this.f15828e && !(g4Var.f9678q == g4Var2.f9678q && g4Var.f9679r == g4Var2.f9679r)) {
                i |= 512;
            }
            if (!gb2.m13186t(g4Var.f9685x, g4Var2.f9685x)) {
                i |= 2048;
            }
            String str = this.f15824a;
            if (gb2.f9815d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !g4Var.mo10386d(g4Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new oz3(this.f15824a, g4Var, g4Var2, true != g4Var.mo10386d(g4Var2) ? 2 : 3, 0);
            }
        } else {
            if (g4Var.f9686y != g4Var2.f9686y) {
                i |= 4096;
            }
            if (g4Var.f9687z != g4Var2.f9687z) {
                i |= 8192;
            }
            if (g4Var.f9656A != g4Var2.f9656A) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f15825b)) {
                Pair b = if4.m14305b(g4Var);
                Pair b2 = if4.m14305b(g4Var2);
                if (!(b == null || b2 == null)) {
                    int intValue = ((Integer) b.first).intValue();
                    int intValue2 = ((Integer) b2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new oz3(this.f15824a, g4Var, g4Var2, 3, 0);
                    }
                }
            }
            if (!g4Var.mo10386d(g4Var2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.f15825b)) {
                i |= 2;
            }
            if (i == 0) {
                return new oz3(this.f15824a, g4Var, g4Var2, 1, 0);
            }
        }
        return new oz3(this.f15824a, g4Var, g4Var2, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        r5 = r5.getVideoCapabilities();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo13263d(com.google.android.gms.internal.ads.C2388g4 r13) throws com.google.android.gms.internal.ads.bf4 {
        /*
            r12 = this;
            java.lang.String r0 = r12.f15825b
            java.lang.String r1 = r13.f9673l
            boolean r0 = r0.equals(r1)
            r1 = 0
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = r12.f15825b
            java.lang.String r2 = com.google.android.gms.internal.ads.if4.m14308e(r13)
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            return r1
        L_0x0019:
            java.lang.String r0 = r13.f9670i
            r2 = 16
            r3 = 1
            if (r0 != 0) goto L_0x0022
            goto L_0x0143
        L_0x0022:
            android.util.Pair r0 = com.google.android.gms.internal.ads.if4.m14305b(r13)
            if (r0 == 0) goto L_0x0143
            java.lang.Object r4 = r0.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.String r5 = r13.f9673l
            java.lang.String r6 = "video/dolby-vision"
            boolean r5 = r6.equals(r5)
            r6 = 8
            java.lang.String r7 = "video/hevc"
            r8 = 2
            if (r5 == 0) goto L_0x005f
            java.lang.String r5 = r12.f15825b
            java.lang.String r9 = "video/avc"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x0055
            r0 = 0
            r4 = 8
            goto L_0x005f
        L_0x0055:
            java.lang.String r5 = r12.f15825b
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x005f
            r0 = 0
            r4 = 2
        L_0x005f:
            boolean r5 = r12.f15831h
            r9 = 42
            if (r5 != 0) goto L_0x0069
            if (r4 != r9) goto L_0x0143
            r4 = 42
        L_0x0069:
            android.media.MediaCodecInfo$CodecProfileLevel[] r5 = r12.mo13266g()
            int r9 = com.google.android.gms.internal.ads.gb2.f9812a
            r10 = 23
            if (r9 > r10) goto L_0x00f5
            java.lang.String r9 = r12.f15825b
            java.lang.String r10 = "video/x-vnd.on2.vp9"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x00f5
            int r9 = r5.length
            if (r9 != 0) goto L_0x00f5
            android.media.MediaCodecInfo$CodecCapabilities r5 = r12.f15827d
            if (r5 == 0) goto L_0x0099
            android.media.MediaCodecInfo$VideoCapabilities r5 = r5.getVideoCapabilities()
            if (r5 == 0) goto L_0x0099
            android.util.Range r5 = r5.getBitrateRange()
            java.lang.Comparable r5 = r5.getUpper()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            goto L_0x009a
        L_0x0099:
            r5 = 0
        L_0x009a:
            r9 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r5 < r9) goto L_0x00a2
            r6 = 1024(0x400, float:1.435E-42)
            goto L_0x00e7
        L_0x00a2:
            r9 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r5 < r9) goto L_0x00aa
            r6 = 512(0x200, float:7.175E-43)
            goto L_0x00e7
        L_0x00aa:
            r9 = 60000000(0x3938700, float:8.670878E-37)
            if (r5 < r9) goto L_0x00b2
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x00e7
        L_0x00b2:
            r9 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r5 < r9) goto L_0x00ba
            r6 = 128(0x80, float:1.794E-43)
            goto L_0x00e7
        L_0x00ba:
            r9 = 18000000(0x112a880, float:2.6936858E-38)
            if (r5 < r9) goto L_0x00c2
            r6 = 64
            goto L_0x00e7
        L_0x00c2:
            r9 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r5 < r9) goto L_0x00ca
            r6 = 32
            goto L_0x00e7
        L_0x00ca:
            r9 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r5 < r9) goto L_0x00d2
            r6 = 16
            goto L_0x00e7
        L_0x00d2:
            r9 = 3600000(0x36ee80, float:5.044674E-39)
            if (r5 < r9) goto L_0x00d8
            goto L_0x00e7
        L_0x00d8:
            r6 = 1800000(0x1b7740, float:2.522337E-39)
            if (r5 < r6) goto L_0x00df
            r6 = 4
            goto L_0x00e7
        L_0x00df:
            r6 = 800000(0xc3500, float:1.121039E-39)
            if (r5 < r6) goto L_0x00e6
            r6 = 2
            goto L_0x00e7
        L_0x00e6:
            r6 = 1
        L_0x00e7:
            android.media.MediaCodecInfo$CodecProfileLevel r5 = new android.media.MediaCodecInfo$CodecProfileLevel
            r5.<init>()
            r5.profile = r3
            r5.level = r6
            android.media.MediaCodecInfo$CodecProfileLevel[] r6 = new android.media.MediaCodecInfo.CodecProfileLevel[r3]
            r6[r1] = r5
            r5 = r6
        L_0x00f5:
            int r6 = r5.length
            r9 = 0
        L_0x00f7:
            if (r9 >= r6) goto L_0x0122
            r10 = r5[r9]
            int r11 = r10.profile
            if (r11 != r4) goto L_0x011f
            int r10 = r10.level
            if (r10 < r0) goto L_0x011f
            java.lang.String r10 = r12.f15825b
            boolean r10 = r7.equals(r10)
            if (r10 == 0) goto L_0x0143
            if (r4 != r8) goto L_0x0143
            java.lang.String r10 = com.google.android.gms.internal.ads.gb2.f9813b
            java.lang.String r11 = "sailfish"
            boolean r11 = r11.equals(r10)
            if (r11 != 0) goto L_0x011f
            java.lang.String r11 = "marlin"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x0143
        L_0x011f:
            int r9 = r9 + 1
            goto L_0x00f7
        L_0x0122:
            java.lang.String r13 = r13.f9670i
            java.lang.String r0 = r12.f15826c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "codec.profileLevel, "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r13 = ", "
            r2.append(r13)
            r2.append(r0)
            java.lang.String r13 = r2.toString()
            r12.m18595i(r13)
            return r1
        L_0x0143:
            boolean r0 = r12.f15831h
            r4 = 21
            if (r0 == 0) goto L_0x018b
            int r0 = r13.f9678q
            if (r0 <= 0) goto L_0x018a
            int r2 = r13.f9679r
            if (r2 > 0) goto L_0x0152
            goto L_0x018a
        L_0x0152:
            int r5 = com.google.android.gms.internal.ads.gb2.f9812a
            if (r5 < r4) goto L_0x015e
            float r13 = r13.f9680s
            double r3 = (double) r13
            boolean r13 = r12.mo13265f(r0, r2, r3)
            return r13
        L_0x015e:
            int r0 = r0 * r2
            int r2 = com.google.android.gms.internal.ads.if4.m14304a()
            if (r0 > r2) goto L_0x0167
            r1 = 1
        L_0x0167:
            if (r1 != 0) goto L_0x0189
            int r0 = r13.f9678q
            int r13 = r13.f9679r
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "legacyFrameSize, "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "x"
            r2.append(r0)
            r2.append(r13)
            java.lang.String r13 = r2.toString()
            r12.m18595i(r13)
        L_0x0189:
            return r1
        L_0x018a:
            return r3
        L_0x018b:
            int r0 = com.google.android.gms.internal.ads.gb2.f9812a
            if (r0 < r4) goto L_0x02a7
            int r4 = r13.f9687z
            r5 = -1
            if (r4 == r5) goto L_0x01c8
            android.media.MediaCodecInfo$CodecCapabilities r6 = r12.f15827d
            if (r6 != 0) goto L_0x019f
            java.lang.String r13 = "sampleRate.caps"
            r12.m18595i(r13)
            goto L_0x02a8
        L_0x019f:
            android.media.MediaCodecInfo$AudioCapabilities r6 = r6.getAudioCapabilities()
            if (r6 != 0) goto L_0x01ac
            java.lang.String r13 = "sampleRate.aCaps"
            r12.m18595i(r13)
            goto L_0x02a8
        L_0x01ac:
            boolean r6 = r6.isSampleRateSupported(r4)
            if (r6 != 0) goto L_0x01c8
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "sampleRate.support, "
            r13.append(r0)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            r12.m18595i(r13)
            goto L_0x02a8
        L_0x01c8:
            int r13 = r13.f9686y
            if (r13 == r5) goto L_0x02a7
            android.media.MediaCodecInfo$CodecCapabilities r4 = r12.f15827d
            if (r4 != 0) goto L_0x01d7
            java.lang.String r13 = "channelCount.caps"
            r12.m18595i(r13)
            goto L_0x02a6
        L_0x01d7:
            android.media.MediaCodecInfo$AudioCapabilities r4 = r4.getAudioCapabilities()
            if (r4 != 0) goto L_0x01e4
            java.lang.String r13 = "channelCount.aCaps"
            r12.m18595i(r13)
            goto L_0x02a6
        L_0x01e4:
            java.lang.String r5 = r12.f15824a
            java.lang.String r6 = r12.f15825b
            int r4 = r4.getMaxInputChannelCount()
            if (r4 > r3) goto L_0x0290
            r7 = 26
            if (r0 < r7) goto L_0x01f6
            if (r4 <= 0) goto L_0x01f6
            goto L_0x0290
        L_0x01f6:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/3gpp"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/amr-wb"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/vorbis"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/flac"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/g711-alaw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/g711-mlaw"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0290
            java.lang.String r0 = "audio/gsm"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x024f
            goto L_0x0290
        L_0x024f:
            java.lang.String r0 = "audio/ac3"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0259
            r2 = 6
            goto L_0x0264
        L_0x0259:
            java.lang.String r0 = "audio/eac3"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0262
            goto L_0x0264
        L_0x0262:
            r2 = 30
        L_0x0264:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "AssumedMaxChannelAdjustment: "
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = ", ["
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = " to "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r4 = "]"
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "MediaCodecInfo"
            com.google.android.gms.internal.ads.ot1.m18060e(r4, r0)
            r4 = r2
        L_0x0290:
            if (r4 >= r13) goto L_0x02a7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "channelCount.support, "
            r0.append(r2)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.m18595i(r13)
        L_0x02a6:
            return r1
        L_0x02a7:
            r1 = 1
        L_0x02a8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pe4.mo13263d(com.google.android.gms.internal.ads.g4):boolean");
    }

    /* renamed from: e */
    public final boolean mo13264e(C2388g4 g4Var) {
        if (this.f15831h) {
            return this.f15828e;
        }
        Pair b = if4.m14305b(g4Var);
        return b != null && ((Integer) b.first).intValue() == 42;
    }

    /* renamed from: f */
    public final boolean mo13265f(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f15827d;
        if (codecCapabilities == null) {
            m18595i("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m18595i("sizeAndRate.vCaps");
            return false;
        } else if (m18596j(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.f15824a) && "mcv5a".equals(gb2.f9813b)) || !m18596j(videoCapabilities, i2, i, d))) {
                m18595i("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
                return false;
            }
            String str = this.f15824a;
            String str2 = this.f15825b;
            String str3 = gb2.f9816e;
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
            ot1.m18056a("MediaCodecInfo", sb.toString());
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.MediaCodecInfo.CodecProfileLevel[] mo13266g() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f15827d
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pe4.mo13266g():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    public final String toString() {
        return this.f15824a;
    }
}
