package com.startapp;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.C9396a;
import com.startapp.sdk.adsbase.remoteconfig.WvfMetadata;

/* renamed from: com.startapp.md */
/* compiled from: Sta */
public class C9139md {

    /* renamed from: a */
    public final Context f37307a;

    /* renamed from: b */
    public final C8908d3<WvfMetadata> f37308b;

    /* renamed from: c */
    public WebView f37309c;

    /* renamed from: d */
    public String f37310d;

    /* renamed from: e */
    public boolean f37311e;

    public C9139md(Context context, C8908d3<WvfMetadata> d3Var) {
        if (Build.VERSION.SDK_INT < 31 || context.isUiContext()) {
            this.f37307a = context;
        } else {
            this.f37307a = context.createWindowContext(((DisplayManager) context.getSystemService(DisplayManager.class)).getDisplay(0), 2, (Bundle) null);
        }
        this.f37308b = d3Var;
    }

    /* renamed from: a */
    public boolean mo29703a(int i) {
        WvfMetadata call = this.f37308b.call();
        return call != null && (call.mo31145a() & i) == i && Math.random() < call.mo31146b();
    }

    /* renamed from: b */
    public WebView mo29704b() {
        WebView webView = this.f37309c;
        if (webView == null) {
            webView = new WebView(this.f37307a);
            if (this.f37310d == null) {
                this.f37310d = webView.getSettings().getUserAgentString();
            }
        } else {
            this.f37309c = null;
            C9396a.m49784a((Runnable) new C9120ld(this));
        }
        return webView;
    }

    /* renamed from: a */
    public String mo29702a() {
        int i;
        String str = this.f37310d;
        long j = 0;
        if (str == null || str.length() < 1) {
            i = 0;
            if (Build.VERSION.SDK_INT > 16) {
                WvfMetadata call = this.f37308b.call();
                if (Math.random() < (call != null ? call.mo31147c() : (double) WvfMetadata.f38989a)) {
                    try {
                        long currentTimeMillis = System.currentTimeMillis();
                        str = WebSettings.getDefaultUserAgent(this.f37307a);
                        j = System.currentTimeMillis() - currentTimeMillis;
                        i = 2;
                    } catch (Throwable th) {
                        if (mo29703a(8)) {
                            C9023i4.m48681a(th);
                        }
                    }
                }
            }
            if (str == null || str.length() < 1) {
                try {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    str = System.getProperty("http.agent");
                    j = System.currentTimeMillis() - currentTimeMillis2;
                    i = 4;
                } catch (Throwable th2) {
                    if (mo29703a(16)) {
                        C9023i4.m48681a(th2);
                    }
                }
            }
        } else {
            i = 1;
        }
        if (!this.f37311e) {
            this.f37311e = true;
            if (mo29703a(i)) {
                C9023i4 i4Var = new C9023i4(C9043j4.f36993d);
                i4Var.f36952d = "WVF.gua";
                i4Var.f36957i = String.valueOf(i);
                i4Var.f36953e = str + ", " + j + " ms";
                i4Var.mo29471a();
            }
        }
        return str;
    }
}
