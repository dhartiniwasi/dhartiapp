package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ca */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C6911ca extends C7137q7 implements RandomAccess, C7075m9, C7204ua {

    /* renamed from: d */
    private static final C6911ca f31630d;

    /* renamed from: b */
    private long[] f31631b;

    /* renamed from: c */
    private int f31632c;

    static {
        C6911ca caVar = new C6911ca(new long[0], 0);
        f31630d = caVar;
        caVar.mo23697d();
    }

    C6911ca() {
        this(new long[10], 0);
    }

    /* renamed from: c */
    public static C6911ca m39876c() {
        return f31630d;
    }

    /* renamed from: i */
    private final String m39877i(int i) {
        int i2 = this.f31632c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: j */
    private final void m39878j(int i) {
        if (i < 0 || i >= this.f31632c) {
            throw new IndexOutOfBoundsException(m39877i(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo23768b();
        if (i < 0 || i > (i2 = this.f31632c)) {
            throw new IndexOutOfBoundsException(m39877i(i));
        }
        long[] jArr = this.f31631b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f31631b, i, jArr2, i + 1, this.f31632c - i);
            this.f31631b = jArr2;
        }
        this.f31631b[i] = longValue;
        this.f31632c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo23768b();
        C7107o9.m40532e(collection);
        if (!(collection instanceof C6911ca)) {
            return super.addAll(collection);
        }
        C6911ca caVar = (C6911ca) collection;
        int i = caVar.f31632c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f31632c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f31631b;
            if (i3 > jArr.length) {
                this.f31631b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(caVar.f31631b, 0, this.f31631b, this.f31632c, caVar.f31632c);
            this.f31632c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6911ca)) {
            return super.equals(obj);
        }
        C6911ca caVar = (C6911ca) obj;
        if (this.f31632c != caVar.f31632c) {
            return false;
        }
        long[] jArr = caVar.f31631b;
        for (int i = 0; i < this.f31632c; i++) {
            if (this.f31631b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo23254f(long j) {
        mo23768b();
        int i = this.f31632c;
        long[] jArr = this.f31631b;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f31631b = jArr2;
        }
        long[] jArr3 = this.f31631b;
        int i2 = this.f31632c;
        this.f31632c = i2 + 1;
        jArr3[i2] = j;
    }

    /* renamed from: g */
    public final long mo23255g(int i) {
        m39878j(i);
        return this.f31631b[i];
    }

    public final /* synthetic */ Object get(int i) {
        m39878j(i);
        return Long.valueOf(this.f31631b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f31632c; i2++) {
            i = (i * 31) + C7107o9.m40530c(this.f31631b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f31632c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f31631b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: n */
    public final C7075m9 mo23012h(int i) {
        if (i >= this.f31632c) {
            return new C6911ca(Arrays.copyOf(this.f31631b, i), this.f31632c);
        }
        throw new IllegalArgumentException();
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo23768b();
        m39878j(i);
        long[] jArr = this.f31631b;
        long j = jArr[i];
        int i2 = this.f31632c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f31632c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo23768b();
        if (i2 >= i) {
            long[] jArr = this.f31631b;
            System.arraycopy(jArr, i2, jArr, i, this.f31632c - i2);
            this.f31632c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo23768b();
        m39878j(i);
        long[] jArr = this.f31631b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f31632c;
    }

    private C6911ca(long[] jArr, int i) {
        this.f31631b = jArr;
        this.f31632c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo23254f(((Long) obj).longValue());
        return true;
    }
}
