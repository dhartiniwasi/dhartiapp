package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.sf */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2845sf implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f17447a = Executors.defaultThreadFactory();

    /* renamed from: b */
    private final AtomicInteger f17448b = new AtomicInteger(1);

    C2845sf() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f17447a.newThread(runnable);
        int andIncrement = this.f17448b.getAndIncrement();
        newThread.setName("gads-" + andIncrement);
        return newThread;
    }
}
