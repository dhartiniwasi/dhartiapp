package com.google.protobuf;

import com.google.protobuf.C8119d0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.x */
/* compiled from: FloatArrayList */
final class C8251x extends C8113c<Float> implements C8119d0.C8125f, RandomAccess, C8146g1 {

    /* renamed from: d */
    private static final C8251x f35164d;

    /* renamed from: b */
    private float[] f35165b;

    /* renamed from: c */
    private int f35166c;

    static {
        C8251x xVar = new C8251x(new float[0], 0);
        f35164d = xVar;
        xVar.mo26803H();
    }

    C8251x() {
        this(new float[10], 0);
    }

    /* renamed from: j */
    private void m45735j(int i, float f) {
        int i2;
        mo26807b();
        if (i < 0 || i > (i2 = this.f35166c)) {
            throw new IndexOutOfBoundsException(m45737q(i));
        }
        float[] fArr = this.f35165b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f35165b, i, fArr2, i + 1, this.f35166c - i);
            this.f35165b = fArr2;
        }
        this.f35165b[i] = f;
        this.f35166c++;
        this.modCount++;
    }

    /* renamed from: k */
    private void m45736k(int i) {
        if (i < 0 || i >= this.f35166c) {
            throw new IndexOutOfBoundsException(m45737q(i));
        }
    }

    /* renamed from: q */
    private String m45737q(int i) {
        return "Index:" + i + ", Size:" + this.f35166c;
    }

    public boolean addAll(Collection<? extends Float> collection) {
        mo26807b();
        C8119d0.m44649a(collection);
        if (!(collection instanceof C8251x)) {
            return super.addAll(collection);
        }
        C8251x xVar = (C8251x) collection;
        int i = xVar.f35166c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f35166c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f35165b;
            if (i3 > fArr.length) {
                this.f35165b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(xVar.f35165b, 0, this.f35165b, this.f35166c, xVar.f35166c);
            this.f35166c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void add(int i, Float f) {
        m45735j(i, f.floatValue());
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8251x)) {
            return super.equals(obj);
        }
        C8251x xVar = (C8251x) obj;
        if (this.f35166c != xVar.f35166c) {
            return false;
        }
        float[] fArr = xVar.f35165b;
        for (int i = 0; i < this.f35166c; i++) {
            if (Float.floatToIntBits(this.f35165b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Float f) {
        mo27364i(f.floatValue());
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f35166c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f35165b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public void mo27364i(float f) {
        mo26807b();
        int i = this.f35166c;
        float[] fArr = this.f35165b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f35165b = fArr2;
        }
        float[] fArr3 = this.f35165b;
        int i2 = this.f35166c;
        this.f35166c = i2 + 1;
        fArr3[i2] = f;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f35165b[i] == floatValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public Float get(int i) {
        return Float.valueOf(mo27367o(i));
    }

    /* renamed from: o */
    public float mo27367o(int i) {
        m45736k(i);
        return this.f35165b[i];
    }

    /* renamed from: r */
    public C8119d0.C8125f mo26823m(int i) {
        if (i >= this.f35166c) {
            return new C8251x(Arrays.copyOf(this.f35165b, i), this.f35166c);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo26807b();
        if (i2 >= i) {
            float[] fArr = this.f35165b;
            System.arraycopy(fArr, i2, fArr, i, this.f35166c - i2);
            this.f35166c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Float remove(int i) {
        mo26807b();
        m45736k(i);
        float[] fArr = this.f35165b;
        float f = fArr[i];
        int i2 = this.f35166c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f35166c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    public int size() {
        return this.f35166c;
    }

    /* renamed from: t */
    public Float set(int i, Float f) {
        return Float.valueOf(mo27374u(i, f.floatValue()));
    }

    /* renamed from: u */
    public float mo27374u(int i, float f) {
        mo26807b();
        m45736k(i);
        float[] fArr = this.f35165b;
        float f2 = fArr[i];
        fArr[i] = f;
        return f2;
    }

    private C8251x(float[] fArr, int i) {
        this.f35165b = fArr;
        this.f35166c = i;
    }
}
