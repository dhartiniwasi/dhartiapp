package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class b13 extends y03 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public WebView f7070d;

    /* renamed from: e */
    private Long f7071e = null;

    /* renamed from: f */
    private final Map f7072f;

    public b13(Map map, String str) {
        this.f7072f = map;
    }

    /* renamed from: c */
    public final void mo8644c() {
        long j;
        super.mo8644c();
        if (this.f7071e == null) {
            j = 4000;
        } else {
            j = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f7071e.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new a13(this), Math.max(4000 - j, 2000));
        this.f7070d = null;
    }

    /* renamed from: f */
    public final void mo8645f(a03 a03, yz2 yz2) {
        JSONObject jSONObject = new JSONObject();
        Map i = yz2.mo15530i();
        for (String str : i.keySet()) {
            c13.m10680h(jSONObject, str, (h03) i.get(str));
        }
        mo15266g(a03, yz2, jSONObject);
    }

    /* renamed from: j */
    public final void mo8646j() {
        WebView webView = new WebView(p03.m18265b().mo13097a());
        this.f7070d = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        mo15268i(this.f7070d);
        WebView webView2 = this.f7070d;
        if (webView2 != null && !TextUtils.isEmpty((CharSequence) null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator it = this.f7072f.keySet().iterator();
        if (!it.hasNext()) {
            this.f7071e = Long.valueOf(System.nanoTime());
            return;
        }
        h03 h03 = (h03) this.f7072f.get((String) it.next());
        throw null;
    }
}
