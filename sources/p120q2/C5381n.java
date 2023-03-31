package p120q2;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import p021c2.C1852i;
import p120q2.C5386v;
import p161w3.C5917a;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5967v;
import p177z1.C6272r1;

/* renamed from: q2.n */
/* compiled from: MediaCodecInfo */
public final class C5381n {

    /* renamed from: a */
    public final String f27515a;

    /* renamed from: b */
    public final String f27516b;

    /* renamed from: c */
    public final String f27517c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f27518d;

    /* renamed from: e */
    public final boolean f27519e;

    /* renamed from: f */
    public final boolean f27520f;

    /* renamed from: g */
    public final boolean f27521g;

    /* renamed from: h */
    public final boolean f27522h;

    /* renamed from: i */
    public final boolean f27523i;

    /* renamed from: j */
    public final boolean f27524j;

    /* renamed from: k */
    private final boolean f27525k;

    C5381n(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f27515a = (String) C5917a.m34872e(str);
        this.f27516b = str2;
        this.f27517c = str3;
        this.f27518d = codecCapabilities;
        this.f27522h = z;
        this.f27523i = z2;
        this.f27524j = z3;
        this.f27519e = z4;
        this.f27520f = z5;
        this.f27521g = z6;
        this.f27525k = C5967v.m35255s(str2);
    }

    /* renamed from: A */
    private static boolean m32931A(String str, int i) {
        if ("video/hevc".equals(str) && 2 == i) {
            String str2 = C5953m0.f29111b;
            if ("sailfish".equals(str2) || "marlin".equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: B */
    private static final boolean m32932B(String str) {
        return !"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(C5953m0.f29111b);
    }

    /* renamed from: C */
    public static C5381n m32933C(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return new C5381n(str, str2, str3, codecCapabilities, z, z2, z3, !z4 && codecCapabilities != null && m32938h(codecCapabilities) && !m32950z(str), codecCapabilities != null && m32944s(codecCapabilities), z5 || (codecCapabilities != null && m32942q(codecCapabilities)));
    }

    /* renamed from: a */
    private static int m32934a(String str, String str2, int i) {
        int i2;
        if (i > 1 || ((C5953m0.f29110a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        if ("audio/ac3".equals(str2)) {
            i2 = 6;
        } else {
            i2 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        C5961r.m35215i("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i2 + "]");
        return i2;
    }

    /* renamed from: c */
    private static Point m32935c(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(C5953m0.m35142l(i, widthAlignment) * widthAlignment, C5953m0.m35142l(i2, heightAlignment) * heightAlignment);
    }

    /* renamed from: d */
    private static boolean m32936d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point c = m32935c(videoCapabilities, i, i2);
        int i3 = c.x;
        int i4 = c.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = r3.getVideoCapabilities();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.media.MediaCodecInfo.CodecProfileLevel[] m32937f(android.media.MediaCodecInfo.CodecCapabilities r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0018
            android.media.MediaCodecInfo$VideoCapabilities r3 = r3.getVideoCapabilities()
            if (r3 == 0) goto L_0x0018
            android.util.Range r3 = r3.getBitrateRange()
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            r1 = 180000000(0xaba9500, float:1.7967196E-32)
            r2 = 1
            if (r3 < r1) goto L_0x0022
            r3 = 1024(0x400, float:1.435E-42)
            goto L_0x0069
        L_0x0022:
            r1 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r3 < r1) goto L_0x002a
            r3 = 512(0x200, float:7.175E-43)
            goto L_0x0069
        L_0x002a:
            r1 = 60000000(0x3938700, float:8.670878E-37)
            if (r3 < r1) goto L_0x0032
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0069
        L_0x0032:
            r1 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r3 < r1) goto L_0x003a
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x0069
        L_0x003a:
            r1 = 18000000(0x112a880, float:2.6936858E-38)
            if (r3 < r1) goto L_0x0042
            r3 = 64
            goto L_0x0069
        L_0x0042:
            r1 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r3 < r1) goto L_0x004a
            r3 = 32
            goto L_0x0069
        L_0x004a:
            r1 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r3 < r1) goto L_0x0052
            r3 = 16
            goto L_0x0069
        L_0x0052:
            r1 = 3600000(0x36ee80, float:5.044674E-39)
            if (r3 < r1) goto L_0x005a
            r3 = 8
            goto L_0x0069
        L_0x005a:
            r1 = 1800000(0x1b7740, float:2.522337E-39)
            if (r3 < r1) goto L_0x0061
            r3 = 4
            goto L_0x0069
        L_0x0061:
            r1 = 800000(0xc3500, float:1.121039E-39)
            if (r3 < r1) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = 1
        L_0x0069:
            android.media.MediaCodecInfo$CodecProfileLevel r1 = new android.media.MediaCodecInfo$CodecProfileLevel
            r1.<init>()
            r1.profile = r2
            r1.level = r3
            android.media.MediaCodecInfo$CodecProfileLevel[] r3 = new android.media.MediaCodecInfo.CodecProfileLevel[r2]
            r3[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q2.C5381n.m32937f(android.media.MediaCodecInfo$CodecCapabilities):android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    /* renamed from: h */
    private static boolean m32938h(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C5953m0.f29110a >= 19 && m32939i(codecCapabilities);
    }

    /* renamed from: i */
    private static boolean m32939i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    /* renamed from: l */
    private boolean m32940l(C6272r1 r1Var) {
        Pair<Integer, Integer> q;
        if (r1Var.f30240i == null || (q = C5386v.m33088q(r1Var)) == null) {
            return true;
        }
        int intValue = ((Integer) q.first).intValue();
        int intValue2 = ((Integer) q.second).intValue();
        if ("video/dolby-vision".equals(r1Var.f30243t)) {
            if ("video/avc".equals(this.f27516b)) {
                intValue = 8;
            } else if ("video/hevc".equals(this.f27516b)) {
                intValue = 2;
            }
            intValue2 = 0;
        }
        if (!this.f27525k && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] g = mo19482g();
        if (C5953m0.f29110a <= 23 && "video/x-vnd.on2.vp9".equals(this.f27516b) && g.length == 0) {
            g = m32937f(this.f27518d);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : g) {
            if (codecProfileLevel.profile == intValue && codecProfileLevel.level >= intValue2 && !m32931A(this.f27516b, intValue)) {
                return true;
            }
        }
        m32947w("codec.profileLevel, " + r1Var.f30240i + ", " + this.f27517c);
        return false;
    }

    /* renamed from: o */
    private boolean m32941o(C6272r1 r1Var) {
        return this.f27516b.equals(r1Var.f30243t) || this.f27516b.equals(C5386v.m33084m(r1Var));
    }

    /* renamed from: q */
    private static boolean m32942q(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C5953m0.f29110a >= 21 && m32943r(codecCapabilities);
    }

    /* renamed from: r */
    private static boolean m32943r(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: s */
    private static boolean m32944s(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return C5953m0.f29110a >= 21 && m32945t(codecCapabilities);
    }

    /* renamed from: t */
    private static boolean m32945t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    /* renamed from: v */
    private void m32946v(String str) {
        C5961r.m35208b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f27515a + ", " + this.f27516b + "] [" + C5953m0.f29114e + "]");
    }

    /* renamed from: w */
    private void m32947w(String str) {
        C5961r.m35208b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f27515a + ", " + this.f27516b + "] [" + C5953m0.f29114e + "]");
    }

    /* renamed from: x */
    private static boolean m32948x(String str) {
        return "audio/opus".equals(str);
    }

    /* renamed from: y */
    private static boolean m32949y(String str) {
        return C5953m0.f29113d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    /* renamed from: z */
    private static boolean m32950z(String str) {
        if (C5953m0.f29110a <= 22) {
            String str2 = C5953m0.f29113d;
            if (("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) && ("OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public Point mo19480b(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f27518d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return m32935c(videoCapabilities, i, i2);
    }

    /* renamed from: e */
    public C1852i mo19481e(C6272r1 r1Var, C6272r1 r1Var2) {
        int i = !C5953m0.m35124c(r1Var.f30243t, r1Var2.f30243t) ? 8 : 0;
        if (this.f27525k) {
            if (r1Var.f30219B != r1Var2.f30219B) {
                i |= 1024;
            }
            if (!this.f27519e && !(r1Var.f30248y == r1Var2.f30248y && r1Var.f30249z == r1Var2.f30249z)) {
                i |= 512;
            }
            if (!C5953m0.m35124c(r1Var.f30223F, r1Var2.f30223F)) {
                i |= 2048;
            }
            if (m32949y(this.f27515a) && !r1Var.mo21487g(r1Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new C1852i(this.f27515a, r1Var, r1Var2, r1Var.mo21487g(r1Var2) ? 3 : 2, 0);
            }
        } else {
            if (r1Var.f30224G != r1Var2.f30224G) {
                i |= 4096;
            }
            if (r1Var.f30225H != r1Var2.f30225H) {
                i |= 8192;
            }
            if (r1Var.f30226I != r1Var2.f30226I) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.f27516b)) {
                Pair<Integer, Integer> q = C5386v.m33088q(r1Var);
                Pair<Integer, Integer> q2 = C5386v.m33088q(r1Var2);
                if (!(q == null || q2 == null)) {
                    int intValue = ((Integer) q.first).intValue();
                    int intValue2 = ((Integer) q2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new C1852i(this.f27515a, r1Var, r1Var2, 3, 0);
                    }
                }
            }
            if (!r1Var.mo21487g(r1Var2)) {
                i |= 32;
            }
            if (m32948x(this.f27516b)) {
                i |= 2;
            }
            if (i == 0) {
                return new C1852i(this.f27515a, r1Var, r1Var2, 1, 0);
            }
        }
        return new C1852i(this.f27515a, r1Var, r1Var2, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.media.MediaCodecInfo.CodecProfileLevel[] mo19482g() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.f27518d
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q2.C5381n.mo19482g():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }

    /* renamed from: j */
    public boolean mo19483j(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f27518d;
        if (codecCapabilities == null) {
            m32947w("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m32947w("channelCount.aCaps");
            return false;
        } else if (m32934a(this.f27515a, this.f27516b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        } else {
            m32947w("channelCount.support, " + i);
            return false;
        }
    }

    /* renamed from: k */
    public boolean mo19484k(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f27518d;
        if (codecCapabilities == null) {
            m32947w("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            m32947w("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            m32947w("sampleRate.support, " + i);
            return false;
        }
    }

    /* renamed from: m */
    public boolean mo19485m(C6272r1 r1Var) throws C5386v.C5389c {
        int i;
        boolean z = false;
        if (!m32941o(r1Var) || !m32940l(r1Var)) {
            return false;
        }
        if (this.f27525k) {
            int i2 = r1Var.f30248y;
            if (i2 <= 0 || (i = r1Var.f30249z) <= 0) {
                return true;
            }
            if (C5953m0.f29110a >= 21) {
                return mo19489u(i2, i, (double) r1Var.f30218A);
            }
            if (i2 * i <= C5386v.m33067N()) {
                z = true;
            }
            if (!z) {
                m32947w("legacyFrameSize, " + r1Var.f30248y + "x" + r1Var.f30249z);
            }
            return z;
        }
        if (C5953m0.f29110a >= 21) {
            int i3 = r1Var.f30225H;
            if (i3 != -1 && !mo19484k(i3)) {
                return false;
            }
            int i4 = r1Var.f30224G;
            if (i4 == -1 || mo19483j(i4)) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public boolean mo19486n() {
        if (C5953m0.f29110a >= 29 && "video/x-vnd.on2.vp9".equals(this.f27516b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mo19482g()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    public boolean mo19487p(C6272r1 r1Var) {
        if (this.f27525k) {
            return this.f27519e;
        }
        Pair<Integer, Integer> q = C5386v.m33088q(r1Var);
        return q != null && ((Integer) q.first).intValue() == 42;
    }

    public String toString() {
        return this.f27515a;
    }

    /* renamed from: u */
    public boolean mo19489u(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f27518d;
        if (codecCapabilities == null) {
            m32947w("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            m32947w("sizeAndRate.vCaps");
            return false;
        } else if (m32936d(videoCapabilities, i, i2, d)) {
            return true;
        } else {
            if (i >= i2 || !m32932B(this.f27515a) || !m32936d(videoCapabilities, i2, i, d)) {
                m32947w("sizeAndRate.support, " + i + "x" + i2 + "x" + d);
                return false;
            }
            m32946v("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d);
            return true;
        }
    }
}
