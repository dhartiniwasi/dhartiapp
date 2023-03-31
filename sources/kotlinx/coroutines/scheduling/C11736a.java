package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import kotlinx.coroutines.internal.C11683b0;
import kotlinx.coroutines.internal.C11690e0;
import p243gd.C10349s;
import p353sd.C12516c;
import p410yd.C13274c;
import p410yd.C13330n0;
import p410yd.C13333o0;

/* renamed from: kotlinx.coroutines.scheduling.a */
/* compiled from: CoroutineScheduler.kt */
public final class C11736a implements Executor, Closeable {

    /* renamed from: h */
    public static final C11737a f44322h = new C11737a((C11665g) null);

    /* renamed from: i */
    private static final /* synthetic */ AtomicLongFieldUpdater f44323i = AtomicLongFieldUpdater.newUpdater(C11736a.class, "parkedWorkersStack");

    /* renamed from: r */
    static final /* synthetic */ AtomicLongFieldUpdater f44324r = AtomicLongFieldUpdater.newUpdater(C11736a.class, "controlState");

    /* renamed from: s */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f44325s = AtomicIntegerFieldUpdater.newUpdater(C11736a.class, "_isTerminated");

    /* renamed from: t */
    public static final C11690e0 f44326t = new C11690e0("NOT_IN_STACK");
    private volatile /* synthetic */ int _isTerminated;

    /* renamed from: a */
    public final int f44327a;

    /* renamed from: b */
    public final int f44328b;

    /* renamed from: c */
    public final long f44329c;
    volatile /* synthetic */ long controlState;

    /* renamed from: d */
    public final String f44330d;

    /* renamed from: e */
    public final C11743d f44331e;

    /* renamed from: f */
    public final C11743d f44332f;

    /* renamed from: g */
    public final C11683b0<C11739c> f44333g;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: kotlinx.coroutines.scheduling.a$a */
    /* compiled from: CoroutineScheduler.kt */
    public static final class C11737a {
        private C11737a() {
        }

        public /* synthetic */ C11737a(C11665g gVar) {
            this();
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$b */
    /* compiled from: CoroutineScheduler.kt */
    public /* synthetic */ class C11738b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44334a;

        static {
            int[] iArr = new int[C11740d.values().length];
            iArr[C11740d.PARKING.ordinal()] = 1;
            iArr[C11740d.BLOCKING.ordinal()] = 2;
            iArr[C11740d.CPU_ACQUIRED.ordinal()] = 3;
            iArr[C11740d.DORMANT.ordinal()] = 4;
            iArr[C11740d.TERMINATED.ordinal()] = 5;
            f44334a = iArr;
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$d */
    /* compiled from: CoroutineScheduler.kt */
    public enum C11740d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public C11736a(int i, int i2, long j, String str) {
        this.f44327a = i;
        this.f44328b = i2;
        this.f44329c = j;
        this.f44330d = str;
        boolean z = true;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j <= 0 ? false : z) {
                        this.f44331e = new C11743d();
                        this.f44332f = new C11743d();
                        this.parkedWorkersStack = 0;
                        this.f44333g = new C11683b0<>(i + 1);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    /* renamed from: F */
    private final void m56992F(boolean z) {
        long addAndGet = f44324r.addAndGet(this, 2097152);
        if (!z && !m56996Q() && !m56994K(addAndGet)) {
            m56996Q();
        }
    }

    /* renamed from: I */
    private final C11747h m56993I(C11739c cVar, C11747h hVar, boolean z) {
        if (cVar == null || cVar.f44337b == C11740d.TERMINATED) {
            return hVar;
        }
        if (hVar.f44359b.mo35986b() == 0 && cVar.f44337b == C11740d.BLOCKING) {
            return hVar;
        }
        cVar.f44341f = true;
        return cVar.f44336a.mo35989a(hVar, z);
    }

    /* renamed from: K */
    private final boolean m56994K(long j) {
        if (C12756f.m60449a(((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21)), 0) < this.f44327a) {
            int f = m56998f();
            if (f == 1 && this.f44327a > 1) {
                m56998f();
            }
            if (f > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    static /* synthetic */ boolean m56995L(C11736a aVar, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = aVar.controlState;
        }
        return aVar.m56994K(j);
    }

    /* renamed from: Q */
    private final boolean m56996Q() {
        C11739c q;
        do {
            q = m57002q();
            if (q == null) {
                return false;
            }
        } while (!C11739c.f44335h.compareAndSet(q, -1, 0));
        LockSupport.unpark(q);
        return true;
    }

    /* renamed from: b */
    private final boolean m56997b(C11747h hVar) {
        boolean z = true;
        if (hVar.f44359b.mo35986b() != 1) {
            z = false;
        }
        if (z) {
            return this.f44332f.mo35940a(hVar);
        }
        return this.f44331e.mo35940a(hVar);
    }

    /* renamed from: f */
    private final int m56998f() {
        synchronized (this.f44333g) {
            if (isTerminated()) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            boolean z = false;
            int a = C12756f.m60449a(i - ((int) ((j & 4398044413952L) >> 21)), 0);
            if (a >= this.f44327a) {
                return 0;
            }
            if (i >= this.f44328b) {
                return 0;
            }
            int i2 = ((int) (this.controlState & 2097151)) + 1;
            if (i2 > 0 && this.f44333g.mo35875b(i2) == null) {
                C11739c cVar = new C11739c(i2);
                this.f44333g.mo35876c(i2, cVar);
                if (i2 == ((int) (2097151 & f44324r.incrementAndGet(this)))) {
                    z = true;
                }
                if (z) {
                    cVar.start();
                    int i3 = a + 1;
                    return i3;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* renamed from: h */
    private final C11739c m56999h() {
        Thread currentThread = Thread.currentThread();
        C11739c cVar = currentThread instanceof C11739c ? (C11739c) currentThread : null;
        if (cVar != null && C11669k.m56783a(C11736a.this, this)) {
            return cVar;
        }
        return null;
    }

    /* renamed from: n */
    public static /* synthetic */ void m57000n(C11736a aVar, Runnable runnable, C11748i iVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            iVar = C11751l.f44367f;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        aVar.mo35967m(runnable, iVar, z);
    }

    /* renamed from: p */
    private final int m57001p(C11739c cVar) {
        Object h = cVar.mo35974h();
        while (h != f44326t) {
            if (h == null) {
                return 0;
            }
            C11739c cVar2 = (C11739c) h;
            int g = cVar2.mo35973g();
            if (g != 0) {
                return g;
            }
            h = cVar2.mo35974h();
        }
        return -1;
    }

    /* renamed from: q */
    private final C11739c m57002q() {
        while (true) {
            long j = this.parkedWorkersStack;
            C11739c b = this.f44333g.mo35875b((int) (2097151 & j));
            if (b == null) {
                return null;
            }
            long j2 = (2097152 + j) & -2097152;
            int p = m57001p(b);
            if (p >= 0) {
                if (f44323i.compareAndSet(this, j, ((long) p) | j2)) {
                    b.mo35977p(f44326t);
                    return b;
                }
            }
        }
    }

    /* renamed from: D */
    public final void mo35961D(long j) {
        int i;
        C11747h hVar;
        boolean z = false;
        if (f44325s.compareAndSet(this, 0, 1)) {
            C11739c h = m56999h();
            synchronized (this.f44333g) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    C11739c b = this.f44333g.mo35875b(i2);
                    C11669k.m56784b(b);
                    C11739c cVar = b;
                    if (cVar != h) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j);
                        }
                        C11740d dVar = cVar.f44337b;
                        if (C13330n0.m62281a()) {
                            if (!(dVar == C11740d.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        cVar.f44336a.mo35992g(this.f44332f);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.f44332f.mo35941b();
            this.f44331e.mo35941b();
            while (true) {
                if (h == null) {
                    hVar = null;
                } else {
                    hVar = h.mo35972f(true);
                }
                if (hVar == null && (hVar = (C11747h) this.f44331e.mo35943d()) == null && (hVar = (C11747h) this.f44332f.mo35943d()) == null) {
                    break;
                }
                mo35971x(hVar);
            }
            if (h != null) {
                h.mo35979s(C11740d.TERMINATED);
            }
            if (C13330n0.m62281a()) {
                if (((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.f44327a) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0;
            this.controlState = 0;
        }
    }

    /* renamed from: H */
    public final void mo35962H() {
        if (!m56996Q() && !m56995L(this, 0, 1, (Object) null)) {
            m56996Q();
        }
    }

    public void close() {
        mo35961D(10000);
    }

    public void execute(Runnable runnable) {
        m57000n(this, runnable, (C11748i) null, false, 6, (Object) null);
    }

    /* renamed from: g */
    public final C11747h mo35965g(Runnable runnable, C11748i iVar) {
        long a = C11751l.f44366e.mo35983a();
        if (!(runnable instanceof C11747h)) {
            return new C11750k(runnable, a, iVar);
        }
        C11747h hVar = (C11747h) runnable;
        hVar.f44358a = a;
        hVar.f44359b = iVar;
        return hVar;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* renamed from: m */
    public final void mo35967m(Runnable runnable, C11748i iVar, boolean z) {
        C13274c.m62170a();
        C11747h g = mo35965g(runnable, iVar);
        C11739c h = m56999h();
        C11747h I = m56993I(h, g, z);
        if (I == null || m56997b(I)) {
            boolean z2 = z && h != null;
            if (g.f44359b.mo35986b() != 0) {
                m56992F(z2);
            } else if (!z2) {
                mo35962H();
            }
        } else {
            throw new RejectedExecutionException(C11669k.m56792j(this.f44330d, " was terminated"));
        }
    }

    /* renamed from: t */
    public final boolean mo35968t(C11739c cVar) {
        long j;
        long j2;
        int g;
        if (cVar.mo35974h() != f44326t) {
            return false;
        }
        do {
            j = this.parkedWorkersStack;
            int i = (int) (2097151 & j);
            j2 = (2097152 + j) & -2097152;
            g = cVar.mo35973g();
            if (C13330n0.m62281a()) {
                if (!(g != 0)) {
                    throw new AssertionError();
                }
            }
            cVar.mo35977p(this.f44333g.mo35875b(i));
        } while (!f44323i.compareAndSet(this, j, ((long) g) | j2));
        return true;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a = this.f44333g.mo35874a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i6 < a) {
            int i7 = i6 + 1;
            C11739c b = this.f44333g.mo35875b(i6);
            if (b != null) {
                int f = b.f44336a.mo35991f();
                int i8 = C11738b.f44334a[b.f44337b.ordinal()];
                if (i8 == 1) {
                    i3++;
                } else if (i8 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(f);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i8 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i8 == 4) {
                    i4++;
                    if (f > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(f);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i8 == 5) {
                    i5++;
                }
            }
            i6 = i7;
        }
        long j = this.controlState;
        return this.f44330d + '@' + C13333o0.m62288b(this) + "[Pool Size {core = " + this.f44327a + ", max = " + this.f44328b + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f44331e.mo35942c() + ", global blocking queue size = " + this.f44332f.mo35942c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f44327a - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }

    /* renamed from: w */
    public final void mo35970w(C11739c cVar, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & -2097152;
            if (i3 == i) {
                i3 = i2 == 0 ? m57001p(cVar) : i2;
            }
            if (i3 >= 0) {
                if (f44323i.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    /* renamed from: x */
    public final void mo35971x(C11747h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            C13274c.m62170a();
            throw th;
        }
        C13274c.m62170a();
    }

    /* renamed from: kotlinx.coroutines.scheduling.a$c */
    /* compiled from: CoroutineScheduler.kt */
    public final class C11739c extends Thread {

        /* renamed from: h */
        static final /* synthetic */ AtomicIntegerFieldUpdater f44335h = AtomicIntegerFieldUpdater.newUpdater(C11739c.class, "workerCtl");

        /* renamed from: a */
        public final C11753n f44336a;

        /* renamed from: b */
        public C11740d f44337b;

        /* renamed from: c */
        private long f44338c;

        /* renamed from: d */
        private long f44339d;

        /* renamed from: e */
        private int f44340e;

        /* renamed from: f */
        public boolean f44341f;
        private volatile int indexInArray;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private C11739c() {
            setDaemon(true);
            this.f44336a = new C11753n();
            this.f44337b = C11740d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = C11736a.f44326t;
            this.f44340e = C12516c.f45978a.mo37304b();
        }

        /* renamed from: b */
        private final void m57011b(int i) {
            if (i != 0) {
                C11736a.f44324r.addAndGet(C11736a.this, -2097152);
                C11740d dVar = this.f44337b;
                if (dVar != C11740d.TERMINATED) {
                    if (C13330n0.m62281a()) {
                        if (!(dVar == C11740d.BLOCKING)) {
                            throw new AssertionError();
                        }
                    }
                    this.f44337b = C11740d.DORMANT;
                }
            }
        }

        /* renamed from: c */
        private final void m57012c(int i) {
            if (i != 0 && mo35979s(C11740d.BLOCKING)) {
                C11736a.this.mo35962H();
            }
        }

        /* renamed from: d */
        private final void m57013d(C11747h hVar) {
            int b = hVar.f44359b.mo35986b();
            m57015i(b);
            m57012c(b);
            C11736a.this.mo35971x(hVar);
            m57011b(b);
        }

        /* renamed from: e */
        private final C11747h m57014e(boolean z) {
            C11747h m;
            C11747h m2;
            if (z) {
                boolean z2 = mo35975k(C11736a.this.f44327a * 2) == 0;
                if (z2 && (m2 = m57018m()) != null) {
                    return m2;
                }
                C11747h h = this.f44336a.mo35993h();
                if (h != null) {
                    return h;
                }
                if (!z2 && (m = m57018m()) != null) {
                    return m;
                }
            } else {
                C11747h m3 = m57018m();
                if (m3 != null) {
                    return m3;
                }
            }
            return m57022t(false);
        }

        /* renamed from: i */
        private final void m57015i(int i) {
            this.f44338c = 0;
            if (this.f44337b == C11740d.PARKING) {
                if (C13330n0.m62281a()) {
                    boolean z = true;
                    if (i != 1) {
                        z = false;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                this.f44337b = C11740d.BLOCKING;
            }
        }

        /* renamed from: j */
        private final boolean m57016j() {
            return this.nextParkedWorker != C11736a.f44326t;
        }

        /* renamed from: l */
        private final void m57017l() {
            if (this.f44338c == 0) {
                this.f44338c = System.nanoTime() + C11736a.this.f44329c;
            }
            LockSupport.parkNanos(C11736a.this.f44329c);
            if (System.nanoTime() - this.f44338c >= 0) {
                this.f44338c = 0;
                m57023u();
            }
        }

        /* renamed from: m */
        private final C11747h m57018m() {
            if (mo35975k(2) == 0) {
                C11747h hVar = (C11747h) C11736a.this.f44331e.mo35943d();
                return hVar == null ? (C11747h) C11736a.this.f44332f.mo35943d() : hVar;
            }
            C11747h hVar2 = (C11747h) C11736a.this.f44332f.mo35943d();
            return hVar2 == null ? (C11747h) C11736a.this.f44331e.mo35943d() : hVar2;
        }

        /* renamed from: n */
        private final void m57019n() {
            loop0:
            while (true) {
                boolean z = false;
                while (!C11736a.this.isTerminated() && this.f44337b != C11740d.TERMINATED) {
                    C11747h f = mo35972f(this.f44341f);
                    if (f != null) {
                        this.f44339d = 0;
                        m57013d(f);
                    } else {
                        this.f44341f = false;
                        if (this.f44339d == 0) {
                            m57021r();
                        } else if (!z) {
                            z = true;
                        } else {
                            mo35979s(C11740d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f44339d);
                            this.f44339d = 0;
                        }
                    }
                }
            }
            mo35979s(C11740d.TERMINATED);
        }

        /* renamed from: q */
        private final boolean m57020q() {
            boolean z;
            if (this.f44337b != C11740d.CPU_ACQUIRED) {
                C11736a aVar = C11736a.this;
                while (true) {
                    long j = aVar.controlState;
                    if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                        if (C11736a.f44324r.compareAndSet(aVar, j, j - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f44337b = C11740d.CPU_ACQUIRED;
            }
            return true;
        }

        /* renamed from: r */
        private final void m57021r() {
            if (!m57016j()) {
                C11736a.this.mo35968t(this);
                return;
            }
            if (C13330n0.m62281a()) {
                if (!(this.f44336a.mo35991f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (m57016j() && this.workerCtl == -1 && !C11736a.this.isTerminated() && this.f44337b != C11740d.TERMINATED) {
                mo35979s(C11740d.PARKING);
                Thread.interrupted();
                m57017l();
            }
        }

        /* renamed from: t */
        private final C11747h m57022t(boolean z) {
            long j;
            if (C13330n0.m62281a()) {
                if (!(this.f44336a.mo35991f() == 0)) {
                    throw new AssertionError();
                }
            }
            int i = (int) (C11736a.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int k = mo35975k(i);
            C11736a aVar = C11736a.this;
            long j2 = Long.MAX_VALUE;
            int i2 = 0;
            while (i2 < i) {
                i2++;
                k++;
                if (k > i) {
                    k = 1;
                }
                C11739c b = aVar.f44333g.mo35875b(k);
                if (!(b == null || b == this)) {
                    if (C13330n0.m62281a()) {
                        if (!(this.f44336a.mo35991f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    if (z) {
                        j = this.f44336a.mo35994k(b.f44336a);
                    } else {
                        j = this.f44336a.mo35995l(b.f44336a);
                    }
                    if (j == -1) {
                        return this.f44336a.mo35993h();
                    }
                    if (j > 0) {
                        j2 = Math.min(j2, j);
                    }
                }
            }
            if (j2 == Long.MAX_VALUE) {
                j2 = 0;
            }
            this.f44339d = j2;
            return null;
        }

        /* renamed from: u */
        private final void m57023u() {
            C11736a aVar = C11736a.this;
            synchronized (aVar.f44333g) {
                if (!aVar.isTerminated()) {
                    if (((int) (aVar.controlState & 2097151)) > aVar.f44327a) {
                        if (f44335h.compareAndSet(this, -1, 1)) {
                            int g = mo35973g();
                            mo35976o(0);
                            aVar.mo35970w(this, g, 0);
                            int andDecrement = (int) (C11736a.f44324r.getAndDecrement(aVar) & 2097151);
                            if (andDecrement != g) {
                                C11739c b = aVar.f44333g.mo35875b(andDecrement);
                                C11669k.m56784b(b);
                                C11739c cVar = b;
                                aVar.f44333g.mo35876c(g, cVar);
                                cVar.mo35976o(g);
                                aVar.mo35970w(cVar, andDecrement, g);
                            }
                            aVar.f44333g.mo35876c(andDecrement, null);
                            C10349s sVar = C10349s.f40964a;
                            this.f44337b = C11740d.TERMINATED;
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        public final C11747h mo35972f(boolean z) {
            C11747h hVar;
            if (m57020q()) {
                return m57014e(z);
            }
            if (z) {
                hVar = this.f44336a.mo35993h();
                if (hVar == null) {
                    hVar = (C11747h) C11736a.this.f44332f.mo35943d();
                }
            } else {
                hVar = (C11747h) C11736a.this.f44332f.mo35943d();
            }
            return hVar == null ? m57022t(true) : hVar;
        }

        /* renamed from: g */
        public final int mo35973g() {
            return this.indexInArray;
        }

        /* renamed from: h */
        public final Object mo35974h() {
            return this.nextParkedWorker;
        }

        /* renamed from: k */
        public final int mo35975k(int i) {
            int i2 = this.f44340e;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f44340e = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: o */
        public final void mo35976o(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(C11736a.this.f44330d);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: p */
        public final void mo35977p(Object obj) {
            this.nextParkedWorker = obj;
        }

        public void run() {
            m57019n();
        }

        /* renamed from: s */
        public final boolean mo35979s(C11740d dVar) {
            C11740d dVar2 = this.f44337b;
            boolean z = dVar2 == C11740d.CPU_ACQUIRED;
            if (z) {
                C11736a.f44324r.addAndGet(C11736a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f44337b = dVar;
            }
            return z;
        }

        public C11739c(int i) {
            this();
            mo35976o(i);
        }
    }
}
