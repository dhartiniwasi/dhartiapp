package p164x0;

import android.webkit.ServiceWorkerWebSettings;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.ServiceWorkerWebSettingsBoundaryInterface;
import p158w0.C5876e;
import p164x0.C5988a;
import p345re.C12451a;

/* renamed from: x0.o */
/* compiled from: ServiceWorkerWebSettingsImpl */
public class C6018o extends C5876e {

    /* renamed from: a */
    private ServiceWorkerWebSettings f29233a;

    /* renamed from: b */
    private ServiceWorkerWebSettingsBoundaryInterface f29234b;

    public C6018o(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        this.f29233a = serviceWorkerWebSettings;
    }

    /* renamed from: i */
    private ServiceWorkerWebSettingsBoundaryInterface m35415i() {
        if (this.f29234b == null) {
            this.f29234b = (ServiceWorkerWebSettingsBoundaryInterface) C12451a.m59406a(ServiceWorkerWebSettingsBoundaryInterface.class, C6025v.m35447c().mo20719d(this.f29233a));
        }
        return this.f29234b;
    }

    /* renamed from: j */
    private ServiceWorkerWebSettings m35416j() {
        if (this.f29233a == null) {
            this.f29233a = C6025v.m35447c().mo20718c(Proxy.getInvocationHandler(this.f29234b));
        }
        return this.f29233a;
    }

    /* renamed from: a */
    public boolean mo20427a() {
        C5988a.C5991c cVar = C6024u.f29278m;
        if (cVar.mo20708c()) {
            return C6004c.m35354a(m35416j());
        }
        if (cVar.mo20709d()) {
            return m35415i().getAllowContentAccess();
        }
        throw C6024u.m35442a();
    }

    /* renamed from: b */
    public boolean mo20428b() {
        C5988a.C5991c cVar = C6024u.f29279n;
        if (cVar.mo20708c()) {
            return C6004c.m35355b(m35416j());
        }
        if (cVar.mo20709d()) {
            return m35415i().getAllowFileAccess();
        }
        throw C6024u.m35442a();
    }

    /* renamed from: c */
    public boolean mo20429c() {
        C5988a.C5991c cVar = C6024u.f29280o;
        if (cVar.mo20708c()) {
            return C6004c.m35356c(m35416j());
        }
        if (cVar.mo20709d()) {
            return m35415i().getBlockNetworkLoads();
        }
        throw C6024u.m35442a();
    }

    /* renamed from: d */
    public int mo20430d() {
        C5988a.C5991c cVar = C6024u.f29277l;
        if (cVar.mo20708c()) {
            return C6004c.m35357d(m35416j());
        }
        if (cVar.mo20709d()) {
            return m35415i().getCacheMode();
        }
        throw C6024u.m35442a();
    }

    /* renamed from: e */
    public void mo20431e(boolean z) {
        C5988a.C5991c cVar = C6024u.f29278m;
        if (cVar.mo20708c()) {
            C6004c.m35364k(m35416j(), z);
        } else if (cVar.mo20709d()) {
            m35415i().setAllowContentAccess(z);
        } else {
            throw C6024u.m35442a();
        }
    }

    /* renamed from: f */
    public void mo20432f(boolean z) {
        C5988a.C5991c cVar = C6024u.f29279n;
        if (cVar.mo20708c()) {
            C6004c.m35365l(m35416j(), z);
        } else if (cVar.mo20709d()) {
            m35415i().setAllowFileAccess(z);
        } else {
            throw C6024u.m35442a();
        }
    }

    /* renamed from: g */
    public void mo20433g(boolean z) {
        C5988a.C5991c cVar = C6024u.f29280o;
        if (cVar.mo20708c()) {
            C6004c.m35366m(m35416j(), z);
        } else if (cVar.mo20709d()) {
            m35415i().setBlockNetworkLoads(z);
        } else {
            throw C6024u.m35442a();
        }
    }

    /* renamed from: h */
    public void mo20434h(int i) {
        C5988a.C5991c cVar = C6024u.f29277l;
        if (cVar.mo20708c()) {
            C6004c.m35367n(m35416j(), i);
        } else if (cVar.mo20709d()) {
            m35415i().setCacheMode(i);
        } else {
            throw C6024u.m35442a();
        }
    }

    public C6018o(InvocationHandler invocationHandler) {
        this.f29234b = (ServiceWorkerWebSettingsBoundaryInterface) C12451a.m59406a(ServiceWorkerWebSettingsBoundaryInterface.class, invocationHandler);
    }
}
