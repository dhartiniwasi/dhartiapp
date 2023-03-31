package kotlinx.coroutines.scheduling;

import androidx.concurrent.futures.C0600b;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p410yd.C13330n0;

/* renamed from: kotlinx.coroutines.scheduling.n */
/* compiled from: WorkQueue.kt */
public final class C11753n {

    /* renamed from: b */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f44370b;

    /* renamed from: c */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f44371c;

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f44372d;

    /* renamed from: e */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f44373e;

    /* renamed from: a */
    private final AtomicReferenceArray<C11747h> f44374a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;

    static {
        Class<C11753n> cls = C11753n.class;
        f44370b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        f44371c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        f44372d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
        f44373e = AtomicIntegerFieldUpdater.newUpdater(cls, "blockingTasksInBuffer");
    }

    /* renamed from: b */
    public static /* synthetic */ C11747h m57043b(C11753n nVar, C11747h hVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return nVar.mo35989a(hVar, z);
    }

    /* renamed from: c */
    private final C11747h m57044c(C11747h hVar) {
        boolean z = true;
        if (hVar.f44359b.mo35986b() != 1) {
            z = false;
        }
        if (z) {
            f44373e.incrementAndGet(this);
        }
        if (mo35990e() == 127) {
            return hVar;
        }
        int i = this.producerIndex & 127;
        while (this.f44374a.get(i) != null) {
            Thread.yield();
        }
        this.f44374a.lazySet(i, hVar);
        f44371c.incrementAndGet(this);
        return null;
    }

    /* renamed from: d */
    private final void m57045d(C11747h hVar) {
        if (hVar != null) {
            boolean z = false;
            if (hVar.f44359b.mo35986b() == 1) {
                int decrementAndGet = f44373e.decrementAndGet(this);
                if (C13330n0.m62281a()) {
                    if (decrementAndGet >= 0) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    /* renamed from: i */
    private final C11747h m57046i() {
        C11747h andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f44372d.compareAndSet(this, i, i + 1) && (andSet = this.f44374a.getAndSet(i2, (Object) null)) != null) {
                m57045d(andSet);
                return andSet;
            }
        }
    }

    /* renamed from: j */
    private final boolean m57047j(C11743d dVar) {
        C11747h i = m57046i();
        if (i == null) {
            return false;
        }
        dVar.mo35940a(i);
        return true;
    }

    /* renamed from: m */
    private final long m57048m(C11753n nVar, boolean z) {
        C11747h hVar;
        do {
            hVar = (C11747h) nVar.lastScheduledTask;
            if (hVar == null) {
                return -2;
            }
            if (z) {
                boolean z2 = true;
                if (hVar.f44359b.mo35986b() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2;
                }
            }
            long a = C11751l.f44366e.mo35983a() - hVar.f44358a;
            long j = C11751l.f44362a;
            if (a < j) {
                return j - a;
            }
        } while (!C0600b.m2800a(f44370b, nVar, hVar, (Object) null));
        m57043b(this, hVar, false, 2, (Object) null);
        return -1;
    }

    /* renamed from: a */
    public final C11747h mo35989a(C11747h hVar, boolean z) {
        if (z) {
            return m57044c(hVar);
        }
        C11747h hVar2 = (C11747h) f44370b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return m57044c(hVar2);
    }

    /* renamed from: e */
    public final int mo35990e() {
        return this.producerIndex - this.consumerIndex;
    }

    /* renamed from: f */
    public final int mo35991f() {
        return this.lastScheduledTask != null ? mo35990e() + 1 : mo35990e();
    }

    /* renamed from: g */
    public final void mo35992g(C11743d dVar) {
        C11747h hVar = (C11747h) f44370b.getAndSet(this, (Object) null);
        if (hVar != null) {
            dVar.mo35940a(hVar);
        }
        do {
        } while (m57047j(dVar));
    }

    /* renamed from: h */
    public final C11747h mo35993h() {
        C11747h hVar = (C11747h) f44370b.getAndSet(this, (Object) null);
        return hVar == null ? m57046i() : hVar;
    }

    /* renamed from: k */
    public final long mo35994k(C11753n nVar) {
        if (C13330n0.m62281a()) {
            if (!(mo35990e() == 0)) {
                throw new AssertionError();
            }
        }
        int i = nVar.producerIndex;
        AtomicReferenceArray<C11747h> atomicReferenceArray = nVar.f44374a;
        for (int i2 = nVar.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (nVar.blockingTasksInBuffer == 0) {
                break;
            }
            C11747h hVar = atomicReferenceArray.get(i3);
            if (hVar != null) {
                if ((hVar.f44359b.mo35986b() == 1) && atomicReferenceArray.compareAndSet(i3, hVar, (Object) null)) {
                    f44373e.decrementAndGet(nVar);
                    m57043b(this, hVar, false, 2, (Object) null);
                    return -1;
                }
            }
        }
        return m57048m(nVar, true);
    }

    /* renamed from: l */
    public final long mo35995l(C11753n nVar) {
        boolean z = true;
        if (C13330n0.m62281a()) {
            if (!(mo35990e() == 0)) {
                throw new AssertionError();
            }
        }
        C11747h i = nVar.m57046i();
        if (i == null) {
            return m57048m(nVar, false);
        }
        C11747h b = m57043b(this, i, false, 2, (Object) null);
        if (!C13330n0.m62281a()) {
            return -1;
        }
        if (b != null) {
            z = false;
        }
        if (z) {
            return -1;
        }
        throw new AssertionError();
    }
}
