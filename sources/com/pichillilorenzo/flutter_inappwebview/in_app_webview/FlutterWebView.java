package com.pichillilorenzo.flutter_inappwebview.in_app_webview;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewMethodHandler;
import com.pichillilorenzo.flutter_inappwebview.plugin_scripts_js.JavaScriptBridgeJS;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview.pull_to_refresh.PullToRefreshOptions;
import com.pichillilorenzo.flutter_inappwebview.types.PlatformWebView;
import com.pichillilorenzo.flutter_inappwebview.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview.types.UserScript;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p158w0.C5882j;
import p158w0.C5885k;
import p158w0.C5887m;
import p186ac.C6539c;
import p186ac.C6556k;

public class FlutterWebView implements PlatformWebView {
    static final String LOG_TAG = "IAWFlutterWebView";
    public final C6556k channel;
    public InAppWebViewMethodHandler methodCallDelegate;
    public PullToRefreshLayout pullToRefreshLayout;
    public InAppWebView webView;

    public FlutterWebView(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, Context context, Object obj, HashMap<String, Object> hashMap) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = inAppWebViewFlutterPlugin;
        Object obj2 = obj;
        HashMap<String, Object> hashMap2 = hashMap;
        C6539c cVar = inAppWebViewFlutterPlugin2.messenger;
        this.channel = new C6556k(cVar, "com.pichillilorenzo/flutter_inappwebview_" + obj2);
        DisplayListenerProxy displayListenerProxy = new DisplayListenerProxy();
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayListenerProxy.onPreWebViewInitialization(displayManager);
        Map map = (Map) hashMap2.get("contextMenu");
        Integer num = (Integer) hashMap2.get("windowId");
        List<Map> list = (List) hashMap2.get("initialUserScripts");
        Map map2 = (Map) hashMap2.get("pullToRefreshOptions");
        InAppWebViewOptions inAppWebViewOptions = new InAppWebViewOptions();
        inAppWebViewOptions.parse((Map) hashMap2.get("initialOptions"));
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Map fromMap : list) {
                arrayList.add(UserScript.fromMap(fromMap));
            }
        }
        InAppWebView inAppWebView = r1;
        InAppWebView inAppWebView2 = new InAppWebView(context, inAppWebViewFlutterPlugin, this.channel, obj, num, inAppWebViewOptions, map, inAppWebViewOptions.useHybridComposition.booleanValue() ? null : inAppWebViewFlutterPlugin2.flutterView, arrayList);
        this.webView = inAppWebView;
        displayListenerProxy.onPostWebViewInitialization(displayManager);
        this.webView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        C6539c cVar2 = inAppWebViewFlutterPlugin2.messenger;
        C6556k kVar = new C6556k(cVar2, "com.pichillilorenzo/flutter_inappwebview_pull_to_refresh_" + obj2);
        PullToRefreshOptions pullToRefreshOptions = new PullToRefreshOptions();
        pullToRefreshOptions.parse(map2);
        PullToRefreshLayout pullToRefreshLayout2 = new PullToRefreshLayout(context, kVar, pullToRefreshOptions);
        this.pullToRefreshLayout = pullToRefreshLayout2;
        pullToRefreshLayout2.addView(this.webView);
        this.pullToRefreshLayout.prepare();
        InAppWebViewMethodHandler inAppWebViewMethodHandler = new InAppWebViewMethodHandler(this.webView);
        this.methodCallDelegate = inAppWebViewMethodHandler;
        this.channel.mo22161e(inAppWebViewMethodHandler);
        this.webView.prepare();
    }

    public void dispose() {
        this.channel.mo22161e((C6556k.C6560c) null);
        InAppWebViewMethodHandler inAppWebViewMethodHandler = this.methodCallDelegate;
        if (inAppWebViewMethodHandler != null) {
            inAppWebViewMethodHandler.dispose();
            this.methodCallDelegate = null;
        }
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.removeJavascriptInterface(JavaScriptBridgeJS.JAVASCRIPT_BRIDGE_NAME);
            if (Build.VERSION.SDK_INT >= 29 && C5885k.m34805a("WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE")) {
                C5882j.m34803m(this.webView, (C5887m) null);
            }
            this.webView.setWebChromeClient(new WebChromeClient());
            this.webView.setWebViewClient(new WebViewClient() {
                public void onPageFinished(WebView webView, String str) {
                    InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient = FlutterWebView.this.webView.inAppWebViewRenderProcessClient;
                    if (inAppWebViewRenderProcessClient != null) {
                        inAppWebViewRenderProcessClient.dispose();
                    }
                    FlutterWebView.this.webView.inAppWebViewChromeClient.dispose();
                    FlutterWebView.this.webView.inAppWebViewClient.dispose();
                    FlutterWebView.this.webView.javaScriptBridgeInterface.dispose();
                    FlutterWebView.this.webView.dispose();
                    FlutterWebView.this.webView.destroy();
                    FlutterWebView flutterWebView = FlutterWebView.this;
                    flutterWebView.webView = null;
                    PullToRefreshLayout pullToRefreshLayout = flutterWebView.pullToRefreshLayout;
                    if (pullToRefreshLayout != null) {
                        pullToRefreshLayout.dispose();
                        FlutterWebView.this.pullToRefreshLayout = null;
                    }
                }
            });
            this.webView.getSettings().setJavaScriptEnabled(false);
            this.webView.loadUrl("about:blank");
        }
    }

    public View getView() {
        PullToRefreshLayout pullToRefreshLayout2 = this.pullToRefreshLayout;
        return pullToRefreshLayout2 != null ? pullToRefreshLayout2 : this.webView;
    }

    public void makeInitialLoad(HashMap<String, Object> hashMap) {
        Integer num = (Integer) hashMap.get("windowId");
        Map map = (Map) hashMap.get("initialUrlRequest");
        String str = (String) hashMap.get("initialFile");
        Map map2 = (Map) hashMap.get("initialData");
        if (num != null) {
            Message message = InAppWebViewChromeClient.windowWebViewMessages.get(num);
            if (message != null) {
                ((WebView.WebViewTransport) message.obj).setWebView(this.webView);
                message.sendToTarget();
            }
        } else if (str != null) {
            try {
                this.webView.loadFile(str);
            } catch (IOException e) {
                e.printStackTrace();
                Log.e(LOG_TAG, str + " asset file cannot be found!", e);
            }
        } else if (map2 != null) {
            String str2 = (String) map2.get("baseUrl");
            this.webView.loadDataWithBaseURL(str2, (String) map2.get(JsonStorageKeyNames.DATA_KEY), (String) map2.get("mimeType"), (String) map2.get("encoding"), (String) map2.get("historyUrl"));
        } else if (map != null) {
            this.webView.loadUrl(URLRequest.fromMap(map));
        }
    }

    public void onFlutterViewAttached(View view) {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null && !inAppWebView.options.useHybridComposition.booleanValue()) {
            this.webView.setContainerView(view);
        }
    }

    public void onFlutterViewDetached() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null && !inAppWebView.options.useHybridComposition.booleanValue()) {
            this.webView.setContainerView((View) null);
        }
    }

    public void onInputConnectionLocked() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null && inAppWebView.inAppBrowserDelegate == null && !inAppWebView.options.useHybridComposition.booleanValue()) {
            this.webView.lockInputConnection();
        }
    }

    public void onInputConnectionUnlocked() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null && inAppWebView.inAppBrowserDelegate == null && !inAppWebView.options.useHybridComposition.booleanValue()) {
            this.webView.unlockInputConnection();
        }
    }
}
