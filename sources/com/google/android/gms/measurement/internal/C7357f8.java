package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7357f8 implements Runnable {

    /* renamed from: a */
    final long f32486a;

    /* renamed from: b */
    final long f32487b;

    /* renamed from: c */
    final /* synthetic */ C7368g8 f32488c;

    C7357f8(C7368g8 g8Var, long j, long j2) {
        this.f32488c = g8Var;
        this.f32486a = j;
        this.f32487b = j2;
    }

    public final void run() {
        this.f32488c.f32522b.f32389a.mo24143s().mo24309z(new C7346e8(this));
    }
}
