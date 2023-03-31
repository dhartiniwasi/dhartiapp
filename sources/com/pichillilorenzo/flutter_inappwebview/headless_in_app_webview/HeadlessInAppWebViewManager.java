package com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview;

import android.content.Context;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.FlutterWebView;
import java.util.HashMap;
import java.util.Map;
import p186ac.C6555j;
import p186ac.C6556k;

public class HeadlessInAppWebViewManager implements C6556k.C6560c {
    protected static final String LOG_TAG = "HeadlessInAppWebViewManager";
    public static final Map<String, HeadlessInAppWebView> webViews = new HashMap();
    public C6556k channel;
    public InAppWebViewFlutterPlugin plugin;

    public HeadlessInAppWebViewManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        C6556k kVar = new C6556k(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_headless_inappwebview");
        this.channel = kVar;
        kVar.mo22161e(this);
    }

    public void dispose() {
        this.channel.mo22161e((C6556k.C6560c) null);
        for (HeadlessInAppWebView next : webViews.values()) {
            if (next != null) {
                next.dispose();
            }
        }
        webViews.clear();
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        String str = (String) jVar.mo22156a("id");
        String str2 = jVar.f30999a;
        str2.hashCode();
        if (!str2.equals("run")) {
            dVar.notImplemented();
            return;
        }
        run(str, (HashMap) jVar.mo22156a("params"));
        dVar.success(Boolean.TRUE);
    }

    public void run(String str, HashMap<String, Object> hashMap) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null) {
            Context context = inAppWebViewFlutterPlugin.activity;
            if (context != null || inAppWebViewFlutterPlugin.applicationContext != null) {
                if (context == null) {
                    context = inAppWebViewFlutterPlugin.applicationContext;
                }
                FlutterWebView flutterWebView = new FlutterWebView(inAppWebViewFlutterPlugin, context, str, hashMap);
                HeadlessInAppWebView headlessInAppWebView = new HeadlessInAppWebView(this.plugin, str, flutterWebView);
                webViews.put(str, headlessInAppWebView);
                headlessInAppWebView.prepare(hashMap);
                headlessInAppWebView.onWebViewCreated();
                flutterWebView.makeInitialLoad(hashMap);
            }
        }
    }
}
