package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.i7 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2465i7 {

    /* renamed from: a */
    private final C2576l6 f10634a;

    /* renamed from: b */
    private final e92 f10635b;

    /* renamed from: c */
    private final x12 f10636c = new x12(new byte[64], 64);

    /* renamed from: d */
    private boolean f10637d;

    /* renamed from: e */
    private boolean f10638e;

    /* renamed from: f */
    private boolean f10639f;

    public C2465i7(C2576l6 l6Var, e92 e92) {
        this.f10634a = l6Var;
        this.f10635b = e92;
    }

    /* renamed from: a */
    public final void mo11028a(y22 y22) throws ea0 {
        long j;
        y22.mo15289b(this.f10636c.f19942a, 0, 3);
        this.f10636c.mo15039h(0);
        this.f10636c.mo15041j(8);
        this.f10637d = this.f10636c.mo15043l();
        this.f10638e = this.f10636c.mo15043l();
        this.f10636c.mo15041j(6);
        y22.mo15289b(this.f10636c.f19942a, 0, this.f10636c.mo15034c(8));
        this.f10636c.mo15039h(0);
        if (this.f10637d) {
            this.f10636c.mo15041j(4);
            int c = this.f10636c.mo15034c(3);
            this.f10636c.mo15041j(1);
            int c2 = this.f10636c.mo15034c(15);
            this.f10636c.mo15041j(1);
            long c3 = (((long) c) << 30) | ((long) (c2 << 15)) | ((long) this.f10636c.mo15034c(15));
            this.f10636c.mo15041j(1);
            if (!this.f10639f && this.f10638e) {
                this.f10636c.mo15041j(4);
                int c4 = this.f10636c.mo15034c(3);
                this.f10636c.mo15041j(1);
                int c5 = this.f10636c.mo15034c(15);
                this.f10636c.mo15041j(1);
                int c6 = this.f10636c.mo15034c(15);
                this.f10636c.mo15041j(1);
                this.f10635b.mo9832b(((long) (c5 << 15)) | (((long) c4) << 30) | ((long) c6));
                this.f10639f = true;
            }
            j = this.f10635b.mo9832b(c3);
        } else {
            j = 0;
        }
        this.f10634a.mo8218d(j, 4);
        this.f10634a.mo8216b(y22);
        this.f10634a.mo8219e();
    }

    /* renamed from: b */
    public final void mo11029b() {
        this.f10639f = false;
        this.f10634a.mo8215a();
    }
}
