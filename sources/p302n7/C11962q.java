package p302n7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: n7.q */
/* compiled from: CycleDetector */
class C11962q {

    /* renamed from: n7.q$b */
    /* compiled from: CycleDetector */
    private static class C11964b {

        /* renamed from: a */
        private final C11934c<?> f44874a;

        /* renamed from: b */
        private final Set<C11964b> f44875b = new HashSet();

        /* renamed from: c */
        private final Set<C11964b> f44876c = new HashSet();

        C11964b(C11934c<?> cVar) {
            this.f44874a = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo36288a(C11964b bVar) {
            this.f44875b.add(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo36289b(C11964b bVar) {
            this.f44876c.add(bVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C11934c<?> mo36290c() {
            return this.f44874a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public Set<C11964b> mo36291d() {
            return this.f44875b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public boolean mo36292e() {
            return this.f44875b.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public boolean mo36293f() {
            return this.f44876c.isEmpty();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo36294g(C11964b bVar) {
            this.f44876c.remove(bVar);
        }
    }

    /* renamed from: n7.q$c */
    /* compiled from: CycleDetector */
    private static class C11965c {

        /* renamed from: a */
        private final C11943f0<?> f44877a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean f44878b;

        public boolean equals(Object obj) {
            if (!(obj instanceof C11965c)) {
                return false;
            }
            C11965c cVar = (C11965c) obj;
            if (!cVar.f44877a.equals(this.f44877a) || cVar.f44878b != this.f44878b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return ((this.f44877a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f44878b).hashCode();
        }

        private C11965c(C11943f0<?> f0Var, boolean z) {
            this.f44877a = f0Var;
            this.f44878b = z;
        }
    }

    /* renamed from: a */
    static void m57729a(List<C11934c<?>> list) {
        Set<C11964b> c = m57731c(list);
        Set<C11964b> b = m57730b(c);
        int i = 0;
        while (!b.isEmpty()) {
            C11964b next = b.iterator().next();
            b.remove(next);
            i++;
            for (C11964b next2 : next.mo36291d()) {
                next2.mo36294g(next);
                if (next2.mo36293f()) {
                    b.add(next2);
                }
            }
        }
        if (i != list.size()) {
            ArrayList arrayList = new ArrayList();
            for (C11964b next3 : c) {
                if (!next3.mo36293f() && !next3.mo36292e()) {
                    arrayList.add(next3.mo36290c());
                }
            }
            throw new C11967s(arrayList);
        }
    }

    /* renamed from: b */
    private static Set<C11964b> m57730b(Set<C11964b> set) {
        HashSet hashSet = new HashSet();
        for (C11964b next : set) {
            if (next.mo36293f()) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    private static Set<C11964b> m57731c(List<C11934c<?>> list) {
        Set<C11964b> set;
        HashMap hashMap = new HashMap(list.size());
        for (C11934c next : list) {
            C11964b bVar = new C11964b(next);
            Iterator it = next.mo36249j().iterator();
            while (true) {
                if (it.hasNext()) {
                    C11943f0 f0Var = (C11943f0) it.next();
                    C11965c cVar = new C11965c(f0Var, !next.mo36253p());
                    if (!hashMap.containsKey(cVar)) {
                        hashMap.put(cVar, new HashSet());
                    }
                    Set set2 = (Set) hashMap.get(cVar);
                    if (set2.isEmpty() || cVar.f44878b) {
                        set2.add(bVar);
                    } else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{f0Var}));
                    }
                }
            }
        }
        for (Set<C11964b> it2 : hashMap.values()) {
            for (C11964b bVar2 : it2) {
                for (C11966r next2 : bVar2.mo36290c().mo36246g()) {
                    if (next2.mo36299e() && (set = (Set) hashMap.get(new C11965c(next2.mo36297c(), next2.mo36302g()))) != null) {
                        for (C11964b bVar3 : set) {
                            bVar2.mo36288a(bVar3);
                            bVar3.mo36289b(bVar2);
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set addAll : hashMap.values()) {
            hashSet.addAll(addAll);
        }
        return hashSet;
    }
}
