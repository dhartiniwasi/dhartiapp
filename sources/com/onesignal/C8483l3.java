package com.onesignal;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import androidx.core.app.C0651l;
import androidx.core.app.C0665o;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.onesignal.l3 */
/* compiled from: OneSignalNotificationManager */
public class C8483l3 {
    /* renamed from: a */
    public static boolean m47017a(Context context, String str) {
        NotificationChannel notificationChannel;
        if (!C0665o.m3094e(context).mo2965a()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = m47025i(context).getNotificationChannel(str)) == null || notificationChannel.getImportance() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    static void m47018b(Context context, ArrayList<StatusBarNotification> arrayList) {
        Iterator<StatusBarNotification> it = arrayList.iterator();
        while (it.hasNext()) {
            StatusBarNotification next = it.next();
            C0665o.m3094e(context).mo2969g(next.getId(), Notification.Builder.recoverBuilder(context, next.getNotification()).setGroup("os_group_undefined").setOnlyAlertOnce(true).build());
        }
    }

    /* renamed from: c */
    static ArrayList<StatusBarNotification> m47019c(Context context) {
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        for (StatusBarNotification statusBarNotification : m47020d(context)) {
            Notification notification = statusBarNotification.getNotification();
            boolean f = C8453h0.m46853f(statusBarNotification);
            boolean z = notification.getGroup() == null || notification.getGroup().equals(m47023g());
            if (!f && z) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    static StatusBarNotification[] m47020d(Context context) {
        try {
            return m47025i(context).getActiveNotifications();
        } catch (Throwable unused) {
            return new StatusBarNotification[0];
        }
    }

    /* renamed from: e */
    static Integer m47021e(Context context) {
        int i = 0;
        for (StatusBarNotification statusBarNotification : m47020d(context)) {
            if (!C0651l.m2994b(statusBarNotification.getNotification()) && "os_group_undefined".equals(statusBarNotification.getNotification().getGroup())) {
                i++;
            }
        }
        return Integer.valueOf(i);
    }

    /* renamed from: f */
    static int m47022f() {
        return -718463522;
    }

    /* renamed from: g */
    static String m47023g() {
        return "os_group_undefined";
    }

    /* renamed from: h */
    static Integer m47024h(C8475k3 k3Var, String str, boolean z) {
        String str2 = z ? "group_id IS NULL" : "group_id = ?";
        Cursor b = k3Var.mo27884b("notification", (String[]) null, str2 + " AND dismissed = 0 AND opened = 0 AND is_summary = 0", z ? null : new String[]{str}, (String) null, (String) null, "created_time DESC", "1");
        if (!b.moveToFirst()) {
            b.close();
            return null;
        }
        Integer valueOf = Integer.valueOf(b.getInt(b.getColumnIndex("android_notification_id")));
        b.close();
        return valueOf;
    }

    /* renamed from: i */
    static NotificationManager m47025i(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }
}
