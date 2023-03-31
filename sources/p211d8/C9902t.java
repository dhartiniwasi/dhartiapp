package p211d8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p220e8.C10007d;
import p247h8.C10432b;
import p405y8.C13088b0;
import p405y8.C13161s;

/* renamed from: d8.t */
/* compiled from: ObjectValue */
public final class C9902t implements Cloneable {

    /* renamed from: a */
    private C13088b0 f39748a;

    /* renamed from: b */
    private final Map<String, Object> f39749b;

    public C9902t(C13088b0 b0Var) {
        this.f39749b = new HashMap();
        C10432b.m52648d(b0Var.mo38122x0() == C13088b0.C13091c.MAP_VALUE, "ObjectValues should be backed by a MapValue", new Object[0]);
        C10432b.m52648d(!C9904v.m50790c(b0Var), "ServerTimestamps should not be used as an ObjectValue", new Object[0]);
        this.f39748a = b0Var;
    }

    /* renamed from: a */
    private C13161s m50770a(C9898r rVar, Map<String, Object> map) {
        C13161s.C13163b bVar;
        C13088b0 f = m50773f(this.f39748a, rVar);
        if (C9907y.m50828w(f)) {
            bVar = (C13161s.C13163b) f.mo38118t0().mo27317b();
        } else {
            bVar = C13161s.m61758k0();
        }
        boolean z = false;
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value instanceof Map) {
                C13161s a = m50770a((C9898r) rVar.mo32347b(str), (Map) value);
                if (a != null) {
                    bVar.mo38232F(str, (C13088b0) C13088b0.m61490y0().mo38132M(a).build());
                }
            } else if (value instanceof C13088b0) {
                bVar.mo38232F(str, (C13088b0) value);
            } else if (bVar.mo38230D(str)) {
                C10432b.m52648d(value == null, "Expected entry to be a Map, a Value or null", new Object[0]);
                bVar.mo38233G(str);
            }
            z = true;
        }
        if (z) {
            return (C13161s) bVar.build();
        }
        return null;
    }

    /* renamed from: b */
    private C13088b0 m50771b() {
        synchronized (this.f39749b) {
            C13161s a = m50770a(C9898r.f39732c, this.f39749b);
            if (a != null) {
                this.f39748a = (C13088b0) C13088b0.m61490y0().mo38132M(a).build();
                this.f39749b.clear();
            }
        }
        return this.f39748a;
    }

    /* renamed from: e */
    private C10007d m50772e(C13161s sVar) {
        HashSet hashSet = new HashSet();
        for (Map.Entry next : sVar.mo38227e0().entrySet()) {
            C9898r x = C9898r.m50743x((String) next.getKey());
            if (C9907y.m50828w((C13088b0) next.getValue())) {
                Set<C9898r> c = m50772e(((C13088b0) next.getValue()).mo38118t0()).mo32588c();
                if (c.isEmpty()) {
                    hashSet.add(x);
                } else {
                    for (C9898r a : c) {
                        hashSet.add((C9898r) x.mo32346a(a));
                    }
                }
            } else {
                hashSet.add(x);
            }
        }
        return C10007d.m51096b(hashSet);
    }

    /* renamed from: f */
    private C13088b0 m50773f(C13088b0 b0Var, C9898r rVar) {
        if (rVar.mo32356p()) {
            return b0Var;
        }
        for (int i = 0; i < rVar.mo32358r() - 1; i++) {
            b0Var = b0Var.mo38118t0().mo38228f0(rVar.mo32355o(i), (C13088b0) null);
            if (!C9907y.m50828w(b0Var)) {
                return null;
            }
        }
        return b0Var.mo38118t0().mo38228f0(rVar.mo32354n(), (C13088b0) null);
    }

    /* renamed from: g */
    public static C9902t m50774g(Map<String, C13088b0> map) {
        return new C9902t((C13088b0) C13088b0.m61490y0().mo38131L(C13161s.m61758k0().mo38231E(map)).build());
    }

    /* renamed from: m */
    private void m50775m(C9898r rVar, C13088b0 b0Var) {
        Map<String, Object> hashMap;
        Map<String, Object> map = this.f39749b;
        for (int i = 0; i < rVar.mo32358r() - 1; i++) {
            String o = rVar.mo32355o(i);
            Object obj = map.get(o);
            if (obj instanceof Map) {
                hashMap = (Map) obj;
            } else {
                if (obj instanceof C13088b0) {
                    C13088b0 b0Var2 = (C13088b0) obj;
                    if (b0Var2.mo38122x0() == C13088b0.C13091c.MAP_VALUE) {
                        HashMap hashMap2 = new HashMap(b0Var2.mo38118t0().mo38227e0());
                        map.put(o, hashMap2);
                        map = hashMap2;
                    }
                }
                hashMap = new HashMap<>();
                map.put(o, hashMap);
            }
            map = hashMap;
        }
        map.put(rVar.mo32354n(), b0Var);
    }

    /* renamed from: c */
    public C9902t clone() {
        return new C9902t(m50771b());
    }

    /* renamed from: d */
    public void mo32428d(C9898r rVar) {
        C10432b.m52648d(!rVar.mo32356p(), "Cannot delete field for empty path on ObjectValue", new Object[0]);
        m50775m(rVar, (C13088b0) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9902t) {
            return C9907y.m50822q(m50771b(), ((C9902t) obj).m50771b());
        }
        return false;
    }

    /* renamed from: h */
    public C13088b0 mo32430h(C9898r rVar) {
        return m50773f(m50771b(), rVar);
    }

    public int hashCode() {
        return m50771b().hashCode();
    }

    /* renamed from: i */
    public C10007d mo32432i() {
        return m50772e(m50771b().mo38118t0());
    }

    /* renamed from: j */
    public Map<String, C13088b0> mo32433j() {
        return m50771b().mo38118t0().mo38227e0();
    }

    /* renamed from: k */
    public void mo32434k(C9898r rVar, C13088b0 b0Var) {
        C10432b.m52648d(!rVar.mo32356p(), "Cannot set field for empty path on ObjectValue", new Object[0]);
        m50775m(rVar, b0Var);
    }

    /* renamed from: l */
    public void mo32435l(Map<C9898r, C13088b0> map) {
        for (Map.Entry next : map.entrySet()) {
            C9898r rVar = (C9898r) next.getKey();
            if (next.getValue() == null) {
                mo32428d(rVar);
            } else {
                mo32434k(rVar, (C13088b0) next.getValue());
            }
        }
    }

    public String toString() {
        return "ObjectValue{internalValue=" + C9907y.m50807b(m50771b()) + '}';
    }

    public C9902t() {
        this((C13088b0) C13088b0.m61490y0().mo38132M(C13161s.m61754c0()).build());
    }
}
