package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
class l93 extends AbstractCollection {

    /* renamed from: a */
    final Object f12695a;

    /* renamed from: b */
    Collection f12696b;

    /* renamed from: c */
    final l93 f12697c;

    /* renamed from: d */
    final Collection f12698d;

    /* renamed from: e */
    final /* synthetic */ o93 f12699e;

    l93(o93 o93, Object obj, Collection collection, l93 l93) {
        this.f12699e = o93;
        this.f12695a = obj;
        this.f12696b = collection;
        this.f12697c = l93;
        this.f12698d = l93 == null ? null : l93.f12696b;
    }

    public final boolean add(Object obj) {
        mo11947d();
        boolean isEmpty = this.f12696b.isEmpty();
        boolean add = this.f12696b.add(obj);
        if (!add) {
            return add;
        }
        o93.m17637l(this.f12699e);
        if (!isEmpty) {
            return add;
        }
        mo11942b();
        return true;
    }

    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.f12696b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        o93.m17639n(this.f12699e, this.f12696b.size() - size);
        if (size != 0) {
            return addAll;
        }
        mo11942b();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo11942b() {
        l93 l93 = this.f12697c;
        if (l93 != null) {
            l93.mo11942b();
        } else {
            this.f12699e.f15008d.put(this.f12695a, this.f12696b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo11943c() {
        l93 l93 = this.f12697c;
        if (l93 != null) {
            l93.mo11943c();
        } else if (this.f12696b.isEmpty()) {
            this.f12699e.f15008d.remove(this.f12695a);
        }
    }

    public final void clear() {
        int size = size();
        if (size != 0) {
            this.f12696b.clear();
            o93.m17640o(this.f12699e, size);
            mo11943c();
        }
    }

    public final boolean contains(Object obj) {
        mo11947d();
        return this.f12696b.contains(obj);
    }

    public final boolean containsAll(Collection collection) {
        mo11947d();
        return this.f12696b.containsAll(collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo11947d() {
        Collection collection;
        l93 l93 = this.f12697c;
        if (l93 != null) {
            l93.mo11947d();
            if (this.f12697c.f12696b != this.f12698d) {
                throw new ConcurrentModificationException();
            }
        } else if (this.f12696b.isEmpty() && (collection = (Collection) this.f12699e.f15008d.get(this.f12695a)) != null) {
            this.f12696b = collection;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        mo11947d();
        return this.f12696b.equals(obj);
    }

    public final int hashCode() {
        mo11947d();
        return this.f12696b.hashCode();
    }

    public final Iterator iterator() {
        mo11947d();
        return new k93(this);
    }

    public final boolean remove(Object obj) {
        mo11947d();
        boolean remove = this.f12696b.remove(obj);
        if (remove) {
            o93.m17638m(this.f12699e);
            mo11943c();
        }
        return remove;
    }

    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.f12696b.removeAll(collection);
        if (removeAll) {
            o93.m17639n(this.f12699e, this.f12696b.size() - size);
            mo11943c();
        }
        return removeAll;
    }

    public final boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        int size = size();
        boolean retainAll = this.f12696b.retainAll(collection);
        if (retainAll) {
            o93.m17639n(this.f12699e, this.f12696b.size() - size);
            mo11943c();
        }
        return retainAll;
    }

    public final int size() {
        mo11947d();
        return this.f12696b.size();
    }

    public final String toString() {
        mo11947d();
        return this.f12696b.toString();
    }
}
