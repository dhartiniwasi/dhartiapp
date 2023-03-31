package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import p060h4.C4541l4;
import p060h4.C4571q4;
import p060h4.C4596v;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jq2 implements dd2 {

    /* renamed from: a */
    private final Context f11743a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f11744b;

    /* renamed from: c */
    private final su0 f11745c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final nc2 f11746d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final kr2 f11747e;

    /* renamed from: f */
    private i00 f11748f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final az2 f11749g;

    /* renamed from: h */
    private final ct2 f11750h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public lf3 f11751i;

    public jq2(Context context, Executor executor, su0 su0, nc2 nc2, kr2 kr2, ct2 ct2) {
        this.f11743a = context;
        this.f11744b = executor;
        this.f11745c = su0;
        this.f11746d = nc2;
        this.f11750h = ct2;
        this.f11747e = kr2;
        this.f11749g = su0.mo9709B();
    }

    /* renamed from: a */
    public final boolean mo9556a(C4541l4 l4Var, String str, bd2 bd2, cd2 cd2) {
        mj1 T;
        yy2 yy2;
        if (str == null) {
            pm0.m18664d("Ad unit ID should not be null for interstitial ad.");
            this.f11744b.execute(new dq2(this));
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14290E7)).booleanValue() && l4Var.f24894f) {
                this.f11745c.mo9722o().mo10042m(true);
            }
            C4571q4 q4Var = ((cq2) bd2).f7875a;
            ct2 ct2 = this.f11750h;
            ct2.mo9328J(str);
            ct2.mo9327I(q4Var);
            ct2.mo9340e(l4Var);
            et2 g = ct2.mo9342g();
            ny2 b = my2.m16826b(this.f11743a, xy2.m23614f(g), 4, l4Var);
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14505a7)).booleanValue()) {
                lj1 k = this.f11745c.mo9718k();
                f91 f91 = new f91();
                f91.mo10111c(this.f11743a);
                f91.mo10114f(g);
                k.mo12030i(f91.mo10115g());
                lf1 lf1 = new lf1();
                lf1.mo12006m(this.f11746d, this.f11744b);
                lf1.mo12007n(this.f11746d, this.f11744b);
                k.mo12031l(lf1.mo12010q());
                k.mo12032q(new va2(this.f11748f));
                T = k.mo12029T();
            } else {
                lf1 lf12 = new lf1();
                kr2 kr2 = this.f11747e;
                if (kr2 != null) {
                    lf12.mo12001h(kr2, this.f11744b);
                    lf12.mo12002i(this.f11747e, this.f11744b);
                    lf12.mo11998e(this.f11747e, this.f11744b);
                }
                lj1 k2 = this.f11745c.mo9718k();
                f91 f912 = new f91();
                f912.mo10111c(this.f11743a);
                f912.mo10114f(g);
                k2.mo12030i(f912.mo10115g());
                lf12.mo12006m(this.f11746d, this.f11744b);
                lf12.mo12001h(this.f11746d, this.f11744b);
                lf12.mo12002i(this.f11746d, this.f11744b);
                lf12.mo11998e(this.f11746d, this.f11744b);
                lf12.mo11997d(this.f11746d, this.f11744b);
                lf12.mo12008o(this.f11746d, this.f11744b);
                lf12.mo12007n(this.f11746d, this.f11744b);
                lf12.mo12005l(this.f11746d, this.f11744b);
                lf12.mo11999f(this.f11746d, this.f11744b);
                k2.mo12031l(lf12.mo12010q());
                k2.mo12032q(new va2(this.f11748f));
                T = k2.mo12029T();
            }
            mj1 mj1 = T;
            if (((Boolean) x00.f19923c.mo13438e()).booleanValue()) {
                yy2 d = mj1.mo12363d();
                d.mo15522h(4);
                d.mo15516b(l4Var.f24904x);
                yy2 = d;
            } else {
                yy2 = null;
            }
            a71 a = mj1.mo12360a();
            lf3 h = a.mo8237h(a.mo8238i());
            this.f11751i = h;
            cf3.m10920r(h, new iq2(this, cd2, yy2, b, mj1), this.f11744b);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo11479g() {
        this.f11746d.mo9420g(eu2.m12271d(6, (String) null, (C4623z2) null));
    }

    /* renamed from: h */
    public final void mo11480h(i00 i00) {
        this.f11748f = i00;
    }

    public final boolean zza() {
        lf3 lf3 = this.f11751i;
        return lf3 != null && !lf3.isDone();
    }
}
