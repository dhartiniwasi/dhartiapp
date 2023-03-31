package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class nb3 extends AbstractCollection {

    /* renamed from: a */
    final Map f13938a;

    nb3(Map map) {
        this.f13938a = map;
    }

    public final void clear() {
        this.f13938a.clear();
    }

    public final boolean contains(Object obj) {
        return this.f13938a.containsValue(obj);
    }

    public final boolean isEmpty() {
        return this.f13938a.isEmpty();
    }

    public final Iterator iterator() {
        return new kb3(this.f13938a.entrySet().iterator());
    }

    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry entry : this.f13938a.entrySet()) {
                if (w73.m22614a(obj, entry.getValue())) {
                    this.f13938a.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean removeAll(Collection collection) {
        Objects.requireNonNull(collection);
        try {
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : this.f13938a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f13938a.keySet().removeAll(hashSet);
        }
    }

    public final boolean retainAll(Collection collection) {
        Objects.requireNonNull(collection);
        try {
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry entry : this.f13938a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSet.add(entry.getKey());
                }
            }
            return this.f13938a.keySet().retainAll(hashSet);
        }
    }

    public final int size() {
        return this.f13938a.size();
    }
}
