package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.u7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7201u7 extends C7137q7 implements RandomAccess, C7204ua {

    /* renamed from: d */
    private static final C7201u7 f32131d;

    /* renamed from: b */
    private boolean[] f32132b;

    /* renamed from: c */
    private int f32133c;

    static {
        C7201u7 u7Var = new C7201u7(new boolean[0], 0);
        f32131d = u7Var;
        u7Var.mo23697d();
    }

    C7201u7() {
        this(new boolean[10], 0);
    }

    /* renamed from: f */
    private final String m40981f(int i) {
        int i2 = this.f32133c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m40982i(int i) {
        if (i < 0 || i >= this.f32133c) {
            throw new IndexOutOfBoundsException(m40981f(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo23768b();
        if (i < 0 || i > (i2 = this.f32133c)) {
            throw new IndexOutOfBoundsException(m40981f(i));
        }
        boolean[] zArr = this.f32132b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f32132b, i, zArr2, i + 1, this.f32133c - i);
            this.f32132b = zArr2;
        }
        this.f32132b[i] = booleanValue;
        this.f32133c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo23768b();
        C7107o9.m40532e(collection);
        if (!(collection instanceof C7201u7)) {
            return super.addAll(collection);
        }
        C7201u7 u7Var = (C7201u7) collection;
        int i = u7Var.f32133c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f32133c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f32132b;
            if (i3 > zArr.length) {
                this.f32132b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(u7Var.f32132b, 0, this.f32132b, this.f32133c, u7Var.f32133c);
            this.f32133c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo23921c(boolean z) {
        mo23768b();
        int i = this.f32133c;
        boolean[] zArr = this.f32132b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f32132b = zArr2;
        }
        boolean[] zArr3 = this.f32132b;
        int i2 = this.f32133c;
        this.f32133c = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7201u7)) {
            return super.equals(obj);
        }
        C7201u7 u7Var = (C7201u7) obj;
        if (this.f32133c != u7Var.f32133c) {
            return false;
        }
        boolean[] zArr = u7Var.f32132b;
        for (int i = 0; i < this.f32133c; i++) {
            if (this.f32132b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m40982i(i);
        return Boolean.valueOf(this.f32132b[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C7091n9 mo23012h(int i) {
        if (i >= this.f32133c) {
            return new C7201u7(Arrays.copyOf(this.f32132b, i), this.f32133c);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f32133c; i2++) {
            i = (i * 31) + C7107o9.m40528a(this.f32132b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f32133c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f32132b[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo23768b();
        m40982i(i);
        boolean[] zArr = this.f32132b;
        boolean z = zArr[i];
        int i2 = this.f32133c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f32133c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo23768b();
        if (i2 >= i) {
            boolean[] zArr = this.f32132b;
            System.arraycopy(zArr, i2, zArr, i, this.f32133c - i2);
            this.f32133c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo23768b();
        m40982i(i);
        boolean[] zArr = this.f32132b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f32133c;
    }

    private C7201u7(boolean[] zArr, int i) {
        this.f32132b = zArr;
        this.f32133c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo23921c(((Boolean) obj).booleanValue());
        return true;
    }
}
