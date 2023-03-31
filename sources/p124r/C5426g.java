package p124r;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: r.g */
/* compiled from: SimpleArrayMap */
public class C5426g<K, V> {

    /* renamed from: d */
    static Object[] f27679d;

    /* renamed from: e */
    static int f27680e;

    /* renamed from: f */
    static Object[] f27681f;

    /* renamed from: g */
    static int f27682g;

    /* renamed from: a */
    int[] f27683a;

    /* renamed from: b */
    Object[] f27684b;

    /* renamed from: c */
    int f27685c;

    public C5426g() {
        this.f27683a = C5417c.f27648a;
        this.f27684b = C5417c.f27650c;
        this.f27685c = 0;
    }

    /* renamed from: b */
    private void m33240b(int i) {
        Class<C5426g> cls = C5426g.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = f27681f;
                if (objArr != null) {
                    this.f27684b = objArr;
                    f27681f = (Object[]) objArr[0];
                    this.f27683a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f27682g--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = f27679d;
                if (objArr2 != null) {
                    this.f27684b = objArr2;
                    f27679d = (Object[]) objArr2[0];
                    this.f27683a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f27680e--;
                    return;
                }
            }
        }
        this.f27683a = new int[i];
        this.f27684b = new Object[(i << 1)];
    }

    /* renamed from: c */
    private static int m33241c(int[] iArr, int i, int i2) {
        try {
            return C5417c.m33192a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: e */
    private static void m33242e(int[] iArr, Object[] objArr, int i) {
        Class<C5426g> cls = C5426g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f27682g < 10) {
                    objArr[0] = f27681f;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f27681f = objArr;
                    f27682g++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f27680e < 10) {
                    objArr[0] = f27679d;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f27679d = objArr;
                    f27680e++;
                }
            }
        }
    }

    public void clear() {
        int i = this.f27685c;
        if (i > 0) {
            int[] iArr = this.f27683a;
            Object[] objArr = this.f27684b;
            this.f27683a = C5417c.f27648a;
            this.f27684b = C5417c.f27650c;
            this.f27685c = 0;
            m33242e(iArr, objArr, i);
        }
        if (this.f27685c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo19661g(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo19666i(obj) >= 0;
    }

    /* renamed from: d */
    public void mo19658d(int i) {
        int i2 = this.f27685c;
        int[] iArr = this.f27683a;
        if (iArr.length < i) {
            Object[] objArr = this.f27684b;
            m33240b(i);
            if (this.f27685c > 0) {
                System.arraycopy(iArr, 0, this.f27683a, 0, i2);
                System.arraycopy(objArr, 0, this.f27684b, 0, i2 << 1);
            }
            m33242e(iArr, objArr, i2);
        }
        if (this.f27685c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5426g) {
            C5426g gVar = (C5426g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f27685c) {
                try {
                    Object j = mo19668j(i);
                    Object n = mo19672n(i);
                    Object obj2 = gVar.get(j);
                    if (n == null) {
                        if (obj2 != null || !gVar.containsKey(j)) {
                            return false;
                        }
                    } else if (!n.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f27685c) {
                try {
                    Object j2 = mo19668j(i2);
                    Object n2 = mo19672n(i2);
                    Object obj3 = map.get(j2);
                    if (n2 == null) {
                        if (obj3 != null || !map.containsKey(j2)) {
                            return false;
                        }
                    } else if (!n2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo19660f(Object obj, int i) {
        int i2 = this.f27685c;
        if (i2 == 0) {
            return -1;
        }
        int c = m33241c(this.f27683a, i2, i);
        if (c < 0 || obj.equals(this.f27684b[c << 1])) {
            return c;
        }
        int i3 = c + 1;
        while (i3 < i2 && this.f27683a[i3] == i) {
            if (obj.equals(this.f27684b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = c - 1;
        while (i4 >= 0 && this.f27683a[i4] == i) {
            if (obj.equals(this.f27684b[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: g */
    public int mo19661g(Object obj) {
        return obj == null ? mo19664h() : mo19660f(obj, obj.hashCode());
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int g = mo19661g(obj);
        return g >= 0 ? this.f27684b[(g << 1) + 1] : v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo19664h() {
        int i = this.f27685c;
        if (i == 0) {
            return -1;
        }
        int c = m33241c(this.f27683a, i, 0);
        if (c < 0 || this.f27684b[c << 1] == null) {
            return c;
        }
        int i2 = c + 1;
        while (i2 < i && this.f27683a[i2] == 0) {
            if (this.f27684b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = c - 1;
        while (i3 >= 0 && this.f27683a[i3] == 0) {
            if (this.f27684b[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public int hashCode() {
        int[] iArr = this.f27683a;
        Object[] objArr = this.f27684b;
        int i = this.f27685c;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo19666i(Object obj) {
        int i = this.f27685c * 2;
        Object[] objArr = this.f27684b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f27685c <= 0;
    }

    /* renamed from: j */
    public K mo19668j(int i) {
        return this.f27684b[i << 1];
    }

    /* renamed from: k */
    public void mo19669k(C5426g<? extends K, ? extends V> gVar) {
        int i = gVar.f27685c;
        mo19658d(this.f27685c + i);
        if (this.f27685c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.mo19668j(i2), gVar.mo19672n(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f27683a, 0, this.f27683a, 0, i);
            System.arraycopy(gVar.f27684b, 0, this.f27684b, 0, i << 1);
            this.f27685c = i;
        }
    }

    /* renamed from: l */
    public V mo19670l(int i) {
        V[] vArr = this.f27684b;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f27685c;
        int i4 = 0;
        if (i3 <= 1) {
            m33242e(this.f27683a, vArr, i3);
            this.f27683a = C5417c.f27648a;
            this.f27684b = C5417c.f27650c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f27683a;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr = this.f27684b;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f27684b;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m33240b(i6);
                if (i3 == this.f27685c) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f27683a, 0, i);
                        System.arraycopy(vArr, 0, this.f27684b, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f27683a, i, i11);
                        System.arraycopy(vArr, i10 << 1, this.f27684b, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f27685c) {
            this.f27685c = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: m */
    public V mo19671m(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f27684b;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: n */
    public V mo19672n(int i) {
        return this.f27684b[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f27685c;
        if (k == null) {
            i2 = mo19664h();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo19660f(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f27684b;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.f27683a;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f27684b;
            m33240b(i6);
            if (i3 == this.f27685c) {
                int[] iArr2 = this.f27683a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f27684b, 0, objArr.length);
                }
                m33242e(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f27683a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f27684b;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f27685c - i5) << 1);
        }
        int i8 = this.f27685c;
        if (i3 == i8) {
            int[] iArr4 = this.f27683a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f27684b;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f27685c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int g = mo19661g(obj);
        if (g >= 0) {
            return mo19670l(g);
        }
        return null;
    }

    public V replace(K k, V v) {
        int g = mo19661g(k);
        if (g >= 0) {
            return mo19671m(g, v);
        }
        return null;
    }

    public int size() {
        return this.f27685c;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f27685c * 28);
        sb.append('{');
        for (int i = 0; i < this.f27685c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object j = mo19668j(i);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object n = mo19672n(i);
            if (n != this) {
                sb.append(n);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int g = mo19661g(obj);
        if (g < 0) {
            return false;
        }
        Object n = mo19672n(g);
        if (obj2 != n && (obj2 == null || !obj2.equals(n))) {
            return false;
        }
        mo19670l(g);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int g = mo19661g(k);
        if (g < 0) {
            return false;
        }
        V n = mo19672n(g);
        if (n != v && (v == null || !v.equals(n))) {
            return false;
        }
        mo19671m(g, v2);
        return true;
    }

    public C5426g(int i) {
        if (i == 0) {
            this.f27683a = C5417c.f27648a;
            this.f27684b = C5417c.f27650c;
        } else {
            m33240b(i);
        }
        this.f27685c = 0;
    }

    public C5426g(C5426g<K, V> gVar) {
        this();
        if (gVar != null) {
            mo19669k(gVar);
        }
    }
}
