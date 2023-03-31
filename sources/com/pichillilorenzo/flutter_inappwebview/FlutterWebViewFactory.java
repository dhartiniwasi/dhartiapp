package com.pichillilorenzo.flutter_inappwebview;

import android.content.Context;
import com.pichillilorenzo.flutter_inappwebview.in_app_webview.FlutterWebView;
import com.pichillilorenzo.flutter_inappwebview.types.WebViewImplementation;
import java.util.HashMap;
import p186ac.C6568r;
import p264io.flutter.plugin.platform.C10731f;
import p264io.flutter.plugin.platform.C10732g;

public class FlutterWebViewFactory extends C10732g {
    private final InAppWebViewFlutterPlugin plugin;

    /* renamed from: com.pichillilorenzo.flutter_inappwebview.FlutterWebViewFactory$1 */
    static /* synthetic */ class C86911 {

        /* renamed from: $SwitchMap$com$pichillilorenzo$flutter_inappwebview$types$WebViewImplementation */
        static final /* synthetic */ int[] f36266xd1763954;

        static {
            int[] iArr = new int[WebViewImplementation.values().length];
            f36266xd1763954 = iArr;
            try {
                iArr[WebViewImplementation.NATIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public FlutterWebViewFactory(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        super(C6568r.f31011a);
        this.plugin = inAppWebViewFlutterPlugin;
    }

    public C10731f create(Context context, int i, Object obj) {
        HashMap hashMap = (HashMap) obj;
        int i2 = C86911.f36266xd1763954[WebViewImplementation.fromValue(((Integer) hashMap.get("implementation")).intValue()).ordinal()];
        FlutterWebView flutterWebView = new FlutterWebView(this.plugin, context, Integer.valueOf(i), hashMap);
        flutterWebView.makeInitialLoad(hashMap);
        return flutterWebView;
    }
}
