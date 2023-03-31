package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public abstract class ua3 extends pa3 implements List, RandomAccess {

    /* renamed from: b */
    private static final vc3 f18476b = new sa3(dc3.f8184e, 0);

    ua3() {
    }

    /* renamed from: A */
    public static ua3 m21500A(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        bc3.m10303b(objArr, 5);
        return m21504s(objArr, 5);
    }

    /* renamed from: B */
    public static ua3 m21501B(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        bc3.m10303b(objArr, 6);
        return m21504s(objArr, 6);
    }

    /* renamed from: q */
    public static ra3 m21502q() {
        return new ra3(4);
    }

    /* renamed from: r */
    static ua3 m21503r(Object[] objArr) {
        return m21504s(objArr, objArr.length);
    }

    /* renamed from: s */
    static ua3 m21504s(Object[] objArr, int i) {
        if (i == 0) {
            return dc3.f8184e;
        }
        return new dc3(objArr, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.ua3 m21505t(java.lang.Iterable r0) {
        /*
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.ads.ua3 r0 = m21506u(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ua3.m21505t(java.lang.Iterable):com.google.android.gms.internal.ads.ua3");
    }

    /* renamed from: u */
    public static ua3 m21506u(Collection collection) {
        if (collection instanceof pa3) {
            ua3 i = ((pa3) collection).mo10475i();
            if (!i.mo9539k()) {
                return i;
            }
            Object[] array = i.toArray();
            return m21504s(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        bc3.m10303b(array2, length);
        return m21504s(array2, length);
    }

    /* renamed from: v */
    public static ua3 m21507v(Object[] objArr) {
        if (objArr.length == 0) {
            return dc3.f8184e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        bc3.m10303b(objArr2, length);
        return m21504s(objArr2, length);
    }

    /* renamed from: w */
    public static ua3 m21508w() {
        return dc3.f8184e;
    }

    /* renamed from: x */
    public static ua3 m21509x(Object obj) {
        Object[] objArr = {obj};
        bc3.m10303b(objArr, 1);
        return m21504s(objArr, 1);
    }

    /* renamed from: y */
    public static ua3 m21510y(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        bc3.m10303b(objArr, 2);
        return m21504s(objArr, 2);
    }

    /* renamed from: z */
    public static ua3 m21511z(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {"2011", "1009", "3010"};
        bc3.m10303b(objArr, 3);
        return m21504s(objArr, 3);
    }

    /* renamed from: C */
    public final vc3 listIterator(int i) {
        b83.m10238b(i, size(), "index");
        if (isEmpty()) {
            return f18476b;
        }
        return new sa3(this, i);
    }

    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo9535b(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i = 0;
                    while (i < size) {
                        if (w73.m22614a(get(i), list.get(i))) {
                            i++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!w73.m22614a(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Deprecated
    /* renamed from: i */
    public final ua3 mo10475i() {
        return this;
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    /* renamed from: j */
    public final uc3 mo10124j() {
        return listIterator(0);
    }

    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    /* renamed from: o */
    public ua3 subList(int i, int i2) {
        b83.m10243g(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return dc3.f8184e;
        }
        return new ta3(this, i, i3);
    }

    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }
}
