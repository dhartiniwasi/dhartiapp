package p164x0;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* renamed from: x0.x */
/* compiled from: WebViewProviderFactory */
public interface C6029x {
    /* renamed from: a */
    String[] mo20725a();

    WebViewProviderBoundaryInterface createWebView(WebView webView);

    ServiceWorkerControllerBoundaryInterface getServiceWorkerController();

    StaticsBoundaryInterface getStatics();

    WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();
}
