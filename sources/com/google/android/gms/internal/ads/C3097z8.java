package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z8 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C3097z8 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C2727p9 f21009a;

    /* renamed from: b */
    final /* synthetic */ C2170a9 f21010b;

    C3097z8(C2170a9 a9Var, C2727p9 p9Var) {
        this.f21010b = a9Var;
        this.f21009a = p9Var;
    }

    public final void run() {
        try {
            this.f21010b.f6478b.put(this.f21009a);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
