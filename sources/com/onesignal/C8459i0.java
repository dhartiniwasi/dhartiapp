package com.onesignal;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import androidx.core.app.C0665o;
import com.onesignal.C8338d3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.i0 */
/* compiled from: NotificationOpenedProcessor */
class C8459i0 {
    /* renamed from: a */
    private static void m46867a(JSONArray jSONArray, String str, C8475k3 k3Var) {
        C8475k3 k3Var2 = k3Var;
        Cursor f = k3Var2.mo27885f("notification", new String[]{"full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, (String) null, (String) null, (String) null);
        if (f.getCount() > 1) {
            f.moveToFirst();
            do {
                try {
                    jSONArray.put(new JSONObject(f.getString(f.getColumnIndex("full_data"))));
                } catch (JSONException unused) {
                    C8338d3.C8384r0 r0Var = C8338d3.C8384r0.ERROR;
                    C8338d3.m46492a(r0Var, "Could not parse JSON of sub notification in group: " + str);
                }
            } while (f.moveToNext());
        }
        f.close();
    }

    /* renamed from: b */
    private static void m46868b(Context context, C8475k3 k3Var, String str) {
        if (str != null) {
            C8486m0.m47035a(context, k3Var, str);
        } else if (Build.VERSION.SDK_INT >= 23 && C8483l3.m47021e(context).intValue() < 1) {
            C8483l3.m47025i(context).cancel(C8483l3.m47022f());
        }
    }

    /* renamed from: c */
    private static void m46869c(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            C0665o.m3094e(context).mo2966b(intent.getIntExtra("androidNotificationId", 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    /* renamed from: d */
    private static boolean m46870d(Intent intent) {
        return intent.hasExtra("onesignalData") || intent.hasExtra("summary") || intent.hasExtra("androidNotificationId");
    }

    /* renamed from: e */
    private static void m46871e(Context context, Intent intent, C8475k3 k3Var, boolean z) {
        String str;
        String stringExtra = intent.getStringExtra("summary");
        String[] strArr = null;
        if (stringExtra != null) {
            boolean equals = stringExtra.equals(C8483l3.m47023g());
            if (equals) {
                str = "group_id IS NULL";
            } else {
                strArr = new String[]{stringExtra};
                str = "group_id = ?";
            }
            if (!z && !C8338d3.m46483X()) {
                String valueOf = String.valueOf(C8483l3.m47024h(k3Var, stringExtra, equals));
                str = str + " AND android_notification_id = ?";
                strArr = equals ? new String[]{valueOf} : new String[]{stringExtra, valueOf};
            }
        } else {
            str = "android_notification_id = " + intent.getIntExtra("androidNotificationId", 0);
        }
        m46868b(context, k3Var, stringExtra);
        k3Var.mo27883a("notification", m46872f(intent), str, strArr);
        C8458i.m46863c(k3Var, context);
    }

    /* renamed from: f */
    private static ContentValues m46872f(Intent intent) {
        ContentValues contentValues = new ContentValues();
        if (intent.getBooleanExtra("dismissed", false)) {
            contentValues.put("dismissed", 1);
        } else {
            contentValues.put("opened", 1);
        }
        return contentValues;
    }

    /* renamed from: g */
    static void m46873g(Context context, Intent intent) {
        if (m46870d(intent)) {
            if (context != null) {
                C8338d3.m46506d1(context.getApplicationContext());
            }
            m46869c(context, intent);
            m46874h(context, intent);
        }
    }

    /* renamed from: h */
    static void m46874h(Context context, Intent intent) {
        C8641w1 w1Var;
        String stringExtra;
        C8475k3 n = C8475k3.m46963n(context);
        String stringExtra2 = intent.getStringExtra("summary");
        boolean booleanExtra = intent.getBooleanExtra("dismissed", false);
        if (!booleanExtra) {
            w1Var = m46875i(context, intent, n, stringExtra2);
            if (w1Var == null) {
                return;
            }
        } else {
            w1Var = null;
        }
        m46871e(context, intent, n, booleanExtra);
        if (stringExtra2 == null && (stringExtra = intent.getStringExtra("grp")) != null) {
            C8486m0.m47040f(context, n, stringExtra, booleanExtra);
        }
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46594z1(r0Var, "processIntent from context: " + context + " and intent: " + intent);
        if (intent.getExtras() != null) {
            C8338d3.m46594z1(r0Var, "processIntent intent extras: " + intent.getExtras().toString());
        }
        if (booleanExtra) {
            return;
        }
        if (!(context instanceof Activity)) {
            C8338d3.C8384r0 r0Var2 = C8338d3.C8384r0.ERROR;
            C8338d3.m46594z1(r0Var2, "NotificationOpenedProcessor processIntent from an non Activity context: " + context);
            return;
        }
        C8338d3.m46478V0((Activity) context, w1Var.mo28275a(), C8623u1.m47742b(w1Var.mo28276b()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.onesignal.C8641w1 m46875i(android.content.Context r7, android.content.Intent r8, com.onesignal.C8475k3 r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "androidNotificationId"
            java.lang.String r1 = "onesignalData"
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0051 }
            java.lang.String r4 = r8.getStringExtra(r1)     // Catch:{ JSONException -> 0x0051 }
            r3.<init>(r4)     // Catch:{ JSONException -> 0x0051 }
            boolean r4 = r7 instanceof android.app.Activity     // Catch:{ JSONException -> 0x004f }
            if (r4 != 0) goto L_0x0029
            com.onesignal.d3$r0 r4 = com.onesignal.C8338d3.C8384r0.ERROR     // Catch:{ JSONException -> 0x004f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x004f }
            r5.<init>()     // Catch:{ JSONException -> 0x004f }
            java.lang.String r6 = "NotificationOpenedProcessor processIntent from an non Activity context: "
            r5.append(r6)     // Catch:{ JSONException -> 0x004f }
            r5.append(r7)     // Catch:{ JSONException -> 0x004f }
            java.lang.String r7 = r5.toString()     // Catch:{ JSONException -> 0x004f }
            com.onesignal.C8338d3.m46594z1(r4, r7)     // Catch:{ JSONException -> 0x004f }
            goto L_0x0032
        L_0x0029:
            android.app.Activity r7 = (android.app.Activity) r7     // Catch:{ JSONException -> 0x004f }
            boolean r7 = com.onesignal.C8454h1.m46855b(r7, r3)     // Catch:{ JSONException -> 0x004f }
            if (r7 == 0) goto L_0x0032
            return r2
        L_0x0032:
            r7 = 0
            int r7 = r8.getIntExtra(r0, r7)     // Catch:{ JSONException -> 0x004f }
            r3.put(r0, r7)     // Catch:{ JSONException -> 0x004f }
            java.lang.String r7 = r3.toString()     // Catch:{ JSONException -> 0x004f }
            r8.putExtra(r1, r7)     // Catch:{ JSONException -> 0x004f }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004f }
            java.lang.String r8 = r8.getStringExtra(r1)     // Catch:{ JSONException -> 0x004f }
            r7.<init>(r8)     // Catch:{ JSONException -> 0x004f }
            org.json.JSONArray r2 = com.onesignal.C8411f0.m46666g(r7)     // Catch:{ JSONException -> 0x004f }
            goto L_0x0056
        L_0x004f:
            r7 = move-exception
            goto L_0x0053
        L_0x0051:
            r7 = move-exception
            r3 = r2
        L_0x0053:
            r7.printStackTrace()
        L_0x0056:
            if (r10 == 0) goto L_0x005b
            m46867a(r2, r10, r9)
        L_0x005b:
            com.onesignal.w1 r7 = new com.onesignal.w1
            r7.<init>(r2, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8459i0.m46875i(android.content.Context, android.content.Intent, com.onesignal.k3, java.lang.String):com.onesignal.w1");
    }
}
