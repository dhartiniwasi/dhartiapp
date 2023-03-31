package p247h8;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p218e6.C9975i;
import p218e6.C9977j;

/* renamed from: h8.g */
/* compiled from: AsyncQueue */
public class C10442g {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C10445c f41382a = new C10445c();

    /* renamed from: b */
    private final ArrayList<C10444b> f41383b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<C10448d> f41384c = new ArrayList<>();

    /* renamed from: h8.g$b */
    /* compiled from: AsyncQueue */
    public class C10444b {

        /* renamed from: a */
        private final C10448d f41385a;

        /* renamed from: b */
        private final long f41386b;

        /* renamed from: c */
        private final Runnable f41387c;

        /* renamed from: d */
        private ScheduledFuture f41388d;

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m52677d() {
            C10442g.this.mo33527w();
            if (this.f41388d != null) {
                m52678e();
                this.f41387c.run();
            }
        }

        /* renamed from: e */
        private void m52678e() {
            C10432b.m52648d(this.f41388d != null, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
            this.f41388d = null;
            C10442g.this.m52664v(this);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public void m52679f(long j) {
            this.f41388d = C10442g.this.f41382a.schedule(new C10450h(this), j, TimeUnit.MILLISECONDS);
        }

        /* renamed from: c */
        public void mo33528c() {
            C10442g.this.mo33527w();
            ScheduledFuture scheduledFuture = this.f41388d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                m52678e();
            }
        }

        private C10444b(C10448d dVar, long j, Runnable runnable) {
            this.f41385a = dVar;
            this.f41386b = j;
            this.f41387c = runnable;
        }
    }

    /* renamed from: h8.g$c */
    /* compiled from: AsyncQueue */
    private class C10445c implements Executor {

        /* renamed from: a */
        private final ScheduledThreadPoolExecutor f41390a;

        /* renamed from: b */
        private boolean f41391b = false;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final Thread f41392c;

        /* renamed from: h8.g$c$a */
        /* compiled from: AsyncQueue */
        class C10446a extends ScheduledThreadPoolExecutor {

            /* renamed from: a */
            final /* synthetic */ C10442g f41394a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C10446a(int i, ThreadFactory threadFactory, C10442g gVar) {
                super(i, threadFactory);
                this.f41394a = gVar;
            }

            /* access modifiers changed from: protected */
            public void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    try {
                        if (future.isDone()) {
                            future.get();
                        }
                    } catch (CancellationException unused) {
                    } catch (ExecutionException e) {
                        th = e.getCause();
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                    }
                }
                if (th != null) {
                    C10442g.this.mo33526u(th);
                }
            }
        }

        /* renamed from: h8.g$c$b */
        /* compiled from: AsyncQueue */
        private class C10447b implements Runnable, ThreadFactory {

            /* renamed from: a */
            private final CountDownLatch f41396a;

            /* renamed from: b */
            private Runnable f41397b;

            private C10447b() {
                this.f41396a = new CountDownLatch(1);
            }

            public Thread newThread(Runnable runnable) {
                C10432b.m52648d(this.f41397b == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
                this.f41397b = runnable;
                this.f41396a.countDown();
                return C10445c.this.f41392c;
            }

            public void run() {
                try {
                    this.f41396a.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f41397b.run();
            }
        }

        C10445c() {
            C10447b bVar = new C10447b();
            Thread newThread = Executors.defaultThreadFactory().newThread(bVar);
            this.f41392c = newThread;
            newThread.setName("FirestoreWorker");
            newThread.setDaemon(true);
            newThread.setUncaughtExceptionHandler(new C10452j(this));
            C10446a aVar = new C10446a(1, bVar, C10442g.this);
            this.f41390a = aVar;
            aVar.setKeepAliveTime(3, TimeUnit.SECONDS);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public synchronized C9975i<Void> m52690k(Runnable runnable) {
            if (m52692n()) {
                C9977j jVar = new C9977j();
                jVar.mo32544c(null);
                return jVar.mo32542a();
            }
            C9975i<Void> l = m52691l(new C10453k(runnable));
            this.f41391b = true;
            return l;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public <T> C9975i<T> m52691l(Callable<T> callable) {
            C9977j jVar = new C9977j();
            try {
                execute(new C10451i(jVar, callable));
            } catch (RejectedExecutionException unused) {
                C10468v.m52770d(C10442g.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
            return jVar.mo32542a();
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public synchronized boolean m52692n() {
            return this.f41391b;
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public static /* synthetic */ void m52694p(C9977j jVar, Callable callable) {
            try {
                jVar.mo32544c(callable.call());
            } catch (Exception e) {
                jVar.mo32543b(e);
                throw new RuntimeException(e);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public /* synthetic */ void m52695q(Thread thread, Throwable th) {
            C10442g.this.mo33526u(th);
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public void m52696r() {
            this.f41390a.shutdownNow();
        }

        /* access modifiers changed from: private */
        public synchronized ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f41391b) {
                return null;
            }
            return this.f41390a.schedule(runnable, j, timeUnit);
        }

        public synchronized void execute(Runnable runnable) {
            if (!this.f41391b) {
                this.f41390a.execute(runnable);
            }
        }

        /* renamed from: m */
        public void mo33530m(Runnable runnable) {
            try {
                this.f41390a.execute(runnable);
            } catch (RejectedExecutionException unused) {
                C10468v.m52770d(C10442g.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
        }
    }

    /* renamed from: h8.g$d */
    /* compiled from: AsyncQueue */
    public enum C10448d {
        ALL,
        LISTEN_STREAM_IDLE,
        LISTEN_STREAM_CONNECTION_BACKOFF,
        WRITE_STREAM_IDLE,
        WRITE_STREAM_CONNECTION_BACKOFF,
        HEALTH_CHECK_TIMEOUT,
        ONLINE_STATE_TIMEOUT,
        GARBAGE_COLLECTION,
        RETRY_TRANSACTION,
        CONNECTIVITY_ATTEMPT_TIMER,
        INDEX_BACKFILL
    }

    /* renamed from: g */
    public static <TResult> C9975i<TResult> m52658g(Executor executor, Callable<C9975i<TResult>> callable) {
        C9977j jVar = new C9977j();
        executor.execute(new C10438e(callable, executor, jVar));
        return jVar.mo32542a();
    }

    /* renamed from: h */
    private C10444b m52659h(C10448d dVar, long j, Runnable runnable) {
        C10444b bVar = new C10444b(dVar, System.currentTimeMillis() + j, runnable);
        bVar.m52679f(j);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static /* synthetic */ Void m52660q(C9977j jVar, C9975i iVar) throws Exception {
        if (iVar.mo26362q()) {
            jVar.mo32544c(iVar.mo26358m());
            return null;
        }
        jVar.mo32543b(iVar.mo26357l());
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static /* synthetic */ void m52661r(Callable callable, Executor executor, C9977j jVar) {
        try {
            ((C9975i) callable.call()).mo26354i(executor, new C10434c(jVar));
        } catch (Exception e) {
            jVar.mo32543b(e);
        } catch (Throwable th) {
            jVar.mo32543b(new IllegalStateException("Unhandled throwable in callTask.", th));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static /* synthetic */ void m52663t(Throwable th) {
        if (th instanceof OutOfMemoryError) {
            OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (24.4.3) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
            outOfMemoryError.initCause(th);
            throw outOfMemoryError;
        }
        throw new RuntimeException("Internal error in Cloud Firestore (24.4.3).", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m52664v(C10444b bVar) {
        C10432b.m52648d(this.f41383b.remove(bVar), "Delayed task not found.", new Object[0]);
    }

    /* renamed from: i */
    public C9975i<Void> mo33518i(Runnable runnable) {
        return mo33519j(new C10440f(runnable));
    }

    /* renamed from: j */
    public <T> C9975i<T> mo33519j(Callable<T> callable) {
        return this.f41382a.m52691l(callable);
    }

    /* renamed from: k */
    public C10444b mo33520k(C10448d dVar, long j, Runnable runnable) {
        if (this.f41384c.contains(dVar)) {
            j = 0;
        }
        C10444b h = m52659h(dVar, j, runnable);
        this.f41383b.add(h);
        return h;
    }

    /* renamed from: l */
    public void mo33521l(Runnable runnable) {
        mo33518i(runnable);
    }

    /* renamed from: m */
    public void mo33522m(Runnable runnable) {
        this.f41382a.mo33530m(runnable);
    }

    /* renamed from: n */
    public C9975i<Void> mo33523n(Runnable runnable) {
        return this.f41382a.m52690k(runnable);
    }

    /* renamed from: o */
    public Executor mo33524o() {
        return this.f41382a;
    }

    /* renamed from: p */
    public boolean mo33525p() {
        return this.f41382a.m52692n();
    }

    /* renamed from: u */
    public void mo33526u(Throwable th) {
        this.f41382a.m52696r();
        new Handler(Looper.getMainLooper()).post(new C10436d(th));
    }

    /* renamed from: w */
    public void mo33527w() {
        Thread currentThread = Thread.currentThread();
        if (this.f41382a.f41392c != currentThread) {
            throw C10432b.m52645a("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", this.f41382a.f41392c.getName(), Long.valueOf(this.f41382a.f41392c.getId()), currentThread.getName(), Long.valueOf(currentThread.getId()));
        }
    }
}
