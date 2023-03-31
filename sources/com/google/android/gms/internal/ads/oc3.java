package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.SortedSet;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class oc3 extends nc3 implements SortedSet {
    oc3(SortedSet sortedSet, c83 c83) {
        super(sortedSet, c83);
    }

    public final Comparator comparator() {
        return ((SortedSet) this.f17905a).comparator();
    }

    public final Object first() {
        Iterator it = this.f17905a.iterator();
        c83 c83 = this.f17906b;
        Objects.requireNonNull(it);
        Objects.requireNonNull(c83);
        while (it.hasNext()) {
            Object next = it.next();
            if (c83.mo8567b(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    public final SortedSet headSet(Object obj) {
        return new oc3(((SortedSet) this.f17905a).headSet(obj), this.f17906b);
    }

    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f17905a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f17906b.mo8567b(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return new oc3(((SortedSet) this.f17905a).subSet(obj, obj2), this.f17906b);
    }

    public final SortedSet tailSet(Object obj) {
        return new oc3(((SortedSet) this.f17905a).tailSet(obj), this.f17906b);
    }
}
