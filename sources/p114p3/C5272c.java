package p114p3;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p161w3.C5917a;
import p161w3.C5953m0;
import p161w3.C5961r;
import p219e7.C9998d;

/* renamed from: p3.c */
/* compiled from: SsaStyle */
final class C5272c {

    /* renamed from: a */
    public final String f27186a;

    /* renamed from: b */
    public final int f27187b;

    /* renamed from: c */
    public final Integer f27188c;

    /* renamed from: d */
    public final Integer f27189d;

    /* renamed from: e */
    public final float f27190e;

    /* renamed from: f */
    public final boolean f27191f;

    /* renamed from: g */
    public final boolean f27192g;

    /* renamed from: h */
    public final boolean f27193h;

    /* renamed from: i */
    public final boolean f27194i;

    /* renamed from: j */
    public final int f27195j;

    /* renamed from: p3.c$a */
    /* compiled from: SsaStyle */
    static final class C5273a {

        /* renamed from: a */
        public final int f27196a;

        /* renamed from: b */
        public final int f27197b;

        /* renamed from: c */
        public final int f27198c;

        /* renamed from: d */
        public final int f27199d;

        /* renamed from: e */
        public final int f27200e;

        /* renamed from: f */
        public final int f27201f;

        /* renamed from: g */
        public final int f27202g;

        /* renamed from: h */
        public final int f27203h;

        /* renamed from: i */
        public final int f27204i;

        /* renamed from: j */
        public final int f27205j;

        /* renamed from: k */
        public final int f27206k;

        private C5273a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f27196a = i;
            this.f27197b = i2;
            this.f27198c = i3;
            this.f27199d = i4;
            this.f27200e = i5;
            this.f27201f = i6;
            this.f27202g = i7;
            this.f27203h = i8;
            this.f27204i = i9;
            this.f27205j = i10;
            this.f27206k = i11;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static p114p3.C5272c.C5273a m32540a(java.lang.String r17) {
            /*
                r0 = 7
                r1 = r17
                java.lang.String r1 = r1.substring(r0)
                java.lang.String r2 = ","
                java.lang.String[] r1 = android.text.TextUtils.split(r1, r2)
                r2 = 0
                r3 = -1
                r4 = 0
                r6 = -1
                r7 = -1
                r8 = -1
                r9 = -1
                r10 = -1
                r11 = -1
                r12 = -1
                r13 = -1
                r14 = -1
                r15 = -1
            L_0x001a:
                int r5 = r1.length
                if (r4 >= r5) goto L_0x00c1
                r5 = r1[r4]
                java.lang.String r5 = r5.trim()
                java.lang.String r5 = p182a7.C6408b.m37506e(r5)
                r5.hashCode()
                int r16 = r5.hashCode()
                switch(r16) {
                    case -1178781136: goto L_0x009b;
                    case -1026963764: goto L_0x0090;
                    case -192095652: goto L_0x0085;
                    case -70925746: goto L_0x007a;
                    case 3029637: goto L_0x006f;
                    case 3373707: goto L_0x0064;
                    case 366554320: goto L_0x0059;
                    case 767321349: goto L_0x004e;
                    case 1767875043: goto L_0x0041;
                    case 1988365454: goto L_0x0034;
                    default: goto L_0x0031;
                }
            L_0x0031:
                r0 = -1
                goto L_0x00a5
            L_0x0034:
                java.lang.String r0 = "outlinecolour"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x003d
                goto L_0x0031
            L_0x003d:
                r0 = 9
                goto L_0x00a5
            L_0x0041:
                java.lang.String r0 = "alignment"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x004a
                goto L_0x0031
            L_0x004a:
                r0 = 8
                goto L_0x00a5
            L_0x004e:
                java.lang.String r0 = "borderstyle"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0057
                goto L_0x0031
            L_0x0057:
                r0 = 7
                goto L_0x00a5
            L_0x0059:
                java.lang.String r0 = "fontsize"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0062
                goto L_0x0031
            L_0x0062:
                r0 = 6
                goto L_0x00a5
            L_0x0064:
                java.lang.String r0 = "name"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x006d
                goto L_0x0031
            L_0x006d:
                r0 = 5
                goto L_0x00a5
            L_0x006f:
                java.lang.String r0 = "bold"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0078
                goto L_0x0031
            L_0x0078:
                r0 = 4
                goto L_0x00a5
            L_0x007a:
                java.lang.String r0 = "primarycolour"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0083
                goto L_0x0031
            L_0x0083:
                r0 = 3
                goto L_0x00a5
            L_0x0085:
                java.lang.String r0 = "strikeout"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x008e
                goto L_0x0031
            L_0x008e:
                r0 = 2
                goto L_0x00a5
            L_0x0090:
                java.lang.String r0 = "underline"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x0099
                goto L_0x0031
            L_0x0099:
                r0 = 1
                goto L_0x00a5
            L_0x009b:
                java.lang.String r0 = "italic"
                boolean r0 = r5.equals(r0)
                if (r0 != 0) goto L_0x00a4
                goto L_0x0031
            L_0x00a4:
                r0 = 0
            L_0x00a5:
                switch(r0) {
                    case 0: goto L_0x00bb;
                    case 1: goto L_0x00b9;
                    case 2: goto L_0x00b7;
                    case 3: goto L_0x00b5;
                    case 4: goto L_0x00b3;
                    case 5: goto L_0x00b1;
                    case 6: goto L_0x00af;
                    case 7: goto L_0x00ad;
                    case 8: goto L_0x00ab;
                    case 9: goto L_0x00a9;
                    default: goto L_0x00a8;
                }
            L_0x00a8:
                goto L_0x00bc
            L_0x00a9:
                r9 = r4
                goto L_0x00bc
            L_0x00ab:
                r7 = r4
                goto L_0x00bc
            L_0x00ad:
                r15 = r4
                goto L_0x00bc
            L_0x00af:
                r10 = r4
                goto L_0x00bc
            L_0x00b1:
                r6 = r4
                goto L_0x00bc
            L_0x00b3:
                r11 = r4
                goto L_0x00bc
            L_0x00b5:
                r8 = r4
                goto L_0x00bc
            L_0x00b7:
                r14 = r4
                goto L_0x00bc
            L_0x00b9:
                r13 = r4
                goto L_0x00bc
            L_0x00bb:
                r12 = r4
            L_0x00bc:
                int r4 = r4 + 1
                r0 = 7
                goto L_0x001a
            L_0x00c1:
                if (r6 == r3) goto L_0x00cd
                p3.c$a r0 = new p3.c$a
                int r1 = r1.length
                r5 = r0
                r16 = r1
                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                goto L_0x00ce
            L_0x00cd:
                r0 = 0
            L_0x00ce:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p114p3.C5272c.C5273a.m32540a(java.lang.String):p3.c$a");
        }
    }

    /* renamed from: p3.c$b */
    /* compiled from: SsaStyle */
    static final class C5274b {

        /* renamed from: c */
        private static final Pattern f27207c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d */
        private static final Pattern f27208d = Pattern.compile(C5953m0.m35072C("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e */
        private static final Pattern f27209e = Pattern.compile(C5953m0.m35072C("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f */
        private static final Pattern f27210f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a */
        public final int f27211a;

        /* renamed from: b */
        public final PointF f27212b;

        private C5274b(int i, PointF pointF) {
            this.f27211a = i;
            this.f27212b = pointF;
        }

        /* renamed from: a */
        private static int m32541a(String str) {
            Matcher matcher = f27210f.matcher(str);
            if (matcher.find()) {
                return C5272c.m32535e((String) C5917a.m34872e(matcher.group(1)));
            }
            return -1;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|5|(1:7)|8|9|(2:11|18)(1:17)|15|1) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static p114p3.C5272c.C5274b m32542b(java.lang.String r5) {
            /*
                java.util.regex.Pattern r0 = f27207c
                java.util.regex.Matcher r5 = r0.matcher(r5)
                r0 = -1
                r1 = 0
                r2 = -1
            L_0x0009:
                boolean r3 = r5.find()
                if (r3 == 0) goto L_0x002b
                r3 = 1
                java.lang.String r3 = r5.group(r3)
                java.lang.Object r3 = p161w3.C5917a.m34872e(r3)
                java.lang.String r3 = (java.lang.String) r3
                android.graphics.PointF r4 = m32543c(r3)     // Catch:{ RuntimeException -> 0x0021 }
                if (r4 == 0) goto L_0x0021
                r1 = r4
            L_0x0021:
                int r3 = m32541a(r3)     // Catch:{ RuntimeException -> 0x0029 }
                if (r3 == r0) goto L_0x0009
                r2 = r3
                goto L_0x0009
            L_0x0029:
                goto L_0x0009
            L_0x002b:
                p3.c$b r5 = new p3.c$b
                r5.<init>(r2, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p114p3.C5272c.C5274b.m32542b(java.lang.String):p3.c$b");
        }

        /* renamed from: c */
        private static PointF m32543c(String str) {
            String str2;
            String str3;
            Matcher matcher = f27208d.matcher(str);
            Matcher matcher2 = f27209e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    C5961r.m35212f("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) C5917a.m34872e(str2)).trim()), Float.parseFloat(((String) C5917a.m34872e(str3)).trim()));
        }

        /* renamed from: d */
        public static String m32544d(String str) {
            return f27207c.matcher(str).replaceAll("");
        }
    }

    private C5272c(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f27186a = str;
        this.f27187b = i;
        this.f27188c = num;
        this.f27189d = num2;
        this.f27190e = f;
        this.f27191f = z;
        this.f27192g = z2;
        this.f27193h = z3;
        this.f27194i = z4;
        this.f27195j = i2;
    }

    /* renamed from: b */
    public static C5272c m32532b(String str, C5273a aVar) {
        String str2 = str;
        C5273a aVar2 = aVar;
        C5917a.m34868a(str2.startsWith("Style:"));
        String[] split = TextUtils.split(str2.substring(6), ",");
        int length = split.length;
        int i = aVar2.f27206k;
        if (length != i) {
            C5961r.m35215i("SsaStyle", C5953m0.m35072C("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i), Integer.valueOf(split.length), str2));
            return null;
        }
        try {
            String trim = split[aVar2.f27196a].trim();
            int i2 = aVar2.f27197b;
            int e = i2 != -1 ? m32535e(split[i2].trim()) : -1;
            int i3 = aVar2.f27198c;
            Integer h = i3 != -1 ? m32538h(split[i3].trim()) : null;
            int i4 = aVar2.f27199d;
            Integer h2 = i4 != -1 ? m32538h(split[i4].trim()) : null;
            int i5 = aVar2.f27200e;
            float i6 = i5 != -1 ? m32539i(split[i5].trim()) : -3.4028235E38f;
            int i7 = aVar2.f27201f;
            boolean z = i7 != -1 && m32536f(split[i7].trim());
            int i8 = aVar2.f27202g;
            boolean z2 = i8 != -1 && m32536f(split[i8].trim());
            int i9 = aVar2.f27203h;
            boolean z3 = i9 != -1 && m32536f(split[i9].trim());
            int i10 = aVar2.f27204i;
            boolean z4 = i10 != -1 && m32536f(split[i10].trim());
            int i11 = aVar2.f27205j;
            return new C5272c(trim, e, h, h2, i6, z, z2, z3, z4, i11 != -1 ? m32537g(split[i11].trim()) : -1);
        } catch (RuntimeException e2) {
            C5961r.m35216j("SsaStyle", "Skipping malformed 'Style:' line: '" + str2 + "'", e2);
            return null;
        }
    }

    /* renamed from: c */
    private static boolean m32533c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: d */
    private static boolean m32534d(int i) {
        return i == 1 || i == 3;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static int m32535e(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (m32533c(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        C5961r.m35215i("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    /* renamed from: f */
    private static boolean m32536f(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            C5961r.m35216j("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    /* renamed from: g */
    private static int m32537g(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (m32534d(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        C5961r.m35215i("SsaStyle", "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    /* renamed from: h */
    public static Integer m32538h(String str) {
        long j;
        try {
            if (str.startsWith("&H")) {
                j = Long.parseLong(str.substring(2), 16);
            } else {
                j = Long.parseLong(str);
            }
            C5917a.m34868a(j <= 4294967295L);
            return Integer.valueOf(Color.argb(C9998d.m51069d(((j >> 24) & 255) ^ 255), C9998d.m51069d(j & 255), C9998d.m51069d((j >> 8) & 255), C9998d.m51069d((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            C5961r.m35216j("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    /* renamed from: i */
    private static float m32539i(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e) {
            C5961r.m35216j("SsaStyle", "Failed to parse font size: '" + str + "'", e);
            return -3.4028235E38f;
        }
    }
}
