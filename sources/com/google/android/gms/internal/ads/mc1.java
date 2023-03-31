package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class mc1 implements Runnable {

    /* renamed from: a */
    private final WeakReference f13304a;

    /* synthetic */ mc1(nc1 nc1, lc1 lc1) {
        this.f13304a = new WeakReference(nc1);
    }

    public final void run() {
        nc1 nc1 = (nc1) this.f13304a.get();
        if (nc1 != null) {
            nc1.mo11671o0(kc1.f12014a);
        }
    }
}
