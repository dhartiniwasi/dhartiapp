package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.b7 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2205b7 implements C2577l7 {

    /* renamed from: a */
    private C2388g4 f7115a;

    /* renamed from: b */
    private e92 f7116b;

    /* renamed from: c */
    private C2792r f7117c;

    public C2205b7(String str) {
        C2311e2 e2Var = new C2311e2();
        e2Var.mo9776s(str);
        this.f7115a = e2Var.mo9782y();
    }

    /* renamed from: a */
    public final void mo8684a(e92 e92, tn4 tn4, C3059y7 y7Var) {
        this.f7116b = e92;
        y7Var.mo15334c();
        C2792r n = tn4.mo10060n(y7Var.mo15332a(), 5);
        this.f7117c = n;
        n.mo8823e(this.f7115a);
    }

    /* renamed from: b */
    public final void mo8685b(y22 y22) {
        v91.m22048b(this.f7116b);
        int i = gb2.f9812a;
        long d = this.f7116b.mo9834d();
        long e = this.f7116b.mo9835e();
        if (d != -9223372036854775807L && e != -9223372036854775807L) {
            C2388g4 g4Var = this.f7115a;
            if (e != g4Var.f9677p) {
                C2311e2 b = g4Var.mo10384b();
                b.mo9780w(e);
                C2388g4 y = b.mo9782y();
                this.f7115a = y;
                this.f7117c.mo8823e(y);
            }
            int i2 = y22.mo15296i();
            this.f7117c.mo8821c(y22, i2);
            this.f7117c.mo8824f(d, 1, i2, 0, (C2755q) null);
        }
    }
}
