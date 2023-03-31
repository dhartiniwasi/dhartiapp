package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class r03 {

    /* renamed from: a */
    private static final r03 f16771a = new r03();

    private r03() {
    }

    /* renamed from: a */
    public static final r03 m19513a() {
        return f16771a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo13634b(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (r6 > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb.append("\"\"");
                    } else if (obj instanceof String) {
                        String obj2 = obj.toString();
                        if (obj2.startsWith("{")) {
                            sb.append(obj2);
                        } else {
                            sb.append('\"');
                            sb.append(obj2);
                            sb.append('\"');
                        }
                    } else {
                        sb.append(obj);
                    }
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                webView.loadUrl(sb2);
            } else {
                handler.post(new q03(this, webView, sb2));
            }
        } else {
            String concat = "The WebView is null for ".concat(str);
            if (tz2.f18300a.booleanValue() && !TextUtils.isEmpty(concat)) {
                Log.i("OMIDLIB", concat);
            }
        }
    }

    /* renamed from: c */
    public final void mo13635c(WebView webView) {
        mo13634b(webView, "finishSession", new Object[0]);
    }

    /* renamed from: d */
    public final void mo13636d(WebView webView, JSONObject jSONObject) {
        mo13634b(webView, "init", jSONObject);
    }

    /* renamed from: e */
    public final void mo13637e(WebView webView, float f) {
        mo13634b(webView, "setDeviceVolume", Float.valueOf(f));
    }

    /* renamed from: f */
    public final void mo13638f(WebView webView, String str) {
        mo13634b(webView, "setNativeViewHierarchy", str);
    }

    /* renamed from: g */
    public final void mo13639g(WebView webView, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        mo13634b(webView, "startSession", str, jSONObject, jSONObject2, jSONObject3);
    }
}
