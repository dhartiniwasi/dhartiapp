package p282ke;

import java.io.IOException;
import java.net.ProtocolException;
import p244ge.C10360d0;
import p244ge.C10367f0;
import p244ge.C10399y;
import p253he.C10543e;
import p273je.C11579c;
import p336qe.C12233d;
import p336qe.C12241l;

/* renamed from: ke.b */
/* compiled from: CallServerInterceptor */
public final class C11634b implements C10399y {

    /* renamed from: a */
    private final boolean f44197a;

    public C11634b(boolean z) {
        this.f44197a = z;
    }

    /* renamed from: a */
    public C10367f0 mo33446a(C10399y.C10400a aVar) throws IOException {
        boolean z;
        C10367f0 f0Var;
        C11640g gVar = (C11640g) aVar;
        C11579c f = gVar.mo35800f();
        C10360d0 e = gVar.mo33451e();
        long currentTimeMillis = System.currentTimeMillis();
        f.mo35691p(e);
        C10367f0.C10368a aVar2 = null;
        if (!C11639f.m56735b(e.mo33258f()) || e.mo33253a() == null) {
            f.mo35685j();
            z = false;
        } else {
            if ("100-continue".equalsIgnoreCase(e.mo33255c("Expect"))) {
                f.mo35682g();
                f.mo35689n();
                aVar2 = f.mo35687l(true);
                z = true;
            } else {
                z = false;
            }
            if (aVar2 != null) {
                f.mo35685j();
                if (!f.mo35678c().mo35708n()) {
                    f.mo35684i();
                }
            } else if (e.mo33253a().mo33286e()) {
                f.mo35682g();
                e.mo33253a().mo33288g(C12241l.m58806a(f.mo35679d(e, true)));
            } else {
                C12233d a = C12241l.m58806a(f.mo35679d(e, false));
                e.mo33253a().mo33288g(a);
                a.close();
            }
        }
        if (e.mo33253a() == null || !e.mo33253a().mo33286e()) {
            f.mo35681f();
        }
        if (!z) {
            f.mo35689n();
        }
        if (aVar2 == null) {
            aVar2 = f.mo35687l(false);
        }
        C10367f0 c = aVar2.mo33317q(e).mo33308h(f.mo35678c().mo35705k()).mo33318r(currentTimeMillis).mo33316p(System.currentTimeMillis()).mo33305c();
        int f2 = c.mo33292f();
        if (f2 == 100) {
            c = f.mo35687l(false).mo33317q(e).mo33308h(f.mo35678c().mo35705k()).mo33318r(currentTimeMillis).mo33316p(System.currentTimeMillis()).mo33305c();
            f2 = c.mo33292f();
        }
        f.mo35688m(c);
        if (!this.f44197a || f2 != 101) {
            f0Var = c.mo33297p().mo33304b(f.mo35686k(c)).mo33305c();
        } else {
            f0Var = c.mo33297p().mo33304b(C10543e.f41563d).mo33305c();
        }
        if ("close".equalsIgnoreCase(f0Var.mo33301w().mo33255c("Connection")) || "close".equalsIgnoreCase(f0Var.mo33294h("Connection"))) {
            f.mo35684i();
        }
        if ((f2 != 204 && f2 != 205) || f0Var.mo33289a().mo33323f() <= 0) {
            return f0Var;
        }
        throw new ProtocolException("HTTP " + f2 + " had non-zero Content-Length: " + f0Var.mo33289a().mo33323f());
    }
}
