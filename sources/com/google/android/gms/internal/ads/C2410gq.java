package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.gq */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2410gq {

    /* renamed from: a */
    private boolean f10034a;

    /* renamed from: a */
    public final synchronized void mo10616a() throws InterruptedException {
        while (!this.f10034a) {
            wait();
        }
    }

    /* renamed from: b */
    public final synchronized boolean mo10617b() {
        boolean z;
        z = this.f10034a;
        this.f10034a = false;
        return z;
    }

    /* renamed from: c */
    public final synchronized boolean mo10618c() {
        if (this.f10034a) {
            return false;
        }
        this.f10034a = true;
        notifyAll();
        return true;
    }
}
