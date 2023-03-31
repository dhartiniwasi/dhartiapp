package com.google.protobuf;

import com.google.protobuf.C8119d0;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.m0 */
/* compiled from: LongArrayList */
final class C8193m0 extends C8113c<Long> implements C8119d0.C8129i, RandomAccess, C8146g1 {

    /* renamed from: d */
    private static final C8193m0 f35010d;

    /* renamed from: b */
    private long[] f35011b;

    /* renamed from: c */
    private int f35012c;

    static {
        C8193m0 m0Var = new C8193m0(new long[0], 0);
        f35010d = m0Var;
        m0Var.mo26803H();
    }

    C8193m0() {
        this(new long[10], 0);
    }

    /* renamed from: i */
    private void m45393i(int i, long j) {
        int i2;
        mo26807b();
        if (i < 0 || i > (i2 = this.f35012c)) {
            throw new IndexOutOfBoundsException(m45395q(i));
        }
        long[] jArr = this.f35011b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f35011b, i, jArr2, i + 1, this.f35012c - i);
            this.f35011b = jArr2;
        }
        this.f35011b[i] = j;
        this.f35012c++;
        this.modCount++;
    }

    /* renamed from: k */
    private void m45394k(int i) {
        if (i < 0 || i >= this.f35012c) {
            throw new IndexOutOfBoundsException(m45395q(i));
        }
    }

    /* renamed from: q */
    private String m45395q(int i) {
        return "Index:" + i + ", Size:" + this.f35012c;
    }

    public boolean addAll(Collection<? extends Long> collection) {
        mo26807b();
        C8119d0.m44649a(collection);
        if (!(collection instanceof C8193m0)) {
            return super.addAll(collection);
        }
        C8193m0 m0Var = (C8193m0) collection;
        int i = m0Var.f35012c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f35012c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f35011b;
            if (i3 > jArr.length) {
                this.f35011b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(m0Var.f35011b, 0, this.f35011b, this.f35012c, m0Var.f35012c);
            this.f35012c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public void add(int i, Long l) {
        m45393i(i, l.longValue());
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8193m0)) {
            return super.equals(obj);
        }
        C8193m0 m0Var = (C8193m0) obj;
        if (this.f35012c != m0Var.f35012c) {
            return false;
        }
        long[] jArr = m0Var.f35011b;
        for (int i = 0; i < this.f35012c; i++) {
            if (this.f35011b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean add(Long l) {
        mo27162j(l.longValue());
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f35012c; i2++) {
            i = (i * 31) + C8119d0.m44654f(this.f35011b[i2]);
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f35011b[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: j */
    public void mo27162j(long j) {
        mo26807b();
        int i = this.f35012c;
        long[] jArr = this.f35011b;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f35011b = jArr2;
        }
        long[] jArr3 = this.f35011b;
        int i2 = this.f35012c;
        this.f35012c = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: l */
    public Long get(int i) {
        return Long.valueOf(mo27164o(i));
    }

    /* renamed from: o */
    public long mo27164o(int i) {
        m45394k(i);
        return this.f35011b[i];
    }

    /* renamed from: r */
    public C8119d0.C8129i mo26823m(int i) {
        if (i >= this.f35012c) {
            return new C8193m0(Arrays.copyOf(this.f35011b, i), this.f35012c);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i, int i2) {
        mo26807b();
        if (i2 >= i) {
            long[] jArr = this.f35011b;
            System.arraycopy(jArr, i2, jArr, i, this.f35012c - i2);
            this.f35012c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    /* renamed from: s */
    public Long remove(int i) {
        mo26807b();
        m45394k(i);
        long[] jArr = this.f35011b;
        long j = jArr[i];
        int i2 = this.f35012c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f35012c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    public int size() {
        return this.f35012c;
    }

    /* renamed from: t */
    public Long set(int i, Long l) {
        return Long.valueOf(mo27171u(i, l.longValue()));
    }

    /* renamed from: u */
    public long mo27171u(int i, long j) {
        mo26807b();
        m45394k(i);
        long[] jArr = this.f35011b;
        long j2 = jArr[i];
        jArr[i] = j;
        return j2;
    }

    private C8193m0(long[] jArr, int i) {
        this.f35011b = jArr;
        this.f35012c = i;
    }
}
