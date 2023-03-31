package com.startapp;

import android.webkit.WebView;

/* renamed from: com.startapp.qe */
/* compiled from: Sta */
public class C9251qe implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ WebView f38132a;

    /* renamed from: b */
    public final /* synthetic */ String f38133b;

    public C9251qe(WebView webView, String str) {
        this.f38132a = webView;
        this.f38133b = str;
    }

    public void run() {
        this.f38132a.loadUrl(this.f38133b);
    }
}
