package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class xn0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f20257a;

    /* renamed from: b */
    final /* synthetic */ String f20258b;

    /* renamed from: c */
    final /* synthetic */ eo0 f20259c;

    xn0(eo0 eo0, String str, String str2) {
        this.f20259c = eo0;
        this.f20257a = str;
        this.f20258b = str2;
    }

    public final void run() {
        eo0 eo0 = this.f20259c;
        if (eo0.f8879y != null) {
            eo0.f8879y.mo10229k(this.f20257a, this.f20258b);
        }
    }
}
