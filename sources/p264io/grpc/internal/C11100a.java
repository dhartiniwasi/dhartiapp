package p264io.grpc.internal;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p182a7.C6431n;
import p199c7.C6771b;
import p264io.grpc.internal.C11155d;
import p264io.grpc.internal.C11293m1;
import p264io.grpc.internal.C11333r;
import p343rc.C12290b0;
import p343rc.C12292c;
import p343rc.C12335j1;
import p343rc.C12357n;
import p343rc.C12392t;
import p343rc.C12400v;
import p343rc.C12411y0;

/* renamed from: io.grpc.internal.a */
/* compiled from: AbstractClientStream */
public abstract class C11100a extends C11155d implements C11329q, C11293m1.C11297d {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Logger f42858g = Logger.getLogger(C11100a.class.getName());

    /* renamed from: a */
    private final C11310o2 f42859a;

    /* renamed from: b */
    private final C11326p0 f42860b;

    /* renamed from: c */
    private boolean f42861c;

    /* renamed from: d */
    private boolean f42862d;

    /* renamed from: e */
    private C12411y0 f42863e;

    /* renamed from: f */
    private volatile boolean f42864f;

    /* renamed from: io.grpc.internal.a$a */
    /* compiled from: AbstractClientStream */
    private class C11101a implements C11326p0 {

        /* renamed from: a */
        private C12411y0 f42865a;

        /* renamed from: b */
        private boolean f42866b;

        /* renamed from: c */
        private final C11255i2 f42867c;

        /* renamed from: d */
        private byte[] f42868d;

        public C11101a(C12411y0 y0Var, C11255i2 i2Var) {
            this.f42865a = (C12411y0) C6431n.m37562o(y0Var, "headers");
            this.f42867c = (C11255i2) C6431n.m37562o(i2Var, "statsTraceCtx");
        }

        public void close() {
            boolean z = true;
            this.f42866b = true;
            if (this.f42868d == null) {
                z = false;
            }
            C6431n.m37568u(z, "Lack of request message. GET request is only supported for unary requests");
            C11100a.this.mo34908u().mo34919d(this.f42865a, this.f42868d);
            this.f42868d = null;
            this.f42865a = null;
        }

        /* renamed from: d */
        public void mo34913d(int i) {
        }

        /* renamed from: e */
        public C11326p0 mo34914e(C12357n nVar) {
            return this;
        }

        /* renamed from: f */
        public boolean mo34915f() {
            return this.f42866b;
        }

        public void flush() {
        }

        /* renamed from: g */
        public void mo34917g(InputStream inputStream) {
            C6431n.m37568u(this.f42868d == null, "writePayload should not be called multiple times");
            try {
                this.f42868d = C6771b.m38714d(inputStream);
                this.f42867c.mo35200i(0);
                C11255i2 i2Var = this.f42867c;
                byte[] bArr = this.f42868d;
                i2Var.mo35201j(0, (long) bArr.length, (long) bArr.length);
                this.f42867c.mo35202k((long) this.f42868d.length);
                this.f42867c.mo35203l((long) this.f42868d.length);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: io.grpc.internal.a$b */
    /* compiled from: AbstractClientStream */
    protected interface C11102b {
        /* renamed from: c */
        void mo34918c(C12335j1 j1Var);

        /* renamed from: d */
        void mo34919d(C12411y0 y0Var, byte[] bArr);

        /* renamed from: e */
        void mo34920e(C11328p2 p2Var, boolean z, boolean z2, int i);
    }

    /* renamed from: io.grpc.internal.a$c */
    /* compiled from: AbstractClientStream */
    protected static abstract class C11103c extends C11155d.C11156a {

        /* renamed from: i */
        private final C11255i2 f42870i;

        /* renamed from: j */
        private boolean f42871j;

        /* renamed from: k */
        private C11333r f42872k;

        /* renamed from: l */
        private boolean f42873l;

        /* renamed from: m */
        private C12400v f42874m = C12400v.m59294c();

        /* renamed from: n */
        private boolean f42875n = false;

        /* renamed from: o */
        private Runnable f42876o;

        /* renamed from: p */
        private volatile boolean f42877p;

        /* renamed from: q */
        private boolean f42878q;

        /* renamed from: r */
        private boolean f42879r;

        /* renamed from: io.grpc.internal.a$c$a */
        /* compiled from: AbstractClientStream */
        class C11104a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C12335j1 f42880a;

            /* renamed from: b */
            final /* synthetic */ C11333r.C11334a f42881b;

            /* renamed from: c */
            final /* synthetic */ C12411y0 f42882c;

            C11104a(C12335j1 j1Var, C11333r.C11334a aVar, C12411y0 y0Var) {
                this.f42880a = j1Var;
                this.f42881b = aVar;
                this.f42882c = y0Var;
            }

            public void run() {
                C11103c.this.m55032C(this.f42880a, this.f42881b, this.f42882c);
            }
        }

        protected C11103c(int i, C11255i2 i2Var, C11310o2 o2Var) {
            super(i, i2Var, o2Var);
            this.f42870i = (C11255i2) C6431n.m37562o(i2Var, "statsTraceCtx");
        }

        /* access modifiers changed from: private */
        /* renamed from: C */
        public void m55032C(C12335j1 j1Var, C11333r.C11334a aVar, C12411y0 y0Var) {
            if (!this.f42871j) {
                this.f42871j = true;
                this.f42870i.mo35204m(j1Var);
                mo34930o().mo34975d(j1Var, aVar, y0Var);
                if (mo35018m() != null) {
                    mo35018m().mo35281f(j1Var.mo37028o());
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: I */
        public void m55033I(C12400v vVar) {
            C6431n.m37568u(this.f42872k == null, "Already called start");
            this.f42874m = (C12400v) C6431n.m37562o(vVar, "decompressorRegistry");
        }

        /* access modifiers changed from: private */
        /* renamed from: J */
        public void m55034J(boolean z) {
            this.f42873l = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: L */
        public final void m55035L() {
            this.f42877p = true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: D */
        public void mo34921D(C11380v1 v1Var) {
            C6431n.m37562o(v1Var, "frame");
            boolean z = true;
            try {
                if (this.f42878q) {
                    C11100a.f42858g.log(Level.INFO, "Received data on closed stream");
                    v1Var.close();
                    return;
                }
                z = false;
                mo35017l(v1Var);
            } catch (Throwable th) {
                if (z) {
                    v1Var.close();
                }
                throw th;
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
        /* renamed from: E */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo34922E(p343rc.C12411y0 r6) {
            /*
                r5 = this;
                boolean r0 = r5.f42878q
                r1 = 1
                r0 = r0 ^ r1
                java.lang.String r2 = "Received headers on closed stream"
                p182a7.C6431n.m37568u(r0, r2)
                io.grpc.internal.i2 r0 = r5.f42870i
                r0.mo35193a()
                rc.y0$g<java.lang.String> r0 = p264io.grpc.internal.C11335r0.f43533g
                java.lang.Object r0 = r6.mo37166g(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r2 = r5.f42873l
                r3 = 0
                if (r2 == 0) goto L_0x004f
                if (r0 == 0) goto L_0x004f
                java.lang.String r2 = "gzip"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 == 0) goto L_0x002f
                io.grpc.internal.s0 r0 = new io.grpc.internal.s0
                r0.<init>()
                r5.mo35023w(r0)
                r0 = 1
                goto L_0x0050
            L_0x002f:
                java.lang.String r2 = "identity"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 != 0) goto L_0x004f
                rc.j1 r6 = p343rc.C12335j1.f45620t
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r0
                java.lang.String r0 = "Can't find full stream decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                rc.j1 r6 = r6.mo37030q(r0)
                rc.l1 r6 = r6.mo37021d()
                r5.mo35070e(r6)
                return
            L_0x004f:
                r0 = 0
            L_0x0050:
                rc.y0$g<java.lang.String> r2 = p264io.grpc.internal.C11335r0.f43531e
                java.lang.Object r2 = r6.mo37166g(r2)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L_0x0093
                rc.v r4 = r5.f42874m
                rc.u r4 = r4.mo37141e(r2)
                if (r4 != 0) goto L_0x007a
                rc.j1 r6 = p343rc.C12335j1.f45620t
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r0[r3] = r2
                java.lang.String r1 = "Can't find decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                rc.j1 r6 = r6.mo37030q(r0)
                rc.l1 r6 = r6.mo37021d()
                r5.mo35070e(r6)
                return
            L_0x007a:
                rc.l r1 = p343rc.C12346l.C12348b.f45659a
                if (r4 == r1) goto L_0x0093
                if (r0 == 0) goto L_0x0090
                rc.j1 r6 = p343rc.C12335j1.f45620t
                java.lang.String r0 = "Full stream and gRPC message encoding cannot both be set"
                rc.j1 r6 = r6.mo37030q(r0)
                rc.l1 r6 = r6.mo37021d()
                r5.mo35070e(r6)
                return
            L_0x0090:
                r5.mo35022v(r4)
            L_0x0093:
                io.grpc.internal.r r0 = r5.mo34930o()
                r0.mo34973b(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p264io.grpc.internal.C11100a.C11103c.mo34922E(rc.y0):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: F */
        public void mo34923F(C12411y0 y0Var, C12335j1 j1Var) {
            C6431n.m37562o(j1Var, "status");
            C6431n.m37562o(y0Var, "trailers");
            if (this.f42878q) {
                C11100a.f42858g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{j1Var, y0Var});
                return;
            }
            this.f42870i.mo35194b(y0Var);
            mo34928N(j1Var, false, y0Var);
        }

        /* access modifiers changed from: protected */
        /* renamed from: G */
        public final boolean mo34924G() {
            return this.f42877p;
        }

        /* access modifiers changed from: protected */
        /* renamed from: H */
        public final C11333r mo34930o() {
            return this.f42872k;
        }

        /* renamed from: K */
        public final void mo34926K(C11333r rVar) {
            C6431n.m37568u(this.f42872k == null, "Already called setListener");
            this.f42872k = (C11333r) C6431n.m37562o(rVar, "listener");
        }

        /* renamed from: M */
        public final void mo34927M(C12335j1 j1Var, C11333r.C11334a aVar, boolean z, C12411y0 y0Var) {
            C6431n.m37562o(j1Var, "status");
            C6431n.m37562o(y0Var, "trailers");
            if (!this.f42878q || z) {
                this.f42878q = true;
                this.f42879r = j1Var.mo37028o();
                mo35020s();
                if (this.f42875n) {
                    this.f42876o = null;
                    m55032C(j1Var, aVar, y0Var);
                    return;
                }
                this.f42876o = new C11104a(j1Var, aVar, y0Var);
                mo35016k(z);
            }
        }

        /* renamed from: N */
        public final void mo34928N(C12335j1 j1Var, boolean z, C12411y0 y0Var) {
            mo34927M(j1Var, C11333r.C11334a.PROCESSED, z, y0Var);
        }

        /* renamed from: c */
        public void mo34929c(boolean z) {
            C6431n.m37568u(this.f42878q, "status should have been reported on deframer closed");
            this.f42875n = true;
            if (this.f42879r && z) {
                mo34928N(C12335j1.f45620t.mo37030q("Encountered end-of-stream mid-frame"), true, new C12411y0());
            }
            Runnable runnable = this.f42876o;
            if (runnable != null) {
                runnable.run();
                this.f42876o = null;
            }
        }
    }

    protected C11100a(C11332q2 q2Var, C11255i2 i2Var, C11310o2 o2Var, C12411y0 y0Var, C12292c cVar, boolean z) {
        C6431n.m37562o(y0Var, "headers");
        this.f42859a = (C11310o2) C6431n.m37562o(o2Var, "transportTracer");
        this.f42861c = C11335r0.m55808o(cVar);
        this.f42862d = z;
        if (!z) {
            this.f42860b = new C11293m1(this, q2Var, i2Var);
            this.f42863e = y0Var;
            return;
        }
        this.f42860b = new C11101a(y0Var, i2Var);
    }

    /* renamed from: b */
    public void mo34895b(int i) {
        mo34907t().mo35024x(i);
    }

    /* renamed from: c */
    public final void mo34896c(C12335j1 j1Var) {
        C6431n.m37552e(!j1Var.mo37028o(), "Should not cancel with OK status");
        this.f42864f = true;
        mo34908u().mo34918c(j1Var);
    }

    /* renamed from: d */
    public void mo34897d(int i) {
        this.f42860b.mo34913d(i);
    }

    /* renamed from: g */
    public final void mo34898g(C12400v vVar) {
        mo34907t().m55033I(vVar);
    }

    /* renamed from: h */
    public final void mo34899h(C11389x0 x0Var) {
        x0Var.mo35389b("remote_addr", mo35294j().mo36915b(C12290b0.f45524a));
    }

    /* renamed from: i */
    public final void mo34900i() {
        if (!mo34907t().mo34924G()) {
            mo34907t().m55035L();
            mo35012q();
        }
    }

    public final boolean isReady() {
        return super.isReady() && !this.f42864f;
    }

    /* renamed from: k */
    public final void mo34902k(C11333r rVar) {
        mo34907t().mo34926K(rVar);
        if (!this.f42862d) {
            mo34908u().mo34919d(this.f42863e, (byte[]) null);
            this.f42863e = null;
        }
    }

    /* renamed from: l */
    public void mo34903l(C12392t tVar) {
        C12411y0 y0Var = this.f42863e;
        C12411y0.C12418g<Long> gVar = C11335r0.f43530d;
        y0Var.mo37165e(gVar);
        this.f42863e.mo37170p(gVar, Long.valueOf(Math.max(0, tVar.mo37133q(TimeUnit.NANOSECONDS))));
    }

    /* renamed from: o */
    public final void mo34904o(C11328p2 p2Var, boolean z, boolean z2, int i) {
        C6431n.m37552e(p2Var != null || z, "null frame before EOS");
        mo34908u().mo34920e(p2Var, z, z2, i);
    }

    /* renamed from: p */
    public final void mo34905p(boolean z) {
        mo34907t().m55034J(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final C11326p0 mo34906r() {
        return this.f42860b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract C11102b mo34908u();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public C11310o2 mo34909w() {
        return this.f42859a;
    }

    /* renamed from: x */
    public final boolean mo34910x() {
        return this.f42861c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract C11103c mo34907t();
}
