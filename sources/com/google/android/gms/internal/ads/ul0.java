package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ul0 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    final /* synthetic */ xl0 f18604a;

    ul0(xl0 xl0) {
        this.f18604a = xl0;
    }

    public final void onAvailable(Network network) {
        this.f18604a.f20170m.set(true);
    }

    public final void onLost(Network network) {
        this.f18604a.f20170m.set(false);
    }
}
