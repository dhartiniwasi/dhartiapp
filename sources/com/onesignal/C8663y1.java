package com.onesignal;

import android.content.Context;
import android.net.Uri;
import kotlin.jvm.internal.C11669k;
import org.json.JSONObject;

/* renamed from: com.onesignal.y1 */
/* compiled from: OSNotificationOpenBehaviorFromPushPayload.kt */
public final class C8663y1 {

    /* renamed from: a */
    private final Context f36172a;

    /* renamed from: b */
    private final JSONObject f36173b;

    public C8663y1(Context context, JSONObject jSONObject) {
        C11669k.m56787e(context, "context");
        C11669k.m56787e(jSONObject, "fcmPayload");
        this.f36172a = context;
        this.f36173b = jSONObject;
    }

    /* renamed from: a */
    public final boolean mo28334a() {
        return C8648x1.f36122a.mo28302a(this.f36172a) && mo28335b() == null;
    }

    /* renamed from: b */
    public final Uri mo28335b() {
        C8648x1 x1Var = C8648x1.f36122a;
        if (!x1Var.mo28302a(this.f36172a) || x1Var.mo28303b(this.f36172a)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(this.f36173b.optString("custom"));
        if (jSONObject.has("u")) {
            String optString = jSONObject.optString("u");
            if (!C11669k.m56783a(optString, "")) {
                C11669k.m56786d(optString, "url");
                int length = optString.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = C11669k.m56788f(optString.charAt(!z ? i : length), 32) <= 0;
                    if (!z) {
                        if (!z2) {
                            z = true;
                        } else {
                            i++;
                        }
                    } else if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                }
                return Uri.parse(optString.subSequence(i, length + 1).toString());
            }
        }
        return null;
    }
}
