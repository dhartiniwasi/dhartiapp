package p302n7;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p276k8.C11600b;

/* renamed from: n7.y */
/* compiled from: LazySet */
class C11973y<T> implements C11600b<Set<T>> {

    /* renamed from: a */
    private volatile Set<C11600b<T>> f44891a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b */
    private volatile Set<T> f44892b = null;

    C11973y(Collection<C11600b<T>> collection) {
        this.f44891a.addAll(collection);
    }

    /* renamed from: b */
    static C11973y<?> m57761b(Collection<C11600b<?>> collection) {
        return new C11973y<>((Set) collection);
    }

    /* renamed from: d */
    private synchronized void m57762d() {
        for (C11600b<T> bVar : this.f44891a) {
            this.f44892b.add(bVar.get());
        }
        this.f44891a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized void mo36310a(C11600b<T> bVar) {
        if (this.f44892b == null) {
            this.f44891a.add(bVar);
        } else {
            this.f44892b.add(bVar.get());
        }
    }

    /* renamed from: c */
    public Set<T> get() {
        if (this.f44892b == null) {
            synchronized (this) {
                if (this.f44892b == null) {
                    this.f44892b = Collections.newSetFromMap(new ConcurrentHashMap());
                    m57762d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f44892b);
    }
}
