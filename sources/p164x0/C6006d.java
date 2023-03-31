package p164x0;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: x0.d */
/* compiled from: ApiHelperForO */
public class C6006d {
    /* renamed from: a */
    public static PackageInfo m35379a() {
        return WebView.getCurrentWebViewPackage();
    }

    /* renamed from: b */
    public static boolean m35380b(WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    /* renamed from: c */
    public static WebChromeClient m35381c(WebView webView) {
        return webView.getWebChromeClient();
    }

    /* renamed from: d */
    public static WebViewClient m35382d(WebView webView) {
        return webView.getWebViewClient();
    }

    /* renamed from: e */
    public static void m35383e(WebSettings webSettings, boolean z) {
        webSettings.setSafeBrowsingEnabled(z);
    }
}
