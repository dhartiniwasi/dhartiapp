package p120q2;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Pair;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5967v;
import p177z1.C6272r1;
import p182a7.C6408b;
import p190b7.C6685q;

/* renamed from: q2.v */
/* compiled from: MediaCodecUtil */
public final class C5386v {

    /* renamed from: a */
    private static final Pattern f27603a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b */
    private static final HashMap<C5388b, List<C5381n>> f27604b = new HashMap<>();

    /* renamed from: c */
    private static int f27605c = -1;

    /* renamed from: q2.v$b */
    /* compiled from: MediaCodecUtil */
    private static final class C5388b {

        /* renamed from: a */
        public final String f27606a;

        /* renamed from: b */
        public final boolean f27607b;

        /* renamed from: c */
        public final boolean f27608c;

        public C5388b(String str, boolean z, boolean z2) {
            this.f27606a = str;
            this.f27607b = z;
            this.f27608c = z2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != C5388b.class) {
                return false;
            }
            C5388b bVar = (C5388b) obj;
            if (TextUtils.equals(this.f27606a, bVar.f27606a) && this.f27607b == bVar.f27607b && this.f27608c == bVar.f27608c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = 1231;
            int hashCode = (((this.f27606a.hashCode() + 31) * 31) + (this.f27607b ? 1231 : 1237)) * 31;
            if (!this.f27608c) {
                i = 1237;
            }
            return hashCode + i;
        }
    }

    /* renamed from: q2.v$c */
    /* compiled from: MediaCodecUtil */
    public static class C5389c extends Exception {
        private C5389c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    /* renamed from: q2.v$d */
    /* compiled from: MediaCodecUtil */
    private interface C5390d {
        /* renamed from: a */
        MediaCodecInfo mo19515a(int i);

        /* renamed from: b */
        boolean mo19516b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: c */
        boolean mo19517c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        /* renamed from: d */
        int mo19518d();

        /* renamed from: e */
        boolean mo19519e();
    }

    /* renamed from: q2.v$e */
    /* compiled from: MediaCodecUtil */
    private static final class C5391e implements C5390d {
        private C5391e() {
        }

        /* renamed from: a */
        public MediaCodecInfo mo19515a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        /* renamed from: b */
        public boolean mo19516b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "secure-playback".equals(str) && "video/avc".equals(str2);
        }

        /* renamed from: c */
        public boolean mo19517c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return false;
        }

        /* renamed from: d */
        public int mo19518d() {
            return MediaCodecList.getCodecCount();
        }

        /* renamed from: e */
        public boolean mo19519e() {
            return false;
        }
    }

    /* renamed from: q2.v$f */
    /* compiled from: MediaCodecUtil */
    private static final class C5392f implements C5390d {

        /* renamed from: a */
        private final int f27609a;

        /* renamed from: b */
        private MediaCodecInfo[] f27610b;

        public C5392f(boolean z, boolean z2) {
            this.f27609a = (z || z2) ? 1 : 0;
        }

        /* renamed from: f */
        private void m33108f() {
            if (this.f27610b == null) {
                this.f27610b = new MediaCodecList(this.f27609a).getCodecInfos();
            }
        }

        /* renamed from: a */
        public MediaCodecInfo mo19515a(int i) {
            m33108f();
            return this.f27610b[i];
        }

        /* renamed from: b */
        public boolean mo19516b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        /* renamed from: c */
        public boolean mo19517c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        /* renamed from: d */
        public int mo19518d() {
            m33108f();
            return this.f27610b.length;
        }

        /* renamed from: e */
        public boolean mo19519e() {
            return true;
        }
    }

    /* renamed from: q2.v$g */
    /* compiled from: MediaCodecUtil */
    private interface C5393g<T> {
        /* renamed from: a */
        int mo19520a(T t);
    }

    /* renamed from: A */
    private static boolean m33054A(MediaCodecInfo mediaCodecInfo) {
        return C5953m0.f29110a >= 29 && m33055B(mediaCodecInfo);
    }

    /* renamed from: B */
    private static boolean m33055B(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    /* renamed from: C */
    private static boolean m33056C(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = C5953m0.f29110a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = C5953m0.f29111b;
            if ("a70".equals(str3) || ("Xiaomi".equals(C5953m0.f29112c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = C5953m0.f29111b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = C5953m0.f29111b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(C5953m0.f29112c))) {
            String str6 = C5953m0.f29111b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(C5953m0.f29112c)) {
            String str7 = C5953m0.f29111b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && C5953m0.f29111b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (i > 23 || !"audio/eac3-joc".equals(str2) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    private static boolean m33057D(MediaCodecInfo mediaCodecInfo, String str) {
        if (C5953m0.f29110a >= 29) {
            return m33058E(mediaCodecInfo);
        }
        return !m33059F(mediaCodecInfo, str);
    }

    /* renamed from: E */
    private static boolean m33058E(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    /* renamed from: F */
    private static boolean m33059F(MediaCodecInfo mediaCodecInfo, String str) {
        if (C5953m0.f29110a >= 29) {
            return m33060G(mediaCodecInfo);
        }
        if (C5967v.m35251o(str)) {
            return true;
        }
        String e = C6408b.m37506e(mediaCodecInfo.getName());
        if (e.startsWith("arc.")) {
            return false;
        }
        if (e.startsWith("omx.google.") || e.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((e.startsWith("omx.sec.") && e.contains(".sw.")) || e.equals("omx.qcom.video.decoder.hevcswvdec") || e.startsWith("c2.android.") || e.startsWith("c2.google.")) {
            return true;
        }
        if (e.startsWith("omx.") || e.startsWith("c2.")) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    private static boolean m33060G(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    /* renamed from: H */
    private static boolean m33061H(MediaCodecInfo mediaCodecInfo) {
        if (C5953m0.f29110a >= 29) {
            return m33062I(mediaCodecInfo);
        }
        String e = C6408b.m37506e(mediaCodecInfo.getName());
        return !e.startsWith("omx.google.") && !e.startsWith("c2.android.") && !e.startsWith("c2.google.");
    }

    /* renamed from: I */
    private static boolean m33062I(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static /* synthetic */ int m33063J(C5381n nVar) {
        String str = nVar.f27515a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (C5953m0.f29110a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static /* synthetic */ int m33064K(C5381n nVar) {
        return nVar.f27515a.startsWith("OMX.google") ? 1 : 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static /* synthetic */ int m33065L(C6272r1 r1Var, C5381n nVar) {
        try {
            return nVar.mo19485m(r1Var) ? 1 : 0;
        } catch (C5389c unused) {
            return -1;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public static /* synthetic */ int m33066M(C5393g gVar, Object obj, Object obj2) {
        return gVar.mo19520a(obj2) - gVar.mo19520a(obj);
    }

    /* renamed from: N */
    public static int m33067N() throws C5389c {
        if (f27605c == -1) {
            int i = 0;
            C5381n r = m33089r("video/avc", false, false);
            if (r != null) {
                MediaCodecInfo.CodecProfileLevel[] g = r.mo19482g();
                int length = g.length;
                int i2 = 0;
                while (i < length) {
                    i2 = Math.max(m33079h(g[i].level), i2);
                    i++;
                }
                i = Math.max(i2, C5953m0.f29110a >= 21 ? 345600 : 172800);
            }
            f27605c = i;
        }
        return f27605c;
    }

    /* renamed from: O */
    private static int m33068O(int i) {
        int i2 = 17;
        if (i != 17) {
            i2 = 20;
            if (i != 20) {
                i2 = 23;
                if (i != 23) {
                    i2 = 29;
                    if (i != 29) {
                        i2 = 39;
                        if (i != 39) {
                            i2 = 42;
                            if (i != 42) {
                                switch (i) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: P */
    private static <T> void m33069P(List<T> list, C5393g<T> gVar) {
        Collections.sort(list, new C12185r(gVar));
    }

    /* renamed from: Q */
    private static int m33070Q(int i) {
        if (i == 10) {
            return 1;
        }
        if (i == 11) {
            return 2;
        }
        if (i == 20) {
            return 4;
        }
        if (i == 21) {
            return 8;
        }
        if (i == 30) {
            return 16;
        }
        if (i == 31) {
            return 32;
        }
        if (i == 40) {
            return 64;
        }
        if (i == 41) {
            return 128;
        }
        if (i == 50) {
            return 256;
        }
        if (i == 51) {
            return 512;
        }
        switch (i) {
            case C8710R.styleable.AppCompatTheme_controlBackground /*60*/:
                return 2048;
            case C8710R.styleable.AppCompatTheme_dialogCornerRadius /*61*/:
                return 4096;
            case C8710R.styleable.AppCompatTheme_dialogPreferredPadding /*62*/:
                return 8192;
            default:
                return -1;
        }
    }

    /* renamed from: R */
    private static int m33071R(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? -1 : 8;
        }
        return 4;
    }

    /* renamed from: e */
    private static void m33076e(String str, List<C5381n> list) {
        if ("audio/raw".equals(str)) {
            if (C5953m0.f29110a < 26 && C5953m0.f29111b.equals("R9") && list.size() == 1 && list.get(0).f27515a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(C5381n.m32933C("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
            }
            m33069P(list, C12187t.f45271a);
        }
        int i = C5953m0.f29110a;
        if (i < 21 && list.size() > 1) {
            String str2 = list.get(0).f27515a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                m33069P(list, C12188u.f45272a);
            }
        }
        if (i < 32 && list.size() > 1 && "OMX.qti.audio.decoder.flac".equals(list.get(0).f27515a)) {
            list.add(list.remove(0));
        }
    }

    /* renamed from: f */
    private static int m33077f(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    /* renamed from: g */
    private static int m33078g(int i) {
        switch (i) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i) {
                                            case C8710R.styleable.AppCompatTheme_colorAccent /*50*/:
                                                return 16384;
                                            case C8710R.styleable.AppCompatTheme_colorBackgroundFloating /*51*/:
                                                return 32768;
                                            case C8710R.styleable.AppCompatTheme_colorButtonNormal /*52*/:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    /* renamed from: h */
    private static int m33079h(int i) {
        if (i == 1 || i == 2) {
            return 25344;
        }
        switch (i) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case C8710R.styleable.AppCompatTheme_dividerHorizontal /*64*/:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return 9437184;
            case 131072:
            case 262144:
            case 524288:
                return 35651584;
            default:
                return -1;
        }
    }

    /* renamed from: i */
    private static int m33080i(int i) {
        if (i == 66) {
            return 1;
        }
        if (i == 77) {
            return 2;
        }
        if (i == 88) {
            return 4;
        }
        if (i == 100) {
            return 8;
        }
        if (i == 110) {
            return 16;
        }
        if (i != 122) {
            return i != 244 ? -1 : 64;
        }
        return 32;
    }

    /* renamed from: j */
    private static Integer m33081j(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 1537:
                if (str.equals("01")) {
                    c = 0;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 1;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 4;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 5;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = 8;
                    break;
                }
                break;
            case 1567:
                if (str.equals("10")) {
                    c = 9;
                    break;
                }
                break;
            case 1568:
                if (str.equals("11")) {
                    c = 10;
                    break;
                }
                break;
            case 1569:
                if (str.equals("12")) {
                    c = 11;
                    break;
                }
                break;
            case 1570:
                if (str.equals("13")) {
                    c = 12;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            default:
                return null;
        }
    }

    /* renamed from: k */
    private static Integer m33082k(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 1536:
                if (str.equals("00")) {
                    c = 0;
                    break;
                }
                break;
            case 1537:
                if (str.equals("01")) {
                    c = 1;
                    break;
                }
                break;
            case 1538:
                if (str.equals("02")) {
                    c = 2;
                    break;
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    c = 3;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    c = 4;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 5;
                    break;
                }
                break;
            case 1542:
                if (str.equals("06")) {
                    c = 6;
                    break;
                }
                break;
            case 1543:
                if (str.equals("07")) {
                    c = 7;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = 8;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    c = 9;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            default:
                return null;
        }
    }

    /* renamed from: l */
    private static Pair<Integer, Integer> m33083l(String str, String[] strArr) {
        int O;
        if (strArr.length != 3) {
            C5961r.m35215i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if ("audio/mp4a-latm".equals(C5967v.m35244h(Integer.parseInt(strArr[1], 16))) && (O = m33068O(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(O), 0);
            }
        } catch (NumberFormatException unused) {
            C5961r.m35215i("MediaCodecUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    /* renamed from: m */
    public static String m33084m(C6272r1 r1Var) {
        Pair<Integer, Integer> q;
        if ("audio/eac3-joc".equals(r1Var.f30243t)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(r1Var.f30243t) || (q = m33088q(r1Var)) == null) {
            return null;
        }
        int intValue = ((Integer) q.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r8 = r10.f29334c;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> m33085n(java.lang.String r8, java.lang.String[] r9, p167x3.C6053c r10) {
        /*
            int r0 = r9.length
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            r2 = 0
            java.lang.String r3 = "MediaCodecUtil"
            r4 = 4
            if (r0 >= r4) goto L_0x001c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            p161w3.C5961r.m35215i(r3, r8)
            return r2
        L_0x001c:
            r0 = 1
            r4 = r9[r0]     // Catch:{ NumberFormatException -> 0x00a9 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x00a9 }
            r5 = 2
            r6 = r9[r5]     // Catch:{ NumberFormatException -> 0x00a9 }
            r7 = 0
            java.lang.String r6 = r6.substring(r7, r5)     // Catch:{ NumberFormatException -> 0x00a9 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x00a9 }
            r7 = 3
            r9 = r9[r7]     // Catch:{ NumberFormatException -> 0x00a9 }
            int r8 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x00a9 }
            if (r4 == 0) goto L_0x004d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unknown AV1 profile: "
            r8.append(r9)
            r8.append(r4)
            java.lang.String r8 = r8.toString()
            p161w3.C5961r.m35215i(r3, r8)
            return r2
        L_0x004d:
            r9 = 8
            if (r8 == r9) goto L_0x006a
            r1 = 10
            if (r8 == r1) goto L_0x006a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Unknown AV1 bit depth: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            p161w3.C5961r.m35215i(r3, r8)
            return r2
        L_0x006a:
            if (r8 != r9) goto L_0x006d
            goto L_0x007f
        L_0x006d:
            if (r10 == 0) goto L_0x007e
            byte[] r8 = r10.f29335d
            if (r8 != 0) goto L_0x007b
            int r8 = r10.f29334c
            r9 = 7
            if (r8 == r9) goto L_0x007b
            r9 = 6
            if (r8 != r9) goto L_0x007e
        L_0x007b:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x007f
        L_0x007e:
            r0 = 2
        L_0x007f:
            int r8 = m33077f(r6)
            r9 = -1
            if (r8 != r9) goto L_0x009b
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Unknown AV1 level: "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            p161w3.C5961r.m35215i(r3, r8)
            return r2
        L_0x009b:
            android.util.Pair r9 = new android.util.Pair
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9.<init>(r10, r8)
            return r9
        L_0x00a9:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r1)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            p161w3.C5961r.m35215i(r3, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q2.C5386v.m33085n(java.lang.String, java.lang.String[], x3.c):android.util.Pair");
    }

    /* renamed from: o */
    private static Pair<Integer, Integer> m33086o(String str, String[] strArr) {
        int i;
        int i2;
        if (strArr.length < 2) {
            C5961r.m35215i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i2 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                i = Integer.parseInt(strArr[1].substring(4), 16);
            } else if (strArr.length >= 3) {
                int parseInt = Integer.parseInt(strArr[1]);
                i = Integer.parseInt(strArr[2]);
                i2 = parseInt;
            } else {
                C5961r.m35215i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                return null;
            }
            int i3 = m33080i(i2);
            if (i3 == -1) {
                C5961r.m35215i("MediaCodecUtil", "Unknown AVC profile: " + i2);
                return null;
            }
            int g = m33078g(i);
            if (g != -1) {
                return new Pair<>(Integer.valueOf(i3), Integer.valueOf(g));
            }
            C5961r.m35215i("MediaCodecUtil", "Unknown AVC level: " + i);
            return null;
        } catch (NumberFormatException unused) {
            C5961r.m35215i("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    /* renamed from: p */
    private static String m33087p(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        } else if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        } else {
            if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
                return "audio/x-lg-flac";
            }
            if (!str2.equals("audio/ac3") || !"OMX.lge.ac3.decoder".equals(str)) {
                return null;
            }
            return "audio/lg-ac3";
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r3.equals("av01") == false) goto L_0x002b;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> m33088q(p177z1.C6272r1 r6) {
        /*
            java.lang.String r0 = r6.f30240i
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = r6.f30243t
            java.lang.String r3 = "video/dolby-vision"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x001d
            java.lang.String r6 = r6.f30240i
            android.util.Pair r6 = m33094w(r6, r0)
            return r6
        L_0x001d:
            r2 = 0
            r3 = r0[r2]
            r3.hashCode()
            r4 = -1
            int r5 = r3.hashCode()
            switch(r5) {
                case 3004662: goto L_0x006f;
                case 3006243: goto L_0x0064;
                case 3006244: goto L_0x0059;
                case 3199032: goto L_0x004e;
                case 3214780: goto L_0x0043;
                case 3356560: goto L_0x0038;
                case 3624515: goto L_0x002d;
                default: goto L_0x002b;
            }
        L_0x002b:
            r2 = -1
            goto L_0x0078
        L_0x002d:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0036
            goto L_0x002b
        L_0x0036:
            r2 = 6
            goto L_0x0078
        L_0x0038:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0041
            goto L_0x002b
        L_0x0041:
            r2 = 5
            goto L_0x0078
        L_0x0043:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x004c
            goto L_0x002b
        L_0x004c:
            r2 = 4
            goto L_0x0078
        L_0x004e:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0057
            goto L_0x002b
        L_0x0057:
            r2 = 3
            goto L_0x0078
        L_0x0059:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x0062
            goto L_0x002b
        L_0x0062:
            r2 = 2
            goto L_0x0078
        L_0x0064:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L_0x006d
            goto L_0x002b
        L_0x006d:
            r2 = 1
            goto L_0x0078
        L_0x006f:
            java.lang.String r5 = "av01"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0078
            goto L_0x002b
        L_0x0078:
            switch(r2) {
                case 0: goto L_0x0098;
                case 1: goto L_0x0091;
                case 2: goto L_0x0091;
                case 3: goto L_0x008a;
                case 4: goto L_0x008a;
                case 5: goto L_0x0083;
                case 6: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            return r1
        L_0x007c:
            java.lang.String r6 = r6.f30240i
            android.util.Pair r6 = m33096y(r6, r0)
            return r6
        L_0x0083:
            java.lang.String r6 = r6.f30240i
            android.util.Pair r6 = m33083l(r6, r0)
            return r6
        L_0x008a:
            java.lang.String r6 = r6.f30240i
            android.util.Pair r6 = m33095x(r6, r0)
            return r6
        L_0x0091:
            java.lang.String r6 = r6.f30240i
            android.util.Pair r6 = m33086o(r6, r0)
            return r6
        L_0x0098:
            java.lang.String r1 = r6.f30240i
            x3.c r6 = r6.f30223F
            android.util.Pair r6 = m33085n(r1, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q2.C5386v.m33088q(z1.r1):android.util.Pair");
    }

    /* renamed from: r */
    public static C5381n m33089r(String str, boolean z, boolean z2) throws C5389c {
        List<C5381n> s = m33090s(str, z, z2);
        if (s.isEmpty()) {
            return null;
        }
        return s.get(0);
    }

    /* renamed from: s */
    public static synchronized List<C5381n> m33090s(String str, boolean z, boolean z2) throws C5389c {
        C5390d dVar;
        synchronized (C5386v.class) {
            C5388b bVar = new C5388b(str, z, z2);
            HashMap<C5388b, List<C5381n>> hashMap = f27604b;
            List<C5381n> list = hashMap.get(bVar);
            if (list != null) {
                return list;
            }
            int i = C5953m0.f29110a;
            if (i >= 21) {
                dVar = new C5392f(z, z2);
            } else {
                dVar = new C5391e();
            }
            ArrayList<C5381n> t = m33091t(bVar, dVar);
            if (z && t.isEmpty() && 21 <= i && i <= 23) {
                t = m33091t(bVar, new C5391e());
                if (!t.isEmpty()) {
                    C5961r.m35215i("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + t.get(0).f27515a);
                }
            }
            m33076e(str, t);
            C6685q<C5381n> t2 = C6685q.m38443t(t);
            hashMap.put(bVar, t2);
            return t2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r1.f27607b == false) goto L_0x0081;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0101 A[SYNTHETIC, Splitter:B:60:0x0101] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x012a A[SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<p120q2.C5381n> m33091t(p120q2.C5386v.C5388b r24, p120q2.C5386v.C5390d r25) throws p120q2.C5386v.C5389c {
        /*
            r1 = r24
            r2 = r25
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x014f }
            r5.<init>()     // Catch:{ Exception -> 0x014f }
            java.lang.String r15 = r1.f27606a     // Catch:{ Exception -> 0x014f }
            int r14 = r25.mo19518d()     // Catch:{ Exception -> 0x014f }
            boolean r13 = r25.mo19519e()     // Catch:{ Exception -> 0x014f }
            r0 = 0
            r12 = 0
        L_0x0019:
            if (r12 >= r14) goto L_0x014e
            android.media.MediaCodecInfo r0 = r2.mo19515a(r12)     // Catch:{ Exception -> 0x014f }
            boolean r6 = m33054A(r0)     // Catch:{ Exception -> 0x014f }
            if (r6 == 0) goto L_0x002d
        L_0x0025:
            r22 = r12
            r23 = r13
            r18 = r14
            goto L_0x0120
        L_0x002d:
            java.lang.String r11 = r0.getName()     // Catch:{ Exception -> 0x014f }
            boolean r6 = m33056C(r0, r11, r13, r15)     // Catch:{ Exception -> 0x014f }
            if (r6 != 0) goto L_0x0038
            goto L_0x0025
        L_0x0038:
            java.lang.String r10 = m33087p(r0, r11, r15)     // Catch:{ Exception -> 0x014f }
            if (r10 != 0) goto L_0x003f
            goto L_0x0025
        L_0x003f:
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r10)     // Catch:{ Exception -> 0x00ef }
            boolean r6 = r2.mo19516b(r4, r10, r9)     // Catch:{ Exception -> 0x00ef }
            boolean r7 = r2.mo19517c(r4, r10, r9)     // Catch:{ Exception -> 0x00ef }
            boolean r8 = r1.f27608c     // Catch:{ Exception -> 0x00ef }
            if (r8 != 0) goto L_0x0051
            if (r7 != 0) goto L_0x0025
        L_0x0051:
            if (r8 == 0) goto L_0x0056
            if (r6 != 0) goto L_0x0056
            goto L_0x0025
        L_0x0056:
            boolean r6 = r2.mo19516b(r3, r10, r9)     // Catch:{ Exception -> 0x00ef }
            boolean r7 = r2.mo19517c(r3, r10, r9)     // Catch:{ Exception -> 0x00ef }
            boolean r8 = r1.f27607b     // Catch:{ Exception -> 0x00ef }
            if (r8 != 0) goto L_0x0064
            if (r7 != 0) goto L_0x0025
        L_0x0064:
            if (r8 == 0) goto L_0x0069
            if (r6 != 0) goto L_0x0069
            goto L_0x0025
        L_0x0069:
            boolean r16 = m33057D(r0, r15)     // Catch:{ Exception -> 0x00ef }
            boolean r17 = m33059F(r0, r15)     // Catch:{ Exception -> 0x00ef }
            boolean r0 = m33061H(r0)     // Catch:{ Exception -> 0x00ef }
            if (r13 == 0) goto L_0x007b
            boolean r7 = r1.f27607b     // Catch:{ Exception -> 0x00ef }
            if (r7 == r6) goto L_0x0081
        L_0x007b:
            if (r13 != 0) goto L_0x00b3
            boolean r7 = r1.f27607b     // Catch:{ Exception -> 0x00a8 }
            if (r7 != 0) goto L_0x00b3
        L_0x0081:
            r18 = 0
            r19 = 0
            r6 = r11
            r7 = r15
            r8 = r10
            r20 = r10
            r10 = r16
            r21 = r11
            r11 = r17
            r22 = r12
            r12 = r0
            r23 = r13
            r13 = r18
            r18 = r14
            r14 = r19
            q2.n r0 = p120q2.C5381n.m32933C(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00a4 }
            r5.add(r0)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x0120
        L_0x00a4:
            r0 = move-exception
            r1 = r21
            goto L_0x00f9
        L_0x00a8:
            r0 = move-exception
            r20 = r10
            r22 = r12
            r23 = r13
            r18 = r14
            r1 = r11
            goto L_0x00f9
        L_0x00b3:
            r20 = r10
            r21 = r11
            r22 = r12
            r23 = r13
            r18 = r14
            if (r23 != 0) goto L_0x0120
            if (r6 == 0) goto L_0x0120
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a4 }
            r6.<init>()     // Catch:{ Exception -> 0x00a4 }
            r14 = r21
            r6.append(r14)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r7 = ".secure"
            r6.append(r7)     // Catch:{ Exception -> 0x00ec }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x00ec }
            r13 = 0
            r19 = 1
            r7 = r15
            r8 = r20
            r10 = r16
            r11 = r17
            r12 = r0
            r1 = r14
            r14 = r19
            q2.n r0 = p120q2.C5381n.m32933C(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x00ea }
            r5.add(r0)     // Catch:{ Exception -> 0x00ea }
            return r5
        L_0x00ea:
            r0 = move-exception
            goto L_0x00f9
        L_0x00ec:
            r0 = move-exception
            r1 = r14
            goto L_0x00f9
        L_0x00ef:
            r0 = move-exception
            r20 = r10
            r1 = r11
            r22 = r12
            r23 = r13
            r18 = r14
        L_0x00f9:
            int r6 = p161w3.C5953m0.f29110a     // Catch:{ Exception -> 0x014f }
            r7 = 23
            java.lang.String r8 = "MediaCodecUtil"
            if (r6 > r7) goto L_0x012a
            boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x014f }
            if (r6 != 0) goto L_0x012a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014f }
            r0.<init>()     // Catch:{ Exception -> 0x014f }
            java.lang.String r6 = "Skipping codec "
            r0.append(r6)     // Catch:{ Exception -> 0x014f }
            r0.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x014f }
            p161w3.C5961r.m35209c(r8, r0)     // Catch:{ Exception -> 0x014f }
        L_0x0120:
            int r12 = r22 + 1
            r1 = r24
            r14 = r18
            r13 = r23
            goto L_0x0019
        L_0x012a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x014f }
            r2.<init>()     // Catch:{ Exception -> 0x014f }
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch:{ Exception -> 0x014f }
            r2.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x014f }
            r1 = r20
            r2.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x014f }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x014f }
            p161w3.C5961r.m35209c(r8, r1)     // Catch:{ Exception -> 0x014f }
            throw r0     // Catch:{ Exception -> 0x014f }
        L_0x014e:
            return r5
        L_0x014f:
            r0 = move-exception
            q2.v$c r1 = new q2.v$c
            r2 = 0
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q2.C5386v.m33091t(q2.v$b, q2.v$d):java.util.ArrayList");
    }

    /* renamed from: u */
    public static List<C5381n> m33092u(List<C5381n> list, C6272r1 r1Var) {
        ArrayList arrayList = new ArrayList(list);
        m33069P(arrayList, new C12186s(r1Var));
        return arrayList;
    }

    /* renamed from: v */
    public static C5381n m33093v() throws C5389c {
        return m33089r("audio/raw", false, false);
    }

    /* renamed from: w */
    private static Pair<Integer, Integer> m33094w(String str, String[] strArr) {
        if (strArr.length < 3) {
            C5961r.m35215i("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = f27603a.matcher(strArr[1]);
        if (!matcher.matches()) {
            C5961r.m35215i("MediaCodecUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer k = m33082k(group);
        if (k == null) {
            C5961r.m35215i("MediaCodecUtil", "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer j = m33081j(str2);
        if (j != null) {
            return new Pair<>(k, j);
        }
        C5961r.m35215i("MediaCodecUtil", "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    /* renamed from: x */
    private static Pair<Integer, Integer> m33095x(String str, String[] strArr) {
        if (strArr.length < 4) {
            C5961r.m35215i("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i = 1;
        Matcher matcher = f27603a.matcher(strArr[1]);
        if (!matcher.matches()) {
            C5961r.m35215i("MediaCodecUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            if ("2".equals(group)) {
                i = 2;
            } else {
                C5961r.m35215i("MediaCodecUtil", "Unknown HEVC profile string: " + group);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer z = m33097z(str2);
        if (z != null) {
            return new Pair<>(Integer.valueOf(i), z);
        }
        C5961r.m35215i("MediaCodecUtil", "Unknown HEVC level string: " + str2);
        return null;
    }

    /* renamed from: y */
    private static Pair<Integer, Integer> m33096y(String str, String[] strArr) {
        if (strArr.length < 3) {
            C5961r.m35215i("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int R = m33071R(parseInt);
            if (R == -1) {
                C5961r.m35215i("MediaCodecUtil", "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int Q = m33070Q(parseInt2);
            if (Q != -1) {
                return new Pair<>(Integer.valueOf(R), Integer.valueOf(Q));
            }
            C5961r.m35215i("MediaCodecUtil", "Unknown VP9 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            C5961r.m35215i("MediaCodecUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    /* renamed from: z */
    private static Integer m33097z(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 70821:
                if (str.equals("H30")) {
                    c = 0;
                    break;
                }
                break;
            case 70914:
                if (str.equals("H60")) {
                    c = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    c = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c = 7;
                    break;
                }
                break;
            case 74851:
                if (str.equals("L90")) {
                    c = 8;
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c = 9;
                    break;
                }
                break;
            case 2193639:
                if (str.equals("H120")) {
                    c = 10;
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    c = 12;
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c = 13;
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    c = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    c = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    c = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    c = 25;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 8;
            case 2:
                return 32;
            case 3:
                return 128;
            case 4:
                return 512;
            case 5:
                return 1;
            case 6:
                return 4;
            case 7:
                return 16;
            case 8:
                return 64;
            case 9:
                return 256;
            case 10:
                return 2048;
            case 11:
                return 8192;
            case 12:
                return 32768;
            case 13:
                return 131072;
            case 14:
                return 524288;
            case 15:
                return 2097152;
            case 16:
                return 8388608;
            case 17:
                return 33554432;
            case 18:
                return 1024;
            case 19:
                return 4096;
            case 20:
                return 16384;
            case 21:
                return 65536;
            case 22:
                return 262144;
            case 23:
                return 1048576;
            case 24:
                return 4194304;
            case 25:
                return 16777216;
            default:
                return null;
        }
    }
}
