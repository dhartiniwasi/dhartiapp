package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class yz3 {

    /* renamed from: a */
    private static final Class f20864a;

    /* renamed from: b */
    private static final n04 f20865b = m24260C(false);

    /* renamed from: c */
    private static final n04 f20866c = m24260C(true);

    /* renamed from: d */
    private static final n04 f20867d = new q04();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f20864a = cls;
    }

    /* renamed from: A */
    static int m24258A(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zw3.m24869f(i << 3) + 1);
    }

    /* renamed from: B */
    public static void m24259B(int i, List list, ax3 ax3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ax3.mo8607k(i, list, z);
        }
    }

    /* renamed from: C */
    private static n04 m24260C(boolean z) {
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
            return (n04) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    static int m24261D(List list) {
        return list.size();
    }

    /* renamed from: E */
    static int m24262E(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * zw3.m24868e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += zw3.m24861E((jw3) list.get(i2));
        }
        return e;
    }

    /* renamed from: F */
    static int m24263F(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m24264G(list) + (size * zw3.m24868e(i));
    }

    /* renamed from: G */
    static int m24264G(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof tx3) {
            tx3 tx3 = (tx3) list;
            i = 0;
            while (i2 < size) {
                i += zw3.m24863G(tx3.mo14418c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zw3.m24863G(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: H */
    static int m24265H(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zw3.m24869f(i << 3) + 4);
    }

    /* renamed from: I */
    static int m24266I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    static int m24267J(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zw3.m24869f(i << 3) + 8);
    }

    /* renamed from: K */
    static int m24268K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    static int m24269L(int i, List list, wz3 wz3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zw3.m24862F(i, (cz3) list.get(i3), wz3);
        }
        return i2;
    }

    /* renamed from: M */
    static int m24270M(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m24271N(list) + (size * zw3.m24868e(i));
    }

    /* renamed from: N */
    static int m24271N(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof tx3) {
            tx3 tx3 = (tx3) list;
            i = 0;
            while (i2 < size) {
                i += zw3.m24863G(tx3.mo14418c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zw3.m24863G(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: O */
    static int m24272O(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m24273P(list) + (list.size() * zw3.m24868e(i));
    }

    /* renamed from: P */
    static int m24273P(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ry3) {
            ry3 ry3 = (ry3) list;
            i = 0;
            while (i2 < size) {
                i += zw3.m24870g(ry3.mo13898c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zw3.m24870g(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Q */
    static int m24274Q(int i, Object obj, wz3 wz3) {
        if (!(obj instanceof hy3)) {
            return zw3.m24869f(i << 3) + zw3.m24865b((cz3) obj, wz3);
        }
        int f = zw3.m24869f(i << 3);
        int a = ((hy3) obj).mo10969a();
        return f + zw3.m24869f(a) + a;
    }

    /* renamed from: R */
    static int m24275R(int i, List list, wz3 wz3) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = zw3.m24868e(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof hy3) {
                i2 = zw3.m24864H((hy3) obj);
            } else {
                i2 = zw3.m24865b((cz3) obj, wz3);
            }
            e += i2;
        }
        return e;
    }

    /* renamed from: S */
    static int m24276S(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m24277T(list) + (size * zw3.m24868e(i));
    }

    /* renamed from: T */
    static int m24277T(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof tx3) {
            tx3 tx3 = (tx3) list;
            i = 0;
            while (i2 < size) {
                int c = tx3.mo14418c(i2);
                i += zw3.m24869f((c >> 31) ^ (c + c));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + zw3.m24869f((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: U */
    static int m24278U(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m24279V(list) + (size * zw3.m24868e(i));
    }

    /* renamed from: V */
    static int m24279V(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ry3) {
            ry3 ry3 = (ry3) list;
            i = 0;
            while (i2 < size) {
                long c = ry3.mo13898c(i2);
                i += zw3.m24870g((c >> 63) ^ (c + c));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + zw3.m24870g((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    /* renamed from: W */
    static int m24280W(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int e = zw3.m24868e(i) * size;
        if (list instanceof jy3) {
            jy3 jy3 = (jy3) list;
            while (i4 < size) {
                Object p = jy3.mo11262p(i4);
                if (p instanceof jw3) {
                    i3 = zw3.m24861E((jw3) p);
                } else {
                    i3 = zw3.m24867d((String) p);
                }
                e += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof jw3) {
                    i2 = zw3.m24861E((jw3) obj);
                } else {
                    i2 = zw3.m24867d((String) obj);
                }
                e += i2;
                i4++;
            }
        }
        return e;
    }

    /* renamed from: X */
    static int m24281X(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m24282Y(list) + (size * zw3.m24868e(i));
    }

    /* renamed from: Y */
    static int m24282Y(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof tx3) {
            tx3 tx3 = (tx3) list;
            i = 0;
            while (i2 < size) {
                i += zw3.m24869f(tx3.mo14418c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zw3.m24869f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: Z */
    static int m24283Z(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m24285a0(list) + (size * zw3.m24868e(i));
    }

    /* renamed from: a */
    public static n04 m24284a() {
        return f20866c;
    }

    /* renamed from: a0 */
    static int m24285a0(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ry3) {
            ry3 ry3 = (ry3) list;
            i = 0;
            while (i2 < size) {
                i += zw3.m24870g(ry3.mo13898c(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zw3.m24870g(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static n04 m24286b() {
        return f20867d;
    }

    /* renamed from: b0 */
    public static n04 m24287b0() {
        return f20865b;
    }

    /* renamed from: c */
    static Object m24288c(int i, List list, wx3 wx3, Object obj, n04 n04) {
        if (wx3 == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (wx3.mo8195g(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = m24289d(i, intValue, obj, n04);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!wx3.mo8195g(intValue2)) {
                    obj = m24289d(i, intValue2, obj, n04);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: d */
    static Object m24289d(int i, int i2, Object obj, n04 n04) {
        if (obj == null) {
            obj = n04.mo12492f();
        }
        n04.mo12498l(obj, i, (long) i2);
        return obj;
    }

    /* renamed from: e */
    static void m24290e(fx3 fx3, Object obj, Object obj2) {
        fx3.mo10341a(obj2);
        throw null;
    }

    /* renamed from: f */
    static void m24291f(n04 n04, Object obj, Object obj2) {
        n04.mo12501o(obj, n04.mo12491e(n04.mo12490d(obj), n04.mo12490d(obj2)));
    }

    /* renamed from: g */
    public static void m24292g(Class cls) {
        Class cls2;
        if (!sx3.class.isAssignableFrom(cls) && (cls2 = f20864a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    static boolean m24293h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: i */
    static void m24294i(xy3 xy3, Object obj, Object obj2, long j) {
        y04.m23646D(obj, j, xy3.m23618c(y04.m23666p(obj, j), y04.m23666p(obj2, j)));
    }

    /* renamed from: j */
    public static void m24295j(int i, List list, ax3 ax3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ax3.mo8609n(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m24296k(int i, List list, ax3 ax3) throws IOException {
        if (list != null && !list.isEmpty()) {
            ax3.mo8611p(i, list);
        }
    }

    /* renamed from: l */
    public static void m24297l(int i, List list, ax3 ax3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ax3.mo8613r(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m24298m(int i, List list, ax3 ax3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ax3.mo8616u(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m24299n(int i, List list, ax3 ax3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ax3.mo8618w(i, list, z);
        }
    }

    /* renamed from: o */
    public static void m24300o(int i, List list, ax3 ax3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ax3.mo8620y(i, list, z);
        }
    }

    /* renamed from: p */
    public static void m24301p(int i, List list, ax3 ax3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ax3.mo8586A(i, list, z);
        }
    }

    /* renamed from: q */
    public static void m24302q(int i, List list, ax3 ax3, wz3 wz3) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ax3.mo8587B(i, list.get(i2), wz3);
            }
        }
    }

    /* renamed from: r */
    public static void m24303r(int i, List list, ax3 ax3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ax3.mo8589D(i, list, z);
        }
    }

    /* renamed from: s */
    public static void m24304s(int i, List list, ax3 ax3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ax3.mo8591F(i, list, z);
        }
    }

    /* renamed from: t */
    public static void m24305t(int i, List list, ax3 ax3, wz3 wz3) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                ax3.mo8592G(i, list.get(i2), wz3);
            }
        }
    }

    /* renamed from: u */
    public static void m24306u(int i, List list, ax3 ax3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ax3.mo8594I(i, list, z);
        }
    }

    /* renamed from: v */
    public static void m24307v(int i, List list, ax3 ax3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ax3.mo8596K(i, list, z);
        }
    }

    /* renamed from: w */
    public static void m24308w(int i, List list, ax3 ax3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ax3.mo8598b(i, list, z);
        }
    }

    /* renamed from: x */
    public static void m24309x(int i, List list, ax3 ax3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ax3.mo8600d(i, list, z);
        }
    }

    /* renamed from: y */
    public static void m24310y(int i, List list, ax3 ax3) throws IOException {
        if (list != null && !list.isEmpty()) {
            ax3.mo8603g(i, list);
        }
    }

    /* renamed from: z */
    public static void m24311z(int i, List list, ax3 ax3, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            ax3.mo8605i(i, list, z);
        }
    }
}
