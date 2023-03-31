package com.pichillilorenzo.flutter_inappwebview;

import android.os.Build;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.pichillilorenzo.flutter_inappwebview.Util;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;
import p158w0.C5873c;
import p158w0.C5874d;
import p158w0.C5876e;
import p158w0.C5885k;
import p186ac.C6555j;
import p186ac.C6556k;

public class ServiceWorkerManager implements C6556k.C6560c {
    static final String LOG_TAG = "ServiceWorkerManager";
    public static C5874d serviceWorkerController;
    public C6556k channel;
    public InAppWebViewFlutterPlugin plugin;

    private static final class DummyServiceWorkerClientCompat extends C5873c {
        static final C5873c INSTANCE = new DummyServiceWorkerClientCompat();

        private DummyServiceWorkerClientCompat() {
        }

        public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
            return null;
        }
    }

    public ServiceWorkerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        C6556k kVar = new C6556k(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_android_serviceworkercontroller");
        this.channel = kVar;
        kVar.mo22161e(this);
    }

    private C5873c dummyServiceWorkerClientCompat() {
        return DummyServiceWorkerClientCompat.INSTANCE;
    }

    public static void init() {
        if (serviceWorkerController == null && C5885k.m34805a("SERVICE_WORKER_BASIC_USAGE")) {
            serviceWorkerController = C5874d.m34771a();
        }
    }

    private void setServiceWorkerClient(Boolean bool) {
        C5874d dVar = serviceWorkerController;
        if (dVar != null) {
            dVar.mo20426c(bool.booleanValue() ? dummyServiceWorkerClientCompat() : new C5873c() {
                public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("url", webResourceRequest.getUrl().toString());
                    hashMap.put("method", webResourceRequest.getMethod());
                    hashMap.put("headers", webResourceRequest.getRequestHeaders());
                    hashMap.put("isForMainFrame", Boolean.valueOf(webResourceRequest.isForMainFrame()));
                    hashMap.put("hasGesture", Boolean.valueOf(webResourceRequest.hasGesture()));
                    hashMap.put("isRedirect", Boolean.valueOf(webResourceRequest.isRedirect()));
                    ByteArrayInputStream byteArrayInputStream = null;
                    try {
                        Util.WaitFlutterResult invokeMethodAndWait = Util.invokeMethodAndWait(ServiceWorkerManager.this.channel, "shouldInterceptRequest", hashMap);
                        String str = invokeMethodAndWait.error;
                        if (str != null) {
                            Log.e(ServiceWorkerManager.LOG_TAG, str);
                            return null;
                        }
                        Object obj = invokeMethodAndWait.result;
                        if (obj == null) {
                            return null;
                        }
                        Map map = (Map) obj;
                        String str2 = (String) map.get("contentType");
                        String str3 = (String) map.get("contentEncoding");
                        byte[] bArr = (byte[]) map.get(JsonStorageKeyNames.DATA_KEY);
                        Map map2 = (Map) map.get("headers");
                        Integer num = (Integer) map.get("statusCode");
                        String str4 = (String) map.get("reasonPhrase");
                        if (bArr != null) {
                            byteArrayInputStream = new ByteArrayInputStream(bArr);
                        }
                        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                        if ((map2 != null || num != null || str4 != null) && Build.VERSION.SDK_INT >= 21) {
                            return new WebResourceResponse(str2, str3, num.intValue(), str4, map2, byteArrayInputStream2);
                        }
                        return new WebResourceResponse(str2, str3, byteArrayInputStream2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return null;
                    }
                }
            });
        }
    }

    public void dispose() {
        this.channel.mo22161e((C6556k.C6560c) null);
        C5874d dVar = serviceWorkerController;
        if (dVar != null) {
            dVar.mo20426c(dummyServiceWorkerClientCompat());
            serviceWorkerController = null;
        }
        this.plugin = null;
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        init();
        C5874d dVar2 = serviceWorkerController;
        C5876e b = dVar2 != null ? dVar2.mo20425b() : null;
        String str = jVar.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1332730774:
                if (str.equals("getAllowContentAccess")) {
                    c = 0;
                    break;
                }
                break;
            case -1165005700:
                if (str.equals("setServiceWorkerClient")) {
                    c = 1;
                    break;
                }
                break;
            case -563397233:
                if (str.equals("getCacheMode")) {
                    c = 2;
                    break;
                }
                break;
            case 674894835:
                if (str.equals("getAllowFileAccess")) {
                    c = 3;
                    break;
                }
                break;
            case 985595395:
                if (str.equals("setCacheMode")) {
                    c = 4;
                    break;
                }
                break;
            case 1083898794:
                if (str.equals("setBlockNetworkLoads")) {
                    c = 5;
                    break;
                }
                break;
            case 1203480182:
                if (str.equals("setAllowContentAccess")) {
                    c = 6;
                    break;
                }
                break;
            case 1594928487:
                if (str.equals("setAllowFileAccess")) {
                    c = 7;
                    break;
                }
                break;
            case 1694822198:
                if (str.equals("getBlockNetworkLoads")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (b == null || !C5885k.m34805a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    dVar.success(Boolean.FALSE);
                    return;
                } else {
                    dVar.success(Boolean.valueOf(b.mo20427a()));
                    return;
                }
            case 1:
                setServiceWorkerClient((Boolean) jVar.mo22156a("isNull"));
                dVar.success(Boolean.TRUE);
                return;
            case 2:
                if (b == null || !C5885k.m34805a("SERVICE_WORKER_CACHE_MODE")) {
                    dVar.success((Object) null);
                    return;
                } else {
                    dVar.success(Integer.valueOf(b.mo20430d()));
                    return;
                }
            case 3:
                if (b == null || !C5885k.m34805a("SERVICE_WORKER_FILE_ACCESS")) {
                    dVar.success(Boolean.FALSE);
                    return;
                } else {
                    dVar.success(Boolean.valueOf(b.mo20428b()));
                    return;
                }
            case 4:
                if (b != null && C5885k.m34805a("SERVICE_WORKER_CACHE_MODE")) {
                    b.mo20434h(((Integer) jVar.mo22156a("mode")).intValue());
                }
                dVar.success(Boolean.TRUE);
                return;
            case 5:
                if (b != null && C5885k.m34805a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    b.mo20433g(((Boolean) jVar.mo22156a("flag")).booleanValue());
                }
                dVar.success(Boolean.TRUE);
                return;
            case 6:
                if (b != null && C5885k.m34805a("SERVICE_WORKER_CONTENT_ACCESS")) {
                    b.mo20431e(((Boolean) jVar.mo22156a("allow")).booleanValue());
                }
                dVar.success(Boolean.TRUE);
                return;
            case 7:
                if (b != null && C5885k.m34805a("SERVICE_WORKER_FILE_ACCESS")) {
                    b.mo20432f(((Boolean) jVar.mo22156a("allow")).booleanValue());
                }
                dVar.success(Boolean.TRUE);
                return;
            case 8:
                if (b == null || !C5885k.m34805a("SERVICE_WORKER_BLOCK_NETWORK_LOADS")) {
                    dVar.success(Boolean.FALSE);
                    return;
                } else {
                    dVar.success(Boolean.valueOf(b.mo20429c()));
                    return;
                }
            default:
                dVar.notImplemented();
                return;
        }
    }
}
