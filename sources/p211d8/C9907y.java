package p211d8;

import com.google.protobuf.C8137e1;
import com.google.protobuf.C8153i;
import com.google.protobuf.C8234t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p200c9.C6838a;
import p247h8.C10432b;
import p247h8.C10449g0;
import p405y8.C13085b;
import p405y8.C13088b0;
import p405y8.C13092c;
import p405y8.C13161s;

/* renamed from: d8.y */
/* compiled from: Values */
public class C9907y {

    /* renamed from: a */
    public static final C13088b0 f39757a = ((C13088b0) C13088b0.m61490y0().mo38128I(Double.NaN).build());

    /* renamed from: b */
    public static final C13088b0 f39758b;

    /* renamed from: c */
    public static final C13088b0 f39759c;

    /* renamed from: d */
    private static final C13088b0 f39760d;

    /* renamed from: e */
    public static final C13088b0 f39761e;

    /* renamed from: d8.y$a */
    /* compiled from: Values */
    static /* synthetic */ class C9908a {

        /* renamed from: a */
        static final /* synthetic */ int[] f39762a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                y8.b0$c[] r0 = p405y8.C13088b0.C13091c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39762a = r0
                y8.b0$c r1 = p405y8.C13088b0.C13091c.NULL_VALUE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39762a     // Catch:{ NoSuchFieldError -> 0x001d }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.BOOLEAN_VALUE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f39762a     // Catch:{ NoSuchFieldError -> 0x0028 }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.INTEGER_VALUE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f39762a     // Catch:{ NoSuchFieldError -> 0x0033 }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.DOUBLE_VALUE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f39762a     // Catch:{ NoSuchFieldError -> 0x003e }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.TIMESTAMP_VALUE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f39762a     // Catch:{ NoSuchFieldError -> 0x0049 }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.STRING_VALUE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f39762a     // Catch:{ NoSuchFieldError -> 0x0054 }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.BYTES_VALUE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f39762a     // Catch:{ NoSuchFieldError -> 0x0060 }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.REFERENCE_VALUE     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f39762a     // Catch:{ NoSuchFieldError -> 0x006c }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.GEO_POINT_VALUE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f39762a     // Catch:{ NoSuchFieldError -> 0x0078 }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.ARRAY_VALUE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f39762a     // Catch:{ NoSuchFieldError -> 0x0084 }
                y8.b0$c r1 = p405y8.C13088b0.C13091c.MAP_VALUE     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p211d8.C9907y.C9908a.<clinit>():void");
        }
    }

    static {
        C13088b0 b0Var = (C13088b0) C13088b0.m61490y0().mo38133N(C8137e1.NULL_VALUE).build();
        f39758b = b0Var;
        f39759c = b0Var;
        C13088b0 b0Var2 = (C13088b0) C13088b0.m61490y0().mo38135P("__max__").build();
        f39760d = b0Var2;
        f39761e = (C13088b0) C13088b0.m61490y0().mo38131L(C13161s.m61758k0().mo38232F("__type__", b0Var2)).build();
    }

    /* renamed from: A */
    public static boolean m50798A(C13088b0 b0Var) {
        return m50827v(b0Var) || m50826u(b0Var);
    }

    /* renamed from: B */
    public static boolean m50799B(C13088b0 b0Var) {
        return b0Var != null && b0Var.mo38122x0() == C13088b0.C13091c.REFERENCE_VALUE;
    }

    /* renamed from: C */
    public static int m50800C(C13088b0 b0Var, boolean z, C13088b0 b0Var2, boolean z2) {
        int i = m50814i(b0Var, b0Var2);
        if (i != 0) {
            return i;
        }
        if (!z || z2) {
            return (z || !z2) ? 0 : 1;
        }
        return -1;
    }

    /* renamed from: D */
    private static boolean m50801D(C13088b0 b0Var, C13088b0 b0Var2) {
        C13088b0.C13091c x0 = b0Var.mo38122x0();
        C13088b0.C13091c cVar = C13088b0.C13091c.INTEGER_VALUE;
        if (x0 != cVar || b0Var2.mo38122x0() != cVar) {
            C13088b0.C13091c x02 = b0Var.mo38122x0();
            C13088b0.C13091c cVar2 = C13088b0.C13091c.DOUBLE_VALUE;
            if (x02 == cVar2 && b0Var2.mo38122x0() == cVar2 && Double.doubleToLongBits(b0Var.mo38115q0()) == Double.doubleToLongBits(b0Var2.mo38115q0())) {
                return true;
            }
            return false;
        } else if (b0Var.mo38117s0() == b0Var2.mo38117s0()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: E */
    private static boolean m50802E(C13088b0 b0Var, C13088b0 b0Var2) {
        C13161s t0 = b0Var.mo38118t0();
        C13161s t02 = b0Var2.mo38118t0();
        if (t0.mo38226d0() != t02.mo38226d0()) {
            return false;
        }
        for (Map.Entry next : t0.mo38227e0().entrySet()) {
            if (!m50822q((C13088b0) next.getValue(), t02.mo38227e0().get(next.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: F */
    public static C13088b0 m50803F(C9882f fVar, C9888l lVar) {
        return (C13088b0) C13088b0.m61490y0().mo38134O(String.format("projects/%s/databases/%s/documents/%s", new Object[]{fVar.mo32367k(), fVar.mo32366j(), lVar.toString()})).build();
    }

    /* renamed from: G */
    public static int m50804G(C13088b0 b0Var) {
        switch (C9908a.f39762a[b0Var.mo38122x0().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                if (C9904v.m50790c(b0Var)) {
                    return 4;
                }
                return m50829x(b0Var) ? Integer.MAX_VALUE : 10;
            default:
                throw C10432b.m52645a("Invalid value type: " + b0Var.mo38122x0(), new Object[0]);
        }
    }

    /* renamed from: H */
    public static int m50805H(C13088b0 b0Var, boolean z, C13088b0 b0Var2, boolean z2) {
        int i = m50814i(b0Var, b0Var2);
        if (i != 0) {
            return i;
        }
        if (!z || z2) {
            return (z || !z2) ? 0 : -1;
        }
        return 1;
    }

    /* renamed from: a */
    private static boolean m50806a(C13088b0 b0Var, C13088b0 b0Var2) {
        C13085b m0 = b0Var.mo38112m0();
        C13085b m02 = b0Var2.mo38112m0();
        if (m0.mo38106j0() != m02.mo38106j0()) {
            return false;
        }
        for (int i = 0; i < m0.mo38106j0(); i++) {
            if (!m50822q(m0.mo38105i0(i), m02.mo38105i0(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m50807b(C13088b0 b0Var) {
        StringBuilder sb = new StringBuilder();
        m50813h(sb, b0Var);
        return sb.toString();
    }

    /* renamed from: c */
    private static void m50808c(StringBuilder sb, C13085b bVar) {
        sb.append("[");
        for (int i = 0; i < bVar.mo38106j0(); i++) {
            m50813h(sb, bVar.mo38105i0(i));
            if (i != bVar.mo38106j0() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
    }

    /* renamed from: d */
    private static void m50809d(StringBuilder sb, C6838a aVar) {
        sb.append(String.format("geo(%s,%s)", new Object[]{Double.valueOf(aVar.mo22936e0()), Double.valueOf(aVar.mo22937f0())}));
    }

    /* renamed from: e */
    private static void m50810e(StringBuilder sb, C13161s sVar) {
        ArrayList<String> arrayList = new ArrayList<>(sVar.mo38227e0().keySet());
        Collections.sort(arrayList);
        sb.append("{");
        boolean z = true;
        for (String str : arrayList) {
            if (!z) {
                sb.append(",");
            } else {
                z = false;
            }
            sb.append(str);
            sb.append(":");
            m50813h(sb, sVar.mo38229g0(str));
        }
        sb.append("}");
    }

    /* renamed from: f */
    private static void m50811f(StringBuilder sb, C13088b0 b0Var) {
        C10432b.m52648d(m50799B(b0Var), "Value should be a ReferenceValue", new Object[0]);
        sb.append(C9888l.m50696k(b0Var.mo38119u0()));
    }

    /* renamed from: g */
    private static void m50812g(StringBuilder sb, C8234t1 t1Var) {
        sb.append(String.format("time(%s,%s)", new Object[]{Long.valueOf(t1Var.mo27291f0()), Integer.valueOf(t1Var.mo27290e0())}));
    }

    /* renamed from: h */
    private static void m50813h(StringBuilder sb, C13088b0 b0Var) {
        switch (C9908a.f39762a[b0Var.mo38122x0().ordinal()]) {
            case 1:
                sb.append("null");
                return;
            case 2:
                sb.append(b0Var.mo38113n0());
                return;
            case 3:
                sb.append(b0Var.mo38117s0());
                return;
            case 4:
                sb.append(b0Var.mo38115q0());
                return;
            case 5:
                m50812g(sb, b0Var.mo38121w0());
                return;
            case 6:
                sb.append(b0Var.mo38120v0());
                return;
            case 7:
                sb.append(C10449g0.m52698A(b0Var.mo38114o0()));
                return;
            case 8:
                m50811f(sb, b0Var);
                return;
            case 9:
                m50809d(sb, b0Var.mo38116r0());
                return;
            case 10:
                m50808c(sb, b0Var.mo38112m0());
                return;
            case 11:
                m50810e(sb, b0Var.mo38118t0());
                return;
            default:
                throw C10432b.m52645a("Invalid value type: " + b0Var.mo38122x0(), new Object[0]);
        }
    }

    /* renamed from: i */
    public static int m50814i(C13088b0 b0Var, C13088b0 b0Var2) {
        int G = m50804G(b0Var);
        int G2 = m50804G(b0Var2);
        if (G != G2) {
            return C10449g0.m52712l(G, G2);
        }
        if (G != Integer.MAX_VALUE) {
            switch (G) {
                case 0:
                    break;
                case 1:
                    return C10449g0.m52708h(b0Var.mo38113n0(), b0Var2.mo38113n0());
                case 2:
                    return m50818m(b0Var, b0Var2);
                case 3:
                    return m50820o(b0Var.mo38121w0(), b0Var2.mo38121w0());
                case 4:
                    return m50820o(C9904v.m50788a(b0Var), C9904v.m50788a(b0Var2));
                case 5:
                    return b0Var.mo38120v0().compareTo(b0Var2.mo38120v0());
                case 6:
                    return C10449g0.m52710j(b0Var.mo38114o0(), b0Var2.mo38114o0());
                case 7:
                    return m50819n(b0Var.mo38119u0(), b0Var2.mo38119u0());
                case 8:
                    return m50816k(b0Var.mo38116r0(), b0Var2.mo38116r0());
                case 9:
                    return m50815j(b0Var.mo38112m0(), b0Var2.mo38112m0());
                case 10:
                    return m50817l(b0Var.mo38118t0(), b0Var2.mo38118t0());
                default:
                    throw C10432b.m52645a("Invalid value type: " + G, new Object[0]);
            }
        }
        return 0;
    }

    /* renamed from: j */
    private static int m50815j(C13085b bVar, C13085b bVar2) {
        int min = Math.min(bVar.mo38106j0(), bVar2.mo38106j0());
        for (int i = 0; i < min; i++) {
            int i2 = m50814i(bVar.mo38105i0(i), bVar2.mo38105i0(i));
            if (i2 != 0) {
                return i2;
            }
        }
        return C10449g0.m52712l(bVar.mo38106j0(), bVar2.mo38106j0());
    }

    /* renamed from: k */
    private static int m50816k(C6838a aVar, C6838a aVar2) {
        int k = C10449g0.m52711k(aVar.mo22936e0(), aVar2.mo22936e0());
        return k == 0 ? C10449g0.m52711k(aVar.mo22937f0(), aVar2.mo22937f0()) : k;
    }

    /* renamed from: l */
    private static int m50817l(C13161s sVar, C13161s sVar2) {
        Iterator it = new TreeMap(sVar.mo38227e0()).entrySet().iterator();
        Iterator it2 = new TreeMap(sVar2.mo38227e0()).entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int compareTo = ((String) entry.getKey()).compareTo((String) entry2.getKey());
            if (compareTo != 0) {
                return compareTo;
            }
            int i = m50814i((C13088b0) entry.getValue(), (C13088b0) entry2.getValue());
            if (i != 0) {
                return i;
            }
        }
        return C10449g0.m52708h(it.hasNext(), it2.hasNext());
    }

    /* renamed from: m */
    private static int m50818m(C13088b0 b0Var, C13088b0 b0Var2) {
        C13088b0.C13091c x0 = b0Var.mo38122x0();
        C13088b0.C13091c cVar = C13088b0.C13091c.DOUBLE_VALUE;
        if (x0 == cVar) {
            double q0 = b0Var.mo38115q0();
            if (b0Var2.mo38122x0() == cVar) {
                return C10449g0.m52711k(q0, b0Var2.mo38115q0());
            }
            if (b0Var2.mo38122x0() == C13088b0.C13091c.INTEGER_VALUE) {
                return C10449g0.m52714n(q0, b0Var2.mo38117s0());
            }
        } else {
            C13088b0.C13091c x02 = b0Var.mo38122x0();
            C13088b0.C13091c cVar2 = C13088b0.C13091c.INTEGER_VALUE;
            if (x02 == cVar2) {
                long s0 = b0Var.mo38117s0();
                if (b0Var2.mo38122x0() == cVar2) {
                    return C10449g0.m52713m(s0, b0Var2.mo38117s0());
                }
                if (b0Var2.mo38122x0() == cVar) {
                    return C10449g0.m52714n(b0Var2.mo38115q0(), s0) * -1;
                }
            }
        }
        throw C10432b.m52645a("Unexpected values: %s vs %s", b0Var, b0Var2);
    }

    /* renamed from: n */
    private static int m50819n(String str, String str2) {
        String[] split = str.split("/", -1);
        String[] split2 = str2.split("/", -1);
        int min = Math.min(split.length, split2.length);
        for (int i = 0; i < min; i++) {
            int compareTo = split[i].compareTo(split2[i]);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return C10449g0.m52712l(split.length, split2.length);
    }

    /* renamed from: o */
    private static int m50820o(C8234t1 t1Var, C8234t1 t1Var2) {
        int m = C10449g0.m52713m(t1Var.mo27291f0(), t1Var2.mo27291f0());
        if (m != 0) {
            return m;
        }
        return C10449g0.m52712l(t1Var.mo27290e0(), t1Var2.mo27290e0());
    }

    /* renamed from: p */
    public static boolean m50821p(C13092c cVar, C13088b0 b0Var) {
        for (C13088b0 q : cVar.mo38104g()) {
            if (m50822q(q, b0Var)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    public static boolean m50822q(C13088b0 b0Var, C13088b0 b0Var2) {
        int G;
        if (b0Var == b0Var2) {
            return true;
        }
        if (b0Var == null || b0Var2 == null || (G = m50804G(b0Var)) != m50804G(b0Var2)) {
            return false;
        }
        if (G == 2) {
            return m50801D(b0Var, b0Var2);
        }
        if (G == 4) {
            return C9904v.m50788a(b0Var).equals(C9904v.m50788a(b0Var2));
        }
        if (G == Integer.MAX_VALUE) {
            return true;
        }
        if (G == 9) {
            return m50806a(b0Var, b0Var2);
        }
        if (G != 10) {
            return b0Var.equals(b0Var2);
        }
        return m50802E(b0Var, b0Var2);
    }

    /* renamed from: r */
    public static C13088b0 m50823r(C13088b0.C13091c cVar) {
        switch (C9908a.f39762a[cVar.ordinal()]) {
            case 1:
                return f39758b;
            case 2:
                return (C13088b0) C13088b0.m61490y0().mo38126G(false).build();
            case 3:
            case 4:
                return (C13088b0) C13088b0.m61490y0().mo38128I(Double.NaN).build();
            case 5:
                return (C13088b0) C13088b0.m61490y0().mo38136Q(C8234t1.m45639g0().mo27293E(Long.MIN_VALUE)).build();
            case 6:
                return (C13088b0) C13088b0.m61490y0().mo38135P("").build();
            case 7:
                return (C13088b0) C13088b0.m61490y0().mo38127H(C8153i.f34908b).build();
            case 8:
                return m50803F(C9882f.f39708c, C9888l.m50694c());
            case 9:
                return (C13088b0) C13088b0.m61490y0().mo38129J(C6838a.m39385g0().mo22938D(-90.0d).mo22939E(-180.0d)).build();
            case 10:
                return (C13088b0) C13088b0.m61490y0().mo38125F(C13085b.m61454h0()).build();
            case 11:
                return (C13088b0) C13088b0.m61490y0().mo38132M(C13161s.m61754c0()).build();
            default:
                throw new IllegalArgumentException("Unknown value type: " + cVar);
        }
    }

    /* renamed from: s */
    public static C13088b0 m50824s(C13088b0.C13091c cVar) {
        switch (C9908a.f39762a[cVar.ordinal()]) {
            case 1:
                return m50823r(C13088b0.C13091c.BOOLEAN_VALUE);
            case 2:
                return m50823r(C13088b0.C13091c.INTEGER_VALUE);
            case 3:
            case 4:
                return m50823r(C13088b0.C13091c.TIMESTAMP_VALUE);
            case 5:
                return m50823r(C13088b0.C13091c.STRING_VALUE);
            case 6:
                return m50823r(C13088b0.C13091c.BYTES_VALUE);
            case 7:
                return m50823r(C13088b0.C13091c.REFERENCE_VALUE);
            case 8:
                return m50823r(C13088b0.C13091c.GEO_POINT_VALUE);
            case 9:
                return m50823r(C13088b0.C13091c.ARRAY_VALUE);
            case 10:
                return m50823r(C13088b0.C13091c.MAP_VALUE);
            case 11:
                return f39761e;
            default:
                throw new IllegalArgumentException("Unknown value type: " + cVar);
        }
    }

    /* renamed from: t */
    public static boolean m50825t(C13088b0 b0Var) {
        return b0Var != null && b0Var.mo38122x0() == C13088b0.C13091c.ARRAY_VALUE;
    }

    /* renamed from: u */
    public static boolean m50826u(C13088b0 b0Var) {
        return b0Var != null && b0Var.mo38122x0() == C13088b0.C13091c.DOUBLE_VALUE;
    }

    /* renamed from: v */
    public static boolean m50827v(C13088b0 b0Var) {
        return b0Var != null && b0Var.mo38122x0() == C13088b0.C13091c.INTEGER_VALUE;
    }

    /* renamed from: w */
    public static boolean m50828w(C13088b0 b0Var) {
        return b0Var != null && b0Var.mo38122x0() == C13088b0.C13091c.MAP_VALUE;
    }

    /* renamed from: x */
    public static boolean m50829x(C13088b0 b0Var) {
        return f39760d.equals(b0Var.mo38118t0().mo38227e0().get("__type__"));
    }

    /* renamed from: y */
    public static boolean m50830y(C13088b0 b0Var) {
        return b0Var != null && Double.isNaN(b0Var.mo38115q0());
    }

    /* renamed from: z */
    public static boolean m50831z(C13088b0 b0Var) {
        return b0Var != null && b0Var.mo38122x0() == C13088b0.C13091c.NULL_VALUE;
    }
}
