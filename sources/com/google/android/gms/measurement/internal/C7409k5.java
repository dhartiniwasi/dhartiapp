package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.k5 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final /* synthetic */ class C7409k5 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C7388i6 f32665a;

    public /* synthetic */ C7409k5(C7388i6 i6Var) {
        this.f32665a = i6Var;
    }

    public final void run() {
        C7388i6 i6Var = this.f32665a;
        i6Var.mo24189f();
        if (!i6Var.f32389a.mo24416F().f32961s.mo24582b()) {
            long a = i6Var.f32389a.mo24416F().f32962t.mo24604a();
            i6Var.f32389a.mo24416F().f32962t.mo24605b(1 + a);
            i6Var.f32389a.mo24443z();
            if (a >= 5) {
                i6Var.f32389a.mo24135l().mo24261w().mo24208a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                i6Var.f32389a.mo24416F().f32961s.mo24581a(true);
                return;
            }
            i6Var.f32389a.mo24431h();
            return;
        }
        i6Var.f32389a.mo24135l().mo24255p().mo24208a("Deferred Deep Link already retrieved. Not fetching again.");
    }
}
