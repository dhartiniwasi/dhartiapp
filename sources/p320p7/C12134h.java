package p320p7;

import java.util.Comparator;

/* renamed from: p7.h */
/* compiled from: LLRBNode */
public interface C12134h<K, V> {

    /* renamed from: p7.h$a */
    /* compiled from: LLRBNode */
    public enum C12135a {
        RED,
        BLACK
    }

    /* renamed from: a */
    C12134h<K, V> mo36655a();

    /* renamed from: b */
    C12134h<K, V> mo36656b(K k, V v, Comparator<K> comparator);

    /* renamed from: c */
    C12134h<K, V> mo36657c(K k, Comparator<K> comparator);

    /* renamed from: d */
    C12134h<K, V> mo36658d(K k, V v, C12135a aVar, C12134h<K, V> hVar, C12134h<K, V> hVar2);

    /* renamed from: e */
    boolean mo36650e();

    /* renamed from: f */
    C12134h<K, V> mo36659f();

    /* renamed from: g */
    C12134h<K, V> mo36660g();

    K getKey();

    V getValue();

    /* renamed from: h */
    C12134h<K, V> mo36663h();

    boolean isEmpty();

    int size();
}
