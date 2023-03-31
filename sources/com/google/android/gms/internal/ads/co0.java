package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class co0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ eo0 f7846a;

    co0(eo0 eo0) {
        this.f7846a = eo0;
    }

    public final void run() {
        eo0 eo0 = this.f7846a;
        if (eo0.f8879y != null) {
            if (!eo0.f8880z) {
                eo0.f8879y.mo10228c();
                this.f7846a.f8880z = true;
            }
            this.f7846a.f8879y.mo10226a();
        }
    }
}
