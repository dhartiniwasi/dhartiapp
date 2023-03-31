package p190b7;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: b7.l */
/* compiled from: ForwardingMap */
public abstract class C6667l<K, V> extends C6669m implements Map<K, V> {
    protected C6667l() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map<K, V> mo20397c();

    public void clear() {
        mo20397c().clear();
    }

    public boolean containsKey(Object obj) {
        return mo20397c().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return mo20397c().containsValue(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo22480d(Object obj) {
        return C6705y.m38541b(this, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo22481e(Object obj) {
        return C6705y.m38542c(this, obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return mo20397c().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || mo20397c().equals(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo22482f() {
        return C6678p0.m38429d(entrySet());
    }

    public V get(Object obj) {
        return mo20397c().get(obj);
    }

    public int hashCode() {
        return mo20397c().hashCode();
    }

    public boolean isEmpty() {
        return mo20397c().isEmpty();
    }

    public Set<K> keySet() {
        return mo20397c().keySet();
    }

    public V put(K k, V v) {
        return mo20397c().put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        mo20397c().putAll(map);
    }

    public V remove(Object obj) {
        return mo20397c().remove(obj);
    }

    public int size() {
        return mo20397c().size();
    }

    public Collection<V> values() {
        return mo20397c().values();
    }
}
