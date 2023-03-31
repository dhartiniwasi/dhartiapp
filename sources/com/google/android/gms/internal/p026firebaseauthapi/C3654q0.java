package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.q0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
abstract class C3654q0 extends AbstractList implements C3590o2 {

    /* renamed from: a */
    private boolean f22539a = true;

    C3654q0() {
    }

    public boolean add(Object obj) {
        mo16587b();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo16587b();
        return super.addAll(i, collection);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo16587b() {
        if (!this.f22539a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        mo16587b();
        super.clear();
    }

    /* renamed from: d */
    public final void mo16475d() {
        this.f22539a = false;
    }

    /* renamed from: e */
    public final boolean mo16476e() {
        return this.f22539a;
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
        mo16587b();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        mo16587b();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo16587b();
        return super.retainAll(collection);
    }

    public boolean addAll(Collection collection) {
        mo16587b();
        return super.addAll(collection);
    }
}
