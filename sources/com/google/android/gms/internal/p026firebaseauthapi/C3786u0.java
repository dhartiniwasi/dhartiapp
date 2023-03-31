package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.u0 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3786u0 extends C3654q0 implements RandomAccess, C3822v3 {

    /* renamed from: d */
    private static final C3786u0 f22758d;

    /* renamed from: b */
    private boolean[] f22759b;

    /* renamed from: c */
    private int f22760c;

    static {
        C3786u0 u0Var = new C3786u0(new boolean[0], 0);
        f22758d = u0Var;
        u0Var.mo16475d();
    }

    C3786u0() {
        this(new boolean[10], 0);
    }

    /* renamed from: f */
    private final String m27072f(int i) {
        int i2 = this.f22760c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i */
    private final void m27073i(int i) {
        if (i < 0 || i >= this.f22760c) {
            throw new IndexOutOfBoundsException(m27072f(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo16587b();
        if (i < 0 || i > (i2 = this.f22760c)) {
            throw new IndexOutOfBoundsException(m27072f(i));
        }
        boolean[] zArr = this.f22759b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f22759b, i, zArr2, i + 1, this.f22760c - i);
            this.f22759b = zArr2;
        }
        this.f22759b[i] = booleanValue;
        this.f22760c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo16587b();
        C3623p2.m26441e(collection);
        if (!(collection instanceof C3786u0)) {
            return super.addAll(collection);
        }
        C3786u0 u0Var = (C3786u0) collection;
        int i = u0Var.f22760c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22760c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f22759b;
            if (i3 > zArr.length) {
                this.f22759b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(u0Var.f22759b, 0, this.f22759b, this.f22760c, u0Var.f22760c);
            this.f22760c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final void mo16846c(boolean z) {
        mo16587b();
        int i = this.f22760c;
        boolean[] zArr = this.f22759b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f22759b = zArr2;
        }
        boolean[] zArr3 = this.f22759b;
        int i2 = this.f22760c;
        this.f22760c = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3786u0)) {
            return super.equals(obj);
        }
        C3786u0 u0Var = (C3786u0) obj;
        if (this.f22760c != u0Var.f22760c) {
            return false;
        }
        boolean[] zArr = u0Var.f22759b;
        for (int i = 0; i < this.f22760c; i++) {
            if (this.f22759b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object get(int i) {
        m27073i(i);
        return Boolean.valueOf(this.f22759b[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C3590o2 mo15892h(int i) {
        if (i >= this.f22760c) {
            return new C3786u0(Arrays.copyOf(this.f22759b, i), this.f22760c);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f22760c; i2++) {
            i = (i * 31) + C3623p2.m26437a(this.f22759b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.f22760c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f22759b[i2] == booleanValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo16587b();
        m27073i(i);
        boolean[] zArr = this.f22759b;
        boolean z = zArr[i];
        int i2 = this.f22760c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f22760c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo16587b();
        if (i2 >= i) {
            boolean[] zArr = this.f22759b;
            System.arraycopy(zArr, i2, zArr, i, this.f22760c - i2);
            this.f22760c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        mo16587b();
        m27073i(i);
        boolean[] zArr = this.f22759b;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    public final int size() {
        return this.f22760c;
    }

    private C3786u0(boolean[] zArr, int i) {
        this.f22759b = zArr;
        this.f22760c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo16846c(((Boolean) obj).booleanValue());
        return true;
    }
}
