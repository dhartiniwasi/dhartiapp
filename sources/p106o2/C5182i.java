package p106o2;

import java.util.Arrays;
import java.util.Collections;
import p014b2.C1609a;
import p037e2.C4200e0;
import p037e2.C4214k;
import p037e2.C4217n;
import p106o2.C5183i0;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5961r;
import p161w3.C5980z;
import p177z1.C6249m2;
import p177z1.C6272r1;

/* renamed from: o2.i */
/* compiled from: AdtsReader */
public final class C5182i implements C5193m {

    /* renamed from: v */
    private static final byte[] f26813v = {73, 68, 51};

    /* renamed from: a */
    private final boolean f26814a;

    /* renamed from: b */
    private final C5980z f26815b;

    /* renamed from: c */
    private final C5918a0 f26816c;

    /* renamed from: d */
    private final String f26817d;

    /* renamed from: e */
    private String f26818e;

    /* renamed from: f */
    private C4200e0 f26819f;

    /* renamed from: g */
    private C4200e0 f26820g;

    /* renamed from: h */
    private int f26821h;

    /* renamed from: i */
    private int f26822i;

    /* renamed from: j */
    private int f26823j;

    /* renamed from: k */
    private boolean f26824k;

    /* renamed from: l */
    private boolean f26825l;

    /* renamed from: m */
    private int f26826m;

    /* renamed from: n */
    private int f26827n;

    /* renamed from: o */
    private int f26828o;

    /* renamed from: p */
    private boolean f26829p;

    /* renamed from: q */
    private long f26830q;

    /* renamed from: r */
    private int f26831r;

    /* renamed from: s */
    private long f26832s;

    /* renamed from: t */
    private C4200e0 f26833t;

    /* renamed from: u */
    private long f26834u;

    public C5182i(boolean z) {
        this(z, (String) null);
    }

    /* renamed from: f */
    private void m32196f() {
        C5917a.m34872e(this.f26819f);
        C5953m0.m35138j(this.f26833t);
        C5953m0.m35138j(this.f26820g);
    }

    /* renamed from: g */
    private void m32197g(C5918a0 a0Var) {
        if (a0Var.mo20548a() != 0) {
            this.f26815b.f29188a[0] = a0Var.mo20551d()[a0Var.mo20552e()];
            this.f26815b.mo20684p(2);
            int h = this.f26815b.mo20676h(4);
            int i = this.f26827n;
            if (i == -1 || h == i) {
                if (!this.f26825l) {
                    this.f26825l = true;
                    this.f26826m = this.f26828o;
                    this.f26827n = h;
                }
                m32209t();
                return;
            }
            m32206q();
        }
    }

    /* renamed from: h */
    private boolean m32198h(C5918a0 a0Var, int i) {
        a0Var.mo20546O(i + 1);
        if (!m32212w(a0Var, this.f26815b.f29188a, 1)) {
            return false;
        }
        this.f26815b.mo20684p(4);
        int h = this.f26815b.mo20676h(1);
        int i2 = this.f26826m;
        if (i2 != -1 && h != i2) {
            return false;
        }
        if (this.f26827n != -1) {
            if (!m32212w(a0Var, this.f26815b.f29188a, 1)) {
                return true;
            }
            this.f26815b.mo20684p(2);
            if (this.f26815b.mo20676h(4) != this.f26827n) {
                return false;
            }
            a0Var.mo20546O(i + 2);
        }
        if (!m32212w(a0Var, this.f26815b.f29188a, 4)) {
            return true;
        }
        this.f26815b.mo20684p(14);
        int h2 = this.f26815b.mo20676h(13);
        if (h2 < 7) {
            return false;
        }
        byte[] d = a0Var.mo20551d();
        int f = a0Var.mo20553f();
        int i3 = i + h2;
        if (i3 >= f) {
            return true;
        }
        if (d[i3] == -1) {
            int i4 = i3 + 1;
            if (i4 == f) {
                return true;
            }
            if (!m32201l((byte) -1, d[i4]) || ((d[i4] & 8) >> 3) != h) {
                return false;
            }
            return true;
        } else if (d[i3] != 73) {
            return false;
        } else {
            int i5 = i3 + 1;
            if (i5 == f) {
                return true;
            }
            if (d[i5] != 68) {
                return false;
            }
            int i6 = i3 + 2;
            if (i6 == f || d[i6] == 51) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: i */
    private boolean m32199i(C5918a0 a0Var, byte[] bArr, int i) {
        int min = Math.min(a0Var.mo20548a(), i - this.f26822i);
        a0Var.mo20557j(bArr, this.f26822i, min);
        int i2 = this.f26822i + min;
        this.f26822i = i2;
        return i2 == i;
    }

    /* renamed from: j */
    private void m32200j(C5918a0 a0Var) {
        byte[] d = a0Var.mo20551d();
        int e = a0Var.mo20552e();
        int f = a0Var.mo20553f();
        while (e < f) {
            int i = e + 1;
            byte b = d[e] & 255;
            if (this.f26823j != 512 || !m32201l((byte) -1, (byte) b) || (!this.f26825l && !m32198h(a0Var, i - 2))) {
                int i2 = this.f26823j;
                byte b2 = b | i2;
                if (b2 == 329) {
                    this.f26823j = 768;
                } else if (b2 == 511) {
                    this.f26823j = 512;
                } else if (b2 == 836) {
                    this.f26823j = 1024;
                } else if (b2 == 1075) {
                    m32210u();
                    a0Var.mo20546O(i);
                    return;
                } else if (i2 != 256) {
                    this.f26823j = 256;
                    i--;
                }
                e = i;
            } else {
                this.f26828o = (b & 8) >> 3;
                boolean z = true;
                if ((b & 1) != 0) {
                    z = false;
                }
                this.f26824k = z;
                if (!this.f26825l) {
                    m32207r();
                } else {
                    m32209t();
                }
                a0Var.mo20546O(i);
                return;
            }
        }
        a0Var.mo20546O(e);
    }

    /* renamed from: l */
    private boolean m32201l(byte b, byte b2) {
        return m32202m(((b & 255) << 8) | (b2 & 255));
    }

    /* renamed from: m */
    public static boolean m32202m(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: n */
    private void m32203n() throws C6249m2 {
        this.f26815b.mo20684p(0);
        if (!this.f26829p) {
            int h = this.f26815b.mo20676h(2) + 1;
            if (h != 2) {
                C5961r.m35215i("AdtsReader", "Detected audio object type: " + h + ", but assuming AAC LC.");
                h = 2;
            }
            this.f26815b.mo20686r(5);
            byte[] b = C1609a.m7402b(h, this.f26827n, this.f26815b.mo20676h(3));
            C1609a.C1611b f = C1609a.m7406f(b);
            C6272r1 E = new C6272r1.C6274b().mo21505S(this.f26818e).mo21517e0("audio/mp4a-latm").mo21495I(f.f4616c).mo21494H(f.f4615b).mo21518f0(f.f4614a).mo21506T(Collections.singletonList(b)).mo21508V(this.f26817d).mo21491E();
            this.f26830q = 1024000000 / ((long) E.f30225H);
            this.f26819f.mo6845e(E);
            this.f26829p = true;
        } else {
            this.f26815b.mo20686r(10);
        }
        this.f26815b.mo20686r(4);
        int h2 = (this.f26815b.mo20676h(13) - 2) - 5;
        if (this.f26824k) {
            h2 -= 2;
        }
        m32211v(this.f26819f, this.f26830q, 0, h2);
    }

    /* renamed from: o */
    private void m32204o() {
        this.f26820g.mo6843d(this.f26816c, 10);
        this.f26816c.mo20546O(6);
        m32211v(this.f26820g, 0, 10, this.f26816c.mo20533B() + 10);
    }

    /* renamed from: p */
    private void m32205p(C5918a0 a0Var) {
        int min = Math.min(a0Var.mo20548a(), this.f26831r - this.f26822i);
        this.f26833t.mo6843d(a0Var, min);
        int i = this.f26822i + min;
        this.f26822i = i;
        int i2 = this.f26831r;
        if (i == i2) {
            long j = this.f26832s;
            if (j != -9223372036854775807L) {
                this.f26833t.mo6838a(j, 1, i2, 0, (C4200e0.C4201a) null);
                this.f26832s += this.f26834u;
            }
            m32208s();
        }
    }

    /* renamed from: q */
    private void m32206q() {
        this.f26825l = false;
        m32208s();
    }

    /* renamed from: r */
    private void m32207r() {
        this.f26821h = 1;
        this.f26822i = 0;
    }

    /* renamed from: s */
    private void m32208s() {
        this.f26821h = 0;
        this.f26822i = 0;
        this.f26823j = 256;
    }

    /* renamed from: t */
    private void m32209t() {
        this.f26821h = 3;
        this.f26822i = 0;
    }

    /* renamed from: u */
    private void m32210u() {
        this.f26821h = 2;
        this.f26822i = f26813v.length;
        this.f26831r = 0;
        this.f26816c.mo20546O(0);
    }

    /* renamed from: v */
    private void m32211v(C4200e0 e0Var, long j, int i, int i2) {
        this.f26821h = 4;
        this.f26822i = i;
        this.f26833t = e0Var;
        this.f26834u = j;
        this.f26831r = i2;
    }

    /* renamed from: w */
    private boolean m32212w(C5918a0 a0Var, byte[] bArr, int i) {
        if (a0Var.mo20548a() < i) {
            return false;
        }
        a0Var.mo20557j(bArr, 0, i);
        return true;
    }

    /* renamed from: a */
    public void mo19147a(C5918a0 a0Var) throws C6249m2 {
        m32196f();
        while (a0Var.mo20548a() > 0) {
            int i = this.f26821h;
            if (i == 0) {
                m32200j(a0Var);
            } else if (i == 1) {
                m32197g(a0Var);
            } else if (i != 2) {
                if (i == 3) {
                    if (m32199i(a0Var, this.f26815b.f29188a, this.f26824k ? 7 : 5)) {
                        m32203n();
                    }
                } else if (i == 4) {
                    m32205p(a0Var);
                } else {
                    throw new IllegalStateException();
                }
            } else if (m32199i(a0Var, this.f26816c.mo20551d(), 10)) {
                m32204o();
            }
        }
    }

    /* renamed from: b */
    public void mo19148b() {
        this.f26832s = -9223372036854775807L;
        m32206q();
    }

    /* renamed from: c */
    public void mo19149c() {
    }

    /* renamed from: d */
    public void mo19150d(C4217n nVar, C5183i0.C5187d dVar) {
        dVar.mo19164a();
        this.f26818e = dVar.mo19165b();
        C4200e0 f = nVar.mo6778f(dVar.mo19166c(), 1);
        this.f26819f = f;
        this.f26833t = f;
        if (this.f26814a) {
            dVar.mo19164a();
            C4200e0 f2 = nVar.mo6778f(dVar.mo19166c(), 5);
            this.f26820g = f2;
            f2.mo6845e(new C6272r1.C6274b().mo21505S(dVar.mo19165b()).mo21517e0("application/id3").mo21491E());
            return;
        }
        this.f26820g = new C4214k();
    }

    /* renamed from: e */
    public void mo19151e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f26832s = j;
        }
    }

    /* renamed from: k */
    public long mo19161k() {
        return this.f26830q;
    }

    public C5182i(boolean z, String str) {
        this.f26815b = new C5980z(new byte[7]);
        this.f26816c = new C5918a0(Arrays.copyOf(f26813v, 10));
        m32208s();
        this.f26826m = -1;
        this.f26827n = -1;
        this.f26830q = -9223372036854775807L;
        this.f26832s = -9223372036854775807L;
        this.f26814a = z;
        this.f26817d = str;
    }
}
