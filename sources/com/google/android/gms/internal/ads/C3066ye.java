package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* renamed from: com.google.android.gms.internal.ads.ye */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C3066ye extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ C3103ze f20566a;

    C3066ye(C3103ze zeVar) {
        this.f20566a = zeVar;
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (C3103ze.class) {
            this.f20566a.f21066a = networkCapabilities;
        }
    }

    public final void onLost(Network network) {
        synchronized (C3103ze.class) {
            this.f20566a.f21066a = null;
        }
    }
}
