package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import java.util.concurrent.ScheduledExecutorService;
import p053g4.C4409t;
import p060h4.C4541l4;
import p060h4.C4596v;
import p060h4.C4609x0;
import p060h4.C4623z2;
import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ld2 implements dd2 {

    /* renamed from: a */
    private final ct2 f12740a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final su0 f12741b;

    /* renamed from: c */
    private final Context f12742c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ad2 f12743d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final az2 f12744e;

    /* renamed from: f */
    private j61 f12745f;

    public ld2(su0 su0, Context context, ad2 ad2, ct2 ct2) {
        this.f12741b = su0;
        this.f12742c = context;
        this.f12743d = ad2;
        this.f12740a = ct2;
        this.f12744e = su0.mo9709B();
        ct2.mo9330L(ad2.mo8313d());
    }

    /* renamed from: a */
    public final boolean mo9556a(C4541l4 l4Var, String str, bd2 bd2, cd2 cd2) throws RemoteException {
        yy2 yy2;
        C4409t.m29326r();
        if (C4751b2.m30609d(this.f12742c) && l4Var.f24883A == null) {
            pm0.m18664d("Failed to load the ad because app ID is missing.");
            this.f12741b.mo9711b().execute(new fd2(this));
            return false;
        } else if (str == null) {
            pm0.m18664d("Ad unit ID should not be null for NativeAdLoader.");
            this.f12741b.mo9711b().execute(new gd2(this));
            return false;
        } else {
            yt2.m24195a(this.f12742c, l4Var.f24894f);
            if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14290E7)).booleanValue() && l4Var.f24894f) {
                this.f12741b.mo9722o().mo10042m(true);
            }
            int i = ((ed2) bd2).f8742a;
            ct2 ct2 = this.f12740a;
            ct2.mo9340e(l4Var);
            ct2.mo9335Q(i);
            et2 g = ct2.mo9342g();
            ny2 b = my2.m16826b(this.f12742c, xy2.m23614f(g), 8, l4Var);
            C4609x0 x0Var = g.f8943n;
            if (x0Var != null) {
                this.f12743d.mo8313d().mo12586p(x0Var);
            }
            ik1 l = this.f12741b.mo9719l();
            f91 f91 = new f91();
            f91.mo10111c(this.f12742c);
            f91.mo10114f(g);
            l.mo11144g(f91.mo10115g());
            lf1 lf1 = new lf1();
            lf1.mo12007n(this.f12743d.mo8313d(), this.f12741b.mo9711b());
            l.mo11145k(lf1.mo12010q());
            l.mo11142e(this.f12743d.mo8312c());
            l.mo11143f(new n31((ViewGroup) null));
            jk1 c = l.mo11141c();
            if (((Boolean) x00.f19923c.mo13438e()).booleanValue()) {
                yy2 e = c.mo11420e();
                e.mo15522h(8);
                e.mo15516b(l4Var.f24904x);
                yy2 = e;
            } else {
                yy2 = null;
            }
            this.f12741b.mo9733z().mo8948c(1);
            mf3 mf3 = dn0.f8325a;
            j44.m14699b(mf3);
            ScheduledExecutorService c2 = this.f12741b.mo9712c();
            a71 a = c.mo11416a();
            j61 j61 = new j61(mf3, c2, a.mo8237h(a.mo8238i()));
            this.f12745f = j61;
            j61.mo11330e(new kd2(this, cd2, yy2, b, c));
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo11977e() {
        this.f12743d.mo8310a().mo9420g(eu2.m12271d(4, (String) null, (C4623z2) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo11978f() {
        this.f12743d.mo8310a().mo9420g(eu2.m12271d(6, (String) null, (C4623z2) null));
    }

    public final boolean zza() {
        j61 j61 = this.f12745f;
        return j61 != null && j61.mo11331f();
    }
}
