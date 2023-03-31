package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.C11669k;

/* renamed from: com.onesignal.d0 */
/* compiled from: NavigateToAndroidSettingsForLocation.kt */
public final class C8328d0 {

    /* renamed from: a */
    public static final C8328d0 f35384a = new C8328d0();

    private C8328d0() {
    }

    /* renamed from: a */
    public final void mo27678a(Context context) {
        C11669k.m56787e(context, "context");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);
    }
}
