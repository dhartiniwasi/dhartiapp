package com.onesignal;

import android.content.Context;
import kotlin.jvm.internal.C11669k;

/* renamed from: com.onesignal.x1 */
/* compiled from: OSNotificationOpenAppSettings.kt */
public final class C8648x1 {

    /* renamed from: a */
    public static final C8648x1 f36122a = new C8648x1();

    private C8648x1() {
    }

    /* renamed from: a */
    public final boolean mo28302a(Context context) {
        C11669k.m56787e(context, "context");
        return !C11669k.m56783a("DISABLE", OSUtils.m46196f(context, "com.onesignal.NotificationOpened.DEFAULT"));
    }

    /* renamed from: b */
    public final boolean mo28303b(Context context) {
        C11669k.m56787e(context, "context");
        return OSUtils.m46197g(context, "com.onesignal.suppressLaunchURLs");
    }
}
