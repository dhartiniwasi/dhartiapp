package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import p060h4.C4498e3;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class MobileAdsInitProvider extends ContentProvider {

    /* renamed from: a */
    private final C4498e3 f5948a = new C4498e3();

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        this.f5948a.attachInfo(context, providerInfo);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
