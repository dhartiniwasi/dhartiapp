package kotlinx.coroutines.internal;

import p272jd.C11570g;
import p410yd.C13282d0;
import p410yd.C13341q0;
import p410yd.C13344r0;

/* renamed from: kotlinx.coroutines.internal.n */
/* compiled from: LimitedDispatcher.kt */
public final class C11716n extends C13282d0 implements Runnable, C13344r0 {

    /* renamed from: b */
    private final C13282d0 f44288b;

    /* renamed from: c */
    private final int f44289c;

    /* renamed from: d */
    private final /* synthetic */ C13344r0 f44290d;

    /* renamed from: e */
    private final C11725s<Runnable> f44291e;

    /* renamed from: f */
    private final Object f44292f;
    private volatile int runningWorkers;

    public C11716n(C13282d0 d0Var, int i) {
        this.f44288b = d0Var;
        this.f44289c = i;
        C13344r0 r0Var = d0Var instanceof C13344r0 ? (C13344r0) d0Var : null;
        this.f44290d = r0Var == null ? C13341q0.m62313a() : r0Var;
        this.f44291e = new C11725s<>(false);
        this.f44292f = new Object();
    }

    /* renamed from: L */
    private final boolean m56928L(Runnable runnable) {
        this.f44291e.mo35940a(runnable);
        return this.runningWorkers >= this.f44289c;
    }

    /* renamed from: Q */
    private final boolean m56929Q() {
        synchronized (this.f44292f) {
            if (this.runningWorkers >= this.f44289c) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    /* renamed from: H */
    public void mo35925H(C11570g gVar, Runnable runnable) {
        if (!m56928L(runnable) && m56929Q()) {
            this.f44288b.mo35925H(this, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r4.f44292f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.f44291e.mo35942c() != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.runningWorkers++;
        r2 = p243gd.C10349s.f40964a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            kotlinx.coroutines.internal.s<java.lang.Runnable> r2 = r4.f44291e
            java.lang.Object r2 = r2.mo35943d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch:{ all -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            jd.h r3 = p272jd.C11576h.f44049a
            p410yd.C13297g0.m62201a(r3, r2)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            yd.d0 r2 = r4.f44288b
            boolean r2 = r2.mo35954I(r4)
            if (r2 == 0) goto L_0x0002
            yd.d0 r0 = r4.f44288b
            r0.mo35925H(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.f44292f
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + -1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            kotlinx.coroutines.internal.s<java.lang.Runnable> r2 = r4.f44291e     // Catch:{ all -> 0x0047 }
            int r2 = r2.mo35942c()     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            gd.s r2 = p243gd.C10349s.f40964a     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            goto L_0x0001
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C11716n.run():void");
    }
}
