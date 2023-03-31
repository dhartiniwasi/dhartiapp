package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class q03 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ WebView f16116a;

    /* renamed from: b */
    final /* synthetic */ String f16117b;

    q03(r03 r03, WebView webView, String str) {
        this.f16116a = webView;
        this.f16117b = str;
    }

    public final void run() {
        this.f16116a.loadUrl(this.f16117b);
    }
}
