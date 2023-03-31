package p264io.grpc.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import p182a7.C6431n;
import p264io.grpc.internal.C11189g;
import p264io.grpc.internal.C11274k2;
import p264io.grpc.internal.C11281l1;
import p343rc.C12398u;

/* renamed from: io.grpc.internal.f */
/* compiled from: ApplicationThreadDeframer */
public class C11172f implements C11391y {

    /* renamed from: a */
    private final C11281l1.C11283b f43061a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C11189g f43062b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C11281l1 f43063c;

    /* renamed from: io.grpc.internal.f$a */
    /* compiled from: ApplicationThreadDeframer */
    class C11173a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f43064a;

        C11173a(int i) {
            this.f43064a = i;
        }

        public void run() {
            if (!C11172f.this.f43063c.mo35240q()) {
                try {
                    C11172f.this.f43063c.mo35050a(this.f43064a);
                } catch (Throwable th) {
                    C11172f.this.f43062b.mo35070e(th);
                    C11172f.this.f43063c.close();
                }
            }
        }
    }

    /* renamed from: io.grpc.internal.f$b */
    /* compiled from: ApplicationThreadDeframer */
    class C11174b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11380v1 f43066a;

        C11174b(C11380v1 v1Var) {
            this.f43066a = v1Var;
        }

        public void run() {
            try {
                C11172f.this.f43063c.mo35055h(this.f43066a);
            } catch (Throwable th) {
                C11172f.this.f43062b.mo35070e(th);
                C11172f.this.f43063c.close();
            }
        }
    }

    /* renamed from: io.grpc.internal.f$c */
    /* compiled from: ApplicationThreadDeframer */
    class C11175c implements Closeable {

        /* renamed from: a */
        final /* synthetic */ C11380v1 f43068a;

        C11175c(C11380v1 v1Var) {
            this.f43068a = v1Var;
        }

        public void close() {
            this.f43068a.close();
        }
    }

    /* renamed from: io.grpc.internal.f$d */
    /* compiled from: ApplicationThreadDeframer */
    class C11176d implements Runnable {
        C11176d() {
        }

        public void run() {
            C11172f.this.f43063c.mo35054g();
        }
    }

    /* renamed from: io.grpc.internal.f$e */
    /* compiled from: ApplicationThreadDeframer */
    class C11177e implements Runnable {
        C11177e() {
        }

        public void run() {
            C11172f.this.f43063c.close();
        }
    }

    /* renamed from: io.grpc.internal.f$f */
    /* compiled from: ApplicationThreadDeframer */
    private class C11178f extends C11179g implements Closeable {

        /* renamed from: d */
        private final Closeable f43072d;

        public C11178f(Runnable runnable, Closeable closeable) {
            super(C11172f.this, runnable, (C11173a) null);
            this.f43072d = closeable;
        }

        public void close() throws IOException {
            this.f43072d.close();
        }
    }

    /* renamed from: io.grpc.internal.f$g */
    /* compiled from: ApplicationThreadDeframer */
    private class C11179g implements C11274k2.C11275a {

        /* renamed from: a */
        private final Runnable f43074a;

        /* renamed from: b */
        private boolean f43075b;

        /* synthetic */ C11179g(C11172f fVar, Runnable runnable, C11173a aVar) {
            this(runnable);
        }

        /* renamed from: a */
        private void m55276a() {
            if (!this.f43075b) {
                this.f43074a.run();
                this.f43075b = true;
            }
        }

        public InputStream next() {
            m55276a();
            return C11172f.this.f43062b.mo35071f();
        }

        private C11179g(Runnable runnable) {
            this.f43075b = false;
            this.f43074a = runnable;
        }
    }

    /* renamed from: io.grpc.internal.f$h */
    /* compiled from: ApplicationThreadDeframer */
    interface C11180h extends C11189g.C11193d {
    }

    C11172f(C11281l1.C11283b bVar, C11180h hVar, C11281l1 l1Var) {
        C11250h2 h2Var = new C11250h2((C11281l1.C11283b) C6431n.m37562o(bVar, "listener"));
        this.f43061a = h2Var;
        C11189g gVar = new C11189g(h2Var, hVar);
        this.f43062b = gVar;
        l1Var.mo35238H(gVar);
        this.f43063c = l1Var;
    }

    /* renamed from: a */
    public void mo35050a(int i) {
        this.f43061a.mo35014a(new C11179g(this, new C11173a(i), (C11173a) null));
    }

    /* renamed from: b */
    public void mo35051b(int i) {
        this.f43063c.mo35051b(i);
    }

    public void close() {
        this.f43063c.mo35239I();
        this.f43061a.mo35014a(new C11179g(this, new C11177e(), (C11173a) null));
    }

    /* renamed from: f */
    public void mo35053f(C12398u uVar) {
        this.f43063c.mo35053f(uVar);
    }

    /* renamed from: g */
    public void mo35054g() {
        this.f43061a.mo35014a(new C11179g(this, new C11176d(), (C11173a) null));
    }

    /* renamed from: h */
    public void mo35055h(C11380v1 v1Var) {
        this.f43061a.mo35014a(new C11178f(new C11174b(v1Var), new C11175c(v1Var)));
    }
}
