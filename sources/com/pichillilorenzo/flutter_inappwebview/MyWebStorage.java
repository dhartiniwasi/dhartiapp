package com.pichillilorenzo.flutter_inappwebview;

import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p186ac.C6555j;
import p186ac.C6556k;

public class MyWebStorage implements C6556k.C6560c {
    static final String LOG_TAG = "MyWebStorage";
    public static WebStorage webStorageManager;
    public C6556k channel;
    public InAppWebViewFlutterPlugin plugin;

    public MyWebStorage(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        C6556k kVar = new C6556k(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_webstoragemanager");
        this.channel = kVar;
        kVar.mo22161e(this);
    }

    public static void init() {
        if (webStorageManager == null) {
            webStorageManager = WebStorage.getInstance();
        }
    }

    public void dispose() {
        this.channel.mo22161e((C6556k.C6560c) null);
        this.plugin = null;
    }

    public void getOrigins(final C6556k.C6561d dVar) {
        webStorageManager.getOrigins(new ValueCallback<Map>() {
            public void onReceiveValue(Map map) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : map.keySet()) {
                    WebStorage.Origin origin = (WebStorage.Origin) map.get(obj);
                    HashMap hashMap = new HashMap();
                    hashMap.put("origin", origin.getOrigin());
                    hashMap.put("quota", Long.valueOf(origin.getQuota()));
                    hashMap.put("usage", Long.valueOf(origin.getUsage()));
                    arrayList.add(hashMap);
                }
                dVar.success(arrayList);
            }
        });
    }

    public void getQuotaForOrigin(String str, final C6556k.C6561d dVar) {
        webStorageManager.getQuotaForOrigin(str, new ValueCallback<Long>() {
            public void onReceiveValue(Long l) {
                dVar.success(l);
            }
        });
    }

    public void getUsageForOrigin(String str, final C6556k.C6561d dVar) {
        webStorageManager.getUsageForOrigin(str, new ValueCallback<Long>() {
            public void onReceiveValue(Long l) {
                dVar.success(l);
            }
        });
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        init();
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1308548435:
                if (str.equals("getQuotaForOrigin")) {
                    c = 0;
                    break;
                }
                break;
            case -1117417280:
                if (str.equals("deleteAllData")) {
                    c = 1;
                    break;
                }
                break;
            case -876677967:
                if (str.equals("deleteOrigin")) {
                    c = 2;
                    break;
                }
                break;
            case -165580329:
                if (str.equals("getOrigins")) {
                    c = 3;
                    break;
                }
                break;
            case 843309476:
                if (str.equals("getUsageForOrigin")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                getQuotaForOrigin((String) jVar.mo22156a("origin"), dVar);
                return;
            case 1:
                webStorageManager.deleteAllData();
                dVar.success(Boolean.TRUE);
                return;
            case 2:
                webStorageManager.deleteOrigin((String) jVar.mo22156a("origin"));
                dVar.success(Boolean.TRUE);
                return;
            case 3:
                getOrigins(dVar);
                return;
            case 4:
                getUsageForOrigin((String) jVar.mo22156a("origin"), dVar);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }
}
