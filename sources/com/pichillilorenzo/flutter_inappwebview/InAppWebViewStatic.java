package com.pichillilorenzo.flutter_inappwebview;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p158w0.C5882j;
import p158w0.C5885k;
import p186ac.C6555j;
import p186ac.C6556k;

public class InAppWebViewStatic implements C6556k.C6560c {
    protected static final String LOG_TAG = "InAppWebViewStatic";
    public C6556k channel;
    public InAppWebViewFlutterPlugin plugin;

    public InAppWebViewStatic(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        C6556k kVar = new C6556k(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_static");
        this.channel = kVar;
        kVar.mo22161e(this);
    }

    public Map<String, Object> convertWebViewPackageToMap(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("versionName", packageInfo.versionName);
        hashMap.put("packageName", packageInfo.packageName);
        return hashMap;
    }

    public void dispose() {
        this.channel.mo22161e((C6556k.C6560c) null);
        this.plugin = null;
    }

    public void onMethodCall(C6555j jVar, final C6556k.C6561d dVar) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        Context context;
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1600358415:
                if (str.equals("setSafeBrowsingWhitelist")) {
                    c = 0;
                    break;
                }
                break;
            case -910403233:
                if (str.equals("setWebContentsDebuggingEnabled")) {
                    c = 1;
                    break;
                }
                break;
            case -436220260:
                if (str.equals("clearClientCertPreferences")) {
                    c = 2;
                    break;
                }
                break;
            case 258673215:
                if (str.equals("getSafeBrowsingPrivacyPolicyUrl")) {
                    c = 3;
                    break;
                }
                break;
            case 643643439:
                if (str.equals("getDefaultUserAgent")) {
                    c = 4;
                    break;
                }
                break;
            case 1586319888:
                if (str.equals("getCurrentWebViewPackage")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (C5885k.m34805a("SAFE_BROWSING_ALLOWLIST")) {
                    C5882j.m34801k(new HashSet((List) jVar.mo22156a("hosts")), new ValueCallback<Boolean>() {
                        public void onReceiveValue(Boolean bool) {
                            dVar.success(bool);
                        }
                    });
                    return;
                } else if (C5885k.m34805a("SAFE_BROWSING_WHITELIST")) {
                    C5882j.m34802l((List) jVar.mo22156a("hosts"), new ValueCallback<Boolean>() {
                        public void onReceiveValue(Boolean bool) {
                            dVar.success(bool);
                        }
                    });
                    return;
                } else {
                    dVar.success(Boolean.FALSE);
                    return;
                }
            case 1:
                boolean booleanValue = ((Boolean) jVar.mo22156a("debuggingEnabled")).booleanValue();
                if (Build.VERSION.SDK_INT >= 19) {
                    WebView.setWebContentsDebuggingEnabled(booleanValue);
                }
                dVar.success(Boolean.TRUE);
                return;
            case 2:
                if (Build.VERSION.SDK_INT >= 21) {
                    WebView.clearClientCertPreferences(new Runnable() {
                        public void run() {
                            dVar.success(Boolean.TRUE);
                        }
                    });
                    return;
                } else {
                    dVar.success(Boolean.FALSE);
                    return;
                }
            case 3:
                if (C5885k.m34805a("SAFE_BROWSING_PRIVACY_POLICY_URL")) {
                    dVar.success(C5882j.m34799i().toString());
                    return;
                } else {
                    dVar.success((Object) null);
                    return;
                }
            case 4:
                dVar.success(WebSettings.getDefaultUserAgent(this.plugin.applicationContext));
                return;
            case 5:
                int i = Build.VERSION.SDK_INT;
                if (i >= 26 && (inAppWebViewFlutterPlugin = this.plugin) != null && ((context = inAppWebViewFlutterPlugin.activity) != null || inAppWebViewFlutterPlugin.applicationContext != null)) {
                    if (context == null) {
                        context = inAppWebViewFlutterPlugin.applicationContext;
                    }
                    dVar.success(convertWebViewPackageToMap(C5882j.m34794d(context)));
                    return;
                } else if (i >= 21) {
                    try {
                        dVar.success(convertWebViewPackageToMap((PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke((Object) null, new Object[0])));
                        return;
                    } catch (Exception unused) {
                        dVar.success((Object) null);
                        return;
                    }
                } else {
                    dVar.success((Object) null);
                    return;
                }
            default:
                dVar.notImplemented();
                return;
        }
    }
}
