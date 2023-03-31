package p220e8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p025c8.C6776b1;
import p211d8.C9888l;
import p211d8.C9899s;
import p211d8.C9905w;
import p246h7.C10428q;
import p247h8.C10432b;

/* renamed from: e8.g */
/* compiled from: MutationBatch */
public final class C10010g {

    /* renamed from: a */
    private final int f39965a;

    /* renamed from: b */
    private final C10428q f39966b;

    /* renamed from: c */
    private final List<C10009f> f39967c;

    /* renamed from: d */
    private final List<C10009f> f39968d;

    public C10010g(int i, C10428q qVar, List<C10009f> list, List<C10009f> list2) {
        C10432b.m52648d(!list2.isEmpty(), "Cannot create an empty mutation batch", new Object[0]);
        this.f39965a = i;
        this.f39966b = qVar;
        this.f39967c = list;
        this.f39968d = list2;
    }

    /* renamed from: a */
    public Map<C9888l, C10009f> mo32606a(Map<C9888l, C6776b1> map, Set<C9888l> set) {
        HashMap hashMap = new HashMap();
        for (C9888l next : mo32612f()) {
            C9899s sVar = (C9899s) map.get(next).mo22724a();
            C10007d b = mo32607b(sVar, map.get(next).mo22725b());
            if (set.contains(next)) {
                b = null;
            }
            C10009f c = C10009f.m51101c(sVar, b);
            if (c != null) {
                hashMap.put(next, c);
            }
            if (!sVar.mo32421n()) {
                sVar.mo32419l(C9905w.f39751b);
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public C10007d mo32607b(C9899s sVar, C10007d dVar) {
        for (int i = 0; i < this.f39967c.size(); i++) {
            C10009f fVar = this.f39967c.get(i);
            if (fVar.mo32598g().equals(sVar.getKey())) {
                dVar = fVar.mo32581a(sVar, dVar, this.f39966b);
            }
        }
        for (int i2 = 0; i2 < this.f39968d.size(); i2++) {
            C10009f fVar2 = this.f39968d.get(i2);
            if (fVar2.mo32598g().equals(sVar.getKey())) {
                dVar = fVar2.mo32581a(sVar, dVar, this.f39966b);
            }
        }
        return dVar;
    }

    /* renamed from: c */
    public void mo32608c(C9899s sVar, C10011h hVar) {
        int size = this.f39968d.size();
        List<C10012i> e = hVar.mo32620e();
        C10432b.m52648d(e.size() == size, "Mismatch between mutations length (%d) and results length (%d)", Integer.valueOf(size), Integer.valueOf(e.size()));
        for (int i = 0; i < size; i++) {
            C10009f fVar = this.f39968d.get(i);
            if (fVar.mo32598g().equals(sVar.getKey())) {
                fVar.mo32582b(sVar, e.get(i));
            }
        }
    }

    /* renamed from: d */
    public List<C10009f> mo32609d() {
        return this.f39967c;
    }

    /* renamed from: e */
    public int mo32610e() {
        return this.f39965a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10010g.class != obj.getClass()) {
            return false;
        }
        C10010g gVar = (C10010g) obj;
        if (this.f39965a != gVar.f39965a || !this.f39966b.equals(gVar.f39966b) || !this.f39967c.equals(gVar.f39967c) || !this.f39968d.equals(gVar.f39968d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public Set<C9888l> mo32612f() {
        HashSet hashSet = new HashSet();
        for (C10009f g : this.f39968d) {
            hashSet.add(g.mo32598g());
        }
        return hashSet;
    }

    /* renamed from: g */
    public C10428q mo32613g() {
        return this.f39966b;
    }

    /* renamed from: h */
    public List<C10009f> mo32614h() {
        return this.f39968d;
    }

    public int hashCode() {
        return (((((this.f39965a * 31) + this.f39966b.hashCode()) * 31) + this.f39967c.hashCode()) * 31) + this.f39968d.hashCode();
    }

    public String toString() {
        return "MutationBatch(batchId=" + this.f39965a + ", localWriteTime=" + this.f39966b + ", baseMutations=" + this.f39967c + ", mutations=" + this.f39968d + ')';
    }
}
