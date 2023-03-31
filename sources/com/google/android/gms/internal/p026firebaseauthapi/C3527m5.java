package com.google.android.gms.internal.p026firebaseauthapi;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.m5 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public abstract class C3527m5 extends AbstractCollection implements Serializable {

    /* renamed from: a */
    private static final Object[] f22349a = new Object[0];

    C3527m5() {
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
    public abstract int mo16367b(Object[] objArr, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract int mo16368c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract int mo16370f();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract Object[] mo16371i();

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
        return toArray(f22349a);
    }

    public final Object[] toArray(Object[] objArr) {
        Objects.requireNonNull(objArr);
        int size = size();
        int length = objArr.length;
        if (length < size) {
            Object[] i = mo16371i();
            if (i != null) {
                return Arrays.copyOfRange(i, mo16370f(), mo16368c(), objArr.getClass());
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (length > size) {
            objArr[size] = null;
        }
        mo16367b(objArr, 0);
        return objArr;
    }
}
