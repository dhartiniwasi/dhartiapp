package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7293a implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f32303a;

    /* renamed from: b */
    final /* synthetic */ long f32304b;

    /* renamed from: c */
    final /* synthetic */ C7296a2 f32305c;

    C7293a(C7296a2 a2Var, String str, long j) {
        this.f32305c = a2Var;
        this.f32303a = str;
        this.f32304b = j;
    }

    public final void run() {
        C7296a2.m41251g(this.f32305c, this.f32303a, this.f32304b);
    }
}
