package p164x0;

import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: x0.c0 */
/* compiled from: WebkitToCompatConverter */
public class C6005c0 {

    /* renamed from: a */
    private final WebkitToCompatConverterBoundaryInterface f29222a;

    public C6005c0(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f29222a = webkitToCompatConverterBoundaryInterface;
    }

    /* renamed from: a */
    public SafeBrowsingResponse mo20716a(InvocationHandler invocationHandler) {
        return (SafeBrowsingResponse) this.f29222a.convertSafeBrowsingResponse(invocationHandler);
    }

    /* renamed from: b */
    public InvocationHandler mo20717b(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f29222a.convertSafeBrowsingResponse((Object) safeBrowsingResponse);
    }

    /* renamed from: c */
    public ServiceWorkerWebSettings mo20718c(InvocationHandler invocationHandler) {
        return (ServiceWorkerWebSettings) this.f29222a.convertServiceWorkerSettings(invocationHandler);
    }

    /* renamed from: d */
    public InvocationHandler mo20719d(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.f29222a.convertServiceWorkerSettings((Object) serviceWorkerWebSettings);
    }

    /* renamed from: e */
    public WebMessagePort mo20720e(InvocationHandler invocationHandler) {
        return (WebMessagePort) this.f29222a.convertWebMessagePort(invocationHandler);
    }

    /* renamed from: f */
    public InvocationHandler mo20721f(WebMessagePort webMessagePort) {
        return this.f29222a.convertWebMessagePort((Object) webMessagePort);
    }

    /* renamed from: g */
    public WebResourceError mo20722g(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f29222a.convertWebResourceError(invocationHandler);
    }

    /* renamed from: h */
    public InvocationHandler mo20723h(WebResourceError webResourceError) {
        return this.f29222a.convertWebResourceError((Object) webResourceError);
    }
}
