package com.pichillilorenzo.flutter_inappwebview;

import p158w0.C5885k;
import p186ac.C6555j;
import p186ac.C6556k;

public class WebViewFeatureManager implements C6556k.C6560c {
    static final String LOG_TAG = "WebViewFeatureManager";
    public C6556k channel;
    public InAppWebViewFlutterPlugin plugin;

    public WebViewFeatureManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        C6556k kVar = new C6556k(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_android_webviewfeature");
        this.channel = kVar;
        kVar.mo22161e(this);
    }

    public void dispose() {
        this.channel.mo22161e((C6556k.C6560c) null);
        this.plugin = null;
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        String str = jVar.f30999a;
        str.hashCode();
        if (!str.equals("isFeatureSupported")) {
            dVar.notImplemented();
        } else {
            dVar.success(Boolean.valueOf(C5885k.m34805a((String) jVar.mo22156a("feature"))));
        }
    }
}
