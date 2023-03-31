package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class no0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f14148a;

    /* renamed from: b */
    final /* synthetic */ oo0 f14149b;

    no0(oo0 oo0, boolean z) {
        this.f14149b = oo0;
        this.f14148a = z;
    }

    public final void run() {
        this.f14149b.m17976o("windowVisibilityChanged", "isVisible", String.valueOf(this.f14148a));
    }
}
