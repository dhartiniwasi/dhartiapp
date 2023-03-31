package p244ge;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import p244ge.C10367f0;
import p244ge.C10391u;
import p244ge.C10395w;
import p253he.C10539a;
import p253he.C10543e;
import p263ie.C10618d;
import p273je.C11579c;
import p273je.C11585g;
import p309ne.C12008f;
import p318oe.C12120a;
import p327pe.C12177c;
import p327pe.C12178d;

/* renamed from: ge.a0 */
/* compiled from: OkHttpClient */
public class C10351a0 implements Cloneable {

    /* renamed from: J */
    static final List<C10355b0> f40976J = C10543e.m53059t(C10355b0.HTTP_2, C10355b0.HTTP_1_1);

    /* renamed from: K */
    static final List<C10381m> f40977K = C10543e.m53059t(C10381m.f41262h, C10381m.f41264j);

    /* renamed from: A */
    final C10389s f40978A;

    /* renamed from: B */
    final boolean f40979B;

    /* renamed from: C */
    final boolean f40980C;

    /* renamed from: D */
    final boolean f40981D;

    /* renamed from: E */
    final int f40982E;

    /* renamed from: F */
    final int f40983F;

    /* renamed from: G */
    final int f40984G;

    /* renamed from: H */
    final int f40985H;

    /* renamed from: I */
    final int f40986I;

    /* renamed from: a */
    final C10386p f40987a;

    /* renamed from: b */
    final Proxy f40988b;

    /* renamed from: c */
    final List<C10355b0> f40989c;

    /* renamed from: d */
    final List<C10381m> f40990d;

    /* renamed from: e */
    final List<C10399y> f40991e;

    /* renamed from: f */
    final List<C10399y> f40992f;

    /* renamed from: g */
    final C10391u.C10393b f40993g;

    /* renamed from: h */
    final ProxySelector f40994h;

    /* renamed from: i */
    final C10384o f40995i;

    /* renamed from: r */
    final C10618d f40996r;

    /* renamed from: s */
    final SocketFactory f40997s;

    /* renamed from: t */
    final SSLSocketFactory f40998t;

    /* renamed from: u */
    final C12177c f40999u;

    /* renamed from: v */
    final HostnameVerifier f41000v;

    /* renamed from: w */
    final C10372h f41001w;

    /* renamed from: x */
    final C10359d f41002x;

    /* renamed from: y */
    final C10359d f41003y;

    /* renamed from: z */
    final C10380l f41004z;

    /* renamed from: ge.a0$a */
    /* compiled from: OkHttpClient */
    class C10352a extends C10539a {
        C10352a() {
        }

        /* renamed from: a */
        public void mo33228a(C10395w.C10396a aVar, String str) {
            aVar.mo33411b(str);
        }

        /* renamed from: b */
        public void mo33229b(C10395w.C10396a aVar, String str, String str2) {
            aVar.mo33412c(str, str2);
        }

        /* renamed from: c */
        public void mo33230c(C10381m mVar, SSLSocket sSLSocket, boolean z) {
            mVar.mo33344a(sSLSocket, z);
        }

        /* renamed from: d */
        public int mo33231d(C10367f0.C10368a aVar) {
            return aVar.f41104c;
        }

        /* renamed from: e */
        public boolean mo33232e(C10350a aVar, C10350a aVar2) {
            return aVar.mo33189d(aVar2);
        }

        /* renamed from: f */
        public C11579c mo33233f(C10367f0 f0Var) {
            return f0Var.f41100u;
        }

        /* renamed from: g */
        public void mo33234g(C10367f0.C10368a aVar, C11579c cVar) {
            aVar.mo33311k(cVar);
        }

        /* renamed from: h */
        public C11585g mo33235h(C10380l lVar) {
            return lVar.f41258a;
        }
    }

    /* renamed from: ge.a0$b */
    /* compiled from: OkHttpClient */
    public static final class C10353b {

        /* renamed from: A */
        int f41005A;

        /* renamed from: a */
        C10386p f41006a = new C10386p();

        /* renamed from: b */
        Proxy f41007b;

        /* renamed from: c */
        List<C10355b0> f41008c = C10351a0.f40976J;

        /* renamed from: d */
        List<C10381m> f41009d = C10351a0.f40977K;

        /* renamed from: e */
        final List<C10399y> f41010e = new ArrayList();

        /* renamed from: f */
        final List<C10399y> f41011f = new ArrayList();

        /* renamed from: g */
        C10391u.C10393b f41012g = C10391u.m52460l(C10391u.f41297a);

        /* renamed from: h */
        ProxySelector f41013h;

        /* renamed from: i */
        C10384o f41014i;

        /* renamed from: j */
        C10618d f41015j;

        /* renamed from: k */
        SocketFactory f41016k;

        /* renamed from: l */
        SSLSocketFactory f41017l;

        /* renamed from: m */
        C12177c f41018m;

        /* renamed from: n */
        HostnameVerifier f41019n;

        /* renamed from: o */
        C10372h f41020o;

        /* renamed from: p */
        C10359d f41021p;

        /* renamed from: q */
        C10359d f41022q;

        /* renamed from: r */
        C10380l f41023r;

        /* renamed from: s */
        C10389s f41024s;

        /* renamed from: t */
        boolean f41025t;

        /* renamed from: u */
        boolean f41026u;

        /* renamed from: v */
        boolean f41027v;

        /* renamed from: w */
        int f41028w;

        /* renamed from: x */
        int f41029x;

        /* renamed from: y */
        int f41030y;

        /* renamed from: z */
        int f41031z;

        public C10353b() {
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f41013h = proxySelector;
            if (proxySelector == null) {
                this.f41013h = new C12120a();
            }
            this.f41014i = C10384o.f41286a;
            this.f41016k = SocketFactory.getDefault();
            this.f41019n = C12178d.f45262a;
            this.f41020o = C10372h.f41117c;
            C10359d dVar = C10359d.f41049a;
            this.f41021p = dVar;
            this.f41022q = dVar;
            this.f41023r = new C10380l();
            this.f41024s = C10389s.f41295a;
            this.f41025t = true;
            this.f41026u = true;
            this.f41027v = true;
            this.f41028w = 0;
            this.f41029x = 10000;
            this.f41030y = 10000;
            this.f41031z = 10000;
            this.f41005A = 0;
        }

        /* renamed from: a */
        public C10351a0 mo33236a() {
            return new C10351a0(this);
        }

        /* renamed from: b */
        public C10353b mo33237b(long j, TimeUnit timeUnit) {
            this.f41029x = C10543e.m53043d("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: c */
        public C10353b mo33238c(long j, TimeUnit timeUnit) {
            this.f41030y = C10543e.m53043d("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: d */
        public C10353b mo33239d(long j, TimeUnit timeUnit) {
            this.f41031z = C10543e.m53043d("timeout", j, timeUnit);
            return this;
        }
    }

    static {
        C10539a.f41555a = new C10352a();
    }

    public C10351a0() {
        this(new C10353b());
    }

    /* renamed from: s */
    private static SSLSocketFactory m52260s(X509TrustManager x509TrustManager) {
        try {
            SSLContext m = C12008f.m57887l().mo36360m();
            m.init((KeyManager[]) null, new TrustManager[]{x509TrustManager}, (SecureRandom) null);
            return m.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }

    /* renamed from: A */
    public int mo33201A() {
        return this.f40984G;
    }

    /* renamed from: B */
    public boolean mo33202B() {
        return this.f40981D;
    }

    /* renamed from: C */
    public SocketFactory mo33203C() {
        return this.f40997s;
    }

    /* renamed from: D */
    public SSLSocketFactory mo33204D() {
        return this.f40998t;
    }

    /* renamed from: E */
    public int mo33205E() {
        return this.f40985H;
    }

    /* renamed from: a */
    public C10359d mo33206a() {
        return this.f41003y;
    }

    /* renamed from: b */
    public int mo33207b() {
        return this.f40982E;
    }

    /* renamed from: c */
    public C10372h mo33208c() {
        return this.f41001w;
    }

    /* renamed from: d */
    public int mo33209d() {
        return this.f40983F;
    }

    /* renamed from: e */
    public C10380l mo33210e() {
        return this.f41004z;
    }

    /* renamed from: f */
    public List<C10381m> mo33211f() {
        return this.f40990d;
    }

    /* renamed from: g */
    public C10384o mo33212g() {
        return this.f40995i;
    }

    /* renamed from: h */
    public C10386p mo33213h() {
        return this.f40987a;
    }

    /* renamed from: i */
    public C10389s mo33214i() {
        return this.f40978A;
    }

    /* renamed from: j */
    public C10391u.C10393b mo33215j() {
        return this.f40993g;
    }

    /* renamed from: k */
    public boolean mo33216k() {
        return this.f40980C;
    }

    /* renamed from: l */
    public boolean mo33217l() {
        return this.f40979B;
    }

    /* renamed from: m */
    public HostnameVerifier mo33218m() {
        return this.f41000v;
    }

    /* renamed from: n */
    public List<C10399y> mo33219n() {
        return this.f40991e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C10618d mo33220o() {
        return this.f40996r;
    }

    /* renamed from: p */
    public List<C10399y> mo33221p() {
        return this.f40992f;
    }

    /* renamed from: r */
    public C10366f mo33222r(C10360d0 d0Var) {
        return C10357c0.m52305f(this, d0Var, false);
    }

    /* renamed from: u */
    public int mo33223u() {
        return this.f40986I;
    }

    /* renamed from: v */
    public List<C10355b0> mo33224v() {
        return this.f40989c;
    }

    /* renamed from: x */
    public Proxy mo33225x() {
        return this.f40988b;
    }

    /* renamed from: y */
    public C10359d mo33226y() {
        return this.f41002x;
    }

    /* renamed from: z */
    public ProxySelector mo33227z() {
        return this.f40994h;
    }

    C10351a0(C10353b bVar) {
        boolean z;
        this.f40987a = bVar.f41006a;
        this.f40988b = bVar.f41007b;
        this.f40989c = bVar.f41008c;
        List<C10381m> list = bVar.f41009d;
        this.f40990d = list;
        this.f40991e = C10543e.m53058s(bVar.f41010e);
        this.f40992f = C10543e.m53058s(bVar.f41011f);
        this.f40993g = bVar.f41012g;
        this.f40994h = bVar.f41013h;
        this.f40995i = bVar.f41014i;
        this.f40996r = bVar.f41015j;
        this.f40997s = bVar.f41016k;
        Iterator<C10381m> it = list.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C10381m next = it.next();
                if (z || next.mo33347d()) {
                    z = true;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f41017l;
        if (sSLSocketFactory != null || !z) {
            this.f40998t = sSLSocketFactory;
            this.f40999u = bVar.f41018m;
        } else {
            X509TrustManager C = C10543e.m53030C();
            this.f40998t = m52260s(C);
            this.f40999u = C12177c.m58464b(C);
        }
        if (this.f40998t != null) {
            C12008f.m57887l().mo36373f(this.f40998t);
        }
        this.f41000v = bVar.f41019n;
        this.f41001w = bVar.f41020o.mo33328f(this.f40999u);
        this.f41002x = bVar.f41021p;
        this.f41003y = bVar.f41022q;
        this.f41004z = bVar.f41023r;
        this.f40978A = bVar.f41024s;
        this.f40979B = bVar.f41025t;
        this.f40980C = bVar.f41026u;
        this.f40981D = bVar.f41027v;
        this.f40982E = bVar.f41028w;
        this.f40983F = bVar.f41029x;
        this.f40984G = bVar.f41030y;
        this.f40985H = bVar.f41031z;
        this.f40986I = bVar.f41005A;
        if (this.f40991e.contains((Object) null)) {
            throw new IllegalStateException("Null interceptor: " + this.f40991e);
        } else if (this.f40992f.contains((Object) null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f40992f);
        }
    }
}
