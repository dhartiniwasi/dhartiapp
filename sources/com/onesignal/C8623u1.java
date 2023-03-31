package com.onesignal;

import android.content.Intent;
import android.os.Bundle;
import com.onesignal.C8338d3;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.u1 */
/* compiled from: OSNotificationFormatHelper */
class C8623u1 {
    /* renamed from: a */
    private static String m47741a(Bundle bundle) {
        if (bundle != null && !bundle.isEmpty()) {
            String string = bundle.getString("custom", (String) null);
            if (string != null) {
                return m47743c(string);
            }
            C8338d3.m46492a(C8338d3.C8384r0.DEBUG, "Not a OneSignal formatted Bundle. No 'custom' field in the bundle.");
        }
        return null;
    }

    /* renamed from: b */
    static String m47742b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return m47743c(jSONObject.optString("custom", (String) null));
    }

    /* renamed from: c */
    private static String m47743c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("i")) {
                return jSONObject.optString("i", (String) null);
            }
            C8338d3.m46492a(C8338d3.C8384r0.DEBUG, "Not a OneSignal formatted JSON string. No 'i' field in custom.");
            return null;
        } catch (JSONException unused) {
            C8338d3.m46492a(C8338d3.C8384r0.DEBUG, "Not a OneSignal formatted JSON String, error parsing string as JSON.");
        }
    }

    /* renamed from: d */
    static boolean m47744d(Bundle bundle) {
        return m47741a(bundle) != null;
    }

    /* renamed from: e */
    static boolean m47745e(Intent intent) {
        if (intent == null) {
            return false;
        }
        return m47744d(intent.getExtras());
    }
}
