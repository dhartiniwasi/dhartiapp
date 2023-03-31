package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class rr2 implements ye3 {

    /* renamed from: a */
    final /* synthetic */ cd2 f17078a;

    /* renamed from: b */
    final /* synthetic */ yy2 f17079b;

    /* renamed from: c */
    final /* synthetic */ ny2 f17080c;

    /* renamed from: d */
    final /* synthetic */ tr2 f17081d;

    /* renamed from: e */
    final /* synthetic */ ur2 f17082e;

    rr2(ur2 ur2, cd2 cd2, yy2 yy2, ny2 ny2, tr2 tr2) {
        this.f17082e = ur2;
        this.f17078a = cd2;
        this.f17079b = yy2;
        this.f17080c = ny2;
        this.f17081d = tr2;
    }

    /* renamed from: a */
    public final void mo8529a(Throwable th) {
        C4623z2 z2Var;
        yy2 yy2;
        ur1 ur1 = (ur1) this.f17082e.f18709e.mo8487b();
        if (ur1 == null) {
            z2Var = eu2.m12269b(th, (i52) null);
        } else {
            z2Var = ur1.mo9830d().mo8231a(th);
        }
        synchronized (this.f17082e) {
            if (ur1 != null) {
                ur1.mo13090a().mo9420g(z2Var);
                this.f17082e.f18706b.execute(new qr2(this, z2Var));
            } else {
                this.f17082e.f18708d.mo9420g(z2Var);
                this.f17082e.m21823j(this.f17081d).mo12464a().mo9830d().mo8232c().mo10155b();
            }
            yt2.m24196b(z2Var.f25062a, th, "RewardedAdLoader.onFailure");
            this.f17078a.zza();
            if (!((Boolean) x00.f19923c.mo13438e()).booleanValue() || (yy2 = this.f17079b) == null) {
                az2 f = this.f17082e.f18711g;
                ny2 ny2 = this.f17080c;
                ny2.mo11834g(z2Var);
                ny2.mo11826G(false);
                f.mo8629b(ny2.mo11831W());
            } else {
                yy2.mo15517c(z2Var);
                ny2 ny22 = this.f17080c;
                ny22.mo11826G(false);
                yy2.mo15515a(ny22);
                yy2.mo15521g();
            }
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8530c(Object obj) {
        yy2 yy2;
        pr1 pr1 = (pr1) obj;
        synchronized (this.f17082e) {
            pr1.mo14681e().mo9898d(this.f17082e.f18708d);
            this.f17078a.mo9127c(pr1);
            ur2 ur2 = this.f17082e;
            Executor g = ur2.f18706b;
            kr2 e = ur2.f18708d;
            e.getClass();
            g.execute(new pr2(e));
            this.f17082e.f18708d.mo10003f();
            if (!((Boolean) x00.f19923c.mo13438e()).booleanValue() || (yy2 = this.f17079b) == null) {
                az2 f = this.f17082e.f18711g;
                ny2 ny2 = this.f17080c;
                ny2.mo11832a(pr1.mo14683g().f18723b);
                ny2.mo11835x(pr1.mo14679c().mo12867c());
                ny2.mo11826G(true);
                f.mo8629b(ny2.mo11831W());
            } else {
                yy2.mo15520f(pr1.mo14683g().f18723b);
                yy2.mo15519e(pr1.mo14679c().mo12867c());
                ny2 ny22 = this.f17080c;
                ny22.mo11826G(true);
                yy2.mo15515a(ny22);
                yy2.mo15521g();
            }
        }
    }
}
