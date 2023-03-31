package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class pa3 extends AbstractCollection implements Serializable {

    /* renamed from: a */
    private static final Object[] f15779a = new Object[0];

    pa3() {
    }

    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo9535b(Object[] objArr, int i) {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public int mo9536c() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo9537f() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public ua3 mo10475i() {
        throw null;
    }

    /* renamed from: j */
    public abstract uc3 iterator();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract boolean mo9539k();

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Object[] mo9540l() {
        return null;
    }

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return toArray(f15779a);
    }

    public final Object[] toArray(Object[] objArr) {
        Objects.requireNonNull(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] l = mo9540l();
            if (l != null) {
                return Arrays.copyOfRange(l, mo9537f(), mo9536c(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo9535b(objArr, 0);
        return objArr;
    }
}
