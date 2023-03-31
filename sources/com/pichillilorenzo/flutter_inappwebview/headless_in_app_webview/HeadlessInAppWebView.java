package com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.FlutterWebView;
import com.pichillilorenzo.flutter_inappwebview.types.Size2D;
import java.util.HashMap;
import java.util.Map;
import p186ac.C6539c;
import p186ac.C6555j;
import p186ac.C6556k;

public class HeadlessInAppWebView implements C6556k.C6560c {
    protected static final String LOG_TAG = "HeadlessInAppWebView";
    public final C6556k channel;
    public FlutterWebView flutterWebView;

    /* renamed from: id */
    public final String f36274id;
    public InAppWebViewFlutterPlugin plugin;

    public HeadlessInAppWebView(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin, String str, FlutterWebView flutterWebView2) {
        this.f36274id = str;
        this.plugin = inAppWebViewFlutterPlugin;
        this.flutterWebView = flutterWebView2;
        C6539c cVar = inAppWebViewFlutterPlugin.messenger;
        C6556k kVar = new C6556k(cVar, "com.pichillilorenzo/flutter_headless_inappwebview_" + str);
        this.channel = kVar;
        kVar.mo22161e(this);
    }

    public void dispose() {
        Activity activity;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        FlutterWebView flutterWebView2;
        this.channel.mo22161e((C6556k.C6560c) null);
        Map<String, HeadlessInAppWebView> map = HeadlessInAppWebViewManager.webViews;
        if (map.containsKey(this.f36274id)) {
            map.put(this.f36274id, (Object) null);
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (!(inAppWebViewFlutterPlugin == null || (activity = inAppWebViewFlutterPlugin.activity) == null || (viewGroup = (ViewGroup) activity.findViewById(16908290)) == null || (viewGroup2 = (ViewGroup) viewGroup.getChildAt(0)) == null || (flutterWebView2 = this.flutterWebView) == null)) {
            viewGroup2.removeView(flutterWebView2.getView());
        }
        FlutterWebView flutterWebView3 = this.flutterWebView;
        if (flutterWebView3 != null) {
            flutterWebView3.dispose();
        }
        this.flutterWebView = null;
        this.plugin = null;
    }

    public Size2D getSize() {
        View view;
        FlutterWebView flutterWebView2 = this.flutterWebView;
        if (flutterWebView2 == null || flutterWebView2.webView == null || (view = flutterWebView2.getView()) == null) {
            return null;
        }
        float pixelDensity = Util.getPixelDensity(view.getContext());
        Size2D fullscreenSize = Util.getFullscreenSize(view.getContext());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        double width = fullscreenSize.getWidth();
        int i = layoutParams.width;
        double d = width == ((double) i) ? (double) i : (double) (((float) i) / pixelDensity);
        double height = fullscreenSize.getHeight();
        int i2 = layoutParams.height;
        return new Size2D(d, height == ((double) i2) ? (double) i2 : (double) (((float) i2) / pixelDensity));
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -75151241:
                if (str.equals("getSize")) {
                    c = 0;
                    break;
                }
                break;
            case 1671767583:
                if (str.equals("dispose")) {
                    c = 1;
                    break;
                }
                break;
            case 1984958339:
                if (str.equals("setSize")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Size2D size = getSize();
                dVar.success(size != null ? size.toMap() : null);
                return;
            case 1:
                dispose();
                dVar.success(Boolean.TRUE);
                return;
            case 2:
                Size2D fromMap = Size2D.fromMap((Map) jVar.mo22156a("size"));
                if (fromMap != null) {
                    setSize(fromMap);
                }
                dVar.success(Boolean.TRUE);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }

    public void onWebViewCreated() {
        this.channel.mo22159c("onWebViewCreated", new HashMap());
    }

    public void prepare(Map<String, Object> map) {
        Activity activity;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        FlutterWebView flutterWebView2;
        View view;
        View view2;
        FlutterWebView flutterWebView3 = this.flutterWebView;
        if (!(flutterWebView3 == null || (view2 = flutterWebView3.getView()) == null)) {
            Size2D fromMap = Size2D.fromMap((Map) map.get("initialSize"));
            if (fromMap == null) {
                fromMap = new Size2D(-1.0d, -1.0d);
            }
            setSize(fromMap);
            view2.setVisibility(4);
        }
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
        if (inAppWebViewFlutterPlugin != null && (activity = inAppWebViewFlutterPlugin.activity) != null && (viewGroup = (ViewGroup) activity.findViewById(16908290)) != null && (viewGroup2 = (ViewGroup) viewGroup.getChildAt(0)) != null && (flutterWebView2 = this.flutterWebView) != null && (view = flutterWebView2.getView()) != null) {
            viewGroup2.addView(view, 0);
        }
    }

    public void setSize(Size2D size2D) {
        View view;
        FlutterWebView flutterWebView2 = this.flutterWebView;
        if (flutterWebView2 != null && flutterWebView2.webView != null && (view = flutterWebView2.getView()) != null) {
            float pixelDensity = Util.getPixelDensity(view.getContext());
            Size2D fullscreenSize = Util.getFullscreenSize(view.getContext());
            view.setLayoutParams(new FrameLayout.LayoutParams((int) (size2D.getWidth() == -1.0d ? fullscreenSize.getWidth() : size2D.getWidth() * ((double) pixelDensity)), (int) (size2D.getWidth() == -1.0d ? fullscreenSize.getHeight() : ((double) pixelDensity) * size2D.getHeight())));
        }
    }
}
