package com.pichillilorenzo.flutter_inappwebview.in_app_webview;

import android.util.Log;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;
import p158w0.C5885k;
import p158w0.C5886l;
import p158w0.C5887m;
import p186ac.C6556k;

public class InAppWebViewRenderProcessClient extends C5887m {
    protected static final String LOG_TAG = "IAWRenderProcessClient";
    private final C6556k channel;

    public InAppWebViewRenderProcessClient(C6556k kVar) {
        this.channel = kVar;
    }

    /* access modifiers changed from: package-private */
    public void dispose() {
    }

    public void onRenderProcessResponsive(WebView webView, final C5886l lVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", webView.getUrl());
        this.channel.mo22160d("onRenderProcessResponsive", hashMap, new C6556k.C6561d() {
            public void error(String str, String str2, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", ");
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(str2);
                Log.e(InAppWebViewRenderProcessClient.LOG_TAG, sb.toString());
            }

            public void notImplemented() {
            }

            public void success(Object obj) {
                Integer num;
                if (obj != null && (num = (Integer) ((Map) obj).get("action")) != null && lVar != null && num.intValue() == 0 && C5885k.m34805a("WEB_VIEW_RENDERER_TERMINATE")) {
                    lVar.mo20447a();
                }
            }
        });
    }

    public void onRenderProcessUnresponsive(WebView webView, final C5886l lVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("url", webView.getUrl());
        this.channel.mo22160d("onRenderProcessUnresponsive", hashMap, new C6556k.C6561d() {
            public void error(String str, String str2, Object obj) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(", ");
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(str2);
                Log.e(InAppWebViewRenderProcessClient.LOG_TAG, sb.toString());
            }

            public void notImplemented() {
            }

            public void success(Object obj) {
                Integer num;
                if (obj != null && (num = (Integer) ((Map) obj).get("action")) != null && lVar != null && num.intValue() == 0 && C5885k.m34805a("WEB_VIEW_RENDERER_TERMINATE")) {
                    lVar.mo20447a();
                }
            }
        });
    }
}
