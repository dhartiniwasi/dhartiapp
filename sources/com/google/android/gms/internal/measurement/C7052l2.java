package com.google.android.gms.internal.measurement;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.internal.measurement.l2 */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.2.0 */
final class C7052l2 implements ThreadFactory {

    /* renamed from: a */
    private final ThreadFactory f31802a = Executors.defaultThreadFactory();

    C7052l2(C6904c3 c3Var) {
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f31802a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
