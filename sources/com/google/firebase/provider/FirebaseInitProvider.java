package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import p033d5.C4141r;
import p246h7.C10412f;
import p246h7.C10427p;

public class FirebaseInitProvider extends ContentProvider {

    /* renamed from: a */
    private static C10427p f34800a = C10427p.m52630e();

    /* renamed from: b */
    private static AtomicBoolean f34801b = new AtomicBoolean(false);

    /* renamed from: a */
    private static void m44472a(ProviderInfo providerInfo) {
        C4141r.m28222l(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    /* renamed from: b */
    public static C10427p m44473b() {
        return f34800a;
    }

    /* renamed from: c */
    public static boolean m44474c() {
        return f34801b.get();
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        m44472a(providerInfo);
        super.attachInfo(context, providerInfo);
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
        try {
            f34801b.set(true);
            if (C10412f.m52585u(getContext()) == null) {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
            } else {
                Log.i("FirebaseInitProvider", "FirebaseApp initialization successful");
            }
            return false;
        } finally {
            f34801b.set(false);
        }
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
