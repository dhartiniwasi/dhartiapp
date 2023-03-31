package p410yd;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import p410yd.C13270b1;

/* renamed from: yd.p0 */
/* compiled from: DefaultExecutor.kt */
public final class C13336p0 extends C13270b1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: g */
    public static final C13336p0 f47658g;

    /* renamed from: h */
    private static final long f47659h;

    static {
        Long l;
        C13336p0 p0Var = new C13336p0();
        f47658g = p0Var;
        C13266a1.m62134Y(p0Var, false, 1, (Object) null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f47659h = timeUnit.toNanos(l.longValue());
    }

    private C13336p0() {
    }

    /* renamed from: R0 */
    private final synchronized void m62292R0() {
        if (m62295c1()) {
            debugStatus = 3;
            mo38396J0();
            notifyAll();
        }
    }

    /* renamed from: U0 */
    private final synchronized Thread m62293U0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    /* renamed from: V0 */
    private final boolean m62294V0() {
        return debugStatus == 4;
    }

    /* renamed from: c1 */
    private final boolean m62295c1() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    /* renamed from: d1 */
    private final synchronized boolean m62296d1() {
        if (m62295c1()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    /* renamed from: f1 */
    private final void m62297f1() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public Thread mo38411i0() {
        Thread thread = _thread;
        return thread == null ? m62293U0() : thread;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public void mo38412k0(long j, C13270b1.C13271a aVar) {
        m62297f1();
    }

    public void run() {
        C13301g2.f47622a.mo38424c(this);
        C13274c.m62170a();
        try {
            if (m62296d1()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long H0 = mo38395H0();
                    if (H0 == Long.MAX_VALUE) {
                        C13274c.m62170a();
                        long nanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f47659h + nanoTime;
                        }
                        long j2 = j - nanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m62292R0();
                            C13274c.m62170a();
                            if (!mo38394F0()) {
                                mo38411i0();
                                return;
                            }
                            return;
                        }
                        H0 = C12756f.m60452d(H0, j2);
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (H0 > 0) {
                        if (m62295c1()) {
                            _thread = null;
                            m62292R0();
                            C13274c.m62170a();
                            if (!mo38394F0()) {
                                mo38411i0();
                                return;
                            }
                            return;
                        }
                        C13274c.m62170a();
                        LockSupport.parkNanos(this, H0);
                    }
                }
            }
        } finally {
            _thread = null;
            m62292R0();
            C13274c.m62170a();
            if (!mo38394F0()) {
                mo38411i0();
            }
        }
    }

    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    /* renamed from: y0 */
    public void mo38398y0(Runnable runnable) {
        if (m62294V0()) {
            m62297f1();
        }
        super.mo38398y0(runnable);
    }
}
