package p282ke;

import java.io.IOException;
import java.util.List;
import p244ge.C10360d0;
import p244ge.C10364e0;
import p244ge.C10367f0;
import p244ge.C10383n;
import p244ge.C10384o;
import p244ge.C10399y;
import p253he.C10543e;
import p253he.C10544f;
import p336qe.C12239j;
import p336qe.C12241l;

/* renamed from: ke.a */
/* compiled from: BridgeInterceptor */
public final class C11633a implements C10399y {

    /* renamed from: a */
    private final C10384o f44196a;

    public C11633a(C10384o oVar) {
        this.f44196a = oVar;
    }

    /* renamed from: b */
    private String m56712b(List<C10383n> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            C10383n nVar = list.get(i);
            sb.append(nVar.mo33359c());
            sb.append('=');
            sb.append(nVar.mo33363k());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public C10367f0 mo33446a(C10399y.C10400a aVar) throws IOException {
        C10360d0 e = aVar.mo33451e();
        C10360d0.C10361a g = e.mo33259g();
        C10364e0 a = e.mo33253a();
        if (a != null) {
            a.mo33285b();
            long a2 = a.mo33284a();
            if (a2 != -1) {
                g.mo33264c("Content-Length", Long.toString(a2));
                g.mo33267f("Transfer-Encoding");
            } else {
                g.mo33264c("Transfer-Encoding", "chunked");
                g.mo33267f("Content-Length");
            }
        }
        boolean z = false;
        if (e.mo33255c("Host") == null) {
            g.mo33264c("Host", C10543e.m53057r(e.mo33260h(), false));
        }
        if (e.mo33255c("Connection") == null) {
            g.mo33264c("Connection", "Keep-Alive");
        }
        if (e.mo33255c("Accept-Encoding") == null && e.mo33255c("Range") == null) {
            z = true;
            g.mo33264c("Accept-Encoding", "gzip");
        }
        List<C10383n> b = this.f44196a.mo33366b(e.mo33260h());
        if (!b.isEmpty()) {
            g.mo33264c("Cookie", m56712b(b));
        }
        if (e.mo33255c("User-Agent") == null) {
            g.mo33264c("User-Agent", C10544f.m53066a());
        }
        C10367f0 c = aVar.mo33449c(g.mo33262a());
        C11638e.m56730e(this.f44196a, e.mo33260h(), c.mo33296n());
        C10367f0.C10368a q = c.mo33297p().mo33317q(e);
        if (z && "gzip".equalsIgnoreCase(c.mo33294h("Content-Encoding")) && C11638e.m56728c(c)) {
            C12239j jVar = new C12239j(c.mo33289a().mo33324m());
            q.mo33310j(c.mo33296n().mo33404f().mo33414e("Content-Encoding").mo33414e("Content-Length").mo33413d());
            q.mo33304b(new C11641h(c.mo33294h("Content-Type"), -1, C12241l.m58807b(jVar)));
        }
        return q.mo33305c();
    }
}
