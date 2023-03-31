package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class bx3 extends tv3 implements RandomAccess, jz3 {

    /* renamed from: d */
    private static final bx3 f7517d;

    /* renamed from: b */
    private double[] f7518b;

    /* renamed from: c */
    private int f7519c;

    static {
        bx3 bx3 = new bx3(new double[0], 0);
        f7517d = bx3;
        bx3.mo8987d();
    }

    bx3() {
        this(new double[10], 0);
    }

    /* renamed from: f */
    private final String m10629f(int i) {
        int i2 = this.f7519c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m10630i(int i) {
        if (i < 0 || i >= this.f7519c) {
            throw new IndexOutOfBoundsException(m10629f(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo14403b();
        if (i < 0 || i > (i2 = this.f7519c)) {
            throw new IndexOutOfBoundsException(m10629f(i));
        }
        double[] dArr = this.f7518b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f7518b, i, dArr2, i + 1, this.f7519c - i);
            this.f7518b = dArr2;
        }
        this.f7518b[i] = doubleValue;
        this.f7519c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo14403b();
        cy3.m11233e(collection);
        if (!(collection instanceof bx3)) {
            return super.addAll(collection);
        }
        bx3 bx3 = (bx3) collection;
        int i = bx3.f7519c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f7519c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f7518b;
            if (i3 > dArr.length) {
                this.f7518b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(bx3.f7518b, 0, this.f7518b, this.f7519c, bx3.f7519c);
            this.f7519c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo8971c(double d) {
        mo14403b();
        int i = this.f7519c;
        double[] dArr = this.f7518b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f7518b = dArr2;
        }
        double[] dArr3 = this.f7518b;
        int i2 = this.f7519c;
        this.f7519c = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx3)) {
            return super.equals(obj);
        }
        bx3 bx3 = (bx3) obj;
        if (this.f7519c != bx3.f7519c) {
            return false;
        }
        double[] dArr = bx3.f7518b;
        for (int i = 0; i < this.f7519c; i++) {
            if (Double.doubleToLongBits(this.f7518b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m10630i(i);
        return Double.valueOf(this.f7518b[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ by3 mo8975h(int i) {
        if (i >= this.f7519c) {
            return new bx3(Arrays.copyOf(this.f7518b, i), this.f7519c);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f7519c; i2++) {
            i = (i * 31) + cy3.m11231c(Double.doubleToLongBits(this.f7518b[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f7519c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f7518b[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo14403b();
        m10630i(i);
        double[] dArr = this.f7518b;
        double d = dArr[i];
        int i2 = this.f7519c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f7519c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo14403b();
        if (i2 >= i) {
            double[] dArr = this.f7518b;
            System.arraycopy(dArr, i2, dArr, i, this.f7519c - i2);
            this.f7519c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo14403b();
        m10630i(i);
        double[] dArr = this.f7518b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f7519c;
    }

    private bx3(double[] dArr, int i) {
        this.f7518b = dArr;
        this.f7519c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo8971c(((Double) obj).doubleValue());
        return true;
    }
}
