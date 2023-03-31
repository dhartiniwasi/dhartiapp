package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class lz3 extends tv3 implements RandomAccess {

    /* renamed from: d */
    private static final lz3 f13127d;

    /* renamed from: b */
    private Object[] f13128b;

    /* renamed from: c */
    private int f13129c;

    static {
        lz3 lz3 = new lz3(new Object[0], 0);
        f13127d = lz3;
        lz3.mo8987d();
    }

    private lz3(Object[] objArr, int i) {
        this.f13128b = objArr;
        this.f13129c = i;
    }

    /* renamed from: c */
    public static lz3 m16326c() {
        return f13127d;
    }

    /* renamed from: f */
    private final String m16327f(int i) {
        int i2 = this.f13129c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m16328i(int i) {
        if (i < 0 || i >= this.f13129c) {
            throw new IndexOutOfBoundsException(m16327f(i));
        }
    }

    public final void add(int i, Object obj) {
        int i2;
        mo14403b();
        if (i < 0 || i > (i2 = this.f13129c)) {
            throw new IndexOutOfBoundsException(m16327f(i));
        }
        Object[] objArr = this.f13128b;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[(((i2 * 3) / 2) + 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f13128b, i, objArr2, i + 1, this.f13129c - i);
            this.f13128b = objArr2;
        }
        this.f13128b[i] = obj;
        this.f13129c++;
        this.modCount++;
    }

    public final Object get(int i) {
        m16328i(i);
        return this.f13128b[i];
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ by3 mo8975h(int i) {
        if (i >= this.f13129c) {
            return new lz3(Arrays.copyOf(this.f13128b, i), this.f13129c);
        }
        throw new IllegalArgumentException();
    }

    public final Object remove(int i) {
        mo14403b();
        m16328i(i);
        Object[] objArr = this.f13128b;
        Object obj = objArr[i];
        int i2 = this.f13129c;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f13129c--;
        this.modCount++;
        return obj;
    }

    public final Object set(int i, Object obj) {
        mo14403b();
        m16328i(i);
        Object[] objArr = this.f13128b;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f13129c;
    }

    public final boolean add(Object obj) {
        mo14403b();
        int i = this.f13129c;
        Object[] objArr = this.f13128b;
        if (i == objArr.length) {
            this.f13128b = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f13128b;
        int i2 = this.f13129c;
        this.f13129c = i2 + 1;
        objArr2[i2] = obj;
        this.modCount++;
        return true;
    }
}
