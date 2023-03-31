package p124r;

/* renamed from: r.d */
/* compiled from: LongSparseArray */
public class C5418d<E> implements Cloneable {

    /* renamed from: e */
    private static final Object f27651e = new Object();

    /* renamed from: a */
    private boolean f27652a;

    /* renamed from: b */
    private long[] f27653b;

    /* renamed from: c */
    private Object[] f27654c;

    /* renamed from: d */
    private int f27655d;

    public C5418d() {
        this(10);
    }

    /* renamed from: d */
    private void m33198d() {
        int i = this.f27655d;
        long[] jArr = this.f27653b;
        Object[] objArr = this.f27654c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f27651e) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f27652a = false;
        this.f27655d = i2;
    }

    /* renamed from: a */
    public void mo19570a(long j, E e) {
        int i = this.f27655d;
        if (i == 0 || j > this.f27653b[i - 1]) {
            if (this.f27652a && i >= this.f27653b.length) {
                m33198d();
            }
            int i2 = this.f27655d;
            if (i2 >= this.f27653b.length) {
                int f = C5417c.m33197f(i2 + 1);
                long[] jArr = new long[f];
                Object[] objArr = new Object[f];
                long[] jArr2 = this.f27653b;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f27654c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f27653b = jArr;
                this.f27654c = objArr;
            }
            this.f27653b[i2] = j;
            this.f27654c[i2] = e;
            this.f27655d = i2 + 1;
            return;
        }
        mo19578i(j, e);
    }

    /* renamed from: b */
    public void mo19571b() {
        int i = this.f27655d;
        Object[] objArr = this.f27654c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f27655d = 0;
        this.f27652a = false;
    }

    /* renamed from: c */
    public C5418d<E> clone() {
        try {
            C5418d<E> dVar = (C5418d) super.clone();
            dVar.f27653b = (long[]) this.f27653b.clone();
            dVar.f27654c = (Object[]) this.f27654c.clone();
            return dVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: e */
    public E mo19574e(long j) {
        return mo19575f(j, (Object) null);
    }

    /* renamed from: f */
    public E mo19575f(long j, E e) {
        int b = C5417c.m33193b(this.f27653b, this.f27655d, j);
        if (b >= 0) {
            E[] eArr = this.f27654c;
            if (eArr[b] != f27651e) {
                return eArr[b];
            }
        }
        return e;
    }

    /* renamed from: g */
    public int mo19576g(long j) {
        if (this.f27652a) {
            m33198d();
        }
        return C5417c.m33193b(this.f27653b, this.f27655d, j);
    }

    /* renamed from: h */
    public long mo19577h(int i) {
        if (this.f27652a) {
            m33198d();
        }
        return this.f27653b[i];
    }

    /* renamed from: i */
    public void mo19578i(long j, E e) {
        int b = C5417c.m33193b(this.f27653b, this.f27655d, j);
        if (b >= 0) {
            this.f27654c[b] = e;
            return;
        }
        int i = ~b;
        int i2 = this.f27655d;
        if (i < i2) {
            Object[] objArr = this.f27654c;
            if (objArr[i] == f27651e) {
                this.f27653b[i] = j;
                objArr[i] = e;
                return;
            }
        }
        if (this.f27652a && i2 >= this.f27653b.length) {
            m33198d();
            i = ~C5417c.m33193b(this.f27653b, this.f27655d, j);
        }
        int i3 = this.f27655d;
        if (i3 >= this.f27653b.length) {
            int f = C5417c.m33197f(i3 + 1);
            long[] jArr = new long[f];
            Object[] objArr2 = new Object[f];
            long[] jArr2 = this.f27653b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f27654c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f27653b = jArr;
            this.f27654c = objArr2;
        }
        int i4 = this.f27655d;
        if (i4 - i != 0) {
            long[] jArr3 = this.f27653b;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f27654c;
            System.arraycopy(objArr4, i, objArr4, i5, this.f27655d - i);
        }
        this.f27653b[i] = j;
        this.f27654c[i] = e;
        this.f27655d++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r4 = r2.f27654c;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19579j(long r3) {
        /*
            r2 = this;
            long[] r0 = r2.f27653b
            int r1 = r2.f27655d
            int r3 = p124r.C5417c.m33193b(r0, r1, r3)
            if (r3 < 0) goto L_0x0017
            java.lang.Object[] r4 = r2.f27654c
            r0 = r4[r3]
            java.lang.Object r1 = f27651e
            if (r0 == r1) goto L_0x0017
            r4[r3] = r1
            r3 = 1
            r2.f27652a = r3
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p124r.C5418d.mo19579j(long):void");
    }

    /* renamed from: k */
    public void mo19580k(int i) {
        Object[] objArr = this.f27654c;
        Object obj = objArr[i];
        Object obj2 = f27651e;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f27652a = true;
        }
    }

    /* renamed from: l */
    public int mo19581l() {
        if (this.f27652a) {
            m33198d();
        }
        return this.f27655d;
    }

    /* renamed from: m */
    public E mo19582m(int i) {
        if (this.f27652a) {
            m33198d();
        }
        return this.f27654c[i];
    }

    public String toString() {
        if (mo19581l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f27655d * 28);
        sb.append('{');
        for (int i = 0; i < this.f27655d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(mo19577h(i));
            sb.append('=');
            Object m = mo19582m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C5418d(int i) {
        this.f27652a = false;
        if (i == 0) {
            this.f27653b = C5417c.f27649b;
            this.f27654c = C5417c.f27650c;
            return;
        }
        int f = C5417c.m33197f(i);
        this.f27653b = new long[f];
        this.f27654c = new Object[f];
    }
}
