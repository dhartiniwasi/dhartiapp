package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.c3 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3195c3 extends C3654q0 implements RandomAccess, C3822v3 {

    /* renamed from: d */
    private static final C3195c3 f21854d;

    /* renamed from: b */
    private long[] f21855b;

    /* renamed from: c */
    private int f21856c;

    static {
        C3195c3 c3Var = new C3195c3(new long[0], 0);
        f21854d = c3Var;
        c3Var.mo16475d();
    }

    C3195c3() {
        this(new long[10], 0);
    }

    /* renamed from: i */
    private final String m25229i(int i) {
        int i2 = this.f21856c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: i0 */
    private final void m25230i0(int i) {
        if (i < 0 || i >= this.f21856c) {
            throw new IndexOutOfBoundsException(m25229i(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        mo16587b();
        if (i < 0 || i > (i2 = this.f21856c)) {
            throw new IndexOutOfBoundsException(m25229i(i));
        }
        long[] jArr = this.f21855b;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[(((i2 * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f21855b, i, jArr2, i + 1, this.f21856c - i);
            this.f21855b = jArr2;
        }
        this.f21855b[i] = longValue;
        this.f21856c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo16587b();
        C3623p2.m26441e(collection);
        if (!(collection instanceof C3195c3)) {
            return super.addAll(collection);
        }
        C3195c3 c3Var = (C3195c3) collection;
        int i = c3Var.f21856c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f21856c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.f21855b;
            if (i3 > jArr.length) {
                this.f21855b = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(c3Var.f21855b, 0, this.f21855b, this.f21856c, c3Var.f21856c);
            this.f21856c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final long mo15887c(int i) {
        m25230i0(i);
        return this.f21855b[i];
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3195c3)) {
            return super.equals(obj);
        }
        C3195c3 c3Var = (C3195c3) obj;
        if (this.f21856c != c3Var.f21856c) {
            return false;
        }
        long[] jArr = c3Var.f21855b;
        for (int i = 0; i < this.f21856c; i++) {
            if (this.f21855b[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void mo15890f(long j) {
        mo16587b();
        int i = this.f21856c;
        long[] jArr = this.f21855b;
        if (i == jArr.length) {
            long[] jArr2 = new long[(((i * 3) / 2) + 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f21855b = jArr2;
        }
        long[] jArr3 = this.f21855b;
        int i2 = this.f21856c;
        this.f21856c = i2 + 1;
        jArr3[i2] = j;
    }

    public final /* synthetic */ Object get(int i) {
        m25230i0(i);
        return Long.valueOf(this.f21855b[i]);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C3590o2 mo15892h(int i) {
        if (i >= this.f21856c) {
            return new C3195c3(Arrays.copyOf(this.f21855b, i), this.f21856c);
        }
        throw new IllegalArgumentException();
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f21856c; i2++) {
            i = (i * 31) + C3623p2.m26439c(this.f21855b[i2]);
        }
        return i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f21856c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f21855b[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo16587b();
        m25230i0(i);
        long[] jArr = this.f21855b;
        long j = jArr[i];
        int i2 = this.f21856c;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f21856c--;
        this.modCount++;
        return Long.valueOf(j);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo16587b();
        if (i2 >= i) {
            long[] jArr = this.f21855b;
            System.arraycopy(jArr, i2, jArr, i, this.f21856c - i2);
            this.f21856c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        mo16587b();
        m25230i0(i);
        long[] jArr = this.f21855b;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    public final int size() {
        return this.f21856c;
    }

    private C3195c3(long[] jArr, int i) {
        this.f21855b = jArr;
        this.f21856c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo15890f(((Long) obj).longValue());
        return true;
    }
}
