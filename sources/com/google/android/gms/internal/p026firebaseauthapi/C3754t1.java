package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.t1 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3754t1 extends C3654q0 implements RandomAccess, C3822v3 {

    /* renamed from: d */
    private static final C3754t1 f22719d;

    /* renamed from: b */
    private double[] f22720b;

    /* renamed from: c */
    private int f22721c;

    static {
        C3754t1 t1Var = new C3754t1(new double[0], 0);
        f22719d = t1Var;
        t1Var.mo16475d();
    }

    C3754t1() {
        this(new double[10], 0);
    }

    /* renamed from: f */
    private final String m26971f(int i) {
        int i2 = this.f22721c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m26972i(int i) {
        if (i < 0 || i >= this.f22721c) {
            throw new IndexOutOfBoundsException(m26971f(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo16587b();
        if (i < 0 || i > (i2 = this.f22721c)) {
            throw new IndexOutOfBoundsException(m26971f(i));
        }
        double[] dArr = this.f22720b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f22720b, i, dArr2, i + 1, this.f22721c - i);
            this.f22720b = dArr2;
        }
        this.f22720b[i] = doubleValue;
        this.f22721c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo16587b();
        C3623p2.m26441e(collection);
        if (!(collection instanceof C3754t1)) {
            return super.addAll(collection);
        }
        C3754t1 t1Var = (C3754t1) collection;
        int i = t1Var.f22721c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22721c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f22720b;
            if (i3 > dArr.length) {
                this.f22720b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(t1Var.f22720b, 0, this.f22720b, this.f22721c, t1Var.f22721c);
            this.f22721c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo16784c(double d) {
        mo16587b();
        int i = this.f22721c;
        double[] dArr = this.f22720b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f22720b = dArr2;
        }
        double[] dArr3 = this.f22720b;
        int i2 = this.f22721c;
        this.f22721c = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3754t1)) {
            return super.equals(obj);
        }
        C3754t1 t1Var = (C3754t1) obj;
        if (this.f22721c != t1Var.f22721c) {
            return false;
        }
        double[] dArr = t1Var.f22720b;
        for (int i = 0; i < this.f22721c; i++) {
            if (Double.doubleToLongBits(this.f22720b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m26972i(i);
        return Double.valueOf(this.f22720b[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C3590o2 mo15892h(int i) {
        if (i >= this.f22721c) {
            return new C3754t1(Arrays.copyOf(this.f22720b, i), this.f22721c);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f22721c; i2++) {
            i = (i * 31) + C3623p2.m26439c(Double.doubleToLongBits(this.f22720b[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f22721c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f22720b[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo16587b();
        m26972i(i);
        double[] dArr = this.f22720b;
        double d = dArr[i];
        int i2 = this.f22721c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f22721c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo16587b();
        if (i2 >= i) {
            double[] dArr = this.f22720b;
            System.arraycopy(dArr, i2, dArr, i, this.f22721c - i2);
            this.f22721c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo16587b();
        m26972i(i);
        double[] dArr = this.f22720b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f22721c;
    }

    private C3754t1(double[] dArr, int i) {
        this.f22720b = dArr;
        this.f22721c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo16784c(((Double) obj).doubleValue());
        return true;
    }
}
