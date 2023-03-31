package p264io.grpc.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p182a7.C6441r;

/* renamed from: io.grpc.internal.y1 */
/* compiled from: Rescheduler */
final class C11412y1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ScheduledExecutorService f43728a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Executor f43729b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Runnable f43730c;

    /* renamed from: d */
    private final C6441r f43731d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f43732e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f43733f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ScheduledFuture<?> f43734g;

    /* renamed from: io.grpc.internal.y1$b */
    /* compiled from: Rescheduler */
    private final class C11414b implements Runnable {
        private C11414b() {
        }

        public void run() {
            if (!C11412y1.this.f43733f) {
                ScheduledFuture unused = C11412y1.this.f43734g = null;
                return;
            }
            long e = C11412y1.this.m56070j();
            if (C11412y1.this.f43732e - e > 0) {
                C11412y1 y1Var = C11412y1.this;
                ScheduledFuture unused2 = y1Var.f43734g = y1Var.f43728a.schedule(new C11415c(), C11412y1.this.f43732e - e, TimeUnit.NANOSECONDS);
                return;
            }
            boolean unused3 = C11412y1.this.f43733f = false;
            ScheduledFuture unused4 = C11412y1.this.f43734g = null;
            C11412y1.this.f43730c.run();
        }
    }

    /* renamed from: io.grpc.internal.y1$c */
    /* compiled from: Rescheduler */
    private final class C11415c implements Runnable {
        private C11415c() {
        }

        public void run() {
            C11412y1.this.f43729b.execute(new C11414b());
        }
    }

    C11412y1(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, C6441r rVar) {
        this.f43730c = runnable;
        this.f43729b = executor;
        this.f43728a = scheduledExecutorService;
        this.f43731d = rVar;
        rVar.mo21860g();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public long m56070j() {
        return this.f43731d.mo21858d(TimeUnit.NANOSECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo35415i(boolean z) {
        ScheduledFuture<?> scheduledFuture;
        this.f43733f = false;
        if (z && (scheduledFuture = this.f43734g) != null) {
            scheduledFuture.cancel(false);
            this.f43734g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo35416k(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        long j2 = m56070j() + nanos;
        this.f43733f = true;
        if (j2 - this.f43732e < 0 || this.f43734g == null) {
            ScheduledFuture<?> scheduledFuture = this.f43734g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f43734g = this.f43728a.schedule(new C11415c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f43732e = j2;
    }
}
