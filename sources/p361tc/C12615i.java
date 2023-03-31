package p361tc;

import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import p182a7.C6419h;
import p182a7.C6431n;
import p182a7.C6441r;
import p182a7.C6444t;
import p187ad.C6574c;
import p228f7.C10141e;
import p264io.grpc.internal.C11147c1;
import p264io.grpc.internal.C11160d2;
import p264io.grpc.internal.C11255i2;
import p264io.grpc.internal.C11272k1;
import p264io.grpc.internal.C11310o2;
import p264io.grpc.internal.C11330q0;
import p264io.grpc.internal.C11333r;
import p264io.grpc.internal.C11335r0;
import p264io.grpc.internal.C11376v;
import p264io.grpc.internal.C11377v0;
import p264io.grpc.internal.C11383w0;
import p336qe.C12231c;
import p336qe.C12234e;
import p336qe.C12235f;
import p336qe.C12241l;
import p336qe.C12252t;
import p336qe.C12253u;
import p343rc.C12271a;
import p343rc.C12290b0;
import p343rc.C12292c;
import p343rc.C12294c0;
import p343rc.C12302d0;
import p343rc.C12325h1;
import p343rc.C12334j0;
import p343rc.C12335j1;
import p343rc.C12340k;
import p343rc.C12345k1;
import p343rc.C12411y0;
import p343rc.C12423z0;
import p361tc.C12598b;
import p361tc.C12603f;
import p361tc.C12612h;
import p361tc.C12622j;
import p361tc.C12632q;
import p371uc.C12726b;
import p371uc.C12729c;
import p381vc.C12870a;
import p381vc.C12871b;
import p381vc.C12873c;
import p381vc.C12874d;
import p381vc.C12875e;
import p381vc.C12879g;
import p381vc.C12886i;
import p381vc.C12887j;
import p391wc.C12942a;
import p391wc.C12945b;

/* renamed from: tc.i */
/* compiled from: OkHttpClientTransport */
class C12615i implements C11376v, C12598b.C12599a, C12632q.C12636d {

    /* renamed from: W */
    private static final Map<C12870a, C12335j1> f46275W = m60010Q();
    /* access modifiers changed from: private */

    /* renamed from: X */
    public static final Logger f46276X = Logger.getLogger(C12615i.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final SocketFactory f46277A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public SSLSocketFactory f46278B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public HostnameVerifier f46279C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public Socket f46280D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public int f46281E;

    /* renamed from: F */
    private final Deque<C12612h> f46282F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final C12726b f46283G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public C11147c1 f46284H;

    /* renamed from: I */
    private boolean f46285I;

    /* renamed from: J */
    private long f46286J;

    /* renamed from: K */
    private long f46287K;

    /* renamed from: L */
    private boolean f46288L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final Runnable f46289M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public final int f46290N;

    /* renamed from: O */
    private final boolean f46291O;

    /* renamed from: P */
    private final C11310o2 f46292P;

    /* renamed from: Q */
    private final C11383w0<C12612h> f46293Q;
    /* access modifiers changed from: private */

    /* renamed from: R */
    public C12302d0.C12304b f46294R;

    /* renamed from: S */
    final C12294c0 f46295S;

    /* renamed from: T */
    int f46296T;

    /* renamed from: U */
    Runnable f46297U;

    /* renamed from: V */
    C10141e<Void> f46298V;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final InetSocketAddress f46299a;

    /* renamed from: b */
    private final String f46300b;

    /* renamed from: c */
    private final String f46301c;

    /* renamed from: d */
    private final Random f46302d;

    /* renamed from: e */
    private final C6444t<C6441r> f46303e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final int f46304f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C12887j f46305g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C11272k1.C11273a f46306h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C12598b f46307i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C12632q f46308j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Object f46309k;

    /* renamed from: l */
    private final C12334j0 f46310l;

    /* renamed from: m */
    private int f46311m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Map<Integer, C12612h> f46312n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Executor f46313o;

    /* renamed from: p */
    private final C11160d2 f46314p;

    /* renamed from: q */
    private final ScheduledExecutorService f46315q;

    /* renamed from: r */
    private final int f46316r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f46317s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C12621e f46318t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C12271a f46319u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C12335j1 f46320v;

    /* renamed from: w */
    private boolean f46321w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C11377v0 f46322x;

    /* renamed from: y */
    private boolean f46323y;

    /* renamed from: z */
    private boolean f46324z;

    /* renamed from: tc.i$a */
    /* compiled from: OkHttpClientTransport */
    class C12616a extends C11383w0<C12612h> {
        C12616a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo35118b() {
            C12615i.this.f46306h.mo35113c(true);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo35119c() {
            C12615i.this.f46306h.mo35113c(false);
        }
    }

    /* renamed from: tc.i$b */
    /* compiled from: OkHttpClientTransport */
    class C12617b implements C11310o2.C11313c {
        C12617b() {
        }
    }

    /* renamed from: tc.i$c */
    /* compiled from: OkHttpClientTransport */
    class C12618c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CountDownLatch f46327a;

        /* renamed from: b */
        final /* synthetic */ C12592a f46328b;

        /* renamed from: tc.i$c$a */
        /* compiled from: OkHttpClientTransport */
        class C12619a implements C12252t {
            C12619a() {
            }

            public void close() {
            }

            /* renamed from: o */
            public C12253u mo33809o() {
                return C12253u.f45422d;
            }

            /* renamed from: z */
            public long mo33810z(C12231c cVar, long j) {
                return -1;
            }
        }

        C12618c(CountDownLatch countDownLatch, C12592a aVar) {
            this.f46327a = countDownLatch;
            this.f46328b = aVar;
        }

        public void run() {
            C12615i iVar;
            C12621e eVar;
            Socket M;
            try {
                this.f46327a.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            C12234e b = C12241l.m58807b(new C12619a());
            SSLSession sSLSession = null;
            try {
                C12615i iVar2 = C12615i.this;
                C12294c0 c0Var = iVar2.f46295S;
                if (c0Var == null) {
                    M = iVar2.f46277A.createSocket(C12615i.this.f46299a.getAddress(), C12615i.this.f46299a.getPort());
                } else if (c0Var.mo36978b() instanceof InetSocketAddress) {
                    C12615i iVar3 = C12615i.this;
                    M = iVar3.m60012S(iVar3.f46295S.mo36979c(), (InetSocketAddress) C12615i.this.f46295S.mo36978b(), C12615i.this.f46295S.mo36980d(), C12615i.this.f46295S.mo36977a());
                } else {
                    C12335j1 j1Var = C12335j1.f45620t;
                    throw j1Var.mo37030q("Unsupported SocketAddress implementation " + C12615i.this.f46295S.mo36978b().getClass()).mo37020c();
                }
                Socket socket = M;
                SSLSocket sSLSocket = socket;
                if (C12615i.this.f46278B != null) {
                    SSLSocket b2 = C12629n.m60113b(C12615i.this.f46278B, C12615i.this.f46279C, socket, C12615i.this.mo37479W(), C12615i.this.mo37480X(), C12615i.this.f46283G);
                    sSLSession = b2.getSession();
                    sSLSocket = b2;
                }
                sSLSocket.setTcpNoDelay(true);
                C12234e b3 = C12241l.m58807b(C12241l.m58813h(sSLSocket));
                this.f46328b.mo37435w(C12241l.m58810e(sSLSocket), sSLSocket);
                C12615i iVar4 = C12615i.this;
                C12271a unused2 = iVar4.f46319u = iVar4.f46319u.mo36916d().mo36922d(C12290b0.f45524a, sSLSocket.getRemoteSocketAddress()).mo36922d(C12290b0.f45525b, sSLSocket.getLocalSocketAddress()).mo36922d(C12290b0.f45526c, sSLSession).mo36922d(C11330q0.f43509a, sSLSession == null ? C12325h1.NONE : C12325h1.PRIVACY_AND_INTEGRITY).mo36920a();
                C12615i iVar5 = C12615i.this;
                C12621e unused3 = iVar5.f46318t = new C12621e(iVar5.f46305g.mo37900b(b3, true));
                synchronized (C12615i.this.f46309k) {
                    Socket unused4 = C12615i.this.f46280D = (Socket) C6431n.m37562o(sSLSocket, "socket");
                    if (sSLSession != null) {
                        C12302d0.C12304b unused5 = C12615i.this.f46294R = new C12302d0.C12304b(new C12302d0.C12305c(sSLSession));
                    }
                }
                return;
            } catch (C12345k1 e) {
                C12615i.this.m60023k0(0, C12870a.INTERNAL_ERROR, e.mo37047a());
                iVar = C12615i.this;
                eVar = new C12621e(iVar.f46305g.mo37900b(b, true));
            } catch (Exception e2) {
                C12615i.this.mo37452e(e2);
                iVar = C12615i.this;
                eVar = new C12621e(iVar.f46305g.mo37900b(b, true));
            } catch (Throwable th) {
                C12615i iVar6 = C12615i.this;
                C12621e unused6 = iVar6.f46318t = new C12621e(iVar6.f46305g.mo37900b(b, true));
                throw th;
            }
            C12621e unused7 = iVar.f46318t = eVar;
        }
    }

    /* renamed from: tc.i$d */
    /* compiled from: OkHttpClientTransport */
    class C12620d implements Runnable {
        C12620d() {
        }

        public void run() {
            Runnable runnable = C12615i.this.f46297U;
            if (runnable != null) {
                runnable.run();
            }
            C12615i.this.f46313o.execute(C12615i.this.f46318t);
            synchronized (C12615i.this.f46309k) {
                int unused = C12615i.this.f46281E = Integer.MAX_VALUE;
                boolean unused2 = C12615i.this.m60025l0();
            }
            C10141e<Void> eVar = C12615i.this.f46298V;
        }
    }

    /* renamed from: tc.i$e */
    /* compiled from: OkHttpClientTransport */
    class C12621e implements C12871b.C12872a, Runnable {

        /* renamed from: a */
        private final C12622j f46332a = new C12622j(Level.FINE, (Class<?>) C12615i.class);

        /* renamed from: b */
        C12871b f46333b;

        /* renamed from: c */
        boolean f46334c = true;

        C12621e(C12871b bVar) {
            this.f46333b = bVar;
        }

        /* renamed from: a */
        private int m60066a(List<C12874d> list) {
            long j = 0;
            for (int i = 0; i < list.size(); i++) {
                C12874d dVar = list.get(i);
                j += (long) (dVar.f47011a.mo36846w() + 32 + dVar.f47012b.mo36846w());
            }
            return (int) Math.min(j, 2147483647L);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
            if (r0 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
            r9 = r7.f46335d;
            r10 = p381vc.C12870a.PROTOCOL_ERROR;
            p361tc.C12615i.m59994A(r9, r10, "Received window_update for unknown stream: " + r8);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo37491c(int r8, long r9) {
            /*
                r7 = this;
                tc.j r0 = r7.f46332a
                tc.j$a r1 = p361tc.C12622j.C12623a.INBOUND
                r0.mo37511k(r1, r8, r9)
                r0 = 0
                int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r2 != 0) goto L_0x002c
                java.lang.String r9 = "Received 0 flow control window increment."
                if (r8 != 0) goto L_0x0019
                tc.i r8 = p361tc.C12615i.this
                vc.a r10 = p381vc.C12870a.PROTOCOL_ERROR
                r8.m60016f0(r10, r9)
                goto L_0x002b
            L_0x0019:
                tc.i r0 = p361tc.C12615i.this
                rc.j1 r10 = p343rc.C12335j1.f45620t
                rc.j1 r2 = r10.mo37030q(r9)
                io.grpc.internal.r$a r3 = p264io.grpc.internal.C11333r.C11334a.PROCESSED
                r4 = 0
                vc.a r5 = p381vc.C12870a.PROTOCOL_ERROR
                r6 = 0
                r1 = r8
                r0.mo37477U(r1, r2, r3, r4, r5, r6)
            L_0x002b:
                return
            L_0x002c:
                r0 = 0
                tc.i r1 = p361tc.C12615i.this
                java.lang.Object r1 = r1.f46309k
                monitor-enter(r1)
                if (r8 != 0) goto L_0x0043
                tc.i r8 = p361tc.C12615i.this     // Catch:{ all -> 0x008d }
                tc.q r8 = r8.f46308j     // Catch:{ all -> 0x008d }
                r0 = 0
                int r10 = (int) r9     // Catch:{ all -> 0x008d }
                r8.mo37521g(r0, r10)     // Catch:{ all -> 0x008d }
                monitor-exit(r1)     // Catch:{ all -> 0x008d }
                return
            L_0x0043:
                tc.i r2 = p361tc.C12615i.this     // Catch:{ all -> 0x008d }
                java.util.Map r2 = r2.f46312n     // Catch:{ all -> 0x008d }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x008d }
                java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x008d }
                tc.h r2 = (p361tc.C12612h) r2     // Catch:{ all -> 0x008d }
                if (r2 == 0) goto L_0x0068
                tc.i r3 = p361tc.C12615i.this     // Catch:{ all -> 0x008d }
                tc.q r3 = r3.f46308j     // Catch:{ all -> 0x008d }
                tc.h$b r2 = r2.mo34911y()     // Catch:{ all -> 0x008d }
                tc.q$c r2 = r2.mo37470b0()     // Catch:{ all -> 0x008d }
                int r10 = (int) r9     // Catch:{ all -> 0x008d }
                r3.mo37521g(r2, r10)     // Catch:{ all -> 0x008d }
                goto L_0x0071
            L_0x0068:
                tc.i r9 = p361tc.C12615i.this     // Catch:{ all -> 0x008d }
                boolean r9 = r9.mo37484c0(r8)     // Catch:{ all -> 0x008d }
                if (r9 != 0) goto L_0x0071
                r0 = 1
            L_0x0071:
                monitor-exit(r1)     // Catch:{ all -> 0x008d }
                if (r0 == 0) goto L_0x008c
                tc.i r9 = p361tc.C12615i.this
                vc.a r10 = p381vc.C12870a.PROTOCOL_ERROR
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Received window_update for unknown stream: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                r9.m60016f0(r10, r8)
            L_0x008c:
                return
            L_0x008d:
                r8 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x008d }
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p361tc.C12615i.C12621e.mo37491c(int, long):void");
        }

        /* renamed from: i */
        public void mo37492i(boolean z, int i, int i2) {
            C11377v0 v0Var;
            long j = (((long) i) << 32) | (((long) i2) & 4294967295L);
            this.f46332a.mo37505e(C12622j.C12623a.INBOUND, j);
            if (!z) {
                synchronized (C12615i.this.f46309k) {
                    C12615i.this.f46307i.mo37440i(true, i, i2);
                }
                return;
            }
            synchronized (C12615i.this.f46309k) {
                v0Var = null;
                if (C12615i.this.f46322x == null) {
                    C12615i.f46276X.warning("Received unexpected ping ack. No ping outstanding");
                } else if (C12615i.this.f46322x.mo35368h() == j) {
                    C11377v0 G = C12615i.this.f46322x;
                    C11377v0 unused = C12615i.this.f46322x = null;
                    v0Var = G;
                } else {
                    C12615i.f46276X.log(Level.WARNING, String.format(Locale.US, "Received unexpected ping ack. Expecting %d, got %d", new Object[]{Long.valueOf(C12615i.this.f46322x.mo35368h()), Long.valueOf(j)}));
                }
            }
            if (v0Var != null) {
                v0Var.mo35366d();
            }
        }

        /* renamed from: j */
        public void mo37493j() {
        }

        /* renamed from: k */
        public void mo37494k(boolean z, int i, C12234e eVar, int i2) throws IOException {
            this.f46332a.mo37502b(C12622j.C12623a.INBOUND, i, eVar.mo36780W(), i2, z);
            C12612h Z = C12615i.this.mo37481Z(i);
            if (Z != null) {
                long j = (long) i2;
                eVar.mo36825y1(j);
                C12231c cVar = new C12231c();
                cVar.mo35694k1(eVar.mo36780W(), j);
                C6574c.m38137c("OkHttpClientTransport$ClientFrameHandler.data", Z.mo34911y().mo37473h0());
                synchronized (C12615i.this.f46309k) {
                    Z.mo34911y().mo37474i0(cVar, z);
                }
            } else if (C12615i.this.mo37484c0(i)) {
                synchronized (C12615i.this.f46309k) {
                    C12615i.this.f46307i.mo37441r(i, C12870a.STREAM_CLOSED);
                }
                eVar.skip((long) i2);
            } else {
                C12615i iVar = C12615i.this;
                C12870a aVar = C12870a.PROTOCOL_ERROR;
                iVar.m60016f0(aVar, "Received data for unknown stream: " + i);
                return;
            }
            C12615i.m59997D(C12615i.this, i2);
            if (((float) C12615i.this.f46317s) >= ((float) C12615i.this.f46304f) * 0.5f) {
                synchronized (C12615i.this.f46309k) {
                    C12615i.this.f46307i.mo37447c(0, (long) C12615i.this.f46317s);
                }
                int unused = C12615i.this.f46317s = 0;
            }
        }

        /* renamed from: l */
        public void mo37495l(int i, int i2, int i3, boolean z) {
        }

        /* renamed from: m */
        public void mo37496m(int i, int i2, List<C12874d> list) throws IOException {
            this.f46332a.mo37507g(C12622j.C12623a.INBOUND, i, i2, list);
            synchronized (C12615i.this.f46309k) {
                C12615i.this.f46307i.mo37441r(i, C12870a.PROTOCOL_ERROR);
            }
        }

        /* renamed from: r */
        public void mo37497r(int i, C12870a aVar) {
            this.f46332a.mo37508h(C12622j.C12623a.INBOUND, i, aVar);
            C12335j1 e = C12615i.m60032p0(aVar).mo37022e("Rst Stream");
            boolean z = e.mo37026m() == C12335j1.C12337b.CANCELLED || e.mo37026m() == C12335j1.C12337b.DEADLINE_EXCEEDED;
            synchronized (C12615i.this.f46309k) {
                C12612h hVar = (C12612h) C12615i.this.f46312n.get(Integer.valueOf(i));
                if (hVar != null) {
                    C6574c.m38137c("OkHttpClientTransport$ClientFrameHandler.rstStream", hVar.mo34911y().mo37473h0());
                    C12615i.this.mo37477U(i, e, aVar == C12870a.REFUSED_STREAM ? C11333r.C11334a.REFUSED : C11333r.C11334a.PROCESSED, z, (C12870a) null, (C12411y0) null);
                }
            }
        }

        public void run() {
            String str;
            C12335j1 x;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f46333b.mo37887q0(this)) {
                try {
                    if (C12615i.this.f46284H != null) {
                        C12615i.this.f46284H.mo35000m();
                    }
                } catch (Throwable th) {
                    try {
                        C12615i.this.m60023k0(0, C12870a.PROTOCOL_ERROR, C12335j1.f45620t.mo37030q("error in frame handler").mo37029p(th));
                    } finally {
                        try {
                            this.f46333b.close();
                        } catch (IOException e) {
                            str = "Exception closing frame reader";
                            C12615i.f46276X.log(Level.INFO, str, e);
                        }
                        C12615i.this.f46306h.mo35112b();
                        Thread.currentThread().setName(name);
                    }
                }
            }
            synchronized (C12615i.this.f46309k) {
                x = C12615i.this.f46320v;
            }
            if (x == null) {
                x = C12335j1.f45621u.mo37030q("End of stream or IOException");
            }
            C12615i.this.m60023k0(0, C12870a.INTERNAL_ERROR, x);
            try {
                this.f46333b.close();
            } catch (IOException e2) {
                e = e2;
            }
        }

        /* renamed from: s */
        public void mo37499s(boolean z, C12886i iVar) {
            boolean z2;
            this.f46332a.mo37509i(C12622j.C12623a.INBOUND, iVar);
            synchronized (C12615i.this.f46309k) {
                if (C12628m.m60110b(iVar, 4)) {
                    int unused = C12615i.this.f46281E = C12628m.m60109a(iVar, 4);
                }
                if (C12628m.m60110b(iVar, 7)) {
                    z2 = C12615i.this.f46308j.mo37520f(C12628m.m60109a(iVar, 7));
                } else {
                    z2 = false;
                }
                if (this.f46334c) {
                    C12615i.this.f46306h.mo35111a();
                    this.f46334c = false;
                }
                C12615i.this.f46307i.mo37439b1(iVar);
                if (z2) {
                    C12615i.this.f46308j.mo37522h();
                }
                boolean unused2 = C12615i.this.m60025l0();
            }
        }

        /* renamed from: t */
        public void mo37500t(int i, C12870a aVar, C12235f fVar) {
            this.f46332a.mo37503c(C12622j.C12623a.INBOUND, i, aVar, fVar);
            if (aVar == C12870a.ENHANCE_YOUR_CALM) {
                String B = fVar.mo36832B();
                C12615i.f46276X.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", new Object[]{this, B}));
                if ("too_many_pings".equals(B)) {
                    C12615i.this.f46289M.run();
                }
            }
            C12335j1 e = C11335r0.C11343h.m55827k((long) aVar.f47001a).mo37022e("Received Goaway");
            if (fVar.mo36846w() > 0) {
                e = e.mo37022e(fVar.mo36832B());
            }
            C12615i.this.m60023k0(i, (C12870a) null, e);
        }

        /* renamed from: u */
        public void mo37501u(boolean z, boolean z2, int i, int i2, List<C12874d> list, C12875e eVar) {
            C12335j1 j1Var;
            int a;
            this.f46332a.mo37504d(C12622j.C12623a.INBOUND, i, list, z2);
            boolean z3 = true;
            if (C12615i.this.f46290N == Integer.MAX_VALUE || (a = m60066a(list)) <= C12615i.this.f46290N) {
                j1Var = null;
            } else {
                C12335j1 j1Var2 = C12335j1.f45615o;
                Locale locale = Locale.US;
                Object[] objArr = new Object[3];
                objArr[0] = z2 ? "trailer" : "header";
                objArr[1] = Integer.valueOf(C12615i.this.f46290N);
                objArr[2] = Integer.valueOf(a);
                j1Var = j1Var2.mo37030q(String.format(locale, "Response %s metadata larger than %d: %d", objArr));
            }
            synchronized (C12615i.this.f46309k) {
                C12612h hVar = (C12612h) C12615i.this.f46312n.get(Integer.valueOf(i));
                if (hVar == null) {
                    if (C12615i.this.mo37484c0(i)) {
                        C12615i.this.f46307i.mo37441r(i, C12870a.STREAM_CLOSED);
                    }
                } else if (j1Var == null) {
                    C6574c.m38137c("OkHttpClientTransport$ClientFrameHandler.headers", hVar.mo34911y().mo37473h0());
                    hVar.mo34911y().mo37475j0(list, z2);
                } else {
                    if (!z2) {
                        C12615i.this.f46307i.mo37441r(i, C12870a.CANCEL);
                    }
                    hVar.mo34911y().mo34928N(j1Var, false, new C12411y0());
                }
                z3 = false;
            }
            if (z3) {
                C12615i iVar = C12615i.this;
                C12870a aVar = C12870a.PROTOCOL_ERROR;
                iVar.m60016f0(aVar, "Received header for unknown stream: " + i);
            }
        }
    }

    public C12615i(C12603f.C12609f fVar, InetSocketAddress inetSocketAddress, String str, String str2, C12271a aVar, C12294c0 c0Var, Runnable runnable) {
        this(fVar, inetSocketAddress, str, str2, aVar, C11335r0.f43549w, new C12879g(), c0Var, runnable);
    }

    /* renamed from: D */
    static /* synthetic */ int m59997D(C12615i iVar, int i) {
        int i2 = iVar.f46317s + i;
        iVar.f46317s = i2;
        return i2;
    }

    /* renamed from: Q */
    private static Map<C12870a, C12335j1> m60010Q() {
        EnumMap enumMap = new EnumMap(C12870a.class);
        C12870a aVar = C12870a.NO_ERROR;
        C12335j1 j1Var = C12335j1.f45620t;
        enumMap.put(aVar, j1Var.mo37030q("No error: A GRPC status of OK should have been sent"));
        enumMap.put(C12870a.PROTOCOL_ERROR, j1Var.mo37030q("Protocol error"));
        enumMap.put(C12870a.INTERNAL_ERROR, j1Var.mo37030q("Internal error"));
        enumMap.put(C12870a.FLOW_CONTROL_ERROR, j1Var.mo37030q("Flow control error"));
        enumMap.put(C12870a.STREAM_CLOSED, j1Var.mo37030q("Stream closed"));
        enumMap.put(C12870a.FRAME_TOO_LARGE, j1Var.mo37030q("Frame too large"));
        enumMap.put(C12870a.REFUSED_STREAM, C12335j1.f45621u.mo37030q("Refused stream"));
        enumMap.put(C12870a.CANCEL, C12335j1.f45607g.mo37030q("Cancelled"));
        enumMap.put(C12870a.COMPRESSION_ERROR, j1Var.mo37030q("Compression error"));
        enumMap.put(C12870a.CONNECT_ERROR, j1Var.mo37030q("Connect error"));
        enumMap.put(C12870a.ENHANCE_YOUR_CALM, C12335j1.f45615o.mo37030q("Enhance your calm"));
        enumMap.put(C12870a.INADEQUATE_SECURITY, C12335j1.f45613m.mo37030q("Inadequate security"));
        return Collections.unmodifiableMap(enumMap);
    }

    /* renamed from: R */
    private C12945b m60011R(InetSocketAddress inetSocketAddress, String str, String str2) {
        C12942a a = new C12942a.C12944b().mo37994k("https").mo37992h(inetSocketAddress.getHostName()).mo37993j(inetSocketAddress.getPort()).mo37990a();
        C12945b.C12947b e = new C12945b.C12947b().mo38001e(a);
        C12945b.C12947b d = e.mo38000d("Host", a.mo37985c() + ":" + a.mo37987f()).mo38000d("User-Agent", this.f46301c);
        if (!(str == null || str2 == null)) {
            d.mo38000d("Proxy-Authorization", C12729c.m60368a(str, str2));
        }
        return d.mo37999c();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:19|(2:20|21)|25|26|27|28|29) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00e9 */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.net.Socket m60012S(java.net.InetSocketAddress r10, java.net.InetSocketAddress r11, java.lang.String r12, java.lang.String r13) throws p343rc.C12345k1 {
        /*
            r9 = this;
            java.lang.String r0 = "\r\n"
            r1 = 0
            java.net.InetAddress r2 = r11.getAddress()     // Catch:{ IOException -> 0x0111 }
            if (r2 == 0) goto L_0x0018
            javax.net.SocketFactory r2 = r9.f46277A     // Catch:{ IOException -> 0x0111 }
            java.net.InetAddress r3 = r11.getAddress()     // Catch:{ IOException -> 0x0111 }
            int r11 = r11.getPort()     // Catch:{ IOException -> 0x0111 }
            java.net.Socket r11 = r2.createSocket(r3, r11)     // Catch:{ IOException -> 0x0111 }
            goto L_0x0026
        L_0x0018:
            javax.net.SocketFactory r2 = r9.f46277A     // Catch:{ IOException -> 0x0111 }
            java.lang.String r3 = r11.getHostName()     // Catch:{ IOException -> 0x0111 }
            int r11 = r11.getPort()     // Catch:{ IOException -> 0x0111 }
            java.net.Socket r11 = r2.createSocket(r3, r11)     // Catch:{ IOException -> 0x0111 }
        L_0x0026:
            r1 = r11
            r11 = 1
            r1.setTcpNoDelay(r11)     // Catch:{ IOException -> 0x0111 }
            int r2 = r9.f46296T     // Catch:{ IOException -> 0x0111 }
            r1.setSoTimeout(r2)     // Catch:{ IOException -> 0x0111 }
            qe.t r2 = p336qe.C12241l.m58813h(r1)     // Catch:{ IOException -> 0x0111 }
            qe.s r3 = p336qe.C12241l.m58810e(r1)     // Catch:{ IOException -> 0x0111 }
            qe.d r3 = p336qe.C12241l.m58806a(r3)     // Catch:{ IOException -> 0x0111 }
            wc.b r10 = r9.m60011R(r10, r12, r13)     // Catch:{ IOException -> 0x0111 }
            wc.a r12 = r10.mo37997b()     // Catch:{ IOException -> 0x0111 }
            java.util.Locale r13 = java.util.Locale.US     // Catch:{ IOException -> 0x0111 }
            java.lang.String r4 = "CONNECT %s:%d HTTP/1.1"
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x0111 }
            java.lang.String r7 = r12.mo37985c()     // Catch:{ IOException -> 0x0111 }
            r8 = 0
            r6[r8] = r7     // Catch:{ IOException -> 0x0111 }
            int r12 = r12.mo37987f()     // Catch:{ IOException -> 0x0111 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x0111 }
            r6[r11] = r12     // Catch:{ IOException -> 0x0111 }
            java.lang.String r12 = java.lang.String.format(r13, r4, r6)     // Catch:{ IOException -> 0x0111 }
            qe.d r12 = r3.mo36821w0(r12)     // Catch:{ IOException -> 0x0111 }
            r12.mo36821w0(r0)     // Catch:{ IOException -> 0x0111 }
            uc.e r12 = r10.mo37996a()     // Catch:{ IOException -> 0x0111 }
            int r12 = r12.mo37644b()     // Catch:{ IOException -> 0x0111 }
            r13 = 0
        L_0x0070:
            if (r13 >= r12) goto L_0x0096
            uc.e r4 = r10.mo37996a()     // Catch:{ IOException -> 0x0111 }
            java.lang.String r4 = r4.mo37643a(r13)     // Catch:{ IOException -> 0x0111 }
            qe.d r4 = r3.mo36821w0(r4)     // Catch:{ IOException -> 0x0111 }
            java.lang.String r6 = ": "
            qe.d r4 = r4.mo36821w0(r6)     // Catch:{ IOException -> 0x0111 }
            uc.e r6 = r10.mo37996a()     // Catch:{ IOException -> 0x0111 }
            java.lang.String r6 = r6.mo37645c(r13)     // Catch:{ IOException -> 0x0111 }
            qe.d r4 = r4.mo36821w0(r6)     // Catch:{ IOException -> 0x0111 }
            r4.mo36821w0(r0)     // Catch:{ IOException -> 0x0111 }
            int r13 = r13 + 1
            goto L_0x0070
        L_0x0096:
            r3.mo36821w0(r0)     // Catch:{ IOException -> 0x0111 }
            r3.flush()     // Catch:{ IOException -> 0x0111 }
            java.lang.String r10 = m60017g0(r2)     // Catch:{ IOException -> 0x0111 }
            uc.j r10 = p371uc.C12746j.m60426a(r10)     // Catch:{ IOException -> 0x0111 }
        L_0x00a4:
            java.lang.String r12 = m60017g0(r2)     // Catch:{ IOException -> 0x0111 }
            java.lang.String r13 = ""
            boolean r12 = r12.equals(r13)     // Catch:{ IOException -> 0x0111 }
            if (r12 != 0) goto L_0x00b1
            goto L_0x00a4
        L_0x00b1:
            int r12 = r10.f46688b     // Catch:{ IOException -> 0x0111 }
            r13 = 200(0xc8, float:2.8E-43)
            if (r12 < r13) goto L_0x00bf
            r13 = 300(0x12c, float:4.2E-43)
            if (r12 >= r13) goto L_0x00bf
            r1.setSoTimeout(r8)     // Catch:{ IOException -> 0x0111 }
            return r1
        L_0x00bf:
            qe.c r12 = new qe.c     // Catch:{ IOException -> 0x0111 }
            r12.<init>()     // Catch:{ IOException -> 0x0111 }
            r1.shutdownOutput()     // Catch:{ IOException -> 0x00cd }
            r3 = 1024(0x400, double:5.06E-321)
            r2.mo33810z(r12, r3)     // Catch:{ IOException -> 0x00cd }
            goto L_0x00e6
        L_0x00cd:
            r13 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0111 }
            r0.<init>()     // Catch:{ IOException -> 0x0111 }
            java.lang.String r2 = "Unable to read body: "
            r0.append(r2)     // Catch:{ IOException -> 0x0111 }
            java.lang.String r13 = r13.toString()     // Catch:{ IOException -> 0x0111 }
            r0.append(r13)     // Catch:{ IOException -> 0x0111 }
            java.lang.String r13 = r0.toString()     // Catch:{ IOException -> 0x0111 }
            r12.mo36821w0(r13)     // Catch:{ IOException -> 0x0111 }
        L_0x00e6:
            r1.close()     // Catch:{ IOException -> 0x00e9 }
        L_0x00e9:
            java.util.Locale r13 = java.util.Locale.US     // Catch:{ IOException -> 0x0111 }
            java.lang.String r0 = "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s"
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0111 }
            int r3 = r10.f46688b     // Catch:{ IOException -> 0x0111 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IOException -> 0x0111 }
            r2[r8] = r3     // Catch:{ IOException -> 0x0111 }
            java.lang.String r10 = r10.f46689c     // Catch:{ IOException -> 0x0111 }
            r2[r11] = r10     // Catch:{ IOException -> 0x0111 }
            java.lang.String r10 = r12.mo36766F()     // Catch:{ IOException -> 0x0111 }
            r2[r5] = r10     // Catch:{ IOException -> 0x0111 }
            java.lang.String r10 = java.lang.String.format(r13, r0, r2)     // Catch:{ IOException -> 0x0111 }
            rc.j1 r11 = p343rc.C12335j1.f45621u     // Catch:{ IOException -> 0x0111 }
            rc.j1 r10 = r11.mo37030q(r10)     // Catch:{ IOException -> 0x0111 }
            rc.k1 r10 = r10.mo37020c()     // Catch:{ IOException -> 0x0111 }
            throw r10     // Catch:{ IOException -> 0x0111 }
        L_0x0111:
            r10 = move-exception
            if (r1 == 0) goto L_0x0117
            p264io.grpc.internal.C11335r0.m55798e(r1)
        L_0x0117:
            rc.j1 r11 = p343rc.C12335j1.f45621u
            java.lang.String r12 = "Failed trying to connect with proxy"
            rc.j1 r11 = r11.mo37030q(r12)
            rc.j1 r10 = r11.mo37029p(r10)
            rc.k1 r10 = r10.mo37020c()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p361tc.C12615i.m60012S(java.net.InetSocketAddress, java.net.InetSocketAddress, java.lang.String, java.lang.String):java.net.Socket");
    }

    /* renamed from: Y */
    private Throwable m60013Y() {
        synchronized (this.f46309k) {
            C12335j1 j1Var = this.f46320v;
            if (j1Var != null) {
                C12345k1 c = j1Var.mo37020c();
                return c;
            }
            C12345k1 c2 = C12335j1.f45621u.mo37030q("Connection closed").mo37020c();
            return c2;
        }
    }

    /* renamed from: a0 */
    private void m60014a0() {
        synchronized (this.f46309k) {
            this.f46292P.mo35282g(new C12617b());
        }
    }

    /* renamed from: d0 */
    private void m60015d0(C12612h hVar) {
        if (this.f46324z && this.f46282F.isEmpty() && this.f46312n.isEmpty()) {
            this.f46324z = false;
            C11147c1 c1Var = this.f46284H;
            if (c1Var != null) {
                c1Var.mo35002o();
            }
        }
        if (hVar.mo34910x()) {
            this.f46293Q.mo35377e(hVar, false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public void m60016f0(C12870a aVar, String str) {
        m60023k0(0, aVar, m60032p0(aVar).mo37022e(str));
    }

    /* renamed from: g0 */
    private static String m60017g0(C12252t tVar) throws IOException {
        C12231c cVar = new C12231c();
        while (tVar.mo33810z(cVar, 1) != -1) {
            if (cVar.mo36806m(cVar.mo36771I() - 1) == 10) {
                return cVar.mo36781W0();
            }
        }
        throw new EOFException("\\n not found: " + cVar.mo36823x().mo36840q());
    }

    /* renamed from: i0 */
    private void m60019i0() {
        synchronized (this.f46309k) {
            this.f46307i.mo37446b0();
            C12886i iVar = new C12886i();
            C12628m.m60111c(iVar, 7, this.f46304f);
            this.f46307i.mo37445S0(iVar);
            int i = this.f46304f;
            if (i > 65535) {
                this.f46307i.mo37447c(0, (long) (i - 65535));
            }
        }
    }

    /* renamed from: j0 */
    private void m60021j0(C12612h hVar) {
        if (!this.f46324z) {
            this.f46324z = true;
            C11147c1 c1Var = this.f46284H;
            if (c1Var != null) {
                c1Var.mo35001n();
            }
        }
        if (hVar.mo34910x()) {
            this.f46293Q.mo35377e(hVar, true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m60023k0(int i, C12870a aVar, C12335j1 j1Var) {
        synchronized (this.f46309k) {
            if (this.f46320v == null) {
                this.f46320v = j1Var;
                this.f46306h.mo35114d(j1Var);
            }
            if (aVar != null && !this.f46321w) {
                this.f46321w = true;
                this.f46307i.mo37444O0(0, aVar, new byte[0]);
            }
            Iterator<Map.Entry<Integer, C12612h>> it = this.f46312n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (((Integer) next.getKey()).intValue() > i) {
                    it.remove();
                    ((C12612h) next.getValue()).mo34911y().mo34927M(j1Var, C11333r.C11334a.REFUSED, false, new C12411y0());
                    m60015d0((C12612h) next.getValue());
                }
            }
            for (C12612h next2 : this.f46282F) {
                next2.mo34911y().mo34927M(j1Var, C11333r.C11334a.MISCARRIED, true, new C12411y0());
                m60015d0(next2);
            }
            this.f46282F.clear();
            m60029n0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public boolean m60025l0() {
        boolean z = false;
        while (!this.f46282F.isEmpty() && this.f46312n.size() < this.f46281E) {
            m60027m0(this.f46282F.poll());
            z = true;
        }
        return z;
    }

    /* renamed from: m0 */
    private void m60027m0(C12612h hVar) {
        C6431n.m37568u(hVar.mo34911y().mo37471c0() == -1, "StreamId already assigned");
        this.f46312n.put(Integer.valueOf(this.f46311m), hVar);
        m60021j0(hVar);
        hVar.mo34911y().mo37472f0(this.f46311m);
        if (!(hVar.mo37466L() == C12423z0.C12427d.UNARY || hVar.mo37466L() == C12423z0.C12427d.SERVER_STREAMING) || hVar.mo37468N()) {
            this.f46307i.flush();
        }
        int i = this.f46311m;
        if (i >= 2147483645) {
            this.f46311m = Integer.MAX_VALUE;
            m60023k0(Integer.MAX_VALUE, C12870a.NO_ERROR, C12335j1.f45621u.mo37030q("Stream ids exhausted"));
            return;
        }
        this.f46311m = i + 2;
    }

    /* renamed from: n0 */
    private void m60029n0() {
        if (this.f46320v != null && this.f46312n.isEmpty() && this.f46282F.isEmpty() && !this.f46323y) {
            this.f46323y = true;
            C11147c1 c1Var = this.f46284H;
            if (c1Var != null) {
                c1Var.mo35004q();
            }
            C11377v0 v0Var = this.f46322x;
            if (v0Var != null) {
                v0Var.mo35367f(m60013Y());
                this.f46322x = null;
            }
            if (!this.f46321w) {
                this.f46321w = true;
                this.f46307i.mo37444O0(0, C12870a.NO_ERROR, new byte[0]);
            }
            this.f46307i.close();
        }
    }

    /* renamed from: p0 */
    static C12335j1 m60032p0(C12870a aVar) {
        C12335j1 j1Var = f46275W.get(aVar);
        if (j1Var != null) {
            return j1Var;
        }
        C12335j1 j1Var2 = C12335j1.f45608h;
        return j1Var2.mo37030q("Unknown http2 error code: " + aVar.f47001a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo37476T(boolean z, long j, long j2, boolean z2) {
        this.f46285I = z;
        this.f46286J = j;
        this.f46287K = j2;
        this.f46288L = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public void mo37477U(int i, C12335j1 j1Var, C11333r.C11334a aVar, boolean z, C12870a aVar2, C12411y0 y0Var) {
        synchronized (this.f46309k) {
            C12612h remove = this.f46312n.remove(Integer.valueOf(i));
            if (remove != null) {
                if (aVar2 != null) {
                    this.f46307i.mo37441r(i, C12870a.CANCEL);
                }
                if (j1Var != null) {
                    C12612h.C12614b M = remove.mo34911y();
                    if (y0Var == null) {
                        y0Var = new C12411y0();
                    }
                    M.mo34927M(j1Var, aVar, z, y0Var);
                }
                if (!m60025l0()) {
                    m60029n0();
                    m60015d0(remove);
                }
            }
        }
    }

    /* renamed from: V */
    public C12271a mo37478V() {
        return this.f46319u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public String mo37479W() {
        URI b = C11335r0.m55795b(this.f46300b);
        if (b.getHost() != null) {
            return b.getHost();
        }
        return this.f46300b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public int mo37480X() {
        URI b = C11335r0.m55795b(this.f46300b);
        if (b.getPort() != -1) {
            return b.getPort();
        }
        return this.f46299a.getPort();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public C12612h mo37481Z(int i) {
        C12612h hVar;
        synchronized (this.f46309k) {
            hVar = this.f46312n.get(Integer.valueOf(i));
        }
        return hVar;
    }

    /* renamed from: a */
    public C12632q.C12635c[] mo37482a() {
        C12632q.C12635c[] cVarArr;
        synchronized (this.f46309k) {
            cVarArr = new C12632q.C12635c[this.f46312n.size()];
            int i = 0;
            for (C12612h M : this.f46312n.values()) {
                cVarArr[i] = M.mo34911y().mo37470b0();
                i++;
            }
        }
        return cVarArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public boolean mo37483b0() {
        return this.f46278B == null;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public Runnable mo34933c(C11272k1.C11273a aVar) {
        this.f46306h = (C11272k1.C11273a) C6431n.m37562o(aVar, "listener");
        if (this.f46285I) {
            C11147c1 c1Var = new C11147c1(new C11147c1.C11150c(this), this.f46315q, this.f46286J, this.f46287K, this.f46288L);
            this.f46284H = c1Var;
            c1Var.mo35003p();
        }
        C12592a D = C12592a.m59885D(this.f46314p, this, 10000);
        C12873c x = D.mo37436x(this.f46305g.mo37899a(C12241l.m58806a(D), true));
        synchronized (this.f46309k) {
            C12598b bVar = new C12598b(this, x);
            this.f46307i = bVar;
            this.f46308j = new C12632q(this, bVar);
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f46314p.execute(new C12618c(countDownLatch, D));
        try {
            m60019i0();
            countDownLatch.countDown();
            this.f46314p.execute(new C12620d());
            return null;
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public boolean mo37484c0(int i) {
        boolean z;
        synchronized (this.f46309k) {
            z = true;
            if (i >= this.f46311m || (i & 1) != 1) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: d */
    public void mo34934d(C12335j1 j1Var) {
        mo34936g(j1Var);
        synchronized (this.f46309k) {
            Iterator<Map.Entry<Integer, C12612h>> it = this.f46312n.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                it.remove();
                ((C12612h) next.getValue()).mo34911y().mo34928N(j1Var, false, new C12411y0());
                m60015d0((C12612h) next.getValue());
            }
            for (C12612h next2 : this.f46282F) {
                next2.mo34911y().mo34927M(j1Var, C11333r.C11334a.MISCARRIED, true, new C12411y0());
                m60015d0(next2);
            }
            this.f46282F.clear();
            m60029n0();
        }
    }

    /* renamed from: e */
    public void mo37452e(Throwable th) {
        C6431n.m37562o(th, "failureCause");
        m60023k0(0, C12870a.INTERNAL_ERROR, C12335j1.f45621u.mo37029p(th));
    }

    /* renamed from: e0 */
    public C12612h mo34932b(C12423z0<?, ?> z0Var, C12411y0 y0Var, C12292c cVar, C12340k[] kVarArr) {
        Object obj;
        C12411y0 y0Var2 = y0Var;
        C6431n.m37562o(z0Var, "method");
        C6431n.m37562o(y0Var2, "headers");
        C11255i2 h = C11255i2.m55512h(kVarArr, mo37478V(), y0Var2);
        Object obj2 = this.f46309k;
        synchronized (obj2) {
            try {
                obj = obj2;
                C12612h hVar = new C12612h(z0Var, y0Var, this.f46307i, this, this.f46308j, this.f46309k, this.f46316r, this.f46304f, this.f46300b, this.f46301c, h, this.f46292P, cVar, this.f46291O);
                return hVar;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
    }

    /* renamed from: f */
    public C12334j0 mo34935f() {
        return this.f46310l;
    }

    /* renamed from: g */
    public void mo34936g(C12335j1 j1Var) {
        synchronized (this.f46309k) {
            if (this.f46320v == null) {
                this.f46320v = j1Var;
                this.f46306h.mo35114d(j1Var);
                m60029n0();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r1.mo35365a(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35231h(p264io.grpc.internal.C11351s.C11352a r9, java.util.concurrent.Executor r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f46309k
            monitor-enter(r0)
            tc.b r1 = r8.f46307i     // Catch:{ all -> 0x0054 }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000b
            r1 = 1
            goto L_0x000c
        L_0x000b:
            r1 = 0
        L_0x000c:
            p182a7.C6431n.m37567t(r1)     // Catch:{ all -> 0x0054 }
            boolean r1 = r8.f46323y     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x001c
            java.lang.Throwable r1 = r8.m60013Y()     // Catch:{ all -> 0x0054 }
            p264io.grpc.internal.C11377v0.m55948g(r9, r10, r1)     // Catch:{ all -> 0x0054 }
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            return
        L_0x001c:
            io.grpc.internal.v0 r1 = r8.f46322x     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0024
            r4 = 0
            r2 = 0
            goto L_0x0042
        L_0x0024:
            java.util.Random r1 = r8.f46302d     // Catch:{ all -> 0x0054 }
            long r4 = r1.nextLong()     // Catch:{ all -> 0x0054 }
            a7.t<a7.r> r1 = r8.f46303e     // Catch:{ all -> 0x0054 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0054 }
            a7.r r1 = (p182a7.C6441r) r1     // Catch:{ all -> 0x0054 }
            r1.mo21860g()     // Catch:{ all -> 0x0054 }
            io.grpc.internal.v0 r6 = new io.grpc.internal.v0     // Catch:{ all -> 0x0054 }
            r6.<init>(r4, r1)     // Catch:{ all -> 0x0054 }
            r8.f46322x = r6     // Catch:{ all -> 0x0054 }
            io.grpc.internal.o2 r1 = r8.f46292P     // Catch:{ all -> 0x0054 }
            r1.mo35277b()     // Catch:{ all -> 0x0054 }
            r1 = r6
        L_0x0042:
            if (r2 == 0) goto L_0x004f
            tc.b r2 = r8.f46307i     // Catch:{ all -> 0x0054 }
            r6 = 32
            long r6 = r4 >>> r6
            int r7 = (int) r6     // Catch:{ all -> 0x0054 }
            int r5 = (int) r4     // Catch:{ all -> 0x0054 }
            r2.mo37440i(r3, r7, r5)     // Catch:{ all -> 0x0054 }
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            r1.mo35365a(r9, r10)
            return
        L_0x0054:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0054 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p361tc.C12615i.mo35231h(io.grpc.internal.s$a, java.util.concurrent.Executor):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h0 */
    public void mo37486h0(C12612h hVar) {
        this.f46282F.remove(hVar);
        m60015d0(hVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o0 */
    public void mo37487o0(C12612h hVar) {
        if (this.f46320v != null) {
            hVar.mo34911y().mo34927M(this.f46320v, C11333r.C11334a.MISCARRIED, true, new C12411y0());
        } else if (this.f46312n.size() >= this.f46281E) {
            this.f46282F.add(hVar);
            m60021j0(hVar);
        } else {
            m60027m0(hVar);
        }
    }

    public String toString() {
        return C6419h.m37528c(this).mo21841c("logId", this.f46310l.mo37017d()).mo21842d("address", this.f46299a).toString();
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, a7.t<a7.r>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C12615i(p361tc.C12603f.C12609f r2, java.net.InetSocketAddress r3, java.lang.String r4, java.lang.String r5, p343rc.C12271a r6, p182a7.C6444t<p182a7.C6441r> r7, p381vc.C12887j r8, p343rc.C12294c0 r9, java.lang.Runnable r10) {
        /*
            r1 = this;
            r1.<init>()
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1.f46302d = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f46309k = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f46312n = r0
            r0 = 0
            r1.f46281E = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.f46282F = r0
            tc.i$a r0 = new tc.i$a
            r0.<init>()
            r1.f46293Q = r0
            r0 = 30000(0x7530, float:4.2039E-41)
            r1.f46296T = r0
            java.lang.String r0 = "address"
            java.lang.Object r0 = p182a7.C6431n.m37562o(r3, r0)
            java.net.InetSocketAddress r0 = (java.net.InetSocketAddress) r0
            r1.f46299a = r0
            r1.f46300b = r4
            int r4 = r2.f46237r
            r1.f46316r = r4
            int r4 = r2.f46242w
            r1.f46304f = r4
            java.util.concurrent.Executor r4 = r2.f46229b
            java.lang.String r0 = "executor"
            java.lang.Object r4 = p182a7.C6431n.m37562o(r4, r0)
            java.util.concurrent.Executor r4 = (java.util.concurrent.Executor) r4
            r1.f46313o = r4
            io.grpc.internal.d2 r4 = new io.grpc.internal.d2
            java.util.concurrent.Executor r0 = r2.f46229b
            r4.<init>(r0)
            r1.f46314p = r4
            java.util.concurrent.ScheduledExecutorService r4 = r2.f46231d
            java.lang.String r0 = "scheduledExecutorService"
            java.lang.Object r4 = p182a7.C6431n.m37562o(r4, r0)
            java.util.concurrent.ScheduledExecutorService r4 = (java.util.concurrent.ScheduledExecutorService) r4
            r1.f46315q = r4
            r4 = 3
            r1.f46311m = r4
            javax.net.SocketFactory r4 = r2.f46233f
            if (r4 != 0) goto L_0x006d
            javax.net.SocketFactory r4 = javax.net.SocketFactory.getDefault()
        L_0x006d:
            r1.f46277A = r4
            javax.net.ssl.SSLSocketFactory r4 = r2.f46234g
            r1.f46278B = r4
            javax.net.ssl.HostnameVerifier r4 = r2.f46235h
            r1.f46279C = r4
            uc.b r4 = r2.f46236i
            java.lang.String r0 = "connectionSpec"
            java.lang.Object r4 = p182a7.C6431n.m37562o(r4, r0)
            uc.b r4 = (p371uc.C12726b) r4
            r1.f46283G = r4
            java.lang.String r4 = "stopwatchFactory"
            java.lang.Object r4 = p182a7.C6431n.m37562o(r7, r4)
            a7.t r4 = (p182a7.C6444t) r4
            r1.f46303e = r4
            java.lang.String r4 = "variant"
            java.lang.Object r4 = p182a7.C6431n.m37562o(r8, r4)
            vc.j r4 = (p381vc.C12887j) r4
            r1.f46305g = r4
            java.lang.String r4 = "okhttp"
            java.lang.String r4 = p264io.grpc.internal.C11335r0.m55800g(r4, r5)
            r1.f46301c = r4
            r1.f46295S = r9
            java.lang.String r4 = "tooManyPingsRunnable"
            java.lang.Object r4 = p182a7.C6431n.m37562o(r10, r4)
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r1.f46289M = r4
            int r4 = r2.f46244y
            r1.f46290N = r4
            io.grpc.internal.o2$b r4 = r2.f46232e
            io.grpc.internal.o2 r4 = r4.mo35283a()
            r1.f46292P = r4
            java.lang.Class r4 = r1.getClass()
            java.lang.String r3 = r3.toString()
            rc.j0 r3 = p343rc.C12334j0.m59092a(r4, r3)
            r1.f46310l = r3
            rc.a$b r3 = p343rc.C12271a.m58932c()
            rc.a$c<rc.a> r4 = p264io.grpc.internal.C11330q0.f43510b
            rc.a$b r3 = r3.mo36922d(r4, r6)
            rc.a r3 = r3.mo36920a()
            r1.f46319u = r3
            boolean r2 = r2.f46245z
            r1.f46291O = r2
            r1.m60014a0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p361tc.C12615i.<init>(tc.f$f, java.net.InetSocketAddress, java.lang.String, java.lang.String, rc.a, a7.t, vc.j, rc.c0, java.lang.Runnable):void");
    }
}
