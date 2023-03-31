package com.onesignal;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.C11669k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.onesignal.h1 */
/* compiled from: OSInAppMessagePreviewHandler.kt */
public final class C8454h1 {

    /* renamed from: a */
    public static final C8454h1 f35658a = new C8454h1();

    private C8454h1() {
    }

    /* renamed from: a */
    public static final String m46854a(JSONObject jSONObject) {
        JSONObject optJSONObject;
        C11669k.m56787e(jSONObject, "payload");
        try {
            JSONObject b = C8411f0.m46661b(jSONObject);
            C11669k.m56786d(b, "NotificationBundleProces…CustomJSONObject(payload)");
            if (b.has("a") && (optJSONObject = b.optJSONObject("a")) != null && optJSONObject.has("os_in_app_message_preview_id")) {
                return optJSONObject.optString("os_in_app_message_preview_id");
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final boolean m46855b(Activity activity, JSONObject jSONObject) {
        C11669k.m56787e(activity, "activity");
        C11669k.m56787e(jSONObject, "jsonData");
        String a = m46854a(jSONObject);
        if (a == null) {
            return false;
        }
        C8338d3.m46401A1(activity, new JSONArray().put(jSONObject));
        C8338d3.m46541m0().mo27616J(a);
        return true;
    }

    /* renamed from: c */
    public static final boolean m46856c(Context context, Bundle bundle) {
        JSONObject a = C8411f0.m46660a(bundle);
        C11669k.m56786d(a, "NotificationBundleProces…undleAsJSONObject(bundle)");
        String a2 = m46854a(a);
        if (a2 == null) {
            return false;
        }
        if (C8338d3.m46514f1()) {
            C8338d3.m46541m0().mo27616J(a2);
            return true;
        } else if (!f35658a.m46857d()) {
            return true;
        } else {
            C8581r.m47578m(new C8632v1(context, a));
            return true;
        }
    }

    /* renamed from: d */
    private final boolean m46857d() {
        return Build.VERSION.SDK_INT > 18;
    }
}
