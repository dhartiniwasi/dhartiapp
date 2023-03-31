package com.google.protobuf;

import com.google.protobuf.C8119d0;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.c */
/* compiled from: AbstractProtobufList */
abstract class C8113c<E> extends AbstractList<E> implements C8119d0.C8130j<E> {

    /* renamed from: a */
    private boolean f34842a = true;

    C8113c() {
    }

    /* renamed from: F1 */
    public boolean mo26802F1() {
        return this.f34842a;
    }

    /* renamed from: H */
    public final void mo26803H() {
        this.f34842a = false;
    }

    public boolean add(E e) {
        mo26807b();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo26807b();
        return super.addAll(collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo26807b() {
        if (!this.f34842a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo26807b();
        super.clear();
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

    public abstract E remove(int i);

    public boolean remove(Object obj) {
        mo26807b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        mo26807b();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        mo26807b();
        return super.retainAll(collection);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo26807b();
        return super.addAll(i, collection);
    }
}
