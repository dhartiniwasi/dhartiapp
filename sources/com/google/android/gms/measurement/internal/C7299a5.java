package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a5 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7299a5 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f32316a;

    /* renamed from: b */
    final /* synthetic */ String f32317b;

    /* renamed from: c */
    final /* synthetic */ String f32318c;

    /* renamed from: d */
    final /* synthetic */ long f32319d;

    /* renamed from: e */
    final /* synthetic */ C7310b5 f32320e;

    C7299a5(C7310b5 b5Var, String str, String str2, String str3, long j) {
        this.f32320e = b5Var;
        this.f32316a = str;
        this.f32317b = str2;
        this.f32318c = str3;
        this.f32319d = j;
    }

    public final void run() {
        String str = this.f32316a;
        if (str == null) {
            this.f32320e.f32369a.mo24147w(this.f32317b, (C7454o6) null);
            return;
        }
        this.f32320e.f32369a.mo24147w(this.f32317b, new C7454o6(this.f32318c, str, this.f32319d));
    }
}
