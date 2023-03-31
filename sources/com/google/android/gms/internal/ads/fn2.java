package com.google.android.gms.internal.ads;

import p060h4.C4596v;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class fn2 implements ye3 {

    /* renamed from: a */
    final /* synthetic */ cd2 f9347a;

    /* renamed from: b */
    final /* synthetic */ yy2 f9348b;

    /* renamed from: c */
    final /* synthetic */ ny2 f9349c;

    /* renamed from: d */
    final /* synthetic */ hn2 f9350d;

    /* renamed from: e */
    final /* synthetic */ in2 f9351e;

    fn2(in2 in2, cd2 cd2, yy2 yy2, ny2 ny2, hn2 hn2) {
        this.f9351e = in2;
        this.f9347a = cd2;
        this.f9348b = yy2;
        this.f9349c = ny2;
        this.f9350d = hn2;
    }

    /* renamed from: a */
    public final void mo8529a(Throwable th) {
        C4623z2 z2Var;
        yy2 yy2;
        y21 y21 = (y21) this.f9351e.f10879e.mo8487b();
        if (y21 == null) {
            z2Var = eu2.m12269b(th, (i52) null);
        } else {
            z2Var = y21.mo9830d().mo8231a(th);
        }
        synchronized (this.f9351e) {
            this.f9351e.f10884j = null;
            if (y21 != null) {
                y21.mo12460e().mo9420g(z2Var);
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14495Z6)).booleanValue()) {
                    this.f9351e.f10876b.execute(new en2(this, z2Var));
                }
            } else {
                this.f9351e.f10878d.mo9420g(z2Var);
                ((y21) this.f9351e.m14443l(this.f9350d).mo9466U()).mo9830d().mo8232c().mo10155b();
            }
            yt2.m24196b(z2Var.f25062a, th, "AppOpenAdLoader.onFailure");
            this.f9347a.zza();
            if (!((Boolean) x00.f19923c.mo13438e()).booleanValue() || (yy2 = this.f9348b) == null) {
                az2 g = this.f9351e.f10882h;
                ny2 ny2 = this.f9349c;
                ny2.mo11834g(z2Var);
                ny2.mo11826G(false);
                g.mo8629b(ny2.mo11831W());
            } else {
                yy2.mo15517c(z2Var);
                ny2 ny22 = this.f9349c;
                ny22.mo11826G(false);
                yy2.mo15515a(ny22);
                yy2.mo15521g();
            }
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8530c(Object obj) {
        yy2 yy2;
        v51 v51 = (v51) obj;
        synchronized (this.f9351e) {
            this.f9351e.f10884j = null;
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14495Z6)).booleanValue()) {
                v51.mo14681e().mo9896b(this.f9351e.f10878d);
            }
            this.f9347a.mo9127c(v51);
            if (!((Boolean) x00.f19923c.mo13438e()).booleanValue() || (yy2 = this.f9348b) == null) {
                az2 g = this.f9351e.f10882h;
                ny2 ny2 = this.f9349c;
                ny2.mo11832a(v51.mo14683g().f18723b);
                ny2.mo11835x(v51.mo14679c().mo12867c());
                ny2.mo11826G(true);
                g.mo8629b(ny2.mo11831W());
            } else {
                yy2.mo15520f(v51.mo14683g().f18723b);
                yy2.mo15519e(v51.mo14679c().mo12867c());
                ny2 ny22 = this.f9349c;
                ny22.mo11826G(true);
                yy2.mo15515a(ny22);
                yy2.mo15521g();
            }
        }
    }
}
