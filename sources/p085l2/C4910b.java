package p085l2;

import p037e2.C4192b0;
import p037e2.C4196c0;
import p161w3.C5953m0;
import p161w3.C5964s;

/* renamed from: l2.b */
/* compiled from: IndexSeeker */
final class C4910b implements C4913g {

    /* renamed from: a */
    private final long f25867a;

    /* renamed from: b */
    private final C5964s f25868b;

    /* renamed from: c */
    private final C5964s f25869c;

    /* renamed from: d */
    private long f25870d;

    public C4910b(long j, long j2, long j3) {
        this.f25870d = j;
        this.f25867a = j3;
        C5964s sVar = new C5964s();
        this.f25868b = sVar;
        C5964s sVar2 = new C5964s();
        this.f25869c = sVar2;
        sVar.mo20660a(0);
        sVar2.mo20660a(j2);
    }

    /* renamed from: a */
    public boolean mo18737a(long j) {
        C5964s sVar = this.f25868b;
        return j - sVar.mo20661b(sVar.mo20662c() - 1) < 100000;
    }

    /* renamed from: b */
    public long mo18735b(long j) {
        return this.f25868b.mo20661b(C5953m0.m35132g(this.f25869c, j, true, true));
    }

    /* renamed from: c */
    public void mo18738c(long j, long j2) {
        if (!mo18737a(j)) {
            this.f25868b.mo20660a(j);
            this.f25869c.mo20660a(j2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo18739d(long j) {
        this.f25870d = j;
    }

    /* renamed from: f */
    public long mo18736f() {
        return this.f25867a;
    }

    /* renamed from: g */
    public boolean mo17534g() {
        return true;
    }

    /* renamed from: i */
    public C4192b0.C4193a mo17535i(long j) {
        int g = C5953m0.m35132g(this.f25868b, j, true, true);
        C4196c0 c0Var = new C4196c0(this.f25868b.mo20661b(g), this.f25869c.mo20661b(g));
        if (c0Var.f23485a == j || g == this.f25868b.mo20662c() - 1) {
            return new C4192b0.C4193a(c0Var);
        }
        int i = g + 1;
        return new C4192b0.C4193a(c0Var, new C4196c0(this.f25868b.mo20661b(i), this.f25869c.mo20661b(i)));
    }

    /* renamed from: j */
    public long mo17536j() {
        return this.f25870d;
    }
}
