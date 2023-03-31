package com.onesignal;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.C11669k;

/* renamed from: com.onesignal.e0 */
/* compiled from: NavigateToAndroidSettingsForNotifications.kt */
public final class C8405e0 {

    /* renamed from: a */
    public static final C8405e0 f35564a = new C8405e0();

    private C8405e0() {
    }

    /* renamed from: a */
    public final void mo27761a(Context context) {
        C11669k.m56787e(context, "context");
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.addFlags(268435456);
        intent.putExtra("app_package", context.getPackageName());
        intent.putExtra("app_uid", context.getApplicationInfo().uid);
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        context.startActivity(intent);
    }
}
