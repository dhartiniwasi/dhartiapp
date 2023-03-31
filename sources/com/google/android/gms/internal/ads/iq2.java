package com.google.android.gms.internal.ads;

import p060h4.C4596v;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class iq2 implements ye3 {

    /* renamed from: a */
    final /* synthetic */ cd2 f10911a;

    /* renamed from: b */
    final /* synthetic */ yy2 f10912b;

    /* renamed from: c */
    final /* synthetic */ ny2 f10913c;

    /* renamed from: d */
    final /* synthetic */ mj1 f10914d;

    /* renamed from: e */
    final /* synthetic */ jq2 f10915e;

    iq2(jq2 jq2, cd2 cd2, yy2 yy2, ny2 ny2, mj1 mj1) {
        this.f10915e = jq2;
        this.f10911a = cd2;
        this.f10912b = yy2;
        this.f10913c = ny2;
        this.f10914d = mj1;
    }

    /* renamed from: a */
    public final void mo8529a(Throwable th) {
        yy2 yy2;
        C4623z2 a = this.f10914d.mo12360a().mo8231a(th);
        synchronized (this.f10915e) {
            this.f10915e.f11751i = null;
            this.f10914d.mo12361b().mo9420g(a);
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14505a7)).booleanValue()) {
                this.f10915e.f11744b.execute(new gq2(this, a));
                this.f10915e.f11744b.execute(new hq2(this, a));
            }
            yt2.m24196b(a.f25062a, th, "InterstitialAdLoader.onFailure");
            this.f10911a.zza();
            if (!((Boolean) x00.f19923c.mo13438e()).booleanValue() || (yy2 = this.f10912b) == null) {
                az2 d = this.f10915e.f11749g;
                ny2 ny2 = this.f10913c;
                ny2.mo11834g(a);
                ny2.mo11826G(false);
                d.mo8629b(ny2.mo11831W());
            } else {
                yy2.mo15517c(a);
                ny2 ny22 = this.f10913c;
                ny22.mo11826G(false);
                yy2.mo15515a(ny22);
                yy2.mo15521g();
            }
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8530c(Object obj) {
        yy2 yy2;
        ki1 ki1 = (ki1) obj;
        synchronized (this.f10915e) {
            this.f10915e.f11751i = null;
            C2344ez ezVar = C2679nz.f14505a7;
            if (((Boolean) C4596v.m30088c().mo12227b(ezVar)).booleanValue()) {
                ee1 e = ki1.mo14681e();
                e.mo9895a(this.f10915e.f11746d);
                e.mo9898d(this.f10915e.f11747e);
            }
            this.f10911a.mo9127c(ki1);
            if (((Boolean) C4596v.m30088c().mo12227b(ezVar)).booleanValue()) {
                this.f10915e.f11744b.execute(new eq2(this));
                this.f10915e.f11744b.execute(new fq2(this));
            }
            if (!((Boolean) x00.f19923c.mo13438e()).booleanValue() || (yy2 = this.f10912b) == null) {
                az2 d = this.f10915e.f11749g;
                ny2 ny2 = this.f10913c;
                ny2.mo11832a(ki1.mo14683g().f18723b);
                ny2.mo11835x(ki1.mo14679c().mo12867c());
                ny2.mo11826G(true);
                d.mo8629b(ny2.mo11831W());
            } else {
                yy2.mo15520f(ki1.mo14683g().f18723b);
                yy2.mo15519e(ki1.mo14679c().mo12867c());
                ny2 ny22 = this.f10913c;
                ny22.mo11826G(true);
                yy2.mo15515a(ny22);
                yy2.mo15521g();
            }
        }
    }
}
