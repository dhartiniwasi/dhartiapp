package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import p287la.C11778a;
import p287la.C11779b;
import p296ma.C11876b;

public class SamsungHomeBadger implements C11778a {

    /* renamed from: b */
    private static final String[] f36025b = {"_id", "class"};

    /* renamed from: a */
    private DefaultBadger f36026a;

    public SamsungHomeBadger() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f36026a = new DefaultBadger();
        }
    }

    /* renamed from: c */
    private ContentValues m47684c(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    /* renamed from: a */
    public List<String> mo28204a() {
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }

    /* renamed from: b */
    public void mo28205b(Context context, ComponentName componentName, int i) throws C11779b {
        DefaultBadger defaultBadger = this.f36026a;
        if (defaultBadger == null || !defaultBadger.mo28206c(context)) {
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            Cursor cursor = null;
            try {
                cursor = contentResolver.query(parse, f36025b, "package=?", new String[]{componentName.getPackageName()}, (String) null);
                if (cursor != null) {
                    String className = componentName.getClassName();
                    boolean z = false;
                    while (cursor.moveToNext()) {
                        int i2 = cursor.getInt(0);
                        contentResolver.update(parse, m47684c(componentName, i, false), "_id=?", new String[]{String.valueOf(i2)});
                        if (className.equals(cursor.getString(cursor.getColumnIndex("class")))) {
                            z = true;
                        }
                    }
                    if (!z) {
                        contentResolver.insert(parse, m47684c(componentName, i, true));
                    }
                }
            } finally {
                C11876b.m57375a(cursor);
            }
        } else {
            this.f36026a.mo28205b(context, componentName, i);
        }
    }
}
