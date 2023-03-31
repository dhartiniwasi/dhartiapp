package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v4 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C7529v4 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7524v f33108a;

    /* renamed from: b */
    final /* synthetic */ String f33109b;

    /* renamed from: c */
    final /* synthetic */ C7310b5 f33110c;

    C7529v4(C7310b5 b5Var, C7524v vVar, String str) {
        this.f33110c = b5Var;
        this.f33108a = vVar;
        this.f33109b = str;
    }

    public final void run() {
        this.f33110c.f32369a.mo24119c();
        this.f33110c.f32369a.mo24130i(this.f33108a, this.f33109b);
    }
}
