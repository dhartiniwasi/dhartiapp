package p343rc;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p182a7.C6431n;

/* renamed from: rc.n1 */
/* compiled from: SynchronizationContext */
public final class C12359n1 implements Executor {

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f45674a;

    /* renamed from: b */
    private final Queue<Runnable> f45675b = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private final AtomicReference<Thread> f45676c = new AtomicReference<>();

    /* renamed from: rc.n1$a */
    /* compiled from: SynchronizationContext */
    class C12360a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12362c f45677a;

        /* renamed from: b */
        final /* synthetic */ Runnable f45678b;

        C12360a(C12362c cVar, Runnable runnable) {
            this.f45677a = cVar;
            this.f45678b = runnable;
        }

        public void run() {
            C12359n1.this.execute(this.f45677a);
        }

        public String toString() {
            return this.f45678b.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    /* renamed from: rc.n1$b */
    /* compiled from: SynchronizationContext */
    class C12361b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12362c f45680a;

        /* renamed from: b */
        final /* synthetic */ Runnable f45681b;

        /* renamed from: c */
        final /* synthetic */ long f45682c;

        C12361b(C12362c cVar, Runnable runnable, long j) {
            this.f45680a = cVar;
            this.f45681b = runnable;
            this.f45682c = j;
        }

        public void run() {
            C12359n1.this.execute(this.f45680a);
        }

        public String toString() {
            return this.f45681b.toString() + "(scheduled in SynchronizationContext with delay of " + this.f45682c + ")";
        }
    }

    /* renamed from: rc.n1$c */
    /* compiled from: SynchronizationContext */
    private static class C12362c implements Runnable {

        /* renamed from: a */
        final Runnable f45684a;

        /* renamed from: b */
        boolean f45685b;

        /* renamed from: c */
        boolean f45686c;

        C12362c(Runnable runnable) {
            this.f45684a = (Runnable) C6431n.m37562o(runnable, "task");
        }

        public void run() {
            if (!this.f45685b) {
                this.f45686c = true;
                this.f45684a.run();
            }
        }
    }

    /* renamed from: rc.n1$d */
    /* compiled from: SynchronizationContext */
    public static final class C12363d {

        /* renamed from: a */
        private final C12362c f45687a;

        /* renamed from: b */
        private final ScheduledFuture<?> f45688b;

        /* synthetic */ C12363d(C12362c cVar, ScheduledFuture scheduledFuture, C12360a aVar) {
            this(cVar, scheduledFuture);
        }

        /* renamed from: a */
        public void mo37074a() {
            this.f45687a.f45685b = true;
            this.f45688b.cancel(false);
        }

        /* renamed from: b */
        public boolean mo37075b() {
            C12362c cVar = this.f45687a;
            return !cVar.f45686c && !cVar.f45685b;
        }

        private C12363d(C12362c cVar, ScheduledFuture<?> scheduledFuture) {
            this.f45687a = (C12362c) C6431n.m37562o(cVar, "runnable");
            this.f45688b = (ScheduledFuture) C6431n.m37562o(scheduledFuture, "future");
        }
    }

    public C12359n1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f45674a = (Thread.UncaughtExceptionHandler) C6431n.m37562o(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    /* renamed from: b */
    public final void mo37063b() {
        while (this.f45676c.compareAndSet((Object) null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable poll = this.f45675b.poll();
                    if (poll != null) {
                        poll.run();
                    } else {
                        this.f45676c.set((Object) null);
                        if (this.f45675b.isEmpty()) {
                            return;
                        }
                    }
                } catch (Throwable th) {
                    this.f45676c.set((Object) null);
                    throw th;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo37064c(Runnable runnable) {
        this.f45675b.add((Runnable) C6431n.m37562o(runnable, "runnable is null"));
    }

    /* renamed from: d */
    public final C12363d mo37065d(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C12362c cVar = new C12362c(runnable);
        return new C12363d(cVar, scheduledExecutorService.schedule(new C12360a(cVar, runnable), j, timeUnit), (C12360a) null);
    }

    /* renamed from: e */
    public final C12363d mo37066e(Runnable runnable, long j, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        C12362c cVar = new C12362c(runnable);
        return new C12363d(cVar, scheduledExecutorService.scheduleWithFixedDelay(new C12361b(cVar, runnable, j2), j, j2, timeUnit), (C12360a) null);
    }

    public final void execute(Runnable runnable) {
        mo37064c(runnable);
        mo37063b();
    }

    /* renamed from: f */
    public void mo37068f() {
        C6431n.m37568u(Thread.currentThread() == this.f45676c.get(), "Not called from the SynchronizationContext");
    }
}
