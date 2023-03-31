package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.ads.sq */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2856sq implements ThreadFactory {

    /* renamed from: a */
    final /* synthetic */ String f17615a = "Loader:ExtractorMediaPeriod";

    C2856sq(String str) {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f17615a);
    }
}
