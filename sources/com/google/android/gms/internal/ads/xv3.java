package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class xv3 extends tv3 implements RandomAccess, jz3 {

    /* renamed from: d */
    private static final xv3 f20370d;

    /* renamed from: b */
    private boolean[] f20371b;

    /* renamed from: c */
    private int f20372c;

    static {
        xv3 xv3 = new xv3(new boolean[0], 0);
        f20370d = xv3;
        xv3.mo8987d();
    }

    xv3() {
        this(new boolean[10], 0);
    }

    /* renamed from: f */
    private final String m23558f(int i) {
        int i2 = this.f20372c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m23559i(int i) {
        if (i < 0 || i >= this.f20372c) {
            throw new IndexOutOfBoundsException(m23558f(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo14403b();
        if (i < 0 || i > (i2 = this.f20372c)) {
            throw new IndexOutOfBoundsException(m23558f(i));
        }
        boolean[] zArr = this.f20371b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f20371b, i, zArr2, i + 1, this.f20372c - i);
            this.f20371b = zArr2;
        }
        this.f20371b[i] = booleanValue;
        this.f20372c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo14403b();
        cy3.m11233e(collection);
        if (!(collection instanceof xv3)) {
            return super.addAll(collection);
        }
        xv3 xv3 = (xv3) collection;
        int i = xv3.f20372c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f20372c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f20371b;
            if (i3 > zArr.length) {
                this.f20371b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(xv3.f20371b, 0, this.f20371b, this.f20372c, xv3.f20372c);
            this.f20372c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo15248c(boolean z) {
        mo14403b();
        int i = this.f20372c;
        boolean[] zArr = this.f20371b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f20371b = zArr2;
        }
        boolean[] zArr3 = this.f20371b;
        int i2 = this.f20372c;
        this.f20372c = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xv3)) {
            return super.equals(obj);
        }
        xv3 xv3 = (xv3) obj;
        if (this.f20372c != xv3.f20372c) {
            return false;
        }
        boolean[] zArr = xv3.f20371b;
        for (int i = 0; i < this.f20372c; i++) {
            if (this.f20371b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m23559i(i);
        return Boolean.valueOf(this.f20371b[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ by3 mo8975h(int i) {
        if (i >= this.f20372c) {
            return new xv3(Arrays.copyOf(this.f20371b, i), this.f20372c);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f20372c; i2++) {
            i = (i * 31) + cy3.m11229a(this.f20371b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f20372c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f20371b[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo14403b();
        m23559i(i);
        boolean[] zArr = this.f20371b;
        boolean z = zArr[i];
        int i2 = this.f20372c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f20372c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo14403b();
        if (i2 >= i) {
            boolean[] zArr = this.f20371b;
            System.arraycopy(zArr, i2, zArr, i, this.f20372c - i2);
            this.f20372c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo14403b();
        m23559i(i);
        boolean[] zArr = this.f20371b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f20372c;
    }

    private xv3(boolean[] zArr, int i) {
        this.f20371b = zArr;
        this.f20372c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo15248c(((Boolean) obj).booleanValue());
        return true;
    }
}
