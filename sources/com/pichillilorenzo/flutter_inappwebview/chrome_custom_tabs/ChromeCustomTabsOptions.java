package com.pichillilorenzo.flutter_inappwebview.chrome_custom_tabs;

import android.content.Intent;
import com.pichillilorenzo.flutter_inappwebview.Options;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p103o.C5134a;

public class ChromeCustomTabsOptions implements Options<ChromeCustomTabsActivity> {
    static final String LOG_TAG = "ChromeCustomTabsOptions";
    @Deprecated
    public Boolean addDefaultShareMenuItem;
    public List<String> additionalTrustedOrigins;
    public C5134a displayMode;
    public Boolean enableUrlBarHiding;
    public Boolean instantAppsEnabled;
    public Boolean isSingleInstance;
    public Boolean isTrustedWebActivity;
    public Boolean keepAliveEnabled;
    public Boolean noHistory;
    public String packageName;
    public Integer screenOrientation;
    public Integer shareState = 0;
    public Boolean showTitle = Boolean.TRUE;
    public String toolbarBackgroundColor;

    public ChromeCustomTabsOptions() {
        Boolean bool = Boolean.FALSE;
        this.enableUrlBarHiding = bool;
        this.instantAppsEnabled = bool;
        this.keepAliveEnabled = bool;
        this.isSingleInstance = bool;
        this.noHistory = bool;
        this.isTrustedWebActivity = bool;
        this.additionalTrustedOrigins = new ArrayList();
        this.displayMode = null;
        this.screenOrientation = 0;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("addDefaultShareMenuItem", this.addDefaultShareMenuItem);
        hashMap.put("showTitle", this.showTitle);
        hashMap.put("toolbarBackgroundColor", this.toolbarBackgroundColor);
        hashMap.put("enableUrlBarHiding", this.enableUrlBarHiding);
        hashMap.put("instantAppsEnabled", this.instantAppsEnabled);
        hashMap.put("packageName", this.packageName);
        hashMap.put("keepAliveEnabled", this.keepAliveEnabled);
        hashMap.put("isSingleInstance", this.isSingleInstance);
        hashMap.put("noHistory", this.noHistory);
        hashMap.put("isTrustedWebActivity", this.isTrustedWebActivity);
        hashMap.put("additionalTrustedOrigins", this.additionalTrustedOrigins);
        hashMap.put("screenOrientation", this.screenOrientation);
        return hashMap;
    }

    public Map<String, Object> getRealOptions(ChromeCustomTabsActivity chromeCustomTabsActivity) {
        Intent intent;
        Map<String, Object> map = toMap();
        if (!(chromeCustomTabsActivity == null || (intent = chromeCustomTabsActivity.getIntent()) == null)) {
            map.put("packageName", intent.getPackage());
            map.put("keepAliveEnabled", Boolean.valueOf(intent.hasExtra("android.support.customtabs.extra.KEEP_ALIVE")));
        }
        return map;
    }

    public ChromeCustomTabsOptions parse(Map<String, Object> map) {
        for (Map.Entry next : map.entrySet()) {
            String str = (String) next.getKey();
            Object value = next.getValue();
            if (value != null) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -2112880751:
                        if (str.equals("addDefaultShareMenuItem")) {
                            c = 0;
                            break;
                        }
                        break;
                    case -1913803429:
                        if (str.equals("showTitle")) {
                            c = 1;
                            break;
                        }
                        break;
                    case -1799055374:
                        if (str.equals("shareState")) {
                            c = 2;
                            break;
                        }
                        break;
                    case -632275769:
                        if (str.equals("isSingleInstance")) {
                            c = 3;
                            break;
                        }
                        break;
                    case -227713574:
                        if (str.equals("toolbarBackgroundColor")) {
                            c = 4;
                            break;
                        }
                        break;
                    case 137483238:
                        if (str.equals("enableUrlBarHiding")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 227582404:
                        if (str.equals("screenOrientation")) {
                            c = 6;
                            break;
                        }
                        break;
                    case 390710230:
                        if (str.equals("isTrustedWebActivity")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 472764366:
                        if (str.equals("instantAppsEnabled")) {
                            c = 8;
                            break;
                        }
                        break;
                    case 908759025:
                        if (str.equals("packageName")) {
                            c = 9;
                            break;
                        }
                        break;
                    case 1518510995:
                        if (str.equals("noHistory")) {
                            c = 10;
                            break;
                        }
                        break;
                    case 1578203421:
                        if (str.equals("additionalTrustedOrigins")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 1714132357:
                        if (str.equals("displayMode")) {
                            c = 12;
                            break;
                        }
                        break;
                    case 2126240217:
                        if (str.equals("keepAliveEnabled")) {
                            c = 13;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.addDefaultShareMenuItem = (Boolean) value;
                        break;
                    case 1:
                        this.showTitle = (Boolean) value;
                        break;
                    case 2:
                        this.shareState = (Integer) value;
                        break;
                    case 3:
                        this.isSingleInstance = (Boolean) value;
                        break;
                    case 4:
                        this.toolbarBackgroundColor = (String) value;
                        break;
                    case 5:
                        this.enableUrlBarHiding = (Boolean) value;
                        break;
                    case 6:
                        this.screenOrientation = (Integer) value;
                        break;
                    case 7:
                        this.isTrustedWebActivity = (Boolean) value;
                        break;
                    case 8:
                        this.instantAppsEnabled = (Boolean) value;
                        break;
                    case 9:
                        this.packageName = (String) value;
                        break;
                    case 10:
                        this.noHistory = (Boolean) value;
                        break;
                    case 11:
                        this.additionalTrustedOrigins = (List) value;
                        break;
                    case 12:
                        Map map2 = (Map) value;
                        String str2 = (String) map2.get("type");
                        if (str2 != null) {
                            if (!str2.equals("IMMERSIVE_MODE")) {
                                if (str2.equals("DEFAULT_MODE")) {
                                    this.displayMode = new C5134a.C5135a();
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                this.displayMode = new C5134a.C5136b(((Boolean) map2.get("isSticky")).booleanValue(), ((Integer) map2.get("layoutInDisplayCutoutMode")).intValue());
                                break;
                            }
                        } else {
                            break;
                        }
                    case 13:
                        this.keepAliveEnabled = (Boolean) value;
                        break;
                }
            }
        }
        return this;
    }
}
