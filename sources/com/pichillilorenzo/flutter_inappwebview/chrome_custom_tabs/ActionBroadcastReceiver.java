package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin;
import java.util.HashMap;
import p186ac.C6539c;
import p186ac.C6556k;

public class ActionBroadcastReceiver extends BroadcastReceiver {
    public static final String CHROME_MANAGER_ID = "com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.CHROME_MANAGER_ID";
    public static final String KEY_ACTION_ID = "com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_ID";
    public static final String KEY_ACTION_VIEW_ID = "com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ACTION_VIEW_ID";
    public static final String KEY_URL_TITLE = "android.intent.extra.SUBJECT";
    protected static final String LOG_TAG = "ActionBroadcastReceiver";

    public void onReceive(Context context, Intent intent) {
        ChromeSafariBrowserManager chromeSafariBrowserManager;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        C6539c cVar;
        String dataString = intent.getDataString();
        if (dataString != null) {
            Bundle extras = intent.getExtras();
            String string = extras.getString(KEY_ACTION_VIEW_ID);
            int i = extras.getInt(KEY_ACTION_ID);
            String string2 = extras.getString(KEY_URL_TITLE);
            String string3 = extras.getString(CHROME_MANAGER_ID);
            if (string3 != null && (chromeSafariBrowserManager = ChromeSafariBrowserManager.shared.get(string3)) != null && (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) != null && (cVar = inAppWebViewFlutterPlugin.messenger) != null) {
                C6556k kVar = new C6556k(cVar, "com.pichillilorenzo/flutter_chromesafaribrowser_" + string);
                HashMap hashMap = new HashMap();
                hashMap.put("url", dataString);
                hashMap.put("title", string2);
                hashMap.put("id", Integer.valueOf(i));
                kVar.mo22159c("onChromeSafariBrowserItemActionPerform", hashMap);
            }
        }
    }
}
