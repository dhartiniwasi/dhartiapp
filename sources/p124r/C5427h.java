package p124r;

/* renamed from: r.h */
/* compiled from: SparseArrayCompat */
public class C5427h<E> implements Cloneable {

    /* renamed from: e */
    private static final Object f27686e = new Object();

    /* renamed from: a */
    private boolean f27687a;

    /* renamed from: b */
    private int[] f27688b;

    /* renamed from: c */
    private Object[] f27689c;

    /* renamed from: d */
    private int f27690d;

    public C5427h() {
        this(10);
    }

    /* renamed from: d */
    private void m33253d() {
        int i = this.f27690d;
        int[] iArr = this.f27688b;
        Object[] objArr = this.f27689c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f27686e) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f27687a = false;
        this.f27690d = i2;
    }

    /* renamed from: a */
    public void mo19681a(int i, E e) {
        int i2 = this.f27690d;
        if (i2 == 0 || i > this.f27688b[i2 - 1]) {
            if (this.f27687a && i2 >= this.f27688b.length) {
                m33253d();
            }
            int i3 = this.f27690d;
            if (i3 >= this.f27688b.length) {
                int e2 = C5417c.m33196e(i3 + 1);
                int[] iArr = new int[e2];
                Object[] objArr = new Object[e2];
                int[] iArr2 = this.f27688b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f27689c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f27688b = iArr;
                this.f27689c = objArr;
            }
            this.f27688b[i3] = i;
            this.f27689c[i3] = e;
            this.f27690d = i3 + 1;
            return;
        }
        mo19689i(i, e);
    }

    /* renamed from: b */
    public void mo19682b() {
        int i = this.f27690d;
        Object[] objArr = this.f27689c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f27690d = 0;
        this.f27687a = false;
    }

    /* renamed from: c */
    public C5427h<E> clone() {
        try {
            C5427h<E> hVar = (C5427h) super.clone();
            hVar.f27688b = (int[]) this.f27688b.clone();
            hVar.f27689c = (Object[]) this.f27689c.clone();
            return hVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public E mo19685e(int i) {
        return mo19686f(i, (Object) null);
    }

    /* renamed from: f */
    public E mo19686f(int i, E e) {
        int a = C5417c.m33192a(this.f27688b, this.f27690d, i);
        if (a >= 0) {
            E[] eArr = this.f27689c;
            if (eArr[a] != f27686e) {
                return eArr[a];
            }
        }
        return e;
    }

    /* renamed from: g */
    public int mo19687g(E e) {
        if (this.f27687a) {
            m33253d();
        }
        for (int i = 0; i < this.f27690d; i++) {
            if (this.f27689c[i] == e) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public int mo19688h(int i) {
        if (this.f27687a) {
            m33253d();
        }
        return this.f27688b[i];
    }

    /* renamed from: i */
    public void mo19689i(int i, E e) {
        int a = C5417c.m33192a(this.f27688b, this.f27690d, i);
        if (a >= 0) {
            this.f27689c[a] = e;
            return;
        }
        int i2 = ~a;
        int i3 = this.f27690d;
        if (i2 < i3) {
            Object[] objArr = this.f27689c;
            if (objArr[i2] == f27686e) {
                this.f27688b[i2] = i;
                objArr[i2] = e;
                return;
            }
        }
        if (this.f27687a && i3 >= this.f27688b.length) {
            m33253d();
            i2 = ~C5417c.m33192a(this.f27688b, this.f27690d, i);
        }
        int i4 = this.f27690d;
        if (i4 >= this.f27688b.length) {
            int e2 = C5417c.m33196e(i4 + 1);
            int[] iArr = new int[e2];
            Object[] objArr2 = new Object[e2];
            int[] iArr2 = this.f27688b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f27689c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f27688b = iArr;
            this.f27689c = objArr2;
        }
        int i5 = this.f27690d;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f27688b;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f27689c;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f27690d - i2);
        }
        this.f27688b[i2] = i;
        this.f27689c[i2] = e;
        this.f27690d++;
    }

    /* renamed from: j */
    public int mo19690j() {
        if (this.f27687a) {
            m33253d();
        }
        return this.f27690d;
    }

    /* renamed from: k */
    public E mo19691k(int i) {
        if (this.f27687a) {
            m33253d();
        }
        return this.f27689c[i];
    }

    public String toString() {
        if (mo19690j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f27690d * 28);
        sb.append('{');
        for (int i = 0; i < this.f27690d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo19688h(i));
            sb.append('=');
            Object k = mo19691k(i);
            if (k != this) {
                sb.append(k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C5427h(int i) {
        this.f27687a = false;
        if (i == 0) {
            this.f27688b = C5417c.f27648a;
            this.f27689c = C5417c.f27650c;
            return;
        }
        int e = C5417c.m33196e(i);
        this.f27688b = new int[e];
        this.f27689c = new Object[e];
    }
}
