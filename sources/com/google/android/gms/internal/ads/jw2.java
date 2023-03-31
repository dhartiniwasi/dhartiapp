package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class jw2 implements b44 {

    /* renamed from: a */
    private final o44 f11807a;

    public jw2(o44 o44) {
        this.f11807a = o44;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo8155d() {
        a53.m9591a();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.f11807a.mo8155d()));
        j44.m14699b(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
