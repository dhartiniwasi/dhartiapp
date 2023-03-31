package p220e8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p211d8.C9888l;
import p211d8.C9898r;
import p211d8.C9899s;
import p211d8.C9902t;
import p246h7.C10428q;
import p405y8.C13088b0;

/* renamed from: e8.l */
/* compiled from: PatchMutation */
public final class C10015l extends C10009f {

    /* renamed from: d */
    private final C9902t f39977d;

    /* renamed from: e */
    private final C10007d f39978e;

    public C10015l(C9888l lVar, C9902t tVar, C10007d dVar, C10016m mVar) {
        this(lVar, tVar, dVar, mVar, new ArrayList());
    }

    /* renamed from: o */
    private List<C9898r> m51142o() {
        ArrayList arrayList = new ArrayList();
        for (C10008e a : mo32597f()) {
            arrayList.add(a.mo32592a());
        }
        return arrayList;
    }

    /* renamed from: p */
    private Map<C9898r, C13088b0> m51143p() {
        HashMap hashMap = new HashMap();
        for (C9898r next : this.f39978e.mo32588c()) {
            if (!next.mo32356p()) {
                hashMap.put(next, this.f39977d.mo32430h(next));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public C10007d mo32581a(C9899s sVar, C10007d dVar, C10428q qVar) {
        mo32605n(sVar);
        if (!mo32599h().mo32633e(sVar)) {
            return dVar;
        }
        Map<C9898r, C13088b0> l = mo32603l(qVar, sVar);
        Map<C9898r, C13088b0> p = m51143p();
        C9902t data = sVar.getData();
        data.mo32435l(p);
        data.mo32435l(l);
        sVar.mo32418k(sVar.mo32381j(), sVar.getData()).mo32423t();
        if (dVar == null) {
            return null;
        }
        HashSet hashSet = new HashSet(dVar.mo32588c());
        hashSet.addAll(this.f39978e.mo32588c());
        hashSet.addAll(m51142o());
        return C10007d.m51096b(hashSet);
    }

    /* renamed from: b */
    public void mo32582b(C9899s sVar, C10012i iVar) {
        mo32605n(sVar);
        if (!mo32599h().mo32633e(sVar)) {
            sVar.mo32420m(iVar.mo32623b());
            return;
        }
        Map<C9898r, C13088b0> m = mo32604m(sVar, iVar.mo32622a());
        C9902t data = sVar.getData();
        data.mo32435l(m51143p());
        data.mo32435l(m);
        sVar.mo32418k(iVar.mo32623b(), sVar.getData()).mo32422s();
    }

    /* renamed from: e */
    public C10007d mo32583e() {
        return this.f39978e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10015l.class != obj.getClass()) {
            return false;
        }
        C10015l lVar = (C10015l) obj;
        if (!mo32600i(lVar) || !this.f39977d.equals(lVar.f39977d) || !mo32597f().equals(lVar.mo32597f())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (mo32601j() * 31) + this.f39977d.hashCode();
    }

    /* renamed from: q */
    public C9902t mo32628q() {
        return this.f39977d;
    }

    public String toString() {
        return "PatchMutation{" + mo32602k() + ", mask=" + this.f39978e + ", value=" + this.f39977d + "}";
    }

    public C10015l(C9888l lVar, C9902t tVar, C10007d dVar, C10016m mVar, List<C10008e> list) {
        super(lVar, mVar, list);
        this.f39977d = tVar;
        this.f39978e = dVar;
    }
}
