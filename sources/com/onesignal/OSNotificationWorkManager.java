package com.onesignal;

import android.content.Context;
import androidx.work.C1536b;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.C8338d3;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p170y0.C6087d;
import p170y0.C6097l;
import p170y0.C6111t;

class OSNotificationWorkManager {

    /* renamed from: a */
    private static Set<String> f35272a = OSUtils.m46179L();

    public static class NotificationWorker extends Worker {
        public NotificationWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        /* renamed from: a */
        private void m46146a(Context context, int i, JSONObject jSONObject, boolean z, Long l) {
            C8575q1 q1Var = new C8575q1((List<C8575q1>) null, jSONObject, i);
            C8295a2 a2Var = new C8295a2(new C8600s1(context, q1Var, jSONObject, z, true, l), q1Var);
            C8338d3.C8341a1 a1Var = C8338d3.f35460q;
            if (a1Var != null) {
                try {
                    a1Var.mo27698a(context, a2Var);
                } catch (Throwable th) {
                    C8338d3.m46496b(C8338d3.C8384r0.ERROR, "remoteNotificationReceived throw an exception. Displaying normal OneSignal notification.", th);
                    a2Var.mo27590b(q1Var);
                    throw th;
                }
            } else {
                C8338d3.m46492a(C8338d3.C8384r0.WARN, "remoteNotificationReceivedHandler not setup, displaying normal OneSignal notification");
                a2Var.mo27590b(q1Var);
            }
        }

        public ListenableWorker.C1526a doWork() {
            C1536b inputData = getInputData();
            try {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
                C8338d3.m46594z1(r0Var, "NotificationWorker running doWork with data: " + inputData);
                int i = inputData.mo6303i("android_notif_id", 0);
                JSONObject jSONObject = new JSONObject(inputData.mo6306l("json_payload"));
                long k = inputData.mo6305k("timestamp", System.currentTimeMillis() / 1000);
                boolean h = inputData.mo6301h("is_restoring", false);
                m46146a(getApplicationContext(), i, jSONObject, h, Long.valueOf(k));
                return ListenableWorker.C1526a.m7085c();
            } catch (JSONException e) {
                C8338d3.C8384r0 r0Var2 = C8338d3.C8384r0.ERROR;
                C8338d3.m46594z1(r0Var2, "Error occurred doing work for job with id: " + getId().toString());
                e.printStackTrace();
                return ListenableWorker.C1526a.m7083a();
            }
        }
    }

    /* renamed from: a */
    static boolean m46143a(String str) {
        if (!OSUtils.m46176I(str)) {
            return true;
        }
        if (f35272a.contains(str)) {
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46492a(r0Var, "OSNotificationWorkManager notification with notificationId: " + str + " already queued");
            return false;
        }
        f35272a.add(str);
        return true;
    }

    /* renamed from: b */
    static void m46144b(Context context, String str, int i, String str2, long j, boolean z, boolean z2) {
        C1536b a = new C1536b.C1537a().mo6314f("android_notif_id", i).mo6316h("json_payload", str2).mo6315g("timestamp", j).mo6313e("is_restoring", z).mo6309a();
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "OSNotificationWorkManager enqueueing notification work with notificationId: " + str + " and jsonPayload: " + str2);
        C6111t.m35740g(context).mo20942f(str, C6087d.KEEP, (C6097l) ((C6097l.C6098a) new C6097l.C6098a(NotificationWorker.class).mo20952h(a)).mo20948b());
    }

    /* renamed from: c */
    static void m46145c(String str) {
        if (OSUtils.m46176I(str)) {
            f35272a.remove(str);
        }
    }
}
