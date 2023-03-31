package p106o2;

import p014b2.C1613b;
import p037e2.C4200e0;
import p037e2.C4217n;
import p106o2.C5183i0;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5953m0;
import p161w3.C5980z;
import p177z1.C6272r1;

/* renamed from: o2.c */
/* compiled from: Ac3Reader */
public final class C5170c implements C5193m {

    /* renamed from: a */
    private final C5980z f26723a;

    /* renamed from: b */
    private final C5918a0 f26724b;

    /* renamed from: c */
    private final String f26725c;

    /* renamed from: d */
    private String f26726d;

    /* renamed from: e */
    private C4200e0 f26727e;

    /* renamed from: f */
    private int f26728f;

    /* renamed from: g */
    private int f26729g;

    /* renamed from: h */
    private boolean f26730h;

    /* renamed from: i */
    private long f26731i;

    /* renamed from: j */
    private C6272r1 f26732j;

    /* renamed from: k */
    private int f26733k;

    /* renamed from: l */
    private long f26734l;

    public C5170c() {
        this((String) null);
    }

    /* renamed from: f */
    private boolean m32112f(C5918a0 a0Var, byte[] bArr, int i) {
        int min = Math.min(a0Var.mo20548a(), i - this.f26729g);
        a0Var.mo20557j(bArr, this.f26729g, min);
        int i2 = this.f26729g + min;
        this.f26729g = i2;
        return i2 == i;
    }

    /* renamed from: g */
    private void m32113g() {
        this.f26723a.mo20684p(0);
        C1613b.C1615b e = C1613b.m7412e(this.f26723a);
        C6272r1 r1Var = this.f26732j;
        if (r1Var == null || e.f4627d != r1Var.f30224G || e.f4626c != r1Var.f30225H || !C5953m0.m35124c(e.f4624a, r1Var.f30243t)) {
            C6272r1 E = new C6272r1.C6274b().mo21505S(this.f26726d).mo21517e0(e.f4624a).mo21494H(e.f4627d).mo21518f0(e.f4626c).mo21508V(this.f26725c).mo21491E();
            this.f26732j = E;
            this.f26727e.mo6845e(E);
        }
        this.f26733k = e.f4628e;
        this.f26731i = (((long) e.f4629f) * 1000000) / ((long) this.f26732j.f30225H);
    }

    /* renamed from: h */
    private boolean m32114h(C5918a0 a0Var) {
        while (true) {
            boolean z = false;
            if (a0Var.mo20548a() <= 0) {
                return false;
            }
            if (!this.f26730h) {
                if (a0Var.mo20534C() == 11) {
                    z = true;
                }
                this.f26730h = z;
            } else {
                int C = a0Var.mo20534C();
                if (C == 119) {
                    this.f26730h = false;
                    return true;
                }
                if (C == 11) {
                    z = true;
                }
                this.f26730h = z;
            }
        }
    }

    /* renamed from: a */
    public void mo19147a(C5918a0 a0Var) {
        C5917a.m34875h(this.f26727e);
        while (a0Var.mo20548a() > 0) {
            int i = this.f26728f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(a0Var.mo20548a(), this.f26733k - this.f26729g);
                        this.f26727e.mo6843d(a0Var, min);
                        int i2 = this.f26729g + min;
                        this.f26729g = i2;
                        int i3 = this.f26733k;
                        if (i2 == i3) {
                            long j = this.f26734l;
                            if (j != -9223372036854775807L) {
                                this.f26727e.mo6838a(j, 1, i3, 0, (C4200e0.C4201a) null);
                                this.f26734l += this.f26731i;
                            }
                            this.f26728f = 0;
                        }
                    }
                } else if (m32112f(a0Var, this.f26724b.mo20551d(), 128)) {
                    m32113g();
                    this.f26724b.mo20546O(0);
                    this.f26727e.mo6843d(this.f26724b, 128);
                    this.f26728f = 2;
                }
            } else if (m32114h(a0Var)) {
                this.f26728f = 1;
                this.f26724b.mo20551d()[0] = 11;
                this.f26724b.mo20551d()[1] = 119;
                this.f26729g = 2;
            }
        }
    }

    /* renamed from: b */
    public void mo19148b() {
        this.f26728f = 0;
        this.f26729g = 0;
        this.f26730h = false;
        this.f26734l = -9223372036854775807L;
    }

    /* renamed from: c */
    public void mo19149c() {
    }

    /* renamed from: d */
    public void mo19150d(C4217n nVar, C5183i0.C5187d dVar) {
        dVar.mo19164a();
        this.f26726d = dVar.mo19165b();
        this.f26727e = nVar.mo6778f(dVar.mo19166c(), 1);
    }

    /* renamed from: e */
    public void mo19151e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f26734l = j;
        }
    }

    public C5170c(String str) {
        C5980z zVar = new C5980z(new byte[128]);
        this.f26723a = zVar;
        this.f26724b = new C5918a0(zVar.f29188a);
        this.f26728f = 0;
        this.f26734l = -9223372036854775807L;
        this.f26725c = str;
    }
}
