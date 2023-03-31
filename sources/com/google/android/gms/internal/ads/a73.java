package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class a73 implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ b73 f6458a;

    /* synthetic */ a73(b73 b73, z63 z63) {
        this.f6458a = b73;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f6458a.f7136b.mo13479d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        b73 b73 = this.f6458a;
        b73.mo8686c().post(new x63(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f6458a.f7136b.mo13479d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        b73 b73 = this.f6458a;
        b73.mo8686c().post(new y63(this));
    }
}
