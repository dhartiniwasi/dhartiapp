package com.startapp;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p201ca.C6841a;

/* renamed from: com.startapp.zd */
/* compiled from: Sta */
public class C9686zd extends C6841a {

    /* renamed from: f */
    public WebView f39561f;

    /* renamed from: g */
    public Long f39562g = null;

    /* renamed from: h */
    public final Map<String, C8987gc> f39563h;

    /* renamed from: i */
    public final String f39564i;

    /* renamed from: com.startapp.zd$a */
    /* compiled from: Sta */
    public class C9687a implements Runnable {

        /* renamed from: a */
        public final WebView f39565a;

        public C9687a(C9686zd zdVar) {
            this.f39565a = zdVar.f39561f;
        }

        public void run() {
            this.f39565a.destroy();
        }
    }

    public C9686zd(Map<String, C8987gc> map, String str) {
        this.f39563h = map;
        this.f39564i = str;
    }

    /* renamed from: a */
    public void mo22943a(C9267rd rdVar, C9230q qVar) {
        JSONObject jSONObject = new JSONObject();
        Map<String, C8987gc> unmodifiableMap = Collections.unmodifiableMap(qVar.f38096d);
        for (String next : unmodifiableMap.keySet()) {
            C8919de.m48529a(jSONObject, next, unmodifiableMap.get(next));
        }
        mo22944a(rdVar, qVar, jSONObject);
    }

    /* renamed from: b */
    public void mo22946b() {
        long j;
        this.f31483a.clear();
        if (this.f39562g == null) {
            j = 4000;
        } else {
            j = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f39562g.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new C9687a(this), Math.max(4000 - j, 2000));
        this.f39561f = null;
    }

    /* renamed from: d */
    public void mo22949d() {
        WebView webView = new WebView(C9140me.f37312b.f37313a);
        this.f39561f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f31483a = new C8957fe(this.f39561f);
        WebView webView2 = this.f39561f;
        String str = this.f39564i;
        if (webView2 != null && !TextUtils.isEmpty(str)) {
            webView2.loadUrl("javascript: " + str);
        }
        for (String next : this.f39563h.keySet()) {
            String externalForm = this.f39563h.get(next).f36874b.toExternalForm();
            WebView webView3 = this.f39561f;
            if (externalForm != null && !TextUtils.isEmpty(next)) {
                String replace = "(function() {this.omidVerificationProperties = this.omidVerificationProperties || {};this.omidVerificationProperties.injectionId = '%INJECTION_ID%';var script=document.createElement('script');script.setAttribute(\"type\",\"text/javascript\");script.setAttribute(\"src\",\"%SCRIPT_SRC%\");document.body.appendChild(script);})();".replace("%SCRIPT_SRC%", externalForm).replace("%INJECTION_ID%", next);
                if (webView3 != null && !TextUtils.isEmpty(replace)) {
                    webView3.loadUrl("javascript: " + replace);
                }
            }
        }
        this.f39562g = Long.valueOf(System.nanoTime());
    }
}
