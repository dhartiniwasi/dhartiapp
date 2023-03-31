package p320p7;

import p320p7.C12134h;

/* renamed from: p7.i */
/* compiled from: LLRBRedValueNode */
public class C12136i<K, V> extends C12137j<K, V> {
    C12136i(K k, V v) {
        super(k, v, C12133g.m58289i(), C12133g.m58289i());
    }

    /* renamed from: e */
    public boolean mo36650e() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C12137j<K, V> mo36651k(K k, V v, C12134h<K, V> hVar, C12134h<K, V> hVar2) {
        if (k == null) {
            k = getKey();
        }
        if (v == null) {
            v = getValue();
        }
        if (hVar == null) {
            hVar = mo36655a();
        }
        if (hVar2 == null) {
            hVar2 = mo36659f();
        }
        return new C12136i(k, v, hVar, hVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C12134h.C12135a mo36652m() {
        return C12134h.C12135a.RED;
    }

    public int size() {
        return mo36655a().size() + 1 + mo36659f().size();
    }

    C12136i(K k, V v, C12134h<K, V> hVar, C12134h<K, V> hVar2) {
        super(k, v, hVar, hVar2);
    }
}
