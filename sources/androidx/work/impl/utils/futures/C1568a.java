package androidx.work.impl.utils.futures;

import androidx.concurrent.futures.C0600b;
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

/* renamed from: androidx.work.impl.utils.futures.a */
/* compiled from: AbstractFuture */
public abstract class C1568a<V> implements C10139c<V> {

    /* renamed from: d */
    static final boolean f4532d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    private static final Logger f4533e = Logger.getLogger(C1568a.class.getName());

    /* renamed from: f */
    static final C1570b f4534f;

    /* renamed from: g */
    private static final Object f4535g = new Object();

    /* renamed from: a */
    volatile Object f4536a;

    /* renamed from: b */
    volatile C1574e f4537b;

    /* renamed from: c */
    volatile C1578i f4538c;

    /* renamed from: androidx.work.impl.utils.futures.a$b */
    /* compiled from: AbstractFuture */
    private static abstract class C1570b {
        private C1570b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract boolean mo6384a(C1568a<?> aVar, C1574e eVar, C1574e eVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract boolean mo6385b(C1568a<?> aVar, Object obj, Object obj2);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract boolean mo6386c(C1568a<?> aVar, C1578i iVar, C1578i iVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo6387d(C1578i iVar, C1578i iVar2);

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract void mo6388e(C1578i iVar, Thread thread);
    }

    /* renamed from: androidx.work.impl.utils.futures.a$c */
    /* compiled from: AbstractFuture */
    private static final class C1571c {

        /* renamed from: c */
        static final C1571c f4539c;

        /* renamed from: d */
        static final C1571c f4540d;

        /* renamed from: a */
        final boolean f4541a;

        /* renamed from: b */
        final Throwable f4542b;

        static {
            if (C1568a.f4532d) {
                f4540d = null;
                f4539c = null;
                return;
            }
            f4540d = new C1571c(false, (Throwable) null);
            f4539c = new C1571c(true, (Throwable) null);
        }

        C1571c(boolean z, Throwable th) {
            this.f4541a = z;
            this.f4542b = th;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$d */
    /* compiled from: AbstractFuture */
    private static final class C1572d {

        /* renamed from: b */
        static final C1572d f4543b = new C1572d(new C1573a("Failure occurred while trying to finish a future."));

        /* renamed from: a */
        final Throwable f4544a;

        /* renamed from: androidx.work.impl.utils.futures.a$d$a */
        /* compiled from: AbstractFuture */
        class C1573a extends Throwable {
            C1573a(String str) {
                super(str);
            }

            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        C1572d(Throwable th) {
            this.f4544a = (Throwable) C1568a.m7275e(th);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$e */
    /* compiled from: AbstractFuture */
    private static final class C1574e {

        /* renamed from: d */
        static final C1574e f4545d = new C1574e((Runnable) null, (Executor) null);

        /* renamed from: a */
        final Runnable f4546a;

        /* renamed from: b */
        final Executor f4547b;

        /* renamed from: c */
        C1574e f4548c;

        C1574e(Runnable runnable, Executor executor) {
            this.f4546a = runnable;
            this.f4547b = executor;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$f */
    /* compiled from: AbstractFuture */
    private static final class C1575f extends C1570b {

        /* renamed from: a */
        final AtomicReferenceFieldUpdater<C1578i, Thread> f4549a;

        /* renamed from: b */
        final AtomicReferenceFieldUpdater<C1578i, C1578i> f4550b;

        /* renamed from: c */
        final AtomicReferenceFieldUpdater<C1568a, C1578i> f4551c;

        /* renamed from: d */
        final AtomicReferenceFieldUpdater<C1568a, C1574e> f4552d;

        /* renamed from: e */
        final AtomicReferenceFieldUpdater<C1568a, Object> f4553e;

        C1575f(AtomicReferenceFieldUpdater<C1578i, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<C1578i, C1578i> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<C1568a, C1578i> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<C1568a, C1574e> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<C1568a, Object> atomicReferenceFieldUpdater5) {
            super();
            this.f4549a = atomicReferenceFieldUpdater;
            this.f4550b = atomicReferenceFieldUpdater2;
            this.f4551c = atomicReferenceFieldUpdater3;
            this.f4552d = atomicReferenceFieldUpdater4;
            this.f4553e = atomicReferenceFieldUpdater5;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6384a(C1568a<?> aVar, C1574e eVar, C1574e eVar2) {
            return C0600b.m2800a(this.f4552d, aVar, eVar, eVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6385b(C1568a<?> aVar, Object obj, Object obj2) {
            return C0600b.m2800a(this.f4553e, aVar, obj, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6386c(C1568a<?> aVar, C1578i iVar, C1578i iVar2) {
            return C0600b.m2800a(this.f4551c, aVar, iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6387d(C1578i iVar, C1578i iVar2) {
            this.f4550b.lazySet(iVar, iVar2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6388e(C1578i iVar, Thread thread) {
            this.f4549a.lazySet(iVar, thread);
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$g */
    /* compiled from: AbstractFuture */
    private static final class C1576g<V> implements Runnable {

        /* renamed from: a */
        final C1568a<V> f4554a;

        /* renamed from: b */
        final C10139c<? extends V> f4555b;

        C1576g(C1568a<V> aVar, C10139c<? extends V> cVar) {
            this.f4554a = aVar;
            this.f4555b = cVar;
        }

        public void run() {
            if (this.f4554a.f4536a == this) {
                if (C1568a.f4534f.mo6385b(this.f4554a, this, C1568a.m7280k(this.f4555b))) {
                    C1568a.m7277g(this.f4554a);
                }
            }
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$h */
    /* compiled from: AbstractFuture */
    private static final class C1577h extends C1570b {
        C1577h() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo6384a(C1568a<?> aVar, C1574e eVar, C1574e eVar2) {
            synchronized (aVar) {
                if (aVar.f4537b != eVar) {
                    return false;
                }
                aVar.f4537b = eVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean mo6385b(C1568a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f4536a != obj) {
                    return false;
                }
                aVar.f4536a = obj2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo6386c(C1568a<?> aVar, C1578i iVar, C1578i iVar2) {
            synchronized (aVar) {
                if (aVar.f4538c != iVar) {
                    return false;
                }
                aVar.f4538c = iVar2;
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6387d(C1578i iVar, C1578i iVar2) {
            iVar.f4558b = iVar2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo6388e(C1578i iVar, Thread thread) {
            iVar.f4557a = thread;
        }
    }

    /* renamed from: androidx.work.impl.utils.futures.a$i */
    /* compiled from: AbstractFuture */
    private static final class C1578i {

        /* renamed from: c */
        static final C1578i f4556c = new C1578i(false);

        /* renamed from: a */
        volatile Thread f4557a;

        /* renamed from: b */
        volatile C1578i f4558b;

        C1578i(boolean z) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6391a(C1578i iVar) {
            C1568a.f4534f.mo6387d(this, iVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6392b() {
            Thread thread = this.f4557a;
            if (thread != null) {
                this.f4557a = null;
                LockSupport.unpark(thread);
            }
        }

        C1578i() {
            C1568a.f4534f.mo6388e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: androidx.work.impl.utils.futures.a$h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: androidx.work.impl.utils.futures.a$f} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.work.impl.utils.futures.a$i> r0 = androidx.work.impl.utils.futures.C1568a.C1578i.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f4532d = r1
            java.lang.Class<androidx.work.impl.utils.futures.a> r1 = androidx.work.impl.utils.futures.C1568a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f4533e = r1
            androidx.work.impl.utils.futures.a$f r1 = new androidx.work.impl.utils.futures.a$f     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r2 = androidx.work.impl.utils.futures.C1568a.class
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r0 = androidx.work.impl.utils.futures.C1568a.class
            java.lang.Class<androidx.work.impl.utils.futures.a$e> r2 = androidx.work.impl.utils.futures.C1568a.C1574e.class
            java.lang.String r6 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<androidx.work.impl.utils.futures.a> r0 = androidx.work.impl.utils.futures.C1568a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            androidx.work.impl.utils.futures.a$h r1 = new androidx.work.impl.utils.futures.a$h
            r1.<init>()
        L_0x0054:
            f4534f = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f4533e
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f4535g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.C1568a.<clinit>():void");
    }

    protected C1568a() {
    }

    /* renamed from: a */
    private void m7273a(StringBuilder sb) {
        try {
            Object l = m7281l(this);
            sb.append("SUCCESS, result=[");
            sb.append(m7284t(l));
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

    /* renamed from: d */
    private static CancellationException m7274d(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    /* renamed from: e */
    static <T> T m7275e(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: f */
    private C1574e m7276f(C1574e eVar) {
        C1574e eVar2;
        do {
            eVar2 = this.f4537b;
        } while (!f4534f.mo6384a(this, eVar2, C1574e.f4545d));
        C1574e eVar3 = eVar2;
        C1574e eVar4 = eVar;
        C1574e eVar5 = eVar3;
        while (eVar5 != null) {
            C1574e eVar6 = eVar5.f4548c;
            eVar5.f4548c = eVar4;
            eVar4 = eVar5;
            eVar5 = eVar6;
        }
        return eVar4;
    }

    /* renamed from: g */
    static void m7277g(C1568a<?> aVar) {
        C1574e eVar = null;
        C1568a<V> aVar2 = aVar;
        while (true) {
            aVar2.m7282o();
            aVar2.mo6372b();
            C1574e f = aVar2.m7276f(eVar);
            while (true) {
                if (f != null) {
                    eVar = f.f4548c;
                    Runnable runnable = f.f4546a;
                    if (runnable instanceof C1576g) {
                        C1576g gVar = (C1576g) runnable;
                        C1568a<V> aVar3 = gVar.f4554a;
                        if (aVar3.f4536a == gVar) {
                            if (f4534f.mo6385b(aVar3, gVar, m7280k(gVar.f4555b))) {
                                aVar2 = aVar3;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m7278h(runnable, f.f4547b);
                    }
                    f = eVar;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: h */
    private static void m7278h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f4533e;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e);
        }
    }

    /* renamed from: i */
    private V m7279i(Object obj) throws ExecutionException {
        if (obj instanceof C1571c) {
            throw m7274d("Task was cancelled.", ((C1571c) obj).f4542b);
        } else if (obj instanceof C1572d) {
            throw new ExecutionException(((C1572d) obj).f4544a);
        } else if (obj == f4535g) {
            return null;
        } else {
            return obj;
        }
    }

    /* renamed from: k */
    static Object m7280k(C10139c<?> cVar) {
        if (cVar instanceof C1568a) {
            Object obj = ((C1568a) cVar).f4536a;
            if (!(obj instanceof C1571c)) {
                return obj;
            }
            C1571c cVar2 = (C1571c) obj;
            if (!cVar2.f4541a) {
                return obj;
            }
            if (cVar2.f4542b != null) {
                return new C1571c(false, cVar2.f4542b);
            }
            return C1571c.f4540d;
        }
        boolean isCancelled = cVar.isCancelled();
        if ((!f4532d) && isCancelled) {
            return C1571c.f4540d;
        }
        try {
            Object l = m7281l(cVar);
            return l == null ? f4535g : l;
        } catch (ExecutionException e) {
            return new C1572d(e.getCause());
        } catch (CancellationException e2) {
            if (isCancelled) {
                return new C1571c(false, e2);
            }
            return new C1572d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + cVar, e2));
        } catch (Throwable th) {
            return new C1572d(th);
        }
    }

    /* renamed from: l */
    private static <V> V m7281l(Future<V> future) throws ExecutionException {
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

    /* renamed from: o */
    private void m7282o() {
        C1578i iVar;
        do {
            iVar = this.f4538c;
        } while (!f4534f.mo6386c(this, iVar, C1578i.f4556c));
        while (iVar != null) {
            iVar.mo6392b();
            iVar = iVar.f4558b;
        }
    }

    /* renamed from: p */
    private void m7283p(C1578i iVar) {
        iVar.f4557a = null;
        while (true) {
            C1578i iVar2 = this.f4538c;
            if (iVar2 != C1578i.f4556c) {
                C1578i iVar3 = null;
                while (iVar2 != null) {
                    C1578i iVar4 = iVar2.f4558b;
                    if (iVar2.f4557a != null) {
                        iVar3 = iVar2;
                    } else if (iVar3 != null) {
                        iVar3.f4558b = iVar4;
                        if (iVar3.f4557a == null) {
                        }
                    } else if (!f4534f.mo6386c(this, iVar2, iVar4)) {
                    }
                    iVar2 = iVar4;
                }
                return;
            }
            return;
        }
    }

    /* renamed from: t */
    private String m7284t(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6372b() {
    }

    /* renamed from: c */
    public final void mo2706c(Runnable runnable, Executor executor) {
        m7275e(runnable);
        m7275e(executor);
        C1574e eVar = this.f4537b;
        if (eVar != C1574e.f4545d) {
            C1574e eVar2 = new C1574e(runnable, executor);
            do {
                eVar2.f4548c = eVar;
                if (!f4534f.mo6384a(this, eVar, eVar2)) {
                    eVar = this.f4537b;
                } else {
                    return;
                }
            } while (eVar != C1574e.f4545d);
        }
        m7278h(runnable, executor);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [f7.c<? extends V>, java.util.concurrent.Future] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f4536a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = 1
            goto L_0x0009
        L_0x0008:
            r3 = 0
        L_0x0009:
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.C1568a.C1576g
            r3 = r3 | r4
            if (r3 == 0) goto L_0x0061
            boolean r3 = f4532d
            if (r3 == 0) goto L_0x001f
            androidx.work.impl.utils.futures.a$c r3 = new androidx.work.impl.utils.futures.a$c
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.C1568a.C1571c.f4539c
            goto L_0x0026
        L_0x0024:
            androidx.work.impl.utils.futures.a$c r3 = androidx.work.impl.utils.futures.C1568a.C1571c.f4540d
        L_0x0026:
            r5 = 0
            r4 = r7
        L_0x0028:
            androidx.work.impl.utils.futures.a$b r6 = f4534f
            boolean r6 = r6.mo6385b(r4, r0, r3)
            if (r6 == 0) goto L_0x0059
            if (r8 == 0) goto L_0x0035
            r4.mo6378m()
        L_0x0035:
            m7277g(r4)
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.C1568a.C1576g
            if (r4 == 0) goto L_0x0062
            androidx.work.impl.utils.futures.a$g r0 = (androidx.work.impl.utils.futures.C1568a.C1576g) r0
            f7.c<? extends V> r0 = r0.f4555b
            boolean r4 = r0 instanceof androidx.work.impl.utils.futures.C1568a
            if (r4 == 0) goto L_0x0055
            r4 = r0
            androidx.work.impl.utils.futures.a r4 = (androidx.work.impl.utils.futures.C1568a) r4
            java.lang.Object r0 = r4.f4536a
            if (r0 != 0) goto L_0x004d
            r5 = 1
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.C1568a.C1576g
            r5 = r5 | r6
            if (r5 == 0) goto L_0x0062
            r5 = 1
            goto L_0x0028
        L_0x0055:
            r0.cancel(r8)
            goto L_0x0062
        L_0x0059:
            java.lang.Object r0 = r4.f4536a
            boolean r6 = r0 instanceof androidx.work.impl.utils.futures.C1568a.C1576g
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x0062
        L_0x0061:
            r1 = 0
        L_0x0062:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.futures.C1568a.cancel(boolean):boolean");
    }

    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j2 = j;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j2);
        if (!Thread.interrupted()) {
            Object obj = this.f4536a;
            if ((obj != null) && (!(obj instanceof C1576g))) {
                return m7279i(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                C1578i iVar = this.f4538c;
                if (iVar != C1578i.f4556c) {
                    C1578i iVar2 = new C1578i();
                    do {
                        iVar2.mo6391a(iVar);
                        if (f4534f.mo6386c(this, iVar, iVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f4536a;
                                    if ((obj2 != null) && (!(obj2 instanceof C1576g))) {
                                        return m7279i(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    m7283p(iVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            m7283p(iVar2);
                        } else {
                            iVar = this.f4538c;
                        }
                    } while (iVar != C1578i.f4556c);
                }
                return m7279i(this.f4536a);
            }
            while (nanos > 0) {
                Object obj3 = this.f4536a;
                if ((obj3 != null) && (!(obj3 instanceof C1576g))) {
                    return m7279i(obj3);
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
        return this.f4536a instanceof C1571c;
    }

    public final boolean isDone() {
        Object obj = this.f4536a;
        return (!(obj instanceof C1576g)) & (obj != null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo6378m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public String mo6379n() {
        Object obj = this.f4536a;
        if (obj instanceof C1576g) {
            return "setFuture=[" + m7284t(((C1576g) obj).f4555b) + "]";
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo6380q(V v) {
        if (v == null) {
            v = f4535g;
        }
        if (!f4534f.mo6385b(this, (Object) null, v)) {
            return false;
        }
        m7277g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo6381r(Throwable th) {
        if (!f4534f.mo6385b(this, (Object) null, new C1572d((Throwable) m7275e(th)))) {
            return false;
        }
        m7277g(this);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo6382s(C10139c<? extends V> cVar) {
        C1576g gVar;
        C1572d dVar;
        m7275e(cVar);
        Object obj = this.f4536a;
        if (obj == null) {
            if (cVar.isDone()) {
                if (!f4534f.mo6385b(this, (Object) null, m7280k(cVar))) {
                    return false;
                }
                m7277g(this);
                return true;
            }
            gVar = new C1576g(this, cVar);
            if (f4534f.mo6385b(this, (Object) null, gVar)) {
                try {
                    cVar.mo2706c(gVar, C1579b.INSTANCE);
                } catch (Throwable unused) {
                    dVar = C1572d.f4543b;
                }
                return true;
            }
            obj = this.f4536a;
        }
        if (obj instanceof C1571c) {
            cVar.cancel(((C1571c) obj).f4541a);
        }
        return false;
        f4534f.mo6385b(this, gVar, dVar);
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m7273a(sb);
        } else {
            try {
                str = mo6379n();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m7273a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4536a;
            if ((obj2 != null) && (!(obj2 instanceof C1576g))) {
                return m7279i(obj2);
            }
            C1578i iVar = this.f4538c;
            if (iVar != C1578i.f4556c) {
                C1578i iVar2 = new C1578i();
                do {
                    iVar2.mo6391a(iVar);
                    if (f4534f.mo6386c(this, iVar, iVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4536a;
                            } else {
                                m7283p(iVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof C1576g))));
                        return m7279i(obj);
                    }
                    iVar = this.f4538c;
                } while (iVar != C1578i.f4556c);
            }
            return m7279i(this.f4536a);
        }
        throw new InterruptedException();
    }
}
