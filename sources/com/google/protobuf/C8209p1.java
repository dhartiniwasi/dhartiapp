package com.google.protobuf;

import com.google.protobuf.C8119d0;
import com.google.protobuf.C8240v;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.p1 */
/* compiled from: SchemaUtil */
final class C8209p1 {

    /* renamed from: a */
    private static final Class<?> f35041a = m45490B();

    /* renamed from: b */
    private static final C8245v1<?, ?> f35042b = m45491C(false);

    /* renamed from: c */
    private static final C8245v1<?, ?> f35043c = m45491C(true);

    /* renamed from: d */
    private static final C8245v1<?, ?> f35044d = new C8253x1();

    /* renamed from: A */
    static <UT, UB> UB m45489A(Object obj, int i, List<Integer> list, C8119d0.C8124e eVar, UB ub, C8245v1<UT, UB> v1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (eVar.mo26874a(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m45500L(obj, i, intValue, ub, v1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.mo26874a(intValue2)) {
                    ub = m45500L(obj, i, intValue2, ub, v1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    /* renamed from: B */
    private static Class<?> m45490B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    private static C8245v1<?, ?> m45491C(boolean z) {
        try {
            Class<?> D = m45492D();
            if (D == null) {
                return null;
            }
            return (C8245v1) D.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: D */
    private static Class<?> m45492D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: E */
    static <T, FT extends C8240v.C8242b<FT>> void m45493E(C8223r<FT> rVar, T t, T t2) {
        C8240v<FT> c = rVar.mo27278c(t2);
        if (!c.mo27304n()) {
            rVar.mo27279d(t).mo27309v(c);
        }
    }

    /* renamed from: F */
    static <T> void m45494F(C8212q0 q0Var, T t, T t2, long j) {
        C8268z1.m45999V(t, j, q0Var.mo27223a(C8268z1.m45984G(t, j), C8268z1.m45984G(t2, j)));
    }

    /* renamed from: G */
    static <T, UT, UB> void m45495G(C8245v1<UT, UB> v1Var, T t, T t2) {
        v1Var.mo27340p(t, v1Var.mo27335k(v1Var.mo27331g(t), v1Var.mo27331g(t2)));
    }

    /* renamed from: H */
    public static C8245v1<?, ?> m45496H() {
        return f35042b;
    }

    /* renamed from: I */
    public static C8245v1<?, ?> m45497I() {
        return f35043c;
    }

    /* renamed from: J */
    public static void m45498J(Class<?> cls) {
        Class<?> cls2;
        if (!C8260z.class.isAssignableFrom(cls) && (cls2 = f35041a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    /* renamed from: K */
    static boolean m45499K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: L */
    static <UT, UB> UB m45500L(Object obj, int i, int i2, UB ub, C8245v1<UT, UB> v1Var) {
        if (ub == null) {
            ub = v1Var.mo27330f(obj);
        }
        v1Var.mo27329e(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: M */
    public static C8245v1<?, ?> m45501M() {
        return f35044d;
    }

    /* renamed from: N */
    public static void m45502N(int i, List<Boolean> list, C8116c2 c2Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26832B(i, list, z);
        }
    }

    /* renamed from: O */
    public static void m45503O(int i, List<C8153i> list, C8116c2 c2Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26845O(i, list);
        }
    }

    /* renamed from: P */
    public static void m45504P(int i, List<Double> list, C8116c2 c2Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26843M(i, list, z);
        }
    }

    /* renamed from: Q */
    public static void m45505Q(int i, List<Integer> list, C8116c2 c2Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26842L(i, list, z);
        }
    }

    /* renamed from: R */
    public static void m45506R(int i, List<Integer> list, C8116c2 c2Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26831A(i, list, z);
        }
    }

    /* renamed from: S */
    public static void m45507S(int i, List<Long> list, C8116c2 c2Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26869x(i, list, z);
        }
    }

    /* renamed from: T */
    public static void m45508T(int i, List<Float> list, C8116c2 c2Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26848c(i, list, z);
        }
    }

    /* renamed from: U */
    public static void m45509U(int i, List<?> list, C8116c2 c2Var, C8202n1 n1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26847b(i, list, n1Var);
        }
    }

    /* renamed from: V */
    public static void m45510V(int i, List<Integer> list, C8116c2 c2Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26861p(i, list, z);
        }
    }

    /* renamed from: W */
    public static void m45511W(int i, List<Long> list, C8116c2 c2Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26841K(i, list, z);
        }
    }

    /* renamed from: X */
    public static void m45512X(int i, List<?> list, C8116c2 c2Var, C8202n1 n1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26846a(i, list, n1Var);
        }
    }

    /* renamed from: Y */
    public static void m45513Y(int i, List<Integer> list, C8116c2 c2Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26870y(i, list, z);
        }
    }

    /* renamed from: Z */
    public static void m45514Z(int i, List<Long> list, C8116c2 c2Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26853h(i, list, z);
        }
    }

    /* renamed from: a */
    static int m45515a(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return C8180l.m45138V(i) + C8180l.m45120D(size);
        }
        return size * C8180l.m45146e(i, true);
    }

    /* renamed from: a0 */
    public static void m45516a0(int i, List<Integer> list, C8116c2 c2Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26839I(i, list, z);
        }
    }

    /* renamed from: b */
    static int m45517b(List<?> list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m45518b0(int i, List<Long> list, C8116c2 c2Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26835E(i, list, z);
        }
    }

    /* renamed from: c */
    static int m45519c(int i, List<C8153i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = size * C8180l.m45138V(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            V += C8180l.m45153i(list.get(i2));
        }
        return V;
    }

    /* renamed from: c0 */
    public static void m45520c0(int i, List<String> list, C8116c2 c2Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26858m(i, list);
        }
    }

    /* renamed from: d */
    static int m45521d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = m45523e(list);
        if (z) {
            return C8180l.m45138V(i) + C8180l.m45120D(e);
        }
        return e + (size * C8180l.m45138V(i));
    }

    /* renamed from: d0 */
    public static void m45522d0(int i, List<Integer> list, C8116c2 c2Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26834D(i, list, z);
        }
    }

    /* renamed from: e */
    static int m45523e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8114c0) {
            C8114c0 c0Var = (C8114c0) list;
            i = 0;
            while (i2 < size) {
                i += C8180l.m45157m(c0Var.mo26824o(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8180l.m45157m(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e0 */
    public static void m45524e0(int i, List<Long> list, C8116c2 c2Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            c2Var.mo26854i(i, list, z);
        }
    }

    /* renamed from: f */
    static int m45525f(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return C8180l.m45138V(i) + C8180l.m45120D(size * 4);
        }
        return size * C8180l.m45158n(i, 0);
    }

    /* renamed from: g */
    static int m45526g(List<?> list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    static int m45527h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z) {
            return C8180l.m45138V(i) + C8180l.m45120D(size * 8);
        }
        return size * C8180l.m45160p(i, 0);
    }

    /* renamed from: i */
    static int m45528i(List<?> list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    static int m45529j(int i, List<C8243v0> list, C8202n1 n1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C8180l.m45164t(i, list.get(i3), n1Var);
        }
        return i2;
    }

    /* renamed from: k */
    static int m45530k(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = m45531l(list);
        if (z) {
            return C8180l.m45138V(i) + C8180l.m45120D(l);
        }
        return l + (size * C8180l.m45138V(i));
    }

    /* renamed from: l */
    static int m45531l(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8114c0) {
            C8114c0 c0Var = (C8114c0) list;
            i = 0;
            while (i2 < size) {
                i += C8180l.m45168x(c0Var.mo26824o(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8180l.m45168x(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: m */
    static int m45532m(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n = m45533n(list);
        if (z) {
            return C8180l.m45138V(i) + C8180l.m45120D(n);
        }
        return n + (list.size() * C8180l.m45138V(i));
    }

    /* renamed from: n */
    static int m45533n(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8193m0) {
            C8193m0 m0Var = (C8193m0) list;
            i = 0;
            while (i2 < size) {
                i += C8180l.m45170z(m0Var.mo27164o(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8180l.m45170z(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: o */
    static int m45534o(int i, Object obj, C8202n1 n1Var) {
        if (obj instanceof C8165i0) {
            return C8180l.m45118B(i, (C8165i0) obj);
        }
        return C8180l.m45123G(i, (C8243v0) obj, n1Var);
    }

    /* renamed from: p */
    static int m45535p(int i, List<?> list, C8202n1 n1Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int V = C8180l.m45138V(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C8165i0) {
                i2 = C8180l.m45119C((C8165i0) obj);
            } else {
                i2 = C8180l.m45125I((C8243v0) obj, n1Var);
            }
            V += i2;
        }
        return V;
    }

    /* renamed from: q */
    static int m45536q(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = m45537r(list);
        if (z) {
            return C8180l.m45138V(i) + C8180l.m45120D(r);
        }
        return r + (size * C8180l.m45138V(i));
    }

    /* renamed from: r */
    static int m45537r(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8114c0) {
            C8114c0 c0Var = (C8114c0) list;
            i = 0;
            while (i2 < size) {
                i += C8180l.m45133Q(c0Var.mo26824o(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8180l.m45133Q(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: s */
    static int m45538s(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = m45539t(list);
        if (z) {
            return C8180l.m45138V(i) + C8180l.m45120D(t);
        }
        return t + (size * C8180l.m45138V(i));
    }

    /* renamed from: t */
    static int m45539t(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8193m0) {
            C8193m0 m0Var = (C8193m0) list;
            i = 0;
            while (i2 < size) {
                i += C8180l.m45135S(m0Var.mo27164o(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8180l.m45135S(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: u */
    static int m45540u(int i, List<?> list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int V = C8180l.m45138V(i) * size;
        if (list instanceof C8178k0) {
            C8178k0 k0Var = (C8178k0) list;
            while (i4 < size) {
                Object q1 = k0Var.mo27031q1(i4);
                if (q1 instanceof C8153i) {
                    i3 = C8180l.m45153i((C8153i) q1);
                } else {
                    i3 = C8180l.m45137U((String) q1);
                }
                V += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C8153i) {
                    i2 = C8180l.m45153i((C8153i) obj);
                } else {
                    i2 = C8180l.m45137U((String) obj);
                }
                V += i2;
                i4++;
            }
        }
        return V;
    }

    /* renamed from: v */
    static int m45541v(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = m45542w(list);
        if (z) {
            return C8180l.m45138V(i) + C8180l.m45120D(w);
        }
        return w + (size * C8180l.m45138V(i));
    }

    /* renamed from: w */
    static int m45542w(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8114c0) {
            C8114c0 c0Var = (C8114c0) list;
            i = 0;
            while (i2 < size) {
                i += C8180l.m45140X(c0Var.mo26824o(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8180l.m45140X(list.get(i2).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: x */
    static int m45543x(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = m45544y(list);
        if (z) {
            return C8180l.m45138V(i) + C8180l.m45120D(y);
        }
        return y + (size * C8180l.m45138V(i));
    }

    /* renamed from: y */
    static int m45544y(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8193m0) {
            C8193m0 m0Var = (C8193m0) list;
            i = 0;
            while (i2 < size) {
                i += C8180l.m45142Z(m0Var.mo27164o(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C8180l.m45142Z(list.get(i2).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: z */
    static <UT, UB> UB m45545z(Object obj, int i, List<Integer> list, C8119d0.C8123d<?> dVar, UB ub, C8245v1<UT, UB> v1Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = list.get(i3).intValue();
                if (dVar.mo26873a(intValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    ub = m45500L(obj, i, intValue, ub, v1Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.mo26873a(intValue2) == null) {
                    ub = m45500L(obj, i, intValue2, ub, v1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
