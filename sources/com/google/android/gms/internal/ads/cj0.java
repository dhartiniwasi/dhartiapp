package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import p060h4.C4509g2;
import p060h4.C4565p4;
import p060h4.C4569q2;
import p060h4.C4584t;
import p060h4.C4606w3;
import p060h4.C4612x3;
import p088l5.C4956b;
import p129r4.C5454a;
import p129r4.C5458e;
import p136s4.C5481a;
import p136s4.C5482b;
import p179z3.C6343m;
import p179z3.C6348r;
import p179z3.C6349s;
import p179z3.C6353v;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class cj0 extends C5481a {

    /* renamed from: a */
    private final String f7766a;

    /* renamed from: b */
    private final ii0 f7767b;

    /* renamed from: c */
    private final Context f7768c;

    /* renamed from: d */
    private final aj0 f7769d = new aj0();

    /* renamed from: e */
    private C6343m f7770e;

    /* renamed from: f */
    private C5454a f7771f;

    /* renamed from: g */
    private C6348r f7772g;

    public cj0(Context context, String str) {
        this.f7766a = str;
        this.f7768c = context.getApplicationContext();
        this.f7767b = C4584t.m30035a().mo18132m(context, str, new nb0());
    }

    /* renamed from: a */
    public final C6353v mo9189a() {
        C4509g2 g2Var = null;
        try {
            ii0 ii0 = this.f7767b;
            if (ii0 != null) {
                g2Var = ii0.mo10541e();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
        return C6353v.m37371g(g2Var);
    }

    /* renamed from: d */
    public final void mo9190d(C6343m mVar) {
        this.f7770e = mVar;
        this.f7769d.mo8392I6(mVar);
    }

    /* renamed from: e */
    public final void mo9191e(boolean z) {
        try {
            ii0 ii0 = this.f7767b;
            if (ii0 != null) {
                ii0.mo10543u0(z);
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final void mo9192f(C5454a aVar) {
        this.f7771f = aVar;
        try {
            ii0 ii0 = this.f7767b;
            if (ii0 != null) {
                ii0.mo10542s3(new C4606w3(aVar));
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: g */
    public final void mo9193g(C6348r rVar) {
        this.f7772g = rVar;
        try {
            ii0 ii0 = this.f7767b;
            if (ii0 != null) {
                ii0.mo10538V3(new C4612x3(rVar));
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: h */
    public final void mo9194h(C5458e eVar) {
        try {
            ii0 ii0 = this.f7767b;
            if (ii0 != null) {
                ii0.mo10544u4(new wi0(eVar));
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: i */
    public final void mo9195i(Activity activity, C6349s sVar) {
        this.f7769d.mo8393J6(sVar);
        try {
            ii0 ii0 = this.f7767b;
            if (ii0 != null) {
                ii0.mo10540d6(this.f7769d);
                this.f7767b.mo10537V0(C4956b.m31385o3(activity));
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: j */
    public final void mo9196j(C4569q2 q2Var, C5482b bVar) {
        try {
            ii0 ii0 = this.f7767b;
            if (ii0 != null) {
                ii0.mo10536H4(C4565p4.f24948a.mo18106a(this.f7768c, q2Var), new bj0(bVar, this));
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }
}
