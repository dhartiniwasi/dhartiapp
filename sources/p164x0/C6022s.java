package p164x0;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import p158w0.C5878g;
import p158w0.C5879h;
import p164x0.C5988a;
import p345re.C12451a;

/* renamed from: x0.s */
/* compiled from: WebMessagePortImpl */
public class C6022s extends C5879h {

    /* renamed from: a */
    private WebMessagePort f29238a;

    /* renamed from: b */
    private WebMessagePortBoundaryInterface f29239b;

    public C6022s(WebMessagePort webMessagePort) {
        this.f29238a = webMessagePort;
    }

    /* renamed from: f */
    public static WebMessage m35427f(C5878g gVar) {
        return C5998b.m35339b(gVar);
    }

    /* renamed from: g */
    public static WebMessagePort[] m35428g(C5879h[] hVarArr) {
        if (hVarArr == null) {
            return null;
        }
        int length = hVarArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i = 0; i < length; i++) {
            webMessagePortArr[i] = hVarArr[i].mo20438b();
        }
        return webMessagePortArr;
    }

    /* renamed from: h */
    public static C5878g m35429h(WebMessage webMessage) {
        return C5998b.m35341d(webMessage);
    }

    /* renamed from: i */
    private WebMessagePortBoundaryInterface m35430i() {
        if (this.f29239b == null) {
            this.f29239b = (WebMessagePortBoundaryInterface) C12451a.m59406a(WebMessagePortBoundaryInterface.class, C6025v.m35447c().mo20721f(this.f29238a));
        }
        return this.f29239b;
    }

    /* renamed from: j */
    private WebMessagePort m35431j() {
        if (this.f29238a == null) {
            this.f29238a = C6025v.m35447c().mo20720e(Proxy.getInvocationHandler(this.f29239b));
        }
        return this.f29238a;
    }

    /* renamed from: k */
    public static C5879h[] m35432k(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        C5879h[] hVarArr = new C5879h[webMessagePortArr.length];
        for (int i = 0; i < webMessagePortArr.length; i++) {
            hVarArr[i] = new C6022s(webMessagePortArr[i]);
        }
        return hVarArr;
    }

    /* renamed from: a */
    public void mo20437a() {
        C5988a.C5990b bVar = C6024u.f29243B;
        if (bVar.mo20708c()) {
            C5998b.m35338a(m35431j());
        } else if (bVar.mo20709d()) {
            m35430i().close();
        } else {
            throw C6024u.m35442a();
        }
    }

    /* renamed from: b */
    public WebMessagePort mo20438b() {
        return m35431j();
    }

    /* renamed from: c */
    public InvocationHandler mo20439c() {
        return Proxy.getInvocationHandler(m35430i());
    }

    /* renamed from: d */
    public void mo20440d(C5878g gVar) {
        C5988a.C5990b bVar = C6024u.f29242A;
        if (bVar.mo20708c()) {
            C5998b.m35345h(m35431j(), m35427f(gVar));
        } else if (bVar.mo20709d()) {
            m35430i().postMessage(C12451a.m59408c(new C6019p(gVar)));
        } else {
            throw C6024u.m35442a();
        }
    }

    /* renamed from: e */
    public void mo20441e(C5879h.C5880a aVar) {
        C5988a.C5990b bVar = C6024u.f29244C;
        if (bVar.mo20708c()) {
            C5998b.m35349l(m35431j(), aVar);
        } else if (bVar.mo20709d()) {
            m35430i().setWebMessageCallback(C12451a.m59408c(new C6020q(aVar)));
        } else {
            throw C6024u.m35442a();
        }
    }

    public C6022s(InvocationHandler invocationHandler) {
        this.f29239b = (WebMessagePortBoundaryInterface) C12451a.m59406a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }
}
