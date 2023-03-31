package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class lx3 extends tv3 implements RandomAccess, jz3 {

    /* renamed from: d */
    private static final lx3 f13106d;

    /* renamed from: b */
    private float[] f13107b;

    /* renamed from: c */
    private int f13108c;

    static {
        lx3 lx3 = new lx3(new float[0], 0);
        f13106d = lx3;
        lx3.mo8987d();
    }

    lx3() {
        this(new float[10], 0);
    }

    /* renamed from: f */
    private final String m16309f(int i) {
        int i2 = this.f13108c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m16310i(int i) {
        if (i < 0 || i >= this.f13108c) {
            throw new IndexOutOfBoundsException(m16309f(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo14403b();
        if (i < 0 || i > (i2 = this.f13108c)) {
            throw new IndexOutOfBoundsException(m16309f(i));
        }
        float[] fArr = this.f13107b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f13107b, i, fArr2, i + 1, this.f13108c - i);
            this.f13107b = fArr2;
        }
        this.f13107b[i] = floatValue;
        this.f13108c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo14403b();
        cy3.m11233e(collection);
        if (!(collection instanceof lx3)) {
            return super.addAll(collection);
        }
        lx3 lx3 = (lx3) collection;
        int i = lx3.f13108c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f13108c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f13107b;
            if (i3 > fArr.length) {
                this.f13107b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(lx3.f13107b, 0, this.f13107b, this.f13108c, lx3.f13108c);
            this.f13108c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo12216c(float f) {
        mo14403b();
        int i = this.f13108c;
        float[] fArr = this.f13107b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f13107b = fArr2;
        }
        float[] fArr3 = this.f13107b;
        int i2 = this.f13108c;
        this.f13108c = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lx3)) {
            return super.equals(obj);
        }
        lx3 lx3 = (lx3) obj;
        if (this.f13108c != lx3.f13108c) {
            return false;
        }
        float[] fArr = lx3.f13107b;
        for (int i = 0; i < this.f13108c; i++) {
            if (Float.floatToIntBits(this.f13107b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m16310i(i);
        return Float.valueOf(this.f13107b[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ by3 mo8975h(int i) {
        if (i >= this.f13108c) {
            return new lx3(Arrays.copyOf(this.f13107b, i), this.f13108c);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f13108c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f13107b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f13108c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f13107b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo14403b();
        m16310i(i);
        float[] fArr = this.f13107b;
        float f = fArr[i];
        int i2 = this.f13108c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f13108c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo14403b();
        if (i2 >= i) {
            float[] fArr = this.f13107b;
            System.arraycopy(fArr, i2, fArr, i, this.f13108c - i2);
            this.f13108c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo14403b();
        m16310i(i);
        float[] fArr = this.f13107b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f13108c;
    }

    private lx3(float[] fArr, int i) {
        this.f13107b = fArr;
        this.f13108c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo12216c(((Float) obj).floatValue());
        return true;
    }
}
