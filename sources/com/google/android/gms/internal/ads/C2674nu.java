package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.nu */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class C2674nu implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ in0 f14195a;

    /* renamed from: b */
    public final /* synthetic */ Future f14196b;

    public /* synthetic */ C2674nu(in0 in0, Future future) {
        this.f14195a = in0;
        this.f14196b = future;
    }

    public final void run() {
        in0 in0 = this.f14195a;
        Future future = this.f14196b;
        if (in0.isCancelled()) {
            future.cancel(true);
        }
    }
}
