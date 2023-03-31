package com.pichillilorenzo.flutter_inappwebview;

import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.unity3d.ads.metadata.MediationMetaData;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import p186ac.C6555j;
import p186ac.C6556k;

public class MyCookieManager implements C6556k.C6560c {
    static final String LOG_TAG = "MyCookieManager";
    public static CookieManager cookieManager;
    public C6556k channel;
    public InAppWebViewFlutterPlugin plugin;

    public MyCookieManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        C6556k kVar = new C6556k(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappwebview_cookiemanager");
        this.channel = kVar;
        kVar.mo22161e(this);
    }

    public static String getCookieExpirationDate(Long l) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy hh:mm:ss z", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat.format(new Date(l.longValue()));
    }

    private static CookieManager getCookieManager() {
        if (cookieManager == null) {
            try {
                cookieManager = CookieManager.getInstance();
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e) {
                if (e.getMessage() != null && e.getClass().getCanonicalName().equals("android.webkit.WebViewFactory.MissingWebViewPackageException")) {
                    return null;
                }
                throw e;
            }
        }
        return cookieManager;
    }

    public static void init() {
        if (cookieManager == null) {
            cookieManager = getCookieManager();
        }
    }

    public void deleteAllCookies(final C6556k.C6561d dVar) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 != null) {
            if (Build.VERSION.SDK_INT >= 21) {
                cookieManager2.removeAllCookies(new ValueCallback<Boolean>() {
                    public void onReceiveValue(Boolean bool) {
                        dVar.success(Boolean.TRUE);
                    }
                });
                cookieManager.flush();
                return;
            }
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
            if (inAppWebViewFlutterPlugin != null) {
                CookieSyncManager createInstance = CookieSyncManager.createInstance(inAppWebViewFlutterPlugin.applicationContext);
                createInstance.startSync();
                cookieManager.removeAllCookie();
                dVar.success(Boolean.TRUE);
                createInstance.stopSync();
                createInstance.sync();
                return;
            }
            cookieManager2.removeAllCookie();
            dVar.success(Boolean.TRUE);
        }
    }

    public void deleteCookie(String str, String str2, String str3, String str4, final C6556k.C6561d dVar) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 != null) {
            String str5 = str2 + "=; Path=" + str4 + "; Max-Age=-1";
            if (str3 != null) {
                str5 = str5 + "; Domain=" + str3;
            }
            String str6 = str5 + ";";
            if (Build.VERSION.SDK_INT >= 21) {
                cookieManager.setCookie(str, str6, new ValueCallback<Boolean>() {
                    public void onReceiveValue(Boolean bool) {
                        dVar.success(Boolean.TRUE);
                    }
                });
                cookieManager.flush();
                return;
            }
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
            if (inAppWebViewFlutterPlugin != null) {
                CookieSyncManager createInstance = CookieSyncManager.createInstance(inAppWebViewFlutterPlugin.applicationContext);
                createInstance.startSync();
                cookieManager.setCookie(str, str6);
                dVar.success(Boolean.TRUE);
                createInstance.stopSync();
                createInstance.sync();
                return;
            }
            cookieManager.setCookie(str, str6);
            dVar.success(Boolean.TRUE);
        }
    }

    public void deleteCookies(String str, String str2, String str3, C6556k.C6561d dVar) {
        CookieSyncManager cookieSyncManager;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 != null) {
            String cookie = cookieManager2.getCookie(str);
            if (cookie != null) {
                if (Build.VERSION.SDK_INT >= 21 || (inAppWebViewFlutterPlugin = this.plugin) == null) {
                    cookieSyncManager = null;
                } else {
                    cookieSyncManager = CookieSyncManager.createInstance(inAppWebViewFlutterPlugin.applicationContext);
                    cookieSyncManager.startSync();
                }
                for (String split : cookie.split(";")) {
                    String str4 = split.split("=", 2)[0].trim() + "=; Path=" + str3 + "; Max-Age=-1";
                    if (str2 != null) {
                        str4 = str4 + "; Domain=" + str2;
                    }
                    String str5 = str4 + ";";
                    if (Build.VERSION.SDK_INT >= 21) {
                        cookieManager.setCookie(str, str5, (ValueCallback) null);
                    } else {
                        cookieManager.setCookie(str, str5);
                    }
                }
                if (cookieSyncManager != null) {
                    cookieSyncManager.stopSync();
                    cookieSyncManager.sync();
                } else if (Build.VERSION.SDK_INT >= 21) {
                    cookieManager.flush();
                }
            }
            dVar.success(Boolean.TRUE);
        }
    }

    public void dispose() {
        this.channel.mo22161e((C6556k.C6560c) null);
        this.plugin = null;
    }

    public List<Map<String, Object>> getCookies(String str) {
        String cookie;
        ArrayList arrayList = new ArrayList();
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (!(cookieManager2 == null || (cookie = cookieManager2.getCookie(str)) == null)) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=", 2);
                String trim = split2[0].trim();
                String trim2 = split2.length > 1 ? split2[1].trim() : "";
                HashMap hashMap = new HashMap();
                hashMap.put(MediationMetaData.KEY_NAME, trim);
                hashMap.put("value", trim2);
                hashMap.put("expiresDate", (Object) null);
                hashMap.put("isSessionOnly", (Object) null);
                hashMap.put("domain", (Object) null);
                hashMap.put("sameSite", (Object) null);
                hashMap.put("isSecure", (Object) null);
                hashMap.put("isHttpOnly", (Object) null);
                hashMap.put("path", (Object) null);
                arrayList.add(hashMap);
            }
        }
        return arrayList;
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        C6555j jVar2 = jVar;
        C6556k.C6561d dVar2 = dVar;
        init();
        String str = jVar2.f30999a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1222815761:
                if (str.equals("deleteCookie")) {
                    c = 0;
                    break;
                }
                break;
            case 126640486:
                if (str.equals("setCookie")) {
                    c = 1;
                    break;
                }
                break;
            case 747417188:
                if (str.equals("deleteCookies")) {
                    c = 2;
                    break;
                }
                break;
            case 822411705:
                if (str.equals("deleteAllCookies")) {
                    c = 3;
                    break;
                }
                break;
            case 1989049945:
                if (str.equals("getCookies")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                deleteCookie((String) jVar2.mo22156a("url"), (String) jVar2.mo22156a(MediationMetaData.KEY_NAME), (String) jVar2.mo22156a("domain"), (String) jVar2.mo22156a("path"), dVar);
                return;
            case 1:
                String str2 = (String) jVar2.mo22156a("url");
                String str3 = (String) jVar2.mo22156a(MediationMetaData.KEY_NAME);
                String str4 = (String) jVar2.mo22156a("value");
                String str5 = (String) jVar2.mo22156a("domain");
                String str6 = (String) jVar2.mo22156a("path");
                String str7 = (String) jVar2.mo22156a("expiresDate");
                setCookie(str2, str3, str4, str5, str6, str7 != null ? new Long(str7) : null, (Integer) jVar2.mo22156a("maxAge"), (Boolean) jVar2.mo22156a("isSecure"), (Boolean) jVar2.mo22156a("isHttpOnly"), (String) jVar2.mo22156a("sameSite"), dVar);
                return;
            case 2:
                deleteCookies((String) jVar2.mo22156a("url"), (String) jVar2.mo22156a("domain"), (String) jVar2.mo22156a("path"), dVar2);
                return;
            case 3:
                deleteAllCookies(dVar2);
                return;
            case 4:
                dVar2.success(getCookies((String) jVar2.mo22156a("url")));
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }

    public void setCookie(String str, String str2, String str3, String str4, String str5, Long l, Integer num, Boolean bool, Boolean bool2, String str6, final C6556k.C6561d dVar) {
        CookieManager cookieManager2 = getCookieManager();
        cookieManager = cookieManager2;
        if (cookieManager2 != null) {
            String str7 = str2 + "=" + str3 + "; Path=" + str5;
            if (str4 != null) {
                str7 = str7 + "; Domain=" + str4;
            }
            if (l != null) {
                str7 = str7 + "; Expires=" + getCookieExpirationDate(l);
            }
            if (num != null) {
                str7 = str7 + "; Max-Age=" + num.toString();
            }
            if (bool != null && bool.booleanValue()) {
                str7 = str7 + "; Secure";
            }
            if (bool2 != null && bool2.booleanValue()) {
                str7 = str7 + "; HttpOnly";
            }
            if (str6 != null) {
                str7 = str7 + "; SameSite=" + str6;
            }
            String str8 = str7 + ";";
            if (Build.VERSION.SDK_INT >= 21) {
                cookieManager.setCookie(str, str8, new ValueCallback<Boolean>() {
                    public void onReceiveValue(Boolean bool) {
                        dVar.success(Boolean.TRUE);
                    }
                });
                cookieManager.flush();
                return;
            }
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
            if (inAppWebViewFlutterPlugin != null) {
                CookieSyncManager createInstance = CookieSyncManager.createInstance(inAppWebViewFlutterPlugin.applicationContext);
                createInstance.startSync();
                cookieManager.setCookie(str, str8);
                dVar.success(Boolean.TRUE);
                createInstance.stopSync();
                createInstance.sync();
                return;
            }
            cookieManager.setCookie(str, str8);
            dVar.success(Boolean.TRUE);
        }
    }
}
