package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p060h4.C4541l4;
import p088l5.C4956b;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class xw1 implements gw1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f20374a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final lw1 f20375b;

    /* renamed from: c */
    private final zr2 f20376c;

    xw1(long j, Context context, lw1 lw1, su0 su0, String str) {
        this.f20374a = j;
        this.f20375b = lw1;
        bs2 x = su0.mo9731x();
        x.mo8925a(context);
        x.mo8927f(str);
        this.f20376c = x.mo8926e().zza();
    }

    /* renamed from: a */
    public final void mo10654a(C4541l4 l4Var) {
        try {
            this.f20376c.mo10539Y3(l4Var, new vw1(this));
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: e */
    public final void mo10655e() {
        try {
            this.f20376c.mo10540d6(new ww1(this));
            this.f20376c.mo10537V0(C4956b.m31385o3(null));
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }

    public final void zza() {
    }
}
