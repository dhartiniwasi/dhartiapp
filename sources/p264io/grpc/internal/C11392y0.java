package p264io.grpc.internal;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p182a7.C6419h;
import p182a7.C6431n;
import p182a7.C6441r;
import p182a7.C6444t;
import p264io.grpc.internal.C11269k;
import p264io.grpc.internal.C11272k1;
import p264io.grpc.internal.C11333r;
import p264io.grpc.internal.C11358t;
import p343rc.C12271a;
import p343rc.C12292c;
import p343rc.C12294c0;
import p343rc.C12302d0;
import p343rc.C12312f;
import p343rc.C12327i0;
import p343rc.C12334j0;
import p343rc.C12335j1;
import p343rc.C12340k;
import p343rc.C12359n1;
import p343rc.C12367p;
import p343rc.C12370q;
import p343rc.C12406x;
import p343rc.C12411y0;
import p343rc.C12423z0;

/* renamed from: io.grpc.internal.y0 */
/* compiled from: InternalSubchannel */
final class C11392y0 implements C12327i0<Object>, C11304n2 {

    /* renamed from: a */
    private final C12334j0 f43671a;

    /* renamed from: b */
    private final String f43672b;

    /* renamed from: c */
    private final String f43673c;

    /* renamed from: d */
    private final C11269k.C11270a f43674d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C11405j f43675e;

    /* renamed from: f */
    private final C11358t f43676f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ScheduledExecutorService f43677g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C12302d0 f43678h;

    /* renamed from: i */
    private final C11289m f43679i;

    /* renamed from: j */
    private final C11305o f43680j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C12312f f43681k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C12359n1 f43682l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C11406k f43683m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public volatile List<C12406x> f43684n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C11269k f43685o;

    /* renamed from: p */
    private final C6441r f43686p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C12359n1.C12363d f43687q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C12359n1.C12363d f43688r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C11272k1 f43689s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final Collection<C11376v> f43690t = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C11383w0<C11376v> f43691u = new C11393a();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C11376v f43692v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public volatile C11272k1 f43693w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public volatile C12370q f43694x = C12370q.m59185a(C12367p.IDLE);
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C12335j1 f43695y;

    /* renamed from: io.grpc.internal.y0$a */
    /* compiled from: InternalSubchannel */
    class C11393a extends C11383w0<C11376v> {
        C11393a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo35118b() {
            C11392y0.this.f43675e.mo35171a(C11392y0.this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo35119c() {
            C11392y0.this.f43675e.mo35172b(C11392y0.this);
        }
    }

    /* renamed from: io.grpc.internal.y0$b */
    /* compiled from: InternalSubchannel */
    class C11394b implements Runnable {
        C11394b() {
        }

        public void run() {
            C12359n1.C12363d unused = C11392y0.this.f43687q = null;
            C11392y0.this.f43681k.mo35255a(C12312f.C12313a.INFO, "CONNECTING after backoff");
            C11392y0.this.m56003N(C12367p.CONNECTING);
            C11392y0.this.m56009T();
        }
    }

    /* renamed from: io.grpc.internal.y0$c */
    /* compiled from: InternalSubchannel */
    class C11395c implements Runnable {
        C11395c() {
        }

        public void run() {
            if (C11392y0.this.f43694x.mo37080c() == C12367p.IDLE) {
                C11392y0.this.f43681k.mo35255a(C12312f.C12313a.INFO, "CONNECTING as requested");
                C11392y0.this.m56003N(C12367p.CONNECTING);
                C11392y0.this.m56009T();
            }
        }
    }

    /* renamed from: io.grpc.internal.y0$d */
    /* compiled from: InternalSubchannel */
    class C11396d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ List f43699a;

        /* renamed from: io.grpc.internal.y0$d$a */
        /* compiled from: InternalSubchannel */
        class C11397a implements Runnable {
            C11397a() {
            }

            public void run() {
                C11272k1 p = C11392y0.this.f43689s;
                C12359n1.C12363d unused = C11392y0.this.f43688r = null;
                C11272k1 unused2 = C11392y0.this.f43689s = null;
                p.mo34936g(C12335j1.f45621u.mo37030q("InternalSubchannel closed transport due to address change"));
            }
        }

        C11396d(List list) {
            this.f43699a = list;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r7 = this;
                io.grpc.internal.y0 r0 = p264io.grpc.internal.C11392y0.this
                io.grpc.internal.y0$k r0 = r0.f43683m
                java.net.SocketAddress r0 = r0.mo35404a()
                io.grpc.internal.y0 r1 = p264io.grpc.internal.C11392y0.this
                io.grpc.internal.y0$k r1 = r1.f43683m
                java.util.List r2 = r7.f43699a
                r1.mo35411h(r2)
                io.grpc.internal.y0 r1 = p264io.grpc.internal.C11392y0.this
                java.util.List r2 = r7.f43699a
                java.util.List unused = r1.f43684n = r2
                io.grpc.internal.y0 r1 = p264io.grpc.internal.C11392y0.this
                rc.q r1 = r1.f43694x
                rc.p r1 = r1.mo37080c()
                rc.p r2 = p343rc.C12367p.READY
                r3 = 0
                if (r1 == r2) goto L_0x0039
                io.grpc.internal.y0 r1 = p264io.grpc.internal.C11392y0.this
                rc.q r1 = r1.f43694x
                rc.p r1 = r1.mo37080c()
                rc.p r4 = p343rc.C12367p.CONNECTING
                if (r1 != r4) goto L_0x0091
            L_0x0039:
                io.grpc.internal.y0 r1 = p264io.grpc.internal.C11392y0.this
                io.grpc.internal.y0$k r1 = r1.f43683m
                boolean r0 = r1.mo35410g(r0)
                if (r0 != 0) goto L_0x0091
                io.grpc.internal.y0 r0 = p264io.grpc.internal.C11392y0.this
                rc.q r0 = r0.f43694x
                rc.p r0 = r0.mo37080c()
                if (r0 != r2) goto L_0x006d
                io.grpc.internal.y0 r0 = p264io.grpc.internal.C11392y0.this
                io.grpc.internal.k1 r0 = r0.f43693w
                io.grpc.internal.y0 r1 = p264io.grpc.internal.C11392y0.this
                p264io.grpc.internal.C11272k1 unused = r1.f43693w = r3
                io.grpc.internal.y0 r1 = p264io.grpc.internal.C11392y0.this
                io.grpc.internal.y0$k r1 = r1.f43683m
                r1.mo35409f()
                io.grpc.internal.y0 r1 = p264io.grpc.internal.C11392y0.this
                rc.p r2 = p343rc.C12367p.IDLE
                r1.m56003N(r2)
                goto L_0x0092
            L_0x006d:
                io.grpc.internal.y0 r0 = p264io.grpc.internal.C11392y0.this
                io.grpc.internal.v r0 = r0.f43692v
                rc.j1 r1 = p343rc.C12335j1.f45621u
                java.lang.String r2 = "InternalSubchannel closed pending transport due to address change"
                rc.j1 r1 = r1.mo37030q(r2)
                r0.mo34936g(r1)
                io.grpc.internal.y0 r0 = p264io.grpc.internal.C11392y0.this
                p264io.grpc.internal.C11376v unused = r0.f43692v = r3
                io.grpc.internal.y0 r0 = p264io.grpc.internal.C11392y0.this
                io.grpc.internal.y0$k r0 = r0.f43683m
                r0.mo35409f()
                io.grpc.internal.y0 r0 = p264io.grpc.internal.C11392y0.this
                r0.m56009T()
            L_0x0091:
                r0 = r3
            L_0x0092:
                if (r0 == 0) goto L_0x00e1
                io.grpc.internal.y0 r1 = p264io.grpc.internal.C11392y0.this
                rc.n1$d r1 = r1.f43688r
                if (r1 == 0) goto L_0x00c0
                io.grpc.internal.y0 r1 = p264io.grpc.internal.C11392y0.this
                io.grpc.internal.k1 r1 = r1.f43689s
                rc.j1 r2 = p343rc.C12335j1.f45621u
                java.lang.String r4 = "InternalSubchannel closed transport early due to address change"
                rc.j1 r2 = r2.mo37030q(r4)
                r1.mo34936g(r2)
                io.grpc.internal.y0 r1 = p264io.grpc.internal.C11392y0.this
                rc.n1$d r1 = r1.f43688r
                r1.mo37074a()
                io.grpc.internal.y0 r1 = p264io.grpc.internal.C11392y0.this
                p343rc.C12359n1.C12363d unused = r1.f43688r = r3
                io.grpc.internal.y0 r1 = p264io.grpc.internal.C11392y0.this
                p264io.grpc.internal.C11272k1 unused = r1.f43689s = r3
            L_0x00c0:
                io.grpc.internal.y0 r1 = p264io.grpc.internal.C11392y0.this
                p264io.grpc.internal.C11272k1 unused = r1.f43689s = r0
                io.grpc.internal.y0 r0 = p264io.grpc.internal.C11392y0.this
                rc.n1 r1 = r0.f43682l
                io.grpc.internal.y0$d$a r2 = new io.grpc.internal.y0$d$a
                r2.<init>()
                r3 = 5
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
                io.grpc.internal.y0 r6 = p264io.grpc.internal.C11392y0.this
                java.util.concurrent.ScheduledExecutorService r6 = r6.f43677g
                rc.n1$d r1 = r1.mo37065d(r2, r3, r5, r6)
                p343rc.C12359n1.C12363d unused = r0.f43688r = r1
            L_0x00e1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11392y0.C11396d.run():void");
        }
    }

    /* renamed from: io.grpc.internal.y0$e */
    /* compiled from: InternalSubchannel */
    class C11398e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12335j1 f43702a;

        C11398e(C12335j1 j1Var) {
            this.f43702a = j1Var;
        }

        public void run() {
            C12367p c = C11392y0.this.f43694x.mo37080c();
            C12367p pVar = C12367p.SHUTDOWN;
            if (c != pVar) {
                C12335j1 unused = C11392y0.this.f43695y = this.f43702a;
                C11272k1 j = C11392y0.this.f43693w;
                C11376v l = C11392y0.this.f43692v;
                C11272k1 unused2 = C11392y0.this.f43693w = null;
                C11376v unused3 = C11392y0.this.f43692v = null;
                C11392y0.this.m56003N(pVar);
                C11392y0.this.f43683m.mo35409f();
                if (C11392y0.this.f43690t.isEmpty()) {
                    C11392y0.this.m56005P();
                }
                C11392y0.this.m56001K();
                if (C11392y0.this.f43688r != null) {
                    C11392y0.this.f43688r.mo37074a();
                    C11392y0.this.f43689s.mo34936g(this.f43702a);
                    C12359n1.C12363d unused4 = C11392y0.this.f43688r = null;
                    C11272k1 unused5 = C11392y0.this.f43689s = null;
                }
                if (j != null) {
                    j.mo34936g(this.f43702a);
                }
                if (l != null) {
                    l.mo34936g(this.f43702a);
                }
            }
        }
    }

    /* renamed from: io.grpc.internal.y0$f */
    /* compiled from: InternalSubchannel */
    class C11399f implements Runnable {
        C11399f() {
        }

        public void run() {
            C11392y0.this.f43681k.mo35255a(C12312f.C12313a.INFO, "Terminated");
            C11392y0.this.f43675e.mo35174d(C11392y0.this);
        }
    }

    /* renamed from: io.grpc.internal.y0$g */
    /* compiled from: InternalSubchannel */
    class C11400g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11376v f43705a;

        /* renamed from: b */
        final /* synthetic */ boolean f43706b;

        C11400g(C11376v vVar, boolean z) {
            this.f43705a = vVar;
            this.f43706b = z;
        }

        public void run() {
            C11392y0.this.f43691u.mo35377e(this.f43705a, this.f43706b);
        }
    }

    /* renamed from: io.grpc.internal.y0$h */
    /* compiled from: InternalSubchannel */
    class C11401h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C12335j1 f43708a;

        C11401h(C12335j1 j1Var) {
            this.f43708a = j1Var;
        }

        public void run() {
            for (C11272k1 d : new ArrayList(C11392y0.this.f43690t)) {
                d.mo34934d(this.f43708a);
            }
        }
    }

    /* renamed from: io.grpc.internal.y0$i */
    /* compiled from: InternalSubchannel */
    static final class C11402i extends C11271k0 {

        /* renamed from: a */
        private final C11376v f43710a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C11289m f43711b;

        /* renamed from: io.grpc.internal.y0$i$a */
        /* compiled from: InternalSubchannel */
        class C11403a extends C11252i0 {

            /* renamed from: a */
            final /* synthetic */ C11329q f43712a;

            /* renamed from: io.grpc.internal.y0$i$a$a */
            /* compiled from: InternalSubchannel */
            class C11404a extends C11263j0 {

                /* renamed from: a */
                final /* synthetic */ C11333r f43714a;

                C11404a(C11333r rVar) {
                    this.f43714a = rVar;
                }

                /* renamed from: d */
                public void mo34975d(C12335j1 j1Var, C11333r.C11334a aVar, C12411y0 y0Var) {
                    C11402i.this.f43711b.mo35247a(j1Var.mo37028o());
                    super.mo34975d(j1Var, aVar, y0Var);
                }

                /* access modifiers changed from: protected */
                /* renamed from: e */
                public C11333r mo35217e() {
                    return this.f43714a;
                }
            }

            C11403a(C11329q qVar) {
                this.f43712a = qVar;
            }

            /* renamed from: k */
            public void mo34902k(C11333r rVar) {
                C11402i.this.f43711b.mo35248b();
                super.mo34902k(new C11404a(rVar));
            }

            /* access modifiers changed from: protected */
            /* renamed from: o */
            public C11329q mo35190o() {
                return this.f43712a;
            }
        }

        /* synthetic */ C11402i(C11376v vVar, C11289m mVar, C11393a aVar) {
            this(vVar, mVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C11376v mo35230a() {
            return this.f43710a;
        }

        /* renamed from: b */
        public C11329q mo34932b(C12423z0<?, ?> z0Var, C12411y0 y0Var, C12292c cVar, C12340k[] kVarArr) {
            return new C11403a(super.mo34932b(z0Var, y0Var, cVar, kVarArr));
        }

        private C11402i(C11376v vVar, C11289m mVar) {
            this.f43710a = vVar;
            this.f43711b = mVar;
        }
    }

    /* renamed from: io.grpc.internal.y0$j */
    /* compiled from: InternalSubchannel */
    static abstract class C11405j {
        C11405j() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo35171a(C11392y0 y0Var);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract void mo35172b(C11392y0 y0Var);

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract void mo35173c(C11392y0 y0Var, C12370q qVar);

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract void mo35174d(C11392y0 y0Var);
    }

    /* renamed from: io.grpc.internal.y0$k */
    /* compiled from: InternalSubchannel */
    static final class C11406k {

        /* renamed from: a */
        private List<C12406x> f43716a;

        /* renamed from: b */
        private int f43717b;

        /* renamed from: c */
        private int f43718c;

        public C11406k(List<C12406x> list) {
            this.f43716a = list;
        }

        /* renamed from: a */
        public SocketAddress mo35404a() {
            return this.f43716a.get(this.f43717b).mo37149a().get(this.f43718c);
        }

        /* renamed from: b */
        public C12271a mo35405b() {
            return this.f43716a.get(this.f43717b).mo37150b();
        }

        /* renamed from: c */
        public void mo35406c() {
            int i = this.f43718c + 1;
            this.f43718c = i;
            if (i >= this.f43716a.get(this.f43717b).mo37149a().size()) {
                this.f43717b++;
                this.f43718c = 0;
            }
        }

        /* renamed from: d */
        public boolean mo35407d() {
            return this.f43717b == 0 && this.f43718c == 0;
        }

        /* renamed from: e */
        public boolean mo35408e() {
            return this.f43717b < this.f43716a.size();
        }

        /* renamed from: f */
        public void mo35409f() {
            this.f43717b = 0;
            this.f43718c = 0;
        }

        /* renamed from: g */
        public boolean mo35410g(SocketAddress socketAddress) {
            int i = 0;
            while (i < this.f43716a.size()) {
                int indexOf = this.f43716a.get(i).mo37149a().indexOf(socketAddress);
                if (indexOf == -1) {
                    i++;
                } else {
                    this.f43717b = i;
                    this.f43718c = indexOf;
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        public void mo35411h(List<C12406x> list) {
            this.f43716a = list;
            mo35409f();
        }
    }

    /* renamed from: io.grpc.internal.y0$l */
    /* compiled from: InternalSubchannel */
    private class C11407l implements C11272k1.C11273a {

        /* renamed from: a */
        final C11376v f43719a;

        /* renamed from: b */
        final SocketAddress f43720b;

        /* renamed from: c */
        boolean f43721c = false;

        /* renamed from: io.grpc.internal.y0$l$a */
        /* compiled from: InternalSubchannel */
        class C11408a implements Runnable {
            C11408a() {
            }

            public void run() {
                C11269k unused = C11392y0.this.f43685o = null;
                if (C11392y0.this.f43695y != null) {
                    C6431n.m37568u(C11392y0.this.f43693w == null, "Unexpected non-null activeTransport");
                    C11407l lVar = C11407l.this;
                    lVar.f43719a.mo34936g(C11392y0.this.f43695y);
                    return;
                }
                C11376v l = C11392y0.this.f43692v;
                C11407l lVar2 = C11407l.this;
                C11376v vVar = lVar2.f43719a;
                if (l == vVar) {
                    C11272k1 unused2 = C11392y0.this.f43693w = vVar;
                    C11376v unused3 = C11392y0.this.f43692v = null;
                    C11392y0.this.m56003N(C12367p.READY);
                }
            }
        }

        /* renamed from: io.grpc.internal.y0$l$b */
        /* compiled from: InternalSubchannel */
        class C11409b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12335j1 f43724a;

            C11409b(C12335j1 j1Var) {
                this.f43724a = j1Var;
            }

            public void run() {
                if (C11392y0.this.f43694x.mo37080c() != C12367p.SHUTDOWN) {
                    C11272k1 j = C11392y0.this.f43693w;
                    C11407l lVar = C11407l.this;
                    if (j == lVar.f43719a) {
                        C11272k1 unused = C11392y0.this.f43693w = null;
                        C11392y0.this.f43683m.mo35409f();
                        C11392y0.this.m56003N(C12367p.IDLE);
                        return;
                    }
                    C11376v l = C11392y0.this.f43692v;
                    C11407l lVar2 = C11407l.this;
                    if (l == lVar2.f43719a) {
                        C6431n.m37570w(C11392y0.this.f43694x.mo37080c() == C12367p.CONNECTING, "Expected state is CONNECTING, actual state is %s", C11392y0.this.f43694x.mo37080c());
                        C11392y0.this.f43683m.mo35406c();
                        if (!C11392y0.this.f43683m.mo35408e()) {
                            C11376v unused2 = C11392y0.this.f43692v = null;
                            C11392y0.this.f43683m.mo35409f();
                            C11392y0.this.m56008S(this.f43724a);
                            return;
                        }
                        C11392y0.this.m56009T();
                    }
                }
            }
        }

        /* renamed from: io.grpc.internal.y0$l$c */
        /* compiled from: InternalSubchannel */
        class C11410c implements Runnable {
            C11410c() {
            }

            public void run() {
                C11392y0.this.f43690t.remove(C11407l.this.f43719a);
                if (C11392y0.this.f43694x.mo37080c() == C12367p.SHUTDOWN && C11392y0.this.f43690t.isEmpty()) {
                    C11392y0.this.m56005P();
                }
            }
        }

        C11407l(C11376v vVar, SocketAddress socketAddress) {
            this.f43719a = vVar;
            this.f43720b = socketAddress;
        }

        /* renamed from: a */
        public void mo35111a() {
            C11392y0.this.f43681k.mo35255a(C12312f.C12313a.INFO, "READY");
            C11392y0.this.f43682l.execute(new C11408a());
        }

        /* renamed from: b */
        public void mo35112b() {
            C6431n.m37568u(this.f43721c, "transportShutdown() must be called before transportTerminated().");
            C11392y0.this.f43681k.mo35256b(C12312f.C12313a.INFO, "{0} Terminated", this.f43719a.mo34935f());
            C11392y0.this.f43678h.mo36998i(this.f43719a);
            C11392y0.this.m56006Q(this.f43719a, false);
            C11392y0.this.f43682l.execute(new C11410c());
        }

        /* renamed from: c */
        public void mo35113c(boolean z) {
            C11392y0.this.m56006Q(this.f43719a, z);
        }

        /* renamed from: d */
        public void mo35114d(C12335j1 j1Var) {
            C11392y0.this.f43681k.mo35256b(C12312f.C12313a.INFO, "{0} SHUTDOWN with {1}", this.f43719a.mo34935f(), C11392y0.this.m56007R(j1Var));
            this.f43721c = true;
            C11392y0.this.f43682l.execute(new C11409b(j1Var));
        }
    }

    /* renamed from: io.grpc.internal.y0$m */
    /* compiled from: InternalSubchannel */
    static final class C11411m extends C12312f {

        /* renamed from: a */
        C12334j0 f43727a;

        C11411m() {
        }

        /* renamed from: a */
        public void mo35255a(C12312f.C12313a aVar, String str) {
            C11299n.m55659d(this.f43727a, aVar, str);
        }

        /* renamed from: b */
        public void mo35256b(C12312f.C12313a aVar, String str, Object... objArr) {
            C11299n.m55660e(this.f43727a, aVar, str, objArr);
        }
    }

    C11392y0(List<C12406x> list, String str, String str2, C11269k.C11270a aVar, C11358t tVar, ScheduledExecutorService scheduledExecutorService, C6444t<C6441r> tVar2, C12359n1 n1Var, C11405j jVar, C12302d0 d0Var, C11289m mVar, C11305o oVar, C12334j0 j0Var, C12312f fVar) {
        List<C12406x> list2 = list;
        C6431n.m37562o(list, "addressGroups");
        C6431n.m37552e(!list.isEmpty(), "addressGroups is empty");
        m56002L(list, "addressGroups contains null entry");
        List<C12406x> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f43684n = unmodifiableList;
        this.f43683m = new C11406k(unmodifiableList);
        this.f43672b = str;
        this.f43673c = str2;
        this.f43674d = aVar;
        this.f43676f = tVar;
        this.f43677g = scheduledExecutorService;
        this.f43686p = tVar2.get();
        this.f43682l = n1Var;
        this.f43675e = jVar;
        this.f43678h = d0Var;
        this.f43679i = mVar;
        this.f43680j = (C11305o) C6431n.m37562o(oVar, "channelTracer");
        this.f43671a = (C12334j0) C6431n.m37562o(j0Var, "logId");
        this.f43681k = (C12312f) C6431n.m37562o(fVar, "channelLogger");
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public void m56001K() {
        this.f43682l.mo37068f();
        C12359n1.C12363d dVar = this.f43687q;
        if (dVar != null) {
            dVar.mo37074a();
            this.f43687q = null;
            this.f43685o = null;
        }
    }

    /* renamed from: L */
    private static void m56002L(List<?> list, String str) {
        for (Object o : list) {
            C6431n.m37562o(o, str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public void m56003N(C12367p pVar) {
        this.f43682l.mo37068f();
        m56004O(C12370q.m59185a(pVar));
    }

    /* renamed from: O */
    private void m56004O(C12370q qVar) {
        this.f43682l.mo37068f();
        if (this.f43694x.mo37080c() != qVar.mo37080c()) {
            boolean z = this.f43694x.mo37080c() != C12367p.SHUTDOWN;
            C6431n.m37568u(z, "Cannot transition out of SHUTDOWN to " + qVar);
            this.f43694x = qVar;
            this.f43675e.mo35173c(this, qVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: P */
    public void m56005P() {
        this.f43682l.execute(new C11399f());
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public void m56006Q(C11376v vVar, boolean z) {
        this.f43682l.execute(new C11400g(vVar, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public String m56007R(C12335j1 j1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(j1Var.mo37026m());
        if (j1Var.mo37027n() != null) {
            sb.append("(");
            sb.append(j1Var.mo37027n());
            sb.append(")");
        }
        if (j1Var.mo37025l() != null) {
            sb.append("[");
            sb.append(j1Var.mo37025l());
            sb.append("]");
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public void m56008S(C12335j1 j1Var) {
        this.f43682l.mo37068f();
        m56004O(C12370q.m59186b(j1Var));
        if (this.f43685o == null) {
            this.f43685o = this.f43674d.get();
        }
        long a = this.f43685o.mo35037a();
        C6441r rVar = this.f43686p;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long d = a - rVar.mo21858d(timeUnit);
        boolean z = false;
        this.f43681k.mo35256b(C12312f.C12313a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", m56007R(j1Var), Long.valueOf(d));
        if (this.f43687q == null) {
            z = true;
        }
        C6431n.m37568u(z, "previous reconnectTask is not done");
        this.f43687q = this.f43682l.mo37065d(new C11394b(), d, timeUnit, this.f43677g);
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public void m56009T() {
        SocketAddress socketAddress;
        C12294c0 c0Var;
        this.f43682l.mo37068f();
        C6431n.m37568u(this.f43687q == null, "Should have no reconnectTask scheduled");
        if (this.f43683m.mo35407d()) {
            this.f43686p.mo21859f().mo21860g();
        }
        SocketAddress a = this.f43683m.mo35404a();
        if (a instanceof C12294c0) {
            c0Var = (C12294c0) a;
            socketAddress = c0Var.mo36979c();
        } else {
            socketAddress = a;
            c0Var = null;
        }
        C12271a b = this.f43683m.mo35405b();
        String str = (String) b.mo36915b(C12406x.f45750d);
        C11358t.C11359a aVar = new C11358t.C11359a();
        if (str == null) {
            str = this.f43672b;
        }
        C11358t.C11359a g = aVar.mo35335e(str).mo35337f(b).mo35339h(this.f43673c).mo35338g(c0Var);
        C11411m mVar = new C11411m();
        mVar.f43727a = mo34935f();
        C11402i iVar = new C11402i(this.f43676f.mo35234h0(socketAddress, g, mVar), this.f43679i, (C11393a) null);
        mVar.f43727a = iVar.mo34935f();
        this.f43678h.mo36995c(iVar);
        this.f43692v = iVar;
        this.f43690t.add(iVar);
        Runnable c = iVar.mo34933c(new C11407l(iVar, socketAddress));
        if (c != null) {
            this.f43682l.mo37064c(c);
        }
        this.f43681k.mo35256b(C12312f.C12313a.INFO, "Started transport {0}", mVar.f43727a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public C12367p mo35391M() {
        return this.f43694x.mo37080c();
    }

    /* renamed from: U */
    public void mo35392U(List<C12406x> list) {
        C6431n.m37562o(list, "newAddressGroups");
        m56002L(list, "newAddressGroups contains null entry");
        C6431n.m37552e(!list.isEmpty(), "newAddressGroups is empty");
        this.f43682l.execute(new C11396d(Collections.unmodifiableList(new ArrayList(list))));
    }

    /* renamed from: a */
    public C11351s mo35262a() {
        C11272k1 k1Var = this.f43693w;
        if (k1Var != null) {
            return k1Var;
        }
        this.f43682l.execute(new C11395c());
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo35393d(C12335j1 j1Var) {
        mo35394g(j1Var);
        this.f43682l.execute(new C11401h(j1Var));
    }

    /* renamed from: f */
    public C12334j0 mo34935f() {
        return this.f43671a;
    }

    /* renamed from: g */
    public void mo35394g(C12335j1 j1Var) {
        this.f43682l.execute(new C11398e(j1Var));
    }

    public String toString() {
        return C6419h.m37528c(this).mo21841c("logId", this.f43671a.mo37017d()).mo21842d("addressGroups", this.f43684n).toString();
    }
}
