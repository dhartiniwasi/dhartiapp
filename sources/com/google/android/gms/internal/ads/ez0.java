package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class ez0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ gz0 f9034a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f9035b;

    public /* synthetic */ ez0(gz0 gz0, Runnable runnable) {
        this.f9034a = gz0;
        this.f9035b = runnable;
    }

    public final void run() {
        dn0.f8329e.execute(new fz0(this.f9034a, this.f9035b));
    }
}
