package p164x0;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p345re.C12451a;

/* renamed from: x0.y */
/* compiled from: WebViewProviderFactoryAdapter */
public class C6030y implements C6029x {

    /* renamed from: a */
    final WebViewProviderFactoryBoundaryInterface f29295a;

    public C6030y(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f29295a = webViewProviderFactoryBoundaryInterface;
    }

    /* renamed from: a */
    public String[] mo20725a() {
        return this.f29295a.getSupportedFeatures();
    }

    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) C12451a.m59406a(WebViewProviderBoundaryInterface.class, this.f29295a.createWebView(webView));
    }

    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) C12451a.m59406a(ServiceWorkerControllerBoundaryInterface.class, this.f29295a.getServiceWorkerController());
    }

    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) C12451a.m59406a(StaticsBoundaryInterface.class, this.f29295a.getStatics());
    }

    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C12451a.m59406a(WebkitToCompatConverterBoundaryInterface.class, this.f29295a.getWebkitToCompatConverter());
    }
}
