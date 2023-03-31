package p106o2;

import p037e2.C4200e0;
import p037e2.C4217n;
import p106o2.C5183i0;
import p161w3.C5917a;
import p161w3.C5918a0;
import p161w3.C5961r;
import p177z1.C6272r1;

/* renamed from: o2.r */
/* compiled from: Id3Reader */
public final class C5205r implements C5193m {

    /* renamed from: a */
    private final C5918a0 f26992a = new C5918a0(10);

    /* renamed from: b */
    private C4200e0 f26993b;

    /* renamed from: c */
    private boolean f26994c;

    /* renamed from: d */
    private long f26995d = -9223372036854775807L;

    /* renamed from: e */
    private int f26996e;

    /* renamed from: f */
    private int f26997f;

    /* renamed from: a */
    public void mo19147a(C5918a0 a0Var) {
        C5917a.m34875h(this.f26993b);
        if (this.f26994c) {
            int a = a0Var.mo20548a();
            int i = this.f26997f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                System.arraycopy(a0Var.mo20551d(), a0Var.mo20552e(), this.f26992a.mo20551d(), this.f26997f, min);
                if (this.f26997f + min == 10) {
                    this.f26992a.mo20546O(0);
                    if (73 == this.f26992a.mo20534C() && 68 == this.f26992a.mo20534C() && 51 == this.f26992a.mo20534C()) {
                        this.f26992a.mo20547P(3);
                        this.f26996e = this.f26992a.mo20533B() + 10;
                    } else {
                        C5961r.m35215i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f26994c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a, this.f26996e - this.f26997f);
            this.f26993b.mo6843d(a0Var, min2);
            this.f26997f += min2;
        }
    }

    /* renamed from: b */
    public void mo19148b() {
        this.f26994c = false;
        this.f26995d = -9223372036854775807L;
    }

    /* renamed from: c */
    public void mo19149c() {
        int i;
        C5917a.m34875h(this.f26993b);
        if (this.f26994c && (i = this.f26996e) != 0 && this.f26997f == i) {
            long j = this.f26995d;
            if (j != -9223372036854775807L) {
                this.f26993b.mo6838a(j, 1, i, 0, (C4200e0.C4201a) null);
            }
            this.f26994c = false;
        }
    }

    /* renamed from: d */
    public void mo19150d(C4217n nVar, C5183i0.C5187d dVar) {
        dVar.mo19164a();
        C4200e0 f = nVar.mo6778f(dVar.mo19166c(), 5);
        this.f26993b = f;
        f.mo6845e(new C6272r1.C6274b().mo21505S(dVar.mo19165b()).mo21517e0("application/id3").mo21491E());
    }

    /* renamed from: e */
    public void mo19151e(long j, int i) {
        if ((i & 4) != 0) {
            this.f26994c = true;
            if (j != -9223372036854775807L) {
                this.f26995d = j;
            }
            this.f26996e = 0;
            this.f26997f = 0;
        }
    }
}
