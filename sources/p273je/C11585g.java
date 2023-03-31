package p273je;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p244ge.C10350a;
import p244ge.C10375h0;
import p253he.C10543e;
import p273je.C11590k;
import p309ne.C12008f;

/* renamed from: je.g */
/* compiled from: RealConnectionPool */
public final class C11585g {

    /* renamed from: g */
    private static final Executor f44098g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C10543e.m53035H("OkHttp ConnectionPool", true));

    /* renamed from: a */
    private final int f44099a;

    /* renamed from: b */
    private final long f44100b;

    /* renamed from: c */
    private final Runnable f44101c = new C11584f(this);

    /* renamed from: d */
    private final Deque<C11583e> f44102d = new ArrayDeque();

    /* renamed from: e */
    final C11586h f44103e = new C11586h();

    /* renamed from: f */
    boolean f44104f;

    public C11585g(int i, long j, TimeUnit timeUnit) {
        this.f44099a = i;
        this.f44100b = timeUnit.toNanos(j);
        if (j <= 0) {
            throw new IllegalArgumentException("keepAliveDuration <= 0: " + j);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void m56567e() {
        /*
            r6 = this;
        L_0x0000:
            long r0 = java.lang.System.nanoTime()
            long r0 = r6.mo35717b(r0)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000f
            return
        L_0x000f:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0000
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r0 / r2
            long r2 = r2 * r4
            long r0 = r0 - r2
            monitor-enter(r6)
            int r1 = (int) r0
            r6.wait(r4, r1)     // Catch:{ InterruptedException -> 0x0025 }
            goto L_0x0025
        L_0x0023:
            r0 = move-exception
            goto L_0x0027
        L_0x0025:
            monitor-exit(r6)     // Catch:{ all -> 0x0023 }
            goto L_0x0000
        L_0x0027:
            monitor-exit(r6)     // Catch:{ all -> 0x0023 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p273je.C11585g.m56567e():void");
    }

    /* renamed from: f */
    private int m56568f(C11583e eVar, long j) {
        List<Reference<C11590k>> list = eVar.f44095p;
        int i = 0;
        while (i < list.size()) {
            Reference reference = list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                C12008f.m57887l().mo36364t("A connection to " + eVar.mo35711q().mo33335a().mo33199l() + " was leaked. Did you forget to close a response body?", ((C11590k.C11592b) reference).f44134a);
                list.remove(i);
                eVar.f44090k = true;
                if (list.isEmpty()) {
                    eVar.f44096q = j - this.f44100b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo35717b(long j) {
        synchronized (this) {
            C11583e eVar = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (C11583e next : this.f44102d) {
                if (m56568f(next, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - next.f44096q;
                    if (j3 > j2) {
                        eVar = next;
                        j2 = j3;
                    }
                }
            }
            long j4 = this.f44100b;
            if (j2 < j4) {
                if (i <= this.f44099a) {
                    if (i > 0) {
                        long j5 = j4 - j2;
                        return j5;
                    } else if (i2 > 0) {
                        return j4;
                    } else {
                        this.f44104f = false;
                        return -1;
                    }
                }
            }
            this.f44102d.remove(eVar);
            C10543e.m53046g(eVar.mo35712s());
            return 0;
        }
    }

    /* renamed from: c */
    public void mo35718c(C10375h0 h0Var, IOException iOException) {
        if (h0Var.mo33336b().type() != Proxy.Type.DIRECT) {
            C10350a a = h0Var.mo33335a();
            a.mo33196i().connectFailed(a.mo33199l().mo33418C(), h0Var.mo33336b().address(), iOException);
        }
        this.f44103e.mo35723b(h0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo35719d(C11583e eVar) {
        if (eVar.f44090k || this.f44099a == 0) {
            this.f44102d.remove(eVar);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo35720g(C11583e eVar) {
        if (!this.f44104f) {
            this.f44104f = true;
            f44098g.execute(this.f44101c);
        }
        this.f44102d.add(eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo35721h(C10350a aVar, C11590k kVar, List<C10375h0> list, boolean z) {
        for (C11583e next : this.f44102d) {
            if ((!z || next.mo35708n()) && next.mo35706l(aVar, list)) {
                kVar.mo35733a(next);
                return true;
            }
        }
        return false;
    }
}
