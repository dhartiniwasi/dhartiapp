package com.pichillilorenzo.flutter_inappwebview.types;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.JavaScriptBridgeJS;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p158w0.C5871a;
import p158w0.C5878g;
import p158w0.C5882j;
import p158w0.C5885k;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;

public class WebMessageListener implements C6556k.C6560c {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final String LOG_TAG = "WebMessageListener";
    public Set<String> allowedOriginRules;
    public C6556k channel;

    /* renamed from: id */
    public String f36287id;
    public String jsObjectName;
    public C5882j.C5884b listener;
    public C5871a replyProxy;
    public InAppWebViewInterface webView;

    public WebMessageListener(String str, InAppWebViewInterface inAppWebViewInterface, C6539c cVar, String str2, Set<String> set) {
        this.f36287id = str;
        this.webView = inAppWebViewInterface;
        this.jsObjectName = str2;
        this.allowedOriginRules = set;
        C6556k kVar = new C6556k(cVar, "com.pichillilorenzo/flutter_inappwebview_web_message_listener_" + this.f36287id + "_" + this.jsObjectName);
        this.channel = kVar;
        kVar.mo22161e(this);
        if (this.webView instanceof InAppWebView) {
            this.listener = new C5882j.C5884b() {
                public void onPostMessage(WebView webView, C5878g gVar, Uri uri, boolean z, C5871a aVar) {
                    WebMessageListener.this.replyProxy = aVar;
                    this.onPostMessage(gVar.mo20435a(), uri, z);
                }
            };
        }
    }

    public static WebMessageListener fromMap(InAppWebViewInterface inAppWebViewInterface, C6539c cVar, Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new WebMessageListener((String) map.get("id"), inAppWebViewInterface, cVar, (String) map.get("jsObjectName"), new HashSet((List) map.get("allowedOriginRules")));
    }

    private void postMessageForInAppWebView(String str, C6556k.C6561d dVar) {
        if (this.replyProxy != null && C5885k.m34805a("WEB_MESSAGE_LISTENER")) {
            this.replyProxy.mo20422a(str);
        }
        dVar.success(Boolean.TRUE);
    }

    public void assertOriginRulesValid() throws Exception {
        int i = 0;
        for (String next : this.allowedOriginRules) {
            if (next == null) {
                throw new Exception("allowedOriginRules[" + i + "] is null");
            } else if (next.isEmpty()) {
                throw new Exception("allowedOriginRules[" + i + "] is empty");
            } else if (!"*".equals(next)) {
                Uri parse = Uri.parse(next);
                String scheme = parse.getScheme();
                String host = parse.getHost();
                String path = parse.getPath();
                int port = parse.getPort();
                if (scheme == null) {
                    throw new Exception("allowedOriginRules " + next + " is invalid");
                } else if (("http".equals(scheme) || "https".equals(scheme)) && (host == null || host.isEmpty())) {
                    throw new Exception("allowedOriginRules " + next + " is invalid");
                } else if (!"http".equals(scheme) && !"https".equals(scheme) && (host != null || port != -1)) {
                    throw new Exception("allowedOriginRules " + next + " is invalid");
                } else if ((host == null || host.isEmpty()) && port != -1) {
                    throw new Exception("allowedOriginRules " + next + " is invalid");
                } else if (path.isEmpty()) {
                    if (host != null) {
                        int indexOf = host.indexOf("*");
                        if (indexOf != 0 || (indexOf == 0 && !host.startsWith("*."))) {
                            throw new Exception("allowedOriginRules " + next + " is invalid");
                        } else if (host.startsWith("[")) {
                            if (!host.endsWith("]")) {
                                throw new Exception("allowedOriginRules " + next + " is invalid");
                            } else if (!Util.isIPv6(host.substring(1, host.length() - 1))) {
                                throw new Exception("allowedOriginRules " + next + " is invalid");
                            }
                        }
                    }
                    i++;
                } else {
                    throw new Exception("allowedOriginRules " + next + " is invalid");
                }
            }
        }
    }

    public void dispose() {
        this.channel.mo22161e((C6556k.C6560c) null);
        this.listener = null;
        this.replyProxy = null;
        this.webView = null;
    }

    public void initJsInstance() {
        String str;
        if (this.webView != null) {
            String replaceAll = Util.replaceAll(this.jsObjectName, "'", "\\'");
            ArrayList arrayList = new ArrayList();
            for (String next : this.allowedOriginRules) {
                if ("*".equals(next)) {
                    arrayList.add("'*'");
                } else {
                    Uri parse = Uri.parse(next);
                    Object obj = "null";
                    if (parse.getHost() != null) {
                        str = "'" + Util.replaceAll(parse.getHost(), "'", "\\'") + "'";
                    } else {
                        str = obj;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("{scheme: '");
                    sb.append(parse.getScheme());
                    sb.append("', host: ");
                    sb.append(str);
                    sb.append(", port: ");
                    Object obj2 = obj;
                    if (parse.getPort() != -1) {
                        obj2 = Integer.valueOf(parse.getPort());
                    }
                    sb.append(obj2);
                    sb.append("}");
                    arrayList.add(sb.toString());
                }
            }
            String str2 = "(function() {  var allowedOriginRules = [" + TextUtils.join(", ", arrayList) + "];  var isPageBlank = window.location.href === 'about:blank';  var scheme = !isPageBlank ? window.location.protocol.replace(':', '') : null;  var host = !isPageBlank ? window.location.hostname : null;  var port = !isPageBlank ? window.location.port : null;  if (window." + JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME + "._isOriginAllowed(allowedOriginRules, scheme, host, port)) {      window['" + replaceAll + "'] = new FlutterInAppWebViewWebMessageListener('" + replaceAll + "');  }})();";
            this.webView.getUserContentController().addPluginScript(new PluginScript("WebMessageListener-" + this.jsObjectName, str2, UserScriptInjectionTime.AT_DOCUMENT_START, (ContentWorld) null, false));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isOriginAllowed(java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r11 = this;
            java.util.Set<java.lang.String> r0 = r11.allowedOriginRules
            java.util.Iterator r0 = r0.iterator()
        L_0x0006:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L_0x00fd
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "*"
            boolean r4 = r3.equals(r1)
            r5 = 1
            if (r4 == 0) goto L_0x001d
            return r5
        L_0x001d:
            if (r12 == 0) goto L_0x0006
            boolean r4 = r12.isEmpty()
            if (r4 == 0) goto L_0x0026
            goto L_0x0006
        L_0x0026:
            boolean r4 = r12.isEmpty()
            r6 = -1
            if (r4 == 0) goto L_0x003a
            if (r13 == 0) goto L_0x0035
            boolean r4 = r13.isEmpty()
            if (r4 == 0) goto L_0x003a
        L_0x0035:
            if (r14 == 0) goto L_0x0006
            if (r14 != r6) goto L_0x003a
            goto L_0x0006
        L_0x003a:
            android.net.Uri r1 = android.net.Uri.parse(r1)
            int r4 = r1.getPort()
            r7 = 443(0x1bb, float:6.21E-43)
            r8 = 80
            java.lang.String r9 = "https"
            if (r4 == r6) goto L_0x0056
            int r4 = r1.getPort()
            if (r4 != 0) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            int r4 = r1.getPort()
            goto L_0x0065
        L_0x0056:
            java.lang.String r4 = r1.getScheme()
            boolean r4 = r9.equals(r4)
            if (r4 == 0) goto L_0x0063
            r4 = 443(0x1bb, float:6.21E-43)
            goto L_0x0065
        L_0x0063:
            r4 = 80
        L_0x0065:
            if (r14 == 0) goto L_0x006c
            if (r14 != r6) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r7 = r14
            goto L_0x0075
        L_0x006c:
            boolean r6 = r9.equals(r12)
            if (r6 == 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r7 = 80
        L_0x0075:
            java.lang.String r6 = r1.getHost()
            r8 = 0
            if (r6 == 0) goto L_0x009e
            java.lang.String r6 = r1.getHost()
            java.lang.String r9 = "["
            boolean r6 = r6.startsWith(r9)
            if (r6 == 0) goto L_0x009e
            java.lang.String r6 = r1.getHost()     // Catch:{ Exception -> 0x009e }
            java.lang.String r9 = r1.getHost()     // Catch:{ Exception -> 0x009e }
            int r9 = r9.length()     // Catch:{ Exception -> 0x009e }
            int r9 = r9 - r5
            java.lang.String r6 = r6.substring(r5, r9)     // Catch:{ Exception -> 0x009e }
            java.lang.String r6 = com.pichillilorenzo.flutter_inappwebview.Util.normalizeIPv6(r6)     // Catch:{ Exception -> 0x009e }
            goto L_0x009f
        L_0x009e:
            r6 = r8
        L_0x009f:
            java.lang.String r8 = com.pichillilorenzo.flutter_inappwebview.Util.normalizeIPv6(r13)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00a5
        L_0x00a4:
        L_0x00a5:
            java.lang.String r9 = r1.getScheme()
            boolean r9 = r9.equals(r12)
            java.lang.String r10 = r1.getHost()
            if (r10 == 0) goto L_0x00f2
            java.lang.String r10 = r1.getHost()
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x00f2
            java.lang.String r10 = r1.getHost()
            boolean r10 = r10.equals(r13)
            if (r10 != 0) goto L_0x00f2
            java.lang.String r10 = r1.getHost()
            boolean r3 = r10.startsWith(r3)
            if (r3 == 0) goto L_0x00e5
            if (r13 == 0) goto L_0x00e5
            java.lang.String r1 = r1.getHost()
            java.lang.String r3 = "\\*"
            java.lang.String[] r1 = r1.split(r3)
            r1 = r1[r5]
            boolean r1 = r13.contains(r1)
            if (r1 != 0) goto L_0x00f2
        L_0x00e5:
            if (r8 == 0) goto L_0x00f0
            if (r6 == 0) goto L_0x00f0
            boolean r1 = r8.equals(r6)
            if (r1 == 0) goto L_0x00f0
            goto L_0x00f2
        L_0x00f0:
            r1 = 0
            goto L_0x00f3
        L_0x00f2:
            r1 = 1
        L_0x00f3:
            if (r4 != r7) goto L_0x00f6
            r2 = 1
        L_0x00f6:
            if (r9 == 0) goto L_0x0006
            if (r1 == 0) goto L_0x0006
            if (r2 == 0) goto L_0x0006
            return r5
        L_0x00fd:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pichillilorenzo.flutter_inappwebview.types.WebMessageListener.isOriginAllowed(java.lang.String, java.lang.String, int):boolean");
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        String str = jVar.f30999a;
        str.hashCode();
        if (!str.equals("postMessage")) {
            dVar.notImplemented();
        } else if (this.webView instanceof InAppWebView) {
            postMessageForInAppWebView((String) jVar.mo22156a("message"), dVar);
        } else {
            dVar.success(Boolean.TRUE);
        }
    }

    public void onPostMessage(String str, Uri uri, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("message", str);
        hashMap.put("sourceOrigin", uri.toString().equals("null") ? null : uri.toString());
        hashMap.put("isMainFrame", Boolean.valueOf(z));
        this.channel.mo22159c("onPostMessage", hashMap);
    }
}
