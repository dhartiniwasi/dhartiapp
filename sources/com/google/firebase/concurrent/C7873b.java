package com.google.firebase.concurrent;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.firebase.concurrent.b */
/* compiled from: CustomThreadFactory */
class C7873b implements ThreadFactory {

    /* renamed from: e */
    private static final ThreadFactory f34244e = Executors.defaultThreadFactory();

    /* renamed from: a */
    private final AtomicLong f34245a = new AtomicLong();

    /* renamed from: b */
    private final String f34246b;

    /* renamed from: c */
    private final int f34247c;

    /* renamed from: d */
    private final StrictMode.ThreadPolicy f34248d;

    C7873b(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.f34246b = str;
        this.f34247c = i;
        this.f34248d = threadPolicy;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m43597b(Runnable runnable) {
        Process.setThreadPriority(this.f34247c);
        StrictMode.ThreadPolicy threadPolicy = this.f34248d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = f34244e.newThread(new C7872a(this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", new Object[]{this.f34246b, Long.valueOf(this.f34245a.getAndIncrement())}));
        return newThread;
    }
}
