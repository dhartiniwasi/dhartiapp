package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e9 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2318e9 implements Runnable {

    /* renamed from: a */
    private final C2727p9 f8701a;

    /* renamed from: b */
    private final C2950v9 f8702b;

    /* renamed from: c */
    private final Runnable f8703c;

    public C2318e9(C2727p9 p9Var, C2950v9 v9Var, Runnable runnable) {
        this.f8701a = p9Var;
        this.f8702b = v9Var;
        this.f8703c = runnable;
    }

    public final void run() {
        this.f8701a.mo13172D();
        C2950v9 v9Var = this.f8702b;
        if (v9Var.mo14698c()) {
            this.f8701a.mo13189v(v9Var.f18978a);
        } else {
            this.f8701a.mo13188u(v9Var.f18980c);
        }
        if (this.f8702b.f18981d) {
            this.f8701a.mo13186t("intermediate-response");
        } else {
            this.f8701a.mo13190w("done");
        }
        Runnable runnable = this.f8703c;
        if (runnable != null) {
            runnable.run();
        }
    }
}
