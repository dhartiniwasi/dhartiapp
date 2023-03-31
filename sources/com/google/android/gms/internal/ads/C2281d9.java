package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.d9 */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2281d9 implements Executor {

    /* renamed from: a */
    final /* synthetic */ Handler f8144a;

    C2281d9(C2355f9 f9Var, Handler handler) {
        this.f8144a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f8144a.post(runnable);
    }
}
