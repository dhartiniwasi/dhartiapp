package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ab */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C6878ab {

    /* renamed from: a */
    private static final Class f31561a;

    /* renamed from: b */
    private static final C7141qb f31562b = m39478C(false);

    /* renamed from: c */
    private static final C7141qb f31563c = m39478C(true);

    /* renamed from: d */
    private static final C7141qb f31564d = new C7173sb();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f31561a = cls;
    }

    /* renamed from: A */
    static int m39476A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C7106o8.m40502a(i << 3) + 1);
    }

    /* renamed from: B */
    static void m39477B(C7012ia iaVar, Object obj, Object obj2, long j) {
        C6879ac.m39558x(obj, j, C7012ia.m40211b(C6879ac.m39545k(obj, j), C6879ac.m39545k(obj2, j)));
    }

    /* renamed from: C */
    private static C7141qb m39478C(boolean z) {
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
            return (C7141qb) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    static int m39479D(List list) {
        return list.size();
    }

    /* renamed from: E */
    static int m39480E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = size * C7106o8.m40501D(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            D += C7106o8.m40506x((C6977g8) list.get(i2));
        }
        return D;
    }

    /* renamed from: F */
    static int m39481F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m39482G(list) + (size * C7106o8.m40501D(i));
    }

    /* renamed from: G */
    static int m39482G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7011i9) {
            C7011i9 i9Var = (C7011i9) list;
            i = 0;
            while (i2 < size) {
                i += C7106o8.m40508z(i9Var.mo23527c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C7106o8.m40508z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    static int m39483H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C7106o8.m40502a(i << 3) + 4);
    }

    /* renamed from: I */
    static int m39484I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    static int m39485J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (C7106o8.m40502a(i << 3) + 8);
    }

    /* renamed from: K */
    static int m39486K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    static int m39487L(int i, List list, C7268ya yaVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += C7106o8.m40507y(i, (C7092na) list.get(i3), yaVar);
        }
        return i2;
    }

    /* renamed from: M */
    static int m39488M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m39489N(list) + (size * C7106o8.m40501D(i));
    }

    /* renamed from: N */
    static int m39489N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7011i9) {
            C7011i9 i9Var = (C7011i9) list;
            i = 0;
            while (i2 < size) {
                i += C7106o8.m40508z(i9Var.mo23527c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C7106o8.m40508z(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m39490O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m39491P(list) + (list.size() * C7106o8.m40501D(i));
    }

    /* renamed from: P */
    static int m39491P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6911ca) {
            C6911ca caVar = (C6911ca) list;
            i = 0;
            while (i2 < size) {
                i += C7106o8.m40503b(caVar.mo23255g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C7106o8.m40503b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    static int m39492Q(int i, Object obj, C7268ya yaVar) {
        if (!(obj instanceof C7171s9)) {
            return C7106o8.m40502a(i << 3) + C7106o8.m40499B((C7092na) obj, yaVar);
        }
        int a = C7106o8.m40502a(i << 3);
        int a2 = ((C7171s9) obj).mo23875a();
        return a + C7106o8.m40502a(a2) + a2;
    }

    /* renamed from: R */
    static int m39493R(int i, List list, C7268ya yaVar) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int D = C7106o8.m40501D(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof C7171s9) {
                i2 = C7106o8.m40498A((C7171s9) obj);
            } else {
                i2 = C7106o8.m40499B((C7092na) obj, yaVar);
            }
            D += i2;
        }
        return D;
    }

    /* renamed from: S */
    static int m39494S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m39495T(list) + (size * C7106o8.m40501D(i));
    }

    /* renamed from: T */
    static int m39495T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7011i9) {
            C7011i9 i9Var = (C7011i9) list;
            i = 0;
            while (i2 < size) {
                int c = i9Var.mo23527c(i2);
                i += C7106o8.m40502a((c >> 31) ^ (c + c));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + C7106o8.m40502a((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m39496U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m39497V(list) + (size * C7106o8.m40501D(i));
    }

    /* renamed from: V */
    static int m39497V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6911ca) {
            C6911ca caVar = (C6911ca) list;
            i = 0;
            while (i2 < size) {
                long g = caVar.mo23255g(i2);
                i += C7106o8.m40503b((g >> 63) ^ (g + g));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + C7106o8.m40503b((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    static int m39498W(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int D = C7106o8.m40501D(i) * size;
        if (list instanceof C7203u9) {
            C7203u9 u9Var = (C7203u9) list;
            while (i4 < size) {
                Object p = u9Var.mo23891p(i4);
                if (p instanceof C6977g8) {
                    i3 = C7106o8.m40506x((C6977g8) p);
                } else {
                    i3 = C7106o8.m40500C((String) p);
                }
                D += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof C6977g8) {
                    i2 = C7106o8.m40506x((C6977g8) obj);
                } else {
                    i2 = C7106o8.m40500C((String) obj);
                }
                D += i2;
                i4++;
            }
        }
        return D;
    }

    /* renamed from: X */
    static int m39499X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m39500Y(list) + (size * C7106o8.m40501D(i));
    }

    /* renamed from: Y */
    static int m39500Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C7011i9) {
            C7011i9 i9Var = (C7011i9) list;
            i = 0;
            while (i2 < size) {
                i += C7106o8.m40502a(i9Var.mo23527c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C7106o8.m40502a(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    static int m39501Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m39503a0(list) + (size * C7106o8.m40501D(i));
    }

    /* renamed from: a */
    public static C7141qb m39502a() {
        return f31563c;
    }

    /* renamed from: a0 */
    static int m39503a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6911ca) {
            C6911ca caVar = (C6911ca) list;
            i = 0;
            while (i2 < size) {
                i += C7106o8.m40503b(caVar.mo23255g(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + C7106o8.m40503b(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C7141qb m39504b() {
        return f31564d;
    }

    /* renamed from: b0 */
    public static C7141qb m39505b0() {
        return f31562b;
    }

    /* renamed from: c */
    static Object m39506c(Object obj, int i, List list, C7043k9 k9Var, Object obj2, C7141qb qbVar) {
        Object obj3 = null;
        if (k9Var == null) {
            return null;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (k9Var.mo23350g(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj3 = m39507d(obj, i, intValue, obj3, qbVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj3;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!k9Var.mo23350g(intValue2)) {
                    obj3 = m39507d(obj, i, intValue2, obj3, qbVar);
                    it.remove();
                }
            }
        }
        return obj3;
    }

    /* renamed from: d */
    static Object m39507d(Object obj, int i, int i2, Object obj2, C7141qb qbVar) {
        if (obj2 == null) {
            obj2 = qbVar.mo23793c(obj);
        }
        qbVar.mo23796f(obj2, i, (long) i2);
        return obj2;
    }

    /* renamed from: e */
    static void m39508e(C7202u8 u8Var, Object obj, Object obj2) {
        u8Var.mo23928a(obj2);
        throw null;
    }

    /* renamed from: f */
    static void m39509f(C7141qb qbVar, Object obj, Object obj2) {
        qbVar.mo23798h(obj, qbVar.mo23795e(qbVar.mo23794d(obj), qbVar.mo23794d(obj2)));
    }

    /* renamed from: g */
    public static void m39510g(Class cls) {
        Class cls2;
        if (!C6995h9.class.isAssignableFrom(cls) && (cls2 = f31561a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static void m39511h(int i, List list, C7030jc jcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            jcVar.mo23582o(i, list, z);
        }
    }

    /* renamed from: i */
    public static void m39512i(int i, List list, C7030jc jcVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            jcVar.mo23577j(i, list);
        }
    }

    /* renamed from: j */
    public static void m39513j(int i, List list, C7030jc jcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            jcVar.mo23565H(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m39514k(int i, List list, C7030jc jcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            jcVar.mo23590w(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m39515l(int i, List list, C7030jc jcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            jcVar.mo23586s(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m39516m(int i, List list, C7030jc jcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            jcVar.mo23593z(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m39517n(int i, List list, C7030jc jcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            jcVar.mo23568K(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m39518o(int i, List list, C7030jc jcVar, C7268ya yaVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C7122p8) jcVar).mo23585r(i, list.get(i2), yaVar);
            }
        }
    }

    /* renamed from: p */
    public static void m39519p(int i, List list, C7030jc jcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            jcVar.mo23588u(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m39520q(int i, List list, C7030jc jcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            jcVar.mo23562E(i, list, z);
        }
    }

    /* renamed from: r */
    public static void m39521r(int i, List list, C7030jc jcVar, C7268ya yaVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ((C7122p8) jcVar).mo23570M(i, list.get(i2), yaVar);
            }
        }
    }

    /* renamed from: s */
    public static void m39522s(int i, List list, C7030jc jcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            jcVar.mo23564G(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m39523t(int i, List list, C7030jc jcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            jcVar.mo23575i(i, list, z);
        }
    }

    /* renamed from: u */
    public static void m39524u(int i, List list, C7030jc jcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            jcVar.mo23561D(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m39525v(int i, List list, C7030jc jcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            jcVar.mo23569L(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m39526w(int i, List list, C7030jc jcVar) throws IOException {
        if (list != null && !list.isEmpty()) {
            jcVar.mo23591x(i, list);
        }
    }

    /* renamed from: x */
    public static void m39527x(int i, List list, C7030jc jcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            jcVar.mo23584q(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m39528y(int i, List list, C7030jc jcVar, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            jcVar.mo23563F(i, list, z);
        }
    }

    /* renamed from: z */
    static boolean m39529z(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }
}
