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
import p129r4.C5456c;
import p129r4.C5457d;
import p129r4.C5458e;
import p179z3.C6343m;
import p179z3.C6348r;
import p179z3.C6349s;
import p179z3.C6353v;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public final class ri0 extends C5456c {

    /* renamed from: a */
    private final String f16959a;

    /* renamed from: b */
    private final ii0 f16960b;

    /* renamed from: c */
    private final Context f16961c;

    /* renamed from: d */
    private final aj0 f16962d = new aj0();

    /* renamed from: e */
    private C5454a f16963e;

    /* renamed from: f */
    private C6348r f16964f;

    /* renamed from: g */
    private C6343m f16965g;

    public ri0(Context context, String str) {
        this.f16961c = context.getApplicationContext();
        this.f16959a = str;
        this.f16960b = C4584t.m30035a().mo18132m(context, str, new nb0());
    }

    /* renamed from: a */
    public final C6353v mo13804a() {
        C4509g2 g2Var = null;
        try {
            ii0 ii0 = this.f16960b;
            if (ii0 != null) {
                g2Var = ii0.mo10541e();
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
        return C6353v.m37371g(g2Var);
    }

    /* renamed from: d */
    public final void mo13805d(C6343m mVar) {
        this.f16965g = mVar;
        this.f16962d.mo8392I6(mVar);
    }

    /* renamed from: e */
    public final void mo13806e(boolean z) {
        try {
            ii0 ii0 = this.f16960b;
            if (ii0 != null) {
                ii0.mo10543u0(z);
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: f */
    public final void mo13807f(C5454a aVar) {
        try {
            this.f16963e = aVar;
            ii0 ii0 = this.f16960b;
            if (ii0 != null) {
                ii0.mo10542s3(new C4606w3(aVar));
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: g */
    public final void mo13808g(C6348r rVar) {
        try {
            this.f16964f = rVar;
            ii0 ii0 = this.f16960b;
            if (ii0 != null) {
                ii0.mo10538V3(new C4612x3(rVar));
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: h */
    public final void mo13809h(C5458e eVar) {
        if (eVar != null) {
            try {
                ii0 ii0 = this.f16960b;
                if (ii0 != null) {
                    ii0.mo10544u4(new wi0(eVar));
                }
            } catch (RemoteException e) {
                pm0.m18669i("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: i */
    public final void mo13810i(Activity activity, C6349s sVar) {
        this.f16962d.mo8393J6(sVar);
        if (activity == null) {
            pm0.m18667g("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            ii0 ii0 = this.f16960b;
            if (ii0 != null) {
                ii0.mo10540d6(this.f16962d);
                this.f16960b.mo10537V0(C4956b.m31385o3(activity));
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: j */
    public final void mo13811j(C4569q2 q2Var, C5457d dVar) {
        try {
            ii0 ii0 = this.f16960b;
            if (ii0 != null) {
                ii0.mo10539Y3(C4565p4.f24948a.mo18106a(this.f16961c, q2Var), new vi0(dVar, this));
            }
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }
}
