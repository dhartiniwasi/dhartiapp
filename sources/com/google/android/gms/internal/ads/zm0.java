package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p053g4.C4409t;
import p073j4.C4751b2;
import p073j4.C4797o1;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zm0 implements Executor {

    /* renamed from: a */
    private final Handler f21149a = new C4797o1(Looper.getMainLooper());

    zm0() {
    }

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                C4409t.m29326r();
                C4751b2.m30614i(C4409t.m29325q().mo15113c(), th);
                throw th;
            }
        } else {
            this.f21149a.post(runnable);
        }
    }
}
