package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.k0 */
/* compiled from: NotificationPayloadProcessorHMS */
class C8472k0 {
    /* renamed from: a */
    private static JSONObject m46936a(Intent intent) {
        if (!C8623u1.m47745e(intent)) {
            return null;
        }
        JSONObject a = C8411f0.m46660a(intent.getExtras());
        m46939d(a);
        return a;
    }

    /* renamed from: b */
    static void m46937b(Activity activity, Intent intent) {
        JSONObject a;
        C8338d3.m46506d1(activity.getApplicationContext());
        if (intent != null && (a = m46936a(intent)) != null) {
            m46938c(activity, a);
        }
    }

    /* renamed from: c */
    private static void m46938c(Activity activity, JSONObject jSONObject) {
        if (!C8454h1.m46855b(activity, jSONObject)) {
            C8338d3.m46478V0(activity, new JSONArray().put(jSONObject), C8623u1.m47742b(jSONObject));
        }
    }

    /* renamed from: d */
    private static void m46939d(JSONObject jSONObject) {
        try {
            String str = (String) C8411f0.m46661b(jSONObject).remove("actionId");
            if (str != null) {
                jSONObject.put("actionId", str);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
