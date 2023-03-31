package com.google.android.gms.measurement.internal;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import p033d5.C4141r;

/* renamed from: com.google.android.gms.measurement.internal.h4 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7375h4 extends C7332d5 {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final AtomicLong f32531l = new AtomicLong(Long.MIN_VALUE);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C7364g4 f32532c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C7364g4 f32533d;

    /* renamed from: e */
    private final PriorityBlockingQueue f32534e = new PriorityBlockingQueue();

    /* renamed from: f */
    private final BlockingQueue f32535f = new LinkedBlockingQueue();

    /* renamed from: g */
    private final Thread.UncaughtExceptionHandler f32536g = new C7342e4(this, "Thread death: Uncaught exception on worker thread");

    /* renamed from: h */
    private final Thread.UncaughtExceptionHandler f32537h = new C7342e4(this, "Thread death: Uncaught exception on network thread");
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f32538i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Semaphore f32539j = new Semaphore(2);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public volatile boolean f32540k;

    C7375h4(C7397j4 j4Var) {
        super(j4Var);
    }

    /* renamed from: D */
    private final void m41526D(C7353f4 f4Var) {
        synchronized (this.f32538i) {
            this.f32534e.add(f4Var);
            C7364g4 g4Var = this.f32532c;
            if (g4Var == null) {
                C7364g4 g4Var2 = new C7364g4(this, "Measurement Worker", this.f32534e);
                this.f32532c = g4Var2;
                g4Var2.setUncaughtExceptionHandler(this.f32536g);
                this.f32532c.start();
            } else {
                g4Var.mo24272a();
            }
        }
    }

    /* renamed from: A */
    public final void mo24303A(Runnable runnable) throws IllegalStateException {
        mo24236i();
        C4141r.m28221k(runnable);
        m41526D(new C7353f4(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: C */
    public final boolean mo24304C() {
        return Thread.currentThread() == this.f32532c;
    }

    /* renamed from: e */
    public final void mo24188e() {
        if (Thread.currentThread() != this.f32533d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    /* renamed from: f */
    public final void mo24189f() {
        if (Thread.currentThread() != this.f32532c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo24235h() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:11|12|13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = r1.f32389a.mo24135l().mo24261w();
        r3.mo24208a("Interrupted waiting for " + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r2 = r2.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r1.f32389a.mo24135l().mo24261w().mo24208a("Timed out waiting for ".concat(r5));
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo24305q(java.util.concurrent.atomic.AtomicReference r2, long r3, java.lang.String r5, java.lang.Runnable r6) {
        /*
            r1 = this;
            monitor-enter(r2)
            com.google.android.gms.measurement.internal.j4 r0 = r1.f32389a     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.h4 r0 = r0.mo24143s()     // Catch:{ all -> 0x0049 }
            r0.mo24309z(r6)     // Catch:{ all -> 0x0049 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0027
            com.google.android.gms.measurement.internal.j4 r3 = r1.f32389a
            com.google.android.gms.measurement.internal.f3 r3 = r3.mo24135l()
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24261w()
            java.lang.String r4 = "Timed out waiting for "
            java.lang.String r4 = r4.concat(r5)
            r3.mo24208a(r4)
        L_0x0027:
            return r2
        L_0x0028:
            com.google.android.gms.measurement.internal.j4 r3 = r1.f32389a     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.f3 r3 = r3.mo24135l()     // Catch:{ all -> 0x0049 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo24261w()     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r4.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r6 = "Interrupted waiting for "
            r4.append(r6)     // Catch:{ all -> 0x0049 }
            r4.append(r5)     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0049 }
            r3.mo24208a(r4)     // Catch:{ all -> 0x0049 }
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            r2 = 0
            return r2
        L_0x0049:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0049 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7375h4.mo24305q(java.util.concurrent.atomic.AtomicReference, long, java.lang.String, java.lang.Runnable):java.lang.Object");
    }

    /* renamed from: r */
    public final Future mo24306r(Callable callable) throws IllegalStateException {
        mo24236i();
        C4141r.m28221k(callable);
        C7353f4 f4Var = new C7353f4(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f32532c) {
            if (!this.f32534e.isEmpty()) {
                this.f32389a.mo24135l().mo24261w().mo24208a("Callable skipped the worker queue.");
            }
            f4Var.run();
        } else {
            m41526D(f4Var);
        }
        return f4Var;
    }

    /* renamed from: t */
    public final Future mo24307t(Callable callable) throws IllegalStateException {
        mo24236i();
        C4141r.m28221k(callable);
        C7353f4 f4Var = new C7353f4(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f32532c) {
            f4Var.run();
        } else {
            m41526D(f4Var);
        }
        return f4Var;
    }

    /* renamed from: y */
    public final void mo24308y(Runnable runnable) throws IllegalStateException {
        mo24236i();
        C4141r.m28221k(runnable);
        C7353f4 f4Var = new C7353f4(this, runnable, false, "Task exception on network thread");
        synchronized (this.f32538i) {
            this.f32535f.add(f4Var);
            C7364g4 g4Var = this.f32533d;
            if (g4Var == null) {
                C7364g4 g4Var2 = new C7364g4(this, "Measurement Network", this.f32535f);
                this.f32533d = g4Var2;
                g4Var2.setUncaughtExceptionHandler(this.f32537h);
                this.f32533d.start();
            } else {
                g4Var.mo24272a();
            }
        }
    }

    /* renamed from: z */
    public final void mo24309z(Runnable runnable) throws IllegalStateException {
        mo24236i();
        C4141r.m28221k(runnable);
        m41526D(new C7353f4(this, runnable, false, "Task exception on worker thread"));
    }
}
