package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import p016b4.C1781a;
import p060h4.C4509g2;
import p060h4.C4612x3;
import p088l5.C4956b;
import p179z3.C6343m;
import p179z3.C6348r;
import p179z3.C6353v;

/* renamed from: com.google.android.gms.internal.ads.kt */
/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class C2562kt extends C1781a {

    /* renamed from: a */
    private final C2710ot f12281a;

    /* renamed from: b */
    private final String f12282b;

    /* renamed from: c */
    private final C2599lt f12283c = new C2599lt();

    /* renamed from: d */
    C6343m f12284d;

    /* renamed from: e */
    private C6348r f12285e;

    public C2562kt(C2710ot otVar, String str) {
        this.f12281a = otVar;
        this.f12282b = str;
    }

    /* renamed from: a */
    public final C6353v mo6907a() {
        C4509g2 g2Var;
        try {
            g2Var = this.f12281a.mo11560T();
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
            g2Var = null;
        }
        return C6353v.m37371g(g2Var);
    }

    /* renamed from: d */
    public final void mo6908d(C6343m mVar) {
        this.f12284d = mVar;
        this.f12283c.mo12080I6(mVar);
    }

    /* renamed from: e */
    public final void mo6909e(boolean z) {
        try {
            this.f12281a.mo11563p6(z);
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final void mo6910f(C6348r rVar) {
        this.f12285e = rVar;
        try {
            this.f12281a.mo11559H2(new C4612x3(rVar));
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: g */
    public final void mo6911g(Activity activity) {
        try {
            this.f12281a.mo11564y4(C4956b.m31385o3(activity), this.f12283c);
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }
}
