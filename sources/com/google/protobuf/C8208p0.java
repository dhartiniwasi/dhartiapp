package com.google.protobuf;

import com.google.protobuf.C8119d0;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.protobuf.p0 */
/* compiled from: MapFieldLite */
public final class C8208p0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b */
    private static final C8208p0<?, ?> f35039b;

    /* renamed from: a */
    private boolean f35040a = true;

    static {
        C8208p0<?, ?> p0Var = new C8208p0<>();
        f35039b = p0Var;
        p0Var.mo27214j();
    }

    private C8208p0() {
    }

    /* renamed from: b */
    static <K, V> int m45478b(Map<K, V> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            i += m45479c(next.getValue()) ^ m45479c(next.getKey());
        }
        return i;
    }

    /* renamed from: c */
    private static int m45479c(Object obj) {
        if (obj instanceof byte[]) {
            return C8119d0.m44652d((byte[]) obj);
        }
        if (!(obj instanceof C8119d0.C8122c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    private static void m45480d(Map<?, ?> map) {
        for (Object next : map.keySet()) {
            C8119d0.m44649a(next);
            C8119d0.m44649a(map.get(next));
        }
    }

    /* renamed from: e */
    public static <K, V> C8208p0<K, V> m45481e() {
        return f35039b;
    }

    /* renamed from: f */
    private void m45482f() {
        if (!mo27213i()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: g */
    private static boolean m45483g(Object obj, Object obj2) {
        if (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) {
            return obj.equals(obj2);
        }
        return Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> boolean m45484h(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = m45483g(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8208p0.m45484h(java.util.Map, java.util.Map):boolean");
    }

    public void clear() {
        m45482f();
        super.clear();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && m45484h(this, (Map) obj);
    }

    public int hashCode() {
        return m45478b(this);
    }

    /* renamed from: i */
    public boolean mo27213i() {
        return this.f35040a;
    }

    /* renamed from: j */
    public void mo27214j() {
        this.f35040a = false;
    }

    /* renamed from: k */
    public void mo27215k(C8208p0<K, V> p0Var) {
        m45482f();
        if (!p0Var.isEmpty()) {
            putAll(p0Var);
        }
    }

    /* renamed from: l */
    public C8208p0<K, V> mo27216l() {
        return isEmpty() ? new C8208p0<>() : new C8208p0<>(this);
    }

    public V put(K k, V v) {
        m45482f();
        C8119d0.m44649a(k);
        C8119d0.m44649a(v);
        return super.put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m45482f();
        m45480d(map);
        super.putAll(map);
    }

    public V remove(Object obj) {
        m45482f();
        return super.remove(obj);
    }

    private C8208p0(Map<K, V> map) {
        super(map);
    }
}
