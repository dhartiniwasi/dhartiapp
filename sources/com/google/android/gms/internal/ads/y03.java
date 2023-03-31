package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public class y03 {

    /* renamed from: a */
    private x13 f20411a = new x13((WebView) null);

    /* renamed from: b */
    private long f20412b;

    /* renamed from: c */
    private int f20413c;

    public y03() {
        mo15263b();
    }

    /* renamed from: a */
    public final WebView mo15262a() {
        return (WebView) this.f20411a.get();
    }

    /* renamed from: b */
    public final void mo15263b() {
        this.f20412b = System.nanoTime();
        this.f20413c = 1;
    }

    /* renamed from: c */
    public void mo8644c() {
        this.f20411a.clear();
    }

    /* renamed from: d */
    public final void mo15264d(String str, long j) {
        if (j >= this.f20412b && this.f20413c != 3) {
            this.f20413c = 3;
            r03.m19513a().mo13638f(mo15262a(), str);
        }
    }

    /* renamed from: e */
    public final void mo15265e(String str, long j) {
        if (j >= this.f20412b) {
            this.f20413c = 2;
            r03.m19513a().mo13638f(mo15262a(), str);
        }
    }

    /* renamed from: f */
    public void mo8645f(a03 a03, yz2 yz2) {
        mo15266g(a03, yz2, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo15266g(a03 a03, yz2 yz2, JSONObject jSONObject) {
        String h = a03.mo8163h();
        JSONObject jSONObject2 = new JSONObject();
        c13.m10680h(jSONObject2, "environment", "app");
        c13.m10680h(jSONObject2, "adSessionType", yz2.mo15525d());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        c13.m10680h(jSONObject3, "deviceType", str + "; " + str2);
        c13.m10680h(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        c13.m10680h(jSONObject3, "os", "Android");
        c13.m10680h(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c13.m10680h(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        c13.m10680h(jSONObject4, "partnerName", yz2.mo15526e().mo10372b());
        c13.m10680h(jSONObject4, "partnerVersion", yz2.mo15526e().mo10373c());
        c13.m10680h(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        c13.m10680h(jSONObject5, "libraryVersion", "1.3.31-google_20220407");
        c13.m10680h(jSONObject5, "appId", p03.m18265b().mo13097a().getApplicationContext().getPackageName());
        c13.m10680h(jSONObject2, "app", jSONObject5);
        if (yz2.mo15527f() != null) {
            c13.m10680h(jSONObject2, "contentUrl", yz2.mo15527f());
        }
        c13.m10680h(jSONObject2, "customReferenceData", yz2.mo15528g());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = yz2.mo15529h().iterator();
        if (!it.hasNext()) {
            r03.m19513a().mo13639g(mo15262a(), h, jSONObject2, jSONObject6, jSONObject);
        } else {
            h03 h03 = (h03) it.next();
            throw null;
        }
    }

    /* renamed from: h */
    public final void mo15267h(float f) {
        r03.m19513a().mo13637e(mo15262a(), f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo15268i(WebView webView) {
        this.f20411a = new x13(webView);
    }

    /* renamed from: j */
    public void mo8646j() {
    }

    /* renamed from: k */
    public final boolean mo15269k() {
        return this.f20411a.get() != null;
    }
}
