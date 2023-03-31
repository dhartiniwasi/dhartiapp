package p302n7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: n7.c */
/* compiled from: Component */
public final class C11934c<T> {

    /* renamed from: a */
    private final String f44818a;

    /* renamed from: b */
    private final Set<C11943f0<? super T>> f44819b;

    /* renamed from: c */
    private final Set<C11966r> f44820c;

    /* renamed from: d */
    private final int f44821d;

    /* renamed from: e */
    private final int f44822e;

    /* renamed from: f */
    private final C11951h<T> f44823f;

    /* renamed from: g */
    private final Set<Class<?>> f44824g;

    /* renamed from: c */
    public static <T> C11936b<T> m57617c(Class<T> cls) {
        return new C11936b<>((Class) cls, new Class[0]);
    }

    @SafeVarargs
    /* renamed from: d */
    public static <T> C11936b<T> m57618d(Class<T> cls, Class<? super T>... clsArr) {
        return new C11936b<>((Class) cls, (Class[]) clsArr);
    }

    /* renamed from: e */
    public static <T> C11936b<T> m57619e(C11943f0<T> f0Var) {
        return new C11936b<>((C11943f0) f0Var, new C11943f0[0]);
    }

    @SafeVarargs
    /* renamed from: f */
    public static <T> C11936b<T> m57620f(C11943f0<T> f0Var, C11943f0<? super T>... f0VarArr) {
        return new C11936b<>((C11943f0) f0Var, (C11943f0[]) f0VarArr);
    }

    /* renamed from: l */
    public static <T> C11934c<T> m57621l(T t, Class<T> cls) {
        return m57622m(cls).mo36260f(new C11930a(t)).mo36258d();
    }

    /* renamed from: m */
    public static <T> C11936b<T> m57622m(Class<T> cls) {
        return m57617c(cls).m57636g();
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ Object m57623q(Object obj, C11940e eVar) {
        return obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ Object m57624r(Object obj, C11940e eVar) {
        return obj;
    }

    @SafeVarargs
    /* renamed from: s */
    public static <T> C11934c<T> m57625s(T t, Class<T> cls, Class<? super T>... clsArr) {
        return m57618d(cls, clsArr).mo36260f(new C11932b(t)).mo36258d();
    }

    /* renamed from: g */
    public Set<C11966r> mo36246g() {
        return this.f44820c;
    }

    /* renamed from: h */
    public C11951h<T> mo36247h() {
        return this.f44823f;
    }

    /* renamed from: i */
    public String mo36248i() {
        return this.f44818a;
    }

    /* renamed from: j */
    public Set<C11943f0<? super T>> mo36249j() {
        return this.f44819b;
    }

    /* renamed from: k */
    public Set<Class<?>> mo36250k() {
        return this.f44824g;
    }

    /* renamed from: n */
    public boolean mo36251n() {
        return this.f44821d == 1;
    }

    /* renamed from: o */
    public boolean mo36252o() {
        return this.f44821d == 2;
    }

    /* renamed from: p */
    public boolean mo36253p() {
        return this.f44822e == 0;
    }

    /* renamed from: t */
    public C11934c<T> mo36254t(C11951h<T> hVar) {
        return new C11934c(this.f44818a, this.f44819b, this.f44820c, this.f44821d, this.f44822e, hVar, this.f44824g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f44819b.toArray()) + ">{" + this.f44821d + ", type=" + this.f44822e + ", deps=" + Arrays.toString(this.f44820c.toArray()) + "}";
    }

    /* renamed from: n7.c$b */
    /* compiled from: Component */
    public static class C11936b<T> {

        /* renamed from: a */
        private String f44825a;

        /* renamed from: b */
        private final Set<C11943f0<? super T>> f44826b;

        /* renamed from: c */
        private final Set<C11966r> f44827c;

        /* renamed from: d */
        private int f44828d;

        /* renamed from: e */
        private int f44829e;

        /* renamed from: f */
        private C11951h<T> f44830f;

        /* renamed from: g */
        private final Set<Class<?>> f44831g;

        /* access modifiers changed from: private */
        /* renamed from: g */
        public C11936b<T> m57636g() {
            this.f44829e = 1;
            return this;
        }

        /* renamed from: i */
        private C11936b<T> m57637i(int i) {
            C11941e0.m57673d(this.f44828d == 0, "Instantiation type has already been set.");
            this.f44828d = i;
            return this;
        }

        /* renamed from: j */
        private void m57638j(C11943f0<?> f0Var) {
            C11941e0.m57670a(!this.f44826b.contains(f0Var), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        /* renamed from: b */
        public C11936b<T> mo36256b(C11966r rVar) {
            C11941e0.m57672c(rVar, "Null dependency");
            m57638j(rVar.mo36297c());
            this.f44827c.add(rVar);
            return this;
        }

        /* renamed from: c */
        public C11936b<T> mo36257c() {
            return m57637i(1);
        }

        /* renamed from: d */
        public C11934c<T> mo36258d() {
            C11941e0.m57673d(this.f44830f != null, "Missing required property: factory.");
            return new C11934c(this.f44825a, new HashSet(this.f44826b), new HashSet(this.f44827c), this.f44828d, this.f44829e, this.f44830f, this.f44831g);
        }

        /* renamed from: e */
        public C11936b<T> mo36259e() {
            return m57637i(2);
        }

        /* renamed from: f */
        public C11936b<T> mo36260f(C11951h<T> hVar) {
            this.f44830f = (C11951h) C11941e0.m57672c(hVar, "Null factory");
            return this;
        }

        /* renamed from: h */
        public C11936b<T> mo36261h(String str) {
            this.f44825a = str;
            return this;
        }

        @SafeVarargs
        private C11936b(Class<T> cls, Class<? super T>... clsArr) {
            this.f44825a = null;
            HashSet hashSet = new HashSet();
            this.f44826b = hashSet;
            this.f44827c = new HashSet();
            this.f44828d = 0;
            this.f44829e = 0;
            this.f44831g = new HashSet();
            C11941e0.m57672c(cls, "Null interface");
            hashSet.add(C11943f0.m57675b(cls));
            for (Class<? super T> cls2 : clsArr) {
                C11941e0.m57672c(cls2, "Null interface");
                this.f44826b.add(C11943f0.m57675b(cls2));
            }
        }

        @SafeVarargs
        private C11936b(C11943f0<T> f0Var, C11943f0<? super T>... f0VarArr) {
            this.f44825a = null;
            HashSet hashSet = new HashSet();
            this.f44826b = hashSet;
            this.f44827c = new HashSet();
            this.f44828d = 0;
            this.f44829e = 0;
            this.f44831g = new HashSet();
            C11941e0.m57672c(f0Var, "Null interface");
            hashSet.add(f0Var);
            for (C11943f0<? super T> c : f0VarArr) {
                C11941e0.m57672c(c, "Null interface");
            }
            Collections.addAll(this.f44826b, f0VarArr);
        }
    }

    private C11934c(String str, Set<C11943f0<? super T>> set, Set<C11966r> set2, int i, int i2, C11951h<T> hVar, Set<Class<?>> set3) {
        this.f44818a = str;
        this.f44819b = Collections.unmodifiableSet(set);
        this.f44820c = Collections.unmodifiableSet(set2);
        this.f44821d = i;
        this.f44822e = i2;
        this.f44823f = hVar;
        this.f44824g = Collections.unmodifiableSet(set3);
    }
}
