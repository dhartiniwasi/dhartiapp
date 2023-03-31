package p124r;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: r.b */
/* compiled from: ArraySet */
public final class C5415b<E> implements Collection<E>, Set<E> {

    /* renamed from: e */
    private static final int[] f27637e = new int[0];

    /* renamed from: f */
    private static final Object[] f27638f = new Object[0];

    /* renamed from: g */
    private static Object[] f27639g;

    /* renamed from: h */
    private static int f27640h;

    /* renamed from: i */
    private static Object[] f27641i;

    /* renamed from: r */
    private static int f27642r;

    /* renamed from: a */
    private int[] f27643a;

    /* renamed from: b */
    Object[] f27644b;

    /* renamed from: c */
    int f27645c;

    /* renamed from: d */
    private C5420f<E, E> f27646d;

    /* renamed from: r.b$a */
    /* compiled from: ArraySet */
    class C5416a extends C5420f<E, E> {
        C5416a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo19541a() {
            C5415b.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo19542b(int i, int i2) {
            return C5415b.this.f27644b[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<E, E> mo19543c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public int mo19544d() {
            return C5415b.this.f27645c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo19545e(Object obj) {
            return C5415b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo19546f(Object obj) {
            return C5415b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo19547g(E e, E e2) {
            C5415b.this.add(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo19548h(int i) {
            C5415b.this.mo19561l(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public E mo19549i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C5415b() {
        this(0);
    }

    /* renamed from: b */
    private void m33175b(int i) {
        if (i == 8) {
            synchronized (C5415b.class) {
                Object[] objArr = f27641i;
                if (objArr != null) {
                    this.f27644b = objArr;
                    f27641i = (Object[]) objArr[0];
                    this.f27643a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f27642r--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C5415b.class) {
                Object[] objArr2 = f27639g;
                if (objArr2 != null) {
                    this.f27644b = objArr2;
                    f27639g = (Object[]) objArr2[0];
                    this.f27643a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f27640h--;
                    return;
                }
            }
        }
        this.f27643a = new int[i];
        this.f27644b = new Object[i];
    }

    /* renamed from: f */
    private static void m33176f(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C5415b.class) {
                if (f27642r < 10) {
                    objArr[0] = f27641i;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f27641i = objArr;
                    f27642r++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C5415b.class) {
                if (f27640h < 10) {
                    objArr[0] = f27639g;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f27639g = objArr;
                    f27640h++;
                }
            }
        }
    }

    /* renamed from: i */
    private C5420f<E, E> m33177i() {
        if (this.f27646d == null) {
            this.f27646d = new C5416a();
        }
        return this.f27646d;
    }

    /* renamed from: j */
    private int m33178j(Object obj, int i) {
        int i2 = this.f27645c;
        if (i2 == 0) {
            return -1;
        }
        int a = C5417c.m33192a(this.f27643a, i2, i);
        if (a < 0 || obj.equals(this.f27644b[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f27643a[i3] == i) {
            if (obj.equals(this.f27644b[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f27643a[i4] == i) {
            if (obj.equals(this.f27644b[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: k */
    private int m33179k() {
        int i = this.f27645c;
        if (i == 0) {
            return -1;
        }
        int a = C5417c.m33192a(this.f27643a, i, 0);
        if (a < 0 || this.f27644b[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f27643a[i2] == 0) {
            if (this.f27644b[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f27643a[i3] == 0) {
            if (this.f27644b[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m33179k();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m33178j(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f27645c;
        int[] iArr = this.f27643a;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f27644b;
            m33175b(i5);
            int[] iArr2 = this.f27643a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f27644b, 0, objArr.length);
            }
            m33176f(iArr, objArr, this.f27645c);
        }
        int i6 = this.f27645c;
        if (i3 < i6) {
            int[] iArr3 = this.f27643a;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f27644b;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f27645c - i3);
        }
        this.f27643a[i3] = i;
        this.f27644b[i3] = e;
        this.f27645c++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo19552c(this.f27645c + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    /* renamed from: c */
    public void mo19552c(int i) {
        int[] iArr = this.f27643a;
        if (iArr.length < i) {
            Object[] objArr = this.f27644b;
            m33175b(i);
            int i2 = this.f27645c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f27643a, 0, i2);
                System.arraycopy(objArr, 0, this.f27644b, 0, this.f27645c);
            }
            m33176f(iArr, objArr, this.f27645c);
        }
    }

    public void clear() {
        int i = this.f27645c;
        if (i != 0) {
            m33176f(this.f27643a, this.f27644b, i);
            this.f27643a = f27637e;
            this.f27644b = f27638f;
            this.f27645c = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f27645c) {
                try {
                    if (!set.contains(mo19562o(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f27643a;
        int i = this.f27645c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m33179k() : m33178j(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f27645c <= 0;
    }

    public Iterator<E> iterator() {
        return m33177i().mo19594m().iterator();
    }

    /* renamed from: l */
    public E mo19561l(int i) {
        E[] eArr = this.f27644b;
        E e = eArr[i];
        int i2 = this.f27645c;
        if (i2 <= 1) {
            m33176f(this.f27643a, eArr, i2);
            this.f27643a = f27637e;
            this.f27644b = f27638f;
            this.f27645c = 0;
        } else {
            int[] iArr = this.f27643a;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.f27645c = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr = this.f27644b;
                    System.arraycopy(objArr, i5, objArr, i, this.f27645c - i);
                }
                this.f27644b[this.f27645c] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                m33175b(i3);
                this.f27645c--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f27643a, 0, i);
                    System.arraycopy(eArr, 0, this.f27644b, 0, i);
                }
                int i6 = this.f27645c;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.f27643a, i, i6 - i);
                    System.arraycopy(eArr, i7, this.f27644b, i, this.f27645c - i);
                }
            }
        }
        return e;
    }

    /* renamed from: o */
    public E mo19562o(int i) {
        return this.f27644b[i];
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo19561l(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f27645c - 1; i >= 0; i--) {
            if (!collection.contains(this.f27644b[i])) {
                mo19561l(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f27645c;
    }

    public Object[] toArray() {
        int i = this.f27645c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f27644b, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f27645c * 14);
        sb.append('{');
        for (int i = 0; i < this.f27645c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object o = mo19562o(i);
            if (o != this) {
                sb.append(o);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C5415b(int i) {
        if (i == 0) {
            this.f27643a = f27637e;
            this.f27644b = f27638f;
        } else {
            m33175b(i);
        }
        this.f27645c = 0;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f27645c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f27645c);
        }
        System.arraycopy(this.f27644b, 0, tArr, 0, this.f27645c);
        int length = tArr.length;
        int i = this.f27645c;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
