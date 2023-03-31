package p264io.grpc.internal;

import java.io.InputStream;
import p182a7.C6431n;
import p187ad.C6573b;
import p187ad.C6574c;
import p264io.grpc.internal.C11172f;
import p264io.grpc.internal.C11274k2;
import p264io.grpc.internal.C11281l1;
import p343rc.C12346l;
import p343rc.C12357n;
import p343rc.C12398u;

/* renamed from: io.grpc.internal.d */
/* compiled from: AbstractStream */
public abstract class C11155d implements C11268j2 {

    /* renamed from: io.grpc.internal.d$a */
    /* compiled from: AbstractStream */
    public static abstract class C11156a implements C11172f.C11180h, C11281l1.C11283b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C11391y f43032a;

        /* renamed from: b */
        private final Object f43033b = new Object();

        /* renamed from: c */
        private final C11255i2 f43034c;

        /* renamed from: d */
        private final C11310o2 f43035d;

        /* renamed from: e */
        private final C11281l1 f43036e;

        /* renamed from: f */
        private int f43037f;

        /* renamed from: g */
        private boolean f43038g;

        /* renamed from: h */
        private boolean f43039h;

        /* renamed from: io.grpc.internal.d$a$a */
        /* compiled from: AbstractStream */
        class C11157a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C6573b f43040a;

            /* renamed from: b */
            final /* synthetic */ int f43041b;

            C11157a(C6573b bVar, int i) {
                this.f43040a = bVar;
                this.f43041b = i;
            }

            public void run() {
                C6574c.m38140f("AbstractStream.request");
                C6574c.m38138d(this.f43040a);
                try {
                    C11156a.this.f43032a.mo35050a(this.f43041b);
                } catch (Throwable th) {
                    C6574c.m38142h("AbstractStream.request");
                    throw th;
                }
                C6574c.m38142h("AbstractStream.request");
            }
        }

        protected C11156a(int i, C11255i2 i2Var, C11310o2 o2Var) {
            this.f43034c = (C11255i2) C6431n.m37562o(i2Var, "statsTraceCtx");
            this.f43035d = (C11310o2) C6431n.m37562o(o2Var, "transportTracer");
            C11281l1 l1Var = new C11281l1(this, C12346l.C12348b.f45659a, i, i2Var, o2Var);
            this.f43036e = l1Var;
            this.f43032a = l1Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public boolean m55204n() {
            boolean z;
            synchronized (this.f43033b) {
                z = this.f43038g && this.f43037f < 32768 && !this.f43039h;
            }
            return z;
        }

        /* renamed from: p */
        private void m55205p() {
            boolean n;
            synchronized (this.f43033b) {
                n = m55204n();
            }
            if (n) {
                mo34930o().mo34974c();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public void m55206q(int i) {
            synchronized (this.f43033b) {
                this.f43037f += i;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public void m55207u(int i) {
            mo35075f(new C11157a(C6574c.m38139e(), i));
        }

        /* renamed from: a */
        public void mo35014a(C11274k2.C11275a aVar) {
            mo34930o().mo34972a(aVar);
        }

        /* renamed from: b */
        public final void mo35015b(int i) {
            boolean z;
            synchronized (this.f43033b) {
                C6431n.m37568u(this.f43038g, "onStreamAllocated was not called, but it seems the stream is active");
                int i2 = this.f43037f;
                z = true;
                boolean z2 = i2 < 32768;
                int i3 = i2 - i;
                this.f43037f = i3;
                boolean z3 = i3 < 32768;
                if (z2 || !z3) {
                    z = false;
                }
            }
            if (z) {
                m55205p();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: k */
        public final void mo35016k(boolean z) {
            if (z) {
                this.f43032a.close();
            } else {
                this.f43032a.mo35054g();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: l */
        public final void mo35017l(C11380v1 v1Var) {
            try {
                this.f43032a.mo35055h(v1Var);
            } catch (Throwable th) {
                mo35070e(th);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: m */
        public C11310o2 mo35018m() {
            return this.f43035d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public abstract C11274k2 mo34930o();

        /* access modifiers changed from: protected */
        /* renamed from: r */
        public void mo35019r() {
            boolean z = false;
            C6431n.m37567t(mo34930o() != null);
            synchronized (this.f43033b) {
                if (!this.f43038g) {
                    z = true;
                }
                C6431n.m37568u(z, "Already allocated");
                this.f43038g = true;
            }
            m55205p();
        }

        /* access modifiers changed from: protected */
        /* renamed from: s */
        public final void mo35020s() {
            synchronized (this.f43033b) {
                this.f43039h = true;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public final void mo35021t() {
            this.f43036e.mo35238H(this);
            this.f43032a = this.f43036e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public final void mo35022v(C12398u uVar) {
            this.f43032a.mo35053f(uVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: w */
        public void mo35023w(C11353s0 s0Var) {
            this.f43036e.mo35237G(s0Var);
            this.f43032a = new C11172f(this, this, this.f43036e);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public final void mo35024x(int i) {
            this.f43032a.mo35051b(i);
        }
    }

    /* renamed from: a */
    public final void mo34951a(int i) {
        mo34907t().m55207u(i);
    }

    /* renamed from: e */
    public final void mo34952e(C12357n nVar) {
        mo34906r().mo34914e((C12357n) C6431n.m37562o(nVar, "compressor"));
    }

    public final void flush() {
        if (!mo34906r().mo34915f()) {
            mo34906r().flush();
        }
    }

    public boolean isReady() {
        return mo34907t().m55204n();
    }

    /* renamed from: m */
    public final void mo34955m(InputStream inputStream) {
        C6431n.m37562o(inputStream, "message");
        try {
            if (!mo34906r().mo34915f()) {
                mo34906r().mo34917g(inputStream);
            }
        } finally {
            C11335r0.m55798e(inputStream);
        }
    }

    /* renamed from: n */
    public void mo34956n() {
        mo34907t().mo35021t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo35012q() {
        mo34906r().close();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract C11326p0 mo34906r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public final void mo35013s(int i) {
        mo34907t().m55206q(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract C11156a mo34907t();
}
