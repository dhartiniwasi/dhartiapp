package p220e8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p211d8.C9885i;
import p211d8.C9888l;
import p211d8.C9898r;
import p211d8.C9899s;
import p211d8.C9902t;
import p246h7.C10428q;
import p247h8.C10432b;
import p405y8.C13088b0;

/* renamed from: e8.f */
/* compiled from: Mutation */
public abstract class C10009f {

    /* renamed from: a */
    private final C9888l f39962a;

    /* renamed from: b */
    private final C10016m f39963b;

    /* renamed from: c */
    private final List<C10008e> f39964c;

    C10009f(C9888l lVar, C10016m mVar) {
        this(lVar, mVar, new ArrayList());
    }

    /* renamed from: c */
    public static C10009f m51101c(C9899s sVar, C10007d dVar) {
        if (!sVar.mo32373d()) {
            return null;
        }
        if (dVar != null && dVar.mo32588c().isEmpty()) {
            return null;
        }
        if (dVar != null) {
            C9902t data = sVar.getData();
            C9902t tVar = new C9902t();
            HashSet hashSet = new HashSet();
            for (C9898r next : dVar.mo32588c()) {
                if (!hashSet.contains(next)) {
                    if (data.mo32430h(next) == null && next.mo32358r() > 1) {
                        next = (C9898r) next.mo32360t();
                    }
                    tVar.mo32434k(next, data.mo32430h(next));
                    hashSet.add(next);
                }
            }
            return new C10015l(sVar.getKey(), tVar, C10007d.m51096b(hashSet), C10016m.f39979c);
        } else if (sVar.mo32379h()) {
            return new C10006c(sVar.getKey(), C10016m.f39979c);
        } else {
            return new C10018o(sVar.getKey(), sVar.getData(), C10016m.f39979c);
        }
    }

    /* renamed from: a */
    public abstract C10007d mo32581a(C9899s sVar, C10007d dVar, C10428q qVar);

    /* renamed from: b */
    public abstract void mo32582b(C9899s sVar, C10012i iVar);

    /* renamed from: d */
    public C9902t mo32596d(C9885i iVar) {
        C9902t tVar = null;
        for (C10008e next : this.f39964c) {
            C13088b0 b = next.mo32593b().mo32570b(iVar.mo32376g(next.mo32592a()));
            if (b != null) {
                if (tVar == null) {
                    tVar = new C9902t();
                }
                tVar.mo32434k(next.mo32592a(), b);
            }
        }
        return tVar;
    }

    /* renamed from: e */
    public abstract C10007d mo32583e();

    /* renamed from: f */
    public List<C10008e> mo32597f() {
        return this.f39964c;
    }

    /* renamed from: g */
    public C9888l mo32598g() {
        return this.f39962a;
    }

    /* renamed from: h */
    public C10016m mo32599h() {
        return this.f39963b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo32600i(C10009f fVar) {
        return this.f39962a.equals(fVar.f39962a) && this.f39963b.equals(fVar.f39963b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public int mo32601j() {
        return (mo32598g().hashCode() * 31) + this.f39963b.hashCode();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public String mo32602k() {
        return "key=" + this.f39962a + ", precondition=" + this.f39963b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Map<C9898r, C13088b0> mo32603l(C10428q qVar, C9899s sVar) {
        HashMap hashMap = new HashMap(this.f39964c.size());
        for (C10008e next : this.f39964c) {
            hashMap.put(next.mo32592a(), next.mo32593b().mo32569a(sVar.mo32376g(next.mo32592a()), qVar));
        }
        return hashMap;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public Map<C9898r, C13088b0> mo32604m(C9899s sVar, List<C13088b0> list) {
        HashMap hashMap = new HashMap(this.f39964c.size());
        C10432b.m52648d(this.f39964c.size() == list.size(), "server transform count (%d) should match field transform count (%d)", Integer.valueOf(list.size()), Integer.valueOf(this.f39964c.size()));
        for (int i = 0; i < list.size(); i++) {
            C10008e eVar = this.f39964c.get(i);
            hashMap.put(eVar.mo32592a(), eVar.mo32593b().mo32571c(sVar.mo32376g(eVar.mo32592a()), list.get(i)));
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo32605n(C9899s sVar) {
        C10432b.m52648d(sVar.getKey().equals(mo32598g()), "Can only apply a mutation to a document with the same key", new Object[0]);
    }

    C10009f(C9888l lVar, C10016m mVar, List<C10008e> list) {
        this.f39962a = lVar;
        this.f39963b = mVar;
        this.f39964c = list;
    }
}
