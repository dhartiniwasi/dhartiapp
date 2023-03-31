package com.onesignal;

import com.onesignal.C8338d3;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.onesignal.t2 */
/* compiled from: OSTaskController */
class C8616t2 {

    /* renamed from: a */
    private final ConcurrentLinkedQueue<Runnable> f36047a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    private final AtomicLong f36048b = new AtomicLong();

    /* renamed from: c */
    private ExecutorService f36049c;

    /* renamed from: d */
    protected final C8547p1 f36050d;

    /* renamed from: com.onesignal.t2$a */
    /* compiled from: OSTaskController */
    class C8617a implements ThreadFactory {
        C8617a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("OS_PENDING_EXECUTOR_" + thread.getId());
            return thread;
        }
    }

    /* renamed from: com.onesignal.t2$b */
    /* compiled from: OSTaskController */
    private static class C8618b implements Runnable {

        /* renamed from: a */
        private C8616t2 f36052a;

        /* renamed from: b */
        private Runnable f36053b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public long f36054c;

        C8618b(C8616t2 t2Var, Runnable runnable) {
            this.f36052a = t2Var;
            this.f36053b = runnable;
        }

        public void run() {
            this.f36053b.run();
            this.f36052a.m47726d(this.f36054c);
        }

        public String toString() {
            return "PendingTaskRunnable{innerTask=" + this.f36053b + ", taskId=" + this.f36054c + '}';
        }
    }

    C8616t2(C8547p1 p1Var) {
        this.f36050d = p1Var;
    }

    /* renamed from: b */
    private void m47725b(C8618b bVar) {
        long unused = bVar.f36054c = this.f36048b.incrementAndGet();
        ExecutorService executorService = this.f36049c;
        if (executorService == null) {
            C8547p1 p1Var = this.f36050d;
            p1Var.mo28016d("Adding a task to the pending queue with ID: " + bVar.f36054c);
            this.f36047a.add(bVar);
        } else if (!executorService.isShutdown()) {
            C8547p1 p1Var2 = this.f36050d;
            p1Var2.mo28016d("Executor is still running, add to the executor with ID: " + bVar.f36054c);
            try {
                this.f36049c.submit(bVar);
            } catch (RejectedExecutionException e) {
                C8547p1 p1Var3 = this.f36050d;
                p1Var3.mo28018f("Executor is shutdown, running task manually with ID: " + bVar.f36054c);
                bVar.run();
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m47726d(long j) {
        if (this.f36048b.get() == j) {
            C8338d3.m46492a(C8338d3.C8384r0.INFO, "Last Pending Task has ran, shutting down");
            this.f36049c.shutdown();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo28224c(Runnable runnable) {
        m47725b(new C8618b(this, runnable));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo28225e() {
        if (Thread.currentThread().getName().contains("OS_PENDING_EXECUTOR_")) {
            return false;
        }
        if (C8338d3.m46522h1() && this.f36049c == null) {
            return false;
        }
        if (C8338d3.m46522h1() || this.f36049c != null) {
            return !this.f36049c.isShutdown();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo28226f() {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "startPendingTasks with task queue quantity: " + this.f36047a.size());
        if (!this.f36047a.isEmpty()) {
            this.f36049c = Executors.newSingleThreadExecutor(new C8617a());
            while (!this.f36047a.isEmpty()) {
                this.f36049c.submit(this.f36047a.poll());
            }
        }
    }
}
