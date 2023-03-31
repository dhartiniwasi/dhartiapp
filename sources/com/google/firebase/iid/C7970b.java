package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p074j5.C4831a;

/* renamed from: com.google.firebase.iid.b */
/* compiled from: com.google.firebase:firebase-iid@@21.1.0 */
class C7970b {

    /* renamed from: a */
    private static final Executor f34482a = C7969a.f34481a;

    /* renamed from: a */
    static Executor m43966a() {
        return f34482a;
    }

    /* renamed from: b */
    static ExecutorService m43967b() {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C4831a("firebase-iid-executor"));
    }
}
