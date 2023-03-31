package com.google.protobuf;

import com.google.protobuf.C8119d0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.g */
/* compiled from: BooleanArrayList */
final class C8144g extends C8113c<Boolean> implements C8119d0.C8120a, RandomAccess, C8146g1 {

    /* renamed from: d */
    private static final C8144g f34885d;

    /* renamed from: b */
    private boolean[] f34886b;

    /* renamed from: c */
    private int f34887c;

    static {
        C8144g gVar = new C8144g(new boolean[0], 0);
        f34885d = gVar;
        gVar.mo26803H();
    }

    C8144g() {
        this(new boolean[10], 0);
    }

    /* renamed from: i */
    private void m44747i(int i, boolean z) {
        int i2;
        mo26807b();
        if (i < 0 || i > (i2 = this.f34887c)) {
            throw new IndexOutOfBoundsException(m44749q(i));
        }
        boolean[] zArr = this.f34886b;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[(((i2 * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f34886b, i, zArr2, i + 1, this.f34887c - i);
            this.f34886b = zArr2;
        }
        this.f34886b[i] = z;
        this.f34887c++;
        this.modCount++;
    }

    /* renamed from: k */
    private void m44748k(int i) {
        if (i < 0 || i >= this.f34887c) {
            throw new IndexOutOfBoundsException(m44749q(i));
        }
    }

    /* renamed from: q */
    private String m44749q(int i) {
        return "Index:" + i + ", Size:" + this.f34887c;
    }

    public boolean addAll(Collection<? extends Boolean> collection) {
        mo26807b();
        C8119d0.m44649a(collection);
        if (!(collection instanceof C8144g)) {
            return super.addAll(collection);
        }
        C8144g gVar = (C8144g) collection;
        int i = gVar.f34887c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f34887c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.f34886b;
            if (i3 > zArr.length) {
                this.f34886b = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(gVar.f34886b, 0, this.f34886b, this.f34887c, gVar.f34887c);
            this.f34887c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void add(int i, Boolean bool) {
        m44747i(i, bool.booleanValue());
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8144g)) {
            return super.equals(obj);
        }
        C8144g gVar = (C8144g) obj;
        if (this.f34887c != gVar.f34887c) {
            return false;
        }
        boolean[] zArr = gVar.f34886b;
        for (int i = 0; i < this.f34887c; i++) {
            if (this.f34886b[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Boolean bool) {
        mo26905j(bool.booleanValue());
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f34887c; i2++) {
            i = (i * 31) + C8119d0.m44651c(this.f34886b[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f34886b[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public void mo26905j(boolean z) {
        mo26807b();
        int i = this.f34887c;
        boolean[] zArr = this.f34886b;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[(((i * 3) / 2) + 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f34886b = zArr2;
        }
        boolean[] zArr3 = this.f34886b;
        int i2 = this.f34887c;
        this.f34887c = i2 + 1;
        zArr3[i2] = z;
    }

    /* renamed from: l */
    public Boolean get(int i) {
        return Boolean.valueOf(mo26907o(i));
    }

    /* renamed from: o */
    public boolean mo26907o(int i) {
        m44748k(i);
        return this.f34886b[i];
    }

    /* renamed from: r */
    public C8119d0.C8120a mo26823m(int i) {
        if (i >= this.f34887c) {
            return new C8144g(Arrays.copyOf(this.f34886b, i), this.f34887c);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo26807b();
        if (i2 >= i) {
            boolean[] zArr = this.f34886b;
            System.arraycopy(zArr, i2, zArr, i, this.f34887c - i2);
            this.f34887c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Boolean remove(int i) {
        mo26807b();
        m44748k(i);
        boolean[] zArr = this.f34886b;
        boolean z = zArr[i];
        int i2 = this.f34887c;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f34887c--;
        this.modCount++;
        return Boolean.valueOf(z);
    }

    public int size() {
        return this.f34887c;
    }

    /* renamed from: t */
    public Boolean set(int i, Boolean bool) {
        return Boolean.valueOf(mo26914u(i, bool.booleanValue()));
    }

    /* renamed from: u */
    public boolean mo26914u(int i, boolean z) {
        mo26807b();
        m44748k(i);
        boolean[] zArr = this.f34886b;
        boolean z2 = zArr[i];
        zArr[i] = z;
        return z2;
    }

    private C8144g(boolean[] zArr, int i) {
        this.f34886b = zArr;
        this.f34887c = i;
    }
}
