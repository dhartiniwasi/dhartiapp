package com.google.android.gms.internal.ads;

import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class kd2 implements ye3 {

    /* renamed from: a */
    final /* synthetic */ cd2 f12033a;

    /* renamed from: b */
    final /* synthetic */ yy2 f12034b;

    /* renamed from: c */
    final /* synthetic */ ny2 f12035c;

    /* renamed from: d */
    final /* synthetic */ jk1 f12036d;

    /* renamed from: e */
    final /* synthetic */ ld2 f12037e;

    kd2(ld2 ld2, cd2 cd2, yy2 yy2, ny2 ny2, jk1 jk1) {
        this.f12037e = ld2;
        this.f12033a = cd2;
        this.f12034b = yy2;
        this.f12035c = ny2;
        this.f12036d = jk1;
    }

    /* renamed from: a */
    public final void mo8529a(Throwable th) {
        yy2 yy2;
        C4623z2 a = this.f12036d.mo11416a().mo8231a(th);
        this.f12036d.mo11417b().mo9420g(a);
        this.f12037e.f12741b.mo9711b().execute(new jd2(this, a));
        yt2.m24196b(a.f25062a, th, "NativeAdLoader.onFailure");
        this.f12033a.zza();
        if (!((Boolean) x00.f19923c.mo13438e()).booleanValue() || (yy2 = this.f12034b) == null) {
            az2 d = this.f12037e.f12744e;
            ny2 ny2 = this.f12035c;
            ny2.mo11834g(a);
            ny2.mo11826G(false);
            d.mo8629b(ny2.mo11831W());
            return;
        }
        yy2.mo15517c(a);
        ny2 ny22 = this.f12035c;
        ny22.mo11826G(false);
        yy2.mo15515a(ny22);
        yy2.mo15521g();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8530c(Object obj) {
        yy2 yy2;
        v51 v51 = (v51) obj;
        synchronized (this.f12037e) {
            v51.mo14681e().mo9895a(this.f12037e.f12743d.mo8313d());
            this.f12033a.mo9127c(v51);
            this.f12037e.f12741b.mo9711b().execute(new hd2(this));
            if (!((Boolean) x00.f19923c.mo13438e()).booleanValue() || (yy2 = this.f12034b) == null) {
                az2 d = this.f12037e.f12744e;
                ny2 ny2 = this.f12035c;
                ny2.mo11832a(v51.mo14683g().f18723b);
                ny2.mo11835x(v51.mo14679c().mo12867c());
                ny2.mo11826G(true);
                d.mo8629b(ny2.mo11831W());
            } else {
                yy2.mo15520f(v51.mo14683g().f18723b);
                yy2.mo15519e(v51.mo14679c().mo12867c());
                ny2 ny22 = this.f12035c;
                ny22.mo11826G(true);
                yy2.mo15515a(ny22);
                yy2.mo15521g();
            }
        }
    }
}
