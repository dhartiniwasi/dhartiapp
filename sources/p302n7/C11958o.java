package p302n7;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p276k8.C11598a;
import p276k8.C11600b;
import p338r7.C12257a;
import p395x7.C12979c;
import p395x7.C12980d;

/* renamed from: n7.o */
/* compiled from: ComponentRuntime */
public class C11958o implements C11940e, C12257a {

    /* renamed from: h */
    private static final C11600b<Set<Object>> f44861h = C11957n.f44860a;

    /* renamed from: a */
    private final Map<C11934c<?>, C11600b<?>> f44862a;

    /* renamed from: b */
    private final Map<C11943f0<?>, C11600b<?>> f44863b;

    /* renamed from: c */
    private final Map<C11943f0<?>, C11973y<?>> f44864c;

    /* renamed from: d */
    private final List<C11600b<ComponentRegistrar>> f44865d;

    /* renamed from: e */
    private final C11970v f44866e;

    /* renamed from: f */
    private final AtomicReference<Boolean> f44867f;

    /* renamed from: g */
    private final C11953j f44868g;

    /* renamed from: n7.o$b */
    /* compiled from: ComponentRuntime */
    public static final class C11960b {

        /* renamed from: a */
        private final Executor f44869a;

        /* renamed from: b */
        private final List<C11600b<ComponentRegistrar>> f44870b = new ArrayList();

        /* renamed from: c */
        private final List<C11934c<?>> f44871c = new ArrayList();

        /* renamed from: d */
        private C11953j f44872d = C11953j.f44853a;

        C11960b(Executor executor) {
            this.f44869a = executor;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ ComponentRegistrar m57723f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        /* renamed from: b */
        public C11960b mo36283b(C11934c<?> cVar) {
            this.f44871c.add(cVar);
            return this;
        }

        /* renamed from: c */
        public C11960b mo36284c(ComponentRegistrar componentRegistrar) {
            this.f44870b.add(new C11961p(componentRegistrar));
            return this;
        }

        /* renamed from: d */
        public C11960b mo36285d(Collection<C11600b<ComponentRegistrar>> collection) {
            this.f44870b.addAll(collection);
            return this;
        }

        /* renamed from: e */
        public C11958o mo36286e() {
            return new C11958o(this.f44869a, this.f44870b, this.f44871c, this.f44872d);
        }

        /* renamed from: g */
        public C11960b mo36287g(C11953j jVar) {
            this.f44872d = jVar;
            return this;
        }
    }

    /* renamed from: m */
    public static C11960b m57701m(Executor executor) {
        return new C11960b(executor);
    }

    /* renamed from: n */
    private void m57702n(List<C11934c<?>> list) {
        ArrayList<Runnable> arrayList = new ArrayList<>();
        synchronized (this) {
            Iterator<C11600b<ComponentRegistrar>> it = this.f44865d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) it.next().get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f44868g.mo36279a(componentRegistrar));
                        it.remove();
                    }
                } catch (C11971w e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f44862a.isEmpty()) {
                C11962q.m57729a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f44862a.keySet());
                arrayList2.addAll(list);
                C11962q.m57729a(arrayList2);
            }
            for (C11934c next : list) {
                this.f44862a.put(next, new C11972x(new C11956m(this, next)));
            }
            arrayList.addAll(m57710w(list));
            arrayList.addAll(m57711x());
            m57709v();
        }
        for (Runnable run : arrayList) {
            run.run();
        }
        m57708u();
    }

    /* renamed from: o */
    private void m57703o(Map<C11934c<?>, C11600b<?>> map, boolean z) {
        for (Map.Entry next : map.entrySet()) {
            C11934c cVar = (C11934c) next.getKey();
            C11600b bVar = (C11600b) next.getValue();
            if (cVar.mo36251n() || (cVar.mo36252o() && z)) {
                bVar.get();
            }
        }
        this.f44866e.mo36309f();
    }

    /* renamed from: q */
    private static <T> List<T> m57704q(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        for (T add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m57705r(C11934c cVar) {
        return cVar.mo36247h().mo25989a(new C11949g0(cVar, this));
    }

    /* renamed from: u */
    private void m57708u() {
        Boolean bool = this.f44867f.get();
        if (bool != null) {
            m57703o(this.f44862a, bool.booleanValue());
        }
    }

    /* renamed from: v */
    private void m57709v() {
        for (C11934c next : this.f44862a.keySet()) {
            Iterator<C11966r> it = next.mo36246g().iterator();
            while (true) {
                if (it.hasNext()) {
                    C11966r next2 = it.next();
                    if (next2.mo36302g() && !this.f44864c.containsKey(next2.mo36297c())) {
                        this.f44864c.put(next2.mo36297c(), C11973y.m57761b(Collections.emptySet()));
                    } else if (this.f44863b.containsKey(next2.mo36297c())) {
                        continue;
                    } else if (next2.mo36301f()) {
                        throw new C11974z(String.format("Unsatisfied dependency for component %s: %s", new Object[]{next, next2.mo36297c()}));
                    } else if (!next2.mo36302g()) {
                        this.f44863b.put(next2.mo36297c(), C11939d0.m57654e());
                    }
                }
            }
        }
    }

    /* renamed from: w */
    private List<Runnable> m57710w(List<C11934c<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (C11934c next : list) {
            if (next.mo36253p()) {
                C11600b bVar = this.f44862a.get(next);
                for (C11943f0 f0Var : next.mo36249j()) {
                    if (!this.f44863b.containsKey(f0Var)) {
                        this.f44863b.put(f0Var, bVar);
                    } else {
                        arrayList.add(new C11955l((C11939d0) this.f44863b.get(f0Var), bVar));
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: x */
    private List<Runnable> m57711x() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f44862a.entrySet()) {
            C11934c cVar = (C11934c) next.getKey();
            if (!cVar.mo36253p()) {
                C11600b bVar = (C11600b) next.getValue();
                for (C11943f0 f0Var : cVar.mo36249j()) {
                    if (!hashMap.containsKey(f0Var)) {
                        hashMap.put(f0Var, new HashSet());
                    }
                    ((Set) hashMap.get(f0Var)).add(bVar);
                }
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!this.f44864c.containsKey(entry.getKey())) {
                this.f44864c.put((C11943f0) entry.getKey(), C11973y.m57761b((Collection) entry.getValue()));
            } else {
                C11973y yVar = this.f44864c.get(entry.getKey());
                for (C11600b kVar : (Set) entry.getValue()) {
                    arrayList.add(new C11954k(yVar, kVar));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public /* synthetic */ Object mo36263a(Class cls) {
        return C11938d.m57645a(this, cls);
    }

    /* renamed from: b */
    public /* synthetic */ Set mo36264b(C11943f0 f0Var) {
        return C11938d.m57650f(this, f0Var);
    }

    /* renamed from: c */
    public synchronized <T> C11600b<T> mo36265c(C11943f0<T> f0Var) {
        C11941e0.m57672c(f0Var, "Null interface requested.");
        return this.f44863b.get(f0Var);
    }

    /* renamed from: d */
    public /* synthetic */ C11600b mo36266d(Class cls) {
        return C11938d.m57648d(this, cls);
    }

    /* renamed from: e */
    public /* synthetic */ Set mo36267e(Class cls) {
        return C11938d.m57649e(this, cls);
    }

    /* renamed from: f */
    public synchronized <T> C11600b<Set<T>> mo36268f(C11943f0<T> f0Var) {
        C11973y yVar = this.f44864c.get(f0Var);
        if (yVar != null) {
            return yVar;
        }
        return f44861h;
    }

    /* renamed from: g */
    public /* synthetic */ Object mo36269g(C11943f0 f0Var) {
        return C11938d.m57646b(this, f0Var);
    }

    /* renamed from: h */
    public <T> C11598a<T> mo36270h(C11943f0<T> f0Var) {
        C11600b<T> c = mo36265c(f0Var);
        if (c == null) {
            return C11939d0.m57654e();
        }
        if (c instanceof C11939d0) {
            return (C11939d0) c;
        }
        return C11939d0.m57658i(c);
    }

    /* renamed from: i */
    public /* synthetic */ C11598a mo36271i(Class cls) {
        return C11938d.m57647c(this, cls);
    }

    /* renamed from: p */
    public void mo36282p(boolean z) {
        HashMap hashMap;
        if (this.f44867f.compareAndSet((Object) null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.f44862a);
            }
            m57703o(hashMap, z);
        }
    }

    private C11958o(Executor executor, Iterable<C11600b<ComponentRegistrar>> iterable, Collection<C11934c<?>> collection, C11953j jVar) {
        this.f44862a = new HashMap();
        this.f44863b = new HashMap();
        this.f44864c = new HashMap();
        this.f44867f = new AtomicReference<>();
        C11970v vVar = new C11970v(executor);
        this.f44866e = vVar;
        this.f44868g = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C11934c.m57625s(vVar, C11970v.class, C12980d.class, C12979c.class));
        arrayList.add(C11934c.m57625s(this, C12257a.class, new Class[0]));
        for (C11934c next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        this.f44865d = m57704q(iterable);
        m57702n(arrayList);
    }
}
