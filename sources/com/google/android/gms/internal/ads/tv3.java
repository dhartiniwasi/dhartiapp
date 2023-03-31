package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class tv3 extends AbstractList implements by3 {

    /* renamed from: a */
    private boolean f18271a = true;

    tv3() {
    }

    public boolean add(Object obj) {
        mo14403b();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo14403b();
        return super.addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo14403b() {
        if (!this.f18271a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo14403b();
        super.clear();
    }

    /* renamed from: d */
    public final void mo8987d() {
        this.f18271a = false;
    }

    /* renamed from: e */
    public final boolean mo8988e() {
        return this.f18271a;
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
        mo14403b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        mo14403b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo14403b();
        return super.retainAll(collection);
    }

    public boolean addAll(Collection collection) {
        mo14403b();
        return super.addAll(collection);
    }
}
