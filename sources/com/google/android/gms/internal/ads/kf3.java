package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
abstract class kf3 extends AtomicReference implements Runnable {

    /* renamed from: a */
    private static final Runnable f12071a = new jf3((hf3) null);

    /* renamed from: b */
    private static final Runnable f12072b = new jf3((hf3) null);

    kf3() {
    }

    /* renamed from: c */
    private final void m15381c(Thread thread) {
        Runnable runnable = (Runnable) get();
        if3 if3 = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof if3)) {
                if (runnable != f12072b) {
                    break;
                }
            } else {
                if3 = (if3) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = f12072b;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(if3);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract Object mo8785a() throws Exception;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract String mo8786b();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo8787d(Throwable th);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo8788e(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract boolean mo8789f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo11676g() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            if3 if3 = new if3(this, (hf3) null);
            kf3.super.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, if3)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(f12071a)) == f12072b) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(f12071a)) == f12072b) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet((Object) null, currentThread)) {
            boolean z = !mo8789f();
            if (z) {
                try {
                    obj = mo8785a();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, f12071a)) {
                        m15381c(currentThread);
                    }
                    mo8788e((Object) null);
                    throw th;
                }
            }
            if (!compareAndSet(currentThread, f12071a)) {
                m15381c(currentThread);
            }
            if (z) {
                mo8788e(obj);
            }
        }
    }

    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == f12071a) {
            str = "running=[DONE]";
        } else if (runnable instanceof if3) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + mo8786b();
    }
}
