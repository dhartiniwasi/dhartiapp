package p164x0;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import p158w0.C5887m;

/* renamed from: x0.a0 */
/* compiled from: WebViewRenderProcessClientFrameworkAdapter */
public class C5997a0 extends WebViewRenderProcessClient {

    /* renamed from: a */
    private C5887m f29214a;

    public C5997a0(C5887m mVar) {
        this.f29214a = mVar;
    }

    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f29214a.onRenderProcessResponsive(webView, C6002b0.m35351b(webViewRenderProcess));
    }

    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f29214a.onRenderProcessUnresponsive(webView, C6002b0.m35351b(webViewRenderProcess));
    }
}
