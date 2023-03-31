package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class vy2 implements ye3 {

    /* renamed from: a */
    final /* synthetic */ yy2 f19379a;

    /* renamed from: b */
    final /* synthetic */ ny2 f19380b;

    /* renamed from: c */
    final /* synthetic */ boolean f19381c;

    vy2(yy2 yy2, ny2 ny2, boolean z) {
        this.f19379a = yy2;
        this.f19380b = ny2;
        this.f19381c = z;
    }

    /* renamed from: a */
    public final void mo8529a(Throwable th) {
        ny2 ny2 = this.f19380b;
        if (ny2.mo11829U()) {
            yy2 yy2 = this.f19379a;
            ny2.mo11826G(false);
            yy2.mo15515a(ny2);
            if (this.f19381c) {
                this.f19379a.mo15521g();
            }
        }
    }

    /* renamed from: c */
    public final void mo8530c(Object obj) {
        yy2 yy2 = this.f19379a;
        ny2 ny2 = this.f19380b;
        ny2.mo11826G(true);
        yy2.mo15515a(ny2);
        if (this.f19381c) {
            this.f19379a.mo15521g();
        }
    }
}
