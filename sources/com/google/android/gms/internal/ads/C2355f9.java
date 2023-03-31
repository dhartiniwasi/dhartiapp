package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.f9 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class C2355f9 {

    /* renamed from: a */
    private final Executor f9194a;

    public C2355f9(Handler handler) {
        this.f9194a = new C2281d9(this, handler);
    }

    /* renamed from: a */
    public final void mo10108a(C2727p9 p9Var, C3061y9 y9Var) {
        p9Var.mo13186t("post-error");
        C2950v9 a = C2950v9.m22043a(y9Var);
        Executor executor = this.f9194a;
        ((C2281d9) executor).f8144a.post(new C2318e9(p9Var, a, (Runnable) null));
    }

    /* renamed from: b */
    public final void mo10109b(C2727p9 p9Var, C2950v9 v9Var, Runnable runnable) {
        p9Var.mo13191x();
        p9Var.mo13186t("post-response");
        Executor executor = this.f9194a;
        ((C2281d9) executor).f8144a.post(new C2318e9(p9Var, v9Var, runnable));
    }
}
