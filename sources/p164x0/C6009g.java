package p164x0;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;
import p158w0.C5887m;

/* renamed from: x0.g */
/* compiled from: ApiHelperForQ */
public class C6009g {
    @Deprecated
    /* renamed from: a */
    public static int m35396a(WebSettings webSettings) {
        return webSettings.getForceDark();
    }

    /* renamed from: b */
    public static WebViewRenderProcess m35397b(WebView webView) {
        return webView.getWebViewRenderProcess();
    }

    /* renamed from: c */
    public static WebViewRenderProcessClient m35398c(WebView webView) {
        return webView.getWebViewRenderProcessClient();
    }

    @Deprecated
    /* renamed from: d */
    public static void m35399d(WebSettings webSettings, int i) {
        webSettings.setForceDark(i);
    }

    /* renamed from: e */
    public static void m35400e(WebView webView, Executor executor, C5887m mVar) {
        webView.setWebViewRenderProcessClient(executor, mVar != null ? new C5997a0(mVar) : null);
    }

    /* renamed from: f */
    public static void m35401f(WebView webView, C5887m mVar) {
        webView.setWebViewRenderProcessClient(mVar != null ? new C5997a0(mVar) : null);
    }

    /* renamed from: g */
    public static boolean m35402g(WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }
}
