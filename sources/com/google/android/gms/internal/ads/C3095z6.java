package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3095z6 implements C2576l6 {

    /* renamed from: a */
    private final y22 f20944a;

    /* renamed from: b */
    private final C2271d f20945b;

    /* renamed from: c */
    private final String f20946c;

    /* renamed from: d */
    private C2792r f20947d;

    /* renamed from: e */
    private String f20948e;

    /* renamed from: f */
    private int f20949f = 0;

    /* renamed from: g */
    private int f20950g;

    /* renamed from: h */
    private boolean f20951h;

    /* renamed from: i */
    private boolean f20952i;

    /* renamed from: j */
    private long f20953j;

    /* renamed from: k */
    private int f20954k;

    /* renamed from: l */
    private long f20955l;

    public C3095z6(String str) {
        y22 y22 = new y22(4);
        this.f20944a = y22;
        y22.mo15295h()[0] = -1;
        this.f20945b = new C2271d();
        this.f20955l = -9223372036854775807L;
        this.f20946c = str;
    }

    /* renamed from: a */
    public final void mo8215a() {
        this.f20949f = 0;
        this.f20950g = 0;
        this.f20952i = false;
        this.f20955l = -9223372036854775807L;
    }

    /* renamed from: b */
    public final void mo8216b(y22 y22) {
        v91.m22048b(this.f20947d);
        while (y22.mo15296i() > 0) {
            int i = this.f20949f;
            if (i == 0) {
                byte[] h = y22.mo15295h();
                int k = y22.mo15298k();
                int l = y22.mo15299l();
                while (true) {
                    if (k >= l) {
                        y22.mo15293f(l);
                        break;
                    }
                    byte b = h[k];
                    boolean z = (b & 255) == 255;
                    boolean z2 = this.f20952i && (b & 224) == 224;
                    this.f20952i = z;
                    if (z2) {
                        y22.mo15293f(k + 1);
                        this.f20952i = false;
                        this.f20944a.mo15295h()[1] = h[k];
                        this.f20950g = 2;
                        this.f20949f = 1;
                        break;
                    }
                    k++;
                }
            } else if (i != 1) {
                int min = Math.min(y22.mo15296i(), this.f20954k - this.f20950g);
                this.f20947d.mo8821c(y22, min);
                int i2 = this.f20950g + min;
                this.f20950g = i2;
                int i3 = this.f20954k;
                if (i2 >= i3) {
                    long j = this.f20955l;
                    if (j != -9223372036854775807L) {
                        this.f20947d.mo8824f(j, 1, i3, 0, (C2755q) null);
                        this.f20955l += this.f20953j;
                    }
                    this.f20950g = 0;
                    this.f20949f = 0;
                }
            } else {
                int min2 = Math.min(y22.mo15296i(), 4 - this.f20950g);
                y22.mo15289b(this.f20944a.mo15295h(), this.f20950g, min2);
                int i4 = this.f20950g + min2;
                this.f20950g = i4;
                if (i4 >= 4) {
                    this.f20944a.mo15293f(0);
                    if (!this.f20945b.mo9405a(this.f20944a.mo15300m())) {
                        this.f20950g = 0;
                        this.f20949f = 1;
                    } else {
                        C2271d dVar = this.f20945b;
                        this.f20954k = dVar.f7991c;
                        if (!this.f20951h) {
                            this.f20953j = (((long) dVar.f7995g) * 1000000) / ((long) dVar.f7992d);
                            C2311e2 e2Var = new C2311e2();
                            e2Var.mo9764h(this.f20948e);
                            e2Var.mo9776s(this.f20945b.f7990b);
                            e2Var.mo9769l(4096);
                            e2Var.mo9759e0(this.f20945b.f7993e);
                            e2Var.mo9777t(this.f20945b.f7992d);
                            e2Var.mo9768k(this.f20946c);
                            this.f20947d.mo8823e(e2Var.mo9782y());
                            this.f20951h = true;
                        }
                        this.f20944a.mo15293f(0);
                        this.f20947d.mo8821c(this.f20944a, 4);
                        this.f20949f = 2;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo8217c(tn4 tn4, C3059y7 y7Var) {
        y7Var.mo15334c();
        this.f20948e = y7Var.mo15333b();
        this.f20947d = tn4.mo10060n(y7Var.mo15332a(), 1);
    }

    /* renamed from: d */
    public final void mo8218d(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f20955l = j;
        }
    }

    /* renamed from: e */
    public final void mo8219e() {
    }
}
