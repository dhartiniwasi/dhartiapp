package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import java.util.concurrent.Executor;
import p060h4.C4541l4;
import p060h4.C4571q4;
import p060h4.C4596v;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ur2 implements dd2 {

    /* renamed from: a */
    private final Context f18705a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f18706b;

    /* renamed from: c */
    private final su0 f18707c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final kr2 f18708d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final up2 f18709e;

    /* renamed from: f */
    private final vs2 f18710f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final az2 f18711g;

    /* renamed from: h */
    private final ct2 f18712h;

    /* renamed from: i */
    private lf3 f18713i;

    public ur2(Context context, Executor executor, su0 su0, up2 up2, kr2 kr2, ct2 ct2, vs2 vs2) {
        this.f18705a = context;
        this.f18706b = executor;
        this.f18707c = su0;
        this.f18709e = up2;
        this.f18708d = kr2;
        this.f18712h = ct2;
        this.f18710f = vs2;
        this.f18711g = su0.mo9709B();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final tr1 m21823j(sp2 sp2) {
        tr1 m = this.f18707c.mo9720m();
        f91 f91 = new f91();
        f91.mo10111c(this.f18705a);
        f91.mo10114f(((tr2) sp2).f18224a);
        f91.mo10113e(this.f18710f);
        m.mo12465b(f91.mo10115g());
        m.mo12466d(new lf1().mo12010q());
        return m;
    }

    /* renamed from: a */
    public final boolean mo9556a(C4541l4 l4Var, String str, bd2 bd2, cd2 cd2) throws RemoteException {
        yy2 yy2;
        vh0 vh0 = new vh0(l4Var, str);
        if (vh0.f19094b == null) {
            pm0.m18664d("Ad unit ID should not be null for rewarded video ad.");
            this.f18706b.execute(new nr2(this));
        } else {
            lf3 lf3 = this.f18713i;
            if (lf3 == null || lf3.isDone()) {
                if (((Boolean) x00.f19923c.mo13438e()).booleanValue()) {
                    up2 up2 = this.f18709e;
                    if (up2.mo8487b() != null) {
                        yy2 U = ((ur1) up2.mo8487b()).mo9828U();
                        U.mo15522h(5);
                        U.mo15516b(vh0.f19093a.f24904x);
                        yy2 = U;
                        yt2.m24195a(this.f18705a, vh0.f19093a.f24894f);
                        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14290E7)).booleanValue() && vh0.f19093a.f24894f) {
                            this.f18707c.mo9722o().mo10042m(true);
                        }
                        ct2 ct2 = this.f18712h;
                        ct2.mo9328J(vh0.f19094b);
                        ct2.mo9327I(C4571q4.m29984L1());
                        ct2.mo9340e(vh0.f19093a);
                        et2 g = ct2.mo9342g();
                        ny2 b = my2.m16826b(this.f18705a, xy2.m23614f(g), 5, vh0.f19093a);
                        tr2 tr2 = new tr2((sr2) null);
                        tr2.f18224a = g;
                        tr2.f18225b = null;
                        lf3 a = this.f18709e.mo8486a(new wp2(tr2, (yg0) null), new or2(this), (Object) null);
                        this.f18713i = a;
                        cf3.m10920r(a, new rr2(this, cd2, yy2, b, tr2), this.f18706b);
                        return true;
                    }
                }
                yy2 = null;
                yt2.m24195a(this.f18705a, vh0.f19093a.f24894f);
                this.f18707c.mo9722o().mo10042m(true);
                ct2 ct22 = this.f18712h;
                ct22.mo9328J(vh0.f19094b);
                ct22.mo9327I(C4571q4.m29984L1());
                ct22.mo9340e(vh0.f19093a);
                et2 g2 = ct22.mo9342g();
                ny2 b2 = my2.m16826b(this.f18705a, xy2.m23614f(g2), 5, vh0.f19093a);
                tr2 tr22 = new tr2((sr2) null);
                tr22.f18224a = g2;
                tr22.f18225b = null;
                lf3 a2 = this.f18709e.mo8486a(new wp2(tr22, (yg0) null), new or2(this), (Object) null);
                this.f18713i = a2;
                cf3.m10920r(a2, new rr2(this, cd2, yy2, b2, tr22), this.f18706b);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo14599h() {
        this.f18708d.mo9420g(eu2.m12271d(6, (String) null, (C4623z2) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo14600i(int i) {
        this.f18712h.mo9324F().mo13033a(i);
    }

    public final boolean zza() {
        throw null;
    }
}
