package p401xd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C11669k;
import kotlin.jvm.internal.C11670l;
import p243gd.C10340l;
import p243gd.C10346p;
import p252hd.C10535w;
import p344rd.C12439l;
import p344rd.C12443p;
import p372ud.C12749a;
import p372ud.C12752c;
import p392wd.C12949b;

/* renamed from: xd.o */
/* compiled from: Strings.kt */
class C13011o extends C13010n {

    /* renamed from: xd.o$a */
    /* compiled from: Strings.kt */
    static final class C13012a extends C11670l implements C12443p<CharSequence, Integer, C10340l<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ char[] f47268a;

        /* renamed from: b */
        final /* synthetic */ boolean f47269b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13012a(char[] cArr, boolean z) {
            super(2);
            this.f47268a = cArr;
            this.f47269b = z;
        }

        /* renamed from: a */
        public final C10340l<Integer, Integer> mo38063a(CharSequence charSequence, int i) {
            C11669k.m56787e(charSequence, "$this$$receiver");
            int A = C13011o.m61261A(charSequence, this.f47268a, i, this.f47269b);
            if (A < 0) {
                return null;
            }
            return C10346p.m52247a(Integer.valueOf(A), 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo38063a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: xd.o$b */
    /* compiled from: Strings.kt */
    static final class C13013b extends C11670l implements C12443p<CharSequence, Integer, C10340l<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ List<String> f47270a;

        /* renamed from: b */
        final /* synthetic */ boolean f47271b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13013b(List<String> list, boolean z) {
            super(2);
            this.f47270a = list;
            this.f47271b = z;
        }

        /* renamed from: a */
        public final C10340l<Integer, Integer> mo38064a(CharSequence charSequence, int i) {
            C11669k.m56787e(charSequence, "$this$$receiver");
            C10340l o = C13011o.m61300r(charSequence, this.f47270a, i, this.f47271b, false);
            if (o != null) {
                return C10346p.m52247a(o.mo33175c(), Integer.valueOf(((String) o.mo33176d()).length()));
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo38064a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: xd.o$c */
    /* compiled from: Strings.kt */
    static final class C13014c extends C11670l implements C12439l<C12752c, String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f47272a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13014c(CharSequence charSequence) {
            super(1);
            this.f47272a = charSequence;
        }

        /* renamed from: a */
        public final String invoke(C12752c cVar) {
            C11669k.m56787e(cVar, "it");
            return C13011o.m61285Y(this.f47272a, cVar);
        }
    }

    /* renamed from: A */
    public static final int m61261A(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C11669k.m56787e(charSequence, "<this>");
        C11669k.m56787e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            C10535w i2 = new C12752c(C12756f.m60449a(i, 0), m61302t(charSequence)).iterator();
            while (i2.hasNext()) {
                int a = i2.mo33733a();
                char charAt = charSequence.charAt(a);
                int length = cArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z2 = false;
                        continue;
                        break;
                    } else if (C12994b.m61217d(cArr[i3], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z2) {
                    return a;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C10515f.m52935k(cArr), i);
    }

    /* renamed from: B */
    public static final int m61262B(CharSequence charSequence, char c, int i, boolean z) {
        C11669k.m56787e(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m61266F(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: C */
    public static final int m61263C(CharSequence charSequence, String str, int i, boolean z) {
        C11669k.m56787e(charSequence, "<this>");
        C11669k.m56787e(str, "string");
        if (z || !(charSequence instanceof String)) {
            return m61305w(charSequence, str, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: D */
    public static /* synthetic */ int m61264D(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m61302t(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m61262B(charSequence, c, i, z);
    }

    /* renamed from: E */
    public static /* synthetic */ int m61265E(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m61302t(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m61263C(charSequence, str, i, z);
    }

    /* renamed from: F */
    public static final int m61266F(CharSequence charSequence, char[] cArr, int i, boolean z) {
        C11669k.m56787e(charSequence, "<this>");
        C11669k.m56787e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int c = C12756f.m60451c(i, m61302t(charSequence)); -1 < c; c--) {
                char charAt = charSequence.charAt(c);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C12994b.m61217d(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return c;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C10515f.m52935k(cArr), i);
    }

    /* renamed from: G */
    public static final C12949b<String> m61267G(CharSequence charSequence) {
        C11669k.m56787e(charSequence, "<this>");
        return m61282V(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    /* renamed from: H */
    public static final List<String> m61268H(CharSequence charSequence) {
        C11669k.m56787e(charSequence, "<this>");
        return C12956h.m61144f(m61267G(charSequence));
    }

    /* renamed from: I */
    private static final C12949b<C12752c> m61269I(CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        m61275O(i2);
        return new C12995c(charSequence, i, i2, new C13012a(cArr, z));
    }

    /* renamed from: J */
    private static final C12949b<C12752c> m61270J(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        m61275O(i2);
        return new C12995c(charSequence, i, i2, new C13013b(C10513e.m52924a(strArr), z));
    }

    /* renamed from: K */
    static /* synthetic */ C12949b m61271K(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m61269I(charSequence, cArr, i, z, i2);
    }

    /* renamed from: L */
    static /* synthetic */ C12949b m61272L(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m61270J(charSequence, strArr, i, z, i2);
    }

    /* renamed from: M */
    public static final boolean m61273M(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C11669k.m56787e(charSequence, "<this>");
        C11669k.m56787e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C12994b.m61217d(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: N */
    public static String m61274N(String str, CharSequence charSequence) {
        C11669k.m56787e(str, "<this>");
        C11669k.m56787e(charSequence, "prefix");
        if (!m61284X(str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C11669k.m56786d(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: O */
    public static final void m61275O(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
        }
    }

    /* renamed from: P */
    public static final List<String> m61276P(CharSequence charSequence, char[] cArr, boolean z, int i) {
        C11669k.m56787e(charSequence, "<this>");
        C11669k.m56787e(cArr, "delimiters");
        if (cArr.length == 1) {
            return m61278R(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<C12752c> c = C12956h.m61141c(m61271K(charSequence, cArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C10523k.m52973i(c, 10));
        for (C12752c Y : c) {
            arrayList.add(m61285Y(charSequence, Y));
        }
        return arrayList;
    }

    /* renamed from: Q */
    public static final List<String> m61277Q(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C11669k.m56787e(charSequence, "<this>");
        C11669k.m56787e(strArr, "delimiters");
        boolean z2 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                return m61278R(charSequence, str, z, i);
            }
        }
        Iterable<C12752c> c = C12956h.m61141c(m61272L(charSequence, strArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C10523k.m52973i(c, 10));
        for (C12752c Y : c) {
            arrayList.add(m61285Y(charSequence, Y));
        }
        return arrayList;
    }

    /* renamed from: R */
    private static final List<String> m61278R(CharSequence charSequence, String str, boolean z, int i) {
        m61275O(i);
        int i2 = 0;
        int v = m61304v(charSequence, str, 0, z);
        if (v == -1 || i == 1) {
            return C10521i.m52966b(charSequence.toString());
        }
        boolean z2 = i > 0;
        int i3 = 10;
        if (z2) {
            i3 = C12756f.m60451c(i, 10);
        }
        ArrayList arrayList = new ArrayList(i3);
        do {
            arrayList.add(charSequence.subSequence(i2, v).toString());
            i2 = str.length() + v;
            if ((z2 && arrayList.size() == i - 1) || (v = m61304v(charSequence, str, i2, z)) == -1) {
                arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            }
            arrayList.add(charSequence.subSequence(i2, v).toString());
            i2 = str.length() + v;
            break;
        } while ((v = m61304v(charSequence, str, i2, z)) == -1);
        arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
        return arrayList;
    }

    /* renamed from: S */
    public static /* synthetic */ List m61279S(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m61276P(charSequence, cArr, z, i);
    }

    /* renamed from: T */
    public static /* synthetic */ List m61280T(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m61277Q(charSequence, strArr, z, i);
    }

    /* renamed from: U */
    public static final C12949b<String> m61281U(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C11669k.m56787e(charSequence, "<this>");
        C11669k.m56787e(strArr, "delimiters");
        return C12956h.m61142d(m61272L(charSequence, strArr, 0, z, i, 2, (Object) null), new C13014c(charSequence));
    }

    /* renamed from: V */
    public static /* synthetic */ C12949b m61282V(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m61281U(charSequence, strArr, z, i);
    }

    /* renamed from: W */
    public static final boolean m61283W(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C11669k.m56787e(charSequence, "<this>");
        C11669k.m56787e(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C13010n.m61260n((String) charSequence, (String) charSequence2, false, 2, (Object) null);
        }
        return m61273M(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: X */
    public static /* synthetic */ boolean m61284X(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m61283W(charSequence, charSequence2, z);
    }

    /* renamed from: Y */
    public static final String m61285Y(CharSequence charSequence, C12752c cVar) {
        C11669k.m56787e(charSequence, "<this>");
        C11669k.m56787e(cVar, "range");
        return charSequence.subSequence(cVar.mo37685o().intValue(), cVar.mo37684l().intValue() + 1).toString();
    }

    /* renamed from: Z */
    public static final String m61286Z(String str, char c, String str2) {
        C11669k.m56787e(str, "<this>");
        C11669k.m56787e(str2, "missingDelimiterValue");
        int y = m61307y(str, c, 0, false, 6, (Object) null);
        if (y == -1) {
            return str2;
        }
        String substring = str.substring(y + 1, str.length());
        C11669k.m56786d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: a0 */
    public static final String m61287a0(String str, String str2, String str3) {
        C11669k.m56787e(str, "<this>");
        C11669k.m56787e(str2, "delimiter");
        C11669k.m56787e(str3, "missingDelimiterValue");
        int z = m61308z(str, str2, 0, false, 6, (Object) null);
        if (z == -1) {
            return str3;
        }
        String substring = str.substring(z + str2.length(), str.length());
        C11669k.m56786d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b0 */
    public static /* synthetic */ String m61288b0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m61286Z(str, c, str2);
    }

    /* renamed from: c0 */
    public static /* synthetic */ String m61289c0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m61287a0(str, str2, str3);
    }

    /* renamed from: d0 */
    public static final String m61290d0(String str, char c, String str2) {
        C11669k.m56787e(str, "<this>");
        C11669k.m56787e(str2, "missingDelimiterValue");
        int D = m61264D(str, c, 0, false, 6, (Object) null);
        if (D == -1) {
            return str2;
        }
        String substring = str.substring(D + 1, str.length());
        C11669k.m56786d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: e0 */
    public static /* synthetic */ String m61291e0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m61290d0(str, c, str2);
    }

    /* renamed from: f0 */
    public static final String m61292f0(String str, char c, String str2) {
        C11669k.m56787e(str, "<this>");
        C11669k.m56787e(str2, "missingDelimiterValue");
        int y = m61307y(str, c, 0, false, 6, (Object) null);
        if (y == -1) {
            return str2;
        }
        String substring = str.substring(0, y);
        C11669k.m56786d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: g0 */
    public static final String m61293g0(String str, String str2, String str3) {
        C11669k.m56787e(str, "<this>");
        C11669k.m56787e(str2, "delimiter");
        C11669k.m56787e(str3, "missingDelimiterValue");
        int z = m61308z(str, str2, 0, false, 6, (Object) null);
        if (z == -1) {
            return str3;
        }
        String substring = str.substring(0, z);
        C11669k.m56786d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: h0 */
    public static /* synthetic */ String m61294h0(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m61292f0(str, c, str2);
    }

    /* renamed from: i0 */
    public static /* synthetic */ String m61295i0(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m61293g0(str, str2, str3);
    }

    /* renamed from: j0 */
    public static CharSequence m61296j0(CharSequence charSequence) {
        C11669k.m56787e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean c = C12993a.m61216c(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!c) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!c) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: p */
    public static final boolean m61298p(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C11669k.m56787e(charSequence, "<this>");
        C11669k.m56787e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m61308z(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (m61306x(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, (Object) null) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public static /* synthetic */ boolean m61299q(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m61298p(charSequence, charSequence2, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final C10340l<Integer, String> m61300r(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        T t;
        T t2;
        if (z || collection.size() != 1) {
            C12749a cVar = !z2 ? new C12752c(C12756f.m60449a(i, 0), charSequence.length()) : C12756f.m60454f(C12756f.m60451c(i, m61302t(charSequence)), 0);
            if (charSequence instanceof String) {
                int b = cVar.mo37672b();
                int c = cVar.mo37673c();
                int f = cVar.mo37675f();
                if ((f > 0 && b <= c) || (f < 0 && c <= b)) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            String str = (String) t2;
                            if (C13010n.m61258l(str, 0, (String) charSequence, b, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) t2;
                        if (str2 == null) {
                            if (b == c) {
                                break;
                            }
                            b += f;
                        } else {
                            return C10346p.m52247a(Integer.valueOf(b), str2);
                        }
                    }
                }
            } else {
                int b2 = cVar.mo37672b();
                int c2 = cVar.mo37673c();
                int f2 = cVar.mo37675f();
                if ((f2 > 0 && b2 <= c2) || (f2 < 0 && c2 <= b2)) {
                    while (true) {
                        Iterator<T> it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                t = null;
                                break;
                            }
                            t = it2.next();
                            String str3 = (String) t;
                            if (m61273M(str3, 0, charSequence, b2, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) t;
                        if (str4 == null) {
                            if (b2 == c2) {
                                break;
                            }
                            b2 += f2;
                        } else {
                            return C10346p.m52247a(Integer.valueOf(b2), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) C10530r.m52988u(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i2 = i;
        int z3 = !z2 ? m61308z(charSequence2, str6, i2, false, 4, (Object) null) : m61265E(charSequence2, str6, i2, false, 4, (Object) null);
        if (z3 < 0) {
            return null;
        }
        return C10346p.m52247a(Integer.valueOf(z3), str5);
    }

    /* renamed from: s */
    public static final C12752c m61301s(CharSequence charSequence) {
        C11669k.m56787e(charSequence, "<this>");
        return new C12752c(0, charSequence.length() - 1);
    }

    /* renamed from: t */
    public static final int m61302t(CharSequence charSequence) {
        C11669k.m56787e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: u */
    public static final int m61303u(CharSequence charSequence, char c, int i, boolean z) {
        C11669k.m56787e(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m61261A(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: v */
    public static final int m61304v(CharSequence charSequence, String str, int i, boolean z) {
        C11669k.m56787e(charSequence, "<this>");
        C11669k.m56787e(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m61306x(charSequence, str, i, charSequence.length(), z, false, 16, (Object) null);
    }

    /* renamed from: w */
    private static final int m61305w(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C12749a aVar;
        if (!z2) {
            aVar = new C12752c(C12756f.m60449a(i, 0), C12756f.m60451c(i2, charSequence.length()));
        } else {
            aVar = C12756f.m60454f(C12756f.m60451c(i, m61302t(charSequence)), C12756f.m60449a(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int b = aVar.mo37672b();
            int c = aVar.mo37673c();
            int f = aVar.mo37675f();
            if ((f <= 0 || b > c) && (f >= 0 || c > b)) {
                return -1;
            }
            while (true) {
                if (m61273M(charSequence2, 0, charSequence, b, charSequence2.length(), z)) {
                    return b;
                }
                if (b == c) {
                    return -1;
                }
                b += f;
            }
        } else {
            int b2 = aVar.mo37672b();
            int c2 = aVar.mo37673c();
            int f2 = aVar.mo37675f();
            if ((f2 <= 0 || b2 > c2) && (f2 >= 0 || c2 > b2)) {
                return -1;
            }
            while (true) {
                if (C13010n.m61258l((String) charSequence2, 0, (String) charSequence, b2, charSequence2.length(), z)) {
                    return b2;
                }
                if (b2 == c2) {
                    return -1;
                }
                b2 += f2;
            }
        }
    }

    /* renamed from: x */
    static /* synthetic */ int m61306x(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m61305w(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: y */
    public static /* synthetic */ int m61307y(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m61303u(charSequence, c, i, z);
    }

    /* renamed from: z */
    public static /* synthetic */ int m61308z(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m61304v(charSequence, str, i, z);
    }
}
