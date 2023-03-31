package p264io.grpc.internal;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p182a7.C6431n;
import p182a7.C6441r;
import p228f7.C10140d;
import p264io.grpc.internal.C11351s;
import p343rc.C12335j1;

/* renamed from: io.grpc.internal.c1 */
/* compiled from: KeepAliveManager */
public class C11147c1 {

    /* renamed from: l */
    private static final long f43005l = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: m */
    private static final long f43006m = TimeUnit.MILLISECONDS.toNanos(10);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ScheduledExecutorService f43007a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6441r f43008b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11152d f43009c;

    /* renamed from: d */
    private final boolean f43010d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C11153e f43011e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ScheduledFuture<?> f43012f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ScheduledFuture<?> f43013g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Runnable f43014h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Runnable f43015i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final long f43016j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final long f43017k;

    /* renamed from: io.grpc.internal.c1$a */
    /* compiled from: KeepAliveManager */
    class C11148a implements Runnable {
        C11148a() {
        }

        public void run() {
            boolean z;
            synchronized (C11147c1.this) {
                C11153e a = C11147c1.this.f43011e;
                C11153e eVar = C11153e.DISCONNECTED;
                if (a != eVar) {
                    C11153e unused = C11147c1.this.f43011e = eVar;
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                C11147c1.this.f43009c.mo35007a();
            }
        }
    }

    /* renamed from: io.grpc.internal.c1$b */
    /* compiled from: KeepAliveManager */
    class C11149b implements Runnable {
        C11149b() {
        }

        public void run() {
            boolean z;
            synchronized (C11147c1.this) {
                ScheduledFuture unused = C11147c1.this.f43013g = null;
                C11153e a = C11147c1.this.f43011e;
                C11153e eVar = C11153e.PING_SCHEDULED;
                if (a == eVar) {
                    z = true;
                    C11153e unused2 = C11147c1.this.f43011e = C11153e.PING_SENT;
                    C11147c1 c1Var = C11147c1.this;
                    ScheduledFuture unused3 = c1Var.f43012f = c1Var.f43007a.schedule(C11147c1.this.f43014h, C11147c1.this.f43017k, TimeUnit.NANOSECONDS);
                } else {
                    if (C11147c1.this.f43011e == C11153e.PING_DELAYED) {
                        C11147c1 c1Var2 = C11147c1.this;
                        ScheduledExecutorService h = c1Var2.f43007a;
                        Runnable i = C11147c1.this.f43015i;
                        long j = C11147c1.this.f43016j;
                        C6441r k = C11147c1.this.f43008b;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        ScheduledFuture unused4 = c1Var2.f43013g = h.schedule(i, j - k.mo21858d(timeUnit), timeUnit);
                        C11153e unused5 = C11147c1.this.f43011e = eVar;
                    }
                    z = false;
                }
            }
            if (z) {
                C11147c1.this.f43009c.mo35008b();
            }
        }
    }

    /* renamed from: io.grpc.internal.c1$c */
    /* compiled from: KeepAliveManager */
    public static final class C11150c implements C11152d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C11376v f43020a;

        /* renamed from: io.grpc.internal.c1$c$a */
        /* compiled from: KeepAliveManager */
        class C11151a implements C11351s.C11352a {
            C11151a() {
            }

            /* renamed from: a */
            public void mo35009a(Throwable th) {
                C11150c.this.f43020a.mo34934d(C12335j1.f45621u.mo37030q("Keepalive failed. The connection is likely gone"));
            }

            /* renamed from: b */
            public void mo35010b(long j) {
            }
        }

        public C11150c(C11376v vVar) {
            this.f43020a = vVar;
        }

        /* renamed from: a */
        public void mo35007a() {
            this.f43020a.mo34934d(C12335j1.f45621u.mo37030q("Keepalive failed. The connection is likely gone"));
        }

        /* renamed from: b */
        public void mo35008b() {
            this.f43020a.mo35231h(new C11151a(), C10140d.m51467a());
        }
    }

    /* renamed from: io.grpc.internal.c1$d */
    /* compiled from: KeepAliveManager */
    public interface C11152d {
        /* renamed from: a */
        void mo35007a();

        /* renamed from: b */
        void mo35008b();
    }

    /* renamed from: io.grpc.internal.c1$e */
    /* compiled from: KeepAliveManager */
    private enum C11153e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    public C11147c1(C11152d dVar, ScheduledExecutorService scheduledExecutorService, long j, long j2, boolean z) {
        this(dVar, scheduledExecutorService, C6441r.m37595c(), j, j2, z);
    }

    /* renamed from: l */
    public static long m55177l(long j) {
        return Math.max(j, f43005l);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        return;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo35000m() {
        /*
            r5 = this;
            monitor-enter(r5)
            a7.r r0 = r5.f43008b     // Catch:{ all -> 0x004d }
            a7.r r0 = r0.mo21859f()     // Catch:{ all -> 0x004d }
            r0.mo21860g()     // Catch:{ all -> 0x004d }
            io.grpc.internal.c1$e r0 = r5.f43011e     // Catch:{ all -> 0x004d }
            io.grpc.internal.c1$e r1 = p264io.grpc.internal.C11147c1.C11153e.PING_SCHEDULED     // Catch:{ all -> 0x004d }
            if (r0 != r1) goto L_0x0015
            io.grpc.internal.c1$e r0 = p264io.grpc.internal.C11147c1.C11153e.PING_DELAYED     // Catch:{ all -> 0x004d }
            r5.f43011e = r0     // Catch:{ all -> 0x004d }
            goto L_0x004b
        L_0x0015:
            io.grpc.internal.c1$e r2 = p264io.grpc.internal.C11147c1.C11153e.PING_SENT     // Catch:{ all -> 0x004d }
            if (r0 == r2) goto L_0x001d
            io.grpc.internal.c1$e r2 = p264io.grpc.internal.C11147c1.C11153e.IDLE_AND_PING_SENT     // Catch:{ all -> 0x004d }
            if (r0 != r2) goto L_0x004b
        L_0x001d:
            java.util.concurrent.ScheduledFuture<?> r0 = r5.f43012f     // Catch:{ all -> 0x004d }
            r2 = 0
            if (r0 == 0) goto L_0x0025
            r0.cancel(r2)     // Catch:{ all -> 0x004d }
        L_0x0025:
            io.grpc.internal.c1$e r0 = r5.f43011e     // Catch:{ all -> 0x004d }
            io.grpc.internal.c1$e r3 = p264io.grpc.internal.C11147c1.C11153e.IDLE_AND_PING_SENT     // Catch:{ all -> 0x004d }
            if (r0 != r3) goto L_0x0031
            io.grpc.internal.c1$e r0 = p264io.grpc.internal.C11147c1.C11153e.IDLE     // Catch:{ all -> 0x004d }
            r5.f43011e = r0     // Catch:{ all -> 0x004d }
            monitor-exit(r5)
            return
        L_0x0031:
            r5.f43011e = r1     // Catch:{ all -> 0x004d }
            java.util.concurrent.ScheduledFuture<?> r0 = r5.f43013g     // Catch:{ all -> 0x004d }
            if (r0 != 0) goto L_0x0038
            r2 = 1
        L_0x0038:
            java.lang.String r0 = "There should be no outstanding pingFuture"
            p182a7.C6431n.m37568u(r2, r0)     // Catch:{ all -> 0x004d }
            java.util.concurrent.ScheduledExecutorService r0 = r5.f43007a     // Catch:{ all -> 0x004d }
            java.lang.Runnable r1 = r5.f43015i     // Catch:{ all -> 0x004d }
            long r2 = r5.f43016j     // Catch:{ all -> 0x004d }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x004d }
            java.util.concurrent.ScheduledFuture r0 = r0.schedule(r1, r2, r4)     // Catch:{ all -> 0x004d }
            r5.f43013g = r0     // Catch:{ all -> 0x004d }
        L_0x004b:
            monitor-exit(r5)
            return
        L_0x004d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11147c1.mo35000m():void");
    }

    /* renamed from: n */
    public synchronized void mo35001n() {
        C11153e eVar = this.f43011e;
        if (eVar == C11153e.IDLE) {
            this.f43011e = C11153e.PING_SCHEDULED;
            if (this.f43013g == null) {
                ScheduledExecutorService scheduledExecutorService = this.f43007a;
                Runnable runnable = this.f43015i;
                long j = this.f43016j;
                C6441r rVar = this.f43008b;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                this.f43013g = scheduledExecutorService.schedule(runnable, j - rVar.mo21858d(timeUnit), timeUnit);
            }
        } else if (eVar == C11153e.IDLE_AND_PING_SENT) {
            this.f43011e = C11153e.PING_SENT;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        return;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo35002o() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f43010d     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r2)
            return
        L_0x0007:
            io.grpc.internal.c1$e r0 = r2.f43011e     // Catch:{ all -> 0x0021 }
            io.grpc.internal.c1$e r1 = p264io.grpc.internal.C11147c1.C11153e.PING_SCHEDULED     // Catch:{ all -> 0x0021 }
            if (r0 == r1) goto L_0x0011
            io.grpc.internal.c1$e r1 = p264io.grpc.internal.C11147c1.C11153e.PING_DELAYED     // Catch:{ all -> 0x0021 }
            if (r0 != r1) goto L_0x0015
        L_0x0011:
            io.grpc.internal.c1$e r0 = p264io.grpc.internal.C11147c1.C11153e.IDLE     // Catch:{ all -> 0x0021 }
            r2.f43011e = r0     // Catch:{ all -> 0x0021 }
        L_0x0015:
            io.grpc.internal.c1$e r0 = r2.f43011e     // Catch:{ all -> 0x0021 }
            io.grpc.internal.c1$e r1 = p264io.grpc.internal.C11147c1.C11153e.PING_SENT     // Catch:{ all -> 0x0021 }
            if (r0 != r1) goto L_0x001f
            io.grpc.internal.c1$e r0 = p264io.grpc.internal.C11147c1.C11153e.IDLE_AND_PING_SENT     // Catch:{ all -> 0x0021 }
            r2.f43011e = r0     // Catch:{ all -> 0x0021 }
        L_0x001f:
            monitor-exit(r2)
            return
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11147c1.mo35002o():void");
    }

    /* renamed from: p */
    public synchronized void mo35003p() {
        if (this.f43010d) {
            mo35001n();
        }
    }

    /* renamed from: q */
    public synchronized void mo35004q() {
        C11153e eVar = this.f43011e;
        C11153e eVar2 = C11153e.DISCONNECTED;
        if (eVar != eVar2) {
            this.f43011e = eVar2;
            ScheduledFuture<?> scheduledFuture = this.f43012f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture<?> scheduledFuture2 = this.f43013g;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.f43013g = null;
            }
        }
    }

    C11147c1(C11152d dVar, ScheduledExecutorService scheduledExecutorService, C6441r rVar, long j, long j2, boolean z) {
        this.f43011e = C11153e.IDLE;
        this.f43014h = new C11159d1(new C11148a());
        this.f43015i = new C11159d1(new C11149b());
        this.f43009c = (C11152d) C6431n.m37562o(dVar, "keepAlivePinger");
        this.f43007a = (ScheduledExecutorService) C6431n.m37562o(scheduledExecutorService, "scheduler");
        this.f43008b = (C6441r) C6431n.m37562o(rVar, "stopwatch");
        this.f43016j = j;
        this.f43017k = j2;
        this.f43010d = z;
        rVar.mo21859f().mo21860g();
    }
}
