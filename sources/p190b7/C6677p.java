package p190b7;

import java.io.Serializable;

/* renamed from: b7.p */
/* compiled from: ImmutableEntry */
class C6677p<K, V> extends C6645e<K, V> implements Serializable {

    /* renamed from: a */
    final K f31170a;

    /* renamed from: b */
    final V f31171b;

    C6677p(K k, V v) {
        this.f31170a = k;
        this.f31171b = v;
    }

    public final K getKey() {
        return this.f31170a;
    }

    public final V getValue() {
        return this.f31171b;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
