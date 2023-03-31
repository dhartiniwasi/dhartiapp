package p264io.grpc.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import p343rc.C12399u0;

/* renamed from: io.grpc.internal.i1 */
/* compiled from: ManagedChannelOrphanWrapper */
final class C11253i1 extends C11292m0 {

    /* renamed from: c */
    private static final ReferenceQueue<C11253i1> f43320c = new ReferenceQueue<>();

    /* renamed from: d */
    private static final ConcurrentMap<C11254a, C11254a> f43321d = new ConcurrentHashMap();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final Logger f43322e = Logger.getLogger(C11253i1.class.getName());

    /* renamed from: b */
    private final C11254a f43323b;

    /* renamed from: io.grpc.internal.i1$a */
    /* compiled from: ManagedChannelOrphanWrapper */
    static final class C11254a extends WeakReference<C11253i1> {

        /* renamed from: f */
        private static final boolean f43324f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* renamed from: g */
        private static final RuntimeException f43325g = m55511e();

        /* renamed from: a */
        private final ReferenceQueue<C11253i1> f43326a;

        /* renamed from: b */
        private final ConcurrentMap<C11254a, C11254a> f43327b;

        /* renamed from: c */
        private final String f43328c;

        /* renamed from: d */
        private final Reference<RuntimeException> f43329d;

        /* renamed from: e */
        private final AtomicBoolean f43330e = new AtomicBoolean();

        C11254a(C11253i1 i1Var, C12399u0 u0Var, ReferenceQueue<C11253i1> referenceQueue, ConcurrentMap<C11254a, C11254a> concurrentMap) {
            super(i1Var, referenceQueue);
            RuntimeException runtimeException;
            if (f43324f) {
                runtimeException = new RuntimeException("ManagedChannel allocation site");
            } else {
                runtimeException = f43325g;
            }
            this.f43329d = new SoftReference(runtimeException);
            this.f43328c = u0Var.toString();
            this.f43326a = referenceQueue;
            this.f43327b = concurrentMap;
            concurrentMap.put(this, this);
            m55508b(referenceQueue);
        }

        /* renamed from: b */
        static int m55508b(ReferenceQueue<C11253i1> referenceQueue) {
            int i = 0;
            while (true) {
                C11254a aVar = (C11254a) referenceQueue.poll();
                if (aVar == null) {
                    return i;
                }
                RuntimeException runtimeException = aVar.f43329d.get();
                aVar.m55509c();
                if (!aVar.f43330e.get()) {
                    i++;
                    Level level = Level.SEVERE;
                    if (C11253i1.f43322e.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Channel {0} was not shutdown properly!!! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        logRecord.setLoggerName(C11253i1.f43322e.getName());
                        logRecord.setParameters(new Object[]{aVar.f43328c});
                        logRecord.setThrown(runtimeException);
                        C11253i1.f43322e.log(logRecord);
                    }
                }
            }
        }

        /* renamed from: c */
        private void m55509c() {
            super.clear();
            this.f43327b.remove(this);
            this.f43329d.clear();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m55510d() {
            if (!this.f43330e.getAndSet(true)) {
                clear();
            }
        }

        /* renamed from: e */
        private static RuntimeException m55511e() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        public void clear() {
            m55509c();
            m55508b(this.f43326a);
        }
    }

    C11253i1(C12399u0 u0Var) {
        this(u0Var, f43320c, f43321d);
    }

    /* renamed from: m */
    public C12399u0 mo35086m() {
        this.f43323b.m55510d();
        return super.mo35086m();
    }

    /* renamed from: n */
    public C12399u0 mo35087n() {
        this.f43323b.m55510d();
        return super.mo35087n();
    }

    C11253i1(C12399u0 u0Var, ReferenceQueue<C11253i1> referenceQueue, ConcurrentMap<C11254a, C11254a> concurrentMap) {
        super(u0Var);
        this.f43323b = new C11254a(this, u0Var, referenceQueue, concurrentMap);
    }
}
