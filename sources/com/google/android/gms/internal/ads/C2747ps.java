package com.google.android.gms.internal.ads;

import android.view.View;

/* renamed from: com.google.android.gms.internal.ads.ps */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2747ps implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f15982a;

    /* renamed from: b */
    final /* synthetic */ C2895ts f15983b;

    C2747ps(C2895ts tsVar, View view) {
        this.f15983b = tsVar;
        this.f15982a = view;
    }

    public final void run() {
        this.f15983b.mo14370c(this.f15982a);
    }
}
