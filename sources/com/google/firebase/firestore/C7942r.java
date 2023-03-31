package com.google.firebase.firestore;

import java.util.List;
import p008a8.C6477l;
import p008a8.C6489q;

/* renamed from: com.google.firebase.firestore.r */
/* compiled from: Filter */
public class C7942r {

    /* renamed from: com.google.firebase.firestore.r$a */
    /* compiled from: Filter */
    static class C7943a extends C7942r {

        /* renamed from: a */
        private final List<C7942r> f34404a;

        /* renamed from: b */
        private final C6477l.C6478a f34405b;

        /* renamed from: k */
        public List<C7942r> mo26447k() {
            return this.f34404a;
        }

        /* renamed from: l */
        public C6477l.C6478a mo26448l() {
            return this.f34405b;
        }
    }

    /* renamed from: com.google.firebase.firestore.r$b */
    /* compiled from: Filter */
    static class C7944b extends C7942r {

        /* renamed from: a */
        private final C7932p f34406a;

        /* renamed from: b */
        private final C6489q.C6491b f34407b;

        /* renamed from: c */
        private final Object f34408c;

        public C7944b(C7932p pVar, C6489q.C6491b bVar, Object obj) {
            this.f34406a = pVar;
            this.f34407b = bVar;
            this.f34408c = obj;
        }

        /* renamed from: k */
        public C7932p mo26449k() {
            return this.f34406a;
        }

        /* renamed from: l */
        public C6489q.C6491b mo26450l() {
            return this.f34407b;
        }

        /* renamed from: m */
        public Object mo26451m() {
            return this.f34408c;
        }
    }

    /* renamed from: a */
    public static C7942r m43858a(C7932p pVar, Object obj) {
        return new C7944b(pVar, C6489q.C6491b.ARRAY_CONTAINS, obj);
    }

    /* renamed from: b */
    public static C7942r m43859b(C7932p pVar, List<? extends Object> list) {
        return new C7944b(pVar, C6489q.C6491b.ARRAY_CONTAINS_ANY, list);
    }

    /* renamed from: c */
    public static C7942r m43860c(C7932p pVar, Object obj) {
        return new C7944b(pVar, C6489q.C6491b.EQUAL, obj);
    }

    /* renamed from: d */
    public static C7942r m43861d(C7932p pVar, Object obj) {
        return new C7944b(pVar, C6489q.C6491b.GREATER_THAN, obj);
    }

    /* renamed from: e */
    public static C7942r m43862e(C7932p pVar, Object obj) {
        return new C7944b(pVar, C6489q.C6491b.GREATER_THAN_OR_EQUAL, obj);
    }

    /* renamed from: f */
    public static C7942r m43863f(C7932p pVar, List<? extends Object> list) {
        return new C7944b(pVar, C6489q.C6491b.IN, list);
    }

    /* renamed from: g */
    public static C7942r m43864g(C7932p pVar, Object obj) {
        return new C7944b(pVar, C6489q.C6491b.LESS_THAN, obj);
    }

    /* renamed from: h */
    public static C7942r m43865h(C7932p pVar, Object obj) {
        return new C7944b(pVar, C6489q.C6491b.LESS_THAN_OR_EQUAL, obj);
    }

    /* renamed from: i */
    public static C7942r m43866i(C7932p pVar, Object obj) {
        return new C7944b(pVar, C6489q.C6491b.NOT_EQUAL, obj);
    }

    /* renamed from: j */
    public static C7942r m43867j(C7932p pVar, List<? extends Object> list) {
        return new C7944b(pVar, C6489q.C6491b.NOT_IN, list);
    }
}
