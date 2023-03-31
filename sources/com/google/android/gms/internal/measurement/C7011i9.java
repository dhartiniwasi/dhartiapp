package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.i9 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7011i9 extends C7137q7 implements RandomAccess, C7059l9, C7204ua {

    /* renamed from: d */
    private static final C7011i9 f31755d;

    /* renamed from: b */
    private int[] f31756b;

    /* renamed from: c */
    private int f31757c;

    static {
        C7011i9 i9Var = new C7011i9(new int[0], 0);
        f31755d = i9Var;
        i9Var.mo23697d();
    }

    C7011i9() {
        this(new int[10], 0);
    }

    /* renamed from: f */
    public static C7011i9 m40203f() {
        return f31755d;
    }

    /* renamed from: i */
    private final String m40204i(int i) {
        int i2 = this.f31757c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: j */
    private final void m40205j(int i) {
        if (i < 0 || i >= this.f31757c) {
            throw new IndexOutOfBoundsException(m40204i(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo23768b();
        if (i < 0 || i > (i2 = this.f31757c)) {
            throw new IndexOutOfBoundsException(m40204i(i));
        }
        int[] iArr = this.f31756b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f31756b, i, iArr2, i + 1, this.f31757c - i);
            this.f31756b = iArr2;
        }
        this.f31756b[i] = intValue;
        this.f31757c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo23768b();
        C7107o9.m40532e(collection);
        if (!(collection instanceof C7011i9)) {
            return super.addAll(collection);
        }
        C7011i9 i9Var = (C7011i9) collection;
        int i = i9Var.f31757c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f31757c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f31756b;
            if (i3 > iArr.length) {
                this.f31756b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(i9Var.f31756b, 0, this.f31756b, this.f31757c, i9Var.f31757c);
            this.f31757c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final int mo23527c(int i) {
        m40205j(i);
        return this.f31756b[i];
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7011i9)) {
            return super.equals(obj);
        }
        C7011i9 i9Var = (C7011i9) obj;
        if (this.f31757c != i9Var.f31757c) {
            return false;
        }
        int[] iArr = i9Var.f31756b;
        for (int i = 0; i < this.f31757c; i++) {
            if (this.f31756b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f0 */
    public final C7059l9 mo23012h(int i) {
        if (i >= this.f31757c) {
            return new C7011i9(Arrays.copyOf(this.f31756b, i), this.f31757c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m40205j(i);
        return Integer.valueOf(this.f31756b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f31757c; i2++) {
            i = (i * 31) + this.f31756b[i2];
        }
        return i;
    }

    /* renamed from: i0 */
    public final void mo23531i0(int i) {
        mo23768b();
        int i2 = this.f31757c;
        int[] iArr = this.f31756b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f31756b = iArr2;
        }
        int[] iArr3 = this.f31756b;
        int i3 = this.f31757c;
        this.f31757c = i3 + 1;
        iArr3[i3] = i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f31757c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f31756b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo23768b();
        m40205j(i);
        int[] iArr = this.f31756b;
        int i2 = iArr[i];
        int i3 = this.f31757c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f31757c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo23768b();
        if (i2 >= i) {
            int[] iArr = this.f31756b;
            System.arraycopy(iArr, i2, iArr, i, this.f31757c - i2);
            this.f31757c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo23768b();
        m40205j(i);
        int[] iArr = this.f31756b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f31757c;
    }

    private C7011i9(int[] iArr, int i) {
        this.f31756b = iArr;
        this.f31757c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo23531i0(((Integer) obj).intValue());
        return true;
    }
}
