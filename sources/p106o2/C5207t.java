package p106o2;

import p014b2.C1635f0;
import p037e2.C4200e0;
import p037e2.C4217n;
import p106o2.C5183i0;
import p161w3.C5917a;
import p161w3.C5918a0;
import p177z1.C6272r1;

/* renamed from: o2.t */
/* compiled from: MpegAudioReader */
public final class C5207t implements C5193m {

    /* renamed from: a */
    private final C5918a0 f27019a;

    /* renamed from: b */
    private final C1635f0.C1636a f27020b;

    /* renamed from: c */
    private final String f27021c;

    /* renamed from: d */
    private C4200e0 f27022d;

    /* renamed from: e */
    private String f27023e;

    /* renamed from: f */
    private int f27024f;

    /* renamed from: g */
    private int f27025g;

    /* renamed from: h */
    private boolean f27026h;

    /* renamed from: i */
    private boolean f27027i;

    /* renamed from: j */
    private long f27028j;

    /* renamed from: k */
    private int f27029k;

    /* renamed from: l */
    private long f27030l;

    public C5207t() {
        this((String) null);
    }

    /* renamed from: f */
    private void m32341f(C5918a0 a0Var) {
        byte[] d = a0Var.mo20551d();
        int f = a0Var.mo20553f();
        for (int e = a0Var.mo20552e(); e < f; e++) {
            boolean z = (d[e] & 255) == 255;
            boolean z2 = this.f27027i && (d[e] & 224) == 224;
            this.f27027i = z;
            if (z2) {
                a0Var.mo20546O(e + 1);
                this.f27027i = false;
                this.f27019a.mo20551d()[1] = d[e];
                this.f27025g = 2;
                this.f27024f = 1;
                return;
            }
        }
        a0Var.mo20546O(f);
    }

    /* renamed from: g */
    private void m32342g(C5918a0 a0Var) {
        int min = Math.min(a0Var.mo20548a(), this.f27029k - this.f27025g);
        this.f27022d.mo6843d(a0Var, min);
        int i = this.f27025g + min;
        this.f27025g = i;
        int i2 = this.f27029k;
        if (i >= i2) {
            long j = this.f27030l;
            if (j != -9223372036854775807L) {
                this.f27022d.mo6838a(j, 1, i2, 0, (C4200e0.C4201a) null);
                this.f27030l += this.f27028j;
            }
            this.f27025g = 0;
            this.f27024f = 0;
        }
    }

    /* renamed from: h */
    private void m32343h(C5918a0 a0Var) {
        int min = Math.min(a0Var.mo20548a(), 4 - this.f27025g);
        a0Var.mo20557j(this.f27019a.mo20551d(), this.f27025g, min);
        int i = this.f27025g + min;
        this.f27025g = i;
        if (i >= 4) {
            this.f27019a.mo20546O(0);
            if (!this.f27020b.mo6511a(this.f27019a.mo20560m())) {
                this.f27025g = 0;
                this.f27024f = 1;
                return;
            }
            C1635f0.C1636a aVar = this.f27020b;
            this.f27029k = aVar.f4695c;
            if (!this.f27026h) {
                this.f27028j = (((long) aVar.f4699g) * 1000000) / ((long) aVar.f4696d);
                this.f27022d.mo6845e(new C6272r1.C6274b().mo21505S(this.f27023e).mo21517e0(this.f27020b.f4694b).mo21509W(4096).mo21494H(this.f27020b.f4697e).mo21518f0(this.f27020b.f4696d).mo21508V(this.f27021c).mo21491E());
                this.f27026h = true;
            }
            this.f27019a.mo20546O(0);
            this.f27022d.mo6843d(this.f27019a, 4);
            this.f27024f = 2;
        }
    }

    /* renamed from: a */
    public void mo19147a(C5918a0 a0Var) {
        C5917a.m34875h(this.f27022d);
        while (a0Var.mo20548a() > 0) {
            int i = this.f27024f;
            if (i == 0) {
                m32341f(a0Var);
            } else if (i == 1) {
                m32343h(a0Var);
            } else if (i == 2) {
                m32342g(a0Var);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: b */
    public void mo19148b() {
        this.f27024f = 0;
        this.f27025g = 0;
        this.f27027i = false;
        this.f27030l = -9223372036854775807L;
    }

    /* renamed from: c */
    public void mo19149c() {
    }

    /* renamed from: d */
    public void mo19150d(C4217n nVar, C5183i0.C5187d dVar) {
        dVar.mo19164a();
        this.f27023e = dVar.mo19165b();
        this.f27022d = nVar.mo6778f(dVar.mo19166c(), 1);
    }

    /* renamed from: e */
    public void mo19151e(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f27030l = j;
        }
    }

    public C5207t(String str) {
        this.f27024f = 0;
        C5918a0 a0Var = new C5918a0(4);
        this.f27019a = a0Var;
        a0Var.mo20551d()[0] = -1;
        this.f27020b = new C1635f0.C1636a();
        this.f27030l = -9223372036854775807L;
        this.f27021c = str;
    }
}
