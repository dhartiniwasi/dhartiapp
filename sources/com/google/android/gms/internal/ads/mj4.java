package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class mj4 implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f13348a;

    public /* synthetic */ mj4(Handler handler) {
        this.f13348a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f13348a.post(runnable);
    }
}
