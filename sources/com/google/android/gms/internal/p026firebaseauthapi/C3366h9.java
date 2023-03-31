package com.google.android.gms.internal.p026firebaseauthapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.h9 */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3366h9 implements C3298f7 {
    /* synthetic */ C3366h9(C3332g8 g8Var) {
    }

    /* renamed from: g */
    public final ExecutorService mo16021g(int i) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
