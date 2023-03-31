package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ls */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2598ls implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2635ms f12902a;

    C2598ls(C2635ms msVar) {
        this.f12902a = msVar;
    }

    public final void run() {
        synchronized (this.f12902a.f13467c) {
            C2635ms msVar = this.f12902a;
            if (!msVar.f13468d || !msVar.f13469e) {
                pm0.m18662b("App is still foreground");
            } else {
                msVar.f13468d = false;
                pm0.m18662b("App went background");
                for (C2672ns b : this.f12902a.f13470f) {
                    try {
                        b.mo9213b(false);
                    } catch (Exception e) {
                        pm0.m18665e("", e);
                    }
                }
            }
        }
    }
}
