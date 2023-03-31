package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class uv2 implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f18750a = new AtomicInteger(1);

    uv2() {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f18750a.getAndIncrement();
        return new Thread(runnable, "AdWorker(NG) #" + andIncrement);
    }
}
