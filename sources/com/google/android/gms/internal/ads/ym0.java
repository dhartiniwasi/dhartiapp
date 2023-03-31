package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class ym0 implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f20685a = new AtomicInteger(1);

    /* renamed from: b */
    final /* synthetic */ String f20686b;

    ym0(String str) {
        this.f20686b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f20686b;
        int andIncrement = this.f20685a.getAndIncrement();
        return new Thread(runnable, "AdWorker(" + str + ") #" + andIncrement);
    }
}
