package p263ie;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p244ge.C10355b0;
import p244ge.C10360d0;
import p244ge.C10367f0;
import p244ge.C10370g0;
import p244ge.C10395w;
import p244ge.C10399y;
import p253he.C10539a;
import p253he.C10543e;
import p263ie.C10616c;
import p282ke.C11638e;
import p282ke.C11639f;
import p282ke.C11641h;
import p336qe.C12231c;
import p336qe.C12233d;
import p336qe.C12234e;
import p336qe.C12241l;
import p336qe.C12251s;
import p336qe.C12252t;
import p336qe.C12253u;

/* renamed from: ie.a */
/* compiled from: CacheInterceptor */
public final class C10613a implements C10399y {

    /* renamed from: a */
    final C10618d f41686a;

    /* renamed from: ie.a$a */
    /* compiled from: CacheInterceptor */
    class C10614a implements C12252t {

        /* renamed from: a */
        boolean f41687a;

        /* renamed from: b */
        final /* synthetic */ C12234e f41688b;

        /* renamed from: c */
        final /* synthetic */ C10615b f41689c;

        /* renamed from: d */
        final /* synthetic */ C12233d f41690d;

        C10614a(C12234e eVar, C10615b bVar, C12233d dVar) {
            this.f41688b = eVar;
            this.f41689c = bVar;
            this.f41690d = dVar;
        }

        public void close() throws IOException {
            if (!this.f41687a && !C10543e.m53054o(this, 100, TimeUnit.MILLISECONDS)) {
                this.f41687a = true;
                this.f41689c.mo33811a();
            }
            this.f41688b.close();
        }

        /* renamed from: o */
        public C12253u mo33809o() {
            return this.f41688b.mo33809o();
        }

        /* renamed from: z */
        public long mo33810z(C12231c cVar, long j) throws IOException {
            try {
                long z = this.f41688b.mo33810z(cVar, j);
                if (z == -1) {
                    if (!this.f41687a) {
                        this.f41687a = true;
                        this.f41690d.close();
                    }
                    return -1;
                }
                cVar.mo36796g(this.f41690d.mo36802j(), cVar.mo36771I() - z, z);
                this.f41690d.mo36803j0();
                return z;
            } catch (IOException e) {
                if (!this.f41687a) {
                    this.f41687a = true;
                    this.f41689c.mo33811a();
                }
                throw e;
            }
        }
    }

    public C10613a(C10618d dVar) {
        this.f41686a = dVar;
    }

    /* renamed from: b */
    private C10367f0 m53195b(C10615b bVar, C10367f0 f0Var) throws IOException {
        C12251s b;
        if (bVar == null || (b = bVar.mo33812b()) == null) {
            return f0Var;
        }
        C10614a aVar = new C10614a(f0Var.mo33289a().mo33324m(), bVar, C12241l.m58806a(b));
        return f0Var.mo33297p().mo33304b(new C11641h(f0Var.mo33294h("Content-Type"), f0Var.mo33289a().mo33323f(), C12241l.m58807b(aVar))).mo33305c();
    }

    /* renamed from: c */
    private static C10395w m53196c(C10395w wVar, C10395w wVar2) {
        C10395w.C10396a aVar = new C10395w.C10396a();
        int h = wVar.mo33405h();
        for (int i = 0; i < h; i++) {
            String e = wVar.mo33402e(i);
            String i2 = wVar.mo33407i(i);
            if ((!"Warning".equalsIgnoreCase(e) || !i2.startsWith("1")) && (m53197d(e) || !m53198e(e) || wVar2.mo33401c(e) == null)) {
                C10539a.f41555a.mo33229b(aVar, e, i2);
            }
        }
        int h2 = wVar2.mo33405h();
        for (int i3 = 0; i3 < h2; i3++) {
            String e2 = wVar2.mo33402e(i3);
            if (!m53197d(e2) && m53198e(e2)) {
                C10539a.f41555a.mo33229b(aVar, e2, wVar2.mo33407i(i3));
            }
        }
        return aVar.mo33413d();
    }

    /* renamed from: d */
    static boolean m53197d(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* renamed from: e */
    static boolean m53198e(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    /* renamed from: f */
    private static C10367f0 m53199f(C10367f0 f0Var) {
        return (f0Var == null || f0Var.mo33289a() == null) ? f0Var : f0Var.mo33297p().mo33304b((C10370g0) null).mo33305c();
    }

    /* renamed from: a */
    public C10367f0 mo33446a(C10399y.C10400a aVar) throws IOException {
        C10618d dVar = this.f41686a;
        C10367f0 a = dVar != null ? dVar.mo33814a(aVar.mo33451e()) : null;
        C10616c c = new C10616c.C10617a(System.currentTimeMillis(), aVar.mo33451e(), a).mo33813c();
        C10360d0 d0Var = c.f41692a;
        C10367f0 f0Var = c.f41693b;
        C10618d dVar2 = this.f41686a;
        if (dVar2 != null) {
            dVar2.mo33819f(c);
        }
        if (a != null && f0Var == null) {
            C10543e.m53045f(a.mo33289a());
        }
        if (d0Var == null && f0Var == null) {
            return new C10367f0.C10368a().mo33317q(aVar.mo33451e()).mo33315o(C10355b0.HTTP_1_1).mo33307g(504).mo33312l("Unsatisfiable Request (only-if-cached)").mo33304b(C10543e.f41563d).mo33318r(-1).mo33316p(System.currentTimeMillis()).mo33305c();
        }
        if (d0Var == null) {
            return f0Var.mo33297p().mo33306d(m53199f(f0Var)).mo33305c();
        }
        try {
            C10367f0 c2 = aVar.mo33449c(d0Var);
            if (c2 == null && a != null) {
            }
            if (f0Var != null) {
                if (c2.mo33292f() == 304) {
                    C10367f0 c3 = f0Var.mo33297p().mo33310j(m53196c(f0Var.mo33296n(), c2.mo33296n())).mo33318r(c2.mo33302x()).mo33316p(c2.mo33299t()).mo33306d(m53199f(f0Var)).mo33313m(m53199f(c2)).mo33305c();
                    c2.mo33289a().close();
                    this.f41686a.mo33815b();
                    this.f41686a.mo33816c(f0Var, c3);
                    return c3;
                }
                C10543e.m53045f(f0Var.mo33289a());
            }
            C10367f0 c4 = c2.mo33297p().mo33306d(m53199f(f0Var)).mo33313m(m53199f(c2)).mo33305c();
            if (this.f41686a != null) {
                if (C11638e.m56728c(c4) && C10616c.m53205a(c4, d0Var)) {
                    return m53195b(this.f41686a.mo33818e(c4), c4);
                }
                if (C11639f.m56734a(d0Var.mo33258f())) {
                    try {
                        this.f41686a.mo33817d(d0Var);
                    } catch (IOException unused) {
                    }
                }
            }
            return c4;
        } finally {
            if (a != null) {
                C10543e.m53045f(a.mo33289a());
            }
        }
    }
}
