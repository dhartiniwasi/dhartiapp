package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.q7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
abstract class C7137q7 extends AbstractList implements C7091n9 {

    /* renamed from: a */
    private boolean f31973a = true;

    C7137q7() {
    }

    public boolean add(Object obj) {
        mo23768b();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo23768b();
        return super.addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo23768b() {
        if (!this.f31973a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo23768b();
        super.clear();
    }

    /* renamed from: d */
    public final void mo23697d() {
        this.f31973a = false;
    }

    /* renamed from: e */
    public final boolean mo23698e() {
        return this.f31973a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public abstract Object remove(int i);

    public final boolean remove(Object obj) {
        mo23768b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        mo23768b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo23768b();
        return super.retainAll(collection);
    }

    public boolean addAll(Collection collection) {
        mo23768b();
        return super.addAll(collection);
    }
}
