package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class dm0 implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f8312a = new AtomicInteger(1);

    /* renamed from: b */
    final /* synthetic */ String f8313b;

    dm0(String str) {
        this.f8313b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f8313b;
        int andIncrement = this.f8312a.getAndIncrement();
        return new Thread(runnable, "AdWorker(" + str + ") #" + andIncrement);
    }
}
