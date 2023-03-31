package p106o2;

import p037e2.C4217n;
import p106o2.C5183i0;
import p161w3.C5918a0;
import p161w3.C5940i0;
import p161w3.C5953m0;

/* renamed from: o2.c0 */
/* compiled from: SectionReader */
public final class C5171c0 implements C5183i0 {

    /* renamed from: a */
    private final C5169b0 f26735a;

    /* renamed from: b */
    private final C5918a0 f26736b = new C5918a0(32);

    /* renamed from: c */
    private int f26737c;

    /* renamed from: d */
    private int f26738d;

    /* renamed from: e */
    private boolean f26739e;

    /* renamed from: f */
    private boolean f26740f;

    public C5171c0(C5169b0 b0Var) {
        this.f26735a = b0Var;
    }

    /* renamed from: a */
    public void mo19152a(C5918a0 a0Var, int i) {
        boolean z = (i & 1) != 0;
        int e = z ? a0Var.mo20552e() + a0Var.mo20534C() : -1;
        if (this.f26740f) {
            if (z) {
                this.f26740f = false;
                a0Var.mo20546O(e);
                this.f26738d = 0;
            } else {
                return;
            }
        }
        while (a0Var.mo20548a() > 0) {
            int i2 = this.f26738d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int C = a0Var.mo20534C();
                    a0Var.mo20546O(a0Var.mo20552e() - 1);
                    if (C == 255) {
                        this.f26740f = true;
                        return;
                    }
                }
                int min = Math.min(a0Var.mo20548a(), 3 - this.f26738d);
                a0Var.mo20557j(this.f26736b.mo20551d(), this.f26738d, min);
                int i3 = this.f26738d + min;
                this.f26738d = i3;
                if (i3 == 3) {
                    this.f26736b.mo20546O(0);
                    this.f26736b.mo20545N(3);
                    this.f26736b.mo20547P(1);
                    int C2 = this.f26736b.mo20534C();
                    int C3 = this.f26736b.mo20534C();
                    this.f26739e = (C2 & 128) != 0;
                    this.f26737c = (((C2 & 15) << 8) | C3) + 3;
                    int b = this.f26736b.mo20549b();
                    int i4 = this.f26737c;
                    if (b < i4) {
                        this.f26736b.mo20550c(Math.min(4098, Math.max(i4, this.f26736b.mo20549b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(a0Var.mo20548a(), this.f26737c - this.f26738d);
                a0Var.mo20557j(this.f26736b.mo20551d(), this.f26738d, min2);
                int i5 = this.f26738d + min2;
                this.f26738d = i5;
                int i6 = this.f26737c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.f26739e) {
                        this.f26736b.mo20545N(i6);
                    } else if (C5953m0.m35158t(this.f26736b.mo20551d(), 0, this.f26737c, -1) != 0) {
                        this.f26740f = true;
                        return;
                    } else {
                        this.f26736b.mo20545N(this.f26737c - 4);
                    }
                    this.f26736b.mo20546O(0);
                    this.f26735a.mo19145a(this.f26736b);
                    this.f26738d = 0;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo19153b() {
        this.f26740f = true;
    }

    /* renamed from: c */
    public void mo19154c(C5940i0 i0Var, C4217n nVar, C5183i0.C5187d dVar) {
        this.f26735a.mo19146c(i0Var, nVar, dVar);
        this.f26740f = true;
    }
}
