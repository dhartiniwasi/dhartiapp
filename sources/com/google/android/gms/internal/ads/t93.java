package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class t93 extends AbstractCollection {

    /* renamed from: a */
    final Collection f17905a;

    /* renamed from: b */
    final c83 f17906b;

    t93(Collection collection, c83 c83) {
        this.f17905a = collection;
        this.f17906b = c83;
    }

    public final boolean add(Object obj) {
        b83.m10241e(this.f17906b.mo8567b(obj));
        return this.f17905a.add(obj);
    }

    public final boolean addAll(Collection collection) {
        for (Object b : collection) {
            b83.m10241e(this.f17906b.mo8567b(b));
        }
        return this.f17905a.addAll(collection);
    }

    public final void clear() {
        ab3.m9674a(this.f17905a, this.f17906b);
    }

    public final boolean contains(Object obj) {
        if (u93.m21494a(this.f17905a, obj)) {
            return this.f17906b.mo8567b(obj);
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        Collection<Object> collection = this.f17905a;
        c83 c83 = this.f17906b;
        b83.m10239c(c83, "predicate");
        int i = 0;
        for (Object b : collection) {
            if (!c83.mo8567b(b)) {
                i++;
            } else if (i != -1) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    public final Iterator iterator() {
        Iterator it = this.f17905a.iterator();
        c83 c83 = this.f17906b;
        Objects.requireNonNull(it);
        Objects.requireNonNull(c83);
        return new bb3(it, c83);
    }

    public final boolean remove(Object obj) {
        return contains(obj) && this.f17905a.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        Iterator it = this.f17905a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f17906b.mo8567b(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        Iterator it = this.f17905a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f17906b.mo8567b(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public final int size() {
        int i = 0;
        for (Object b : this.f17905a) {
            if (this.f17906b.mo8567b(b)) {
                i++;
            }
        }
        return i;
    }

    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        eb3.m12010c(arrayList, it);
        return arrayList.toArray();
    }

    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        eb3.m12010c(arrayList, it);
        return arrayList.toArray(objArr);
    }
}
