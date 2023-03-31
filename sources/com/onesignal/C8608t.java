package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.C11669k;
import org.json.JSONObject;

/* renamed from: com.onesignal.t */
/* compiled from: GenerateNotificationOpenIntentFromPushPayload.kt */
public final class C8608t {

    /* renamed from: a */
    public static final C8608t f36032a = new C8608t();

    private C8608t() {
    }

    /* renamed from: b */
    private final Intent m47702b(Uri uri) {
        if (uri == null) {
            return null;
        }
        return OSUtils.m46183P(uri);
    }

    /* renamed from: c */
    private final boolean m47703c(boolean z, JSONObject jSONObject) {
        return z | (C8454h1.m46854a(jSONObject) != null);
    }

    /* renamed from: a */
    public final C8598s mo28207a(Context context, JSONObject jSONObject) {
        C11669k.m56787e(context, "context");
        C11669k.m56787e(jSONObject, "fcmPayload");
        C8663y1 y1Var = new C8663y1(context, jSONObject);
        return new C8598s(context, m47702b(y1Var.mo28335b()), m47703c(y1Var.mo28334a(), jSONObject));
    }
}
