package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.kb */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7045kb extends AbstractSet {

    /* renamed from: a */
    final /* synthetic */ C7077mb f31793a;

    /* synthetic */ C7045kb(C7077mb mbVar, C7029jb jbVar) {
        this.f31793a = mbVar;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f31793a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f31793a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f31793a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value || (obj2 != null && obj2.equals(value))) {
            return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return new C7013ib(this.f31793a, (C6997hb) null);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f31793a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f31793a.size();
    }
}
