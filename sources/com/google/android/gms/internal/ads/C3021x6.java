package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.x6 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C3021x6 implements C2576l6 {

    /* renamed from: a */
    private final y22 f19997a = new y22(10);

    /* renamed from: b */
    private C2792r f19998b;

    /* renamed from: c */
    private boolean f19999c;

    /* renamed from: d */
    private long f20000d = -9223372036854775807L;

    /* renamed from: e */
    private int f20001e;

    /* renamed from: f */
    private int f20002f;

    /* renamed from: a */
    public final void mo8215a() {
        this.f19999c = false;
        this.f20000d = -9223372036854775807L;
    }

    /* renamed from: b */
    public final void mo8216b(y22 y22) {
        v91.m22048b(this.f19998b);
        if (this.f19999c) {
            int i = y22.mo15296i();
            int i2 = this.f20002f;
            if (i2 < 10) {
                int min = Math.min(i, 10 - i2);
                System.arraycopy(y22.mo15295h(), y22.mo15298k(), this.f19997a.mo15295h(), this.f20002f, min);
                if (this.f20002f + min == 10) {
                    this.f19997a.mo15293f(0);
                    if (this.f19997a.mo15306s() == 73 && this.f19997a.mo15306s() == 68 && this.f19997a.mo15306s() == 51) {
                        this.f19997a.mo15294g(3);
                        this.f20001e = this.f19997a.mo15305r() + 10;
                    } else {
                        ot1.m18060e("Id3Reader", "Discarding invalid ID3 tag");
                        this.f19999c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(i, this.f20001e - this.f20002f);
            this.f19998b.mo8821c(y22, min2);
            this.f20002f += min2;
        }
    }

    /* renamed from: c */
    public final void mo8217c(tn4 tn4, C3059y7 y7Var) {
        y7Var.mo15334c();
        C2792r n = tn4.mo10060n(y7Var.mo15332a(), 5);
        this.f19998b = n;
        C2311e2 e2Var = new C2311e2();
        e2Var.mo9764h(y7Var.mo15333b());
        e2Var.mo9776s("application/id3");
        n.mo8823e(e2Var.mo9782y());
    }

    /* renamed from: d */
    public final void mo8218d(long j, int i) {
        if ((i & 4) != 0) {
            this.f19999c = true;
            if (j != -9223372036854775807L) {
                this.f20000d = j;
            }
            this.f20001e = 0;
            this.f20002f = 0;
        }
    }

    /* renamed from: e */
    public final void mo8219e() {
        int i;
        v91.m22048b(this.f19998b);
        if (this.f19999c && (i = this.f20001e) != 0 && this.f20002f == i) {
            long j = this.f20000d;
            if (j != -9223372036854775807L) {
                this.f19998b.mo8824f(j, 1, i, 0, (C2755q) null);
            }
            this.f19999c = false;
        }
    }
}
