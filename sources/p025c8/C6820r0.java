package p025c8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import p211d8.C9888l;
import p211d8.C9903u;
import p220e8.C10009f;
import p220e8.C10014k;
import p247h8.C10472x;

/* renamed from: c8.r0 */
/* compiled from: MemoryDocumentOverlayCache */
public class C6820r0 implements C6775b {

    /* renamed from: a */
    private final TreeMap<C9888l, C10014k> f31426a = new TreeMap<>();

    /* renamed from: b */
    private final Map<Integer, Set<C9888l>> f31427b = new HashMap();

    /* renamed from: g */
    private void m39143g(int i, C10009f fVar) {
        C10014k kVar = this.f31426a.get(fVar.mo32598g());
        if (kVar != null) {
            this.f31427b.get(Integer.valueOf(kVar.mo32576c())).remove(fVar.mo32598g());
        }
        this.f31426a.put(fVar.mo32598g(), C10014k.m51138a(i, fVar));
        if (this.f31427b.get(Integer.valueOf(i)) == null) {
            this.f31427b.put(Integer.valueOf(i), new HashSet());
        }
        this.f31427b.get(Integer.valueOf(i)).add(fVar.mo32598g());
    }

    /* renamed from: a */
    public Map<C9888l, C10014k> mo22718a(SortedSet<C9888l> sortedSet) {
        HashMap hashMap = new HashMap();
        for (C9888l lVar : sortedSet) {
            C10014k kVar = this.f31426a.get(lVar);
            if (kVar != null) {
                hashMap.put(lVar, kVar);
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public void mo22719b(int i) {
        if (this.f31427b.containsKey(Integer.valueOf(i))) {
            this.f31427b.remove(Integer.valueOf(i));
            for (C9888l remove : this.f31427b.get(Integer.valueOf(i))) {
                this.f31426a.remove(remove);
            }
        }
    }

    /* renamed from: c */
    public C10014k mo22720c(C9888l lVar) {
        return this.f31426a.get(lVar);
    }

    /* renamed from: d */
    public void mo22721d(int i, Map<C9888l, C10009f> map) {
        for (Map.Entry next : map.entrySet()) {
            m39143g(i, (C10009f) C10472x.m52787d((C10009f) next.getValue(), "null value for key: %s", next.getKey()));
        }
    }

    /* renamed from: e */
    public Map<C9888l, C10014k> mo22722e(String str, int i, int i2) {
        TreeMap treeMap = new TreeMap();
        for (C10014k next : this.f31426a.values()) {
            if (next.mo32625b().mo32387p().equals(str) && next.mo32576c() > i) {
                Map map = (Map) treeMap.get(Integer.valueOf(next.mo32576c()));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(next.mo32576c()), map);
                }
                map.put(next.mo32625b(), next);
            }
        }
        HashMap hashMap = new HashMap();
        for (Map putAll : treeMap.values()) {
            hashMap.putAll(putAll);
            if (hashMap.size() >= i2) {
                break;
            }
        }
        return hashMap;
    }

    /* renamed from: f */
    public Map<C9888l, C10014k> mo22723f(C9903u uVar, int i) {
        HashMap hashMap = new HashMap();
        int r = uVar.mo32358r() + 1;
        for (C10014k next : this.f31426a.tailMap(C9888l.m50697n((C9903u) uVar.mo32347b(""))).values()) {
            C9888l b = next.mo32625b();
            if (!uVar.mo32357q(b.mo32390s())) {
                break;
            } else if (b.mo32390s().mo32358r() == r && next.mo32576c() > i) {
                hashMap.put(next.mo32625b(), next);
            }
        }
        return hashMap;
    }
}
