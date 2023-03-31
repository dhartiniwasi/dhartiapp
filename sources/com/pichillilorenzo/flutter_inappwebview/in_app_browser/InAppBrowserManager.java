package com.pichillilorenzo.flutter_inappwebview.in_app_browser;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p186ac.C6555j;
import p186ac.C6556k;

public class InAppBrowserManager implements C6556k.C6560c {
    protected static final String LOG_TAG = "InAppBrowserManager";
    public static final Map<String, InAppBrowserManager> shared = new HashMap();
    public C6556k channel;

    /* renamed from: id */
    public String f36276id = UUID.randomUUID().toString();
    public InAppWebViewFlutterPlugin plugin;

    public InAppBrowserManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        C6556k kVar = new C6556k(inAppWebViewFlutterPlugin.messenger, "com.pichillilorenzo/flutter_inappbrowser");
        this.channel = kVar;
        kVar.mo22161e(this);
        shared.put(this.f36276id, this);
    }

    public static String getMimeType(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    public void dispose() {
        this.channel.mo22161e((C6556k.C6560c) null);
        shared.remove(this.f36276id);
        this.plugin = null;
    }

    public void onMethodCall(C6555j jVar, C6556k.C6561d dVar) {
        Activity activity;
        String str = jVar.f30999a;
        str.hashCode();
        if (str.equals("openWithSystemBrowser")) {
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin = this.plugin;
            if (inAppWebViewFlutterPlugin == null || inAppWebViewFlutterPlugin.activity == null) {
                dVar.success(Boolean.FALSE);
                return;
            }
            openWithSystemBrowser(this.plugin.activity, (String) jVar.mo22156a("url"), dVar);
        } else if (!str.equals("open")) {
            dVar.notImplemented();
        } else {
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.plugin;
            if (inAppWebViewFlutterPlugin2 == null || (activity = inAppWebViewFlutterPlugin2.activity) == null) {
                dVar.success(Boolean.FALSE);
                return;
            }
            open(activity, (Map) jVar.mo22157b());
            dVar.success(Boolean.TRUE);
        }
    }

    public void open(Activity activity, Map<String, Object> map) {
        Map<String, Object> map2 = map;
        Integer num = (Integer) map2.get("windowId");
        String str = "windowId";
        List list = (List) map2.get("initialUserScripts");
        String str2 = "initialUserScripts";
        Bundle bundle = new Bundle();
        Map map3 = (Map) map2.get("pullToRefreshOptions");
        bundle.putString("fromActivity", activity.getClass().getName());
        bundle.putSerializable("initialUrlRequest", (Serializable) ((Map) map2.get("urlRequest")));
        bundle.putString("initialFile", (String) map2.get("assetFilePath"));
        bundle.putString("initialData", (String) map2.get(JsonStorageKeyNames.DATA_KEY));
        bundle.putString("initialMimeType", (String) map2.get("mimeType"));
        bundle.putString("initialEncoding", (String) map2.get("encoding"));
        bundle.putString("initialBaseUrl", (String) map2.get("baseUrl"));
        bundle.putString("initialHistoryUrl", (String) map2.get("historyUrl"));
        bundle.putString("id", (String) map2.get("id"));
        bundle.putString("managerId", this.f36276id);
        bundle.putSerializable("options", (Serializable) ((Map) map2.get("options")));
        bundle.putSerializable("contextMenu", (Serializable) ((Map) map2.get("contextMenu")));
        bundle.putInt(str, num != null ? num.intValue() : -1);
        bundle.putSerializable(str2, (Serializable) list);
        bundle.putSerializable("pullToRefreshInitialOptions", (Serializable) map3);
        startInAppBrowserActivity(activity, bundle);
    }

    public void openExternalExcludeCurrentApp(Activity activity, Intent intent) {
        String packageName = activity.getPackageName();
        List<ResolveInfo> queryIntentActivities = activity.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (ResolveInfo next : queryIntentActivities) {
            if (!packageName.equals(next.activityInfo.packageName)) {
                Intent intent2 = (Intent) intent.clone();
                intent2.setPackage(next.activityInfo.packageName);
                arrayList.add(intent2);
            } else {
                z = true;
            }
        }
        if (!z || arrayList.size() == 0) {
            activity.startActivity(intent);
        } else if (arrayList.size() == 1) {
            activity.startActivity((Intent) arrayList.get(0));
        } else if (arrayList.size() > 0) {
            Intent createChooser = Intent.createChooser((Intent) arrayList.remove(arrayList.size() - 1), (CharSequence) null);
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList.toArray(new Parcelable[0]));
            activity.startActivity(createChooser);
        }
    }

    public void openWithSystemBrowser(Activity activity, String str, C6556k.C6561d dVar) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri parse = Uri.parse(str);
            if ("file".equals(parse.getScheme())) {
                intent.setDataAndType(parse, getMimeType(str));
            } else {
                intent.setData(parse);
            }
            intent.putExtra("com.android.browser.application_id", activity.getPackageName());
            openExternalExcludeCurrentApp(activity, intent);
            dVar.success(Boolean.TRUE);
        } catch (RuntimeException e) {
            Log.d(LOG_TAG, str + " cannot be opened: " + e.toString());
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" cannot be opened!");
            dVar.error(LOG_TAG, sb.toString(), (Object) null);
        }
    }

    public void startInAppBrowserActivity(Activity activity, Bundle bundle) {
        Intent intent = new Intent(activity, InAppBrowserActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        activity.startActivity(intent);
    }
}
