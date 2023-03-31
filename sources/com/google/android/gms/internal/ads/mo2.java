package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.Executor;
import p060h4.C4596v;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class mo2 implements ye3 {

    /* renamed from: a */
    final /* synthetic */ cd2 f13435a;

    /* renamed from: b */
    final /* synthetic */ yy2 f13436b;

    /* renamed from: c */
    final /* synthetic */ ny2 f13437c;

    /* renamed from: d */
    final /* synthetic */ o41 f13438d;

    /* renamed from: e */
    final /* synthetic */ no2 f13439e;

    mo2(no2 no2, cd2 cd2, yy2 yy2, ny2 ny2, o41 o41) {
        this.f13439e = no2;
        this.f13435a = cd2;
        this.f13436b = yy2;
        this.f13437c = ny2;
        this.f13438d = o41;
    }

    /* renamed from: a */
    public final void mo8529a(Throwable th) {
        yy2 yy2;
        C4623z2 a = this.f13438d.mo8573d().mo8231a(th);
        synchronized (this.f13439e) {
            this.f13439e.f14164l = null;
            this.f13438d.mo8574e().mo9420g(a);
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14486Y6)).booleanValue()) {
                this.f13439e.f14154b.execute(new lo2(this, a));
            }
            no2 no2 = this.f13439e;
            no2.f14160h.mo12578p0(no2.f14162j.mo14741a());
            yt2.m24196b(a.f25062a, th, "BannerAdLoader.onFailure");
            this.f13435a.zza();
            if (!((Boolean) x00.f19923c.mo13438e()).booleanValue() || (yy2 = this.f13436b) == null) {
                az2 i = this.f13439e.f14161i;
                ny2 ny2 = this.f13437c;
                ny2.mo11834g(a);
                ny2.mo11826G(false);
                i.mo8629b(ny2.mo11831W());
            } else {
                yy2.mo15517c(a);
                ny2 ny22 = this.f13437c;
                ny22.mo11826G(false);
                yy2.mo15515a(ny22);
                yy2.mo15521g();
            }
        }
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo8530c(Object obj) {
        yy2 yy2;
        r31 r31 = (r31) obj;
        synchronized (this.f13439e) {
            this.f13439e.f14164l = null;
            this.f13439e.f14158f.removeAllViews();
            if (r31.mo8207i() != null) {
                ViewParent parent = r31.mo8207i().getParent();
                if (parent instanceof ViewGroup) {
                    String str = "";
                    if (r31.mo14679c() != null) {
                        str = r31.mo14679c().mo12867c();
                    }
                    pm0.m18667g("Banner view provided from " + str + " already has a parent view. Removing its old parent.");
                    ((ViewGroup) parent).removeView(r31.mo8207i());
                }
            }
            C2344ez ezVar = C2679nz.f14486Y6;
            if (((Boolean) C4596v.m30088c().mo12227b(ezVar)).booleanValue()) {
                ee1 e = r31.mo14681e();
                e.mo9895a(this.f13439e.f14156d);
                e.mo9897c(this.f13439e.f14157e);
            }
            this.f13439e.f14158f.addView(r31.mo8207i());
            this.f13435a.mo9127c(r31);
            if (((Boolean) C4596v.m30088c().mo12227b(ezVar)).booleanValue()) {
                no2 no2 = this.f13439e;
                Executor j = no2.f14154b;
                nc2 f = no2.f14156d;
                f.getClass();
                j.execute(new ko2(f));
            }
            this.f13439e.f14160h.mo12578p0(r31.mo8206h());
            if (!((Boolean) x00.f19923c.mo13438e()).booleanValue() || (yy2 = this.f13436b) == null) {
                az2 i = this.f13439e.f14161i;
                ny2 ny2 = this.f13437c;
                ny2.mo11832a(r31.mo14683g().f18723b);
                ny2.mo11835x(r31.mo14679c().mo12867c());
                ny2.mo11826G(true);
                i.mo8629b(ny2.mo11831W());
            } else {
                yy2.mo15520f(r31.mo14683g().f18723b);
                yy2.mo15519e(r31.mo14679c().mo12867c());
                ny2 ny22 = this.f13437c;
                ny22.mo11826G(true);
                yy2.mo15515a(ny22);
                yy2.mo15521g();
            }
        }
    }
}
