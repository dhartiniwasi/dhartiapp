package p190b7;

import java.util.Collection;
import java.util.Map;

/* renamed from: b7.z */
/* compiled from: Multimap */
public interface C6714z<K, V> {
    /* renamed from: a */
    Map<K, Collection<V>> mo22260a();

    void clear();

    boolean put(K k, V v);

    int size();

    Collection<V> values();
}
