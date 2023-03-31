package p144t5;

import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: t5.h0 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class C5556h0 extends WebViewClient {

    /* renamed from: a */
    final /* synthetic */ C5560i0 f28104a;

    /* synthetic */ C5556h0(C5560i0 i0Var, C5552g0 g0Var) {
        this.f28104a = i0Var;
    }

    public final void onLoadResource(WebView webView, String str) {
        if (C5560i0.m33620c(this.f28104a, str)) {
            this.f28104a.f28118b.mo19888c(str);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        if (!this.f28104a.f28119c) {
            Log.d("UserMessagingPlatform", "Wall html loaded.");
            boolean unused = this.f28104a.f28119c = true;
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f28104a.f28118b.mo19889d(i, str, str2);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String uri = webResourceRequest.getUrl().toString();
        if (!C5560i0.m33620c(this.f28104a, uri)) {
            return false;
        }
        this.f28104a.f28118b.mo19888c(uri);
        return true;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!C5560i0.m33620c(this.f28104a, str)) {
            return false;
        }
        this.f28104a.f28118b.mo19888c(str);
        return true;
    }
}
