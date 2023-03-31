package p264io.grpc.internal;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6431n;

/* renamed from: io.grpc.internal.d2 */
/* compiled from: SerializingExecutor */
public final class C11160d2 implements Executor, Runnable {

    /* renamed from: d */
    private static final Logger f43045d = Logger.getLogger(C11160d2.class.getName());

    /* renamed from: e */
    private static final C11162b f43046e = m55227d();

    /* renamed from: a */
    private Executor f43047a;

    /* renamed from: b */
    private final Queue<Runnable> f43048b = new ConcurrentLinkedQueue();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public volatile int f43049c = 0;

    /* renamed from: io.grpc.internal.d2$b */
    /* compiled from: SerializingExecutor */
    private static abstract class C11162b {
        private C11162b() {
        }

        /* renamed from: a */
        public abstract boolean mo35035a(C11160d2 d2Var, int i, int i2);

        /* renamed from: b */
        public abstract void mo35036b(C11160d2 d2Var, int i);
    }

    /* renamed from: io.grpc.internal.d2$c */
    /* compiled from: SerializingExecutor */
    private static final class C11163c extends C11162b {

        /* renamed from: a */
        private final AtomicIntegerFieldUpdater<C11160d2> f43050a;

        /* renamed from: a */
        public boolean mo35035a(C11160d2 d2Var, int i, int i2) {
            return this.f43050a.compareAndSet(d2Var, i, i2);
        }

        /* renamed from: b */
        public void mo35036b(C11160d2 d2Var, int i) {
            this.f43050a.set(d2Var, i);
        }

        private C11163c(AtomicIntegerFieldUpdater<C11160d2> atomicIntegerFieldUpdater) {
            super();
            this.f43050a = atomicIntegerFieldUpdater;
        }
    }

    /* renamed from: io.grpc.internal.d2$d */
    /* compiled from: SerializingExecutor */
    private static final class C11164d extends C11162b {
        private C11164d() {
            super();
        }

        /* renamed from: a */
        public boolean mo35035a(C11160d2 d2Var, int i, int i2) {
            synchronized (d2Var) {
                if (d2Var.f43049c != i) {
                    return false;
                }
                int unused = d2Var.f43049c = i2;
                return true;
            }
        }

        /* renamed from: b */
        public void mo35036b(C11160d2 d2Var, int i) {
            synchronized (d2Var) {
                int unused = d2Var.f43049c = i;
            }
        }
    }

    public C11160d2(Executor executor) {
        C6431n.m37562o(executor, "'executor' must not be null.");
        this.f43047a = executor;
    }

    /* renamed from: d */
    private static C11162b m55227d() {
        try {
            return new C11163c(AtomicIntegerFieldUpdater.newUpdater(C11160d2.class, "c"));
        } catch (Throwable th) {
            f43045d.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            return new C11164d();
        }
    }

    /* renamed from: e */
    private void m55228e(Runnable runnable) {
        if (f43046e.mo35035a(this, 0, -1)) {
            try {
                this.f43047a.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f43048b.remove(runnable);
                }
                f43046e.mo35036b(this, 0);
                throw th;
            }
        }
    }

    public void execute(Runnable runnable) {
        this.f43048b.add((Runnable) C6431n.m37562o(runnable, "'r' must not be null."));
        m55228e(runnable);
    }

    public void run() {
        Runnable poll;
        try {
            Executor executor = this.f43047a;
            while (executor == this.f43047a && (poll = this.f43048b.poll()) != null) {
                poll.run();
            }
            f43046e.mo35036b(this, 0);
            if (!this.f43048b.isEmpty()) {
                m55228e((Runnable) null);
            }
        } catch (RuntimeException e) {
            Logger logger = f43045d;
            Level level = Level.SEVERE;
            logger.log(level, "Exception while executing runnable " + poll, e);
        } catch (Throwable th) {
            f43046e.mo35036b(this, 0);
            throw th;
        }
    }
}
