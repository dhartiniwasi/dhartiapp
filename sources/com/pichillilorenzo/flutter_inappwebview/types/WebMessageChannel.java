package com.pichillilorenzo.flutter_inappwebview.types;

import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.InAppWebView;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p158w0.C5878g;
import p158w0.C5879h;
import p158w0.C5882j;
import p158w0.C5885k;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;

public class WebMessageChannel implements C6556k.C6560c {
    static final String LOG_TAG = "WebMessageChannel";
    public C6556k channel;
    public final List<C5879h> compatPorts;

    /* renamed from: id */
    public String f36286id;
    public final List<WebMessagePort> ports;
    public InAppWebViewInterface webView;

    public WebMessageChannel(String str, InAppWebViewInterface inAppWebViewInterface) {
        this.f36286id = str;
        C6539c cVar = inAppWebViewInterface.getPlugin().messenger;
        C6556k kVar = new C6556k(cVar, "com.pichillilorenzo/flutter_inappwebview_web_message_channel_" + str);
        this.channel = kVar;
        kVar.mo22161e(this);
        if (inAppWebViewInterface instanceof InAppWebView) {
            this.compatPorts = new ArrayList(Arrays.asList(C5882j.m34793c((InAppWebView) inAppWebViewInterface)));
            this.ports = new ArrayList();
        } else {
            this.ports = Arrays.asList(new WebMessagePort[]{new WebMessagePort("port1", this), new WebMessagePort("port2", this)});
            this.compatPorts = new ArrayList();
        }
        this.webView = inAppWebViewInterface;
    }

    private void closeForInAppWebView(Integer num, C6556k.C6561d dVar) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !C5885k.m34805a("WEB_MESSAGE_PORT_CLOSE")) {
            dVar.success(Boolean.TRUE);
            return;
        }
        try {
            this.compatPorts.get(num.intValue()).mo20437a();
            dVar.success(Boolean.TRUE);
        } catch (Exception e) {
            dVar.error(LOG_TAG, e.getMessage(), (Object) null);
        }
    }

    private void postMessageForInAppWebView(Integer num, Map<String, Object> map, C6556k.C6561d dVar) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !C5885k.m34805a("WEB_MESSAGE_PORT_POST_MESSAGE")) {
            dVar.success(Boolean.TRUE);
            return;
        }
        C5879h hVar = this.compatPorts.get(num.intValue());
        ArrayList arrayList = new ArrayList();
        List<Map> list = (List) map.get("ports");
        if (list != null) {
            for (Map map2 : list) {
                Integer num2 = (Integer) map2.get("index");
                WebMessageChannel webMessageChannel = this.webView.getWebMessageChannels().get((String) map2.get("webMessageChannelId"));
                if (webMessageChannel != null) {
                    arrayList.add(webMessageChannel.compatPorts.get(num2.intValue()));
                }
            }
        }
        try {
            hVar.mo20440d(new C5878g((String) map.get(JsonStorageKeyNames.DATA_KEY), (C5879h[]) arrayList.toArray(new C5879h[0])));
            dVar.success(Boolean.TRUE);
        } catch (Exception e) {
            dVar.error(LOG_TAG, e.getMessage(), (Object) null);
        }
    }

    private void setWebMessageCallbackForInAppWebView(final Integer num, C6556k.C6561d dVar) {
        if (this.webView == null || this.compatPorts.size() <= 0 || !C5885k.m34805a("WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK")) {
            dVar.success(Boolean.TRUE);
            return;
        }
        try {
            this.compatPorts.get(num.intValue()).mo20441e(new C5879h.C5880a() {
                public void onMessage(C5879h hVar, C5878g gVar) {
                    super.onMessage(hVar, gVar);
                    HashMap hashMap = new HashMap();
                    hashMap.put("index", num);
                    hashMap.put("message", gVar != null ? gVar.mo20435a() : null);
                    WebMessageChannel.this.channel.mo22159c("onMessage", hashMap);
                }
            });
            dVar.success(Boolean.TRUE);
        } catch (Exception e) {
            dVar.error(LOG_TAG, e.getMessage(), (Object) null);
        }
    }

    public void dispose() {
        if (C5885k.m34805a("WEB_MESSAGE_PORT_CLOSE")) {
            for (C5879h a : this.compatPorts) {
                try {
                    a.mo20437a();
                } catch (Exception unused) {
                }
            }
        }
        this.channel.mo22161e((C6556k.C6560c) null);
        this.compatPorts.clear();
        this.webView = null;
    }

    public void initJsInstance(InAppWebViewInterface inAppWebViewInterface, final ValueCallback<WebMessageChannel> valueCallback) {
        if (inAppWebViewInterface != null) {
            inAppWebViewInterface.evaluateJavascript("(function() {window.flutter_inappwebview._webMessageChannels['" + this.f36286id + "'] = new MessageChannel();})();", (ContentWorld) null, new ValueCallback<String>() {
                public void onReceiveValue(String str) {
                    valueCallback.onReceiveValue(this);
                }
            });
            return;
        }
        valueCallback.onReceiveValue(this);
    }

    public void onMessage(Integer num, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("index", num);
        hashMap.put("message", str);
        this.channel.mo22159c("onMessage", hashMap);
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 94756344:
                if (str.equals("close")) {
                    c = 0;
                    break;
                }
                break;
            case 556190586:
                if (str.equals("setWebMessageCallback")) {
                    c = 1;
                    break;
                }
                break;
            case 1490029383:
                if (str.equals("postMessage")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (this.webView instanceof InAppWebView) {
                    closeForInAppWebView((Integer) jVar.mo22156a("index"), dVar);
                    return;
                } else {
                    dVar.success(Boolean.TRUE);
                    return;
                }
            case 1:
                if (this.webView instanceof InAppWebView) {
                    setWebMessageCallbackForInAppWebView((Integer) jVar.mo22156a("index"), dVar);
                    return;
                } else {
                    dVar.success(Boolean.TRUE);
                    return;
                }
            case 2:
                if (this.webView instanceof InAppWebView) {
                    postMessageForInAppWebView((Integer) jVar.mo22156a("index"), (Map) jVar.mo22156a("message"), dVar);
                    return;
                } else {
                    dVar.success(Boolean.TRUE);
                    return;
                }
            default:
                dVar.notImplemented();
                return;
        }
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("id", this.f36286id);
        return hashMap;
    }
}
