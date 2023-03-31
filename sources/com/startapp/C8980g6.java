package com.startapp;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* renamed from: com.startapp.g6 */
/* compiled from: Sta */
public class C8980g6 {

    /* renamed from: a */
    public String f36846a;

    /* renamed from: b */
    public boolean f36847b = true;

    /* renamed from: c */
    public boolean f36848c = true;

    /* renamed from: d */
    public Boolean f36849d;

    /* renamed from: e */
    public Boolean f36850e;

    public C8980g6(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    Object obj = bundle.get("com.startapp.sdk.APPLICATION_ID");
                    if (obj != null) {
                        this.f36846a = obj.toString();
                        Log.i("StartAppSDK", "appId is " + this.f36846a);
                    } else {
                        Log.i("StartAppSDK", "appId hasn't been provided in the Manifest");
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.RETURN_ADS_ENABLED")) {
                        this.f36847b = applicationInfo.metaData.getBoolean("com.startapp.sdk.RETURN_ADS_ENABLED");
                        Log.i("StartAppSDK", "returnAds enabled: " + this.f36847b);
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.SPLASH_ENABLED")) {
                        this.f36848c = applicationInfo.metaData.getBoolean("com.startapp.sdk.SPLASH_ENABLED");
                        Log.i("StartAppSDK", "splash enabled: " + this.f36848c);
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.MIXED_AUDIENCE")) {
                        this.f36849d = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.startapp.sdk.MIXED_AUDIENCE"));
                        Log.i("StartAppSDK", "is mixed audience: " + this.f36849d);
                    }
                    if (applicationInfo.metaData.containsKey("com.startapp.sdk.CHILD_DIRECTED")) {
                        this.f36850e = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.startapp.sdk.CHILD_DIRECTED"));
                        Log.i("StartAppSDK", "is child directed: " + this.f36850e);
                    }
                }
            } catch (Throwable th) {
                C9023i4.m48681a(th);
            }
        }
    }
}
