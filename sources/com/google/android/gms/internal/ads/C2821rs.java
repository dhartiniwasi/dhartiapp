package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.rs */
/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class C2821rs implements Runnable {

    /* renamed from: a */
    final ValueCallback f17084a;

    /* renamed from: b */
    final /* synthetic */ C2524js f17085b;

    /* renamed from: c */
    final /* synthetic */ WebView f17086c;

    /* renamed from: d */
    final /* synthetic */ boolean f17087d;

    /* renamed from: e */
    final /* synthetic */ C2895ts f17088e;

    C2821rs(C2895ts tsVar, C2524js jsVar, WebView webView, boolean z) {
        this.f17088e = tsVar;
        this.f17085b = jsVar;
        this.f17086c = webView;
        this.f17087d = z;
        this.f17084a = new C2784qs(this, jsVar, webView, z);
    }

    public final void run() {
        if (this.f17086c.getSettings().getJavaScriptEnabled()) {
            try {
                this.f17086c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f17084a);
            } catch (Throwable unused) {
                this.f17084a.onReceiveValue("");
            }
        }
    }
}
