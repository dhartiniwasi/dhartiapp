package p106o2;

import p037e2.C4217n;
import p106o2.C5183i0;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5940i0;
import p161w3.C5961r;
import p161w3.C5980z;
import p177z1.C6249m2;

/* renamed from: o2.w */
/* compiled from: PesReader */
public final class C5210w implements C5183i0 {

    /* renamed from: a */
    private final C5193m f27039a;

    /* renamed from: b */
    private final C5980z f27040b = new C5980z(new byte[10]);

    /* renamed from: c */
    private int f27041c = 0;

    /* renamed from: d */
    private int f27042d;

    /* renamed from: e */
    private C5940i0 f27043e;

    /* renamed from: f */
    private boolean f27044f;

    /* renamed from: g */
    private boolean f27045g;

    /* renamed from: h */
    private boolean f27046h;

    /* renamed from: i */
    private int f27047i;

    /* renamed from: j */
    private int f27048j;

    /* renamed from: k */
    private boolean f27049k;

    /* renamed from: l */
    private long f27050l;

    public C5210w(C5193m mVar) {
        this.f27039a = mVar;
    }

    /* renamed from: d */
    private boolean m32357d(C5918a0 a0Var, byte[] bArr, int i) {
        int min = Math.min(a0Var.mo20548a(), i - this.f27042d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            a0Var.mo20547P(min);
        } else {
            a0Var.mo20557j(bArr, this.f27042d, min);
        }
        int i2 = this.f27042d + min;
        this.f27042d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private boolean m32358e() {
        this.f27040b.mo20684p(0);
        int h = this.f27040b.mo20676h(24);
        if (h != 1) {
            C5961r.m35215i("PesReader", "Unexpected start code prefix: " + h);
            this.f27048j = -1;
            return false;
        }
        this.f27040b.mo20686r(8);
        int h2 = this.f27040b.mo20676h(16);
        this.f27040b.mo20686r(5);
        this.f27049k = this.f27040b.mo20675g();
        this.f27040b.mo20686r(2);
        this.f27044f = this.f27040b.mo20675g();
        this.f27045g = this.f27040b.mo20675g();
        this.f27040b.mo20686r(6);
        int h3 = this.f27040b.mo20676h(8);
        this.f27047i = h3;
        if (h2 == 0) {
            this.f27048j = -1;
        } else {
            int i = ((h2 + 6) - 9) - h3;
            this.f27048j = i;
            if (i < 0) {
                C5961r.m35215i("PesReader", "Found negative packet payload size: " + this.f27048j);
                this.f27048j = -1;
            }
        }
        return true;
    }

    /* renamed from: f */
    private void m32359f() {
        this.f27040b.mo20684p(0);
        this.f27050l = -9223372036854775807L;
        if (this.f27044f) {
            this.f27040b.mo20686r(4);
            this.f27040b.mo20686r(1);
            this.f27040b.mo20686r(1);
            long h = (((long) this.f27040b.mo20676h(3)) << 30) | ((long) (this.f27040b.mo20676h(15) << 15)) | ((long) this.f27040b.mo20676h(15));
            this.f27040b.mo20686r(1);
            if (!this.f27046h && this.f27045g) {
                this.f27040b.mo20686r(4);
                this.f27040b.mo20686r(1);
                this.f27040b.mo20686r(1);
                this.f27040b.mo20686r(1);
                this.f27043e.mo20622b((((long) this.f27040b.mo20676h(3)) << 30) | ((long) (this.f27040b.mo20676h(15) << 15)) | ((long) this.f27040b.mo20676h(15)));
                this.f27046h = true;
            }
            this.f27050l = this.f27043e.mo20622b(h);
        }
    }

    /* renamed from: g */
    private void m32360g(int i) {
        this.f27041c = i;
        this.f27042d = 0;
    }

    /* renamed from: a */
    public final void mo19152a(C5918a0 a0Var, int i) throws C6249m2 {
        C5917a.m34875h(this.f27043e);
        if ((i & 1) != 0) {
            int i2 = this.f27041c;
            if (!(i2 == 0 || i2 == 1)) {
                if (i2 == 2) {
                    C5961r.m35215i("PesReader", "Unexpected start indicator reading extended header");
                } else if (i2 == 3) {
                    if (this.f27048j != -1) {
                        C5961r.m35215i("PesReader", "Unexpected start indicator: expected " + this.f27048j + " more bytes");
                    }
                    this.f27039a.mo19149c();
                } else {
                    throw new IllegalStateException();
                }
            }
            m32360g(1);
        }
        while (a0Var.mo20548a() > 0) {
            int i3 = this.f27041c;
            if (i3 != 0) {
                int i4 = 0;
                if (i3 != 1) {
                    if (i3 == 2) {
                        if (m32357d(a0Var, this.f27040b.f29188a, Math.min(10, this.f27047i)) && m32357d(a0Var, (byte[]) null, this.f27047i)) {
                            m32359f();
                            if (this.f27049k) {
                                i4 = 4;
                            }
                            i |= i4;
                            this.f27039a.mo19151e(this.f27050l, i);
                            m32360g(3);
                        }
                    } else if (i3 == 3) {
                        int a = a0Var.mo20548a();
                        int i5 = this.f27048j;
                        if (i5 != -1) {
                            i4 = a - i5;
                        }
                        if (i4 > 0) {
                            a -= i4;
                            a0Var.mo20545N(a0Var.mo20552e() + a);
                        }
                        this.f27039a.mo19147a(a0Var);
                        int i6 = this.f27048j;
                        if (i6 != -1) {
                            int i7 = i6 - a;
                            this.f27048j = i7;
                            if (i7 == 0) {
                                this.f27039a.mo19149c();
                                m32360g(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m32357d(a0Var, this.f27040b.f29188a, 9)) {
                    if (m32358e()) {
                        i4 = 2;
                    }
                    m32360g(i4);
                }
            } else {
                a0Var.mo20547P(a0Var.mo20548a());
            }
        }
    }

    /* renamed from: b */
    public final void mo19153b() {
        this.f27041c = 0;
        this.f27042d = 0;
        this.f27046h = false;
        this.f27039a.mo19148b();
    }

    /* renamed from: c */
    public void mo19154c(C5940i0 i0Var, C4217n nVar, C5183i0.C5187d dVar) {
        this.f27043e = i0Var;
        this.f27039a.mo19150d(nVar, dVar);
    }
}
