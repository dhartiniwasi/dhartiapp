package p164x0;

import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import p158w0.C5873c;
import p158w0.C5874d;
import p158w0.C5876e;
import p164x0.C5988a;
import p345re.C12451a;

/* renamed from: x0.n */
/* compiled from: ServiceWorkerControllerImpl */
public class C6017n extends C5874d {

    /* renamed from: a */
    private ServiceWorkerController f29230a;

    /* renamed from: b */
    private ServiceWorkerControllerBoundaryInterface f29231b;

    /* renamed from: c */
    private final C5876e f29232c;

    public C6017n() {
        C5988a.C5991c cVar = C6024u.f29276k;
        if (cVar.mo20708c()) {
            this.f29230a = C6004c.m35360g();
            this.f29231b = null;
            this.f29232c = C6004c.m35362i(m35412e());
        } else if (cVar.mo20709d()) {
            this.f29230a = null;
            ServiceWorkerControllerBoundaryInterface serviceWorkerController = C6025v.m35448d().getServiceWorkerController();
            this.f29231b = serviceWorkerController;
            this.f29232c = new C6018o(serviceWorkerController.getServiceWorkerWebSettings());
        } else {
            throw C6024u.m35442a();
        }
    }

    /* renamed from: d */
    private ServiceWorkerControllerBoundaryInterface m35411d() {
        if (this.f29231b == null) {
            this.f29231b = C6025v.m35448d().getServiceWorkerController();
        }
        return this.f29231b;
    }

    /* renamed from: e */
    private ServiceWorkerController m35412e() {
        if (this.f29230a == null) {
            this.f29230a = C6004c.m35360g();
        }
        return this.f29230a;
    }

    /* renamed from: b */
    public C5876e mo20425b() {
        return this.f29232c;
    }

    /* renamed from: c */
    public void mo20426c(C5873c cVar) {
        C5988a.C5991c cVar2 = C6024u.f29276k;
        if (cVar2.mo20708c()) {
            if (cVar == null) {
                C6004c.m35369p(m35412e(), (ServiceWorkerClient) null);
            } else {
                C6004c.m35370q(m35412e(), cVar);
            }
        } else if (!cVar2.mo20709d()) {
            throw C6024u.m35442a();
        } else if (cVar == null) {
            m35411d().setServiceWorkerClient((InvocationHandler) null);
        } else {
            m35411d().setServiceWorkerClient(C12451a.m59408c(new C6016m(cVar)));
        }
    }
}
