package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.a9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C6876a9 extends C7137q7 implements RandomAccess, C7204ua {

    /* renamed from: d */
    private static final C6876a9 f31557d;

    /* renamed from: b */
    private float[] f31558b;

    /* renamed from: c */
    private int f31559c;

    static {
        C6876a9 a9Var = new C6876a9(new float[0], 0);
        f31557d = a9Var;
        a9Var.mo23697d();
    }

    C6876a9() {
        this(new float[10], 0);
    }

    /* renamed from: f */
    private final String m39471f(int i) {
        int i2 = this.f31559c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m39472i(int i) {
        if (i < 0 || i >= this.f31559c) {
            throw new IndexOutOfBoundsException(m39471f(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo23768b();
        if (i < 0 || i > (i2 = this.f31559c)) {
            throw new IndexOutOfBoundsException(m39471f(i));
        }
        float[] fArr = this.f31558b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f31558b, i, fArr2, i + 1, this.f31559c - i);
            this.f31558b = fArr2;
        }
        this.f31558b[i] = floatValue;
        this.f31559c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo23768b();
        C7107o9.m40532e(collection);
        if (!(collection instanceof C6876a9)) {
            return super.addAll(collection);
        }
        C6876a9 a9Var = (C6876a9) collection;
        int i = a9Var.f31559c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f31559c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f31558b;
            if (i3 > fArr.length) {
                this.f31558b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(a9Var.f31558b, 0, this.f31558b, this.f31559c, a9Var.f31559c);
            this.f31559c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo23008c(float f) {
        mo23768b();
        int i = this.f31559c;
        float[] fArr = this.f31558b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f31558b = fArr2;
        }
        float[] fArr3 = this.f31558b;
        int i2 = this.f31559c;
        this.f31559c = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6876a9)) {
            return super.equals(obj);
        }
        C6876a9 a9Var = (C6876a9) obj;
        if (this.f31559c != a9Var.f31559c) {
            return false;
        }
        float[] fArr = a9Var.f31558b;
        for (int i = 0; i < this.f31559c; i++) {
            if (Float.floatToIntBits(this.f31558b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m39472i(i);
        return Float.valueOf(this.f31558b[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C7091n9 mo23012h(int i) {
        if (i >= this.f31559c) {
            return new C6876a9(Arrays.copyOf(this.f31558b, i), this.f31559c);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f31559c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f31558b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f31559c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f31558b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo23768b();
        m39472i(i);
        float[] fArr = this.f31558b;
        float f = fArr[i];
        int i2 = this.f31559c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f31559c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo23768b();
        if (i2 >= i) {
            float[] fArr = this.f31558b;
            System.arraycopy(fArr, i2, fArr, i, this.f31559c - i2);
            this.f31559c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo23768b();
        m39472i(i);
        float[] fArr = this.f31558b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f31559c;
    }

    private C6876a9(float[] fArr, int i) {
        this.f31558b = fArr;
        this.f31559c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo23008c(((Float) obj).floatValue());
        return true;
    }
}
