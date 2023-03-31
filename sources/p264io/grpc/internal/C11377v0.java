package p264io.grpc.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6441r;
import p264io.grpc.internal.C11351s;

/* renamed from: io.grpc.internal.v0 */
/* compiled from: Http2Ping */
public class C11377v0 {

    /* renamed from: g */
    private static final Logger f43640g = Logger.getLogger(C11377v0.class.getName());

    /* renamed from: a */
    private final long f43641a;

    /* renamed from: b */
    private final C6441r f43642b;

    /* renamed from: c */
    private Map<C11351s.C11352a, Executor> f43643c = new LinkedHashMap();

    /* renamed from: d */
    private boolean f43644d;

    /* renamed from: e */
    private Throwable f43645e;

    /* renamed from: f */
    private long f43646f;

    /* renamed from: io.grpc.internal.v0$a */
    /* compiled from: Http2Ping */
    class C11378a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11351s.C11352a f43647a;

        /* renamed from: b */
        final /* synthetic */ long f43648b;

        C11378a(C11351s.C11352a aVar, long j) {
            this.f43647a = aVar;
            this.f43648b = j;
        }

        public void run() {
            this.f43647a.mo35010b(this.f43648b);
        }
    }

    /* renamed from: io.grpc.internal.v0$b */
    /* compiled from: Http2Ping */
    class C11379b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11351s.C11352a f43649a;

        /* renamed from: b */
        final /* synthetic */ Throwable f43650b;

        C11379b(C11351s.C11352a aVar, Throwable th) {
            this.f43649a = aVar;
            this.f43650b = th;
        }

        public void run() {
            this.f43649a.mo35009a(this.f43650b);
        }
    }

    public C11377v0(long j, C6441r rVar) {
        this.f43641a = j;
        this.f43642b = rVar;
    }

    /* renamed from: b */
    private static Runnable m55945b(C11351s.C11352a aVar, long j) {
        return new C11378a(aVar, j);
    }

    /* renamed from: c */
    private static Runnable m55946c(C11351s.C11352a aVar, Throwable th) {
        return new C11379b(aVar, th);
    }

    /* renamed from: e */
    private static void m55947e(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f43640g.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    /* renamed from: g */
    public static void m55948g(C11351s.C11352a aVar, Executor executor, Throwable th) {
        m55947e(executor, m55946c(aVar, th));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        m55947e(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35365a(p264io.grpc.internal.C11351s.C11352a r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f43644d     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x000c
            java.util.Map<io.grpc.internal.s$a, java.util.concurrent.Executor> r0 = r2.f43643c     // Catch:{ all -> 0x0020 }
            r0.put(r3, r4)     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            return
        L_0x000c:
            java.lang.Throwable r0 = r2.f43645e     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x0015
            java.lang.Runnable r3 = m55946c(r3, r0)     // Catch:{ all -> 0x0020 }
            goto L_0x001b
        L_0x0015:
            long r0 = r2.f43646f     // Catch:{ all -> 0x0020 }
            java.lang.Runnable r3 = m55945b(r3, r0)     // Catch:{ all -> 0x0020 }
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            m55947e(r4, r3)
            return
        L_0x0020:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11377v0.mo35365a(io.grpc.internal.s$a, java.util.concurrent.Executor):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        if (r3.hasNext() == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r4 = r3.next();
        m55947e((java.util.concurrent.Executor) r4.getValue(), m55945b((p264io.grpc.internal.C11351s.C11352a) r4.getKey(), r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0043, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        r3 = r3.entrySet().iterator();
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo35366d() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f43644d     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            return r0
        L_0x0008:
            r0 = 1
            r6.f43644d = r0     // Catch:{ all -> 0x0044 }
            a7.r r1 = r6.f43642b     // Catch:{ all -> 0x0044 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0044 }
            long r1 = r1.mo21858d(r2)     // Catch:{ all -> 0x0044 }
            r6.f43646f = r1     // Catch:{ all -> 0x0044 }
            java.util.Map<io.grpc.internal.s$a, java.util.concurrent.Executor> r3 = r6.f43643c     // Catch:{ all -> 0x0044 }
            r4 = 0
            r6.f43643c = r4     // Catch:{ all -> 0x0044 }
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0023:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0043
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5
            java.lang.Object r4 = r4.getKey()
            io.grpc.internal.s$a r4 = (p264io.grpc.internal.C11351s.C11352a) r4
            java.lang.Runnable r4 = m55945b(r4, r1)
            m55947e(r5, r4)
            goto L_0x0023
        L_0x0043:
            return r0
        L_0x0044:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0044 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11377v0.mo35366d():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        if (r0.hasNext() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        r1 = r0.next();
        m55948g((p264io.grpc.internal.C11351s.C11352a) r1.getKey(), (java.util.concurrent.Executor) r1.getValue(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r0.entrySet().iterator();
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35367f(java.lang.Throwable r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f43644d     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            return
        L_0x0007:
            r0 = 1
            r3.f43644d = r0     // Catch:{ all -> 0x0037 }
            r3.f43645e = r4     // Catch:{ all -> 0x0037 }
            java.util.Map<io.grpc.internal.s$a, java.util.concurrent.Executor> r0 = r3.f43643c     // Catch:{ all -> 0x0037 }
            r1 = 0
            r3.f43643c = r1     // Catch:{ all -> 0x0037 }
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x001a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0036
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            io.grpc.internal.s$a r2 = (p264io.grpc.internal.C11351s.C11352a) r2
            java.lang.Object r1 = r1.getValue()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            m55948g(r2, r1, r4)
            goto L_0x001a
        L_0x0036:
            return
        L_0x0037:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11377v0.mo35367f(java.lang.Throwable):void");
    }

    /* renamed from: h */
    public long mo35368h() {
        return this.f43641a;
    }
}
