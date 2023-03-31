package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y0 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C3052y0 extends C3015x0 {

    /* renamed from: b */
    private final y22 f20400b = new y22(C2420h.f10130a);

    /* renamed from: c */
    private final y22 f20401c = new y22(4);

    /* renamed from: d */
    private int f20402d;

    /* renamed from: e */
    private boolean f20403e;

    /* renamed from: f */
    private boolean f20404f;

    /* renamed from: g */
    private int f20405g;

    public C3052y0(C2792r rVar) {
        super(rVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo13915a(y22 y22) throws C2978w0 {
        int s = y22.mo15306s();
        int i = s >> 4;
        int i2 = s & 15;
        if (i2 == 7) {
            this.f20405g = i;
            return i != 5;
        }
        throw new C2978w0("Video format not supported: " + i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo13916b(y22 y22, long j) throws ea0 {
        int s = y22.mo15306s();
        long n = j + (((long) y22.mo15301n()) * 1000);
        if (s == 0) {
            if (!this.f20403e) {
                y22 y222 = new y22(new byte[y22.mo15296i()]);
                y22.mo15289b(y222.mo15295h(), 0, y22.mo15296i());
                um4 a = um4.m21731a(y222);
                this.f20402d = a.f18629b;
                C2311e2 e2Var = new C2311e2();
                e2Var.mo9776s("video/avc");
                e2Var.mo9761f0(a.f18633f);
                e2Var.mo9781x(a.f18630c);
                e2Var.mo9760f(a.f18631d);
                e2Var.mo9773p(a.f18632e);
                e2Var.mo9766i(a.f18628a);
                this.f19920a.mo8823e(e2Var.mo9782y());
                this.f20403e = true;
                return false;
            }
        } else if (s == 1 && this.f20403e) {
            int i = this.f20405g == 1 ? 1 : 0;
            if (!this.f20404f && i == 0) {
                return false;
            }
            byte[] h = this.f20401c.mo15295h();
            h[0] = 0;
            h[1] = 0;
            h[2] = 0;
            int i2 = 4 - this.f20402d;
            int i3 = 0;
            while (y22.mo15296i() > 0) {
                y22.mo15289b(this.f20401c.mo15295h(), i2, this.f20402d);
                this.f20401c.mo15293f(0);
                int v = this.f20401c.mo15309v();
                this.f20400b.mo15293f(0);
                this.f19920a.mo8821c(this.f20400b, 4);
                this.f19920a.mo8821c(y22, v);
                i3 = i3 + 4 + v;
            }
            this.f19920a.mo8824f(n, i, i3, 0, (C2755q) null);
            this.f20404f = true;
            return true;
        }
        return false;
    }
}
