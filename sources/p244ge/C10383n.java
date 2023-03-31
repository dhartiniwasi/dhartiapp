package p244ge;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p253he.C10543e;
import p282ke.C11636d;

/* renamed from: ge.n */
/* compiled from: Cookie */
public final class C10383n {

    /* renamed from: j */
    private static final Pattern f41273j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k */
    private static final Pattern f41274k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l */
    private static final Pattern f41275l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m */
    private static final Pattern f41276m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    private final String f41277a;

    /* renamed from: b */
    private final String f41278b;

    /* renamed from: c */
    private final long f41279c;

    /* renamed from: d */
    private final String f41280d;

    /* renamed from: e */
    private final String f41281e;

    /* renamed from: f */
    private final boolean f41282f;

    /* renamed from: g */
    private final boolean f41283g;

    /* renamed from: h */
    private final boolean f41284h;

    /* renamed from: i */
    private final boolean f41285i;

    private C10383n(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f41277a = str;
        this.f41278b = str2;
        this.f41279c = j;
        this.f41280d = str3;
        this.f41281e = str4;
        this.f41282f = z;
        this.f41283g = z2;
        this.f41285i = z3;
        this.f41284h = z4;
    }

    /* renamed from: a */
    private static int m52432a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    private static boolean m52433b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (!str.endsWith(str2) || str.charAt((str.length() - str2.length()) - 1) != '.' || C10543e.m53039L(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010f  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static p244ge.C10383n m52434d(long r23, p244ge.C10397x r25, java.lang.String r26) {
        /*
            r0 = r26
            int r1 = r26.length()
            r2 = 0
            r3 = 59
            int r4 = p253he.C10543e.m53052m(r0, r2, r1, r3)
            r5 = 61
            int r6 = p253he.C10543e.m53052m(r0, r2, r4, r5)
            r7 = 0
            if (r6 != r4) goto L_0x0017
            return r7
        L_0x0017:
            java.lang.String r9 = p253he.C10543e.m53038K(r0, r2, r6)
            boolean r8 = r9.isEmpty()
            if (r8 != 0) goto L_0x0135
            int r8 = p253he.C10543e.m53062w(r9)
            r10 = -1
            if (r8 == r10) goto L_0x002a
            goto L_0x0135
        L_0x002a:
            r8 = 1
            int r6 = r6 + r8
            java.lang.String r6 = p253he.C10543e.m53038K(r0, r6, r4)
            int r11 = p253he.C10543e.m53062w(r6)
            if (r11 == r10) goto L_0x0037
            return r7
        L_0x0037:
            int r4 = r4 + r8
            r10 = -1
            r12 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r8 = r7
            r14 = r8
            r19 = r10
            r21 = r12
            r15 = 0
            r16 = 0
            r17 = 1
            r18 = 0
        L_0x004c:
            if (r4 >= r1) goto L_0x00ba
            int r7 = p253he.C10543e.m53052m(r0, r4, r1, r3)
            int r3 = p253he.C10543e.m53052m(r0, r4, r7, r5)
            java.lang.String r4 = p253he.C10543e.m53038K(r0, r4, r3)
            if (r3 >= r7) goto L_0x0063
            int r3 = r3 + 1
            java.lang.String r3 = p253he.C10543e.m53038K(r0, r3, r7)
            goto L_0x0065
        L_0x0063:
            java.lang.String r3 = ""
        L_0x0065:
            java.lang.String r5 = "expires"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0076
            int r4 = r3.length()     // Catch:{ IllegalArgumentException -> 0x00b2 }
            long r21 = m52438h(r3, r2, r4)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            goto L_0x0082
        L_0x0076:
            java.lang.String r5 = "max-age"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0085
            long r19 = m52439i(r3)     // Catch:{  }
        L_0x0082:
            r18 = 1
            goto L_0x00b2
        L_0x0085:
            java.lang.String r5 = "domain"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0094
            java.lang.String r14 = m52437g(r3)     // Catch:{ IllegalArgumentException -> 0x00b2 }
            r17 = 0
            goto L_0x00b2
        L_0x0094:
            java.lang.String r5 = "path"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x009e
            r8 = r3
            goto L_0x00b2
        L_0x009e:
            java.lang.String r3 = "secure"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00a8
            r15 = 1
            goto L_0x00b2
        L_0x00a8:
            java.lang.String r3 = "httponly"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x00b2
            r16 = 1
        L_0x00b2:
            int r4 = r7 + 1
            r3 = 59
            r5 = 61
            r7 = 0
            goto L_0x004c
        L_0x00ba:
            r0 = -9223372036854775808
            int r3 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x00c2
        L_0x00c0:
            r11 = r0
            goto L_0x00e7
        L_0x00c2:
            int r0 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x00e5
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r3 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x00d4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r19 = r19 * r0
            goto L_0x00d9
        L_0x00d4:
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x00d9:
            long r0 = r23 + r19
            int r3 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r3 < 0) goto L_0x00e3
            int r3 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c0
        L_0x00e3:
            r11 = r12
            goto L_0x00e7
        L_0x00e5:
            r11 = r21
        L_0x00e7:
            java.lang.String r0 = r25.mo33427l()
            if (r14 != 0) goto L_0x00f0
            r13 = r0
            r1 = 0
            goto L_0x00fa
        L_0x00f0:
            boolean r1 = m52433b(r0, r14)
            if (r1 != 0) goto L_0x00f8
            r1 = 0
            return r1
        L_0x00f8:
            r1 = 0
            r13 = r14
        L_0x00fa:
            int r0 = r0.length()
            int r3 = r13.length()
            if (r0 == r3) goto L_0x010f
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.m58238c()
            java.lang.String r0 = r0.mo36518d(r13)
            if (r0 != 0) goto L_0x010f
            return r1
        L_0x010f:
            java.lang.String r0 = "/"
            if (r8 == 0) goto L_0x011c
            boolean r1 = r8.startsWith(r0)
            if (r1 != 0) goto L_0x011a
            goto L_0x011c
        L_0x011a:
            r14 = r8
            goto L_0x012d
        L_0x011c:
            java.lang.String r1 = r25.mo33422g()
            r3 = 47
            int r3 = r1.lastIndexOf(r3)
            if (r3 == 0) goto L_0x012c
            java.lang.String r0 = r1.substring(r2, r3)
        L_0x012c:
            r14 = r0
        L_0x012d:
            ge.n r0 = new ge.n
            r8 = r0
            r10 = r6
            r8.<init>(r9, r10, r11, r13, r14, r15, r16, r17, r18)
            return r0
        L_0x0135:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p244ge.C10383n.m52434d(long, ge.x, java.lang.String):ge.n");
    }

    /* renamed from: e */
    public static C10383n m52435e(C10397x xVar, String str) {
        return m52434d(System.currentTimeMillis(), xVar, str);
    }

    /* renamed from: f */
    public static List<C10383n> m52436f(C10397x xVar, C10395w wVar) {
        List<String> j = wVar.mo33408j("Set-Cookie");
        int size = j.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C10383n e = m52435e(xVar, j.get(i));
            if (e != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(e);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* renamed from: g */
    private static String m52437g(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String c = C10543e.m53042c(str);
            if (c != null) {
                return c;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: h */
    private static long m52438h(String str, int i, int i2) {
        int a = m52432a(str, i, i2, false);
        Matcher matcher = f41276m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a < i2) {
            int a2 = m52432a(str, a + 1, i2, true);
            matcher.region(a, a2);
            if (i4 == -1 && matcher.usePattern(f41276m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 != -1 || !matcher.usePattern(f41275l).matches()) {
                if (i6 == -1) {
                    Pattern pattern = f41274k;
                    if (matcher.usePattern(pattern).matches()) {
                        i6 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(f41273j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i5 = Integer.parseInt(matcher.group(1));
            }
            a = m52432a(str, a2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += AdError.SERVER_ERROR_CODE;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        } else if (i6 == -1) {
            throw new IllegalArgumentException();
        } else if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        } else if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        } else if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C10543e.f41568i);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    /* renamed from: i */
    private static long m52439i(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            if (!str.matches("-?\\d+")) {
                throw e;
            } else if (str.startsWith("-")) {
                return Long.MIN_VALUE;
            } else {
                return Long.MAX_VALUE;
            }
        }
    }

    /* renamed from: c */
    public String mo33359c() {
        return this.f41277a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10383n)) {
            return false;
        }
        C10383n nVar = (C10383n) obj;
        if (nVar.f41277a.equals(this.f41277a) && nVar.f41278b.equals(this.f41278b) && nVar.f41280d.equals(this.f41280d) && nVar.f41281e.equals(this.f41281e) && nVar.f41279c == this.f41279c && nVar.f41282f == this.f41282f && nVar.f41283g == this.f41283g && nVar.f41284h == this.f41284h && nVar.f41285i == this.f41285i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f41279c;
        return ((((((((((((((((527 + this.f41277a.hashCode()) * 31) + this.f41278b.hashCode()) * 31) + this.f41280d.hashCode()) * 31) + this.f41281e.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.f41282f ^ true ? 1 : 0)) * 31) + (this.f41283g ^ true ? 1 : 0)) * 31) + (this.f41284h ^ true ? 1 : 0)) * 31) + (this.f41285i ^ true ? 1 : 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public String mo33362j(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f41277a);
        sb.append('=');
        sb.append(this.f41278b);
        if (this.f41284h) {
            if (this.f41279c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C11636d.m56723a(new Date(this.f41279c)));
            }
        }
        if (!this.f41285i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.f41280d);
        }
        sb.append("; path=");
        sb.append(this.f41281e);
        if (this.f41282f) {
            sb.append("; secure");
        }
        if (this.f41283g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    /* renamed from: k */
    public String mo33363k() {
        return this.f41278b;
    }

    public String toString() {
        return mo33362j(false);
    }
}
