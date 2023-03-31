package com.google.firebase.firestore;

import com.facebook.ads.AdError;
import com.google.firebase.firestore.C7934q;
import com.google.protobuf.C8137e1;
import com.google.protobuf.C8234t1;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p008a8.C6493q1;
import p008a8.C6496r1;
import p008a8.C6498s1;
import p008a8.C6500t1;
import p008a8.C6503u1;
import p200c9.C6838a;
import p211d8.C9882f;
import p211d8.C9898r;
import p211d8.C9902t;
import p220e8.C10002a;
import p220e8.C10007d;
import p220e8.C10013j;
import p220e8.C10017n;
import p246h7.C10428q;
import p247h8.C10432b;
import p247h8.C10449g0;
import p247h8.C10457o;
import p247h8.C10472x;
import p405y8.C13085b;
import p405y8.C13088b0;
import p405y8.C13161s;

/* renamed from: com.google.firebase.firestore.z0 */
/* compiled from: UserDataReader */
public final class C7967z0 {

    /* renamed from: a */
    private final C9882f f34466a;

    public C7967z0(C9882f fVar) {
        this.f34466a = fVar;
    }

    /* renamed from: a */
    private C9902t m43912a(Object obj, C6496r1 r1Var) {
        if (!obj.getClass().isArray()) {
            C13088b0 d = m43914d(C10457o.m52732c(obj), r1Var);
            if (d.mo38122x0() == C13088b0.C13091c.MAP_VALUE) {
                return new C9902t(d);
            }
            throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was " + "of type: " + C10449g0.m52699B(obj));
        }
        throw new IllegalArgumentException("Invalid data. Data must be a Map<String, Object> or a suitable POJO object, but it was " + "an array");
    }

    /* renamed from: c */
    private List<C13088b0> m43913c(List<Object> list) {
        C6493q1 q1Var = new C6493q1(C6503u1.Argument);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(mo26489b(list.get(i), q1Var.mo22049f().mo22056c(i)));
        }
        return arrayList;
    }

    /* renamed from: d */
    private C13088b0 m43914d(Object obj, C6496r1 r1Var) {
        if (obj instanceof Map) {
            return m43916f((Map) obj, r1Var);
        }
        if (obj instanceof C7934q) {
            m43918k((C7934q) obj, r1Var);
            return null;
        }
        if (r1Var.mo22061h() != null) {
            r1Var.mo22054a(r1Var.mo22061h());
        }
        if (!(obj instanceof List)) {
            return m43917j(obj, r1Var);
        }
        if (!r1Var.mo22062i() || r1Var.mo22060g() == C6503u1.ArrayArgument) {
            return m43915e((List) obj, r1Var);
        }
        throw r1Var.mo22059f("Nested arrays are not supported");
    }

    /* renamed from: e */
    private <T> C13088b0 m43915e(List<T> list, C6496r1 r1Var) {
        C13085b.C13087b k0 = C13085b.m61455k0();
        int i = 0;
        for (T d : list) {
            C13088b0 d2 = m43914d(d, r1Var.mo22056c(i));
            if (d2 == null) {
                d2 = (C13088b0) C13088b0.m61490y0().mo38133N(C8137e1.NULL_VALUE).build();
            }
            k0.mo38108E(d2);
            i++;
        }
        return (C13088b0) C13088b0.m61490y0().mo38124E(k0).build();
    }

    /* renamed from: f */
    private <K, V> C13088b0 m43916f(Map<K, V> map, C6496r1 r1Var) {
        if (map.isEmpty()) {
            if (r1Var.mo22061h() != null && !r1Var.mo22061h().mo32356p()) {
                r1Var.mo22054a(r1Var.mo22061h());
            }
            return (C13088b0) C13088b0.m61490y0().mo38132M(C13161s.m61754c0()).build();
        }
        C13161s.C13163b k0 = C13161s.m61758k0();
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() instanceof String) {
                String str = (String) next.getKey();
                C13088b0 d = m43914d(next.getValue(), r1Var.mo22058e(str));
                if (d != null) {
                    k0.mo38232F(str, d);
                }
            } else {
                throw r1Var.mo22059f(String.format("Non-String Map key (%s) is not allowed", new Object[]{next.getValue()}));
            }
        }
        return (C13088b0) C13088b0.m61490y0().mo38131L(k0).build();
    }

    /* renamed from: j */
    private C13088b0 m43917j(Object obj, C6496r1 r1Var) {
        if (obj == null) {
            return (C13088b0) C13088b0.m61490y0().mo38133N(C8137e1.NULL_VALUE).build();
        }
        if (obj instanceof Integer) {
            return (C13088b0) C13088b0.m61490y0().mo38130K((long) ((Integer) obj).intValue()).build();
        }
        if (obj instanceof Long) {
            return (C13088b0) C13088b0.m61490y0().mo38130K(((Long) obj).longValue()).build();
        }
        if (obj instanceof Float) {
            return (C13088b0) C13088b0.m61490y0().mo38128I(((Float) obj).doubleValue()).build();
        }
        if (obj instanceof Double) {
            return (C13088b0) C13088b0.m61490y0().mo38128I(((Double) obj).doubleValue()).build();
        }
        if (obj instanceof Boolean) {
            return (C13088b0) C13088b0.m61490y0().mo38126G(((Boolean) obj).booleanValue()).build();
        }
        if (obj instanceof String) {
            return (C13088b0) C13088b0.m61490y0().mo38135P((String) obj).build();
        }
        if (obj instanceof Date) {
            return m43919m(new C10428q((Date) obj));
        }
        if (obj instanceof C10428q) {
            return m43919m((C10428q) obj);
        }
        if (obj instanceof C7900c0) {
            C7900c0 c0Var = (C7900c0) obj;
            return (C13088b0) C13088b0.m61490y0().mo38129J(C6838a.m39385g0().mo22938D(c0Var.mo26326b()).mo22939E(c0Var.mo26327c())).build();
        } else if (obj instanceof C7903e) {
            return (C13088b0) C13088b0.m61490y0().mo38127H(((C7903e) obj).mo26336j()).build();
        } else {
            if (obj instanceof C7921l) {
                C7921l lVar = (C7921l) obj;
                if (lVar.mo26389k() != null) {
                    C9882f t = lVar.mo26389k().mo26306t();
                    if (!t.equals(this.f34466a)) {
                        throw r1Var.mo22059f(String.format("Document reference is for database %s/%s but should be for database %s/%s", new Object[]{t.mo32367k(), t.mo32366j(), this.f34466a.mo32367k(), this.f34466a.mo32366j()}));
                    }
                }
                return (C13088b0) C13088b0.m61490y0().mo38134O(String.format("projects/%s/databases/%s/documents/%s", new Object[]{this.f34466a.mo32367k(), this.f34466a.mo32366j(), lVar.mo26391m()})).build();
            } else if (obj.getClass().isArray()) {
                throw r1Var.mo22059f("Arrays are not supported; use a List instead");
            } else {
                throw r1Var.mo22059f("Unsupported type: " + C10449g0.m52699B(obj));
            }
        }
    }

    /* renamed from: k */
    private void m43918k(C7934q qVar, C6496r1 r1Var) {
        boolean z = true;
        if (!r1Var.mo22063j()) {
            throw r1Var.mo22059f(String.format("%s() can only be used with set() and update()", new Object[]{qVar.mo26432d()}));
        } else if (r1Var.mo22061h() == null) {
            throw r1Var.mo22059f(String.format("%s() is not currently supported inside arrays", new Object[]{qVar.mo26432d()}));
        } else if (qVar instanceof C7934q.C7937c) {
            if (r1Var.mo22060g() == C6503u1.MergeSet) {
                r1Var.mo22054a(r1Var.mo22061h());
            } else if (r1Var.mo22060g() == C6503u1.Update) {
                if (r1Var.mo22061h().mo32358r() <= 0) {
                    z = false;
                }
                C10432b.m52648d(z, "FieldValue.delete() at the top level should have already been handled.", new Object[0]);
                throw r1Var.mo22059f("FieldValue.delete() can only appear at the top level of your update data");
            } else {
                throw r1Var.mo22059f("FieldValue.delete() can only be used with update() and set() with SetOptions.merge()");
            }
        } else if (qVar instanceof C7934q.C7939e) {
            r1Var.mo22055b(r1Var.mo22061h(), C10017n.m51154d());
        } else if (qVar instanceof C7934q.C7936b) {
            r1Var.mo22055b(r1Var.mo22061h(), new C10002a.C10004b(m43913c(((C7934q.C7936b) qVar).mo26434h())));
        } else if (qVar instanceof C7934q.C7935a) {
            r1Var.mo22055b(r1Var.mo22061h(), new C10002a.C10003a(m43913c(((C7934q.C7935a) qVar).mo26433h())));
        } else if (qVar instanceof C7934q.C7938d) {
            r1Var.mo22055b(r1Var.mo22061h(), new C10013j(mo26491h(((C7934q.C7938d) qVar).mo26435h())));
        } else {
            throw C10432b.m52645a("Unknown FieldValue type: %s", C10449g0.m52699B(qVar));
        }
    }

    /* renamed from: m */
    private C13088b0 m43919m(C10428q qVar) {
        return (C13088b0) C13088b0.m61490y0().mo38136Q(C8234t1.m45639g0().mo27293E(qVar.mo33499c()).mo27292D((qVar.mo33498b() / AdError.NETWORK_ERROR_CODE) * AdError.NETWORK_ERROR_CODE)).build();
    }

    /* renamed from: b */
    public C13088b0 mo26489b(Object obj, C6496r1 r1Var) {
        return m43914d(C10457o.m52732c(obj), r1Var);
    }

    /* renamed from: g */
    public C6498s1 mo26490g(Object obj, C10007d dVar) {
        C6493q1 q1Var = new C6493q1(C6503u1.MergeSet);
        C9902t a = m43912a(obj, q1Var.mo22049f());
        if (dVar == null) {
            return q1Var.mo22050g(a);
        }
        for (C9898r next : dVar.mo32588c()) {
            if (!q1Var.mo22047d(next)) {
                throw new IllegalArgumentException("Field '" + next.toString() + "' is specified in your field mask but not in your input data.");
            }
        }
        return q1Var.mo22051h(a, dVar);
    }

    /* renamed from: h */
    public C13088b0 mo26491h(Object obj) {
        return mo26492i(obj, false);
    }

    /* renamed from: i */
    public C13088b0 mo26492i(Object obj, boolean z) {
        C6493q1 q1Var = new C6493q1(z ? C6503u1.ArrayArgument : C6503u1.Argument);
        C13088b0 b = mo26489b(obj, q1Var.mo22049f());
        C10432b.m52648d(b != null, "Parsed data should not be null.", new Object[0]);
        C10432b.m52648d(q1Var.mo22048e().isEmpty(), "Field transforms should have been disallowed.", new Object[0]);
        return b;
    }

    /* renamed from: l */
    public C6498s1 mo26493l(Object obj) {
        C6493q1 q1Var = new C6493q1(C6503u1.Set);
        return q1Var.mo22052i(m43912a(obj, q1Var.mo22049f()));
    }

    /* renamed from: n */
    public C6500t1 mo26494n(List<Object> list) {
        C9898r rVar;
        C10432b.m52648d(list.size() % 2 == 0, "Expected fieldAndValues to contain an even number of elements", new Object[0]);
        C6493q1 q1Var = new C6493q1(C6503u1.Update);
        C6496r1 f = q1Var.mo22049f();
        C9902t tVar = new C9902t();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Object next2 = it.next();
            boolean z = next instanceof String;
            C10432b.m52648d(z || (next instanceof C7932p), "Expected argument to be String or FieldPath.", new Object[0]);
            if (z) {
                rVar = C7932p.m43830b((String) next).mo26428c();
            } else {
                rVar = ((C7932p) next).mo26428c();
            }
            if (next2 instanceof C7934q.C7937c) {
                f.mo22054a(rVar);
            } else {
                C13088b0 b = mo26489b(next2, f.mo22057d(rVar));
                if (b != null) {
                    f.mo22054a(rVar);
                    tVar.mo32434k(rVar, b);
                }
            }
        }
        return q1Var.mo22053j(tVar);
    }

    /* renamed from: o */
    public C6500t1 mo26495o(Map<String, Object> map) {
        C10472x.m52786c(map, "Provided update data must not be null.");
        C6493q1 q1Var = new C6493q1(C6503u1.Update);
        C6496r1 f = q1Var.mo22049f();
        C9902t tVar = new C9902t();
        for (Map.Entry next : map.entrySet()) {
            C9898r c = C7932p.m43830b((String) next.getKey()).mo26428c();
            Object value = next.getValue();
            if (value instanceof C7934q.C7937c) {
                f.mo22054a(c);
            } else {
                C13088b0 b = mo26489b(value, f.mo22057d(c));
                if (b != null) {
                    f.mo22054a(c);
                    tVar.mo32434k(c, b);
                }
            }
        }
        return q1Var.mo22053j(tVar);
    }
}
