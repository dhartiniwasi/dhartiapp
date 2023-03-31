package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c4 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3196c4 {

    /* renamed from: a */
    private static final Class f21857a;

    /* renamed from: b */
    private static final C3724s4 f21858b = m25236C(false);

    /* renamed from: c */
    private static final C3724s4 f21859c = m25236C(true);

    /* renamed from: d */
    private static final C3724s4 f21860d = new C3790u4();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f21857a = cls;
    }

    /* renamed from: A */
    static int m25234A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C3688r1.m26670f(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m25235B(int i, List list, C3721s1 s1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.mo16715k(i, list, z);
        }
    }

    /* renamed from: C */
    private static C3724s4 m25236C(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (C3724s4) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    static int m25237D(List list) {
        return list.size();
    }

    /* renamed from: E */
    static int m25238E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * C3688r1.m26669e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += C3688r1.m26662E((C3325g1) list.get(i2));
        }
        return e;
    }

    /* renamed from: F */
    static int m25239F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m25240G(list) + (size * C3688r1.m26669e(i));
    }

    /* renamed from: G */
    static int m25240G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3458k2) {
            C3458k2 k2Var = (C3458k2) list;
            i = 0;
            while (i2 < size) {
                i += C3688r1.m26664G(k2Var.mo16242c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3688r1.m26664G(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    static int m25241H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C3688r1.m26670f(i << 3) + 4);
    }

    /* renamed from: I */
    static int m25242I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    static int m25243J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C3688r1.m26670f(i << 3) + 8);
    }

    /* renamed from: K */
    static int m25244K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    static int m25245L(int i, List list, C3130a4 a4Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C3688r1.m26663F(i, (C3591o3) list.get(i3), a4Var);
        }
        return i2;
    }

    /* renamed from: M */
    static int m25246M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m25247N(list) + (size * C3688r1.m26669e(i));
    }

    /* renamed from: N */
    static int m25247N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3458k2) {
            C3458k2 k2Var = (C3458k2) list;
            i = 0;
            while (i2 < size) {
                i += C3688r1.m26664G(k2Var.mo16242c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3688r1.m26664G(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m25248O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m25249P(list) + (list.size() * C3688r1.m26669e(i));
    }

    /* renamed from: P */
    static int m25249P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3195c3) {
            C3195c3 c3Var = (C3195c3) list;
            i = 0;
            while (i2 < size) {
                i += C3688r1.m26671g(c3Var.mo15887c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3688r1.m26671g(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    static int m25250Q(int i, Object obj, C3130a4 a4Var) {
        if (!(obj instanceof C3755t2)) {
            return C3688r1.m26670f(i << 3) + C3688r1.m26666b((C3591o3) obj, a4Var);
        }
        int f = C3688r1.m26670f(i << 3);
        int a = ((C3755t2) obj).mo16791a();
        return f + C3688r1.m26670f(a) + a;
    }

    /* renamed from: R */
    static int m25251R(int i, List list, C3130a4 a4Var) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = C3688r1.m26669e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C3755t2) {
                i2 = C3688r1.m26665H((C3755t2) obj);
            } else {
                i2 = C3688r1.m26666b((C3591o3) obj, a4Var);
            }
            e += i2;
        }
        return e;
    }

    /* renamed from: S */
    static int m25252S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m25253T(list) + (size * C3688r1.m26669e(i));
    }

    /* renamed from: T */
    static int m25253T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3458k2) {
            C3458k2 k2Var = (C3458k2) list;
            i = 0;
            while (i2 < size) {
                int c = k2Var.mo16242c(i2);
                i += C3688r1.m26670f((c >> 31) ^ (c + c));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + C3688r1.m26670f((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m25254U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m25255V(list) + (size * C3688r1.m26669e(i));
    }

    /* renamed from: V */
    static int m25255V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3195c3) {
            C3195c3 c3Var = (C3195c3) list;
            i = 0;
            while (i2 < size) {
                long c = c3Var.mo15887c(i2);
                i += C3688r1.m26671g((c >> 63) ^ (c + c));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + C3688r1.m26671g((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    static int m25256W(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = C3688r1.m26669e(i) * size;
        if (list instanceof C3821v2) {
            C3821v2 v2Var = (C3821v2) list;
            while (i4 < size) {
                Object p = v2Var.mo16858p(i4);
                if (p instanceof C3325g1) {
                    i3 = C3688r1.m26662E((C3325g1) p);
                } else {
                    i3 = C3688r1.m26668d((String) p);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C3325g1) {
                    i2 = C3688r1.m26662E((C3325g1) obj);
                } else {
                    i2 = C3688r1.m26668d((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    /* renamed from: X */
    static int m25257X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m25258Y(list) + (size * C3688r1.m26669e(i));
    }

    /* renamed from: Y */
    static int m25258Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3458k2) {
            C3458k2 k2Var = (C3458k2) list;
            i = 0;
            while (i2 < size) {
                i += C3688r1.m26670f(k2Var.mo16242c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3688r1.m26670f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    static int m25259Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m25261a0(list) + (size * C3688r1.m26669e(i));
    }

    /* renamed from: a */
    public static C3724s4 m25260a() {
        return f21859c;
    }

    /* renamed from: a0 */
    static int m25261a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C3195c3) {
            C3195c3 c3Var = (C3195c3) list;
            i = 0;
            while (i2 < size) {
                i += C3688r1.m26671g(c3Var.mo15887c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C3688r1.m26671g(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C3724s4 m25262b() {
        return f21860d;
    }

    /* renamed from: b0 */
    public static C3724s4 m25263b0() {
        return f21858b;
    }

    /* renamed from: c */
    static Object m25264c(Object obj, int i, List list, C3557n2 n2Var, Object obj2, C3724s4 s4Var) {
        if (n2Var == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (n2Var.zza()) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj2 = m25265d(obj, i, intValue, obj2, s4Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!n2Var.zza()) {
                    obj2 = m25265d(obj, i, intValue2, obj2, s4Var);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    /* renamed from: d */
    static Object m25265d(Object obj, int i, int i2, Object obj2, C3724s4 s4Var) {
        if (obj2 == null) {
            obj2 = s4Var.mo16733c(obj);
        }
        s4Var.mo16742l(obj2, i, (long) i2);
        return obj2;
    }

    /* renamed from: e */
    static void m25266e(C3884x1 x1Var, Object obj, Object obj2) {
        x1Var.mo17018a(obj2);
        throw null;
    }

    /* renamed from: f */
    static void m25267f(C3724s4 s4Var, Object obj, Object obj2) {
        s4Var.mo16745o(obj, s4Var.mo16735e(s4Var.mo16734d(obj), s4Var.mo16734d(obj2)));
    }

    /* renamed from: g */
    public static void m25268g(Class cls) {
        Class cls2;
        if (!C3425j2.class.isAssignableFrom(cls) && (cls2 = f21857a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    static boolean m25269h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: i */
    static void m25270i(C3426j3 j3Var, Object obj, Object obj2, long j) {
        C3197c5.m25316x(obj, j, C3426j3.m25887c(C3197c5.m25303k(obj, j), C3197c5.m25303k(obj2, j)));
    }

    /* renamed from: j */
    public static void m25271j(int i, List list, C3721s1 s1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.mo16717n(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m25272k(int i, List list, C3721s1 s1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.mo16719p(i, list);
        }
    }

    /* renamed from: l */
    public static void m25273l(int i, List list, C3721s1 s1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.mo16721r(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m25274m(int i, List list, C3721s1 s1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.mo16724u(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m25275n(int i, List list, C3721s1 s1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.mo16726w(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m25276o(int i, List list, C3721s1 s1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.mo16728y(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m25277p(int i, List list, C3721s1 s1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.mo16694A(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m25278q(int i, List list, C3721s1 s1Var, C3130a4 a4Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                s1Var.mo16695B(i, list.get(i2), a4Var);
            }
        }
    }

    /* renamed from: r */
    public static void m25279r(int i, List list, C3721s1 s1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.mo16697D(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m25280s(int i, List list, C3721s1 s1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.mo16699F(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m25281t(int i, List list, C3721s1 s1Var, C3130a4 a4Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                s1Var.mo16700G(i, list.get(i2), a4Var);
            }
        }
    }

    /* renamed from: u */
    public static void m25282u(int i, List list, C3721s1 s1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.mo16702I(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m25283v(int i, List list, C3721s1 s1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.mo16704K(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m25284w(int i, List list, C3721s1 s1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.mo16706b(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m25285x(int i, List list, C3721s1 s1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.mo16708d(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m25286y(int i, List list, C3721s1 s1Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.mo16711g(i, list);
        }
    }

    /* renamed from: z */
    public static void m25287z(int i, List list, C3721s1 s1Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            s1Var.mo16713i(i, list, z);
        }
    }
}
