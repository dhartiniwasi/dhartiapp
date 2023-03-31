package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.C8338d3;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p170y0.C6087d;
import p170y0.C6097l;
import p170y0.C6111t;

class OSNotificationRestoreWorkManager {

    /* renamed from: a */
    static final String[] f35269a = {"notification_id", "android_notification_id", "full_data", "created_time"};

    /* renamed from: b */
    private static final String f35270b = NotificationRestoreWorker.class.getCanonicalName();

    /* renamed from: c */
    public static boolean f35271c;

    public static class NotificationRestoreWorker extends Worker {
        public NotificationRestoreWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        public ListenableWorker.C1526a doWork() {
            Context applicationContext = getApplicationContext();
            if (C8338d3.f35438f == null) {
                C8338d3.m46506d1(applicationContext);
            }
            if (!OSUtils.m46194a(applicationContext)) {
                return ListenableWorker.C1526a.m7083a();
            }
            if (OSNotificationRestoreWorkManager.f35271c) {
                return ListenableWorker.C1526a.m7083a();
            }
            OSNotificationRestoreWorkManager.f35271c = true;
            C8338d3.m46492a(C8338d3.C8384r0.INFO, "Restoring notifications");
            C8475k3 n = C8475k3.m46963n(applicationContext);
            StringBuilder x = C8475k3.m46967x();
            OSNotificationRestoreWorkManager.m46142f(applicationContext, x);
            OSNotificationRestoreWorkManager.m46140d(applicationContext, n, x);
            return ListenableWorker.C1526a.m7085c();
        }
    }

    /* renamed from: c */
    public static void m46139c(Context context, boolean z) {
        C6111t.m35740g(context).mo20942f(f35270b, C6087d.KEEP, (C6097l) ((C6097l.C6098a) new C6097l.C6098a(NotificationRestoreWorker.class).mo20951g((long) (z ? 15 : 0), TimeUnit.SECONDS)).mo20948b());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m46140d(Context context, C8475k3 k3Var, StringBuilder sb) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.INFO;
        C8338d3.m46492a(r0Var, "Querying DB for notifications to restore: " + sb.toString());
        Cursor cursor = null;
        try {
            cursor = k3Var.mo27884b("notification", f35269a, sb.toString(), (String[]) null, (String) null, (String) null, "_id DESC", C8453h0.f35657a);
            m46141e(context, cursor, 200);
            C8458i.m46863c(k3Var, context);
            if (cursor == null || cursor.isClosed()) {
                return;
            }
        } catch (Throwable th) {
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
        cursor.close();
    }

    /* renamed from: e */
    static void m46141e(Context context, Cursor cursor, int i) {
        if (cursor.moveToFirst()) {
            do {
                OSNotificationWorkManager.m46144b(context, cursor.getString(cursor.getColumnIndex("notification_id")), cursor.getInt(cursor.getColumnIndex("android_notification_id")), cursor.getString(cursor.getColumnIndex("full_data")), cursor.getLong(cursor.getColumnIndex("created_time")), true, false);
                if (i > 0) {
                    OSUtils.m46190W(i);
                }
            } while (cursor.moveToNext());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static void m46142f(Context context, StringBuilder sb) {
        if (Build.VERSION.SDK_INT >= 23) {
            StatusBarNotification[] d = C8483l3.m47020d(context);
            if (d.length != 0) {
                ArrayList arrayList = new ArrayList();
                for (StatusBarNotification id : d) {
                    arrayList.add(Integer.valueOf(id.getId()));
                }
                sb.append(" AND android_notification_id NOT IN (");
                sb.append(TextUtils.join(",", arrayList));
                sb.append(")");
            }
        }
    }
}
