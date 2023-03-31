package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class wp1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ yp1 f19734a;

    public /* synthetic */ wp1(yp1 yp1) {
        this.f19734a = yp1;
    }

    public final void run() {
        try {
            this.f19734a.mo11051b();
        } catch (RemoteException e) {
            pm0.m18669i("#007 Could not call remote method.", e);
        }
    }
}
