package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.protobuf.i1 */
/* compiled from: Protobuf */
final class C8166i1 {

    /* renamed from: c */
    private static final C8166i1 f34925c = new C8166i1();

    /* renamed from: a */
    private final C8206o1 f34926a = new C8199n0();

    /* renamed from: b */
    private final ConcurrentMap<Class<?>, C8202n1<?>> f34927b = new ConcurrentHashMap();

    private C8166i1() {
    }

    /* renamed from: a */
    public static C8166i1 m44835a() {
        return f34925c;
    }

    /* renamed from: b */
    public C8202n1<?> mo26960b(Class<?> cls, C8202n1<?> n1Var) {
        C8119d0.m44650b(cls, "messageType");
        C8119d0.m44650b(n1Var, "schema");
        return this.f34927b.putIfAbsent(cls, n1Var);
    }

    /* renamed from: c */
    public <T> C8202n1<T> mo26961c(Class<T> cls) {
        C8119d0.m44650b(cls, "messageType");
        C8202n1<T> n1Var = (C8202n1) this.f34927b.get(cls);
        if (n1Var != null) {
            return n1Var;
        }
        C8202n1<T> a = this.f34926a.mo27194a(cls);
        C8202n1<?> b = mo26960b(cls, a);
        return b != null ? b : a;
    }

    /* renamed from: d */
    public <T> C8202n1<T> mo26962d(T t) {
        return mo26961c(t.getClass());
    }
}
