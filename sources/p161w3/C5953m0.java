package p161w3;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Display;
import com.facebook.ads.AdError;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p177z1.C6249m2;
import p177z1.C6272r1;
import p177z1.C6282u2;
import p182a7.C6408b;
import p182a7.C6415d;

/* renamed from: w3.m0 */
/* compiled from: Util */
public final class C5953m0 {

    /* renamed from: a */
    public static final int f29110a;

    /* renamed from: b */
    public static final String f29111b;

    /* renamed from: c */
    public static final String f29112c;

    /* renamed from: d */
    public static final String f29113d;

    /* renamed from: e */
    public static final String f29114e;

    /* renamed from: f */
    public static final byte[] f29115f = new byte[0];

    /* renamed from: g */
    private static final Pattern f29116g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");

    /* renamed from: h */
    private static final Pattern f29117h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");

    /* renamed from: i */
    private static final Pattern f29118i = Pattern.compile("%([A-Fa-f0-9]{2})");

    /* renamed from: j */
    private static final Pattern f29119j = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);

    /* renamed from: k */
    private static HashMap<String, String> f29120k;

    /* renamed from: l */
    private static final String[] f29121l = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};

    /* renamed from: m */
    private static final String[] f29122m = {"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};

    /* renamed from: n */
    private static final int[] f29123n = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};

    /* renamed from: o */
    private static final int[] f29124o = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, C8710R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 119, 126, 121, C8710R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, C8710R.styleable.AppCompatTheme_textAppearanceSearchResultSubtitle, 98, C8710R.styleable.AppCompatTheme_switchStyle, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, C8710R.styleable.AppCompatTheme_textColorSearchUrl, C8710R.styleable.AppCompatTheme_textAppearanceListItemSecondary, 97, C8710R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, C8710R.styleable.AppCompatTheme_tooltipFrameBackground, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, C8710R.styleable.AppCompatTheme_textAppearanceListItemSmall, C8710R.styleable.AppCompatTheme_textColorAlertDialogListItem, C8710R.styleable.AppCompatTheme_textAppearanceListItem, 96, 117, C8710R.styleable.AppCompatTheme_tooltipForegroundColor, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, C8710R.styleable.AppCompatTheme_toolbarStyle, 120, 127, C8710R.styleable.AppCompatTheme_textAppearancePopupMenuHeader, C8710R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};

    static {
        int i = Build.VERSION.SDK_INT;
        f29110a = i;
        String str = Build.DEVICE;
        f29111b = str;
        String str2 = Build.MANUFACTURER;
        f29112c = str2;
        String str3 = Build.MODEL;
        f29113d = str3;
        f29114e = str + ", " + str3 + ", " + str2 + ", " + i;
    }

    /* renamed from: A */
    private static HashMap<String, String> m35068A() {
        String[] iSOLanguages = Locale.getISOLanguages();
        HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + f29121l.length);
        int i = 0;
        for (String str : iSOLanguages) {
            try {
                String iSO3Language = new Locale(str).getISO3Language();
                if (!TextUtils.isEmpty(iSO3Language)) {
                    hashMap.put(iSO3Language, str);
                }
            } catch (MissingResourceException unused) {
            }
        }
        while (true) {
            String[] strArr = f29121l;
            if (i >= strArr.length) {
                return hashMap;
            }
            hashMap.put(strArr[i], strArr[i + 1]);
            i += 2;
        }
    }

    /* renamed from: A0 */
    public static <T> void m35069A0(List<T> list, int i, int i2, int i3) {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (int i4 = (i2 - i) - 1; i4 >= 0; i4--) {
            arrayDeque.addFirst(list.remove(i + i4));
        }
        list.addAll(Math.min(i3, list.size()), arrayDeque);
    }

    /* renamed from: B */
    public static Uri m35070B(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        Matcher matcher = f29119j.matcher(path);
        return (!matcher.matches() || matcher.group(1) != null) ? uri : Uri.withAppendedPath(uri, "Manifest");
    }

    /* renamed from: B0 */
    public static long m35071B0(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    /* renamed from: C */
    public static String m35072C(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: C0 */
    public static ExecutorService m35073C0(String str) {
        return Executors.newSingleThreadExecutor(new C12903l0(str));
    }

    /* renamed from: D */
    public static String m35074D(byte[] bArr) {
        return new String(bArr, C6415d.f30664c);
    }

    /* renamed from: D0 */
    public static String m35075D0(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String e = C6408b.m37506e(str);
        String str2 = m35103R0(e, "-")[0];
        if (f29120k == null) {
            f29120k = m35068A();
        }
        String str3 = f29120k.get(str2);
        if (str3 != null) {
            e = str3 + e.substring(str2.length());
            str2 = str3;
        }
        return ("no".equals(str2) || "i".equals(str2) || "zh".equals(str2)) ? m35171z0(e) : e;
    }

    /* renamed from: E */
    public static String m35076E(byte[] bArr, int i, int i2) {
        return new String(bArr, i, i2, C6415d.f30664c);
    }

    /* renamed from: E0 */
    public static <T> T[] m35077E0(T[] tArr, T t) {
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length + 1);
        copyOf[tArr.length] = t;
        return m35140k(copyOf);
    }

    /* renamed from: F */
    public static int m35078F(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager == null) {
            return -1;
        }
        return audioManager.generateAudioSessionId();
    }

    /* renamed from: F0 */
    public static <T> T[] m35079F0(T[] tArr, T[] tArr2) {
        T[] copyOf = Arrays.copyOf(tArr, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, copyOf, tArr.length, tArr2.length);
        return copyOf;
    }

    /* renamed from: G */
    public static int m35080G(int i) {
        if (i != 12) {
            switch (i) {
                case 1:
                    return 4;
                case 2:
                    return 12;
                case 3:
                    return 28;
                case 4:
                    return 204;
                case 5:
                    return 220;
                case 6:
                    return 252;
                case 7:
                    return 1276;
                case 8:
                    int i2 = f29110a;
                    return (i2 < 23 && i2 < 21) ? 0 : 6396;
                default:
                    return 0;
            }
        } else if (f29110a >= 32) {
            return 743676;
        } else {
            return 0;
        }
    }

    /* renamed from: G0 */
    public static <T> T[] m35081G0(T[] tArr, int i) {
        C5917a.m34868a(i <= tArr.length);
        return Arrays.copyOf(tArr, i);
    }

    /* renamed from: H */
    public static C6282u2.C6284b m35082H(C6282u2 u2Var, C6282u2.C6284b bVar) {
        boolean d = u2Var.mo21174d();
        boolean t = u2Var.mo21246t();
        boolean m = u2Var.mo21244m();
        boolean y = u2Var.mo21249y();
        boolean G = u2Var.mo21239G();
        boolean B = u2Var.mo21238B();
        boolean u = u2Var.mo21156D().mo21451u();
        boolean z = false;
        C6282u2.C6284b.C6285a d2 = new C6282u2.C6284b.C6285a().mo21547b(bVar).mo21549d(4, !d).mo21549d(5, t && !d).mo21549d(6, m && !d).mo21549d(7, !u && (m || !G || t) && !d).mo21549d(8, y && !d).mo21549d(9, !u && (y || (G && B)) && !d).mo21549d(10, !d).mo21549d(11, t && !d);
        if (t && !d) {
            z = true;
        }
        return d2.mo21549d(12, z).mo21550e();
    }

    /* renamed from: H0 */
    public static <T> T[] m35083H0(T[] tArr, int i, int i2) {
        boolean z = true;
        C5917a.m34868a(i >= 0);
        if (i2 > tArr.length) {
            z = false;
        }
        C5917a.m34868a(z);
        return Arrays.copyOfRange(tArr, i, i2);
    }

    /* renamed from: I */
    public static int m35084I(ByteBuffer byteBuffer, int i) {
        int i2 = byteBuffer.getInt(i);
        return byteBuffer.order() == ByteOrder.BIG_ENDIAN ? i2 : Integer.reverseBytes(i2);
    }

    /* renamed from: I0 */
    public static long m35085I0(String str) throws C6249m2 {
        Matcher matcher = f29116g.matcher(str);
        if (matcher.matches()) {
            int i = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i = (Integer.parseInt(matcher.group(12)) * 60) + Integer.parseInt(matcher.group(13));
                if ("-".equals(matcher.group(11))) {
                    i *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return i != 0 ? timeInMillis - (((long) i) * 60000) : timeInMillis;
        }
        throw C6249m2.m36661a("Invalid date/time format: " + str, (Throwable) null);
    }

    /* renamed from: J */
    public static byte[] m35086J(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    /* renamed from: J0 */
    public static long m35087J0(String str) {
        Matcher matcher = f29117h.matcher(str);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(str) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d = 0.0d;
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        if (group6 != null) {
            d = Double.parseDouble(group6);
        }
        long j = (long) ((parseDouble5 + d) * 1000.0d);
        return isEmpty ? -j : j;
    }

    /* renamed from: K */
    public static int m35088K(String str, int i) {
        int i2 = 0;
        for (String m : m35105S0(str)) {
            if (i == C5967v.m35249m(m)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: K0 */
    public static boolean m35089K0(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return false;
        }
        if (handler.getLooper() != Looper.myLooper()) {
            return handler.post(runnable);
        }
        runnable.run();
        return true;
    }

    /* renamed from: L */
    public static String m35090L(String str, int i) {
        String[] S0 = m35105S0(str);
        if (S0.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : S0) {
            if (i == C5967v.m35249m(str2)) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* renamed from: L0 */
    public static boolean m35091L0(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* renamed from: M */
    public static String m35092M(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < objArr.length; i++) {
            sb.append(objArr[i].getClass().getSimpleName());
            if (i < objArr.length - 1) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    /* renamed from: M0 */
    public static <T> void m35093M0(List<T> list, int i, int i2) {
        if (i < 0 || i2 > list.size() || i > i2) {
            throw new IllegalArgumentException();
        } else if (i != i2) {
            list.subList(i, i2).clear();
        }
    }

    /* renamed from: N */
    public static String m35094N(Context context) {
        TelephonyManager telephonyManager;
        if (!(context == null || (telephonyManager = (TelephonyManager) context.getSystemService("phone")) == null)) {
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                return C6408b.m37507f(networkCountryIso);
            }
        }
        return C6408b.m37507f(Locale.getDefault().getCountry());
    }

    /* renamed from: N0 */
    public static long m35095N0(long j, long j2, long j3) {
        int i = (j3 > j2 ? 1 : (j3 == j2 ? 0 : -1));
        if (i >= 0 && j3 % j2 == 0) {
            return j / (j3 / j2);
        }
        if (i < 0 && j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (((double) j) * (((double) j2) / ((double) j3)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = (android.hardware.display.DisplayManager) r2.getSystemService("display");
     */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point m35096O(android.content.Context r2) {
        /*
            int r0 = f29110a
            r1 = 17
            if (r0 < r1) goto L_0x0016
            java.lang.String r0 = "display"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            if (r0 == 0) goto L_0x0016
            r1 = 0
            android.view.Display r0 = r0.getDisplay(r1)
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "window"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            java.lang.Object r0 = p161w3.C5917a.m34872e(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
        L_0x002b:
            android.graphics.Point r2 = m35098P(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p161w3.C5953m0.m35096O(android.content.Context):android.graphics.Point");
    }

    /* renamed from: O0 */
    public static long[] m35097O0(List<Long> list, long j, long j2) {
        int size = list.size();
        long[] jArr = new long[size];
        int i = 0;
        int i2 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        if (i2 >= 0 && j2 % j == 0) {
            long j3 = j2 / j;
            while (i < size) {
                jArr[i] = list.get(i).longValue() / j3;
                i++;
            }
        } else if (i2 >= 0 || j % j2 != 0) {
            double d = ((double) j) / ((double) j2);
            while (i < size) {
                jArr[i] = (long) (((double) list.get(i).longValue()) * d);
                i++;
            }
        } else {
            long j4 = j / j2;
            while (i < size) {
                jArr[i] = list.get(i).longValue() * j4;
                i++;
            }
        }
        return jArr;
    }

    /* renamed from: P */
    public static Point m35098P(Context context, Display display) {
        String str;
        if (display.getDisplayId() == 0 && m35165w0(context)) {
            if (f29110a < 28) {
                str = m35139j0("sys.display-size");
            } else {
                str = m35139j0("vendor.display-size");
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String[] Q0 = m35101Q0(str.trim(), "x");
                    if (Q0.length == 2) {
                        int parseInt = Integer.parseInt(Q0[0]);
                        int parseInt2 = Integer.parseInt(Q0[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                C5961r.m35209c("Util", "Invalid display size: " + str);
            }
            if ("Sony".equals(f29112c) && f29113d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        int i = f29110a;
        if (i >= 23) {
            m35106T(display, point);
        } else if (i >= 17) {
            m35104S(display, point);
        } else {
            m35102R(display, point);
        }
        return point;
    }

    /* renamed from: P0 */
    public static void m35099P0(long[] jArr, long j, long j2) {
        int i = 0;
        int i2 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        if (i2 >= 0 && j2 % j == 0) {
            long j3 = j2 / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] / j3;
                i++;
            }
        } else if (i2 >= 0 || j % j2 != 0) {
            double d = ((double) j) / ((double) j2);
            while (i < jArr.length) {
                jArr[i] = (long) (((double) jArr[i]) * d);
                i++;
            }
        } else {
            long j4 = j / j2;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j4;
                i++;
            }
        }
    }

    /* renamed from: Q */
    public static Looper m35100Q() {
        Looper myLooper = Looper.myLooper();
        return myLooper != null ? myLooper : Looper.getMainLooper();
    }

    /* renamed from: Q0 */
    public static String[] m35101Q0(String str, String str2) {
        return str.split(str2, -1);
    }

    /* renamed from: R */
    private static void m35102R(Display display, Point point) {
        display.getSize(point);
    }

    /* renamed from: R0 */
    public static String[] m35103R0(String str, String str2) {
        return str.split(str2, 2);
    }

    /* renamed from: S */
    private static void m35104S(Display display, Point point) {
        display.getRealSize(point);
    }

    /* renamed from: S0 */
    public static String[] m35105S0(String str) {
        if (TextUtils.isEmpty(str)) {
            return new String[0];
        }
        return m35101Q0(str.trim(), "(\\s*,\\s*)");
    }

    /* renamed from: T */
    private static void m35106T(Display display, Point point) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    /* renamed from: T0 */
    public static long m35107T0(long j, long j2, long j3) {
        long j4 = j - j2;
        return ((j ^ j4) & (j2 ^ j)) < 0 ? j3 : j4;
    }

    /* renamed from: U */
    public static int m35108U(int i) {
        if (i == 2 || i == 4) {
            return 6005;
        }
        if (i == 10) {
            return 6004;
        }
        if (i == 7) {
            return 6005;
        }
        if (i == 8) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        switch (i) {
            case 15:
                return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
            case 16:
            case 18:
                return 6005;
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
                return 6004;
            default:
                switch (i) {
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                        return AdError.ICONVIEW_MISSING_ERROR_CODE;
                    default:
                        return 6006;
                }
        }
    }

    /* renamed from: U0 */
    public static byte[] m35109U0(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[4096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: V */
    public static int m35110V(String str) {
        String[] Q0;
        int length;
        if (str == null || (length = Q0.length) < 2) {
            return 0;
        }
        String str2 = (Q0 = m35101Q0(str, "_"))[length - 1];
        boolean z = length >= 3 && "neg".equals(Q0[length - 2]);
        try {
            int parseInt = Integer.parseInt((String) C5917a.m34872e(str2));
            return z ? -parseInt : parseInt;
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: V0 */
    public static long m35111V0(int i, int i2) {
        return m35113W0(i2) | (m35113W0(i) << 32);
    }

    /* renamed from: W */
    public static String m35112W(int i) {
        if (i == 0) {
            return "NO";
        }
        if (i == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (i == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (i == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (i == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }

    /* renamed from: W0 */
    public static long m35113W0(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: X */
    public static String m35114X(Locale locale) {
        return f29110a >= 21 ? m35116Y(locale) : locale.toString();
    }

    /* renamed from: X0 */
    public static CharSequence m35115X0(CharSequence charSequence, int i) {
        return charSequence.length() <= i ? charSequence : charSequence.subSequence(0, i);
    }

    /* renamed from: Y */
    private static String m35116Y(Locale locale) {
        return locale.toLanguageTag();
    }

    /* renamed from: Y0 */
    public static long m35117Y0(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }

    /* renamed from: Z */
    public static long m35118Z(long j, float f) {
        return f == 1.0f ? j : Math.round(((double) j) * ((double) f));
    }

    /* renamed from: Z0 */
    public static void m35119Z0(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a0 */
    public static long m35121a0(long j) {
        if (j == -9223372036854775807L) {
            return System.currentTimeMillis();
        }
        return j + SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public static long m35122b(long j, long j2, long j3) {
        long j4 = j + j2;
        return ((j ^ j4) & (j2 ^ j4)) < 0 ? j3 : j4;
    }

    /* renamed from: b0 */
    public static int m35123b0(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i != 24) {
            return i != 32 ? 0 : 805306368;
        }
        return 536870912;
    }

    /* renamed from: c */
    public static boolean m35124c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: c0 */
    public static C6272r1 m35125c0(int i, int i2, int i3) {
        return new C6272r1.C6274b().mo21517e0("audio/raw").mo21494H(i2).mo21518f0(i3).mo21511Y(i).mo21491E();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends java.lang.Comparable<? super T>> int m35126d(java.util.List<? extends java.lang.Comparable<? super T>> r3, T r4, boolean r5, boolean r6) {
        /*
            int r0 = java.util.Collections.binarySearch(r3, r4)
            if (r0 >= 0) goto L_0x0008
            int r4 = ~r0
            goto L_0x0023
        L_0x0008:
            int r1 = r3.size()
        L_0x000c:
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x001d
            java.lang.Object r2 = r3.get(r0)
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r2.compareTo(r4)
            if (r2 != 0) goto L_0x001d
            goto L_0x000c
        L_0x001d:
            if (r5 == 0) goto L_0x0022
            int r4 = r0 + -1
            goto L_0x0023
        L_0x0022:
            r4 = r0
        L_0x0023:
            if (r6 == 0) goto L_0x002f
            int r3 = r3.size()
            int r3 = r3 + -1
            int r4 = java.lang.Math.min(r3, r4)
        L_0x002f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p161w3.C5953m0.m35126d(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    /* renamed from: d0 */
    public static int m35127d0(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i2 * 3;
                    }
                    if (i != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m35128e(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x0008
            int r5 = ~r0
            goto L_0x001a
        L_0x0008:
            int r0 = r0 + 1
            int r1 = r4.length
            if (r0 >= r1) goto L_0x0014
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0014
            goto L_0x0008
        L_0x0014:
            if (r7 == 0) goto L_0x0019
            int r5 = r0 + -1
            goto L_0x001a
        L_0x0019:
            r5 = r0
        L_0x001a:
            if (r8 == 0) goto L_0x0023
            int r4 = r4.length
            int r4 = r4 + -1
            int r5 = java.lang.Math.min(r4, r5)
        L_0x0023:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p161w3.C5953m0.m35128e(long[], long, boolean, boolean):int");
    }

    /* renamed from: e0 */
    public static long m35129e0(long j, float f) {
        return f == 1.0f ? j : Math.round(((double) j) / ((double) f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T extends java.lang.Comparable<? super T>> int m35130f(java.util.List<? extends java.lang.Comparable<? super T>> r2, T r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Collections.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0021
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x001b
            java.lang.Object r1 = r2.get(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r1 = r1.compareTo(r3)
            if (r1 != 0) goto L_0x001b
            goto L_0x000a
        L_0x001b:
            if (r4 == 0) goto L_0x0020
            int r2 = r0 + 1
            goto L_0x0021
        L_0x0020:
            r2 = r0
        L_0x0021:
            if (r5 == 0) goto L_0x0028
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p161w3.C5953m0.m35130f(java.util.List, java.lang.Comparable, boolean, boolean):int");
    }

    /* renamed from: f0 */
    public static int m35131f0(int i) {
        if (i == 13) {
            return 1;
        }
        switch (i) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* renamed from: g */
    public static int m35132g(C5964s sVar, long j, boolean z, boolean z2) {
        int i;
        int c = sVar.mo20662c() - 1;
        int i2 = 0;
        while (i2 <= c) {
            int i3 = (i2 + c) >>> 1;
            if (sVar.mo20661b(i3) < j) {
                i2 = i3 + 1;
            } else {
                c = i3 - 1;
            }
        }
        if (z && (i = c + 1) < sVar.mo20662c() && sVar.mo20661b(i) == j) {
            return i;
        }
        if (!z2 || c != -1) {
            return c;
        }
        return 0;
    }

    /* renamed from: g0 */
    public static String[] m35133g0() {
        String[] h0 = m35135h0();
        for (int i = 0; i < h0.length; i++) {
            h0[i] = m35075D0(h0[i]);
        }
        return h0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m35134h(int[] r2, int r3, boolean r4, boolean r5) {
        /*
            int r0 = java.util.Arrays.binarySearch(r2, r3)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r2 = -r0
            goto L_0x0019
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0013
            r1 = r2[r0]
            if (r1 != r3) goto L_0x0013
            goto L_0x000a
        L_0x0013:
            if (r4 == 0) goto L_0x0018
            int r2 = r0 + 1
            goto L_0x0019
        L_0x0018:
            r2 = r0
        L_0x0019:
            if (r5 == 0) goto L_0x0020
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
        L_0x0020:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p161w3.C5953m0.m35134h(int[], int, boolean, boolean):int");
    }

    /* renamed from: h0 */
    private static String[] m35135h0() {
        Configuration configuration = Resources.getSystem().getConfiguration();
        if (f29110a >= 24) {
            return m35137i0(configuration);
        }
        return new String[]{m35114X(configuration.locale)};
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m35136i(long[] r4, long r5, boolean r7, boolean r8) {
        /*
            int r0 = java.util.Arrays.binarySearch(r4, r5)
            if (r0 >= 0) goto L_0x000a
            int r0 = r0 + 2
            int r4 = -r0
            goto L_0x001b
        L_0x000a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x0015
            r1 = r4[r0]
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0015
            goto L_0x000a
        L_0x0015:
            if (r7 == 0) goto L_0x001a
            int r4 = r0 + 1
            goto L_0x001b
        L_0x001a:
            r4 = r0
        L_0x001b:
            if (r8 == 0) goto L_0x0022
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
        L_0x0022:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p161w3.C5953m0.m35136i(long[], long, boolean, boolean):int");
    }

    /* renamed from: i0 */
    private static String[] m35137i0(Configuration configuration) {
        return m35101Q0(configuration.getLocales().toLanguageTags(), ",");
    }

    /* renamed from: j */
    public static <T> T m35138j(T t) {
        return t;
    }

    /* renamed from: j0 */
    private static String m35139j0(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class}).invoke(cls, new Object[]{str});
        } catch (Exception e) {
            C5961r.m35210d("Util", "Failed to read system property " + str, e);
            return null;
        }
    }

    /* renamed from: k */
    public static <T> T[] m35140k(T[] tArr) {
        return tArr;
    }

    /* renamed from: k0 */
    public static String m35141k0(int i) {
        switch (i) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                if (i < 10000) {
                    return "?";
                }
                return "custom (" + i + ")";
        }
    }

    /* renamed from: l */
    public static int m35142l(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    /* renamed from: l0 */
    public static String m35143l0(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        return str + "/" + str2 + " (Linux;Android " + Build.VERSION.RELEASE + ") " + "ExoPlayerLib/2.18.1";
    }

    /* renamed from: m */
    public static long m35144m(long j, long j2) {
        return ((j + j2) - 1) / j2;
    }

    /* renamed from: m0 */
    public static byte[] m35145m0(String str) {
        return str.getBytes(C6415d.f30664c);
    }

    /* renamed from: n */
    public static void m35146n(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: n0 */
    public static int m35147n0(Uri uri) {
        int o0;
        String scheme = uri.getScheme();
        if (scheme != null && C6408b.m37502a("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int lastIndexOf = lastPathSegment.lastIndexOf(46);
        if (lastIndexOf >= 0 && (o0 = m35149o0(lastPathSegment.substring(lastIndexOf + 1))) != 4) {
            return o0;
        }
        Matcher matcher = f29119j.matcher((CharSequence) C5917a.m34872e(uri.getPath()));
        if (!matcher.matches()) {
            return 4;
        }
        String group = matcher.group(2);
        if (group != null) {
            if (group.contains("format=mpd-time-csf")) {
                return 0;
            }
            if (group.contains("format=m3u8-aapl")) {
                return 2;
            }
        }
        return 1;
    }

    /* renamed from: o */
    public static int m35148o(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i == 0 ? 0 : 1;
    }

    /* renamed from: o0 */
    public static int m35149o0(String str) {
        String e = C6408b.m37506e(str);
        e.hashCode();
        char c = 65535;
        switch (e.hashCode()) {
            case 104579:
                if (e.equals("ism")) {
                    c = 0;
                    break;
                }
                break;
            case 108321:
                if (e.equals("mpd")) {
                    c = 1;
                    break;
                }
                break;
            case 3242057:
                if (e.equals("isml")) {
                    c = 2;
                    break;
                }
                break;
            case 3299913:
                if (e.equals("m3u8")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 2:
                return 1;
            case 1:
                return 0;
            case 3:
                return 2;
            default:
                return 4;
        }
    }

    /* renamed from: p */
    public static float m35150p(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f, f3));
    }

    /* renamed from: p0 */
    public static int m35151p0(Uri uri, String str) {
        if (str == null) {
            return m35147n0(uri);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -979127466:
                if (str.equals("application/x-mpegURL")) {
                    c = 0;
                    break;
                }
                break;
            case -156749520:
                if (str.equals("application/vnd.ms-sstr+xml")) {
                    c = 1;
                    break;
                }
                break;
            case 64194685:
                if (str.equals("application/dash+xml")) {
                    c = 2;
                    break;
                }
                break;
            case 1154777587:
                if (str.equals("application/x-rtsp")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 2;
            case 1:
                return 1;
            case 2:
                return 0;
            case 3:
                return 3;
            default:
                return 4;
        }
    }

    /* renamed from: q */
    public static int m35152q(int i, int i2, int i3) {
        return Math.max(i2, Math.min(i, i3));
    }

    /* renamed from: q0 */
    public static boolean m35153q0(C5918a0 a0Var, C5918a0 a0Var2, Inflater inflater) {
        if (a0Var.mo20548a() <= 0) {
            return false;
        }
        if (a0Var2.mo20549b() < a0Var.mo20548a()) {
            a0Var2.mo20550c(a0Var.mo20548a() * 2);
        }
        if (inflater == null) {
            inflater = new Inflater();
        }
        inflater.setInput(a0Var.mo20551d(), a0Var.mo20552e(), a0Var.mo20548a());
        int i = 0;
        while (true) {
            try {
                i += inflater.inflate(a0Var2.mo20551d(), i, a0Var2.mo20549b() - i);
                if (inflater.finished()) {
                    a0Var2.mo20545N(i);
                    inflater.reset();
                    return true;
                } else if (inflater.needsDictionary()) {
                    break;
                } else if (inflater.needsInput()) {
                    break;
                } else if (i == a0Var2.mo20549b()) {
                    a0Var2.mo20550c(a0Var2.mo20549b() * 2);
                }
            } catch (DataFormatException unused) {
                return false;
            } finally {
                inflater.reset();
            }
        }
        return false;
    }

    /* renamed from: r */
    public static long m35154r(long j, long j2, long j3) {
        return Math.max(j2, Math.min(j, j3));
    }

    /* renamed from: r0 */
    public static boolean m35155r0(Context context) {
        return f29110a >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive");
    }

    /* renamed from: s */
    public static boolean m35156s(Object[] objArr, Object obj) {
        for (Object c : objArr) {
            if (m35124c(c, obj)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s0 */
    public static boolean m35157s0(int i) {
        return i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: t */
    public static int m35158t(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f29123n[((i3 >>> 24) ^ (bArr[i] & 255)) & 255] ^ (i3 << 8);
            i++;
        }
        return i3;
    }

    /* renamed from: t0 */
    public static boolean m35159t0(int i) {
        return i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4;
    }

    /* renamed from: u */
    public static int m35160u(byte[] bArr, int i, int i2, int i3) {
        while (i < i2) {
            i3 = f29124o[i3 ^ (bArr[i] & 255)];
            i++;
        }
        return i3;
    }

    /* renamed from: u0 */
    public static boolean m35161u0(int i) {
        return i == 10 || i == 13;
    }

    /* renamed from: v */
    public static Handler m35162v(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    /* renamed from: v0 */
    public static boolean m35163v0(Uri uri) {
        String scheme = uri.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* renamed from: w */
    public static Handler m35164w() {
        return m35166x((Handler.Callback) null);
    }

    /* renamed from: w0 */
    public static boolean m35165w0(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    /* renamed from: x */
    public static Handler m35166x(Handler.Callback callback) {
        return m35162v((Looper) C5917a.m34875h(Looper.myLooper()), callback);
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public static /* synthetic */ Thread m35167x0(String str, Runnable runnable) {
        return new Thread(runnable, str);
    }

    /* renamed from: y */
    public static Handler m35168y() {
        return m35170z((Handler.Callback) null);
    }

    /* renamed from: y0 */
    public static int m35169y0(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: z */
    public static Handler m35170z(Handler.Callback callback) {
        return m35162v(m35100Q(), callback);
    }

    /* renamed from: z0 */
    private static String m35171z0(String str) {
        int i = 0;
        while (true) {
            String[] strArr = f29122m;
            if (i >= strArr.length) {
                return str;
            }
            if (str.startsWith(strArr[i])) {
                return strArr[i + 1] + str.substring(strArr[i].length());
            }
            i += 2;
        }
    }
}
