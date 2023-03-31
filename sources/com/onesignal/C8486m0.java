package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.onesignal.C8338d3;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.m0 */
/* compiled from: NotificationSummaryManager */
class C8486m0 {
    /* renamed from: a */
    static void m47035a(Context context, C8475k3 k3Var, String str) {
        Integer b = m47036b(k3Var, str);
        boolean equals = str.equals(C8483l3.m47023g());
        NotificationManager i = C8483l3.m47025i(context);
        Integer h = C8483l3.m47024h(k3Var, str, equals);
        if (h == null) {
            return;
        }
        if (C8338d3.m46483X()) {
            if (equals) {
                b = Integer.valueOf(C8483l3.m47022f());
            }
            if (b != null) {
                i.cancel(b.intValue());
                return;
            }
            return;
        }
        C8338d3.m46464Q1(h.intValue());
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r9v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v3 */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Integer m47036b(com.onesignal.C8469j3 r11, java.lang.String r12) {
        /*
            java.lang.String r0 = "android_notification_id"
            java.lang.String r4 = "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 1"
            r1 = 1
            java.lang.String[] r5 = new java.lang.String[r1]
            r1 = 0
            r5[r1] = r12
            r9 = 0
            java.lang.String r2 = "notification"
            java.lang.String[] r3 = new java.lang.String[]{r0}     // Catch:{ all -> 0x004a }
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r11
            android.database.Cursor r11 = r1.mo27885f(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004a }
            boolean r1 = r11.moveToFirst()     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x002c
            r11.close()     // Catch:{ all -> 0x0045 }
            boolean r12 = r11.isClosed()
            if (r12 != 0) goto L_0x002b
            r11.close()
        L_0x002b:
            return r9
        L_0x002c:
            int r0 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0045 }
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x0045 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0045 }
            r11.close()     // Catch:{ all -> 0x0045 }
            boolean r12 = r11.isClosed()
            if (r12 != 0) goto L_0x006e
            r11.close()
            goto L_0x006e
        L_0x0045:
            r0 = move-exception
            r10 = r9
            r9 = r11
            r11 = r10
            goto L_0x004c
        L_0x004a:
            r0 = move-exception
            r11 = r9
        L_0x004c:
            com.onesignal.d3$r0 r1 = com.onesignal.C8338d3.C8384r0.ERROR     // Catch:{ all -> 0x006f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r2.<init>()     // Catch:{ all -> 0x006f }
            java.lang.String r3 = "Error getting android notification id for summary notification group: "
            r2.append(r3)     // Catch:{ all -> 0x006f }
            r2.append(r12)     // Catch:{ all -> 0x006f }
            java.lang.String r12 = r2.toString()     // Catch:{ all -> 0x006f }
            com.onesignal.C8338d3.m46496b(r1, r12, r0)     // Catch:{ all -> 0x006f }
            if (r9 == 0) goto L_0x006d
            boolean r12 = r9.isClosed()
            if (r12 != 0) goto L_0x006d
            r9.close()
        L_0x006d:
            r9 = r11
        L_0x006e:
            return r9
        L_0x006f:
            r11 = move-exception
            if (r9 == 0) goto L_0x007b
            boolean r12 = r9.isClosed()
            if (r12 != 0) goto L_0x007b
            r9.close()
        L_0x007b:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8486m0.m47036b(com.onesignal.j3, java.lang.String):java.lang.Integer");
    }

    /* renamed from: c */
    private static Cursor m47037c(Context context, C8469j3 j3Var, String str, boolean z) {
        Cursor f = j3Var.mo27885f("notification", new String[]{"android_notification_id", "created_time", "full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, (String) null, (String) null, "_id DESC");
        int count = f.getCount();
        if (count == 0) {
            f.close();
            Integer b = m47036b(j3Var, str);
            if (b == null) {
                return f;
            }
            C8483l3.m47025i(context).cancel(b.intValue());
            ContentValues contentValues = new ContentValues();
            contentValues.put(z ? "dismissed" : "opened", 1);
            j3Var.mo27883a("notification", contentValues, "android_notification_id = " + b, (String[]) null);
            return f;
        } else if (count == 1) {
            f.close();
            if (m47036b(j3Var, str) == null) {
                return f;
            }
            m47038d(context, str);
            return f;
        } else {
            try {
                f.moveToFirst();
                Long valueOf = Long.valueOf(f.getLong(f.getColumnIndex("created_time")));
                String string = f.getString(f.getColumnIndex("full_data"));
                f.close();
                if (m47036b(j3Var, str) == null) {
                    return f;
                }
                C8632v1 v1Var = new C8632v1(context);
                v1Var.mo28272y(true);
                v1Var.mo28273z(valueOf);
                v1Var.mo28263q(new JSONObject(string));
                C8581r.m47565M(v1Var);
                return f;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: d */
    private static void m47038d(Context context, String str) {
        String[] strArr = {str};
        Cursor cursor = null;
        try {
            cursor = C8475k3.m46963n(context).mo27885f("notification", OSNotificationRestoreWorkManager.f35269a, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", strArr, (String) null, (String) null, (String) null);
            OSNotificationRestoreWorkManager.m46141e(context, cursor, 0);
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
    static void m47039e(Context context, C8469j3 j3Var, int i) {
        Cursor f = j3Var.mo27885f("notification", new String[]{"group_id"}, "android_notification_id = " + i, (String[]) null, (String) null, (String) null, (String) null);
        if (f.moveToFirst()) {
            String string = f.getString(f.getColumnIndex("group_id"));
            f.close();
            if (string != null) {
                m47040f(context, j3Var, string, true);
                return;
            }
            return;
        }
        f.close();
    }

    /* renamed from: f */
    static void m47040f(Context context, C8469j3 j3Var, String str, boolean z) {
        try {
            Cursor c = m47037c(context, j3Var, str, z);
            if (c != null && !c.isClosed()) {
                c.close();
            }
        } catch (Throwable th) {
            C8338d3.m46496b(C8338d3.C8384r0.ERROR, "Error running updateSummaryNotificationAfterChildRemoved!", th);
        }
    }
}
