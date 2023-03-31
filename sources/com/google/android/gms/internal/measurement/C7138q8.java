package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.q8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7138q8 extends C7137q7 implements RandomAccess, C7204ua {

    /* renamed from: d */
    private static final C7138q8 f31974d;

    /* renamed from: b */
    private double[] f31975b;

    /* renamed from: c */
    private int f31976c;

    static {
        C7138q8 q8Var = new C7138q8(new double[0], 0);
        f31974d = q8Var;
        q8Var.mo23697d();
    }

    C7138q8() {
        this(new double[10], 0);
    }

    /* renamed from: f */
    private final String m40658f(int i) {
        int i2 = this.f31976c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m40659i(int i) {
        if (i < 0 || i >= this.f31976c) {
            throw new IndexOutOfBoundsException(m40658f(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        mo23768b();
        if (i < 0 || i > (i2 = this.f31976c)) {
            throw new IndexOutOfBoundsException(m40658f(i));
        }
        double[] dArr = this.f31975b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f31975b, i, dArr2, i + 1, this.f31976c - i);
            this.f31975b = dArr2;
        }
        this.f31975b[i] = doubleValue;
        this.f31976c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo23768b();
        C7107o9.m40532e(collection);
        if (!(collection instanceof C7138q8)) {
            return super.addAll(collection);
        }
        C7138q8 q8Var = (C7138q8) collection;
        int i = q8Var.f31976c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f31976c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f31975b;
            if (i3 > dArr.length) {
                this.f31975b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(q8Var.f31975b, 0, this.f31975b, this.f31976c, q8Var.f31976c);
            this.f31976c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo23774c(double d) {
        mo23768b();
        int i = this.f31976c;
        double[] dArr = this.f31975b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f31975b = dArr2;
        }
        double[] dArr3 = this.f31975b;
        int i2 = this.f31976c;
        this.f31976c = i2 + 1;
        dArr3[i2] = d;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7138q8)) {
            return super.equals(obj);
        }
        C7138q8 q8Var = (C7138q8) obj;
        if (this.f31976c != q8Var.f31976c) {
            return false;
        }
        double[] dArr = q8Var.f31975b;
        for (int i = 0; i < this.f31976c; i++) {
            if (Double.doubleToLongBits(this.f31975b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m40659i(i);
        return Double.valueOf(this.f31975b[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C7091n9 mo23012h(int i) {
        if (i >= this.f31976c) {
            return new C7138q8(Arrays.copyOf(this.f31975b, i), this.f31976c);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f31976c; i2++) {
            i = (i * 31) + C7107o9.m40530c(Double.doubleToLongBits(this.f31975b[i2]));
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.f31976c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f31975b[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo23768b();
        m40659i(i);
        double[] dArr = this.f31975b;
        double d = dArr[i];
        int i2 = this.f31976c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f31976c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo23768b();
        if (i2 >= i) {
            double[] dArr = this.f31975b;
            System.arraycopy(dArr, i2, dArr, i, this.f31976c - i2);
            this.f31976c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        mo23768b();
        m40659i(i);
        double[] dArr = this.f31975b;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    public final int size() {
        return this.f31976c;
    }

    private C7138q8(double[] dArr, int i) {
        this.f31975b = dArr;
        this.f31976c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo23774c(((Double) obj).doubleValue());
        return true;
    }
}
