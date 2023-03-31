package com.google.protobuf;

import com.google.protobuf.C8119d0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.n */
/* compiled from: DoubleArrayList */
final class C8198n extends C8113c<Double> implements C8119d0.C8121b, RandomAccess, C8146g1 {

    /* renamed from: d */
    private static final C8198n f35025d;

    /* renamed from: b */
    private double[] f35026b;

    /* renamed from: c */
    private int f35027c;

    static {
        C8198n nVar = new C8198n(new double[0], 0);
        f35025d = nVar;
        nVar.mo26803H();
    }

    C8198n() {
        this(new double[10], 0);
    }

    /* renamed from: j */
    private void m45437j(int i, double d) {
        int i2;
        mo26807b();
        if (i < 0 || i > (i2 = this.f35027c)) {
            throw new IndexOutOfBoundsException(m45439q(i));
        }
        double[] dArr = this.f35026b;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[(((i2 * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f35026b, i, dArr2, i + 1, this.f35027c - i);
            this.f35026b = dArr2;
        }
        this.f35026b[i] = d;
        this.f35027c++;
        this.modCount++;
    }

    /* renamed from: k */
    private void m45438k(int i) {
        if (i < 0 || i >= this.f35027c) {
            throw new IndexOutOfBoundsException(m45439q(i));
        }
    }

    /* renamed from: q */
    private String m45439q(int i) {
        return "Index:" + i + ", Size:" + this.f35027c;
    }

    public boolean addAll(Collection<? extends Double> collection) {
        mo26807b();
        C8119d0.m44649a(collection);
        if (!(collection instanceof C8198n)) {
            return super.addAll(collection);
        }
        C8198n nVar = (C8198n) collection;
        int i = nVar.f35027c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f35027c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.f35026b;
            if (i3 > dArr.length) {
                this.f35026b = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(nVar.f35026b, 0, this.f35026b, this.f35027c, nVar.f35027c);
            this.f35027c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void add(int i, Double d) {
        m45437j(i, d.doubleValue());
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8198n)) {
            return super.equals(obj);
        }
        C8198n nVar = (C8198n) obj;
        if (this.f35027c != nVar.f35027c) {
            return false;
        }
        double[] dArr = nVar.f35026b;
        for (int i = 0; i < this.f35027c; i++) {
            if (Double.doubleToLongBits(this.f35026b[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Double d) {
        mo27183i(d.doubleValue());
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f35027c; i2++) {
            i = (i * 31) + C8119d0.m44654f(Double.doubleToLongBits(this.f35026b[i2]));
        }
        return i;
    }

    /* renamed from: i */
    public void mo27183i(double d) {
        mo26807b();
        int i = this.f35027c;
        double[] dArr = this.f35026b;
        if (i == dArr.length) {
            double[] dArr2 = new double[(((i * 3) / 2) + 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f35026b = dArr2;
        }
        double[] dArr3 = this.f35026b;
        int i2 = this.f35027c;
        this.f35027c = i2 + 1;
        dArr3[i2] = d;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f35026b[i] == doubleValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public Double get(int i) {
        return Double.valueOf(mo27186o(i));
    }

    /* renamed from: o */
    public double mo27186o(int i) {
        m45438k(i);
        return this.f35026b[i];
    }

    /* renamed from: r */
    public C8119d0.C8121b mo26823m(int i) {
        if (i >= this.f35027c) {
            return new C8198n(Arrays.copyOf(this.f35026b, i), this.f35027c);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo26807b();
        if (i2 >= i) {
            double[] dArr = this.f35026b;
            System.arraycopy(dArr, i2, dArr, i, this.f35027c - i2);
            this.f35027c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Double remove(int i) {
        mo26807b();
        m45438k(i);
        double[] dArr = this.f35026b;
        double d = dArr[i];
        int i2 = this.f35027c;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f35027c--;
        this.modCount++;
        return Double.valueOf(d);
    }

    public int size() {
        return this.f35027c;
    }

    /* renamed from: t */
    public Double set(int i, Double d) {
        return Double.valueOf(mo27193u(i, d.doubleValue()));
    }

    /* renamed from: u */
    public double mo27193u(int i, double d) {
        mo26807b();
        m45438k(i);
        double[] dArr = this.f35026b;
        double d2 = dArr[i];
        dArr[i] = d;
        return d2;
    }

    private C8198n(double[] dArr, int i) {
        this.f35026b = dArr;
        this.f35027c = i;
    }
}
