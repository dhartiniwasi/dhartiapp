package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class rc4 implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f16914a;

    public /* synthetic */ rc4(Handler handler) {
        this.f16914a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f16914a.post(runnable);
    }
}
