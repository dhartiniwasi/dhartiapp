package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p060h4.C4473a2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class wr2 extends y13 {

    /* renamed from: a */
    final /* synthetic */ C4473a2 f19765a;

    /* renamed from: b */
    final /* synthetic */ zr2 f19766b;

    wr2(zr2 zr2, C4473a2 a2Var) {
        this.f19766b = zr2;
        this.f19765a = a2Var;
    }

    /* renamed from: f */
    public final void mo10003f() {
        if (this.f19766b.f21259g != null) {
            try {
                this.f19765a.mo18012a();
            } catch (RemoteException e) {
                pm0.m18669i("#007 Could not call remote method.", e);
            }
        }
    }
}
