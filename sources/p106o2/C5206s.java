package p106o2;

import java.util.Collections;
import p014b2.C1609a;
import p037e2.C4200e0;
import p037e2.C4217n;
import p106o2.C5183i0;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5980z;
import p177z1.C6249m2;
import p177z1.C6272r1;

/* renamed from: o2.s */
/* compiled from: LatmReader */
public final class C5206s implements C5193m {

    /* renamed from: a */
    private final String f26998a;

    /* renamed from: b */
    private final C5918a0 f26999b;

    /* renamed from: c */
    private final C5980z f27000c;

    /* renamed from: d */
    private C4200e0 f27001d;

    /* renamed from: e */
    private String f27002e;

    /* renamed from: f */
    private C6272r1 f27003f;

    /* renamed from: g */
    private int f27004g;

    /* renamed from: h */
    private int f27005h;

    /* renamed from: i */
    private int f27006i;

    /* renamed from: j */
    private int f27007j;

    /* renamed from: k */
    private long f27008k = -9223372036854775807L;

    /* renamed from: l */
    private boolean f27009l;

    /* renamed from: m */
    private int f27010m;

    /* renamed from: n */
    private int f27011n;

    /* renamed from: o */
    private int f27012o;

    /* renamed from: p */
    private boolean f27013p;

    /* renamed from: q */
    private long f27014q;

    /* renamed from: r */
    private int f27015r;

    /* renamed from: s */
    private long f27016s;

    /* renamed from: t */
    private int f27017t;

    /* renamed from: u */
    private String f27018u;

    public C5206s(String str) {
        this.f26998a = str;
        C5918a0 a0Var = new C5918a0(1024);
        this.f26999b = a0Var;
        this.f27000c = new C5980z(a0Var.mo20551d());
    }

    /* renamed from: f */
    private static long m32328f(C5980z zVar) {
        return (long) zVar.mo20676h((zVar.mo20676h(2) + 1) * 8);
    }

    /* renamed from: g */
    private void m32329g(C5980z zVar) throws C6249m2 {
        if (!zVar.mo20675g()) {
            this.f27009l = true;
            m32334l(zVar);
        } else if (!this.f27009l) {
            return;
        }
        if (this.f27010m != 0) {
            throw C6249m2.m36661a((String) null, (Throwable) null);
        } else if (this.f27011n == 0) {
            m32333k(zVar, m32332j(zVar));
            if (this.f27013p) {
                zVar.mo20686r((int) this.f27014q);
            }
        } else {
            throw C6249m2.m36661a((String) null, (Throwable) null);
        }
    }

    /* renamed from: h */
    private int m32330h(C5980z zVar) throws C6249m2 {
        int b = zVar.mo20670b();
        C1609a.C1611b e = C1609a.m7405e(zVar, true);
        this.f27018u = e.f4616c;
        this.f27015r = e.f4614a;
        this.f27017t = e.f4615b;
        return b - zVar.mo20670b();
    }

    /* renamed from: i */
    private void m32331i(C5980z zVar) {
        int h = zVar.mo20676h(3);
        this.f27012o = h;
        if (h == 0) {
            zVar.mo20686r(8);
        } else if (h == 1) {
            zVar.mo20686r(9);
        } else if (h == 3 || h == 4 || h == 5) {
            zVar.mo20686r(6);
        } else if (h == 6 || h == 7) {
            zVar.mo20686r(1);
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: j */
    private int m32332j(C5980z zVar) throws C6249m2 {
        int h;
        if (this.f27012o == 0) {
            int i = 0;
            do {
                h = zVar.mo20676h(8);
                i += h;
            } while (h == 255);
            return i;
        }
        throw C6249m2.m36661a((String) null, (Throwable) null);
    }

    /* renamed from: k */
    private void m32333k(C5980z zVar, int i) {
        int e = zVar.mo20673e();
        if ((e & 7) == 0) {
            this.f26999b.mo20546O(e >> 3);
        } else {
            zVar.mo20677i(this.f26999b.mo20551d(), 0, i * 8);
            this.f26999b.mo20546O(0);
        }
        this.f27001d.mo6843d(this.f26999b, i);
        long j = this.f27008k;
        if (j != -9223372036854775807L) {
            this.f27001d.mo6838a(j, 1, i, 0, (C4200e0.C4201a) null);
            this.f27008k += this.f27016s;
        }
    }

    /* renamed from: l */
    private void m32334l(C5980z zVar) throws C6249m2 {
        boolean g;
        int h = zVar.mo20676h(1);
        int h2 = h == 1 ? zVar.mo20676h(1) : 0;
        this.f27010m = h2;
        if (h2 == 0) {
            if (h == 1) {
                m32328f(zVar);
            }
            if (zVar.mo20675g()) {
                this.f27011n = zVar.mo20676h(6);
                int h3 = zVar.mo20676h(4);
                int h4 = zVar.mo20676h(3);
                if (h3 == 0 && h4 == 0) {
                    if (h == 0) {
                        int e = zVar.mo20673e();
                        int h5 = m32330h(zVar);
                        zVar.mo20684p(e);
                        byte[] bArr = new byte[((h5 + 7) / 8)];
                        zVar.mo20677i(bArr, 0, h5);
                        C6272r1 E = new C6272r1.C6274b().mo21505S(this.f27002e).mo21517e0("audio/mp4a-latm").mo21495I(this.f27018u).mo21494H(this.f27017t).mo21518f0(this.f27015r).mo21506T(Collections.singletonList(bArr)).mo21508V(this.f26998a).mo21491E();
                        if (!E.equals(this.f27003f)) {
                            this.f27003f = E;
                            this.f27016s = 1024000000 / ((long) E.f30225H);
                            this.f27001d.mo6845e(E);
                        }
                    } else {
                        zVar.mo20686r(((int) m32328f(zVar)) - m32330h(zVar));
                    }
                    m32331i(zVar);
                    boolean g2 = zVar.mo20675g();
                    this.f27013p = g2;
                    this.f27014q = 0;
                    if (g2) {
                        if (h == 1) {
                            this.f27014q = m32328f(zVar);
                        } else {
                            do {
                                g = zVar.mo20675g();
                                this.f27014q = (this.f27014q << 8) + ((long) zVar.mo20676h(8));
                            } while (g);
                        }
                    }
                    if (zVar.mo20675g()) {
                        zVar.mo20686r(8);
                        return;
                    }
                    return;
                }
                throw C6249m2.m36661a((String) null, (Throwable) null);
            }
            throw C6249m2.m36661a((String) null, (Throwable) null);
        }
        throw C6249m2.m36661a((String) null, (Throwable) null);
    }

    /* renamed from: m */
    private void m32335m(int i) {
        this.f26999b.mo20542K(i);
        this.f27000c.mo20682n(this.f26999b.mo20551d());
    }

    /* renamed from: a */
    public void mo19147a(C5918a0 a0Var) throws C6249m2 {
        C5917a.m34875h(this.f27001d);
        while (a0Var.mo20548a() > 0) {
            int i = this.f27004g;
            if (i != 0) {
                if (i == 1) {
                    int C = a0Var.mo20534C();
                    if ((C & 224) == 224) {
                        this.f27007j = C;
                        this.f27004g = 2;
                    } else if (C != 86) {
                        this.f27004g = 0;
                    }
                } else if (i == 2) {
                    int C2 = ((this.f27007j & -225) << 8) | a0Var.mo20534C();
                    this.f27006i = C2;
                    if (C2 > this.f26999b.mo20551d().length) {
                        m32335m(this.f27006i);
                    }
                    this.f27005h = 0;
                    this.f27004g = 3;
                } else if (i == 3) {
                    int min = Math.min(a0Var.mo20548a(), this.f27006i - this.f27005h);
                    a0Var.mo20557j(this.f27000c.f29188a, this.f27005h, min);
                    int i2 = this.f27005h + min;
                    this.f27005h = i2;
                    if (i2 == this.f27006i) {
                        this.f27000c.mo20684p(0);
                        m32329g(this.f27000c);
                        this.f27004g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (a0Var.mo20534C() == 86) {
                this.f27004g = 1;
            }
        }
    }

    /* renamed from: b */
    public void mo19148b() {
        this.f27004g = 0;
        this.f27008k = -9223372036854775807L;
        this.f27009l = false;
    }

    /* renamed from: c */
    public void mo19149c() {
    }

    /* renamed from: d */
    public void mo19150d(C4217n nVar, C5183i0.C5187d dVar) {
        dVar.mo19164a();
        this.f27001d = nVar.mo6778f(dVar.mo19166c(), 1);
        this.f27002e = dVar.mo19165b();
    }

    /* renamed from: e */
    public void mo19151e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f27008k = j;
        }
    }
}
