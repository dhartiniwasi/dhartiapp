package com.startapp.sdk.adsbase;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import com.startapp.C9023i4;
import com.startapp.C9043j4;
import com.startapp.C9584u9;
import com.startapp.C9605vb;
import com.startapp.C9688ze;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import com.startapp.sdk.components.ComponentLocator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* compiled from: Sta */
public class StartAppSDK {
    public static void addWrapper(Context context, String str, String str2) {
        Object obj = StartAppSDKInternal.f38662D;
        StartAppSDKInternal startAppSDKInternal = StartAppSDKInternal.C9395d.f38707a;
        if (startAppSDKInternal.f38683q == null) {
            startAppSDKInternal.f38683q = new TreeMap();
        }
        startAppSDKInternal.f38683q.put(str, str2);
        C9441e d = ComponentLocator.m50248a(context).mo31168d();
        Map<String, String> map = startAppSDKInternal.f38683q;
        Map<Activity, Integer> map2 = C9605vb.f39316a;
        String jSONObject = new JSONObject(map).toString();
        C9441e.C9442a a = d.edit();
        a.mo30812a("sharedPrefsWrappers", jSONObject);
        a.f38873a.putString("sharedPrefsWrappers", jSONObject);
        a.apply();
    }

    public static void enableReturnAds(boolean z) {
        Object obj = StartAppSDKInternal.f38662D;
        StartAppSDKInternal.C9395d.f38707a.mo30557a(z);
    }

    public static SharedPreferences getExtras(Context context) {
        return ComponentLocator.m50248a(context).mo31174j();
    }

    public static String getVersion() {
        return "4.10.8";
    }

    public static void inAppPurchaseMade(Context context) {
        inAppPurchaseMade(context, 0.0d);
    }

    public static void init(Context context, String str) {
        init(context, str, new SDKAdPreferences());
    }

    public static void setTestAdsEnabled(boolean z) {
        Object obj = StartAppSDKInternal.f38662D;
        StartAppSDKInternal.C9395d.f38707a.f38666C = z;
    }

    public static void setUserConsent(Context context, String str, long j, boolean z) {
        String str2;
        Object obj = StartAppSDKInternal.f38662D;
        StartAppSDKInternal.C9395d.f38707a.getClass();
        if ("pas".equalsIgnoreCase(str)) {
            C9441e d = ComponentLocator.m50248a(context).mo31168d();
            String string = d.getString("USER_CONSENT_PERSONALIZED_ADS_SERVING", (String) null);
            String str3 = "1";
            if (string != null) {
                if (string.equals(z ? str3 : "0")) {
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            if (z) {
                str2 = str3;
            } else {
                str2 = "0";
            }
            sb.append(str2);
            sb.append("M");
            String sb2 = sb.toString();
            C9023i4 i4Var = new C9023i4(C9043j4.f36993d);
            i4Var.f36952d = C9688ze.m50607a("User consent: ", str);
            i4Var.f36953e = sb2;
            i4Var.mo29471a();
            C9441e.C9442a a = d.edit();
            if (!z) {
                str3 = "0";
            }
            a.mo30812a("USER_CONSENT_PERSONALIZED_ADS_SERVING", str3);
            a.f38873a.putString("USER_CONSENT_PERSONALIZED_ADS_SERVING", str3);
            a.apply();
            C9584u9.f39253d.mo31309a(context, MetaDataRequest.RequestReason.PAS);
        }
    }

    public static void startNewSession(Context context) {
        Object obj = StartAppSDKInternal.f38662D;
        StartAppSDKInternal.C9395d.f38707a.mo30561b(context, MetaDataRequest.RequestReason.CUSTOM);
    }

    public static void inAppPurchaseMade(Context context, double d) {
        C9441e d2 = ComponentLocator.m50248a(context).mo31168d();
        float f = d2.getFloat("inAppPurchaseAmount", 0.0f);
        C9441e.C9442a a = d2.edit();
        float f2 = (float) (((double) f) + d);
        a.mo30812a("inAppPurchaseAmount", Float.valueOf(f2));
        a.f38873a.putFloat("inAppPurchaseAmount", f2);
        a.mo30812a("payingUser", Boolean.TRUE);
        a.f38873a.putBoolean("payingUser", true);
        a.apply();
        Object obj = StartAppSDKInternal.f38662D;
        StartAppSDKInternal.C9395d.f38707a.mo30561b(context, MetaDataRequest.RequestReason.IN_APP_PURCHASE);
    }

    public static void init(Context context, String str, SDKAdPreferences sDKAdPreferences) {
        init(context, (String) null, str, sDKAdPreferences);
    }

    public static void init(Context context, String str, String str2) {
        init(context, str, str2, new SDKAdPreferences());
    }

    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences) {
        init(context, str, str2, sDKAdPreferences, true);
    }

    public static void init(Context context, String str, boolean z) {
        init(context, (String) null, str, z);
    }

    public static void init(Context context, String str, String str2, boolean z) {
        init(context, str, str2, new SDKAdPreferences(), z);
    }

    public static void init(Context context, String str, SDKAdPreferences sDKAdPreferences, boolean z) {
        init(context, (String) null, str, sDKAdPreferences, z);
    }

    public static void init(Context context, String str, String str2, SDKAdPreferences sDKAdPreferences, boolean z) {
        Object obj = StartAppSDKInternal.f38662D;
        StartAppSDKInternal.C9395d.f38707a.mo30556a(context, str, str2, sDKAdPreferences, z);
    }
}
