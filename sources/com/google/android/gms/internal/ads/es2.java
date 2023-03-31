package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import p060h4.C4591u0;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class es2 extends y13 {

    /* renamed from: a */
    final /* synthetic */ C4591u0 f8914a;

    /* renamed from: b */
    final /* synthetic */ fs2 f8915b;

    es2(fs2 fs2, C4591u0 u0Var) {
        this.f8915b = fs2;
        this.f8914a = u0Var;
    }

    /* renamed from: f */
    public final void mo10003f() {
        if (this.f8915b.f9444d != null) {
            try {
                this.f8914a.mo18140a();
            } catch (RemoteException e) {
                pm0.m18669i("#007 Could not call remote method.", e);
            }
        }
    }
}
