package p106o2;

import java.util.Collections;
import java.util.List;
import p037e2.C4200e0;
import p037e2.C4217n;
import p106o2.C5183i0;
import p161w3.C5918a0;
import p177z1.C6272r1;

/* renamed from: o2.l */
/* compiled from: DvbSubtitleReader */
public final class C5192l implements C5193m {

    /* renamed from: a */
    private final List<C5183i0.C5184a> f26862a;

    /* renamed from: b */
    private final C4200e0[] f26863b;

    /* renamed from: c */
    private boolean f26864c;

    /* renamed from: d */
    private int f26865d;

    /* renamed from: e */
    private int f26866e;

    /* renamed from: f */
    private long f26867f = -9223372036854775807L;

    public C5192l(List<C5183i0.C5184a> list) {
        this.f26862a = list;
        this.f26863b = new C4200e0[list.size()];
    }

    /* renamed from: f */
    private boolean m32248f(C5918a0 a0Var, int i) {
        if (a0Var.mo20548a() == 0) {
            return false;
        }
        if (a0Var.mo20534C() != i) {
            this.f26864c = false;
        }
        this.f26865d--;
        return this.f26864c;
    }

    /* renamed from: a */
    public void mo19147a(C5918a0 a0Var) {
        if (!this.f26864c) {
            return;
        }
        if (this.f26865d != 2 || m32248f(a0Var, 32)) {
            if (this.f26865d != 1 || m32248f(a0Var, 0)) {
                int e = a0Var.mo20552e();
                int a = a0Var.mo20548a();
                for (C4200e0 d : this.f26863b) {
                    a0Var.mo20546O(e);
                    d.mo6843d(a0Var, a);
                }
                this.f26866e += a;
            }
        }
    }

    /* renamed from: b */
    public void mo19148b() {
        this.f26864c = false;
        this.f26867f = -9223372036854775807L;
    }

    /* renamed from: c */
    public void mo19149c() {
        if (this.f26864c) {
            if (this.f26867f != -9223372036854775807L) {
                for (C4200e0 a : this.f26863b) {
                    a.mo6838a(this.f26867f, 1, this.f26866e, 0, (C4200e0.C4201a) null);
                }
            }
            this.f26864c = false;
        }
    }

    /* renamed from: d */
    public void mo19150d(C4217n nVar, C5183i0.C5187d dVar) {
        for (int i = 0; i < this.f26863b.length; i++) {
            C5183i0.C5184a aVar = this.f26862a.get(i);
            dVar.mo19164a();
            C4200e0 f = nVar.mo6778f(dVar.mo19166c(), 3);
            f.mo6845e(new C6272r1.C6274b().mo21505S(dVar.mo19165b()).mo21517e0("application/dvbsubs").mo21506T(Collections.singletonList(aVar.f26837c)).mo21508V(aVar.f26835a).mo21491E());
            this.f26863b[i] = f;
        }
    }

    /* renamed from: e */
    public void mo19151e(long j, int i) {
        if ((i & 4) != 0) {
            this.f26864c = true;
            if (j != -9223372036854775807L) {
                this.f26867f = j;
            }
            this.f26866e = 0;
            this.f26865d = 2;
        }
    }
}
