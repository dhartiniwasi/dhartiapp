package com.startapp;

import android.webkit.WebView;
import p201ca.C6841a;

/* renamed from: com.startapp.sd */
/* compiled from: Sta */
public class C9285sd extends C6841a {
    public C9285sd(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        mo22941a(webView);
    }
}
