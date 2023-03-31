package p264io.grpc.internal;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import p182a7.C6419h;
import p264io.grpc.internal.C11314p;
import p343rc.C12292c;
import p343rc.C12314f0;
import p343rc.C12319g;
import p343rc.C12327i0;
import p343rc.C12334j0;
import p343rc.C12335j1;
import p343rc.C12367p;
import p343rc.C12399u0;
import p343rc.C12423z0;

/* renamed from: io.grpc.internal.q1 */
/* compiled from: OobChannel */
final class C11331q1 extends C12399u0 implements C12327i0<Object> {

    /* renamed from: k */
    private static final Logger f43511k = Logger.getLogger(C11331q1.class.getName());

    /* renamed from: a */
    private C11392y0 f43512a;

    /* renamed from: b */
    private final C12334j0 f43513b;

    /* renamed from: c */
    private final String f43514c;

    /* renamed from: d */
    private final C11105a0 f43515d;

    /* renamed from: e */
    private final Executor f43516e;

    /* renamed from: f */
    private final ScheduledExecutorService f43517f;

    /* renamed from: g */
    private final CountDownLatch f43518g;

    /* renamed from: h */
    private volatile boolean f43519h;

    /* renamed from: i */
    private final C11289m f43520i;

    /* renamed from: j */
    private final C11314p.C11323e f43521j;

    /* renamed from: a */
    public String mo35080a() {
        return this.f43514c;
    }

    /* renamed from: e */
    public <RequestT, ResponseT> C12319g<RequestT, ResponseT> mo35081e(C12423z0<RequestT, ResponseT> z0Var, C12292c cVar) {
        return new C11314p(z0Var, cVar.mo36960e() == null ? this.f43516e : cVar.mo36960e(), cVar, this.f43521j, this.f43517f, this.f43520i, (C12314f0) null);
    }

    /* renamed from: f */
    public C12334j0 mo34935f() {
        return this.f43513b;
    }

    /* renamed from: i */
    public boolean mo35082i(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f43518g.await(j, timeUnit);
    }

    /* renamed from: k */
    public C12367p mo35084k(boolean z) {
        C11392y0 y0Var = this.f43512a;
        if (y0Var == null) {
            return C12367p.IDLE;
        }
        return y0Var.mo35391M();
    }

    /* renamed from: m */
    public C12399u0 mo35086m() {
        this.f43519h = true;
        this.f43515d.mo34936g(C12335j1.f45621u.mo37030q("OobChannel.shutdown() called"));
        return this;
    }

    /* renamed from: n */
    public C12399u0 mo35087n() {
        this.f43519h = true;
        this.f43515d.mo34934d(C12335j1.f45621u.mo37030q("OobChannel.shutdownNow() called"));
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C11392y0 mo35295o() {
        return this.f43512a;
    }

    public String toString() {
        return C6419h.m37528c(this).mo21841c("logId", this.f43513b.mo37017d()).mo21842d("authority", this.f43514c).toString();
    }
}
