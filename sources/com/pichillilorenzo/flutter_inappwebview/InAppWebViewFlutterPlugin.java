package com.pichillilorenzo.flutter_inappwebview;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs.ChromeSafariBrowserManager;
import com.pichillilorenzo.flutter_inappwebview.credential_database.CredentialDatabaseHandler;
import com.pichillilorenzo.flutter_inappwebview.headless_in_app_webview.HeadlessInAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview.in_app_browser.InAppBrowserManager;
import p186ac.C6539c;
import p186ac.C6565o;
import p264io.flutter.plugin.platform.C10733h;
import p264io.flutter.view.C11087e;
import p351sb.C12502a;
import p360tb.C12588a;
import p360tb.C12590c;

public class InAppWebViewFlutterPlugin implements C12502a, C12588a {
    protected static final String LOG_TAG = "InAppWebViewFlutterPL";
    public static ValueCallback<Uri[]> filePathCallback;
    public static ValueCallback<Uri> filePathCallbackLegacy;
    public Activity activity;
    public C12590c activityPluginBinding;
    public Context applicationContext;
    public ChromeSafariBrowserManager chromeSafariBrowserManager;
    public CredentialDatabaseHandler credentialDatabaseHandler;
    public C12502a.C12503a flutterAssets;
    public C11087e flutterView;
    public FlutterWebViewFactory flutterWebViewFactory;
    public HeadlessInAppWebViewManager headlessInAppWebViewManager;
    public InAppBrowserManager inAppBrowserManager;
    public InAppWebViewStatic inAppWebViewStatic;
    public C6539c messenger;
    public MyCookieManager myCookieManager;
    public MyWebStorage myWebStorage;
    public PlatformUtil platformUtil;
    public C6565o registrar;
    public ServiceWorkerManager serviceWorkerManager;
    public WebViewFeatureManager webViewFeatureManager;

    public static void registerWith(C6565o oVar) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = new InAppWebViewFlutterPlugin();
        inAppWebViewFlutterPlugin.registrar = oVar;
        inAppWebViewFlutterPlugin.onAttachedToEngine(oVar.mo22169d(), oVar.mo22172g(), oVar.mo22170e(), oVar.mo22173h(), oVar.mo22168c());
    }

    public void onAttachedToActivity(C12590c cVar) {
        this.activityPluginBinding = cVar;
        this.activity = cVar.getActivity();
    }

    public void onAttachedToEngine(C12502a.C12504b bVar) {
        this.flutterAssets = bVar.mo37294c();
        onAttachedToEngine(bVar.mo37292a(), bVar.mo37293b(), this.activity, bVar.mo37296e(), (C11087e) null);
    }

    public void onDetachedFromActivity() {
        this.activityPluginBinding = null;
        this.activity = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.activityPluginBinding = null;
        this.activity = null;
    }

    public void onDetachedFromEngine(C12502a.C12504b bVar) {
        PlatformUtil platformUtil2 = this.platformUtil;
        if (platformUtil2 != null) {
            platformUtil2.dispose();
            this.platformUtil = null;
        }
        InAppBrowserManager inAppBrowserManager2 = this.inAppBrowserManager;
        if (inAppBrowserManager2 != null) {
            inAppBrowserManager2.dispose();
            this.inAppBrowserManager = null;
        }
        HeadlessInAppWebViewManager headlessInAppWebViewManager2 = this.headlessInAppWebViewManager;
        if (headlessInAppWebViewManager2 != null) {
            headlessInAppWebViewManager2.dispose();
            this.headlessInAppWebViewManager = null;
        }
        ChromeSafariBrowserManager chromeSafariBrowserManager2 = this.chromeSafariBrowserManager;
        if (chromeSafariBrowserManager2 != null) {
            chromeSafariBrowserManager2.dispose();
            this.chromeSafariBrowserManager = null;
        }
        MyCookieManager myCookieManager2 = this.myCookieManager;
        if (myCookieManager2 != null) {
            myCookieManager2.dispose();
            this.myCookieManager = null;
        }
        MyWebStorage myWebStorage2 = this.myWebStorage;
        if (myWebStorage2 != null) {
            myWebStorage2.dispose();
            this.myWebStorage = null;
        }
        CredentialDatabaseHandler credentialDatabaseHandler2 = this.credentialDatabaseHandler;
        if (credentialDatabaseHandler2 != null && Build.VERSION.SDK_INT >= 26) {
            credentialDatabaseHandler2.dispose();
            this.credentialDatabaseHandler = null;
        }
        InAppWebViewStatic inAppWebViewStatic2 = this.inAppWebViewStatic;
        if (inAppWebViewStatic2 != null) {
            inAppWebViewStatic2.dispose();
            this.inAppWebViewStatic = null;
        }
        ServiceWorkerManager serviceWorkerManager2 = this.serviceWorkerManager;
        if (serviceWorkerManager2 != null && Build.VERSION.SDK_INT >= 24) {
            serviceWorkerManager2.dispose();
            this.serviceWorkerManager = null;
        }
        WebViewFeatureManager webViewFeatureManager2 = this.webViewFeatureManager;
        if (webViewFeatureManager2 != null) {
            webViewFeatureManager2.dispose();
            this.webViewFeatureManager = null;
        }
        filePathCallbackLegacy = null;
        filePathCallback = null;
    }

    public void onReattachedToActivityForConfigChanges(C12590c cVar) {
        this.activityPluginBinding = cVar;
        this.activity = cVar.getActivity();
    }

    private void onAttachedToEngine(Context context, C6539c cVar, Activity activity2, C10733h hVar, C11087e eVar) {
        this.applicationContext = context;
        this.activity = activity2;
        this.messenger = cVar;
        this.flutterView = eVar;
        this.inAppBrowserManager = new InAppBrowserManager(this);
        this.headlessInAppWebViewManager = new HeadlessInAppWebViewManager(this);
        this.chromeSafariBrowserManager = new ChromeSafariBrowserManager(this);
        FlutterWebViewFactory flutterWebViewFactory2 = new FlutterWebViewFactory(this);
        this.flutterWebViewFactory = flutterWebViewFactory2;
        hVar.mo34259a("com.pichillilorenzo/flutter_inappwebview", flutterWebViewFactory2);
        this.platformUtil = new PlatformUtil(this);
        this.inAppWebViewStatic = new InAppWebViewStatic(this);
        this.myCookieManager = new MyCookieManager(this);
        this.myWebStorage = new MyWebStorage(this);
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            this.serviceWorkerManager = new ServiceWorkerManager(this);
        }
        if (i >= 26) {
            this.credentialDatabaseHandler = new CredentialDatabaseHandler(this);
        }
        this.webViewFeatureManager = new WebViewFeatureManager(this);
    }
}
