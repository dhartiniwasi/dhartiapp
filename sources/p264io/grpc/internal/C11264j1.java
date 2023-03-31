package p264io.grpc.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p182a7.C6419h;
import p182a7.C6425j;
import p182a7.C6431n;
import p182a7.C6443s;
import p264io.grpc.internal.C11436z1;
import p343rc.C12292c;
import p343rc.C12314f0;
import p343rc.C12335j1;
import p343rc.C12376r0;
import p343rc.C12423z0;

/* renamed from: io.grpc.internal.j1 */
/* compiled from: ManagedChannelServiceConfig */
final class C11264j1 {

    /* renamed from: a */
    private final C11266b f43341a;

    /* renamed from: b */
    private final Map<String, C11266b> f43342b;

    /* renamed from: c */
    private final Map<String, C11266b> f43343c;

    /* renamed from: d */
    private final C11436z1.C11451c0 f43344d;

    /* renamed from: e */
    private final Object f43345e;

    /* renamed from: f */
    private final Map<String, ?> f43346f;

    /* renamed from: io.grpc.internal.j1$b */
    /* compiled from: ManagedChannelServiceConfig */
    static final class C11266b {

        /* renamed from: g */
        static final C12292c.C12293a<C11266b> f43347g = C12292c.C12293a.m59009b("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

        /* renamed from: a */
        final Long f43348a;

        /* renamed from: b */
        final Boolean f43349b;

        /* renamed from: c */
        final Integer f43350c;

        /* renamed from: d */
        final Integer f43351d;

        /* renamed from: e */
        final C11113a2 f43352e;

        /* renamed from: f */
        final C11360t0 f43353f;

        C11266b(Map<String, ?> map, boolean z, int i, int i2) {
            C11113a2 a2Var;
            this.f43348a = C11169e2.m55261w(map);
            this.f43349b = C11169e2.m55262x(map);
            Integer l = C11169e2.m55250l(map);
            this.f43350c = l;
            boolean z2 = true;
            if (l != null) {
                C6431n.m37557j(l.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", l);
            }
            Integer k = C11169e2.m55249k(map);
            this.f43351d = k;
            if (k != null) {
                C6431n.m37557j(k.intValue() < 0 ? false : z2, "maxOutboundMessageSize %s exceeds bounds", k);
            }
            C11360t0 t0Var = null;
            Map<String, ?> r = z ? C11169e2.m55256r(map) : null;
            if (r == null) {
                a2Var = null;
            } else {
                a2Var = m55555b(r, i);
            }
            this.f43352e = a2Var;
            Map<String, ?> d = z ? C11169e2.m55242d(map) : null;
            this.f43353f = d != null ? m55554a(d, i2) : t0Var;
        }

        /* renamed from: a */
        private static C11360t0 m55554a(Map<String, ?> map, int i) {
            int intValue = ((Integer) C6431n.m37562o(C11169e2.m55246h(map), "maxAttempts cannot be empty")).intValue();
            boolean z = true;
            C6431n.m37555h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i);
            long longValue = ((Long) C6431n.m37562o(C11169e2.m55241c(map), "hedgingDelay cannot be empty")).longValue();
            if (longValue < 0) {
                z = false;
            }
            C6431n.m37556i(z, "hedgingDelay must not be negative: %s", longValue);
            return new C11360t0(min, longValue, C11169e2.m55254p(map));
        }

        /* renamed from: b */
        private static C11113a2 m55555b(Map<String, ?> map, int i) {
            int intValue = ((Integer) C6431n.m37562o(C11169e2.m55247i(map), "maxAttempts cannot be empty")).intValue();
            boolean z = true;
            C6431n.m37555h(intValue >= 2, "maxAttempts must be greater than 1: %s", intValue);
            int min = Math.min(intValue, i);
            long longValue = ((Long) C6431n.m37562o(C11169e2.m55243e(map), "initialBackoff cannot be empty")).longValue();
            C6431n.m37556i(longValue > 0, "initialBackoffNanos must be greater than 0: %s", longValue);
            long longValue2 = ((Long) C6431n.m37562o(C11169e2.m55248j(map), "maxBackoff cannot be empty")).longValue();
            C6431n.m37556i(longValue2 > 0, "maxBackoff must be greater than 0: %s", longValue2);
            double doubleValue = ((Double) C6431n.m37562o(C11169e2.m55239a(map), "backoffMultiplier cannot be empty")).doubleValue();
            C6431n.m37557j(doubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", Double.valueOf(doubleValue));
            Long q = C11169e2.m55255q(map);
            C6431n.m37557j(q == null || q.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", q);
            Set<C12335j1.C12337b> s = C11169e2.m55257s(map);
            if (q == null && s.isEmpty()) {
                z = false;
            }
            C6431n.m37552e(z, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            return new C11113a2(min, longValue, longValue2, doubleValue, q, s);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C11266b)) {
                return false;
            }
            C11266b bVar = (C11266b) obj;
            if (!C6425j.m37541a(this.f43348a, bVar.f43348a) || !C6425j.m37541a(this.f43349b, bVar.f43349b) || !C6425j.m37541a(this.f43350c, bVar.f43350c) || !C6425j.m37541a(this.f43351d, bVar.f43351d) || !C6425j.m37541a(this.f43352e, bVar.f43352e) || !C6425j.m37541a(this.f43353f, bVar.f43353f)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return C6425j.m37542b(this.f43348a, this.f43349b, this.f43350c, this.f43351d, this.f43352e, this.f43353f);
        }

        public String toString() {
            return C6419h.m37528c(this).mo21842d("timeoutNanos", this.f43348a).mo21842d("waitForReady", this.f43349b).mo21842d("maxInboundMessageSize", this.f43350c).mo21842d("maxOutboundMessageSize", this.f43351d).mo21842d("retryPolicy", this.f43352e).mo21842d("hedgingPolicy", this.f43353f).toString();
        }
    }

    /* renamed from: io.grpc.internal.j1$c */
    /* compiled from: ManagedChannelServiceConfig */
    static final class C11267c extends C12314f0 {

        /* renamed from: b */
        final C11264j1 f43354b;

        /* renamed from: a */
        public C12314f0.C12316b mo35089a(C12376r0.C12383f fVar) {
            return C12314f0.C12316b.m59058d().mo37014b(this.f43354b).mo37013a();
        }

        private C11267c(C11264j1 j1Var) {
            this.f43354b = j1Var;
        }
    }

    C11264j1(C11266b bVar, Map<String, C11266b> map, Map<String, C11266b> map2, C11436z1.C11451c0 c0Var, Object obj, Map<String, ?> map3) {
        this.f43341a = bVar;
        this.f43342b = Collections.unmodifiableMap(new HashMap(map));
        this.f43343c = Collections.unmodifiableMap(new HashMap(map2));
        this.f43344d = c0Var;
        this.f43345e = obj;
        this.f43346f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    /* renamed from: a */
    static C11264j1 m55547a() {
        return new C11264j1((C11266b) null, new HashMap(), new HashMap(), (C11436z1.C11451c0) null, (Object) null, (Map<String, ?>) null);
    }

    /* renamed from: b */
    static C11264j1 m55548b(Map<String, ?> map, boolean z, int i, int i2, Object obj) {
        boolean z2 = z;
        C11436z1.C11451c0 v = z2 ? C11169e2.m55260v(map) : null;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map<String, ?> b = C11169e2.m55240b(map);
        List<Map<String, ?>> m = C11169e2.m55251m(map);
        if (m == null) {
            return new C11264j1((C11266b) null, hashMap, hashMap2, v, obj, b);
        }
        C11266b bVar = null;
        for (Map next : m) {
            C11266b bVar2 = new C11266b(next, z2, i, i2);
            List<Map<String, ?>> o = C11169e2.m55253o(next);
            if (o != null && !o.isEmpty()) {
                for (Map next2 : o) {
                    String t = C11169e2.m55258t(next2);
                    String n = C11169e2.m55252n(next2);
                    boolean z3 = true;
                    if (C6443s.m37600a(t)) {
                        C6431n.m37557j(C6443s.m37600a(n), "missing service name for method %s", n);
                        if (bVar != null) {
                            z3 = false;
                        }
                        C6431n.m37557j(z3, "Duplicate default method config in service config %s", map);
                        bVar = bVar2;
                    } else {
                        Map<String, ?> map2 = map;
                        if (C6443s.m37600a(n)) {
                            C6431n.m37557j(!hashMap2.containsKey(t), "Duplicate service %s", t);
                            hashMap2.put(t, bVar2);
                        } else {
                            String b2 = C12423z0.m59387b(t, n);
                            C6431n.m37557j(!hashMap.containsKey(b2), "Duplicate method name %s", b2);
                            hashMap.put(b2, bVar2);
                        }
                    }
                }
            }
            Map<String, ?> map3 = map;
        }
        return new C11264j1(bVar, hashMap, hashMap2, v, obj, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C12314f0 mo35219c() {
        if (!this.f43343c.isEmpty() || !this.f43342b.isEmpty() || this.f43341a != null) {
            return new C11267c();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Map<String, ?> mo35220d() {
        return this.f43346f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Object mo35221e() {
        return this.f43345e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11264j1.class != obj.getClass()) {
            return false;
        }
        C11264j1 j1Var = (C11264j1) obj;
        if (!C6425j.m37541a(this.f43341a, j1Var.f43341a) || !C6425j.m37541a(this.f43342b, j1Var.f43342b) || !C6425j.m37541a(this.f43343c, j1Var.f43343c) || !C6425j.m37541a(this.f43344d, j1Var.f43344d) || !C6425j.m37541a(this.f43345e, j1Var.f43345e)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C11266b mo35223f(C12423z0<?, ?> z0Var) {
        C11266b bVar = this.f43342b.get(z0Var.mo37189c());
        if (bVar == null) {
            bVar = this.f43343c.get(z0Var.mo37190d());
        }
        return bVar == null ? this.f43341a : bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C11436z1.C11451c0 mo35224g() {
        return this.f43344d;
    }

    public int hashCode() {
        return C6425j.m37542b(this.f43341a, this.f43342b, this.f43343c, this.f43344d, this.f43345e);
    }

    public String toString() {
        return C6419h.m37528c(this).mo21842d("defaultMethodConfig", this.f43341a).mo21842d("serviceMethodMap", this.f43342b).mo21842d("serviceMap", this.f43343c).mo21842d("retryThrottling", this.f43344d).mo21842d("loadBalancingConfig", this.f43345e).toString();
    }
}
