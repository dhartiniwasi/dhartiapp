package p315ob;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import p186ac.C6538b;
import p186ac.C6539c;
import p264io.flutter.embedding.engine.FlutterJNI;
import p297mb.C11877a;
import p297mb.C11881b;
import p325pc.C12169e;

/* renamed from: ob.c */
/* compiled from: DartMessenger */
class C12058c implements C6539c, C12071f {

    /* renamed from: a */
    private final FlutterJNI f45075a;

    /* renamed from: b */
    private final Map<String, C12064f> f45076b;

    /* renamed from: c */
    private Map<String, List<C12060b>> f45077c;

    /* renamed from: d */
    private final Object f45078d;

    /* renamed from: e */
    private final AtomicBoolean f45079e;

    /* renamed from: f */
    private final Map<Integer, C6539c.C6541b> f45080f;

    /* renamed from: g */
    private int f45081g;

    /* renamed from: h */
    private final C12062d f45082h;

    /* renamed from: i */
    private WeakHashMap<C6539c.C6542c, C12062d> f45083i;

    /* renamed from: r */
    private C12067i f45084r;

    /* renamed from: ob.c$b */
    /* compiled from: DartMessenger */
    private static class C12060b {

        /* renamed from: a */
        public final ByteBuffer f45085a;

        /* renamed from: b */
        int f45086b;

        /* renamed from: c */
        long f45087c;

        C12060b(ByteBuffer byteBuffer, int i, long j) {
            this.f45085a = byteBuffer;
            this.f45086b = i;
            this.f45087c = j;
        }
    }

    /* renamed from: ob.c$c */
    /* compiled from: DartMessenger */
    static class C12061c implements C12062d {

        /* renamed from: a */
        private final ExecutorService f45088a;

        C12061c(ExecutorService executorService) {
            this.f45088a = executorService;
        }

        /* renamed from: a */
        public void mo36435a(Runnable runnable) {
            this.f45088a.execute(runnable);
        }
    }

    /* renamed from: ob.c$d */
    /* compiled from: DartMessenger */
    interface C12062d {
        /* renamed from: a */
        void mo36435a(Runnable runnable);
    }

    /* renamed from: ob.c$e */
    /* compiled from: DartMessenger */
    private static class C12063e implements C12067i {

        /* renamed from: a */
        ExecutorService f45089a = C11877a.m57376e().mo36133b();

        C12063e() {
        }

        /* renamed from: a */
        public C12062d mo36436a(C6539c.C6543d dVar) {
            if (dVar.mo22140a()) {
                return new C12066h(this.f45089a);
            }
            return new C12061c(this.f45089a);
        }
    }

    /* renamed from: ob.c$f */
    /* compiled from: DartMessenger */
    private static class C12064f {

        /* renamed from: a */
        public final C6539c.C6540a f45090a;

        /* renamed from: b */
        public final C12062d f45091b;

        C12064f(C6539c.C6540a aVar, C12062d dVar) {
            this.f45090a = aVar;
            this.f45091b = dVar;
        }
    }

    /* renamed from: ob.c$g */
    /* compiled from: DartMessenger */
    static class C12065g implements C6539c.C6541b {

        /* renamed from: a */
        private final FlutterJNI f45092a;

        /* renamed from: b */
        private final int f45093b;

        /* renamed from: c */
        private final AtomicBoolean f45094c = new AtomicBoolean(false);

        C12065g(FlutterJNI flutterJNI, int i) {
            this.f45092a = flutterJNI;
            this.f45093b = i;
        }

        /* renamed from: a */
        public void mo22132a(ByteBuffer byteBuffer) {
            if (this.f45094c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            } else if (byteBuffer == null) {
                this.f45092a.invokePlatformMessageEmptyResponseCallback(this.f45093b);
            } else {
                this.f45092a.invokePlatformMessageResponseCallback(this.f45093b, byteBuffer, byteBuffer.position());
            }
        }
    }

    /* renamed from: ob.c$h */
    /* compiled from: DartMessenger */
    static class C12066h implements C12062d {

        /* renamed from: a */
        private final ExecutorService f45095a;

        /* renamed from: b */
        private final ConcurrentLinkedQueue<Runnable> f45096b = new ConcurrentLinkedQueue<>();

        /* renamed from: c */
        private final AtomicBoolean f45097c = new AtomicBoolean(false);

        C12066h(ExecutorService executorService) {
            this.f45095a = executorService;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public void m58053f() {
            if (this.f45097c.compareAndSet(false, true)) {
                try {
                    Runnable poll = this.f45096b.poll();
                    if (poll != null) {
                        poll.run();
                    }
                } finally {
                    this.f45097c.set(false);
                    if (!this.f45096b.isEmpty()) {
                        this.f45095a.execute(new C12070e(this));
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo36435a(Runnable runnable) {
            this.f45096b.add(runnable);
            this.f45095a.execute(new C12069d(this));
        }
    }

    /* renamed from: ob.c$i */
    /* compiled from: DartMessenger */
    interface C12067i {
        /* renamed from: a */
        C12062d mo36436a(C6539c.C6543d dVar);
    }

    /* renamed from: ob.c$j */
    /* compiled from: DartMessenger */
    private static class C12068j implements C6539c.C6542c {
        private C12068j() {
        }
    }

    C12058c(FlutterJNI flutterJNI, C12067i iVar) {
        this.f45076b = new HashMap();
        this.f45077c = new HashMap();
        this.f45078d = new Object();
        this.f45079e = new AtomicBoolean(false);
        this.f45080f = new HashMap();
        this.f45081g = 1;
        this.f45082h = new C12072g();
        this.f45083i = new WeakHashMap<>();
        this.f45075a = flutterJNI;
        this.f45084r = iVar;
    }

    /* renamed from: i */
    private void m58033i(String str, C12064f fVar, ByteBuffer byteBuffer, int i, long j) {
        C12064f fVar2 = fVar;
        C12062d dVar = fVar2 != null ? fVar2.f45091b : null;
        C12169e.m58444b("PlatformChannel ScheduleHandler on " + str, i);
        C12057b bVar = new C12057b(this, str, i, fVar, byteBuffer, j);
        if (dVar == null) {
            dVar = this.f45082h;
        }
        dVar.mo36435a(bVar);
    }

    /* renamed from: k */
    private static void m58034k(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() != null) {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
            return;
        }
        throw error;
    }

    /* renamed from: l */
    private void m58035l(C12064f fVar, ByteBuffer byteBuffer, int i) {
        if (fVar != null) {
            try {
                C11881b.m57388f("DartMessenger", "Deferring to registered handler to process message.");
                fVar.f45090a.mo22130a(byteBuffer, new C12065g(this.f45075a, i));
            } catch (Exception e) {
                C11881b.m57385c("DartMessenger", "Uncaught exception in binary message listener", e);
                this.f45075a.invokePlatformMessageEmptyResponseCallback(i);
            } catch (Error e2) {
                m58034k(e2);
            }
        } else {
            C11881b.m57388f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
            this.f45075a.invokePlatformMessageEmptyResponseCallback(i);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m58036m(String str, int i, C12064f fVar, ByteBuffer byteBuffer, long j) {
        C12169e.m58447e("PlatformChannel ScheduleHandler on " + str, i);
        C12169e.m58443a("DartMessenger#handleMessageFromDart on " + str);
        try {
            m58035l(fVar, byteBuffer, i);
            if (byteBuffer != null && byteBuffer.isDirect()) {
                byteBuffer.limit(0);
            }
        } finally {
            this.f45075a.cleanupMessageData(j);
            C12169e.m58446d();
        }
    }

    /* renamed from: a */
    public C6539c.C6542c mo22134a(C6539c.C6543d dVar) {
        C12062d a = this.f45084r.mo36436a(dVar);
        C12068j jVar = new C12068j();
        this.f45083i.put(jVar, a);
        return jVar;
    }

    /* renamed from: b */
    public /* synthetic */ C6539c.C6542c mo22135b() {
        return C6538b.m38040a(this);
    }

    /* renamed from: c */
    public void mo36433c(int i, ByteBuffer byteBuffer) {
        C11881b.m57388f("DartMessenger", "Received message reply from Dart.");
        C6539c.C6541b remove = this.f45080f.remove(Integer.valueOf(i));
        if (remove != null) {
            try {
                C11881b.m57388f("DartMessenger", "Invoking registered callback for reply from Dart.");
                remove.mo22132a(byteBuffer);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
            } catch (Exception e) {
                C11881b.m57385c("DartMessenger", "Uncaught exception in binary message reply handler", e);
            } catch (Error e2) {
                m58034k(e2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0076, code lost:
        r10 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r10.hasNext() == false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        r11 = (p315ob.C12058c.C12060b) r10.next();
        m58033i(r9, r8.f45076b.get(r9), r11.f45085a, r11.f45086b, r11.f45087c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22136d(java.lang.String r9, p186ac.C6539c.C6540a r10, p186ac.C6539c.C6542c r11) {
        /*
            r8 = this;
            if (r10 != 0) goto L_0x002a
            java.lang.String r10 = "DartMessenger"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "Removing handler for channel '"
            r11.append(r0)
            r11.append(r9)
            java.lang.String r0 = "'"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            p297mb.C11881b.m57388f(r10, r11)
            java.lang.Object r0 = r8.f45078d
            monitor-enter(r0)
            java.util.Map<java.lang.String, ob.c$f> r10 = r8.f45076b     // Catch:{ all -> 0x0027 }
            r10.remove(r9)     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r9
        L_0x002a:
            r0 = 0
            if (r11 == 0) goto L_0x0041
            java.util.WeakHashMap<ac.c$c, ob.c$d> r0 = r8.f45083i
            java.lang.Object r11 = r0.get(r11)
            r0 = r11
            ob.c$d r0 = (p315ob.C12058c.C12062d) r0
            if (r0 == 0) goto L_0x0039
            goto L_0x0041
        L_0x0039:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue)."
            r9.<init>(r10)
            throw r9
        L_0x0041:
            java.lang.String r11 = "DartMessenger"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Setting handler for channel '"
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = "'"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            p297mb.C11881b.m57388f(r11, r1)
            java.lang.Object r11 = r8.f45078d
            monitor-enter(r11)
            java.util.Map<java.lang.String, ob.c$f> r1 = r8.f45076b     // Catch:{ all -> 0x009c }
            ob.c$f r2 = new ob.c$f     // Catch:{ all -> 0x009c }
            r2.<init>(r10, r0)     // Catch:{ all -> 0x009c }
            r1.put(r9, r2)     // Catch:{ all -> 0x009c }
            java.util.Map<java.lang.String, java.util.List<ob.c$b>> r10 = r8.f45077c     // Catch:{ all -> 0x009c }
            java.lang.Object r10 = r10.remove(r9)     // Catch:{ all -> 0x009c }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x009c }
            if (r10 != 0) goto L_0x0075
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            return
        L_0x0075:
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            java.util.Iterator r10 = r10.iterator()
        L_0x007a:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x009b
            java.lang.Object r11 = r10.next()
            ob.c$b r11 = (p315ob.C12058c.C12060b) r11
            java.util.Map<java.lang.String, ob.c$f> r0 = r8.f45076b
            java.lang.Object r0 = r0.get(r9)
            r3 = r0
            ob.c$f r3 = (p315ob.C12058c.C12064f) r3
            java.nio.ByteBuffer r4 = r11.f45085a
            int r5 = r11.f45086b
            long r6 = r11.f45087c
            r1 = r8
            r2 = r9
            r1.m58033i(r2, r3, r4, r5, r6)
            goto L_0x007a
        L_0x009b:
            return
        L_0x009c:
            r9 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x009c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p315ob.C12058c.mo22136d(java.lang.String, ac.c$a, ac.c$c):void");
    }

    /* renamed from: e */
    public void mo22137e(String str, ByteBuffer byteBuffer) {
        C11881b.m57388f("DartMessenger", "Sending message over channel '" + str + "'");
        mo22138f(str, byteBuffer, (C6539c.C6541b) null);
    }

    /* renamed from: f */
    public void mo22138f(String str, ByteBuffer byteBuffer, C6539c.C6541b bVar) {
        C12169e.m58443a("DartMessenger#send on " + str);
        try {
            C11881b.m57388f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i = this.f45081g;
            this.f45081g = i + 1;
            if (bVar != null) {
                this.f45080f.put(Integer.valueOf(i), bVar);
            }
            if (byteBuffer == null) {
                this.f45075a.dispatchEmptyPlatformMessage(str, i);
            } else {
                this.f45075a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i);
            }
        } finally {
            C12169e.m58446d();
        }
    }

    /* renamed from: g */
    public void mo36434g(String str, ByteBuffer byteBuffer, int i, long j) {
        C12064f fVar;
        boolean z;
        C11881b.m57388f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f45078d) {
            fVar = this.f45076b.get(str);
            z = this.f45079e.get() && fVar == null;
            if (z) {
                if (!this.f45077c.containsKey(str)) {
                    this.f45077c.put(str, new LinkedList());
                }
                this.f45077c.get(str).add(new C12060b(byteBuffer, i, j));
            }
        }
        if (!z) {
            m58033i(str, fVar, byteBuffer, i, j);
        }
    }

    /* renamed from: j */
    public void mo22139j(String str, C6539c.C6540a aVar) {
        mo22136d(str, aVar, (C6539c.C6542c) null);
    }

    C12058c(FlutterJNI flutterJNI) {
        this(flutterJNI, new C12063e());
    }
}
