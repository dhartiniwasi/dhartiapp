package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.y */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7554y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f33192a;

    /* renamed from: b */
    final /* synthetic */ long f33193b;

    /* renamed from: c */
    final /* synthetic */ C7296a2 f33194c;

    C7554y(C7296a2 a2Var, String str, long j) {
        this.f33194c = a2Var;
        this.f33192a = str;
        this.f33193b = j;
    }

    public final void run() {
        C7296a2.m41252h(this.f33194c, this.f33192a, this.f33193b);
    }
}
