package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.tn */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2890tn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ IOException f18168a;

    /* renamed from: b */
    final /* synthetic */ C3038xn f18169b;

    C2890tn(C3038xn xnVar, IOException iOException) {
        this.f18169b = xnVar;
        this.f18168a = iOException;
    }

    public final void run() {
        this.f18169b.f20243e.mo11762f(this.f18168a);
    }
}
