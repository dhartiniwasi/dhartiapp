package p264io.grpc.internal;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import p264io.grpc.internal.C11272k1;
import p264io.grpc.internal.C11333r;
import p343rc.C12292c;
import p343rc.C12334j0;
import p343rc.C12335j1;
import p343rc.C12340k;
import p343rc.C12359n1;
import p343rc.C12372r;
import p343rc.C12376r0;
import p343rc.C12411y0;
import p343rc.C12423z0;

/* renamed from: io.grpc.internal.a0 */
/* compiled from: DelayedClientTransport */
final class C11105a0 implements C11272k1 {

    /* renamed from: a */
    private final C12334j0 f42884a = C12334j0.m59092a(C11105a0.class, (String) null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f42885b = new Object();

    /* renamed from: c */
    private final Executor f42886c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C12359n1 f42887d;

    /* renamed from: e */
    private Runnable f42888e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Runnable f42889f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Runnable f42890g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C11272k1.C11273a f42891h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Collection<C11110e> f42892i = new LinkedHashSet();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C12335j1 f42893j;

    /* renamed from: k */
    private C12376r0.C12387i f42894k;

    /* renamed from: l */
    private long f42895l;

    /* renamed from: io.grpc.internal.a0$a */
    /* compiled from: DelayedClientTransport */
    class C11106a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11272k1.C11273a f42896a;

        C11106a(C11272k1.C11273a aVar) {
            this.f42896a = aVar;
        }

        public void run() {
            this.f42896a.mo35113c(true);
        }
    }

    /* renamed from: io.grpc.internal.a0$b */
    /* compiled from: DelayedClientTransport */
    class C11107b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11272k1.C11273a f42898a;

        C11107b(C11272k1.C11273a aVar) {
            this.f42898a = aVar;
        }

        public void run() {
            this.f42898a.mo35113c(false);
        }
    }

    /* renamed from: io.grpc.internal.a0$c */
    /* compiled from: DelayedClientTransport */
    class C11108c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11272k1.C11273a f42900a;

        C11108c(C11272k1.C11273a aVar) {
            this.f42900a = aVar;
        }

        public void run() {
            this.f42900a.mo35112b();
        }
    }

    /* renamed from: io.grpc.internal.a0$d */
    /* compiled from: DelayedClientTransport */
    class C11109d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12335j1 f42902a;

        C11109d(C12335j1 j1Var) {
            this.f42902a = j1Var;
        }

        public void run() {
            C11105a0.this.f42891h.mo35114d(this.f42902a);
        }
    }

    /* renamed from: io.grpc.internal.a0$e */
    /* compiled from: DelayedClientTransport */
    private class C11110e extends C11115b0 {
        /* access modifiers changed from: private */

        /* renamed from: j */
        public final C12376r0.C12383f f42904j;

        /* renamed from: k */
        private final C12372r f42905k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public final C12340k[] f42906l;

        /* synthetic */ C11110e(C11105a0 a0Var, C12376r0.C12383f fVar, C12340k[] kVarArr, C11106a aVar) {
            this(fVar, kVarArr);
        }

        /* JADX INFO: finally extract failed */
        /* access modifiers changed from: private */
        /* renamed from: A */
        public Runnable m55065A(C11351s sVar) {
            C12372r b = this.f42905k.mo37086b();
            try {
                C11329q b2 = sVar.mo34932b(this.f42904j.mo35346c(), this.f42904j.mo35345b(), this.f42904j.mo35344a(), this.f42906l);
                this.f42905k.mo37088f(b);
                return mo34957w(b2);
            } catch (Throwable th) {
                this.f42905k.mo37088f(b);
                throw th;
            }
        }

        /* renamed from: c */
        public void mo34896c(C12335j1 j1Var) {
            super.mo34896c(j1Var);
            synchronized (C11105a0.this.f42885b) {
                if (C11105a0.this.f42890g != null) {
                    boolean remove = C11105a0.this.f42892i.remove(this);
                    if (!C11105a0.this.mo34938q() && remove) {
                        C11105a0.this.f42887d.mo37064c(C11105a0.this.f42889f);
                        if (C11105a0.this.f42893j != null) {
                            C11105a0.this.f42887d.mo37064c(C11105a0.this.f42890g);
                            Runnable unused = C11105a0.this.f42890g = null;
                        }
                    }
                }
            }
            C11105a0.this.f42887d.mo37063b();
        }

        /* renamed from: h */
        public void mo34899h(C11389x0 x0Var) {
            if (this.f42904j.mo35344a().mo36965j()) {
                x0Var.mo35388a("wait_for_ready");
            }
            super.mo34899h(x0Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public void mo34944u(C12335j1 j1Var) {
            for (C12340k i : this.f42906l) {
                i.mo37062i(j1Var);
            }
        }

        private C11110e(C12376r0.C12383f fVar, C12340k[] kVarArr) {
            this.f42905k = C12372r.m59190e();
            this.f42904j = fVar;
            this.f42906l = kVarArr;
        }
    }

    C11105a0(Executor executor, C12359n1 n1Var) {
        this.f42886c = executor;
        this.f42887d = n1Var;
    }

    /* renamed from: o */
    private C11110e m55056o(C12376r0.C12383f fVar, C12340k[] kVarArr) {
        C11110e eVar = new C11110e(this, fVar, kVarArr, (C11106a) null);
        this.f42892i.add(eVar);
        if (mo34937p() == 1) {
            this.f42887d.mo37064c(this.f42888e);
        }
        return eVar;
    }

    /* renamed from: b */
    public final C11329q mo34932b(C12423z0<?, ?> z0Var, C12411y0 y0Var, C12292c cVar, C12340k[] kVarArr) {
        C11329q f0Var;
        try {
            C11361t1 t1Var = new C11361t1(z0Var, y0Var, cVar);
            C12376r0.C12387i iVar = null;
            long j = -1;
            while (true) {
                synchronized (this.f42885b) {
                    if (this.f42893j == null) {
                        C12376r0.C12387i iVar2 = this.f42894k;
                        if (iVar2 != null) {
                            if (iVar != null && j == this.f42895l) {
                                f0Var = m55056o(t1Var, kVarArr);
                                break;
                            }
                            j = this.f42895l;
                            C11351s j2 = C11335r0.m55803j(iVar2.mo35093a(t1Var), cVar.mo36965j());
                            if (j2 != null) {
                                f0Var = j2.mo34932b(t1Var.mo35346c(), t1Var.mo35345b(), t1Var.mo35344a(), kVarArr);
                                break;
                            }
                            iVar = iVar2;
                        } else {
                            f0Var = m55056o(t1Var, kVarArr);
                            break;
                        }
                    } else {
                        f0Var = new C11181f0(this.f42893j, kVarArr);
                        break;
                    }
                }
            }
            this.f42887d.mo37063b();
            return f0Var;
        } catch (Throwable th) {
            this.f42887d.mo37063b();
            throw th;
        }
    }

    /* renamed from: c */
    public final Runnable mo34933c(C11272k1.C11273a aVar) {
        this.f42891h = aVar;
        this.f42888e = new C11106a(aVar);
        this.f42889f = new C11107b(aVar);
        this.f42890g = new C11108c(aVar);
        return null;
    }

    /* renamed from: d */
    public final void mo34934d(C12335j1 j1Var) {
        Collection<C11110e> collection;
        Runnable runnable;
        mo34936g(j1Var);
        synchronized (this.f42885b) {
            collection = this.f42892i;
            runnable = this.f42890g;
            this.f42890g = null;
            if (!collection.isEmpty()) {
                this.f42892i = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (C11110e next : collection) {
                Runnable w = next.mo34957w(new C11181f0(j1Var, C11333r.C11334a.REFUSED, next.f42906l));
                if (w != null) {
                    w.run();
                }
            }
            this.f42887d.execute(runnable);
        }
    }

    /* renamed from: f */
    public C12334j0 mo34935f() {
        return this.f42884a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r3.f42887d.mo37063b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34936g(p343rc.C12335j1 r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f42885b
            monitor-enter(r0)
            rc.j1 r1 = r3.f42893j     // Catch:{ all -> 0x002e }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x0009:
            r3.f42893j = r4     // Catch:{ all -> 0x002e }
            rc.n1 r1 = r3.f42887d     // Catch:{ all -> 0x002e }
            io.grpc.internal.a0$d r2 = new io.grpc.internal.a0$d     // Catch:{ all -> 0x002e }
            r2.<init>(r4)     // Catch:{ all -> 0x002e }
            r1.mo37064c(r2)     // Catch:{ all -> 0x002e }
            boolean r4 = r3.mo34938q()     // Catch:{ all -> 0x002e }
            if (r4 != 0) goto L_0x0027
            java.lang.Runnable r4 = r3.f42890g     // Catch:{ all -> 0x002e }
            if (r4 == 0) goto L_0x0027
            rc.n1 r1 = r3.f42887d     // Catch:{ all -> 0x002e }
            r1.mo37064c(r4)     // Catch:{ all -> 0x002e }
            r4 = 0
            r3.f42890g = r4     // Catch:{ all -> 0x002e }
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            rc.n1 r4 = r3.f42887d
            r4.mo37063b()
            return
        L_0x002e:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11105a0.mo34936g(rc.j1):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final int mo34937p() {
        int size;
        synchronized (this.f42885b) {
            size = this.f42892i.size();
        }
        return size;
    }

    /* renamed from: q */
    public final boolean mo34938q() {
        boolean z;
        synchronized (this.f42885b) {
            z = !this.f42892i.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r0 = new java.util.ArrayList();
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r1.hasNext() == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r2 = (p264io.grpc.internal.C11105a0.C11110e) r1.next();
        r3 = r8.mo35093a(p264io.grpc.internal.C11105a0.C11110e.m55067y(r2));
        r4 = p264io.grpc.internal.C11105a0.C11110e.m55067y(r2).mo35344a();
        r3 = p264io.grpc.internal.C11335r0.m55803j(r3, r4.mo36965j());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r3 == null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        r5 = r7.f42886c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r4.mo36960e() == null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        r5 = r4.mo36960e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        r3 = p264io.grpc.internal.C11105a0.C11110e.m55068z(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (r3 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        r5.execute(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        r0.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        r8 = r7.f42885b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (mo34938q() != false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006f, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0070, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        r7.f42892i.removeAll(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007c, code lost:
        if (r7.f42892i.isEmpty() == false) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        r7.f42892i = new java.util.LinkedHashSet();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (mo34938q() != false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008b, code lost:
        r7.f42887d.mo37064c(r7.f42889f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0094, code lost:
        if (r7.f42893j == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        r0 = r7.f42890g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0098, code lost:
        if (r0 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009a, code lost:
        r7.f42887d.mo37064c(r0);
        r7.f42890g = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a3, code lost:
        r7.f42887d.mo37063b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a8, code lost:
        return;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34939r(p343rc.C12376r0.C12387i r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f42885b
            monitor-enter(r0)
            r7.f42894k = r8     // Catch:{ all -> 0x00ae }
            long r1 = r7.f42895l     // Catch:{ all -> 0x00ae }
            r3 = 1
            long r1 = r1 + r3
            r7.f42895l = r1     // Catch:{ all -> 0x00ae }
            if (r8 == 0) goto L_0x00ac
            boolean r1 = r7.mo34938q()     // Catch:{ all -> 0x00ae }
            if (r1 != 0) goto L_0x0016
            goto L_0x00ac
        L_0x0016:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00ae }
            java.util.Collection<io.grpc.internal.a0$e> r2 = r7.f42892i     // Catch:{ all -> 0x00ae }
            r1.<init>(r2)     // Catch:{ all -> 0x00ae }
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0027:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0066
            java.lang.Object r2 = r1.next()
            io.grpc.internal.a0$e r2 = (p264io.grpc.internal.C11105a0.C11110e) r2
            rc.r0$f r3 = r2.f42904j
            rc.r0$e r3 = r8.mo35093a(r3)
            rc.r0$f r4 = r2.f42904j
            rc.c r4 = r4.mo35344a()
            boolean r5 = r4.mo36965j()
            io.grpc.internal.s r3 = p264io.grpc.internal.C11335r0.m55803j(r3, r5)
            if (r3 == 0) goto L_0x0027
            java.util.concurrent.Executor r5 = r7.f42886c
            java.util.concurrent.Executor r6 = r4.mo36960e()
            if (r6 == 0) goto L_0x0059
            java.util.concurrent.Executor r5 = r4.mo36960e()
        L_0x0059:
            java.lang.Runnable r3 = r2.m55065A(r3)
            if (r3 == 0) goto L_0x0062
            r5.execute(r3)
        L_0x0062:
            r0.add(r2)
            goto L_0x0027
        L_0x0066:
            java.lang.Object r8 = r7.f42885b
            monitor-enter(r8)
            boolean r1 = r7.mo34938q()     // Catch:{ all -> 0x00a9 }
            if (r1 != 0) goto L_0x0071
            monitor-exit(r8)     // Catch:{ all -> 0x00a9 }
            return
        L_0x0071:
            java.util.Collection<io.grpc.internal.a0$e> r1 = r7.f42892i     // Catch:{ all -> 0x00a9 }
            r1.removeAll(r0)     // Catch:{ all -> 0x00a9 }
            java.util.Collection<io.grpc.internal.a0$e> r0 = r7.f42892i     // Catch:{ all -> 0x00a9 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0085
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch:{ all -> 0x00a9 }
            r0.<init>()     // Catch:{ all -> 0x00a9 }
            r7.f42892i = r0     // Catch:{ all -> 0x00a9 }
        L_0x0085:
            boolean r0 = r7.mo34938q()     // Catch:{ all -> 0x00a9 }
            if (r0 != 0) goto L_0x00a2
            rc.n1 r0 = r7.f42887d     // Catch:{ all -> 0x00a9 }
            java.lang.Runnable r1 = r7.f42889f     // Catch:{ all -> 0x00a9 }
            r0.mo37064c(r1)     // Catch:{ all -> 0x00a9 }
            rc.j1 r0 = r7.f42893j     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a2
            java.lang.Runnable r0 = r7.f42890g     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a2
            rc.n1 r1 = r7.f42887d     // Catch:{ all -> 0x00a9 }
            r1.mo37064c(r0)     // Catch:{ all -> 0x00a9 }
            r0 = 0
            r7.f42890g = r0     // Catch:{ all -> 0x00a9 }
        L_0x00a2:
            monitor-exit(r8)     // Catch:{ all -> 0x00a9 }
            rc.n1 r8 = r7.f42887d
            r8.mo37063b()
            return
        L_0x00a9:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00a9 }
            throw r0
        L_0x00ac:
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x00ae:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11105a0.mo34939r(rc.r0$i):void");
    }
}
