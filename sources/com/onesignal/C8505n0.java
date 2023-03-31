package com.onesignal;

import kotlin.jvm.internal.C11669k;

/* renamed from: com.onesignal.n0 */
/* compiled from: OSBackgroundManager.kt */
public class C8505n0 {
    /* renamed from: d */
    public final void mo27972d(Runnable runnable, String str) {
        C11669k.m56787e(runnable, "runnable");
        C11669k.m56787e(str, "threadName");
        if (OSUtils.m46175H()) {
            new Thread(runnable, str).start();
        } else {
            runnable.run();
        }
    }
}
