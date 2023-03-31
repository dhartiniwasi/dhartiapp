package p161w3;

import android.text.TextUtils;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p182a7.C6408b;

/* renamed from: w3.v */
/* compiled from: MimeTypes */
public final class C5967v {

    /* renamed from: a */
    private static final ArrayList<C5968a> f29143a = new ArrayList<>();

    /* renamed from: b */
    private static final Pattern f29144b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    /* renamed from: w3.v$a */
    /* compiled from: MimeTypes */
    private static final class C5968a {

        /* renamed from: a */
        public final String f29145a;

        /* renamed from: b */
        public final String f29146b;

        /* renamed from: c */
        public final int f29147c;
    }

    /* renamed from: w3.v$b */
    /* compiled from: MimeTypes */
    static final class C5969b {

        /* renamed from: a */
        public final int f29148a;

        /* renamed from: b */
        public final int f29149b;

        public C5969b(int i, int i2) {
            this.f29148a = i;
            this.f29149b = i2;
        }

        /* renamed from: a */
        public int mo20664a() {
            int i = this.f29149b;
            if (i == 2) {
                return 10;
            }
            if (i == 5) {
                return 11;
            }
            if (i == 29) {
                return 12;
            }
            if (i == 42) {
                return 16;
            }
            if (i != 22) {
                return i != 23 ? 0 : 15;
            }
            return 1073741824;
        }
    }

    /* renamed from: a */
    public static boolean m35237a(String str, String str2) {
        C5969b i;
        int a;
        if (str == null) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 1;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 4;
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = 5;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 6;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 8;
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = 9;
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = 10;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return true;
            case 3:
                if (str2 == null || (i = m35245i(str2)) == null || (a = i.mo20664a()) == 0 || a == 16) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public static boolean m35238b(String str, String str2) {
        return m35240d(str, str2) != null;
    }

    /* renamed from: c */
    public static String m35239c(String str) {
        if (str == null) {
            return null;
        }
        for (String g : C5953m0.m35105S0(str)) {
            String g2 = m35243g(g);
            if (g2 != null && m35251o(g2)) {
                return g2;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String m35240d(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] S0 = C5953m0.m35105S0(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : S0) {
            if (str2.equals(m35243g(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: e */
    private static String m35241e(String str) {
        int size = f29143a.size();
        for (int i = 0; i < size; i++) {
            C5968a aVar = f29143a.get(i);
            if (str.startsWith(aVar.f29146b)) {
                return aVar.f29145a;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static int m35242f(String str, String str2) {
        C5969b i;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 1;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 2;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 3;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 4;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 5;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 6;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 7;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 7;
            case 2:
                if (str2 == null || (i = m35245i(str2)) == null) {
                    return 0;
                }
                return i.mo20664a();
            case 3:
                return 5;
            case 4:
                return 17;
            case 5:
                return 6;
            case 6:
                return 9;
            case 7:
                return 8;
            case 8:
                return 14;
            default:
                return 0;
        }
    }

    /* renamed from: g */
    public static String m35243g(String str) {
        C5969b i;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String e = C6408b.m37506e(str.trim());
        if (e.startsWith("avc1") || e.startsWith("avc3")) {
            return "video/avc";
        }
        if (e.startsWith("hev1") || e.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (e.startsWith("dvav") || e.startsWith("dva1") || e.startsWith("dvhe") || e.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (e.startsWith("av01")) {
            return "video/av01";
        }
        if (e.startsWith("vp9") || e.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (e.startsWith("vp8") || e.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (e.startsWith("mp4a")) {
            if (e.startsWith("mp4a.") && (i = m35245i(e)) != null) {
                str2 = m35244h(i.f29148a);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (e.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (e.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (e.startsWith("ac-3") || e.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (e.startsWith("ec-3") || e.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (e.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (e.startsWith("ac-4") || e.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (e.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (e.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (e.startsWith("dtsh") || e.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (e.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (e.startsWith("opus")) {
                return "audio/opus";
            }
            if (e.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (e.startsWith("flac")) {
                return "audio/flac";
            }
            if (e.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (e.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (e.contains("cea708")) {
                return "application/cea-708";
            }
            return (e.contains("eia608") || e.contains("cea608")) ? "application/cea-608" : m35241e(e);
        }
    }

    /* renamed from: h */
    public static String m35244h(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case C8710R.styleable.AppCompatTheme_seekBarStyle /*96*/:
            case C8710R.styleable.AppCompatTheme_selectableItemBackground /*97*/:
            case C8710R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /*98*/:
            case C8710R.styleable.AppCompatTheme_spinnerDropDownItemStyle /*99*/:
            case 100:
            case C8710R.styleable.AppCompatTheme_switchStyle /*101*/:
                return "video/mpeg2";
            case C8710R.styleable.AppCompatTheme_textAppearanceLargePopupMenu /*102*/:
            case C8710R.styleable.AppCompatTheme_textAppearanceListItem /*103*/:
            case C8710R.styleable.AppCompatTheme_textAppearanceListItemSecondary /*104*/:
                return "audio/mp4a-latm";
            case C8710R.styleable.AppCompatTheme_textAppearanceListItemSmall /*105*/:
            case C8710R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle /*107*/:
                return "audio/mpeg";
            case C8710R.styleable.AppCompatTheme_textAppearancePopupMenuHeader /*106*/:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* renamed from: i */
    static C5969b m35245i(String str) {
        Matcher matcher = f29144b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String str2 = (String) C5917a.m34872e(matcher.group(1));
        String group = matcher.group(2);
        int i = 0;
        try {
            int parseInt = Integer.parseInt(str2, 16);
            if (group != null) {
                i = Integer.parseInt(group);
            }
            return new C5969b(parseInt, i);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: j */
    private static String m35246j(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    /* renamed from: k */
    public static int m35247k(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (m35251o(str)) {
            return 1;
        }
        if (m35255s(str)) {
            return 2;
        }
        if (m35254r(str)) {
            return 3;
        }
        if (m35252p(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        return m35248l(str);
    }

    /* renamed from: l */
    private static int m35248l(String str) {
        int size = f29143a.size();
        for (int i = 0; i < size; i++) {
            C5968a aVar = f29143a.get(i);
            if (str.equals(aVar.f29145a)) {
                return aVar.f29147c;
            }
        }
        return -1;
    }

    /* renamed from: m */
    public static int m35249m(String str) {
        return m35247k(m35243g(str));
    }

    /* renamed from: n */
    public static String m35250n(String str) {
        if (str == null) {
            return null;
        }
        for (String g : C5953m0.m35105S0(str)) {
            String g2 = m35243g(g);
            if (g2 != null && m35255s(g2)) {
                return g2;
            }
        }
        return null;
    }

    /* renamed from: o */
    public static boolean m35251o(String str) {
        return "audio".equals(m35246j(str));
    }

    /* renamed from: p */
    public static boolean m35252p(String str) {
        return "image".equals(m35246j(str));
    }

    /* renamed from: q */
    public static boolean m35253q(String str) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska")) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    public static boolean m35254r(String str) {
        return "text".equals(m35246j(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    /* renamed from: s */
    public static boolean m35255s(String str) {
        return "video".equals(m35246j(str));
    }

    /* renamed from: t */
    public static String m35256t(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1007807498:
                if (str.equals("audio/x-flac")) {
                    c = 0;
                    break;
                }
                break;
            case -586683234:
                if (str.equals("audio/x-wav")) {
                    c = 1;
                    break;
                }
                break;
            case 187090231:
                if (str.equals("audio/mp3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "audio/flac";
            case 1:
                return "audio/wav";
            case 2:
                return "audio/mpeg";
            default:
                return str;
        }
    }
}
