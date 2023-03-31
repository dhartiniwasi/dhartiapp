package androidx.webkit;

import android.app.PendingIntent;
import android.os.Build;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import p158w0.C5872b;
import p158w0.C5881i;
import p158w0.C5885k;
import p164x0.C6015l;
import p164x0.C6023t;
import p164x0.C6024u;

public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {

    /* renamed from: a */
    private static final String[] f4359a = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    /* renamed from: b */
    public void mo5989b(WebView webView, WebResourceRequest webResourceRequest, C5881i iVar) {
        throw null;
    }

    /* renamed from: c */
    public void mo5990c(WebView webView, WebResourceRequest webResourceRequest, int i, C5872b bVar) {
        if (C5885k.m34805a("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            bVar.mo20423a(true);
            return;
        }
        throw C6024u.m35442a();
    }

    public final String[] getSupportedFeatures() {
        return f4359a;
    }

    public void onPageCommitVisible(WebView webView, String str) {
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        mo5989b(webView, webResourceRequest, new C6023t(invocationHandler));
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, InvocationHandler invocationHandler) {
        mo5990c(webView, webResourceRequest, i, new C6015l(invocationHandler));
    }

    public boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
        return false;
    }

    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23) {
            mo5989b(webView, webResourceRequest, new C6023t(webResourceError));
        }
    }

    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        mo5990c(webView, webResourceRequest, i, new C6015l(safeBrowsingResponse));
    }
}
