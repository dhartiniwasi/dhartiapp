package p302n7;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p276k8.C11598a;
import p276k8.C11600b;
import p395x7.C12977a;
import p395x7.C12979c;

/* renamed from: n7.g0 */
/* compiled from: RestrictedComponentContainer */
final class C11949g0 implements C11940e {

    /* renamed from: a */
    private final Set<C11943f0<?>> f44843a;

    /* renamed from: b */
    private final Set<C11943f0<?>> f44844b;

    /* renamed from: c */
    private final Set<C11943f0<?>> f44845c;

    /* renamed from: d */
    private final Set<C11943f0<?>> f44846d;

    /* renamed from: e */
    private final Set<C11943f0<?>> f44847e;

    /* renamed from: f */
    private final Set<Class<?>> f44848f;

    /* renamed from: g */
    private final C11940e f44849g;

    /* renamed from: n7.g0$a */
    /* compiled from: RestrictedComponentContainer */
    private static class C11950a implements C12979c {

        /* renamed from: a */
        private final Set<Class<?>> f44850a;

        /* renamed from: b */
        private final C12979c f44851b;

        public C11950a(Set<Class<?>> set, C12979c cVar) {
            this.f44850a = set;
            this.f44851b = cVar;
        }

        /* renamed from: b */
        public void mo36278b(C12977a<?> aVar) {
            if (this.f44850a.contains(aVar.mo38039b())) {
                this.f44851b.mo36278b(aVar);
            } else {
                throw new C11968t(String.format("Attempting to publish an undeclared event %s.", new Object[]{aVar}));
            }
        }
    }

    C11949g0(C11934c<?> cVar, C11940e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C11966r next : cVar.mo36246g()) {
            if (next.mo36299e()) {
                if (next.mo36302g()) {
                    hashSet4.add(next.mo36297c());
                } else {
                    hashSet.add(next.mo36297c());
                }
            } else if (next.mo36298d()) {
                hashSet3.add(next.mo36297c());
            } else if (next.mo36302g()) {
                hashSet5.add(next.mo36297c());
            } else {
                hashSet2.add(next.mo36297c());
            }
        }
        if (!cVar.mo36250k().isEmpty()) {
            hashSet.add(C11943f0.m57675b(C12979c.class));
        }
        this.f44843a = Collections.unmodifiableSet(hashSet);
        this.f44844b = Collections.unmodifiableSet(hashSet2);
        this.f44845c = Collections.unmodifiableSet(hashSet3);
        this.f44846d = Collections.unmodifiableSet(hashSet4);
        this.f44847e = Collections.unmodifiableSet(hashSet5);
        this.f44848f = cVar.mo36250k();
        this.f44849g = eVar;
    }

    /* renamed from: a */
    public <T> T mo36263a(Class<T> cls) {
        if (this.f44843a.contains(C11943f0.m57675b(cls))) {
            T a = this.f44849g.mo36263a(cls);
            if (!cls.equals(C12979c.class)) {
                return a;
            }
            return new C11950a(this.f44848f, (C12979c) a);
        }
        throw new C11968t(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: b */
    public <T> Set<T> mo36264b(C11943f0<T> f0Var) {
        if (this.f44846d.contains(f0Var)) {
            return this.f44849g.mo36264b(f0Var);
        }
        throw new C11968t(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{f0Var}));
    }

    /* renamed from: c */
    public <T> C11600b<T> mo36265c(C11943f0<T> f0Var) {
        if (this.f44844b.contains(f0Var)) {
            return this.f44849g.mo36265c(f0Var);
        }
        throw new C11968t(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{f0Var}));
    }

    /* renamed from: d */
    public <T> C11600b<T> mo36266d(Class<T> cls) {
        return mo36265c(C11943f0.m57675b(cls));
    }

    /* renamed from: e */
    public /* synthetic */ Set mo36267e(Class cls) {
        return C11938d.m57649e(this, cls);
    }

    /* renamed from: f */
    public <T> C11600b<Set<T>> mo36268f(C11943f0<T> f0Var) {
        if (this.f44847e.contains(f0Var)) {
            return this.f44849g.mo36268f(f0Var);
        }
        throw new C11968t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{f0Var}));
    }

    /* renamed from: g */
    public <T> T mo36269g(C11943f0<T> f0Var) {
        if (this.f44843a.contains(f0Var)) {
            return this.f44849g.mo36269g(f0Var);
        }
        throw new C11968t(String.format("Attempting to request an undeclared dependency %s.", new Object[]{f0Var}));
    }

    /* renamed from: h */
    public <T> C11598a<T> mo36270h(C11943f0<T> f0Var) {
        if (this.f44845c.contains(f0Var)) {
            return this.f44849g.mo36270h(f0Var);
        }
        throw new C11968t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{f0Var}));
    }

    /* renamed from: i */
    public <T> C11598a<T> mo36271i(Class<T> cls) {
        return mo36270h(C11943f0.m57675b(cls));
    }
}
