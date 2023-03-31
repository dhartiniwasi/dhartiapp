package p142t3;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p079k3.C4864b;
import p107o3.C5215a;
import p107o3.C5216b;
import p107o3.C5217c;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;

/* renamed from: t3.f */
/* compiled from: WebvttCueParser */
public final class C5516f {

    /* renamed from: a */
    public static final Pattern f28013a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    private static final Pattern f28014b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    private static final Map<String, Integer> f28015c;

    /* renamed from: d */
    private static final Map<String, Integer> f28016d;

    /* renamed from: t3.f$b */
    /* compiled from: WebvttCueParser */
    private static class C5518b {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public static final Comparator<C5518b> f28017c = C12533g.f46029a;
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C5519c f28018a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final int f28019b;

        private C5518b(C5519c cVar, int i) {
            this.f28018a = cVar;
            this.f28019b = i;
        }
    }

    /* renamed from: t3.f$c */
    /* compiled from: WebvttCueParser */
    private static final class C5519c {

        /* renamed from: a */
        public final String f28020a;

        /* renamed from: b */
        public final int f28021b;

        /* renamed from: c */
        public final String f28022c;

        /* renamed from: d */
        public final Set<String> f28023d;

        private C5519c(String str, int i, String str2, Set<String> set) {
            this.f28021b = i;
            this.f28020a = str;
            this.f28022c = str2;
            this.f28023d = set;
        }

        /* renamed from: a */
        public static C5519c m33559a(String str, int i) {
            String str2;
            String trim = str.trim();
            C5917a.m34868a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] Q0 = C5953m0.m35101Q0(trim, "\\.");
            String str3 = Q0[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < Q0.length; i2++) {
                hashSet.add(Q0[i2]);
            }
            return new C5519c(str3, i, str2, hashSet);
        }

        /* renamed from: b */
        public static C5519c m33560b() {
            return new C5519c("", 0, "", Collections.emptySet());
        }
    }

    /* renamed from: t3.f$d */
    /* compiled from: WebvttCueParser */
    private static final class C5520d implements Comparable<C5520d> {

        /* renamed from: a */
        public final int f28024a;

        /* renamed from: b */
        public final C5514d f28025b;

        public C5520d(int i, C5514d dVar) {
            this.f28024a = i;
            this.f28025b = dVar;
        }

        /* renamed from: a */
        public int compareTo(C5520d dVar) {
            return Integer.compare(this.f28024a, dVar.f28024a);
        }
    }

    /* renamed from: t3.f$e */
    /* compiled from: WebvttCueParser */
    private static final class C5521e {

        /* renamed from: a */
        public long f28026a = 0;

        /* renamed from: b */
        public long f28027b = 0;

        /* renamed from: c */
        public CharSequence f28028c;

        /* renamed from: d */
        public int f28029d = 2;

        /* renamed from: e */
        public float f28030e = -3.4028235E38f;

        /* renamed from: f */
        public int f28031f = 1;

        /* renamed from: g */
        public int f28032g = 0;

        /* renamed from: h */
        public float f28033h = -3.4028235E38f;

        /* renamed from: i */
        public int f28034i = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: j */
        public float f28035j = 1.0f;

        /* renamed from: k */
        public int f28036k = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: b */
        private static float m33562b(float f, int i) {
            int i2 = (f > -3.4028235E38f ? 1 : (f == -3.4028235E38f ? 0 : -1));
            if (i2 == 0 || i != 0 || (f >= 0.0f && f <= 1.0f)) {
                return i2 != 0 ? f : i == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        /* renamed from: c */
        private static Layout.Alignment m33563c(int i) {
            if (i != 1) {
                if (i == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            C5961r.m35215i("WebvttCueParser", "Unknown textAlignment: " + i);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        /* renamed from: d */
        private static float m33564d(int i, float f) {
            if (i == 0) {
                return 1.0f - f;
            }
            if (i == 1) {
                return f <= 0.5f ? f * 2.0f : (1.0f - f) * 2.0f;
            }
            if (i == 2) {
                return f;
            }
            throw new IllegalStateException(String.valueOf(i));
        }

        /* renamed from: e */
        private static float m33565e(int i) {
            if (i != 4) {
                return i != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        /* renamed from: f */
        private static int m33566f(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 3) {
                return 2;
            }
            if (i != 4) {
                return i != 5 ? 1 : 2;
            }
            return 0;
        }

        /* renamed from: a */
        public C5515e mo19822a() {
            return new C5515e(mo19823g().mo18624a(), this.f28026a, this.f28027b);
        }

        /* renamed from: g */
        public C4864b.C4866b mo19823g() {
            float f = this.f28033h;
            if (f == -3.4028235E38f) {
                f = m33565e(this.f28029d);
            }
            int i = this.f28034i;
            if (i == Integer.MIN_VALUE) {
                i = m33566f(this.f28029d);
            }
            C4864b.C4866b r = new C4864b.C4866b().mo18639p(m33563c(this.f28029d)).mo18631h(m33562b(this.f28030e, this.f28031f), this.f28031f).mo18632i(this.f28032g).mo18634k(f).mo18635l(i).mo18637n(Math.min(this.f28035j, m33564d(i, f))).mo18641r(this.f28036k);
            CharSequence charSequence = this.f28028c;
            if (charSequence != null) {
                r.mo18638o(charSequence);
            }
            return r;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f28015c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f28016d = Collections.unmodifiableMap(hashMap2);
    }

    /* renamed from: a */
    private static void m33531a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        for (String next : set) {
            Map<String, Integer> map = f28015c;
            if (map.containsKey(next)) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(next).intValue()), i, i2, 33);
            } else {
                Map<String, Integer> map2 = f28016d;
                if (map2.containsKey(next)) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(next).intValue()), i, i2, 33);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m33532b(String str, SpannableStringBuilder spannableStringBuilder) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3309:
                if (str.equals("gt")) {
                    c = 0;
                    break;
                }
                break;
            case 3464:
                if (str.equals("lt")) {
                    c = 1;
                    break;
                }
                break;
            case 96708:
                if (str.equals("amp")) {
                    c = 2;
                    break;
                }
                break;
            case 3374865:
                if (str.equals("nbsp")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                spannableStringBuilder.append('>');
                return;
            case 1:
                spannableStringBuilder.append('<');
                return;
            case 2:
                spannableStringBuilder.append('&');
                return;
            case 3:
                spannableStringBuilder.append(' ');
                return;
            default:
                C5961r.m35215i("WebvttCueParser", "ignoring unsupported entity: '&" + str + ";'");
                return;
        }
    }

    /* renamed from: c */
    private static void m33533c(SpannableStringBuilder spannableStringBuilder, String str, C5519c cVar, List<C5518b> list, List<C5514d> list2) {
        int i = m33539i(list2, str, cVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, C5518b.f28017c);
        int i2 = cVar.f28021b;
        int i3 = 0;
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if ("rt".equals(((C5518b) arrayList.get(i4)).f28018a.f28020a)) {
                C5518b bVar = (C5518b) arrayList.get(i4);
                int g = m33537g(m33539i(list2, str, bVar.f28018a), i, 1);
                int i5 = bVar.f28018a.f28021b - i3;
                int d = bVar.f28019b - i3;
                CharSequence subSequence = spannableStringBuilder.subSequence(i5, d);
                spannableStringBuilder.delete(i5, d);
                spannableStringBuilder.setSpan(new C5216b(subSequence.toString(), g), i2, i5, 33);
                i3 += subSequence.length();
                i2 = i5;
            }
        }
    }

    /* renamed from: d */
    private static void m33534d(String str, C5519c cVar, List<C5518b> list, SpannableStringBuilder spannableStringBuilder, List<C5514d> list2) {
        int i = cVar.f28021b;
        int length = spannableStringBuilder.length();
        String str2 = cVar.f28020a;
        str2.hashCode();
        char c = 65535;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c = 0;
                    break;
                }
                break;
            case C8710R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /*98*/:
                if (str2.equals("b")) {
                    c = 1;
                    break;
                }
                break;
            case C8710R.styleable.AppCompatTheme_spinnerDropDownItemStyle /*99*/:
                if (str2.equals("c")) {
                    c = 2;
                    break;
                }
                break;
            case C8710R.styleable.AppCompatTheme_textAppearanceListItemSmall /*105*/:
                if (str2.equals("i")) {
                    c = 3;
                    break;
                }
                break;
            case 117:
                if (str2.equals("u")) {
                    c = 4;
                    break;
                }
                break;
            case 118:
                if (str2.equals("v")) {
                    c = 5;
                    break;
                }
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c = 6;
                    break;
                }
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case 2:
                m33531a(spannableStringBuilder, cVar.f28023d, i, length);
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case 7:
                m33533c(spannableStringBuilder, str, cVar, list, list2);
                break;
            default:
                return;
        }
        List<C5520d> h = m33538h(list2, str, cVar);
        for (int i2 = 0; i2 < h.size(); i2++) {
            m33535e(spannableStringBuilder, h.get(i2).f28025b, i, length);
        }
    }

    /* renamed from: e */
    private static void m33535e(SpannableStringBuilder spannableStringBuilder, C5514d dVar, int i, int i2) {
        if (dVar != null) {
            if (dVar.mo19802i() != -1) {
                C5217c.m32383a(spannableStringBuilder, new StyleSpan(dVar.mo19802i()), i, i2, 33);
            }
            if (dVar.mo19805l()) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
            }
            if (dVar.mo19806m()) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
            }
            if (dVar.mo19804k()) {
                C5217c.m32383a(spannableStringBuilder, new ForegroundColorSpan(dVar.mo19796c()), i, i2, 33);
            }
            if (dVar.mo19803j()) {
                C5217c.m32383a(spannableStringBuilder, new BackgroundColorSpan(dVar.mo19794a()), i, i2, 33);
            }
            if (dVar.mo19797d() != null) {
                C5217c.m32383a(spannableStringBuilder, new TypefaceSpan(dVar.mo19797d()), i, i2, 33);
            }
            int f = dVar.mo19799f();
            if (f == 1) {
                C5217c.m32383a(spannableStringBuilder, new AbsoluteSizeSpan((int) dVar.mo19798e(), true), i, i2, 33);
            } else if (f == 2) {
                C5217c.m32383a(spannableStringBuilder, new RelativeSizeSpan(dVar.mo19798e()), i, i2, 33);
            } else if (f == 3) {
                C5217c.m32383a(spannableStringBuilder, new RelativeSizeSpan(dVar.mo19798e() / 100.0f), i, i2, 33);
            }
            if (dVar.mo19795b()) {
                spannableStringBuilder.setSpan(new C5215a(), i, i2, 33);
            }
        }
    }

    /* renamed from: f */
    private static int m33536f(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    /* renamed from: g */
    private static int m33537g(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    private static List<C5520d> m33538h(List<C5514d> list, String str, C5519c cVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C5514d dVar = list.get(i);
            int h = dVar.mo19801h(str, cVar.f28020a, cVar.f28023d, cVar.f28022c);
            if (h > 0) {
                arrayList.add(new C5520d(h, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: i */
    private static int m33539i(List<C5514d> list, String str, C5519c cVar) {
        List<C5520d> h = m33538h(list, str, cVar);
        for (int i = 0; i < h.size(); i++) {
            C5514d dVar = h.get(i).f28025b;
            if (dVar.mo19800g() != -1) {
                return dVar.mo19800g();
            }
        }
        return -1;
    }

    /* renamed from: j */
    private static String m33540j(String str) {
        String trim = str.trim();
        C5917a.m34868a(!trim.isEmpty());
        return C5953m0.m35103R0(trim, "[ \\.]")[0];
    }

    /* renamed from: k */
    private static boolean m33541k(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case C8710R.styleable.AppCompatTheme_selectableItemBackgroundBorderless /*98*/:
                if (str.equals("b")) {
                    c = 0;
                    break;
                }
                break;
            case C8710R.styleable.AppCompatTheme_spinnerDropDownItemStyle /*99*/:
                if (str.equals("c")) {
                    c = 1;
                    break;
                }
                break;
            case C8710R.styleable.AppCompatTheme_textAppearanceListItemSmall /*105*/:
                if (str.equals("i")) {
                    c = 2;
                    break;
                }
                break;
            case 117:
                if (str.equals("u")) {
                    c = 3;
                    break;
                }
                break;
            case 118:
                if (str.equals("v")) {
                    c = 4;
                    break;
                }
                break;
            case 3650:
                if (str.equals("rt")) {
                    c = 5;
                    break;
                }
                break;
            case 3314158:
                if (str.equals("lang")) {
                    c = 6;
                    break;
                }
                break;
            case 3511770:
                if (str.equals("ruby")) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: l */
    static C4864b m33542l(CharSequence charSequence) {
        C5521e eVar = new C5521e();
        eVar.f28028c = charSequence;
        return eVar.mo19823g().mo18624a();
    }

    /* renamed from: m */
    private static C5515e m33543m(String str, Matcher matcher, C5918a0 a0Var, List<C5514d> list) {
        C5521e eVar = new C5521e();
        try {
            eVar.f28026a = C5523i.m33575d((String) C5917a.m34872e(matcher.group(1)));
            eVar.f28027b = C5523i.m33575d((String) C5917a.m34872e(matcher.group(2)));
            m33546p((String) C5917a.m34872e(matcher.group(3)), eVar);
            StringBuilder sb = new StringBuilder();
            String o = a0Var.mo20562o();
            while (!TextUtils.isEmpty(o)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(o.trim());
                o = a0Var.mo20562o();
            }
            eVar.f28028c = m33547q(str, sb.toString(), list);
            return eVar.mo19822a();
        } catch (NumberFormatException unused) {
            C5961r.m35215i("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* renamed from: n */
    public static C5515e m33544n(C5918a0 a0Var, List<C5514d> list) {
        String o = a0Var.mo20562o();
        if (o == null) {
            return null;
        }
        Pattern pattern = f28013a;
        Matcher matcher = pattern.matcher(o);
        if (matcher.matches()) {
            return m33543m((String) null, matcher, a0Var, list);
        }
        String o2 = a0Var.mo20562o();
        if (o2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(o2);
        if (matcher2.matches()) {
            return m33543m(o.trim(), matcher2, a0Var, list);
        }
        return null;
    }

    /* renamed from: o */
    static C4864b.C4866b m33545o(String str) {
        C5521e eVar = new C5521e();
        m33546p(str, eVar);
        return eVar.mo19823g();
    }

    /* renamed from: p */
    private static void m33546p(String str, C5521e eVar) {
        Matcher matcher = f28014b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) C5917a.m34872e(matcher.group(1));
            String str3 = (String) C5917a.m34872e(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    m33549s(str3, eVar);
                } else if ("align".equals(str2)) {
                    eVar.f28029d = m33552v(str3);
                } else if ("position".equals(str2)) {
                    m33551u(str3, eVar);
                } else if ("size".equals(str2)) {
                    eVar.f28035j = C5523i.m33574c(str3);
                } else if ("vertical".equals(str2)) {
                    eVar.f28036k = m33553w(str3);
                } else {
                    C5961r.m35215i("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                C5961r.m35215i("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* renamed from: q */
    static SpannedString m33547q(String str, String str2, List<C5514d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    m33532b(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    int i3 = 1;
                    boolean z = str2.charAt(i2) == '/';
                    i2 = m33536f(str2, i2);
                    int i4 = i2 - 2;
                    boolean z2 = str2.charAt(i4) == '/';
                    if (z) {
                        i3 = 2;
                    }
                    int i5 = i + i3;
                    if (!z2) {
                        i4 = i2 - 1;
                    }
                    String substring = str2.substring(i5, i4);
                    if (!substring.trim().isEmpty()) {
                        String j = m33540j(substring);
                        if (m33541k(j)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    C5519c cVar = (C5519c) arrayDeque.pop();
                                    m33534d(str, cVar, arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new C5518b(cVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (cVar.f28020a.equals(j)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(C5519c.m33559a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            m33534d(str, (C5519c) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        m33534d(str, C5519c.m33560b(), Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* renamed from: r */
    private static int m33548r(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 2;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 0;
            default:
                C5961r.m35215i("WebvttCueParser", "Invalid anchor value: " + str);
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* renamed from: s */
    private static void m33549s(String str, C5521e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f28032g = m33548r(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            eVar.f28030e = C5523i.m33574c(str);
            eVar.f28031f = 0;
            return;
        }
        eVar.f28030e = (float) Integer.parseInt(str);
        eVar.f28031f = 1;
    }

    /* renamed from: t */
    private static int m33550t(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1842484672:
                if (str.equals("line-left")) {
                    c = 0;
                    break;
                }
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 1;
                    break;
                }
                break;
            case -1276788989:
                if (str.equals("line-right")) {
                    c = 2;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 3;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 5:
                return 0;
            case 1:
            case 3:
                return 1;
            case 2:
            case 4:
                return 2;
            default:
                C5961r.m35215i("WebvttCueParser", "Invalid anchor value: " + str);
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    /* renamed from: u */
    private static void m33551u(String str, C5521e eVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            eVar.f28034i = m33550t(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        eVar.f28033h = C5523i.m33574c(str);
    }

    /* renamed from: v */
    private static int m33552v(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -1074341483:
                if (str.equals("middle")) {
                    c = 1;
                    break;
                }
                break;
            case 100571:
                if (str.equals("end")) {
                    c = 2;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 3;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 4;
                    break;
                }
                break;
            case 109757538:
                if (str.equals("start")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 1;
            default:
                C5961r.m35215i("WebvttCueParser", "Invalid alignment value: " + str);
                return 2;
        }
    }

    /* renamed from: w */
    private static int m33553w(String str) {
        str.hashCode();
        if (str.equals("lr")) {
            return 2;
        }
        if (str.equals("rl")) {
            return 1;
        }
        C5961r.m35215i("WebvttCueParser", "Invalid 'vertical' value: " + str);
        return RecyclerView.UNDEFINED_DURATION;
    }
}
