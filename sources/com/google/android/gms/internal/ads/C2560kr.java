package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kr */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2560kr implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f12246a;

    /* renamed from: b */
    final /* synthetic */ int f12247b;

    /* renamed from: c */
    final /* synthetic */ int f12248c;

    /* renamed from: d */
    final /* synthetic */ float f12249d;

    /* renamed from: e */
    final /* synthetic */ C2671nr f12250e;

    C2560kr(C2671nr nrVar, int i, int i2, int i3, float f) {
        this.f12250e = nrVar;
        this.f12246a = i;
        this.f12247b = i2;
        this.f12248c = i3;
        this.f12249d = f;
    }

    public final void run() {
        this.f12250e.f14176b.mo11764g(this.f12246a, this.f12247b, this.f12248c, this.f12249d);
    }
}
