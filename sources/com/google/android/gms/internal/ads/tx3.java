package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class tx3 extends tv3 implements RandomAccess, xx3, jz3 {

    /* renamed from: d */
    private static final tx3 f18289d;

    /* renamed from: b */
    private int[] f18290b;

    /* renamed from: c */
    private int f18291c;

    static {
        tx3 tx3 = new tx3(new int[0], 0);
        f18289d = tx3;
        tx3.mo8987d();
    }

    tx3() {
        this(new int[10], 0);
    }

    /* renamed from: f */
    public static tx3 m21338f() {
        return f18289d;
    }

    /* renamed from: i */
    private final String m21339i(int i) {
        int i2 = this.f18291c;
        return "Index:" + i + ", Size:" + i2;
    }

    /* renamed from: j */
    private final void m21340j(int i) {
        if (i < 0 || i >= this.f18291c) {
            throw new IndexOutOfBoundsException(m21339i(i));
        }
    }

    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        mo14403b();
        if (i < 0 || i > (i2 = this.f18291c)) {
            throw new IndexOutOfBoundsException(m21339i(i));
        }
        int[] iArr = this.f18290b;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f18290b, i, iArr2, i + 1, this.f18291c - i);
            this.f18290b = iArr2;
        }
        this.f18290b[i] = intValue;
        this.f18291c++;
        this.modCount++;
    }

    public final boolean addAll(Collection collection) {
        mo14403b();
        cy3.m11233e(collection);
        if (!(collection instanceof tx3)) {
            return super.addAll(collection);
        }
        tx3 tx3 = (tx3) collection;
        int i = tx3.f18291c;
        if (i == 0) {
            return false;
        }
        int i2 = this.f18291c;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.f18290b;
            if (i3 > iArr.length) {
                this.f18290b = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(tx3.f18290b, 0, this.f18290b, this.f18291c, tx3.f18291c);
            this.f18291c = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    /* renamed from: c */
    public final int mo14418c(int i) {
        m21340j(i);
        return this.f18290b[i];
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tx3)) {
            return super.equals(obj);
        }
        tx3 tx3 = (tx3) obj;
        if (this.f18291c != tx3.f18291c) {
            return false;
        }
        int[] iArr = tx3.f18290b;
        for (int i = 0; i < this.f18291c; i++) {
            if (this.f18290b[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f0 */
    public final xx3 mo8975h(int i) {
        if (i >= this.f18291c) {
            return new tx3(Arrays.copyOf(this.f18290b, i), this.f18291c);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        m21340j(i);
        return Integer.valueOf(this.f18290b[i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f18291c; i2++) {
            i = (i * 31) + this.f18290b[i2];
        }
        return i;
    }

    /* renamed from: i0 */
    public final void mo14422i0(int i) {
        mo14403b();
        int i2 = this.f18291c;
        int[] iArr = this.f18290b;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(((i2 * 3) / 2) + 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f18290b = iArr2;
        }
        int[] iArr3 = this.f18290b;
        int i3 = this.f18291c;
        this.f18291c = i3 + 1;
        iArr3[i3] = i;
    }

    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f18291c;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f18290b[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i) {
        mo14403b();
        m21340j(i);
        int[] iArr = this.f18290b;
        int i2 = iArr[i];
        int i3 = this.f18291c;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f18291c--;
        this.modCount++;
        return Integer.valueOf(i2);
    }

    /* access modifiers changed from: protected */
    public final void removeRange(int i, int i2) {
        mo14403b();
        if (i2 >= i) {
            int[] iArr = this.f18290b;
            System.arraycopy(iArr, i2, iArr, i, this.f18291c - i2);
            this.f18291c -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        mo14403b();
        m21340j(i);
        int[] iArr = this.f18290b;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    public final int size() {
        return this.f18291c;
    }

    private tx3(int[] iArr, int i) {
        this.f18290b = iArr;
        this.f18291c = i;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        mo14422i0(((Integer) obj).intValue());
        return true;
    }
}
