package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class pk0 implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f15886a = new AtomicInteger(1);

    pk0(sk0 sk0) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f15886a.getAndIncrement();
        return new Thread(runnable, "AdWorker(SCION_TASK_EXECUTOR) #" + andIncrement);
    }
}
