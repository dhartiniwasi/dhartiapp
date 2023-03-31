package p336qe;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: qe.a */
/* compiled from: AsyncTimeout */
public class C12226a extends C12253u {

    /* renamed from: h */
    private static final long f45364h;

    /* renamed from: i */
    private static final long f45365i;

    /* renamed from: j */
    static C12226a f45366j;

    /* renamed from: e */
    private boolean f45367e;

    /* renamed from: f */
    private C12226a f45368f;

    /* renamed from: g */
    private long f45369g;

    /* renamed from: qe.a$a */
    /* compiled from: AsyncTimeout */
    class C12227a implements C12251s {

        /* renamed from: a */
        final /* synthetic */ C12251s f45370a;

        C12227a(C12251s sVar) {
            this.f45370a = sVar;
        }

        public void close() throws IOException {
            C12226a.this.mo36753k();
            try {
                this.f45370a.close();
                C12226a.this.mo36755m(true);
            } catch (IOException e) {
                throw C12226a.this.mo36754l(e);
            } catch (Throwable th) {
                C12226a.this.mo36755m(false);
                throw th;
            }
        }

        public void flush() throws IOException {
            C12226a.this.mo36753k();
            try {
                this.f45370a.flush();
                C12226a.this.mo36755m(true);
            } catch (IOException e) {
                throw C12226a.this.mo36754l(e);
            } catch (Throwable th) {
                C12226a.this.mo36755m(false);
                throw th;
            }
        }

        /* renamed from: k1 */
        public void mo35694k1(C12231c cVar, long j) throws IOException {
            C12255v.m58892b(cVar.f45378b, 0, j);
            while (true) {
                long j2 = 0;
                if (j > 0) {
                    C12248p pVar = cVar.f45377a;
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += (long) (pVar.f45413c - pVar.f45412b);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        }
                        pVar = pVar.f45416f;
                    }
                    C12226a.this.mo36753k();
                    try {
                        this.f45370a.mo35694k1(cVar, j2);
                        j -= j2;
                        C12226a.this.mo36755m(true);
                    } catch (IOException e) {
                        throw C12226a.this.mo36754l(e);
                    } catch (Throwable th) {
                        C12226a.this.mo36755m(false);
                        throw th;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: o */
        public C12253u mo36029o() {
            return C12226a.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f45370a + ")";
        }
    }

    /* renamed from: qe.a$b */
    /* compiled from: AsyncTimeout */
    class C12228b implements C12252t {

        /* renamed from: a */
        final /* synthetic */ C12252t f45372a;

        C12228b(C12252t tVar) {
            this.f45372a = tVar;
        }

        public void close() throws IOException {
            C12226a.this.mo36753k();
            try {
                this.f45372a.close();
                C12226a.this.mo36755m(true);
            } catch (IOException e) {
                throw C12226a.this.mo36754l(e);
            } catch (Throwable th) {
                C12226a.this.mo36755m(false);
                throw th;
            }
        }

        /* renamed from: o */
        public C12253u mo33809o() {
            return C12226a.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f45372a + ")";
        }

        /* renamed from: z */
        public long mo33810z(C12231c cVar, long j) throws IOException {
            C12226a.this.mo36753k();
            try {
                long z = this.f45372a.mo33810z(cVar, j);
                C12226a.this.mo36755m(true);
                return z;
            } catch (IOException e) {
                throw C12226a.this.mo36754l(e);
            } catch (Throwable th) {
                C12226a.this.mo36755m(false);
                throw th;
            }
        }
    }

    /* renamed from: qe.a$c */
    /* compiled from: AsyncTimeout */
    private static final class C12229c extends Thread {
        C12229c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.mo35747t();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r3 = this;
            L_0x0000:
                java.lang.Class<qe.a> r0 = p336qe.C12226a.class
                monitor-enter(r0)     // Catch:{ InterruptedException -> 0x0000 }
                qe.a r1 = p336qe.C12226a.m58668i()     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                goto L_0x0000
            L_0x000b:
                qe.a r2 = p336qe.C12226a.f45366j     // Catch:{ all -> 0x0019 }
                if (r1 != r2) goto L_0x0014
                r1 = 0
                p336qe.C12226a.f45366j = r1     // Catch:{ all -> 0x0019 }
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0014:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                r1.mo35747t()     // Catch:{ InterruptedException -> 0x0000 }
                goto L_0x0000
            L_0x0019:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                throw r1     // Catch:{ InterruptedException -> 0x0000 }
            */
            throw new UnsupportedOperationException("Method not decompiled: p336qe.C12226a.C12229c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60);
        f45364h = millis;
        f45365i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: i */
    static C12226a m58668i() throws InterruptedException {
        Class<C12226a> cls = C12226a.class;
        C12226a aVar = f45366j.f45368f;
        if (aVar == null) {
            long nanoTime = System.nanoTime();
            cls.wait(f45364h);
            if (f45366j.f45368f != null || System.nanoTime() - nanoTime < f45365i) {
                return null;
            }
            return f45366j;
        }
        long p = aVar.m58670p(System.nanoTime());
        if (p > 0) {
            long j = p / 1000000;
            cls.wait(j, (int) (p - (1000000 * j)));
            return null;
        }
        f45366j.f45368f = aVar.f45368f;
        aVar.f45368f = null;
        return aVar;
    }

    /* renamed from: j */
    private static synchronized boolean m58669j(C12226a aVar) {
        synchronized (C12226a.class) {
            C12226a aVar2 = f45366j;
            while (aVar2 != null) {
                C12226a aVar3 = aVar2.f45368f;
                if (aVar3 == aVar) {
                    aVar2.f45368f = aVar.f45368f;
                    aVar.f45368f = null;
                    return false;
                }
                aVar2 = aVar3;
            }
            return true;
        }
    }

    /* renamed from: p */
    private long m58670p(long j) {
        return this.f45369g - j;
    }

    /* renamed from: q */
    private static synchronized void m58671q(C12226a aVar, long j, boolean z) {
        Class<C12226a> cls = C12226a.class;
        synchronized (cls) {
            if (f45366j == null) {
                f45366j = new C12226a();
                new C12229c().start();
            }
            long nanoTime = System.nanoTime();
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i != 0 && z) {
                aVar.f45369g = Math.min(j, aVar.mo36855c() - nanoTime) + nanoTime;
            } else if (i != 0) {
                aVar.f45369g = j + nanoTime;
            } else if (z) {
                aVar.f45369g = aVar.mo36855c();
            } else {
                throw new AssertionError();
            }
            long p = aVar.m58670p(nanoTime);
            C12226a aVar2 = f45366j;
            while (true) {
                C12226a aVar3 = aVar2.f45368f;
                if (aVar3 == null) {
                    break;
                } else if (p < aVar3.m58670p(nanoTime)) {
                    break;
                } else {
                    aVar2 = aVar2.f45368f;
                }
            }
            aVar.f45368f = aVar2.f45368f;
            aVar2.f45368f = aVar;
            if (aVar2 == f45366j) {
                cls.notify();
            }
        }
    }

    /* renamed from: k */
    public final void mo36753k() {
        if (!this.f45367e) {
            long h = mo36882h();
            boolean e = mo36857e();
            if (h != 0 || e) {
                this.f45367e = true;
                m58671q(this, h, e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final IOException mo36754l(IOException iOException) throws IOException {
        if (!mo36756n()) {
            return iOException;
        }
        return mo36212o(iOException);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final void mo36755m(boolean z) throws IOException {
        if (mo36756n() && z) {
            throw mo36212o((IOException) null);
        }
    }

    /* renamed from: n */
    public final boolean mo36756n() {
        if (!this.f45367e) {
            return false;
        }
        this.f45367e = false;
        return m58669j(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public IOException mo36212o(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: r */
    public final C12251s mo36757r(C12251s sVar) {
        return new C12227a(sVar);
    }

    /* renamed from: s */
    public final C12252t mo36758s(C12252t tVar) {
        return new C12228b(tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo35747t() {
    }
}
