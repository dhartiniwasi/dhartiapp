package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import p006a4.C0098c;
import p006a4.C0100e;
import p060h4.C4509g2;
import p060h4.C4517h4;
import p060h4.C4565p4;
import p060h4.C4567q0;
import p060h4.C4569q2;
import p060h4.C4571q4;
import p060h4.C4584t;
import p060h4.C4602w;
import p060h4.C4612x3;
import p088l5.C4956b;
import p179z3.C6321a;
import p179z3.C6329e;
import p179z3.C6343m;
import p179z3.C6344n;
import p179z3.C6348r;
import p179z3.C6353v;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class p80 extends C0098c {

    /* renamed from: a */
    private final Context f15735a;

    /* renamed from: b */
    private final C4565p4 f15736b = C4565p4.f24948a;

    /* renamed from: c */
    private final C4567q0 f15737c;

    /* renamed from: d */
    private final String f15738d;

    /* renamed from: e */
    private final nb0 f15739e;

    /* renamed from: f */
    private C0100e f15740f;

    /* renamed from: g */
    private C6343m f15741g;

    /* renamed from: h */
    private C6348r f15742h;

    public p80(Context context, String str) {
        nb0 nb0 = new nb0();
        this.f15739e = nb0;
        this.f15735a = context;
        this.f15738d = str;
        this.f15737c = C4584t.m30035a().mo18128e(context, new C4571q4(), str, nb0);
    }

    /* renamed from: a */
    public final C6353v mo13161a() {
        C4509g2 g2Var = null;
        try {
            C4567q0 q0Var = this.f15737c;
            if (q0Var != null) {
                g2Var = q0Var.mo10856X();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
        return C6353v.m37371g(g2Var);
    }

    /* renamed from: c */
    public final void mo13162c(C6343m mVar) {
        try {
            this.f15741g = mVar;
            C4567q0 q0Var = this.f15737c;
            if (q0Var != null) {
                q0Var.mo10885z4(new C4602w(mVar));
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: d */
    public final void mo13163d(boolean z) {
        try {
            C4567q0 q0Var = this.f15737c;
            if (q0Var != null) {
                q0Var.mo10875o5(z);
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo13164e(C6348r rVar) {
        try {
            this.f15742h = rVar;
            C4567q0 q0Var = this.f15737c;
            if (q0Var != null) {
                q0Var.mo10881x4(new C4612x3(rVar));
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final void mo13165f(Activity activity) {
        if (activity == null) {
            pm0.m18667g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            C4567q0 q0Var = this.f15737c;
            if (q0Var != null) {
                q0Var.mo10876o6(C4956b.m31385o3(activity));
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: h */
    public final void mo247h(C0100e eVar) {
        try {
            this.f15740f = eVar;
            C4567q0 q0Var = this.f15737c;
            if (q0Var != null) {
                q0Var.mo10858Y5(eVar != null ? new C2487is(eVar) : null);
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: i */
    public final void mo13166i(C4569q2 q2Var, C6329e eVar) {
        try {
            C4567q0 q0Var = this.f15737c;
            if (q0Var != null) {
                q0Var.mo10849R0(this.f15736b.mo18106a(this.f15735a, q2Var), new C4517h4(eVar, this));
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
            eVar.mo7703d(new C6344n(0, "Internal Error.", "com.google.android.gms.ads", (C6321a) null, (C6353v) null));
        }
    }
}
