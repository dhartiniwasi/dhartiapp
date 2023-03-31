package com.startapp;

import android.net.ConnectivityManager;

/* renamed from: com.startapp.b2 */
/* compiled from: Sta */
public class C8841b2 implements ConnectivityManager.OnNetworkActiveListener {

    /* renamed from: a */
    public final /* synthetic */ C8871c2 f36442a;

    public C8841b2(C8871c2 c2Var) {
        this.f36442a = c2Var;
    }

    public void onNetworkActive() {
        C8871c2 c2Var = this.f36442a;
        synchronized (c2Var.f36564c) {
            for (C8908d3<Void> call : c2Var.f36564c) {
                call.call();
            }
        }
    }
}
