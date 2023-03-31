package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zn0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f21176a;

    /* renamed from: b */
    final /* synthetic */ int f21177b;

    /* renamed from: c */
    final /* synthetic */ eo0 f21178c;

    zn0(eo0 eo0, int i, int i2) {
        this.f21178c = eo0;
        this.f21176a = i;
        this.f21177b = i2;
    }

    public final void run() {
        eo0 eo0 = this.f21178c;
        if (eo0.f8879y != null) {
            eo0.f8879y.mo10221H0(this.f21176a, this.f21177b);
        }
    }
}
