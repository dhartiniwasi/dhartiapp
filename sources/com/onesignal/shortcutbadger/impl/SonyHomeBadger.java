package com.onesignal.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import p287la.C11778a;
import p287la.C11779b;

public class SonyHomeBadger implements C11778a {

    /* renamed from: a */
    private final Uri f36027a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* renamed from: b */
    private AsyncQueryHandler f36028b;

    /* renamed from: com.onesignal.shortcutbadger.impl.SonyHomeBadger$a */
    class C8607a extends AsyncQueryHandler {
        C8607a(ContentResolver contentResolver) {
            super(contentResolver);
        }
    }

    /* renamed from: c */
    private ContentValues m47687c(int i, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    /* renamed from: d */
    private static void m47688d(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i > 0);
        context.sendBroadcast(intent);
    }

    /* renamed from: e */
    private void m47689e(Context context, ComponentName componentName, int i) {
        if (i >= 0) {
            ContentValues c = m47687c(i, componentName);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f36028b == null) {
                    this.f36028b = new C8607a(context.getApplicationContext().getContentResolver());
                }
                m47690f(c);
                return;
            }
            m47691g(context, c);
        }
    }

    /* renamed from: f */
    private void m47690f(ContentValues contentValues) {
        this.f36028b.startInsert(0, (Object) null, this.f36027a, contentValues);
    }

    /* renamed from: g */
    private void m47691g(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.f36027a, contentValues);
    }

    /* renamed from: h */
    private static boolean m47692h(Context context) {
        return context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null;
    }

    /* renamed from: a */
    public List<String> mo28204a() {
        return Arrays.asList(new String[]{"com.sonyericsson.home", "com.sonymobile.home"});
    }

    /* renamed from: b */
    public void mo28205b(Context context, ComponentName componentName, int i) throws C11779b {
        if (m47692h(context)) {
            m47689e(context, componentName, i);
        } else {
            m47688d(context, componentName, i);
        }
    }
}
