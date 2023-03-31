package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.n9 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2653n9 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f13911a;

    /* renamed from: b */
    final /* synthetic */ long f13912b;

    /* renamed from: c */
    final /* synthetic */ C2727p9 f13913c;

    C2653n9(C2727p9 p9Var, String str, long j) {
        this.f13913c = p9Var;
        this.f13911a = str;
        this.f13912b = j;
    }

    public final void run() {
        this.f13913c.f15751a.mo8279a(this.f13911a, this.f13912b);
        C2727p9 p9Var = this.f13913c;
        p9Var.f15751a.mo8280b(p9Var.toString());
    }
}
