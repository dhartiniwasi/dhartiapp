package p273je;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p244ge.C10350a;
import p244ge.C10351a0;
import p244ge.C10360d0;
import p244ge.C10366f;
import p244ge.C10372h;
import p244ge.C10391u;
import p244ge.C10397x;
import p244ge.C10399y;
import p253he.C10539a;
import p253he.C10543e;
import p309ne.C12008f;
import p336qe.C12226a;

/* renamed from: je.k */
/* compiled from: Transmitter */
public final class C11590k {

    /* renamed from: a */
    private final C10351a0 f44118a;

    /* renamed from: b */
    private final C11585g f44119b;

    /* renamed from: c */
    private final C10366f f44120c;

    /* renamed from: d */
    private final C10391u f44121d;

    /* renamed from: e */
    private final C12226a f44122e;

    /* renamed from: f */
    private Object f44123f;

    /* renamed from: g */
    private C10360d0 f44124g;

    /* renamed from: h */
    private C11582d f44125h;

    /* renamed from: i */
    public C11583e f44126i;

    /* renamed from: j */
    private C11579c f44127j;

    /* renamed from: k */
    private boolean f44128k;

    /* renamed from: l */
    private boolean f44129l;

    /* renamed from: m */
    private boolean f44130m;

    /* renamed from: n */
    private boolean f44131n;

    /* renamed from: o */
    private boolean f44132o;

    /* renamed from: je.k$a */
    /* compiled from: Transmitter */
    class C11591a extends C12226a {
        C11591a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo35747t() {
            C11590k.this.mo35736d();
        }
    }

    /* renamed from: je.k$b */
    /* compiled from: Transmitter */
    static final class C11592b extends WeakReference<C11590k> {

        /* renamed from: a */
        final Object f44134a;

        C11592b(C11590k kVar, Object obj) {
            super(kVar);
            this.f44134a = obj;
        }
    }

    public C11590k(C10351a0 a0Var, C10366f fVar) {
        C11591a aVar = new C11591a();
        this.f44122e = aVar;
        this.f44118a = a0Var;
        this.f44119b = C10539a.f41555a.mo33235h(a0Var.mo33210e());
        this.f44120c = fVar;
        this.f44121d = a0Var.mo33215j().mo33373a(fVar);
        aVar.mo36859g((long) a0Var.mo33207b(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: e */
    private C10350a m56590e(C10397x xVar) {
        C10372h hVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (xVar.mo33428m()) {
            SSLSocketFactory D = this.f44118a.mo33204D();
            hostnameVerifier = this.f44118a.mo33218m();
            sSLSocketFactory = D;
            hVar = this.f44118a.mo33208c();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            hVar = null;
        }
        return new C10350a(xVar.mo33427l(), xVar.mo33432w(), this.f44118a.mo33214i(), this.f44118a.mo33203C(), sSLSocketFactory, hostnameVerifier, hVar, this.f44118a.mo33226y(), this.f44118a.mo33225x(), this.f44118a.mo33224v(), this.f44118a.mo33211f(), this.f44118a.mo33227z());
    }

    /* renamed from: j */
    private IOException m56591j(IOException iOException, boolean z) {
        C11583e eVar;
        Socket n;
        boolean z2;
        boolean z3;
        synchronized (this.f44119b) {
            if (z) {
                if (this.f44127j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            eVar = this.f44126i;
            n = (eVar == null || this.f44127j != null || (!z && !this.f44132o)) ? null : mo35744n();
            if (this.f44126i != null) {
                eVar = null;
            }
            z2 = true;
            z3 = this.f44132o && this.f44127j == null;
        }
        C10543e.m53046g(n);
        if (eVar != null) {
            this.f44121d.mo33381i(this.f44120c, eVar);
        }
        if (z3) {
            if (iOException == null) {
                z2 = false;
            }
            iOException = m56592q(iOException);
            if (z2) {
                this.f44121d.mo33375c(this.f44120c, iOException);
            } else {
                this.f44121d.mo33374b(this.f44120c);
            }
        }
        return iOException;
    }

    /* renamed from: q */
    private IOException m56592q(IOException iOException) {
        if (this.f44131n || !this.f44122e.mo36756n()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo35733a(C11583e eVar) {
        if (this.f44126i == null) {
            this.f44126i = eVar;
            eVar.f44095p.add(new C11592b(this, this.f44123f));
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public void mo35734b() {
        this.f44123f = C12008f.m57887l().mo36361o("response.body().close()");
        this.f44121d.mo33376d(this.f44120c);
    }

    /* renamed from: c */
    public boolean mo35735c() {
        return this.f44125h.mo35699f() && this.f44125h.mo35698e();
    }

    /* renamed from: d */
    public void mo35736d() {
        C11579c cVar;
        C11583e eVar;
        synchronized (this.f44119b) {
            this.f44130m = true;
            cVar = this.f44127j;
            C11582d dVar = this.f44125h;
            if (dVar == null || dVar.mo35696a() == null) {
                eVar = this.f44126i;
            } else {
                eVar = this.f44125h.mo35696a();
            }
        }
        if (cVar != null) {
            cVar.mo35677b();
        } else if (eVar != null) {
            eVar.mo35703c();
        }
    }

    /* renamed from: f */
    public void mo35737f() {
        synchronized (this.f44119b) {
            if (!this.f44132o) {
                this.f44127j = null;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0036, code lost:
        if (r2 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return m56591j(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return r7;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.IOException mo35738g(p273je.C11579c r4, boolean r5, boolean r6, java.io.IOException r7) {
        /*
            r3 = this;
            je.g r0 = r3.f44119b
            monitor-enter(r0)
            je.c r1 = r3.f44127j     // Catch:{ all -> 0x003d }
            if (r4 == r1) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            return r7
        L_0x0009:
            r4 = 0
            r2 = 1
            if (r5 == 0) goto L_0x0013
            boolean r5 = r3.f44128k     // Catch:{ all -> 0x003d }
            r5 = r5 ^ r2
            r3.f44128k = r2     // Catch:{ all -> 0x003d }
            goto L_0x0014
        L_0x0013:
            r5 = 0
        L_0x0014:
            if (r6 == 0) goto L_0x001d
            boolean r6 = r3.f44129l     // Catch:{ all -> 0x003d }
            if (r6 != 0) goto L_0x001b
            r5 = 1
        L_0x001b:
            r3.f44129l = r2     // Catch:{ all -> 0x003d }
        L_0x001d:
            boolean r6 = r3.f44128k     // Catch:{ all -> 0x003d }
            if (r6 == 0) goto L_0x0034
            boolean r6 = r3.f44129l     // Catch:{ all -> 0x003d }
            if (r6 == 0) goto L_0x0034
            if (r5 == 0) goto L_0x0034
            je.e r5 = r1.mo35678c()     // Catch:{ all -> 0x003d }
            int r6 = r5.f44092m     // Catch:{ all -> 0x003d }
            int r6 = r6 + r2
            r5.f44092m = r6     // Catch:{ all -> 0x003d }
            r5 = 0
            r3.f44127j = r5     // Catch:{ all -> 0x003d }
            goto L_0x0035
        L_0x0034:
            r2 = 0
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x003c
            java.io.IOException r7 = r3.m56591j(r7, r4)
        L_0x003c:
            return r7
        L_0x003d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p273je.C11590k.mo35738g(je.c, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: h */
    public boolean mo35739h() {
        boolean z;
        synchronized (this.f44119b) {
            z = this.f44127j != null;
        }
        return z;
    }

    /* renamed from: i */
    public boolean mo35740i() {
        boolean z;
        synchronized (this.f44119b) {
            z = this.f44130m;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C11579c mo35741k(C10399y.C10400a aVar, boolean z) {
        synchronized (this.f44119b) {
            if (this.f44132o) {
                throw new IllegalStateException("released");
            } else if (this.f44127j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        C11579c cVar = new C11579c(this, this.f44120c, this.f44121d, this.f44125h, this.f44125h.mo35697b(this.f44118a, aVar, z));
        synchronized (this.f44119b) {
            this.f44127j = cVar;
            this.f44128k = false;
            this.f44129l = false;
        }
        return cVar;
    }

    /* renamed from: l */
    public IOException mo35742l(IOException iOException) {
        synchronized (this.f44119b) {
            this.f44132o = true;
        }
        return m56591j(iOException, false);
    }

    /* renamed from: m */
    public void mo35743m(C10360d0 d0Var) {
        C10360d0 d0Var2 = this.f44124g;
        if (d0Var2 != null) {
            if (C10543e.m53031D(d0Var2.mo33260h(), d0Var.mo33260h()) && this.f44125h.mo35698e()) {
                return;
            }
            if (this.f44127j != null) {
                throw new IllegalStateException();
            } else if (this.f44125h != null) {
                m56591j((IOException) null, true);
                this.f44125h = null;
            }
        }
        this.f44124g = d0Var;
        this.f44125h = new C11582d(this, this.f44119b, m56590e(d0Var.mo33260h()), this.f44120c, this.f44121d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public Socket mo35744n() {
        int i = 0;
        int size = this.f44126i.f44095p.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (this.f44126i.f44095p.get(i).get() == this) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            C11583e eVar = this.f44126i;
            eVar.f44095p.remove(i);
            this.f44126i = null;
            if (!eVar.f44095p.isEmpty()) {
                return null;
            }
            eVar.f44096q = System.nanoTime();
            if (this.f44119b.mo35719d(eVar)) {
                return eVar.mo35712s();
            }
            return null;
        }
        throw new IllegalStateException();
    }

    /* renamed from: o */
    public void mo35745o() {
        if (!this.f44131n) {
            this.f44131n = true;
            this.f44122e.mo36756n();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: p */
    public void mo35746p() {
        this.f44122e.mo36753k();
    }
}
