package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ry3 extends tv3 implements RandomAccess, ay3, jz3 {

    /* renamed from: d */
    private static final ry3 f17142d;

    /* renamed from: b */
    private long[] f17143b;

    /* renamed from: c */
    private int f17144c;

    static {
        ry3 ry3 = new ry3(new long[0], 0);
        f17142d = ry3;
        ry3.mo8987d();
    }

    ry3() {
        this(new long[10], 0);
    }

    /* renamed from: f */
    public static ry3 m20076f() {
        return f17142d;
    }

    /* renamed from: j */
    private final String m20077j(int i) {
        int i2 = this.f17144c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: k */
    private final void m20078k(int i) {
        if (i < 0 || i >= this.f17144c) {
            throw new IndexOutOfBoundsException(m20077j(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo14403b();
        if (i < 0 || i > (i2 = this.f17144c)) {
            throw new IndexOutOfBoundsException(m20077j(i));
        }
        long[] jArr = this.f17143b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f17143b, i, jArr2, i + 1, this.f17144c - i);
            this.f17143b = jArr2;
        }
        this.f17143b[i] = longValue;
        this.f17144c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo14403b();
        cy3.m11233e(collection);
        if (!(collection instanceof ry3)) {
            return super.addAll(collection);
        }
        ry3 ry3 = (ry3) collection;
        int i = ry3.f17144c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f17144c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f17143b;
            if (i3 > jArr.length) {
                this.f17143b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(ry3.f17143b, 0, this.f17143b, this.f17144c, ry3.f17144c);
            this.f17144c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final long mo13898c(int i) {
        m20078k(i);
        return this.f17143b[i];
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry3)) {
            return super.equals(obj);
        }
        ry3 ry3 = (ry3) obj;
        if (this.f17144c != ry3.f17144c) {
            return false;
        }
        long[] jArr = ry3.f17143b;
        for (int i = 0; i < this.f17144c; i++) {
            if (this.f17143b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public final ay3 mo8975h(int i) {
        if (i >= this.f17144c) {
            return new ry3(Arrays.copyOf(this.f17143b, i), this.f17144c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m20078k(i);
        return Long.valueOf(this.f17143b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f17144c; i2++) {
            i = (i * 31) + cy3.m11231c(this.f17143b[i2]);
        }
        return i;
    }

    /* renamed from: i */
    public final void mo13901i(long j) {
        mo14403b();
        int i = this.f17144c;
        long[] jArr = this.f17143b;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f17143b = jArr2;
        }
        long[] jArr3 = this.f17143b;
        int i2 = this.f17144c;
        this.f17144c = i2 + 1;
        jArr3[i2] = j;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f17144c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f17143b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo14403b();
        m20078k(i);
        long[] jArr = this.f17143b;
        long j = jArr[i];
        int i2 = this.f17144c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f17144c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo14403b();
        if (i2 >= i) {
            long[] jArr = this.f17143b;
            System.arraycopy(jArr, i2, jArr, i, this.f17144c - i2);
            this.f17144c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo14403b();
        m20078k(i);
        long[] jArr = this.f17143b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f17144c;
    }

    private ry3(long[] jArr, int i) {
        this.f17143b = jArr;
        this.f17144c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo13901i(((Long) obj).longValue());
        return true;
    }
}
