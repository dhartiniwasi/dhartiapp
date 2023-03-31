package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.Executor;
import p060h4.C4527j2;
import p060h4.C4567q0;
import p060h4.C4571q4;
import p060h4.C4596v;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class u31 extends r31 {

    /* renamed from: i */
    private final Context f18337i;

    /* renamed from: j */
    private final View f18338j;

    /* renamed from: k */
    private final vs0 f18339k;

    /* renamed from: l */
    private final js2 f18340l;

    /* renamed from: m */
    private final t51 f18341m;

    /* renamed from: n */
    private final jm1 f18342n;

    /* renamed from: o */
    private final sh1 f18343o;

    /* renamed from: p */
    private final v34 f18344p;

    /* renamed from: q */
    private final Executor f18345q;

    /* renamed from: r */
    private C4571q4 f18346r;

    u31(u51 u51, Context context, js2 js2, View view, vs0 vs0, t51 t51, jm1 jm1, sh1 sh1, v34 v34, Executor executor) {
        super(u51);
        this.f18337i = context;
        this.f18338j = view;
        this.f18339k = vs0;
        this.f18340l = js2;
        this.f18341m = t51;
        this.f18342n = jm1;
        this.f18343o = sh1;
        this.f18344p = v34;
        this.f18345q = executor;
    }

    /* renamed from: o */
    public static /* synthetic */ void m21388o(u31 u31) {
        jm1 jm1 = u31.f18342n;
        if (jm1.mo11443e() != null) {
            try {
                jm1.mo11443e().mo8668b5((C4567q0) u31.f18344p.mo8155d(), C4956b.m31385o3(u31.f18337i));
            } catch (RemoteException e) {
                pm0.m18665e("RemoteException when notifyAdLoad is called", e);
            }
        }
    }

    /* renamed from: b */
    public final void mo8205b() {
        this.f18345q.execute(new t31(this));
        super.mo8205b();
    }

    /* renamed from: h */
    public final int mo8206h() {
        if (((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14339J6)).booleanValue() && this.f18930b.f10985i0) {
            if (!((Boolean) C4596v.m30088c().mo12227b(C2679nz.f14349K6)).booleanValue()) {
                return 0;
            }
        }
        return this.f18929a.f18723b.f18244b.f12931c;
    }

    /* renamed from: i */
    public final View mo8207i() {
        return this.f18338j;
    }

    /* renamed from: j */
    public final C4527j2 mo8208j() {
        try {
            return this.f18341m.zza();
        } catch (jt2 unused) {
            return null;
        }
    }

    /* renamed from: k */
    public final js2 mo8209k() {
        C4571q4 q4Var = this.f18346r;
        if (q4Var != null) {
            return it2.m14550c(q4Var);
        }
        is2 is2 = this.f18930b;
        if (is2.f10975d0) {
            for (String str : is2.f10968a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new js2(this.f18338j.getWidth(), this.f18338j.getHeight(), false);
        }
        return it2.m14549b(this.f18930b.f11002s, this.f18340l);
    }

    /* renamed from: l */
    public final js2 mo8210l() {
        return this.f18340l;
    }

    /* renamed from: m */
    public final void mo8211m() {
        this.f18343o.zza();
    }

    /* renamed from: n */
    public final void mo8212n(ViewGroup viewGroup, C4571q4 q4Var) {
        vs0 vs0;
        if (viewGroup != null && (vs0 = this.f18339k) != null) {
            vs0.mo12100Z0(mu0.m16710c(q4Var));
            viewGroup.setMinimumHeight(q4Var.f24974c);
            viewGroup.setMinimumWidth(q4Var.f24977f);
            this.f18346r = q4Var;
        }
    }
}
