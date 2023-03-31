package com.google.protobuf;

import com.google.protobuf.C8204o0;
import java.util.Map;

/* renamed from: com.google.protobuf.r0 */
/* compiled from: MapFieldSchemaLite */
class C8224r0 implements C8212q0 {
    C8224r0() {
    }

    /* renamed from: i */
    private static <K, V> int m45596i(int i, Object obj, Object obj2) {
        C8208p0 p0Var = (C8208p0) obj;
        C8204o0 o0Var = (C8204o0) obj2;
        int i2 = 0;
        if (p0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : p0Var.entrySet()) {
            i2 += o0Var.mo27207a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: j */
    private static <K, V> C8208p0<K, V> m45597j(Object obj, Object obj2) {
        C8208p0<K, V> p0Var = (C8208p0) obj;
        C8208p0 p0Var2 = (C8208p0) obj2;
        if (!p0Var2.isEmpty()) {
            if (!p0Var.mo27213i()) {
                p0Var = p0Var.mo27216l();
            }
            p0Var.mo27215k(p0Var2);
        }
        return p0Var;
    }

    /* renamed from: a */
    public Object mo27223a(Object obj, Object obj2) {
        return m45597j(obj, obj2);
    }

    /* renamed from: b */
    public Object mo27224b(Object obj) {
        ((C8208p0) obj).mo27214j();
        return obj;
    }

    /* renamed from: c */
    public C8204o0.C8205a<?, ?> mo27225c(Object obj) {
        return ((C8204o0) obj).mo27208c();
    }

    /* renamed from: d */
    public Map<?, ?> mo27226d(Object obj) {
        return (C8208p0) obj;
    }

    /* renamed from: e */
    public Object mo27227e(Object obj) {
        return C8208p0.m45481e().mo27216l();
    }

    /* renamed from: f */
    public int mo27228f(int i, Object obj, Object obj2) {
        return m45596i(i, obj, obj2);
    }

    /* renamed from: g */
    public boolean mo27229g(Object obj) {
        return !((C8208p0) obj).mo27213i();
    }

    /* renamed from: h */
    public Map<?, ?> mo27230h(Object obj) {
        return (C8208p0) obj;
    }
}
