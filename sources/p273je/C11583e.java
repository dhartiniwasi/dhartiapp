package p273je;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import p244ge.C10350a;
import p244ge.C10351a0;
import p244ge.C10355b0;
import p244ge.C10360d0;
import p244ge.C10364e0;
import p244ge.C10366f;
import p244ge.C10367f0;
import p244ge.C10375h0;
import p244ge.C10379k;
import p244ge.C10391u;
import p244ge.C10394v;
import p244ge.C10397x;
import p244ge.C10399y;
import p253he.C10539a;
import p253he.C10543e;
import p253he.C10544f;
import p282ke.C11635c;
import p291le.C11790a;
import p300me.C11888a;
import p300me.C11889b;
import p300me.C11895f;
import p300me.C11912g;
import p300me.C11916i;
import p300me.C11926n;
import p309ne.C12008f;
import p327pe.C12178d;
import p336qe.C12233d;
import p336qe.C12234e;
import p336qe.C12241l;

/* renamed from: je.e */
/* compiled from: RealConnection */
public final class C11583e extends C11895f.C11905j implements C10379k {

    /* renamed from: b */
    public final C11585g f44081b;

    /* renamed from: c */
    private final C10375h0 f44082c;

    /* renamed from: d */
    private Socket f44083d;

    /* renamed from: e */
    private Socket f44084e;

    /* renamed from: f */
    private C10394v f44085f;

    /* renamed from: g */
    private C10355b0 f44086g;

    /* renamed from: h */
    private C11895f f44087h;

    /* renamed from: i */
    private C12234e f44088i;

    /* renamed from: j */
    private C12233d f44089j;

    /* renamed from: k */
    boolean f44090k;

    /* renamed from: l */
    int f44091l;

    /* renamed from: m */
    int f44092m;

    /* renamed from: n */
    private int f44093n;

    /* renamed from: o */
    private int f44094o = 1;

    /* renamed from: p */
    final List<Reference<C11590k>> f44095p = new ArrayList();

    /* renamed from: q */
    long f44096q = Long.MAX_VALUE;

    public C11583e(C11585g gVar, C10375h0 h0Var) {
        this.f44081b = gVar;
        this.f44082c = h0Var;
    }

    /* renamed from: e */
    private void m56544e(int i, int i2, C10366f fVar, C10391u uVar) throws IOException {
        Socket socket;
        Proxy b = this.f44082c.mo33336b();
        C10350a a = this.f44082c.mo33335a();
        if (b.type() == Proxy.Type.DIRECT || b.type() == Proxy.Type.HTTP) {
            socket = a.mo33197j().createSocket();
        } else {
            socket = new Socket(b);
        }
        this.f44083d = socket;
        uVar.mo33379g(fVar, this.f44082c.mo33338d(), b);
        this.f44083d.setSoTimeout(i2);
        try {
            C12008f.m57887l().mo36359h(this.f44083d, this.f44082c.mo33338d(), i);
            try {
                this.f44088i = C12241l.m58807b(C12241l.m58813h(this.f44083d));
                this.f44089j = C12241l.m58806a(C12241l.m58810e(this.f44083d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f44082c.mo33338d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0135 A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013b A[Catch:{ all -> 0x012c }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x013e  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m56545f(p273je.C11578b r8) throws java.io.IOException {
        /*
            r7 = this;
            ge.h0 r0 = r7.f44082c
            ge.a r0 = r0.mo33335a()
            javax.net.ssl.SSLSocketFactory r1 = r0.mo33198k()
            r2 = 0
            java.net.Socket r3 = r7.f44083d     // Catch:{ AssertionError -> 0x012e }
            ge.x r4 = r0.mo33199l()     // Catch:{ AssertionError -> 0x012e }
            java.lang.String r4 = r4.mo33427l()     // Catch:{ AssertionError -> 0x012e }
            ge.x r5 = r0.mo33199l()     // Catch:{ AssertionError -> 0x012e }
            int r5 = r5.mo33432w()     // Catch:{ AssertionError -> 0x012e }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x012e }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x012e }
            ge.m r8 = r8.mo35674a(r1)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r3 = r8.mo33349f()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r3 == 0) goto L_0x0041
            ne.f r3 = p309ne.C12008f.m57887l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            ge.x r4 = r0.mo33199l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r4 = r4.mo33427l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.util.List r5 = r0.mo33192f()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r3.mo36355g(r1, r4, r5)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x0041:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            ge.v r4 = p244ge.C10394v.m52485b(r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            javax.net.ssl.HostnameVerifier r5 = r0.mo33190e()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            ge.x r6 = r0.mo33199l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r6 = r6.mo33427l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r3 != 0) goto L_0x00d8
            java.util.List r8 = r4.mo33397d()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r2 = r8.isEmpty()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r3 = "Hostname "
            if (r2 != 0) goto L_0x00b6
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.<init>()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            ge.x r0 = r0.mo33199l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.mo33427l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = p244ge.C10372h.m52399c(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = "\n    DN: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.util.List r8 = p327pe.C12178d.m58466a(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r4.append(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r8 = r4.toString()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            throw r2     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x00b6:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.<init>()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.append(r3)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            ge.x r0 = r0.mo33199l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.mo33427l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r2.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r2.toString()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r8.<init>(r0)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            throw r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x00d8:
            ge.h r3 = r0.mo33186a()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            ge.x r0 = r0.mo33199l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r0 = r0.mo33427l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.util.List r5 = r4.mo33397d()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r3.mo33325a(r0, r5)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            boolean r8 = r8.mo33349f()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r8 == 0) goto L_0x00f9
            ne.f r8 = p309ne.C12008f.m57887l()     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.lang.String r2 = r8.mo36356n(r1)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x00f9:
            r7.f44084e = r1     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            qe.t r8 = p336qe.C12241l.m58813h(r1)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            qe.e r8 = p336qe.C12241l.m58807b(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r7.f44088i = r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            java.net.Socket r8 = r7.f44084e     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            qe.s r8 = p336qe.C12241l.m58810e(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            qe.d r8 = p336qe.C12241l.m58806a(r8)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r7.f44089j = r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            r7.f44085f = r4     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            if (r2 == 0) goto L_0x011a
            ge.b0 r8 = p244ge.C10355b0.m52301a(r2)     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            goto L_0x011c
        L_0x011a:
            ge.b0 r8 = p244ge.C10355b0.HTTP_1_1     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
        L_0x011c:
            r7.f44086g = r8     // Catch:{ AssertionError -> 0x0129, all -> 0x0126 }
            ne.f r8 = p309ne.C12008f.m57887l()
            r8.mo36374a(r1)
            return
        L_0x0126:
            r8 = move-exception
            r2 = r1
            goto L_0x013c
        L_0x0129:
            r8 = move-exception
            r2 = r1
            goto L_0x012f
        L_0x012c:
            r8 = move-exception
            goto L_0x013c
        L_0x012e:
            r8 = move-exception
        L_0x012f:
            boolean r0 = p253he.C10543e.m53065z(r8)     // Catch:{ all -> 0x012c }
            if (r0 == 0) goto L_0x013b
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x012c }
            r0.<init>(r8)     // Catch:{ all -> 0x012c }
            throw r0     // Catch:{ all -> 0x012c }
        L_0x013b:
            throw r8     // Catch:{ all -> 0x012c }
        L_0x013c:
            if (r2 == 0) goto L_0x0145
            ne.f r0 = p309ne.C12008f.m57887l()
            r0.mo36374a(r2)
        L_0x0145:
            p253he.C10543e.m53046g(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p273je.C11583e.m56545f(je.b):void");
    }

    /* renamed from: g */
    private void m56546g(int i, int i2, int i3, C10366f fVar, C10391u uVar) throws IOException {
        C10360d0 i4 = m56548i();
        C10397x h = i4.mo33260h();
        int i5 = 0;
        while (i5 < 21) {
            m56544e(i, i2, fVar, uVar);
            i4 = m56547h(i2, i3, i4, h);
            if (i4 != null) {
                C10543e.m53046g(this.f44083d);
                this.f44083d = null;
                this.f44089j = null;
                this.f44088i = null;
                uVar.mo33377e(fVar, this.f44082c.mo33338d(), this.f44082c.mo33336b(), (C10355b0) null);
                i5++;
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    private C10360d0 m56547h(int i, int i2, C10360d0 d0Var, C10397x xVar) throws IOException {
        String str = "CONNECT " + C10543e.m53057r(xVar, true) + " HTTP/1.1";
        while (true) {
            C11790a aVar = new C11790a((C10351a0) null, (C11583e) null, this.f44088i, this.f44089j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f44088i.mo33809o().mo36859g((long) i, timeUnit);
            this.f44089j.mo36029o().mo36859g((long) i2, timeUnit);
            aVar.mo36027B(d0Var.mo33256d(), str);
            aVar.mo35793d();
            C10367f0 c = aVar.mo35794e(false).mo33317q(d0Var).mo33305c();
            aVar.mo36026A(c);
            int f = c.mo33292f();
            if (f != 200) {
                if (f == 407) {
                    C10360d0 a = this.f44082c.mo33335a().mo33194h().mo33240a(this.f44082c, c);
                    if (a == null) {
                        throw new IOException("Failed to authenticate with proxy");
                    } else if ("close".equalsIgnoreCase(c.mo33294h("Connection"))) {
                        return a;
                    } else {
                        d0Var = a;
                    }
                } else {
                    throw new IOException("Unexpected response code for CONNECT: " + c.mo33292f());
                }
            } else if (this.f44088i.mo36780W().mo36784Z() && this.f44089j.mo36802j().mo36784Z()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    /* renamed from: i */
    private C10360d0 m56548i() throws IOException {
        C10360d0 a = new C10360d0.C10361a().mo33268g(this.f44082c.mo33335a().mo33199l()).mo33266e("CONNECT", (C10364e0) null).mo33264c("Host", C10543e.m53057r(this.f44082c.mo33335a().mo33199l(), true)).mo33264c("Proxy-Connection", "Keep-Alive").mo33264c("User-Agent", C10544f.m53066a()).mo33262a();
        C10360d0 a2 = this.f44082c.mo33335a().mo33194h().mo33240a(this.f44082c, new C10367f0.C10368a().mo33317q(a).mo33315o(C10355b0.HTTP_1_1).mo33307g(407).mo33312l("Preemptive Authenticate").mo33304b(C10543e.f41563d).mo33318r(-1).mo33316p(-1).mo33309i("Proxy-Authenticate", "OkHttp-Preemptive").mo33305c());
        return a2 != null ? a2 : a;
    }

    /* renamed from: j */
    private void m56549j(C11578b bVar, int i, C10366f fVar, C10391u uVar) throws IOException {
        if (this.f44082c.mo33335a().mo33198k() == null) {
            List<C10355b0> f = this.f44082c.mo33335a().mo33192f();
            C10355b0 b0Var = C10355b0.H2_PRIOR_KNOWLEDGE;
            if (f.contains(b0Var)) {
                this.f44084e = this.f44083d;
                this.f44086g = b0Var;
                m56551t(i);
                return;
            }
            this.f44084e = this.f44083d;
            this.f44086g = C10355b0.HTTP_1_1;
            return;
        }
        uVar.mo33395y(fVar);
        m56545f(bVar);
        uVar.mo33394x(fVar, this.f44085f);
        if (this.f44086g == C10355b0.HTTP_2) {
            m56551t(i);
        }
    }

    /* renamed from: r */
    private boolean m56550r(List<C10375h0> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C10375h0 h0Var = list.get(i);
            if (h0Var.mo33336b().type() == Proxy.Type.DIRECT && this.f44082c.mo33336b().type() == Proxy.Type.DIRECT && this.f44082c.mo33338d().equals(h0Var.mo33338d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    private void m56551t(int i) throws IOException {
        this.f44084e.setSoTimeout(0);
        C11895f a = new C11895f.C11903h(true).mo36179d(this.f44084e, this.f44082c.mo33335a().mo33199l().mo33427l(), this.f44088i, this.f44089j).mo36177b(this).mo36178c(i).mo36176a();
        this.f44087h = a;
        a.mo36168i0();
    }

    /* renamed from: a */
    public void mo35701a(C11895f fVar) {
        synchronized (this.f44081b) {
            this.f44094o = fVar.mo36156H();
        }
    }

    /* renamed from: b */
    public void mo35702b(C11916i iVar) throws IOException {
        iVar.mo36197d(C11889b.REFUSED_STREAM, (IOException) null);
    }

    /* renamed from: c */
    public void mo35703c() {
        C10543e.m53046g(this.f44083d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0090 A[Catch:{ IOException -> 0x00f9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0135  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35704d(int r17, int r18, int r19, int r20, boolean r21, p244ge.C10366f r22, p244ge.C10391u r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            ge.b0 r0 = r7.f44086g
            if (r0 != 0) goto L_0x0150
            ge.h0 r0 = r7.f44082c
            ge.a r0 = r0.mo33335a()
            java.util.List r0 = r0.mo33187b()
            je.b r10 = new je.b
            r10.<init>(r0)
            ge.h0 r1 = r7.f44082c
            ge.a r1 = r1.mo33335a()
            javax.net.ssl.SSLSocketFactory r1 = r1.mo33198k()
            if (r1 != 0) goto L_0x0074
            ge.m r1 = p244ge.C10381m.f41264j
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0067
            ge.h0 r0 = r7.f44082c
            ge.a r0 = r0.mo33335a()
            ge.x r0 = r0.mo33199l()
            java.lang.String r0 = r0.mo33427l()
            ne.f r1 = p309ne.C12008f.m57887l()
            boolean r1 = r1.mo36362q(r0)
            if (r1 == 0) goto L_0x0046
            goto L_0x0086
        L_0x0046:
            je.i r1 = new je.i
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0067:
            je.i r0 = new je.i
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0074:
            ge.h0 r0 = r7.f44082c
            ge.a r0 = r0.mo33335a()
            java.util.List r0 = r0.mo33192f()
            ge.b0 r1 = p244ge.C10355b0.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0143
        L_0x0086:
            r11 = 0
            r12 = r11
        L_0x0088:
            ge.h0 r0 = r7.f44082c     // Catch:{ IOException -> 0x00f9 }
            boolean r0 = r0.mo33337c()     // Catch:{ IOException -> 0x00f9 }
            if (r0 == 0) goto L_0x00a9
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.m56546g(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f9 }
            java.net.Socket r0 = r7.f44083d     // Catch:{ IOException -> 0x00f9 }
            if (r0 != 0) goto L_0x00a4
            goto L_0x00c6
        L_0x00a4:
            r13 = r17
            r14 = r18
            goto L_0x00b0
        L_0x00a9:
            r13 = r17
            r14 = r18
            r7.m56544e(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00f7 }
        L_0x00b0:
            r15 = r20
            r7.m56549j(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00f5 }
            ge.h0 r0 = r7.f44082c     // Catch:{ IOException -> 0x00f5 }
            java.net.InetSocketAddress r0 = r0.mo33338d()     // Catch:{ IOException -> 0x00f5 }
            ge.h0 r1 = r7.f44082c     // Catch:{ IOException -> 0x00f5 }
            java.net.Proxy r1 = r1.mo33336b()     // Catch:{ IOException -> 0x00f5 }
            ge.b0 r2 = r7.f44086g     // Catch:{ IOException -> 0x00f5 }
            r9.mo33377e(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f5 }
        L_0x00c6:
            ge.h0 r0 = r7.f44082c
            boolean r0 = r0.mo33337c()
            if (r0 == 0) goto L_0x00e0
            java.net.Socket r0 = r7.f44083d
            if (r0 == 0) goto L_0x00d3
            goto L_0x00e0
        L_0x00d3:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            je.i r1 = new je.i
            r1.<init>(r0)
            throw r1
        L_0x00e0:
            me.f r0 = r7.f44087h
            if (r0 == 0) goto L_0x00f4
            je.g r1 = r7.f44081b
            monitor-enter(r1)
            me.f r0 = r7.f44087h     // Catch:{ all -> 0x00f1 }
            int r0 = r0.mo36156H()     // Catch:{ all -> 0x00f1 }
            r7.f44094o = r0     // Catch:{ all -> 0x00f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f4
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            throw r0
        L_0x00f4:
            return
        L_0x00f5:
            r0 = move-exception
            goto L_0x0100
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fe
        L_0x00f9:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00fe:
            r15 = r20
        L_0x0100:
            java.net.Socket r1 = r7.f44084e
            p253he.C10543e.m53046g(r1)
            java.net.Socket r1 = r7.f44083d
            p253he.C10543e.m53046g(r1)
            r7.f44084e = r11
            r7.f44083d = r11
            r7.f44088i = r11
            r7.f44089j = r11
            r7.f44085f = r11
            r7.f44086g = r11
            r7.f44087h = r11
            ge.h0 r1 = r7.f44082c
            java.net.InetSocketAddress r3 = r1.mo33338d()
            ge.h0 r1 = r7.f44082c
            java.net.Proxy r4 = r1.mo33336b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.mo33378f(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0135
            je.i r12 = new je.i
            r12.<init>(r0)
            goto L_0x0138
        L_0x0135:
            r12.mo35725a(r0)
        L_0x0138:
            if (r21 == 0) goto L_0x0142
            boolean r0 = r10.mo35675b(r0)
            if (r0 == 0) goto L_0x0142
            goto L_0x0088
        L_0x0142:
            throw r12
        L_0x0143:
            je.i r0 = new je.i
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0150:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p273je.C11583e.mo35704d(int, int, int, int, boolean, ge.f, ge.u):void");
    }

    /* renamed from: k */
    public C10394v mo35705k() {
        return this.f44085f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo35706l(C10350a aVar, List<C10375h0> list) {
        if (this.f44095p.size() >= this.f44094o || this.f44090k || !C10539a.f41555a.mo33232e(this.f44082c.mo33335a(), aVar)) {
            return false;
        }
        if (aVar.mo33199l().mo33427l().equals(mo35711q().mo33335a().mo33199l().mo33427l())) {
            return true;
        }
        if (this.f44087h == null || list == null || !m56550r(list) || aVar.mo33190e() != C12178d.f45262a || !mo35714u(aVar.mo33199l())) {
            return false;
        }
        try {
            aVar.mo33186a().mo33325a(aVar.mo33199l().mo33427l(), mo35705k().mo33397d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public boolean mo35707m(boolean z) {
        int soTimeout;
        if (this.f44084e.isClosed() || this.f44084e.isInputShutdown() || this.f44084e.isOutputShutdown()) {
            return false;
        }
        C11895f fVar = this.f44087h;
        if (fVar != null) {
            return fVar.mo36155G(System.nanoTime());
        }
        if (z) {
            try {
                soTimeout = this.f44084e.getSoTimeout();
                this.f44084e.setSoTimeout(1);
                if (this.f44088i.mo36784Z()) {
                    this.f44084e.setSoTimeout(soTimeout);
                    return false;
                }
                this.f44084e.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.f44084e.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    /* renamed from: n */
    public boolean mo35708n() {
        return this.f44087h != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C11635c mo35709o(C10351a0 a0Var, C10399y.C10400a aVar) throws SocketException {
        if (this.f44087h != null) {
            return new C11912g(a0Var, this, aVar, this.f44087h);
        }
        this.f44084e.setSoTimeout(aVar.mo33447a());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f44088i.mo33809o().mo36859g((long) aVar.mo33447a(), timeUnit);
        this.f44089j.mo36029o().mo36859g((long) aVar.mo33448b(), timeUnit);
        return new C11790a(a0Var, this, this.f44088i, this.f44089j);
    }

    /* renamed from: p */
    public void mo35710p() {
        synchronized (this.f44081b) {
            this.f44090k = true;
        }
    }

    /* renamed from: q */
    public C10375h0 mo35711q() {
        return this.f44082c;
    }

    /* renamed from: s */
    public Socket mo35712s() {
        return this.f44084e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f44082c.mo33335a().mo33199l().mo33427l());
        sb.append(":");
        sb.append(this.f44082c.mo33335a().mo33199l().mo33432w());
        sb.append(", proxy=");
        sb.append(this.f44082c.mo33336b());
        sb.append(" hostAddress=");
        sb.append(this.f44082c.mo33338d());
        sb.append(" cipherSuite=");
        C10394v vVar = this.f44085f;
        sb.append(vVar != null ? vVar.mo33396a() : "none");
        sb.append(" protocol=");
        sb.append(this.f44086g);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo35714u(C10397x xVar) {
        if (xVar.mo33432w() != this.f44082c.mo33335a().mo33199l().mo33432w()) {
            return false;
        }
        if (xVar.mo33427l().equals(this.f44082c.mo33335a().mo33199l().mo33427l())) {
            return true;
        }
        if (this.f44085f == null || !C12178d.f45262a.mo36695c(xVar.mo33427l(), (X509Certificate) this.f44085f.mo33397d().get(0))) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo35715v(IOException iOException) {
        synchronized (this.f44081b) {
            if (iOException instanceof C11926n) {
                C11889b bVar = ((C11926n) iOException).f44810a;
                if (bVar == C11889b.REFUSED_STREAM) {
                    int i = this.f44093n + 1;
                    this.f44093n = i;
                    if (i > 1) {
                        this.f44090k = true;
                        this.f44091l++;
                    }
                } else if (bVar != C11889b.CANCEL) {
                    this.f44090k = true;
                    this.f44091l++;
                }
            } else if (!mo35708n() || (iOException instanceof C11888a)) {
                this.f44090k = true;
                if (this.f44092m == 0) {
                    if (iOException != null) {
                        this.f44081b.mo35718c(this.f44082c, iOException);
                    }
                    this.f44091l++;
                }
            }
        }
    }
}
