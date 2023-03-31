package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.p5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7464p5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f32861a;

    /* renamed from: b */
    final /* synthetic */ String f32862b;

    /* renamed from: c */
    final /* synthetic */ Object f32863c;

    /* renamed from: d */
    final /* synthetic */ long f32864d;

    /* renamed from: e */
    final /* synthetic */ C7388i6 f32865e;

    C7464p5(C7388i6 i6Var, String str, String str2, Object obj, long j) {
        this.f32865e = i6Var;
        this.f32861a = str;
        this.f32862b = str2;
        this.f32863c = obj;
        this.f32864d = j;
    }

    public final void run() {
        this.f32865e.mo24335M(this.f32861a, this.f32862b, this.f32863c, this.f32864d);
    }
}
