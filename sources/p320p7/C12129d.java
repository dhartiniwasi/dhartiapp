package p320p7;

import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: p7.d */
/* compiled from: ImmutableSortedMapIterator */
public class C12129d<K, V> implements Iterator<Map.Entry<K, V>> {

    /* renamed from: a */
    private final ArrayDeque<C12137j<K, V>> f45179a = new ArrayDeque<>();

    /* renamed from: b */
    private final boolean f45180b;

    C12129d(C12134h<K, V> hVar, K k, Comparator<K> comparator, boolean z) {
        int i;
        this.f45180b = z;
        while (!hVar.isEmpty()) {
            if (k != null) {
                i = z ? comparator.compare(k, hVar.getKey()) : comparator.compare(hVar.getKey(), k);
            } else {
                i = 1;
            }
            if (i < 0) {
                if (z) {
                    hVar = hVar.mo36655a();
                } else {
                    hVar = hVar.mo36659f();
                }
            } else if (i == 0) {
                this.f45179a.push((C12137j) hVar);
                return;
            } else {
                this.f45179a.push((C12137j) hVar);
                if (z) {
                    hVar = hVar.mo36659f();
                } else {
                    hVar = hVar.mo36655a();
                }
            }
        }
    }

    /* renamed from: a */
    public Map.Entry<K, V> next() {
        try {
            C12137j pop = this.f45179a.pop();
            AbstractMap.SimpleEntry simpleEntry = new AbstractMap.SimpleEntry(pop.getKey(), pop.getValue());
            if (this.f45180b) {
                for (C12134h a = pop.mo36655a(); !a.isEmpty(); a = a.mo36659f()) {
                    this.f45179a.push((C12137j) a);
                }
            } else {
                for (C12134h f = pop.mo36659f(); !f.isEmpty(); f = f.mo36655a()) {
                    this.f45179a.push((C12137j) f);
                }
            }
            return simpleEntry;
        } catch (EmptyStackException unused) {
            throw new NoSuchElementException();
        }
    }

    public boolean hasNext() {
        return this.f45179a.size() > 0;
    }

    public void remove() {
        throw new UnsupportedOperationException("remove called on immutable collection");
    }
}
