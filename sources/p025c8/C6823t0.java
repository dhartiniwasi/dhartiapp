package p025c8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p008a8.C6469g1;
import p025c8.C6805l;
import p211d8.C9885i;
import p211d8.C9888l;
import p211d8.C9893q;
import p211d8.C9903u;
import p247h8.C10432b;
import p320p7.C12126c;

/* renamed from: c8.t0 */
/* compiled from: MemoryIndexManager */
class C6823t0 implements C6805l {

    /* renamed from: a */
    private final C6824a f31434a = new C6824a();

    /* renamed from: c8.t0$a */
    /* compiled from: MemoryIndexManager */
    static class C6824a {

        /* renamed from: a */
        private final HashMap<String, HashSet<C9903u>> f31435a = new HashMap<>();

        C6824a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo22898a(C9903u uVar) {
            boolean z = true;
            if (uVar.mo32358r() % 2 != 1) {
                z = false;
            }
            C10432b.m52648d(z, "Expected a collection path.", new Object[0]);
            String n = uVar.mo32354n();
            C9903u uVar2 = (C9903u) uVar.mo32360t();
            HashSet hashSet = this.f31435a.get(n);
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f31435a.put(n, hashSet);
            }
            return hashSet.add(uVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public List<C9903u> mo22899b(String str) {
            HashSet hashSet = this.f31435a.get(str);
            return hashSet != null ? new ArrayList(hashSet) : Collections.emptyList();
        }
    }

    /* renamed from: a */
    public void mo22727a(C9893q qVar) {
    }

    /* renamed from: b */
    public void mo22728b(C12126c<C9888l, C9885i> cVar) {
    }

    /* renamed from: c */
    public List<C9888l> mo22729c(C6469g1 g1Var) {
        return null;
    }

    /* renamed from: d */
    public Collection<C9893q> mo22730d() {
        return Collections.emptyList();
    }

    /* renamed from: e */
    public String mo22731e() {
        return null;
    }

    /* renamed from: f */
    public void mo22732f(C9893q qVar) {
    }

    /* renamed from: g */
    public List<C9903u> mo22733g(String str) {
        return this.f31434a.mo22899b(str);
    }

    /* renamed from: h */
    public C6805l.C6806a mo22734h(C6469g1 g1Var) {
        return C6805l.C6806a.NONE;
    }

    /* renamed from: i */
    public void mo22735i(C9903u uVar) {
        this.f31434a.mo22898a(uVar);
    }

    /* renamed from: j */
    public C9893q.C9894a mo22736j(String str) {
        return C9893q.C9894a.f39725a;
    }

    /* renamed from: k */
    public void mo22737k(String str, C9893q.C9894a aVar) {
    }

    /* renamed from: l */
    public C9893q.C9894a mo22738l(C6469g1 g1Var) {
        return C9893q.C9894a.f39725a;
    }

    public void start() {
    }
}
