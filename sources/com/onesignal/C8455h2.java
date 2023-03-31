package com.onesignal;

import com.onesignal.C8338d3;
import com.onesignal.C8524o3;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.h2 */
/* compiled from: OSReceiveReceiptRepository */
class C8455h2 {
    C8455h2() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo27837a(String str, String str2, Integer num, String str3, C8524o3.C8531g gVar) {
        try {
            JSONObject put = new JSONObject().put("app_id", str).put("player_id", str2);
            if (num != null) {
                put.put("device_type", num);
            }
            C8524o3.m47240l("notifications/" + str3 + "/report_received", put, gVar);
        } catch (JSONException e) {
            C8338d3.m46496b(C8338d3.C8384r0.ERROR, "Generating direct receive receipt:JSON Failed.", e);
        }
    }
}
