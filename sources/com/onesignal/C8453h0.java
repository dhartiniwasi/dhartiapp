package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.onesignal.h0 */
/* compiled from: NotificationLimitManager */
class C8453h0 {

    /* renamed from: a */
    static final String f35657a = Integer.toString(49);

    /* renamed from: a */
    static void m46848a(Context context, int i) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                m46850c(context, i);
            } else {
                m46849b(context, i);
            }
        } catch (Throwable unused) {
            m46849b(context, i);
        }
    }

    /* renamed from: b */
    static void m46849b(Context context, int i) {
        C8475k3 n = C8475k3.m46963n(context);
        Cursor cursor = null;
        try {
            cursor = n.mo27884b("notification", new String[]{"android_notification_id"}, C8475k3.m46967x().toString(), (String[]) null, (String) null, (String) null, "_id", m46852e() + i);
            int count = (cursor.getCount() - m46851d()) + i;
            if (count >= 1) {
                do {
                    if (!cursor.moveToNext()) {
                        break;
                    }
                    C8338d3.m46464Q1(cursor.getInt(cursor.getColumnIndex("android_notification_id")));
                    count--;
                } while (count > 0);
                if (cursor.isClosed()) {
                    return;
                }
                cursor.close();
            } else if (!cursor.isClosed()) {
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: c */
    static void m46850c(Context context, int i) throws Throwable {
        StatusBarNotification[] d = C8483l3.m47020d(context);
        int length = (d.length - m46851d()) + i;
        if (length >= 1) {
            TreeMap treeMap = new TreeMap();
            for (StatusBarNotification statusBarNotification : d) {
                if (!m46853f(statusBarNotification)) {
                    treeMap.put(Long.valueOf(statusBarNotification.getNotification().when), Integer.valueOf(statusBarNotification.getId()));
                }
            }
            for (Map.Entry value : treeMap.entrySet()) {
                C8338d3.m46464Q1(((Integer) value.getValue()).intValue());
                length--;
                if (length <= 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    private static int m46851d() {
        return 49;
    }

    /* renamed from: e */
    private static String m46852e() {
        return f35657a;
    }

    /* renamed from: f */
    static boolean m46853f(StatusBarNotification statusBarNotification) {
        return (statusBarNotification.getNotification().flags & 512) != 0;
    }
}
