package p410yd;

import androidx.concurrent.futures.C0600b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C11669k;
import kotlinx.coroutines.internal.C11709j0;
import kotlinx.coroutines.internal.C11711k0;
import kotlinx.coroutines.internal.C11726t;
import p272jd.C11570g;

/* renamed from: yd.b1 */
/* compiled from: EventLoop.common.kt */
public abstract class C13270b1 extends C13279c1 implements C13344r0 {

    /* renamed from: e */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f47599e;

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f47600f;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;
    private volatile /* synthetic */ Object _queue = null;

    /* renamed from: yd.b1$a */
    /* compiled from: EventLoop.common.kt */
    public static abstract class C13271a implements Runnable, Comparable<C13271a>, C13368y0, C11711k0 {

        /* renamed from: a */
        public long f47601a;

        /* renamed from: b */
        private Object f47602b;

        /* renamed from: c */
        private int f47603c;

        /* renamed from: a */
        public void mo35919a(C11709j0<?> j0Var) {
            if (this.f47602b != C13290e1.f47616a) {
                this.f47602b = j0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: b */
        public C11709j0<?> mo35920b() {
            Object obj = this.f47602b;
            if (obj instanceof C11709j0) {
                return (C11709j0) obj;
            }
            return null;
        }

        public final synchronized void dispose() {
            Object obj = this.f47602b;
            if (obj != C13290e1.f47616a) {
                C13272b bVar = obj instanceof C13272b ? (C13272b) obj : null;
                if (bVar != null) {
                    bVar.mo35914g(this);
                }
                this.f47602b = C13290e1.f47616a;
            }
        }

        /* renamed from: j */
        public void mo35921j(int i) {
            this.f47603c = i;
        }

        /* renamed from: k */
        public int mo35922k() {
            return this.f47603c;
        }

        /* renamed from: n */
        public int compareTo(C13271a aVar) {
            int i = ((this.f47601a - aVar.f47601a) > 0 ? 1 : ((this.f47601a - aVar.f47601a) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* renamed from: o */
        public final synchronized int mo38402o(long j, C13272b bVar, C13270b1 b1Var) {
            if (this.f47602b == C13290e1.f47616a) {
                return 2;
            }
            synchronized (bVar) {
                C13271a aVar = (C13271a) bVar.mo35910b();
                if (b1Var.m62147E0()) {
                    return 1;
                }
                if (aVar == null) {
                    bVar.f47604b = j;
                } else {
                    long j2 = aVar.f47601a;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - bVar.f47604b > 0) {
                        bVar.f47604b = j;
                    }
                }
                long j3 = this.f47601a;
                long j4 = bVar.f47604b;
                if (j3 - j4 < 0) {
                    this.f47601a = j4;
                }
                bVar.mo35909a(this);
                return 0;
            }
        }

        /* renamed from: p */
        public final boolean mo38403p(long j) {
            return j - this.f47601a >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f47601a + ']';
        }
    }

    /* renamed from: yd.b1$b */
    /* compiled from: EventLoop.common.kt */
    public static final class C13272b extends C11709j0<C13271a> {

        /* renamed from: b */
        public long f47604b;

        public C13272b(long j) {
            this.f47604b = j;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C13270b1> cls2 = C13270b1.class;
        f47599e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_queue");
        f47600f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_delayed");
    }

    /* renamed from: B0 */
    private final boolean m62146B0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (m62147E0()) {
                return false;
            }
            if (obj == null) {
                if (C0600b.m2800a(f47599e, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C11726t) {
                C11726t tVar = (C11726t) obj;
                int a = tVar.mo35944a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    C0600b.m2800a(f47599e, this, obj, tVar.mo35948i());
                } else if (a == 2) {
                    return false;
                }
            } else if (obj == C13290e1.f47617b) {
                return false;
            } else {
                C11726t tVar2 = new C11726t(8, true);
                tVar2.mo35944a((Runnable) obj);
                tVar2.mo35944a(runnable);
                if (C0600b.m2800a(f47599e, this, obj, tVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public final boolean m62147E0() {
        return this._isCompleted;
    }

    /* renamed from: I0 */
    private final void m62148I0() {
        C13274c.m62170a();
        long nanoTime = System.nanoTime();
        while (true) {
            C13272b bVar = (C13272b) this._delayed;
            C13271a aVar = bVar == null ? null : (C13271a) bVar.mo35916i();
            if (aVar != null) {
                mo38412k0(nanoTime, aVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: N0 */
    private final int m62149N0(long j, C13271a aVar) {
        if (m62147E0()) {
            return 1;
        }
        C13272b bVar = (C13272b) this._delayed;
        if (bVar == null) {
            C0600b.m2800a(f47600f, this, (Object) null, new C13272b(j));
            Object obj = this._delayed;
            C11669k.m56784b(obj);
            bVar = (C13272b) obj;
        }
        return aVar.mo38402o(j, bVar, this);
    }

    /* renamed from: P0 */
    private final void m62150P0(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    /* renamed from: Q0 */
    private final boolean m62151Q0(C13271a aVar) {
        C13272b bVar = (C13272b) this._delayed;
        return (bVar == null ? null : (C13271a) bVar.mo35913e()) == aVar;
    }

    /* renamed from: u0 */
    private final void m62153u0() {
        if (!C13330n0.m62281a() || m62147E0()) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    if (C0600b.m2800a(f47599e, this, (Object) null, C13290e1.f47617b)) {
                        return;
                    }
                } else if (obj instanceof C11726t) {
                    ((C11726t) obj).mo35945d();
                    return;
                } else if (obj != C13290e1.f47617b) {
                    C11726t tVar = new C11726t(8, true);
                    tVar.mo35944a((Runnable) obj);
                    if (C0600b.m2800a(f47599e, this, obj, tVar)) {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: v0 */
    private final Runnable m62154v0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof C11726t) {
                C11726t tVar = (C11726t) obj;
                Object j = tVar.mo35949j();
                if (j != C11726t.f44307h) {
                    return (Runnable) j;
                }
                C0600b.m2800a(f47599e, this, obj, tVar.mo35948i());
            } else if (obj == C13290e1.f47617b) {
                return null;
            } else {
                if (C0600b.m2800a(f47599e, this, obj, (Object) null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F0 */
    public boolean mo38394F0() {
        if (!mo38387d0()) {
            return false;
        }
        C13272b bVar = (C13272b) this._delayed;
        if (bVar != null && !bVar.mo35912d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C11726t) {
                return ((C11726t) obj).mo35947g();
            }
            if (obj == C13290e1.f47617b) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* renamed from: H */
    public final void mo35925H(C11570g gVar, Runnable runnable) {
        mo38398y0(runnable);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004f  */
    /* renamed from: H0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo38395H0() {
        /*
            r9 = this;
            boolean r0 = r9.mo38388f0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.lang.Object r0 = r9._delayed
            yd.b1$b r0 = (p410yd.C13270b1.C13272b) r0
            if (r0 == 0) goto L_0x0045
            boolean r3 = r0.mo35912d()
            if (r3 != 0) goto L_0x0045
            p410yd.C13274c.m62170a()
            long r3 = java.lang.System.nanoTime()
        L_0x001c:
            monitor-enter(r0)
            kotlinx.coroutines.internal.k0 r5 = r0.mo35910b()     // Catch:{ all -> 0x0042 }
            r6 = 0
            if (r5 != 0) goto L_0x0026
            monitor-exit(r0)
            goto L_0x003d
        L_0x0026:
            yd.b1$a r5 = (p410yd.C13270b1.C13271a) r5     // Catch:{ all -> 0x0042 }
            boolean r7 = r5.mo38403p(r3)     // Catch:{ all -> 0x0042 }
            r8 = 0
            if (r7 == 0) goto L_0x0034
            boolean r5 = r9.m62146B0(r5)     // Catch:{ all -> 0x0042 }
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            if (r5 == 0) goto L_0x003c
            kotlinx.coroutines.internal.k0 r5 = r0.mo35915h(r8)     // Catch:{ all -> 0x0042 }
            r6 = r5
        L_0x003c:
            monitor-exit(r0)
        L_0x003d:
            yd.b1$a r6 = (p410yd.C13270b1.C13271a) r6
            if (r6 != 0) goto L_0x001c
            goto L_0x0045
        L_0x0042:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0045:
            java.lang.Runnable r0 = r9.m62154v0()
            if (r0 == 0) goto L_0x004f
            r0.run()
            return r1
        L_0x004f:
            long r0 = r9.mo38384U()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p410yd.C13270b1.mo38395H0():long");
    }

    /* access modifiers changed from: protected */
    /* renamed from: J0 */
    public final void mo38396J0() {
        this._queue = null;
        this._delayed = null;
    }

    /* renamed from: M0 */
    public final void mo38397M0(long j, C13271a aVar) {
        int N0 = m62149N0(j, aVar);
        if (N0 != 0) {
            if (N0 == 1) {
                mo38412k0(j, aVar);
            } else if (N0 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (m62151Q0(aVar)) {
            mo38413r0();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public long mo38384U() {
        if (super.mo38384U() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C11726t) {
                if (!((C11726t) obj).mo35947g()) {
                    return 0;
                }
            } else if (obj == C13290e1.f47617b) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        C13272b bVar = (C13272b) this._delayed;
        C13271a aVar = bVar == null ? null : (C13271a) bVar.mo35913e();
        if (aVar == null) {
            return Long.MAX_VALUE;
        }
        long j = aVar.f47601a;
        C13274c.m62170a();
        return C12756f.m60450b(j - System.nanoTime(), 0);
    }

    public void shutdown() {
        C13301g2.f47622a.mo38423b();
        m62150P0(true);
        m62153u0();
        do {
        } while (mo38395H0() <= 0);
        m62148I0();
    }

    /* renamed from: y0 */
    public void mo38398y0(Runnable runnable) {
        if (m62146B0(runnable)) {
            mo38413r0();
        } else {
            C13336p0.f47658g.mo38398y0(runnable);
        }
    }
}
