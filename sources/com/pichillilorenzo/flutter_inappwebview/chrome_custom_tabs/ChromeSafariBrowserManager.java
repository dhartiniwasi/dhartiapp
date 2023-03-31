package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview.Util;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p186ac.C6555j;
import p186ac.C6556k;

public class ChromeSafariBrowserManager implements C6556k.C6560c {
    protected static final String LOG_TAG = "ChromeBrowserManager";
    public static final Map<String, ChromeSafariBrowserManager> shared = new HashMap();
    public C6556k channel;

    /* renamed from: id */
    public String f36271id = UUID.randomUUID().toString();
    public InAppWebViewFlutterPlugin plugin;

    public ChromeSafariBrowserManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        C6556k kVar = new C6556k(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_chromesafaribrowser");
        this.channel = kVar;
        kVar.mo22161e(this);
        shared.put(this.f36271id, this);
    }

    public void dispose() {
        this.channel.mo22161e((C6556k.C6560c) null);
        shared.remove(this.f36271id);
        this.plugin = null;
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        Activity activity;
        String str = (String) jVar.mo22156a("id");
        String str2 = jVar.f30999a;
        str2.hashCode();
        if (str2.equals("open")) {
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
            if (inAppWebViewFlutterPlugin == null || inAppWebViewFlutterPlugin.activity == null) {
                dVar.success(Boolean.FALSE);
                return;
            }
            open(this.plugin.activity, str, (String) jVar.mo22156a("url"), (HashMap) jVar.mo22156a("options"), (HashMap) jVar.mo22156a("actionButton"), (List) jVar.mo22156a("menuItemList"), dVar);
        } else if (!str2.equals("isAvailable")) {
            dVar.notImplemented();
        } else {
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
            if (inAppWebViewFlutterPlugin2 == null || (activity = inAppWebViewFlutterPlugin2.activity) == null) {
                dVar.success(Boolean.FALSE);
            } else {
                dVar.success(Boolean.valueOf(CustomTabActivityHelper.isAvailable(activity)));
            }
        }
    }

    public void open(Activity activity, String str, String str2, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2, List<HashMap<String, Object>> list, C6556k.C6561d dVar) {
        Class cls;
        Bundle bundle = new Bundle();
        bundle.putString("url", str2);
        bundle.putBoolean("isData", false);
        bundle.putString("id", str);
        bundle.putString("managerId", this.f36271id);
        bundle.putSerializable("options", hashMap);
        bundle.putSerializable("actionButton", hashMap2);
        bundle.putSerializable("menuItemList", (Serializable) list);
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) Util.getOrDefault(hashMap, "isSingleInstance", bool);
        Boolean bool3 = (Boolean) Util.getOrDefault(hashMap, "isTrustedWebActivity", bool);
        if (CustomTabActivityHelper.isAvailable(activity)) {
            if (!bool2.booleanValue()) {
                cls = !bool3.booleanValue() ? ChromeCustomTabsActivity.class : TrustedWebActivity.class;
            } else {
                cls = !bool3.booleanValue() ? ChromeCustomTabsActivitySingleInstance.class : TrustedWebActivitySingleInstance.class;
            }
            Intent intent = new Intent(activity, cls);
            intent.putExtras(bundle);
            if (((Boolean) Util.getOrDefault(hashMap, "noHistory", bool)).booleanValue()) {
                intent.addFlags(1073741824);
            }
            activity.startActivity(intent);
            dVar.success(Boolean.TRUE);
            return;
        }
        dVar.error(LOG_TAG, "ChromeCustomTabs is not available!", (Object) null);
    }
}
