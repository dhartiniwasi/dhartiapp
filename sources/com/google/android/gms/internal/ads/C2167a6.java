package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.a6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2167a6 implements C2576l6 {

    /* renamed from: a */
    private final x12 f6419a;

    /* renamed from: b */
    private final y22 f6420b;

    /* renamed from: c */
    private final String f6421c;

    /* renamed from: d */
    private String f6422d;

    /* renamed from: e */
    private C2792r f6423e;

    /* renamed from: f */
    private int f6424f = 0;

    /* renamed from: g */
    private int f6425g;

    /* renamed from: h */
    private boolean f6426h;

    /* renamed from: i */
    private long f6427i;

    /* renamed from: j */
    private C2388g4 f6428j;

    /* renamed from: k */
    private int f6429k;

    /* renamed from: l */
    private long f6430l = -9223372036854775807L;

    public C2167a6(String str) {
        x12 x12 = new x12(new byte[128], 128);
        this.f6419a = x12;
        this.f6420b = new y22(x12.f19942a);
        this.f6421c = str;
    }

    /* renamed from: a */
    public final void mo8215a() {
        this.f6424f = 0;
        this.f6425g = 0;
        this.f6426h = false;
        this.f6430l = -9223372036854775807L;
    }

    /* renamed from: b */
    public final void mo8216b(y22 y22) {
        v91.m22048b(this.f6423e);
        while (y22.mo15296i() > 0) {
            int i = this.f6424f;
            if (i == 0) {
                while (true) {
                    if (y22.mo15296i() <= 0) {
                        break;
                    } else if (!this.f6426h) {
                        this.f6426h = y22.mo15306s() == 11;
                    } else {
                        int s = y22.mo15306s();
                        if (s == 119) {
                            this.f6426h = false;
                            this.f6424f = 1;
                            y22 y222 = this.f6420b;
                            y222.mo15295h()[0] = 11;
                            y222.mo15295h()[1] = 119;
                            this.f6425g = 2;
                            break;
                        }
                        this.f6426h = s == 11;
                    }
                }
            } else if (i != 1) {
                int min = Math.min(y22.mo15296i(), this.f6429k - this.f6425g);
                this.f6423e.mo8821c(y22, min);
                int i2 = this.f6425g + min;
                this.f6425g = i2;
                int i3 = this.f6429k;
                if (i2 == i3) {
                    long j = this.f6430l;
                    if (j != -9223372036854775807L) {
                        this.f6423e.mo8824f(j, 1, i3, 0, (C2755q) null);
                        this.f6430l += this.f6427i;
                    }
                    this.f6424f = 0;
                }
            } else {
                byte[] h = this.f6420b.mo15295h();
                int min2 = Math.min(y22.mo15296i(), 128 - this.f6425g);
                y22.mo15289b(h, this.f6425g, min2);
                int i4 = this.f6425g + min2;
                this.f6425g = i4;
                if (i4 == 128) {
                    this.f6419a.mo15039h(0);
                    pm4 e = qm4.m19297e(this.f6419a);
                    C2388g4 g4Var = this.f6428j;
                    if (g4Var == null || e.f15923c != g4Var.f9686y || e.f15922b != g4Var.f9687z || !gb2.m13186t(e.f15921a, g4Var.f9673l)) {
                        C2311e2 e2Var = new C2311e2();
                        e2Var.mo9764h(this.f6422d);
                        e2Var.mo9776s(e.f15921a);
                        e2Var.mo9759e0(e.f15923c);
                        e2Var.mo9777t(e.f15922b);
                        e2Var.mo9768k(this.f6421c);
                        C2388g4 y = e2Var.mo9782y();
                        this.f6428j = y;
                        this.f6423e.mo8823e(y);
                    }
                    this.f6429k = e.f15924d;
                    this.f6427i = (((long) e.f15925e) * 1000000) / ((long) this.f6428j.f9687z);
                    this.f6420b.mo15293f(0);
                    this.f6423e.mo8821c(this.f6420b, 128);
                    this.f6424f = 2;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo8217c(tn4 tn4, C3059y7 y7Var) {
        y7Var.mo15334c();
        this.f6422d = y7Var.mo15333b();
        this.f6423e = tn4.mo10060n(y7Var.mo15332a(), 1);
    }

    /* renamed from: d */
    public final void mo8218d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f6430l = j;
        }
    }

    /* renamed from: e */
    public final void mo8219e() {
    }
}
