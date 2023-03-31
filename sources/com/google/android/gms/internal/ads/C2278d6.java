package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2278d6 implements C2576l6 {

    /* renamed from: a */
    private final x12 f8066a;

    /* renamed from: b */
    private final y22 f8067b;

    /* renamed from: c */
    private final String f8068c;

    /* renamed from: d */
    private String f8069d;

    /* renamed from: e */
    private C2792r f8070e;

    /* renamed from: f */
    private int f8071f = 0;

    /* renamed from: g */
    private int f8072g = 0;

    /* renamed from: h */
    private boolean f8073h = false;

    /* renamed from: i */
    private long f8074i;

    /* renamed from: j */
    private C2388g4 f8075j;

    /* renamed from: k */
    private int f8076k;

    /* renamed from: l */
    private long f8077l = -9223372036854775807L;

    public C2278d6(String str) {
        x12 x12 = new x12(new byte[16], 16);
        this.f8066a = x12;
        this.f8067b = new y22(x12.f19942a);
        this.f8068c = str;
    }

    /* renamed from: a */
    public final void mo8215a() {
        this.f8071f = 0;
        this.f8072g = 0;
        this.f8073h = false;
        this.f8077l = -9223372036854775807L;
    }

    /* renamed from: b */
    public final void mo8216b(y22 y22) {
        int s;
        byte b;
        v91.m22048b(this.f8070e);
        while (y22.mo15296i() > 0) {
            int i = this.f8071f;
            if (i == 0) {
                while (true) {
                    if (y22.mo15296i() <= 0) {
                        break;
                    } else if (!this.f8073h) {
                        this.f8073h = y22.mo15306s() == 172;
                    } else {
                        s = y22.mo15306s();
                        this.f8073h = s == 172;
                        b = 64;
                        if (s == 64) {
                            break;
                        } else if (s == 65) {
                            s = 65;
                            break;
                        }
                    }
                }
                this.f8071f = 1;
                y22 y222 = this.f8067b;
                y222.mo15295h()[0] = -84;
                byte[] h = y222.mo15295h();
                if (s == 65) {
                    b = 65;
                }
                h[1] = b;
                this.f8072g = 2;
            } else if (i != 1) {
                int min = Math.min(y22.mo15296i(), this.f8076k - this.f8072g);
                this.f8070e.mo8821c(y22, min);
                int i2 = this.f8072g + min;
                this.f8072g = i2;
                int i3 = this.f8076k;
                if (i2 == i3) {
                    long j = this.f8077l;
                    if (j != -9223372036854775807L) {
                        this.f8070e.mo8824f(j, 1, i3, 0, (C2755q) null);
                        this.f8077l += this.f8074i;
                    }
                    this.f8071f = 0;
                }
            } else {
                byte[] h2 = this.f8067b.mo15295h();
                int min2 = Math.min(y22.mo15296i(), 16 - this.f8072g);
                y22.mo15289b(h2, this.f8072g, min2);
                int i4 = this.f8072g + min2;
                this.f8072g = i4;
                if (i4 == 16) {
                    this.f8066a.mo15039h(0);
                    sm4 a = tm4.m21086a(this.f8066a);
                    C2388g4 g4Var = this.f8075j;
                    if (g4Var == null || g4Var.f9686y != 2 || a.f17591a != g4Var.f9687z || !"audio/ac4".equals(g4Var.f9673l)) {
                        C2311e2 e2Var = new C2311e2();
                        e2Var.mo9764h(this.f8069d);
                        e2Var.mo9776s("audio/ac4");
                        e2Var.mo9759e0(2);
                        e2Var.mo9777t(a.f17591a);
                        e2Var.mo9768k(this.f8068c);
                        C2388g4 y = e2Var.mo9782y();
                        this.f8075j = y;
                        this.f8070e.mo8823e(y);
                    }
                    this.f8076k = a.f17592b;
                    this.f8074i = (((long) a.f17593c) * 1000000) / ((long) this.f8075j.f9687z);
                    this.f8067b.mo15293f(0);
                    this.f8070e.mo8821c(this.f8067b, 16);
                    this.f8071f = 2;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo8217c(tn4 tn4, C3059y7 y7Var) {
        y7Var.mo15334c();
        this.f8069d = y7Var.mo15333b();
        this.f8070e = tn4.mo10060n(y7Var.mo15332a(), 1);
    }

    /* renamed from: d */
    public final void mo8218d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f8077l = j;
        }
    }

    /* renamed from: e */
    public final void mo8219e() {
    }
}
