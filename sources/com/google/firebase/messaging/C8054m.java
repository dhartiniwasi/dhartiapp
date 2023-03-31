package com.google.firebase.messaging;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p074j5.C4831a;
import p357t8.C12549b;
import p357t8.C12552c;

/* renamed from: com.google.firebase.messaging.m */
/* compiled from: FcmExecutors */
class C8054m {
    /* renamed from: a */
    private static Executor m44358a(String str) {
        return new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C4831a(str));
    }

    /* renamed from: b */
    static Executor m44359b() {
        return m44358a("Firebase-Messaging-File-Io");
    }

    /* renamed from: c */
    static ScheduledExecutorService m44360c() {
        return new ScheduledThreadPoolExecutor(1, new C4831a("Firebase-Messaging-Init"));
    }

    /* renamed from: d */
    static ExecutorService m44361d() {
        return C12549b.m59745a().mo37373a(new C4831a("Firebase-Messaging-Intent-Handle"), C12552c.HIGH_SPEED);
    }

    /* renamed from: e */
    static ExecutorService m44362e() {
        return Executors.newSingleThreadExecutor(new C4831a("Firebase-Messaging-Network-Io"));
    }

    /* renamed from: f */
    static ExecutorService m44363f() {
        return Executors.newSingleThreadExecutor(new C4831a("Firebase-Messaging-Task"));
    }

    /* renamed from: g */
    static ScheduledExecutorService m44364g() {
        return new ScheduledThreadPoolExecutor(1, new C4831a("Firebase-Messaging-Topics-Io"));
    }
}
