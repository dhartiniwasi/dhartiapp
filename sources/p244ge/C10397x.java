package p244ge;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p253he.C10543e;
import p336qe.C12231c;

/* renamed from: ge.x */
/* compiled from: HttpUrl */
public final class C10397x {

    /* renamed from: j */
    private static final char[] f41304j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    final String f41305a;

    /* renamed from: b */
    private final String f41306b;

    /* renamed from: c */
    private final String f41307c;

    /* renamed from: d */
    final String f41308d;

    /* renamed from: e */
    final int f41309e;

    /* renamed from: f */
    private final List<String> f41310f;

    /* renamed from: g */
    private final List<String> f41311g;

    /* renamed from: h */
    private final String f41312h;

    /* renamed from: i */
    private final String f41313i;

    /* renamed from: ge.x$a */
    /* compiled from: HttpUrl */
    public static final class C10398a {

        /* renamed from: a */
        String f41314a;

        /* renamed from: b */
        String f41315b = "";

        /* renamed from: c */
        String f41316c = "";

        /* renamed from: d */
        String f41317d;

        /* renamed from: e */
        int f41318e = -1;

        /* renamed from: f */
        final List<String> f41319f;

        /* renamed from: g */
        List<String> f41320g;

        /* renamed from: h */
        String f41321h;

        public C10398a() {
            ArrayList arrayList = new ArrayList();
            this.f41319f = arrayList;
            arrayList.add("");
        }

        /* renamed from: b */
        private static String m52534b(String str, int i, int i2) {
            return C10543e.m53042c(C10397x.m52512r(str, i, i2, false));
        }

        /* renamed from: f */
        private boolean m52535f(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        /* renamed from: g */
        private boolean m52536g(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        /* renamed from: i */
        private static int m52537i(String str, int i, int i2) {
            try {
                int parseInt = Integer.parseInt(C10397x.m52505a(str, i, i2, "", false, false, false, true, (Charset) null));
                if (parseInt <= 0 || parseInt > 65535) {
                    return -1;
                }
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }

        /* renamed from: k */
        private void m52538k() {
            List<String> list = this.f41319f;
            if (!list.remove(list.size() - 1).isEmpty() || this.f41319f.isEmpty()) {
                this.f41319f.add("");
                return;
            }
            List<String> list2 = this.f41319f;
            list2.set(list2.size() - 1, "");
        }

        /* renamed from: m */
        private static int m52539m(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } while (str.charAt(i) == ']');
                }
                i++;
            }
            return i2;
        }

        /* renamed from: n */
        private void m52540n(String str, int i, int i2, boolean z, boolean z2) {
            String a = C10397x.m52505a(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, (Charset) null);
            if (!m52535f(a)) {
                if (m52536g(a)) {
                    m52538k();
                    return;
                }
                List<String> list = this.f41319f;
                if (list.get(list.size() - 1).isEmpty()) {
                    List<String> list2 = this.f41319f;
                    list2.set(list2.size() - 1, a);
                } else {
                    this.f41319f.add(a);
                }
                if (z) {
                    this.f41319f.add("");
                }
            }
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        /* renamed from: p */
        private void m52541p(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f41319f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f41319f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f41319f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = p253he.C10543e.m53053n(r11, r6, r13, r12)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m52540n(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p244ge.C10397x.C10398a.m52541p(java.lang.String, int, int):void");
        }

        /* renamed from: r */
        private static int m52542r(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if ((charAt2 < 'a' || charAt2 > 'z') && ((charAt2 < 'A' || charAt2 > 'Z') && !((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        if (charAt2 == ':') {
                            return i;
                        }
                    }
                }
            }
            return -1;
        }

        /* renamed from: s */
        private static int m52543s(String str, int i, int i2) {
            int i3 = 0;
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i3++;
                i++;
            }
            return i3;
        }

        /* renamed from: a */
        public C10397x mo33435a() {
            if (this.f41314a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.f41317d != null) {
                return new C10397x(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo33436c() {
            int i = this.f41318e;
            return i != -1 ? i : C10397x.m52508d(this.f41314a);
        }

        /* renamed from: d */
        public C10398a mo33437d(String str) {
            this.f41320g = str != null ? C10397x.m52517y(C10397x.m52506b(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        /* renamed from: e */
        public C10398a mo33438e(String str) {
            Objects.requireNonNull(str, "host == null");
            String b = m52534b(str, 0, str.length());
            if (b != null) {
                this.f41317d = b;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C10398a mo33439h(C10397x xVar, String str) {
            int n;
            int i;
            C10397x xVar2 = xVar;
            String str2 = str;
            int F = C10543e.m53033F(str2, 0, str.length());
            int G = C10543e.m53034G(str2, F, str.length());
            int r = m52542r(str2, F, G);
            if (r != -1) {
                if (str.regionMatches(true, F, "https:", 0, 6)) {
                    this.f41314a = "https";
                    F += 6;
                } else if (str.regionMatches(true, F, "http:", 0, 5)) {
                    this.f41314a = "http";
                    F += 5;
                } else {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str2.substring(0, r) + "'");
                }
            } else if (xVar2 != null) {
                this.f41314a = xVar2.f41305a;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int s = m52543s(str2, F, G);
            char c = '?';
            char c2 = '#';
            if (s >= 2 || xVar2 == null || !xVar2.f41305a.equals(this.f41314a)) {
                int i2 = F + s;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    n = C10543e.m53053n(str2, i2, G, "@/\\?#");
                    char charAt = n != G ? str2.charAt(n) : 65535;
                    if (charAt == 65535 || charAt == c2 || charAt == '/' || charAt == '\\' || charAt == c) {
                        int i3 = n;
                        int m = m52539m(str2, i2, i3);
                        int i4 = m + 1;
                    } else {
                        if (charAt == '@') {
                            if (!z) {
                                int m2 = C10543e.m53052m(str2, i2, n, ':');
                                int i5 = m2;
                                String str3 = "%40";
                                i = n;
                                String a = C10397x.m52505a(str, i2, m2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                if (z2) {
                                    a = this.f41315b + str3 + a;
                                }
                                this.f41315b = a;
                                if (i5 != i) {
                                    this.f41316c = C10397x.m52505a(str, i5 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                                    z = true;
                                }
                                z2 = true;
                            } else {
                                i = n;
                                this.f41316c += "%40" + C10397x.m52505a(str, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, (Charset) null);
                            }
                            i2 = i + 1;
                        }
                        c = '?';
                        c2 = '#';
                    }
                }
                int i32 = n;
                int m3 = m52539m(str2, i2, i32);
                int i42 = m3 + 1;
                if (i42 < i32) {
                    this.f41317d = m52534b(str2, i2, m3);
                    int i6 = m52537i(str2, i42, i32);
                    this.f41318e = i6;
                    if (i6 == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i42, i32) + '\"');
                    }
                } else {
                    this.f41317d = m52534b(str2, i2, m3);
                    this.f41318e = C10397x.m52508d(this.f41314a);
                }
                if (this.f41317d != null) {
                    F = i32;
                } else {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i2, m3) + '\"');
                }
            } else {
                this.f41315b = xVar.mo33426j();
                this.f41316c = xVar.mo33421f();
                this.f41317d = xVar2.f41308d;
                this.f41318e = xVar2.f41309e;
                this.f41319f.clear();
                this.f41319f.addAll(xVar.mo33423h());
                if (F == G || str2.charAt(F) == '#') {
                    mo33437d(xVar.mo33425i());
                }
            }
            int n2 = C10543e.m53053n(str2, F, G, "?#");
            m52541p(str2, F, n2);
            if (n2 < G && str2.charAt(n2) == '?') {
                int m4 = C10543e.m53052m(str2, n2, G, '#');
                this.f41320g = C10397x.m52517y(C10397x.m52505a(str, n2 + 1, m4, " \"'<>#", true, false, true, true, (Charset) null));
                n2 = m4;
            }
            if (n2 < G && str2.charAt(n2) == '#') {
                this.f41321h = C10397x.m52505a(str, 1 + n2, G, "", true, false, false, false, (Charset) null);
            }
            return this;
        }

        /* renamed from: j */
        public C10398a mo33440j(String str) {
            Objects.requireNonNull(str, "password == null");
            this.f41316c = C10397x.m52506b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        /* renamed from: l */
        public C10398a mo33441l(int i) {
            if (i <= 0 || i > 65535) {
                throw new IllegalArgumentException("unexpected port: " + i);
            }
            this.f41318e = i;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public C10398a mo33442o() {
            int size = this.f41319f.size();
            for (int i = 0; i < size; i++) {
                this.f41319f.set(i, C10397x.m52506b(this.f41319f.get(i), "[]", true, true, false, true));
            }
            List<String> list = this.f41320g;
            if (list != null) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str = this.f41320g.get(i2);
                    if (str != null) {
                        this.f41320g.set(i2, C10397x.m52506b(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.f41321h;
            if (str2 != null) {
                this.f41321h = C10397x.m52506b(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        /* renamed from: q */
        public C10398a mo33443q(String str) {
            Objects.requireNonNull(str, "scheme == null");
            if (str.equalsIgnoreCase("http")) {
                this.f41314a = "http";
            } else if (str.equalsIgnoreCase("https")) {
                this.f41314a = "https";
            } else {
                throw new IllegalArgumentException("unexpected scheme: " + str);
            }
            return this;
        }

        /* renamed from: t */
        public C10398a mo33444t(String str) {
            Objects.requireNonNull(str, "username == null");
            this.f41315b = C10397x.m52506b(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f41314a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f41315b.isEmpty() || !this.f41316c.isEmpty()) {
                sb.append(this.f41315b);
                if (!this.f41316c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.f41316c);
                }
                sb.append('@');
            }
            String str2 = this.f41317d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.f41317d);
                    sb.append(']');
                } else {
                    sb.append(this.f41317d);
                }
            }
            if (!(this.f41318e == -1 && this.f41314a == null)) {
                int c = mo33436c();
                String str3 = this.f41314a;
                if (str3 == null || c != C10397x.m52508d(str3)) {
                    sb.append(':');
                    sb.append(c);
                }
            }
            C10397x.m52511q(sb, this.f41319f);
            if (this.f41320g != null) {
                sb.append('?');
                C10397x.m52510n(sb, this.f41320g);
            }
            if (this.f41321h != null) {
                sb.append('#');
                sb.append(this.f41321h);
            }
            return sb.toString();
        }
    }

    C10397x(C10398a aVar) {
        this.f41305a = aVar.f41314a;
        this.f41306b = m52513s(aVar.f41315b, false);
        this.f41307c = m52513s(aVar.f41316c, false);
        this.f41308d = aVar.f41317d;
        this.f41309e = aVar.mo33436c();
        this.f41310f = m52514t(aVar.f41319f, false);
        List<String> list = aVar.f41320g;
        String str = null;
        this.f41311g = list != null ? m52514t(list, true) : null;
        String str2 = aVar.f41321h;
        this.f41312h = str2 != null ? m52513s(str2, false) : str;
        this.f41313i = aVar.toString();
    }

    /* renamed from: a */
    static String m52505a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        String str3 = str;
        int i3 = i2;
        int i4 = i;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt < 32 || codePointAt == 127 || (codePointAt >= 128 && z4)) {
                String str4 = str2;
            } else {
                String str5 = str2;
                if (str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || m52516v(str, i4, i2)))) && (codePointAt != 43 || !z3))) {
                    i4 += Character.charCount(codePointAt);
                }
            }
            C12231c cVar = new C12231c();
            int i5 = i;
            cVar.mo36824y0(str, i, i4);
            m52507c(cVar, str, i4, i2, str2, z, z2, z3, z4, charset);
            return cVar.mo36766F();
        }
        int i6 = i;
        return str.substring(i, i2);
    }

    /* renamed from: b */
    static String m52506b(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return m52505a(str, 0, str.length(), str2, z, z2, z3, z4, (Charset) null);
    }

    /* renamed from: c */
    static void m52507c(C12231c cVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        C12231c cVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt == 43 && z3) {
                    cVar.mo36821w0(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !m52516v(str, i, i2)))))) {
                    if (cVar2 == null) {
                        cVar2 = new C12231c();
                    }
                    if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                        cVar2.mo36763B0(codePointAt);
                    } else {
                        cVar2.mo36809r0(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!cVar2.mo36784Z()) {
                        byte readByte = cVar2.readByte() & 255;
                        cVar.mo36787a0(37);
                        char[] cArr = f41304j;
                        cVar.mo36787a0(cArr[(readByte >> 4) & 15]);
                        cVar.mo36787a0(cArr[readByte & 15]);
                    }
                } else {
                    cVar.mo36763B0(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: d */
    public static int m52508d(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: k */
    public static C10397x m52509k(String str) {
        return new C10398a().mo33439h((C10397x) null, str).mo33435a();
    }

    /* renamed from: n */
    static void m52510n(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    /* renamed from: q */
    static void m52511q(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    /* renamed from: r */
    static String m52512r(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                C12231c cVar = new C12231c();
                cVar.mo36824y0(str, i, i3);
                m52515u(cVar, str, i3, i2, z);
                return cVar.mo36766F();
            }
        }
        return str.substring(i, i2);
    }

    /* renamed from: s */
    static String m52513s(String str, boolean z) {
        return m52512r(str, 0, str.length(), z);
    }

    /* renamed from: t */
    private List<String> m52514t(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? m52513s(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: u */
    static void m52515u(C12231c cVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int j = C10543e.m53049j(str.charAt(i + 1));
                int j2 = C10543e.m53049j(str.charAt(i3));
                if (!(j == -1 || j2 == -1)) {
                    cVar.mo36787a0((j << 4) + j2);
                    i = i3;
                    i += Character.charCount(codePointAt);
                }
            } else if (codePointAt == 43 && z) {
                cVar.mo36787a0(32);
                i += Character.charCount(codePointAt);
            }
            cVar.mo36763B0(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: v */
    static boolean m52516v(String str, int i, int i2) {
        int i3 = i + 2;
        if (i3 >= i2 || str.charAt(i) != '%' || C10543e.m53049j(str.charAt(i + 1)) == -1 || C10543e.m53049j(str.charAt(i3)) == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    static List<String> m52517y(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    /* renamed from: A */
    public C10397x mo33416A(String str) {
        C10398a p = mo33430p(str);
        if (p != null) {
            return p.mo33435a();
        }
        return null;
    }

    /* renamed from: B */
    public String mo33417B() {
        return this.f41305a;
    }

    /* renamed from: C */
    public URI mo33418C() {
        String aVar = mo33429o().mo33442o().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                return URI.create(aVar.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: e */
    public String mo33419e() {
        if (this.f41312h == null) {
            return null;
        }
        return this.f41313i.substring(this.f41313i.indexOf(35) + 1);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10397x) && ((C10397x) obj).f41313i.equals(this.f41313i);
    }

    /* renamed from: f */
    public String mo33421f() {
        if (this.f41307c.isEmpty()) {
            return "";
        }
        int indexOf = this.f41313i.indexOf(64);
        return this.f41313i.substring(this.f41313i.indexOf(58, this.f41305a.length() + 3) + 1, indexOf);
    }

    /* renamed from: g */
    public String mo33422g() {
        int indexOf = this.f41313i.indexOf(47, this.f41305a.length() + 3);
        String str = this.f41313i;
        return this.f41313i.substring(indexOf, C10543e.m53053n(str, indexOf, str.length(), "?#"));
    }

    /* renamed from: h */
    public List<String> mo33423h() {
        int indexOf = this.f41313i.indexOf(47, this.f41305a.length() + 3);
        String str = this.f41313i;
        int n = C10543e.m53053n(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < n) {
            int i = indexOf + 1;
            int m = C10543e.m53052m(this.f41313i, i, n, '/');
            arrayList.add(this.f41313i.substring(i, m));
            indexOf = m;
        }
        return arrayList;
    }

    public int hashCode() {
        return this.f41313i.hashCode();
    }

    /* renamed from: i */
    public String mo33425i() {
        if (this.f41311g == null) {
            return null;
        }
        int indexOf = this.f41313i.indexOf(63) + 1;
        String str = this.f41313i;
        return this.f41313i.substring(indexOf, C10543e.m53052m(str, indexOf, str.length(), '#'));
    }

    /* renamed from: j */
    public String mo33426j() {
        if (this.f41306b.isEmpty()) {
            return "";
        }
        int length = this.f41305a.length() + 3;
        String str = this.f41313i;
        return this.f41313i.substring(length, C10543e.m53053n(str, length, str.length(), ":@"));
    }

    /* renamed from: l */
    public String mo33427l() {
        return this.f41308d;
    }

    /* renamed from: m */
    public boolean mo33428m() {
        return this.f41305a.equals("https");
    }

    /* renamed from: o */
    public C10398a mo33429o() {
        C10398a aVar = new C10398a();
        aVar.f41314a = this.f41305a;
        aVar.f41315b = mo33426j();
        aVar.f41316c = mo33421f();
        aVar.f41317d = this.f41308d;
        aVar.f41318e = this.f41309e != m52508d(this.f41305a) ? this.f41309e : -1;
        aVar.f41319f.clear();
        aVar.f41319f.addAll(mo33423h());
        aVar.mo33437d(mo33425i());
        aVar.f41321h = mo33419e();
        return aVar;
    }

    /* renamed from: p */
    public C10398a mo33430p(String str) {
        try {
            return new C10398a().mo33439h(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public String toString() {
        return this.f41313i;
    }

    /* renamed from: w */
    public int mo33432w() {
        return this.f41309e;
    }

    /* renamed from: x */
    public String mo33433x() {
        if (this.f41311g == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        m52510n(sb, this.f41311g);
        return sb.toString();
    }

    /* renamed from: z */
    public String mo33434z() {
        return mo33430p("/...").mo33444t("").mo33440j("").mo33435a().toString();
    }
}
