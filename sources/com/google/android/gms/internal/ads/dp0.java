package com.google.android.gms.internal.ads;

import p073j4.C4751b2;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class dp0 implements Runnable {

    /* renamed from: a */
    private final oo0 f8355a;

    /* renamed from: b */
    private boolean f8356b = false;

    dp0(oo0 oo0) {
        this.f8355a = oo0;
    }

    /* renamed from: c */
    private final void m11588c() {
        b53 b53 = C4751b2.f25403i;
        b53.removeCallbacks(this);
        b53.postDelayed(this, 250);
    }

    /* renamed from: a */
    public final void mo9643a() {
        this.f8356b = true;
        this.f8355a.mo13013y();
    }

    /* renamed from: b */
    public final void mo9644b() {
        this.f8356b = false;
        m11588c();
    }

    public final void run() {
        if (!this.f8356b) {
            this.f8355a.mo13013y();
            m11588c();
        }
    }
}
