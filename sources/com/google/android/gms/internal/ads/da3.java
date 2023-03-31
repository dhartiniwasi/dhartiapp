package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class da3 extends AbstractMap implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: r */
    public static final Object f8158r = new Object();

    /* renamed from: a */
    private transient Object f8159a;

    /* renamed from: b */
    transient int[] f8160b;

    /* renamed from: c */
    transient Object[] f8161c;

    /* renamed from: d */
    transient Object[] f8162d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public transient int f8163e;

    /* renamed from: f */
    private transient int f8164f;

    /* renamed from: g */
    private transient Set f8165g;

    /* renamed from: h */
    private transient Set f8166h;

    /* renamed from: i */
    private transient Collection f8167i;

    da3(int i) {
        mo9492r(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final Object m11378A(Object obj) {
        if (mo9496t()) {
            return f8158r;
        }
        int x = m11396x();
        Object obj2 = this.f8159a;
        obj2.getClass();
        int b = ea3.m11996b(obj, (Object) null, x, obj2, m11380C(), m11381b(), (Object[]) null);
        if (b == -1) {
            return f8158r;
        }
        Object obj3 = m11382c()[b];
        mo9494s(b, x);
        this.f8164f--;
        mo9491q();
        return obj3;
    }

    /* renamed from: B */
    private final void m11379B(int i) {
        this.f8163e = ((32 - Integer.numberOfLeadingZeros(i)) & 31) | (this.f8163e & -32);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public final int[] m11380C() {
        int[] iArr = this.f8160b;
        iArr.getClass();
        return iArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Object[] m11381b() {
        Object[] objArr = this.f8161c;
        objArr.getClass();
        return objArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final Object[] m11382c() {
        Object[] objArr = this.f8162d;
        objArr.getClass();
        return objArr;
    }

    /* renamed from: e */
    static /* synthetic */ int m11384e(da3 da3) {
        int i = da3.f8164f;
        da3.f8164f = i - 1;
        return i;
    }

    /* renamed from: j */
    static /* synthetic */ Object m11387j(da3 da3, int i) {
        return da3.m11381b()[i];
    }

    /* renamed from: m */
    static /* synthetic */ Object m11390m(da3 da3, int i) {
        return da3.m11382c()[i];
    }

    /* renamed from: n */
    static /* synthetic */ Object m11391n(da3 da3) {
        Object obj = da3.f8159a;
        obj.getClass();
        return obj;
    }

    /* renamed from: p */
    static /* synthetic */ void m11392p(da3 da3, int i, Object obj) {
        da3.m11382c()[i] = obj;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final int m11396x() {
        return (1 << (this.f8163e & 31)) - 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public final int m11397y(Object obj) {
        if (mo9496t()) {
            return -1;
        }
        int b = ma3.m16461b(obj);
        int x = m11396x();
        Object obj2 = this.f8159a;
        obj2.getClass();
        int c = ea3.m11997c(obj2, b & x);
        if (c != 0) {
            int i = ~x;
            int i2 = b & i;
            do {
                int i3 = c - 1;
                int i4 = m11380C()[i3];
                if ((i4 & i) == i2 && w73.m22614a(obj, m11381b()[i3])) {
                    return i3;
                }
                c = i4 & x;
            } while (c != 0);
        }
        return -1;
    }

    /* renamed from: z */
    private final int m11398z(int i, int i2, int i3, int i4) {
        Object d = ea3.m11998d(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            ea3.m11999e(d, i3 & i5, i4 + 1);
        }
        Object obj = this.f8159a;
        obj.getClass();
        int[] C = m11380C();
        for (int i6 = 0; i6 <= i; i6++) {
            int c = ea3.m11997c(obj, i6);
            while (c != 0) {
                int i7 = c - 1;
                int i8 = C[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int c2 = ea3.m11997c(d, i10);
                ea3.m11999e(d, i10, c);
                C[i7] = ((~i5) & i9) | (c2 & i5);
                c = i8 & i;
            }
        }
        this.f8159a = d;
        m11379B(i5);
        return i5;
    }

    public final void clear() {
        if (!mo9496t()) {
            mo9491q();
            Map o = mo9489o();
            if (o != null) {
                this.f8163e = ad3.m9692b(size(), 3, 1073741823);
                o.clear();
                this.f8159a = null;
                this.f8164f = 0;
                return;
            }
            Arrays.fill(m11381b(), 0, this.f8164f, (Object) null);
            Arrays.fill(m11382c(), 0, this.f8164f, (Object) null);
            Object obj = this.f8159a;
            obj.getClass();
            if (obj instanceof byte[]) {
                Arrays.fill((byte[]) obj, (byte) 0);
            } else if (obj instanceof short[]) {
                Arrays.fill((short[]) obj, 0);
            } else {
                Arrays.fill((int[]) obj, 0);
            }
            Arrays.fill(m11380C(), 0, this.f8164f, 0);
            this.f8164f = 0;
        }
    }

    public final boolean containsKey(Object obj) {
        Map o = mo9489o();
        if (o != null) {
            return o.containsKey(obj);
        }
        return m11397y(obj) != -1;
    }

    public final boolean containsValue(Object obj) {
        Map o = mo9489o();
        if (o != null) {
            return o.containsValue(obj);
        }
        for (int i = 0; i < this.f8164f; i++) {
            if (w73.m22614a(obj, m11382c()[i])) {
                return true;
            }
        }
        return false;
    }

    public final Set entrySet() {
        Set set = this.f8166h;
        if (set != null) {
            return set;
        }
        y93 y93 = new y93(this);
        this.f8166h = y93;
        return y93;
    }

    public final Object get(Object obj) {
        Map o = mo9489o();
        if (o != null) {
            return o.get(obj);
        }
        int y = m11397y(obj);
        if (y == -1) {
            return null;
        }
        return m11382c()[y];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo9485h() {
        return isEmpty() ? -1 : 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final int mo9486i(int i) {
        int i2 = i + 1;
        if (i2 < this.f8164f) {
            return i2;
        }
        return -1;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Set keySet() {
        Set set = this.f8165g;
        if (set != null) {
            return set;
        }
        aa3 aa3 = new aa3(this);
        this.f8165g = aa3;
        return aa3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final Map mo9489o() {
        Object obj = this.f8159a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final Object put(Object obj, Object obj2) {
        int min;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (mo9496t()) {
            b83.m10245i(mo9496t(), "Arrays already allocated");
            int i = this.f8163e;
            int max = Math.max(i + 1, 2);
            int highestOneBit = Integer.highestOneBit(max);
            if (max > ((int) ((double) highestOneBit)) && (highestOneBit = highestOneBit + highestOneBit) <= 0) {
                highestOneBit = 1073741824;
            }
            int max2 = Math.max(4, highestOneBit);
            this.f8159a = ea3.m11998d(max2);
            m11379B(max2 - 1);
            this.f8160b = new int[i];
            this.f8161c = new Object[i];
            this.f8162d = new Object[i];
        }
        Map o = mo9489o();
        if (o != null) {
            return o.put(obj3, obj4);
        }
        int[] C = m11380C();
        Object[] b = m11381b();
        Object[] c = m11382c();
        int i2 = this.f8164f;
        int i3 = i2 + 1;
        int b2 = ma3.m16461b(obj);
        int x = m11396x();
        int i4 = b2 & x;
        Object obj5 = this.f8159a;
        obj5.getClass();
        int c2 = ea3.m11997c(obj5, i4);
        if (c2 != 0) {
            int i5 = ~x;
            int i6 = b2 & i5;
            int i7 = 0;
            while (true) {
                int i8 = c2 - 1;
                int i9 = C[i8];
                int i10 = i9 & i5;
                if (i10 != i6 || !w73.m22614a(obj3, b[i8])) {
                    int i11 = i9 & x;
                    i7++;
                    if (i11 != 0) {
                        c2 = i11;
                    } else if (i7 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(m11396x() + 1, 1.0f);
                        for (int h = mo9485h(); h >= 0; h = mo9486i(h)) {
                            linkedHashMap.put(m11381b()[h], m11382c()[h]);
                        }
                        this.f8159a = linkedHashMap;
                        this.f8160b = null;
                        this.f8161c = null;
                        this.f8162d = null;
                        mo9491q();
                        return linkedHashMap.put(obj3, obj4);
                    } else if (i3 > x) {
                        x = m11398z(x, ea3.m11995a(x), b2, i2);
                    } else {
                        C[i8] = (i3 & x) | i10;
                    }
                } else {
                    Object obj6 = c[i8];
                    c[i8] = obj4;
                    return obj6;
                }
            }
        } else if (i3 > x) {
            x = m11398z(x, ea3.m11995a(x), b2, i2);
        } else {
            Object obj7 = this.f8159a;
            obj7.getClass();
            ea3.m11999e(obj7, i4, i3);
        }
        int length = m11380C().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f8160b = Arrays.copyOf(m11380C(), min);
            this.f8161c = Arrays.copyOf(m11381b(), min);
            this.f8162d = Arrays.copyOf(m11382c(), min);
        }
        m11380C()[i2] = (~x) & b2;
        m11381b()[i2] = obj3;
        m11382c()[i2] = obj4;
        this.f8164f = i3;
        mo9491q();
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo9491q() {
        this.f8163e += 32;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo9492r(int i) {
        this.f8163e = ad3.m9692b(8, 1, 1073741823);
    }

    public final Object remove(Object obj) {
        Map o = mo9489o();
        if (o != null) {
            return o.remove(obj);
        }
        Object A = m11378A(obj);
        if (A == f8158r) {
            return null;
        }
        return A;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo9494s(int i, int i2) {
        Object obj = this.f8159a;
        obj.getClass();
        int[] C = m11380C();
        Object[] b = m11381b();
        Object[] c = m11382c();
        int size = size() - 1;
        if (i < size) {
            Object obj2 = b[size];
            b[i] = obj2;
            c[i] = c[size];
            b[size] = null;
            c[size] = null;
            C[i] = C[size];
            C[size] = 0;
            int b2 = ma3.m16461b(obj2) & i2;
            int c2 = ea3.m11997c(obj, b2);
            int i3 = size + 1;
            if (c2 != i3) {
                while (true) {
                    int i4 = c2 - 1;
                    int i5 = C[i4];
                    int i6 = i5 & i2;
                    if (i6 != i3) {
                        c2 = i6;
                    } else {
                        C[i4] = ((i + 1) & i2) | (i5 & (~i2));
                        return;
                    }
                }
            } else {
                ea3.m11999e(obj, b2, i + 1);
            }
        } else {
            b[i] = null;
            c[i] = null;
            C[i] = 0;
        }
    }

    public final int size() {
        Map o = mo9489o();
        return o != null ? o.size() : this.f8164f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo9496t() {
        return this.f8159a == null;
    }

    public final Collection values() {
        Collection collection = this.f8167i;
        if (collection != null) {
            return collection;
        }
        ca3 ca3 = new ca3(this);
        this.f8167i = ca3;
        return ca3;
    }
}
