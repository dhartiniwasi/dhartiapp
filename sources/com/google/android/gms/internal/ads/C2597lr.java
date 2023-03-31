package com.google.android.gms.internal.ads;

import android.view.Surface;

/* renamed from: com.google.android.gms.internal.ads.lr */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2597lr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Surface f12893a;

    /* renamed from: b */
    final /* synthetic */ C2671nr f12894b;

    C2597lr(C2671nr nrVar, Surface surface) {
        this.f12894b = nrVar;
        this.f12893a = surface;
    }

    public final void run() {
        this.f12894b.f14176b.mo11761E(this.f12893a);
    }
}
