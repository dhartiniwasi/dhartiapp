package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import p053g4.C4409t;
import p060h4.C4471a0;
import p060h4.C4489d0;
import p060h4.C4541l4;
import p060h4.C4571q4;
import p060h4.C4596v;
import p060h4.C4623z2;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class no2 implements dd2 {

    /* renamed from: a */
    private final Context f14153a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f14154b;

    /* renamed from: c */
    private final su0 f14155c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final nc2 f14156d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final rc2 f14157e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ViewGroup f14158f;

    /* renamed from: g */
    private i00 f14159g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final nc1 f14160h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final az2 f14161i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final ve1 f14162j;

    /* renamed from: k */
    private final ct2 f14163k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public lf3 f14164l;

    public no2(Context context, Executor executor, C4571q4 q4Var, su0 su0, nc2 nc2, rc2 rc2, ct2 ct2, ve1 ve1) {
        this.f14153a = context;
        this.f14154b = executor;
        this.f14155c = su0;
        this.f14156d = nc2;
        this.f14157e = rc2;
        this.f14163k = ct2;
        this.f14160h = su0.mo9717j();
        this.f14161i = su0.mo9709B();
        this.f14158f = new FrameLayout(context);
        this.f14162j = ve1;
        ct2.mo9327I(q4Var);
    }

    /* renamed from: a */
    public final boolean mo9556a(C4541l4 l4Var, String str, bd2 bd2, cd2 cd2) throws RemoteException {
        o41 o41;
        yy2 yy2;
        if (str == null) {
            pm0.m18664d("Ad unit ID should not be null for banner ad.");
            this.f14154b.execute(new jo2(this));
            return false;
        } else if (zza()) {
            return false;
        } else {
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14290E7)).booleanValue() && l4Var.f24894f) {
                this.f14155c.mo9722o().mo10042m(true);
            }
            ct2 ct2 = this.f14163k;
            ct2.mo9328J(str);
            ct2.mo9340e(l4Var);
            et2 g = ct2.mo9342g();
            ny2 b = my2.m16826b(this.f14153a, xy2.m23614f(g), 3, l4Var);
            if (!((Boolean) j10.f11172c.mo13438e()).booleanValue() || !this.f14163k.mo9347x().f24982s) {
                if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14486Y6)).booleanValue()) {
                    n41 i = this.f14155c.mo9716i();
                    f91 f91 = new f91();
                    f91.mo10111c(this.f14153a);
                    f91.mo10114f(g);
                    i.mo12530p(f91.mo10115g());
                    lf1 lf1 = new lf1();
                    lf1.mo12006m(this.f14156d, this.f14154b);
                    lf1.mo12007n(this.f14156d, this.f14154b);
                    i.mo12527h(lf1.mo12010q());
                    i.mo12529o(new va2(this.f14159g));
                    i.mo12525e(new dk1(jm1.f11705h, (C4489d0) null));
                    i.mo12528n(new m51(this.f14160h, this.f14162j));
                    i.mo12526f(new n31(this.f14158f));
                    o41 = i.mo12524W();
                } else {
                    n41 i2 = this.f14155c.mo9716i();
                    f91 f912 = new f91();
                    f912.mo10111c(this.f14153a);
                    f912.mo10114f(g);
                    i2.mo12530p(f912.mo10115g());
                    lf1 lf12 = new lf1();
                    lf12.mo12006m(this.f14156d, this.f14154b);
                    lf12.mo11997d(this.f14156d, this.f14154b);
                    lf12.mo11997d(this.f14157e, this.f14154b);
                    lf12.mo12008o(this.f14156d, this.f14154b);
                    lf12.mo12000g(this.f14156d, this.f14154b);
                    lf12.mo12001h(this.f14156d, this.f14154b);
                    lf12.mo12002i(this.f14156d, this.f14154b);
                    lf12.mo11998e(this.f14156d, this.f14154b);
                    lf12.mo12007n(this.f14156d, this.f14154b);
                    lf12.mo12005l(this.f14156d, this.f14154b);
                    i2.mo12527h(lf12.mo12010q());
                    i2.mo12529o(new va2(this.f14159g));
                    i2.mo12525e(new dk1(jm1.f11705h, (C4489d0) null));
                    i2.mo12528n(new m51(this.f14160h, this.f14162j));
                    i2.mo12526f(new n31(this.f14158f));
                    o41 = i2.mo12524W();
                }
                o41 o412 = o41;
                if (((Boolean) x00.f19923c.mo13438e()).booleanValue()) {
                    yy2 f = o412.mo8575f();
                    f.mo15522h(3);
                    f.mo15516b(l4Var.f24904x);
                    yy2 = f;
                } else {
                    yy2 = null;
                }
                a71 d = o412.mo8573d();
                lf3 h = d.mo8237h(d.mo8238i());
                this.f14164l = h;
                cf3.m10920r(h, new mo2(this, cd2, yy2, b, o412), this.f14154b);
                return true;
            }
            nc2 nc2 = this.f14156d;
            if (nc2 != null) {
                nc2.mo9420g(eu2.m12271d(7, (String) null, (C4623z2) null));
            }
            return false;
        }
    }

    /* renamed from: c */
    public final ViewGroup mo12682c() {
        return this.f14158f;
    }

    /* renamed from: h */
    public final ct2 mo12683h() {
        return this.f14163k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ void mo12684l() {
        this.f14156d.mo9420g(eu2.m12271d(6, (String) null, (C4623z2) null));
    }

    /* renamed from: m */
    public final void mo12685m() {
        this.f14160h.mo12578p0(this.f14162j.mo14741a());
    }

    /* renamed from: n */
    public final void mo12686n(C4471a0 a0Var) {
        this.f14157e.mo13778a(a0Var);
    }

    /* renamed from: o */
    public final void mo12687o(oc1 oc1) {
        this.f14160h.mo11669m0(oc1, this.f14154b);
    }

    /* renamed from: p */
    public final void mo12688p(i00 i00) {
        this.f14159g = i00;
    }

    /* renamed from: q */
    public final boolean mo12689q() {
        ViewParent parent = this.f14158f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        C4409t.m29326r();
        return C4751b2.m30624s(view, view.getContext());
    }

    public final boolean zza() {
        lf3 lf3 = this.f14164l;
        return lf3 != null && !lf3.isDone();
    }
}
