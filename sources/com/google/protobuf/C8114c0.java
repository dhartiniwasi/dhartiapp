package com.google.protobuf;

import com.google.protobuf.C8119d0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.c0 */
/* compiled from: IntArrayList */
final class C8114c0 extends C8113c<Integer> implements C8119d0.C8126g, RandomAccess, C8146g1 {

    /* renamed from: d */
    private static final C8114c0 f34843d;

    /* renamed from: b */
    private int[] f34844b;

    /* renamed from: c */
    private int f34845c;

    static {
        C8114c0 c0Var = new C8114c0(new int[0], 0);
        f34843d = c0Var;
        c0Var.mo26803H();
    }

    C8114c0() {
        this(new int[10], 0);
    }

    /* renamed from: i */
    private void m44588i(int i, int i2) {
        int i3;
        mo26807b();
        if (i < 0 || i > (i3 = this.f34845c)) {
            throw new IndexOutOfBoundsException(m44591q(i));
        }
        int[] iArr = this.f34844b;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i3 - i);
        } else {
            int[] iArr2 = new int[(((i3 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f34844b, i, iArr2, i + 1, this.f34845c - i);
            this.f34844b = iArr2;
        }
        this.f34844b[i] = i2;
        this.f34845c++;
        this.modCount++;
    }

    /* renamed from: j */
    public static C8114c0 m44589j() {
        return f34843d;
    }

    /* renamed from: k */
    private void m44590k(int i) {
        if (i < 0 || i >= this.f34845c) {
            throw new IndexOutOfBoundsException(m44591q(i));
        }
    }

    /* renamed from: q */
    private String m44591q(int i) {
        return "Index:" + i + ", Size:" + this.f34845c;
    }

    /* renamed from: S */
    public void mo26815S(int i) {
        mo26807b();
        int i2 = this.f34845c;
        int[] iArr = this.f34844b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f34844b = iArr2;
        }
        int[] iArr3 = this.f34844b;
        int i3 = this.f34845c;
        this.f34845c = i3 + 1;
        iArr3[i3] = i;
    }

    public boolean addAll(Collection<? extends Integer> collection) {
        mo26807b();
        C8119d0.m44649a(collection);
        if (!(collection instanceof C8114c0)) {
            return super.addAll(collection);
        }
        C8114c0 c0Var = (C8114c0) collection;
        int i = c0Var.f34845c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f34845c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f34844b;
            if (i3 > iArr.length) {
                this.f34844b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(c0Var.f34844b, 0, this.f34844b, this.f34845c, c0Var.f34845c);
            this.f34845c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void add(int i, Integer num) {
        m44588i(i, num.intValue());
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8114c0)) {
            return super.equals(obj);
        }
        C8114c0 c0Var = (C8114c0) obj;
        if (this.f34845c != c0Var.f34845c) {
            return false;
        }
        int[] iArr = c0Var.f34844b;
        for (int i = 0; i < this.f34845c; i++) {
            if (this.f34844b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Integer num) {
        mo26815S(num.intValue());
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f34845c; i2++) {
            i = (i * 31) + this.f34844b[i2];
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f34844b[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: l */
    public Integer get(int i) {
        return Integer.valueOf(mo26824o(i));
    }

    /* renamed from: o */
    public int mo26824o(int i) {
        m44590k(i);
        return this.f34844b[i];
    }

    /* renamed from: r */
    public Integer remove(int i) {
        mo26807b();
        m44590k(i);
        int[] iArr = this.f34844b;
        int i2 = iArr[i];
        int i3 = this.f34845c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f34845c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo26807b();
        if (i2 >= i) {
            int[] iArr = this.f34844b;
            System.arraycopy(iArr, i2, iArr, i, this.f34845c - i2);
            this.f34845c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Integer set(int i, Integer num) {
        return Integer.valueOf(mo26830t(i, num.intValue()));
    }

    public int size() {
        return this.f34845c;
    }

    /* renamed from: t */
    public int mo26830t(int i, int i2) {
        mo26807b();
        m44590k(i);
        int[] iArr = this.f34844b;
        int i3 = iArr[i];
        iArr[i] = i2;
        return i3;
    }

    private C8114c0(int[] iArr, int i) {
        this.f34844b = iArr;
        this.f34845c = i;
    }

    /* renamed from: m */
    public C8119d0.C8126g m44597m(int i) {
        if (i >= this.f34845c) {
            return new C8114c0(Arrays.copyOf(this.f34844b, i), this.f34845c);
        }
        throw new IllegalArgumentException();
    }
}
