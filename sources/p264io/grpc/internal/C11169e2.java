package p264io.grpc.internal;

import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6419h;
import p182a7.C6425j;
import p182a7.C6431n;
import p182a7.C6448w;
import p182a7.C6449x;
import p264io.grpc.internal.C11436z1;
import p343rc.C12276a1;
import p343rc.C12335j1;
import p343rc.C12390s0;
import p343rc.C12396t0;

/* renamed from: io.grpc.internal.e2 */
/* compiled from: ServiceConfigUtil */
public final class C11169e2 {

    /* renamed from: io.grpc.internal.e2$a */
    /* compiled from: ServiceConfigUtil */
    public static final class C11170a {

        /* renamed from: a */
        private final String f43057a;

        /* renamed from: b */
        private final Map<String, ?> f43058b;

        public C11170a(String str, Map<String, ?> map) {
            this.f43057a = (String) C6431n.m37562o(str, "policyName");
            this.f43058b = (Map) C6431n.m37562o(map, "rawConfigValue");
        }

        /* renamed from: a */
        public String mo35040a() {
            return this.f43057a;
        }

        /* renamed from: b */
        public Map<String, ?> mo35041b() {
            return this.f43058b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C11170a)) {
                return false;
            }
            C11170a aVar = (C11170a) obj;
            if (!this.f43057a.equals(aVar.f43057a) || !this.f43058b.equals(aVar.f43058b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C6425j.m37542b(this.f43057a, this.f43058b);
        }

        public String toString() {
            return C6419h.m37528c(this).mo21842d("policyName", this.f43057a).mo21842d("rawConfigValue", this.f43058b).toString();
        }
    }

    /* renamed from: io.grpc.internal.e2$b */
    /* compiled from: ServiceConfigUtil */
    public static final class C11171b {

        /* renamed from: a */
        final C12390s0 f43059a;

        /* renamed from: b */
        final Object f43060b;

        public C11171b(C12390s0 s0Var, Object obj) {
            this.f43059a = (C12390s0) C6431n.m37562o(s0Var, "provider");
            this.f43060b = obj;
        }

        /* renamed from: a */
        public Object mo35045a() {
            return this.f43060b;
        }

        /* renamed from: b */
        public C12390s0 mo35046b() {
            return this.f43059a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C11171b.class != obj.getClass()) {
                return false;
            }
            C11171b bVar = (C11171b) obj;
            if (!C6425j.m37541a(this.f43059a, bVar.f43059a) || !C6425j.m37541a(this.f43060b, bVar.f43060b)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C6425j.m37542b(this.f43059a, this.f43060b);
        }

        public String toString() {
            return C6419h.m37528c(this).mo21842d("provider", this.f43059a).mo21842d("config", this.f43060b).toString();
        }
    }

    private C11169e2() {
    }

    /* renamed from: A */
    public static List<C11170a> m55238A(List<Map<String, ?>> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map<String, ?> z : list) {
            arrayList.add(m55264z(z));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    static Double m55239a(Map<String, ?> map) {
        return C11135b1.m55115h(map, "backoffMultiplier");
    }

    /* renamed from: b */
    public static Map<String, ?> m55240b(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        return C11135b1.m55117j(map, "healthCheckConfig");
    }

    /* renamed from: c */
    static Long m55241c(Map<String, ?> map) {
        return C11135b1.m55119l(map, "hedgingDelay");
    }

    /* renamed from: d */
    static Map<String, ?> m55242d(Map<String, ?> map) {
        return C11135b1.m55117j(map, "hedgingPolicy");
    }

    /* renamed from: e */
    static Long m55243e(Map<String, ?> map) {
        return C11135b1.m55119l(map, "initialBackoff");
    }

    /* renamed from: f */
    private static Set<C12335j1.C12337b> m55244f(Map<String, ?> map, String str) {
        List<?> e = C11135b1.m55112e(map, str);
        if (e == null) {
            return null;
        }
        return m55259u(e);
    }

    /* renamed from: g */
    public static List<Map<String, ?>> m55245g(Map<String, ?> map) {
        String k;
        ArrayList arrayList = new ArrayList();
        if (map.containsKey("loadBalancingConfig")) {
            arrayList.addAll(C11135b1.m55113f(map, "loadBalancingConfig"));
        }
        if (arrayList.isEmpty() && (k = C11135b1.m55118k(map, "loadBalancingPolicy")) != null) {
            arrayList.add(Collections.singletonMap(k.toLowerCase(Locale.ROOT), Collections.emptyMap()));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: h */
    static Integer m55246h(Map<String, ?> map) {
        return C11135b1.m55116i(map, "maxAttempts");
    }

    /* renamed from: i */
    static Integer m55247i(Map<String, ?> map) {
        return C11135b1.m55116i(map, "maxAttempts");
    }

    /* renamed from: j */
    static Long m55248j(Map<String, ?> map) {
        return C11135b1.m55119l(map, "maxBackoff");
    }

    /* renamed from: k */
    static Integer m55249k(Map<String, ?> map) {
        return C11135b1.m55116i(map, "maxRequestMessageBytes");
    }

    /* renamed from: l */
    static Integer m55250l(Map<String, ?> map) {
        return C11135b1.m55116i(map, "maxResponseMessageBytes");
    }

    /* renamed from: m */
    static List<Map<String, ?>> m55251m(Map<String, ?> map) {
        return C11135b1.m55113f(map, "methodConfig");
    }

    /* renamed from: n */
    static String m55252n(Map<String, ?> map) {
        return C11135b1.m55118k(map, "method");
    }

    /* renamed from: o */
    static List<Map<String, ?>> m55253o(Map<String, ?> map) {
        return C11135b1.m55113f(map, MediationMetaData.KEY_NAME);
    }

    /* renamed from: p */
    static Set<C12335j1.C12337b> m55254p(Map<String, ?> map) {
        Set<C12335j1.C12337b> f = m55244f(map, "nonFatalStatusCodes");
        if (f == null) {
            return Collections.unmodifiableSet(EnumSet.noneOf(C12335j1.C12337b.class));
        }
        C6448w.m37612a(!f.contains(C12335j1.C12337b.OK), "%s must not contain OK", "nonFatalStatusCodes");
        return f;
    }

    /* renamed from: q */
    static Long m55255q(Map<String, ?> map) {
        return C11135b1.m55119l(map, "perAttemptRecvTimeout");
    }

    /* renamed from: r */
    static Map<String, ?> m55256r(Map<String, ?> map) {
        return C11135b1.m55117j(map, "retryPolicy");
    }

    /* renamed from: s */
    static Set<C12335j1.C12337b> m55257s(Map<String, ?> map) {
        Set<C12335j1.C12337b> f = m55244f(map, "retryableStatusCodes");
        C6448w.m37612a(f != null, "%s is required in retry policy", "retryableStatusCodes");
        C6448w.m37612a(true ^ f.contains(C12335j1.C12337b.OK), "%s must not contain OK", "retryableStatusCodes");
        return f;
    }

    /* renamed from: t */
    static String m55258t(Map<String, ?> map) {
        return C11135b1.m55118k(map, "service");
    }

    /* renamed from: u */
    private static Set<C12335j1.C12337b> m55259u(List<?> list) {
        C12335j1.C12337b bVar;
        EnumSet<E> noneOf = EnumSet.noneOf(C12335j1.C12337b.class);
        for (Object next : list) {
            if (next instanceof Double) {
                Double d = (Double) next;
                int intValue = d.intValue();
                boolean z = true;
                C6448w.m37612a(((double) intValue) == d.doubleValue(), "Status code %s is not integral", next);
                bVar = C12335j1.m59102h(intValue).mo37026m();
                if (bVar.mo37033c() != d.intValue()) {
                    z = false;
                }
                C6448w.m37612a(z, "Status code %s is not valid", next);
            } else if (next instanceof String) {
                try {
                    bVar = C12335j1.C12337b.valueOf((String) next);
                } catch (IllegalArgumentException e) {
                    throw new C6449x("Status code " + next + " is not valid", e);
                }
            } else {
                throw new C6449x("Can not convert status code " + next + " to Status.Code, because its type is " + next.getClass());
            }
            noneOf.add(bVar);
        }
        return Collections.unmodifiableSet(noneOf);
    }

    /* renamed from: v */
    static C11436z1.C11451c0 m55260v(Map<String, ?> map) {
        Map<String, ?> j;
        if (map == null || (j = C11135b1.m55117j(map, "retryThrottling")) == null) {
            return null;
        }
        float floatValue = C11135b1.m55115h(j, "maxTokens").floatValue();
        float floatValue2 = C11135b1.m55115h(j, "tokenRatio").floatValue();
        boolean z = true;
        C6431n.m37568u(floatValue > 0.0f, "maxToken should be greater than zero");
        if (floatValue2 <= 0.0f) {
            z = false;
        }
        C6431n.m37568u(z, "tokenRatio should be greater than zero");
        return new C11436z1.C11451c0(floatValue, floatValue2);
    }

    /* renamed from: w */
    static Long m55261w(Map<String, ?> map) {
        return C11135b1.m55119l(map, "timeout");
    }

    /* renamed from: x */
    static Boolean m55262x(Map<String, ?> map) {
        return C11135b1.m55111d(map, "waitForReady");
    }

    /* renamed from: y */
    public static C12276a1.C12280c m55263y(List<C11170a> list, C12396t0 t0Var) {
        ArrayList arrayList = new ArrayList();
        for (C11170a next : list) {
            String a = next.mo35040a();
            C12390s0 d = t0Var.mo37136d(a);
            if (d == null) {
                arrayList.add(a);
            } else {
                if (!arrayList.isEmpty()) {
                    Logger.getLogger(C11169e2.class.getName()).log(Level.FINEST, "{0} specified by Service Config are not available", arrayList);
                }
                C12276a1.C12280c e = d.mo35330e(next.mo35041b());
                if (e.mo36940d() != null) {
                    return e;
                }
                return C12276a1.C12280c.m58963a(new C11171b(d, e.mo36939c()));
            }
        }
        C12335j1 j1Var = C12335j1.f45608h;
        return C12276a1.C12280c.m58964b(j1Var.mo37030q("None of " + arrayList + " specified by Service Config are available."));
    }

    /* renamed from: z */
    public static C11170a m55264z(Map<String, ?> map) {
        if (map.size() == 1) {
            String str = (String) map.entrySet().iterator().next().getKey();
            return new C11170a(str, C11135b1.m55117j(map, str));
        }
        throw new RuntimeException("There are " + map.size() + " fields in a LoadBalancingConfig object. Exactly one is expected. Config=" + map);
    }
}
