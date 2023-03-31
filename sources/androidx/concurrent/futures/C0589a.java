package androidx.concurrent.futures;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p228f7.C10139c;

/* renamed from: androidx.concurrent.futures.a */
/* compiled from: AbstractResolvableFuture */
public abstract class C0589a<V> implements C10139c<V> {

    /* renamed from: d */
    static final boolean f1931d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    private static final Logger f1932e = Logger.getLogger(C0589a.class.getName());

    /* renamed from: f */
    static final C0591b f1933f;

    /* renamed from: g */
    private static final Object f1934g = new Object();

    /* renamed from: a */
    volatile Object f1935a;

    /* renamed from: b */
    volatile C0595e f1936b;

    /* renamed from: c */
    volatile C0599i f1937c;

    /* renamed from: androidx.concurrent.futures.a$b */
    /* compiled from: AbstractResolvableFuture */
    private static abstract class C0591b {
        private C0591b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo2717a(C0589a<?> aVar, C0595e eVar, C0595e eVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo2718b(C0589a<?> aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo2719c(C0589a<?> aVar, C0599i iVar, C0599i iVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo2720d(C0599i iVar, C0599i iVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo2721e(C0599i iVar, Thread thread);
    }

    /* renamed from: androidx.concurrent.futures.a$c */
    /* compiled from: AbstractResolvableFuture */
    private static final class C0592c {

        /* renamed from: c */
        static final C0592c f1938c;

        /* renamed from: d */
        static final C0592c f1939d;

        /* renamed from: a */
        final boolean f1940a;

        /* renamed from: b */
        final Throwable f1941b;

        static {
            if (C0589a.f1931d) {
                f1939d = null;
                f1938c = null;
                return;
            }
            f1939d = new C0592c(false, (Throwable) null);
            f1938c = new C0592c(true, (Throwable) null);
        }

        C0592c(boolean z, Throwable th) {
            this.f1940a = z;
            this.f1941b = th;
        }
    }

    /* renamed from: androidx.concurrent.futures.a$d */
    /* compiled from: AbstractResolvableFuture */
    private static final class C0593d {

        /* renamed from: b */
        static final C0593d f1942b = new C0593d(new C0594a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f1943a;

        /* renamed from: androidx.concurrent.futures.a$d$a */
        /* compiled from: AbstractResolvableFuture */
        class C0594a extends Throwable {
            C0594a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        C0593d(Throwable th) {
            this.f1943a = (Throwable) C0589a.m2767n(th);
        }
    }

    /* renamed from: androidx.concurrent.futures.a$e */
    /* compiled from: AbstractResolvableFuture */
    private static final class C0595e {

        /* renamed from: d */
        static final C0595e f1944d = new C0595e((Runnable) null, (Executor) null);

        /* renamed from: a */
        final Runnable f1945a;

        /* renamed from: b */
        final Executor f1946b;

        /* renamed from: c */
        C0595e f1947c;

        C0595e(Runnable runnable, Executor executor) {
            this.f1945a = runnable;
            this.f1946b = executor;
        }
    }

    /* renamed from: androidx.concurrent.futures.a$f */
    /* compiled from: AbstractResolvableFuture */
    private static final class C0596f extends C0591b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C0599i, Thread> f1948a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C0599i, C0599i> f1949b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<C0589a, C0599i> f1950c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<C0589a, C0595e> f1951d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<C0589a, Object> f1952e;

        C0596f(AtomicReferenceFieldUpdater<C0599i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C0599i, C0599i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C0589a, C0599i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C0589a, C0595e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C0589a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f1948a = atomicReferenceFieldUpdater;
            this.f1949b = atomicReferenceFieldUpdater2;
            this.f1950c = atomicReferenceFieldUpdater3;
            this.f1951d = atomicReferenceFieldUpdater4;
            this.f1952e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2717a(C0589a<?> aVar, C0595e eVar, C0595e eVar2) {
            return C0600b.m2800a(this.f1951d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2718b(C0589a<?> aVar, Object obj, Object obj2) {
            return C0600b.m2800a(this.f1952e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo2719c(C0589a<?> aVar, C0599i iVar, C0599i iVar2) {
            return C0600b.m2800a(this.f1950c, aVar, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2720d(C0599i iVar, C0599i iVar2) {
            this.f1949b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2721e(C0599i iVar, Thread thread) {
            this.f1948a.lazySet(iVar, thread);
        }
    }

    /* renamed from: androidx.concurrent.futures.a$g */
    /* compiled from: AbstractResolvableFuture */
    private static final class C0597g<V> implements Runnable {

        /* renamed from: a */
        final C0589a<V> f1953a;

        /* renamed from: b */
        final C10139c<? extends V> f1954b;

        public void run() {
            if (this.f1953a.f1935a == this) {
                if (C0589a.f1933f.mo2718b(this.f1953a, this, C0589a.m2772s(this.f1954b))) {
                    C0589a.m2769p(this.f1953a);
                }
            }
        }
    }

    /* renamed from: androidx.concurrent.futures.a$h */
    /* compiled from: AbstractResolvableFuture */
    private static final class C0598h extends C0591b {
        C0598h() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo2717a(C0589a<?> aVar, C0595e eVar, C0595e eVar2) {
            synchronized (aVar) {
                if (aVar.f1936b != eVar) {
                    return false;
                }
                aVar.f1936b = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo2718b(C0589a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f1935a != obj) {
                    return false;
                }
                aVar.f1935a = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo2719c(C0589a<?> aVar, C0599i iVar, C0599i iVar2) {
            synchronized (aVar) {
                if (aVar.f1937c != iVar) {
                    return false;
                }
                aVar.f1937c = iVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo2720d(C0599i iVar, C0599i iVar2) {
            iVar.f1957b = iVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo2721e(C0599i iVar, Thread thread) {
            iVar.f1956a = thread;
        }
    }

    /* renamed from: androidx.concurrent.futures.a$i */
    /* compiled from: AbstractResolvableFuture */
    private static final class C0599i {

        /* renamed from: c */
        static final C0599i f1955c = new C0599i(false);

        /* renamed from: a */
        volatile Thread f1956a;

        /* renamed from: b */
        volatile C0599i f1957b;

        C0599i(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2724a(C0599i iVar) {
            C0589a.f1933f.mo2720d(this, iVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo2725b() {
            Thread thread = this.f1956a;
            if (thread != null) {
                this.f1956a = null;
                LockSupport.unpark(thread);
            }
        }

        C0599i() {
            C0589a.f1933f.mo2721e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.concurrent.futures.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.concurrent.futures.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.concurrent.futures.a$i> r0 = androidx.concurrent.futures.C0589a.C0599i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f1931d = r1
            java.lang.Class<androidx.concurrent.futures.a> r1 = androidx.concurrent.futures.C0589a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f1932e = r1
            androidx.concurrent.futures.a$f r1 = new androidx.concurrent.futures.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.a> r2 = androidx.concurrent.futures.C0589a.class
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.a> r0 = androidx.concurrent.futures.C0589a.class
            java.lang.Class<androidx.concurrent.futures.a$e> r2 = androidx.concurrent.futures.C0589a.C0595e.class
            java.lang.String r6 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.concurrent.futures.a> r0 = androidx.concurrent.futures.C0589a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.concurrent.futures.a$h r1 = new androidx.concurrent.futures.a$h
            r1.<init>()
        L_0x0054:
            f1933f = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f1932e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f1934g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.C0589a.<clinit>():void");
    }

    protected C0589a() {
    }

    /* renamed from: A */
    private String m2764A(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* renamed from: a */
    private void m2765a(StringBuilder sb) {
        try {
            Object t = m2773t(this);
            sb.append("SUCCESS, result=[");
            sb.append(m2764A(t));
            sb.append("]");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: k */
    private static CancellationException m2766k(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: n */
    static <T> T m2767n(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: o */
    private C0595e m2768o(C0595e eVar) {
        C0595e eVar2;
        do {
            eVar2 = this.f1936b;
        } while (!f1933f.mo2717a(this, eVar2, C0595e.f1944d));
        C0595e eVar3 = eVar2;
        C0595e eVar4 = eVar;
        C0595e eVar5 = eVar3;
        while (eVar5 != null) {
            C0595e eVar6 = eVar5.f1947c;
            eVar5.f1947c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    /* renamed from: p */
    static void m2769p(C0589a<?> aVar) {
        C0595e eVar = null;
        C0589a<V> aVar2 = aVar;
        while (true) {
            aVar2.m2774w();
            aVar2.mo2705b();
            C0595e o = aVar2.m2768o(eVar);
            while (true) {
                if (o != null) {
                    eVar = o.f1947c;
                    Runnable runnable = o.f1945a;
                    if (runnable instanceof C0597g) {
                        C0597g gVar = (C0597g) runnable;
                        C0589a<V> aVar3 = gVar.f1953a;
                        if (aVar3.f1935a == gVar) {
                            if (f1933f.mo2718b(aVar3, gVar, m2772s(gVar.f1954b))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m2770q(runnable, o.f1946b);
                    }
                    o = eVar;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: q */
    private static void m2770q(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f1932e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: r */
    private V m2771r(Object obj) throws ExecutionException {
        if (obj instanceof C0592c) {
            throw m2766k("Task was cancelled.", ((C0592c) obj).f1941b);
        } else if (obj instanceof C0593d) {
            throw new ExecutionException(((C0593d) obj).f1943a);
        } else if (obj == f1934g) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: s */
    static Object m2772s(C10139c<?> cVar) {
        if (cVar instanceof C0589a) {
            Object obj = ((C0589a) cVar).f1935a;
            if (!(obj instanceof C0592c)) {
                return obj;
            }
            C0592c cVar2 = (C0592c) obj;
            if (!cVar2.f1940a) {
                return obj;
            }
            if (cVar2.f1941b != null) {
                return new C0592c(false, cVar2.f1941b);
            }
            return C0592c.f1939d;
        }
        boolean isCancelled = cVar.isCancelled();
        if ((!f1931d) && isCancelled) {
            return C0592c.f1939d;
        }
        try {
            Object t = m2773t(cVar);
            return t == null ? f1934g : t;
        } catch (ExecutionException e) {
            return new C0593d(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C0592c(false, e2);
            }
            return new C0593d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + cVar, e2));
        } catch (Throwable th) {
            return new C0593d(th);
        }
    }

    /* renamed from: t */
    static <V> V m2773t(Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    /* renamed from: w */
    private void m2774w() {
        C0599i iVar;
        do {
            iVar = this.f1937c;
        } while (!f1933f.mo2719c(this, iVar, C0599i.f1955c));
        while (iVar != null) {
            iVar.mo2725b();
            iVar = iVar.f1957b;
        }
    }

    /* renamed from: x */
    private void m2775x(C0599i iVar) {
        iVar.f1956a = null;
        while (true) {
            C0599i iVar2 = this.f1937c;
            if (iVar2 != C0599i.f1955c) {
                C0599i iVar3 = null;
                while (iVar2 != null) {
                    C0599i iVar4 = iVar2.f1957b;
                    if (iVar2.f1956a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f1957b = iVar4;
                        if (iVar3.f1956a == null) {
                        }
                    } else if (!f1933f.mo2719c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final boolean mo2704B() {
        Object obj = this.f1935a;
        return (obj instanceof C0592c) && ((C0592c) obj).f1940a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2705b() {
    }

    /* renamed from: c */
    public final void mo2706c(Runnable runnable, Executor executor) {
        m2767n(runnable);
        m2767n(executor);
        C0595e eVar = this.f1936b;
        if (eVar != C0595e.f1944d) {
            C0595e eVar2 = new C0595e(runnable, executor);
            do {
                eVar2.f1947c = eVar;
                if (!f1933f.mo2717a(this, eVar, eVar2)) {
                    eVar = this.f1936b;
                } else {
                    return;
                }
            } while (eVar != C0595e.f1944d);
        }
        m2770q(runnable, executor);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [f7.c<? extends V>, java.util.concurrent.Future] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f1935a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof androidx.concurrent.futures.C0589a.C0597g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f1931d
            if (r3 == 0) goto L_0x001f
            androidx.concurrent.futures.a$c r3 = new androidx.concurrent.futures.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.concurrent.futures.a$c r3 = androidx.concurrent.futures.C0589a.C0592c.f1938c
            goto L_0x0026
        L_0x0024:
            androidx.concurrent.futures.a$c r3 = androidx.concurrent.futures.C0589a.C0592c.f1939d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            androidx.concurrent.futures.a$b r6 = f1933f
            boolean r6 = r6.mo2718b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.mo2713u()
        L_0x0035:
            m2769p(r4)
            boolean r4 = r0 instanceof androidx.concurrent.futures.C0589a.C0597g
            if (r4 == 0) goto L_0x0062
            androidx.concurrent.futures.a$g r0 = (androidx.concurrent.futures.C0589a.C0597g) r0
            f7.c<? extends V> r0 = r0.f1954b
            boolean r4 = r0 instanceof androidx.concurrent.futures.C0589a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.concurrent.futures.a r4 = (androidx.concurrent.futures.C0589a) r4
            java.lang.Object r0 = r4.f1935a
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof androidx.concurrent.futures.C0589a.C0597g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f1935a
            boolean r6 = r0 instanceof androidx.concurrent.futures.C0589a.C0597g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.C0589a.cancel(boolean):boolean");
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f1935a;
            if ((obj != null) && (!(obj instanceof C0597g))) {
                return m2771r(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C0599i iVar = this.f1937c;
                if (iVar != C0599i.f1955c) {
                    C0599i iVar2 = new C0599i();
                    do {
                        iVar2.mo2724a(iVar);
                        if (f1933f.mo2719c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f1935a;
                                    if ((obj2 != null) && (!(obj2 instanceof C0597g))) {
                                        return m2771r(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m2775x(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m2775x(iVar2);
                        } else {
                            iVar = this.f1937c;
                        }
                    } while (iVar != C0599i.f1955c);
                }
                return m2771r(this.f1935a);
            }
            while (nanos > 0) {
                Object obj3 = this.f1935a;
                if ((obj3 != null) && (!(obj3 instanceof C0597g))) {
                    return m2771r(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar = toString();
            String timeUnit3 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = timeUnit3.toLowerCase(locale);
            String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String str2 = str + " (plus ";
                long j3 = -nanos;
                long convert = timeUnit2.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                boolean z = i == 0 || nanos2 > 1000;
                if (i > 0) {
                    String str3 = str2 + convert + " " + lowerCase;
                    if (z) {
                        str3 = str3 + ",";
                    }
                    str2 = str3 + " ";
                }
                if (z) {
                    str2 = str2 + nanos2 + " nanoseconds ";
                }
                str = str2 + "delay)";
            }
            if (isDone()) {
                throw new TimeoutException(str + " but future completed as timeout expired");
            }
            throw new TimeoutException(str + " for " + aVar);
        }
        throw new InterruptedException();
    }

    public final boolean isCancelled() {
        return this.f1935a instanceof C0592c;
    }

    public final boolean isDone() {
        Object obj = this.f1935a;
        return (!(obj instanceof C0597g)) & (obj != null);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m2765a(sb);
        } else {
            try {
                str = mo2714v();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m2765a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo2713u() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public String mo2714v() {
        Object obj = this.f1935a;
        if (obj instanceof C0597g) {
            return "setFuture=[" + m2764A(((C0597g) obj).f1954b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public boolean mo2715y(V v) {
        if (v == null) {
            v = f1934g;
        }
        if (!f1933f.mo2718b(this, (Object) null, v)) {
            return false;
        }
        m2769p(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public boolean mo2716z(Throwable th) {
        if (!f1933f.mo2718b(this, (Object) null, new C0593d((Throwable) m2767n(th)))) {
            return false;
        }
        m2769p(this);
        return true;
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f1935a;
            if ((obj2 != null) && (!(obj2 instanceof C0597g))) {
                return m2771r(obj2);
            }
            C0599i iVar = this.f1937c;
            if (iVar != C0599i.f1955c) {
                C0599i iVar2 = new C0599i();
                do {
                    iVar2.mo2724a(iVar);
                    if (f1933f.mo2719c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f1935a;
                            } else {
                                m2775x(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C0597g))));
                        return m2771r(obj);
                    }
                    iVar = this.f1937c;
                } while (iVar != C0599i.f1955c);
            }
            return m2771r(this.f1935a);
        }
        throw new InterruptedException();
    }
}
