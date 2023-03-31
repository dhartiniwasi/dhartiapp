package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.k2 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3458k2 extends C3654q0 implements RandomAccess, C3822v3 {

    /* renamed from: d */
    private static final C3458k2 f22267d;

    /* renamed from: b */
    private int[] f22268b;

    /* renamed from: c */
    private int f22269c;

    static {
        C3458k2 k2Var = new C3458k2(new int[0], 0);
        f22267d = k2Var;
        k2Var.mo16475d();
    }

    C3458k2() {
        this(new int[10], 0);
    }

    /* renamed from: i */
    private final String m25975i(int i) {
        int i2 = this.f22269c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i0 */
    private final void m25976i0(int i) {
        if (i < 0 || i >= this.f22269c) {
            throw new IndexOutOfBoundsException(m25975i(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo16587b();
        if (i < 0 || i > (i2 = this.f22269c)) {
            throw new IndexOutOfBoundsException(m25975i(i));
        }
        int[] iArr = this.f22268b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f22268b, i, iArr2, i + 1, this.f22269c - i);
            this.f22268b = iArr2;
        }
        this.f22268b[i] = intValue;
        this.f22269c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo16587b();
        C3623p2.m26441e(collection);
        if (!(collection instanceof C3458k2)) {
            return super.addAll(collection);
        }
        C3458k2 k2Var = (C3458k2) collection;
        int i = k2Var.f22269c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22269c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f22268b;
            if (i3 > iArr.length) {
                this.f22268b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(k2Var.f22268b, 0, this.f22268b, this.f22269c, k2Var.f22269c);
            this.f22269c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final int mo16242c(int i) {
        m25976i0(i);
        return this.f22268b[i];
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3458k2)) {
            return super.equals(obj);
        }
        C3458k2 k2Var = (C3458k2) obj;
        if (this.f22269c != k2Var.f22269c) {
            return false;
        }
        int[] iArr = k2Var.f22268b;
        for (int i = 0; i < this.f22269c; i++) {
            if (this.f22268b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo16244f(int i) {
        mo16587b();
        int i2 = this.f22269c;
        int[] iArr = this.f22268b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f22268b = iArr2;
        }
        int[] iArr3 = this.f22268b;
        int i3 = this.f22269c;
        this.f22269c = i3 + 1;
        iArr3[i3] = i;
    }

    public final /* synthetic */ Object get(int i) {
        m25976i0(i);
        return Integer.valueOf(this.f22268b[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C3590o2 mo15892h(int i) {
        if (i >= this.f22269c) {
            return new C3458k2(Arrays.copyOf(this.f22268b, i), this.f22269c);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f22269c; i2++) {
            i = (i * 31) + this.f22268b[i2];
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f22269c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f22268b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo16587b();
        m25976i0(i);
        int[] iArr = this.f22268b;
        int i2 = iArr[i];
        int i3 = this.f22269c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f22269c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo16587b();
        if (i2 >= i) {
            int[] iArr = this.f22268b;
            System.arraycopy(iArr, i2, iArr, i, this.f22269c - i2);
            this.f22269c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo16587b();
        m25976i0(i);
        int[] iArr = this.f22268b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f22269c;
    }

    private C3458k2(int[] iArr, int i) {
        this.f22268b = iArr;
        this.f22269c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo16244f(((Integer) obj).intValue());
        return true;
    }
}
