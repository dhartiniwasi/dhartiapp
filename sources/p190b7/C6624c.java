package p190b7;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: b7.c */
/* compiled from: AbstractListMultimap */
abstract class C6624c<K, V> extends C6627d<K, V> implements C6702v<K, V> {
    protected C6624c(Map<K, Collection<V>> map) {
        super(map);
    }

    /* renamed from: a */
    public Map<K, Collection<V>> mo22260a() {
        return super.mo22260a();
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public boolean put(K k, V v) {
        return super.put(k, v);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public <E> Collection<E> mo22263u(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public Collection<V> mo22264v(K k, Collection<V> collection) {
        return mo22277w(k, (List) collection, (C6627d<K, V>.j) null);
    }
}
