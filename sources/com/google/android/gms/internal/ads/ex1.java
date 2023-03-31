package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class ex1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ kx1 f8975a;

    /* renamed from: b */
    public final /* synthetic */ z70 f8976b;

    public /* synthetic */ ex1(kx1 kx1, z70 z70) {
        this.f8975a = kx1;
        this.f8976b = z70;
    }

    public final void run() {
        kx1 kx1 = this.f8975a;
        try {
            this.f8976b.mo15060X4(kx1.mo11802g());
        } catch (RemoteException e) {
            pm0.m18665e("", e);
        }
    }
}
