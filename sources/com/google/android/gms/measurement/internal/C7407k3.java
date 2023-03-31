package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: com.google.android.gms.measurement.internal.k3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7407k3 extends C7478q8 {
    public C7407k3(C7303a9 a9Var) {
        super(a9Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo24151j() {
        return false;
    }

    /* renamed from: k */
    public final boolean mo24457k() {
        mo24623g();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f32389a.mo24121d().getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
