package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.d2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3227d2 extends C3654q0 implements RandomAccess, C3822v3 {

    /* renamed from: d */
    private static final C3227d2 f21929d;

    /* renamed from: b */
    private float[] f21930b;

    /* renamed from: c */
    private int f21931c;

    static {
        C3227d2 d2Var = new C3227d2(new float[0], 0);
        f21929d = d2Var;
        d2Var.mo16475d();
    }

    C3227d2() {
        this(new float[10], 0);
    }

    /* renamed from: f */
    private final String m25389f(int i) {
        int i2 = this.f21931c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m25390i(int i) {
        if (i < 0 || i >= this.f21931c) {
            throw new IndexOutOfBoundsException(m25389f(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float floatValue = ((Float) obj).floatValue();
        mo16587b();
        if (i < 0 || i > (i2 = this.f21931c)) {
            throw new IndexOutOfBoundsException(m25389f(i));
        }
        float[] fArr = this.f21930b;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[(((i2 * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f21930b, i, fArr2, i + 1, this.f21931c - i);
            this.f21930b = fArr2;
        }
        this.f21930b[i] = floatValue;
        this.f21931c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo16587b();
        C3623p2.m26441e(collection);
        if (!(collection instanceof C3227d2)) {
            return super.addAll(collection);
        }
        C3227d2 d2Var = (C3227d2) collection;
        int i = d2Var.f21931c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f21931c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            float[] fArr = this.f21930b;
            if (i3 > fArr.length) {
                this.f21930b = Arrays.copyOf(fArr, i3);
            }
            System.arraycopy(d2Var.f21930b, 0, this.f21930b, this.f21931c, d2Var.f21931c);
            this.f21931c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo15941c(float f) {
        mo16587b();
        int i = this.f21931c;
        float[] fArr = this.f21930b;
        if (i == fArr.length) {
            float[] fArr2 = new float[(((i * 3) / 2) + 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f21930b = fArr2;
        }
        float[] fArr3 = this.f21930b;
        int i2 = this.f21931c;
        this.f21931c = i2 + 1;
        fArr3[i2] = f;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3227d2)) {
            return super.equals(obj);
        }
        C3227d2 d2Var = (C3227d2) obj;
        if (this.f21931c != d2Var.f21931c) {
            return false;
        }
        float[] fArr = d2Var.f21930b;
        for (int i = 0; i < this.f21931c; i++) {
            if (Float.floatToIntBits(this.f21930b[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m25390i(i);
        return Float.valueOf(this.f21930b[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C3590o2 mo15892h(int i) {
        if (i >= this.f21931c) {
            return new C3227d2(Arrays.copyOf(this.f21930b, i), this.f21931c);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f21931c; i2++) {
            i = (i * 31) + Float.floatToIntBits(this.f21930b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int i = this.f21931c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f21930b[i2] == floatValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo16587b();
        m25390i(i);
        float[] fArr = this.f21930b;
        float f = fArr[i];
        int i2 = this.f21931c;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f21931c--;
        this.modCount++;
        return Float.valueOf(f);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo16587b();
        if (i2 >= i) {
            float[] fArr = this.f21930b;
            System.arraycopy(fArr, i2, fArr, i, this.f21931c - i2);
            this.f21931c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        mo16587b();
        m25390i(i);
        float[] fArr = this.f21930b;
        float f = fArr[i];
        fArr[i] = floatValue;
        return Float.valueOf(f);
    }

    public final int size() {
        return this.f21931c;
    }

    private C3227d2(float[] fArr, int i) {
        this.f21930b = fArr;
        this.f21931c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo15941c(((Float) obj).floatValue());
        return true;
    }
}
