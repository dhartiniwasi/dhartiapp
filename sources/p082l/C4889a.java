package p082l;

import java.util.HashMap;
import java.util.Map;
import p082l.C4890b;

/* renamed from: l.a */
/* compiled from: FastSafeIterableMap */
public class C4889a<K, V> extends C4890b<K, V> {

    /* renamed from: e */
    private HashMap<K, C4890b.C4893c<K, V>> f25833e = new HashMap<>();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C4890b.C4893c<K, V> mo18677c(K k) {
        return this.f25833e.get(k);
    }

    public boolean contains(K k) {
        return this.f25833e.containsKey(k);
    }

    /* renamed from: k */
    public V mo18679k(K k, V v) {
        C4890b.C4893c c = mo18677c(k);
        if (c != null) {
            return c.f25839b;
        }
        this.f25833e.put(k, mo18689j(k, v));
        return null;
    }

    /* renamed from: l */
    public V mo18680l(K k) {
        V l = super.mo18680l(k);
        this.f25833e.remove(k);
        return l;
    }

    /* renamed from: o */
    public Map.Entry<K, V> mo18681o(K k) {
        if (contains(k)) {
            return this.f25833e.get(k).f25841d;
        }
        return null;
    }
}
