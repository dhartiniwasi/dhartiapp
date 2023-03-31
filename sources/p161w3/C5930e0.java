package p161w3;

import p177z1.C6280t2;

/* renamed from: w3.e0 */
/* compiled from: StandaloneMediaClock */
public final class C5930e0 implements C5965t {

    /* renamed from: a */
    private final C5923d f29067a;

    /* renamed from: b */
    private boolean f29068b;

    /* renamed from: c */
    private long f29069c;

    /* renamed from: d */
    private long f29070d;

    /* renamed from: e */
    private C6280t2 f29071e = C6280t2.f30329d;

    public C5930e0(C5923d dVar) {
        this.f29067a = dVar;
    }

    /* renamed from: a */
    public void mo20589a(long j) {
        this.f29069c = j;
        if (this.f29068b) {
            this.f29070d = this.f29067a.mo20586b();
        }
    }

    /* renamed from: b */
    public void mo20590b() {
        if (!this.f29068b) {
            this.f29070d = this.f29067a.mo20586b();
            this.f29068b = true;
        }
    }

    /* renamed from: c */
    public void mo6483c(C6280t2 t2Var) {
        if (this.f29068b) {
            mo20589a(mo6489l());
        }
        this.f29071e = t2Var;
    }

    /* renamed from: d */
    public void mo20591d() {
        if (this.f29068b) {
            mo20589a(mo6489l());
            this.f29068b = false;
        }
    }

    /* renamed from: e */
    public C6280t2 mo6485e() {
        return this.f29071e;
    }

    /* renamed from: l */
    public long mo6489l() {
        long j;
        long j2 = this.f29069c;
        if (!this.f29068b) {
            return j2;
        }
        long b = this.f29067a.mo20586b() - this.f29070d;
        C6280t2 t2Var = this.f29071e;
        if (t2Var.f30331a == 1.0f) {
            j = C5953m0.m35071B0(b);
        } else {
            j = t2Var.mo21537b(b);
        }
        return j2 + j;
    }
}
