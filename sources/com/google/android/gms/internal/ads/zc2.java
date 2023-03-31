package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p060h4.C4623z2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class zc2 implements z91 {

    /* renamed from: a */
    public final /* synthetic */ nc2 f21053a;

    /* renamed from: b */
    public final /* synthetic */ o80 f21054b;

    public /* synthetic */ zc2(nc2 nc2, o80 o80) {
        this.f21053a = nc2;
        this.f21054b = o80;
    }

    /* renamed from: g */
    public final void mo9420g(C4623z2 z2Var) {
        nc2 nc2 = this.f21053a;
        o80 o80 = this.f21054b;
        nc2.mo9420g(z2Var);
        if (o80 != null) {
            try {
                o80.mo12287l(z2Var);
            } catch (RemoteException e) {
                pm0.m18669i("#007 Could not call remote method.", e);
            }
        }
        if (o80 != null) {
            try {
                o80.mo12288n(z2Var.f25062a);
            } catch (RemoteException e2) {
                pm0.m18669i("#007 Could not call remote method.", e2);
            }
        }
    }
}
