package com.google.protobuf;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.j1 */
/* compiled from: ProtobufArrayList */
final class C8175j1<E> extends C8113c<E> implements RandomAccess {

    /* renamed from: d */
    private static final C8175j1<Object> f34980d;

    /* renamed from: b */
    private E[] f34981b;

    /* renamed from: c */
    private int f34982c;

    static {
        C8175j1<Object> j1Var = new C8175j1<>(new Object[0], 0);
        f34980d = j1Var;
        j1Var.mo26803H();
    }

    private C8175j1(E[] eArr, int i) {
        this.f34981b = eArr;
        this.f34982c = i;
    }

    /* renamed from: c */
    private static <E> E[] m45049c(int i) {
        return new Object[i];
    }

    /* renamed from: f */
    public static <E> C8175j1<E> m45050f() {
        return f34980d;
    }

    /* renamed from: i */
    private void m45051i(int i) {
        if (i < 0 || i >= this.f34982c) {
            throw new IndexOutOfBoundsException(m45052j(i));
        }
    }

    /* renamed from: j */
    private String m45052j(int i) {
        return "Index:" + i + ", Size:" + this.f34982c;
    }

    public boolean add(E e) {
        mo26807b();
        int i = this.f34982c;
        E[] eArr = this.f34981b;
        if (i == eArr.length) {
            this.f34981b = Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f34981b;
        int i2 = this.f34982c;
        this.f34982c = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }

    public E get(int i) {
        m45051i(i);
        return this.f34981b[i];
    }

    /* renamed from: k */
    public C8175j1<E> mo26823m(int i) {
        if (i >= this.f34982c) {
            return new C8175j1<>(Arrays.copyOf(this.f34981b, i), this.f34982c);
        }
        throw new IllegalArgumentException();
    }

    public E remove(int i) {
        mo26807b();
        m45051i(i);
        E[] eArr = this.f34981b;
        E e = eArr[i];
        int i2 = this.f34982c;
        if (i < i2 - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f34982c--;
        this.modCount++;
        return e;
    }

    public E set(int i, E e) {
        mo26807b();
        m45051i(i);
        E[] eArr = this.f34981b;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    public int size() {
        return this.f34982c;
    }

    public void add(int i, E e) {
        int i2;
        mo26807b();
        if (i < 0 || i > (i2 = this.f34982c)) {
            throw new IndexOutOfBoundsException(m45052j(i));
        }
        E[] eArr = this.f34981b;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] c = m45049c(((i2 * 3) / 2) + 1);
            System.arraycopy(this.f34981b, 0, c, 0, i);
            System.arraycopy(this.f34981b, i, c, i + 1, this.f34982c - i);
            this.f34981b = c;
        }
        this.f34981b[i] = e;
        this.f34982c++;
        this.modCount++;
    }
}
