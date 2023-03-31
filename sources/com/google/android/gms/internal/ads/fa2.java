package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final /* synthetic */ class fa2 implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f9205a;

    public /* synthetic */ fa2(String str) {
        this.f9205a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f9205a);
    }
}
