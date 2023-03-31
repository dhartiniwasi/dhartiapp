package com.onesignal;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.C11669k;

/* renamed from: com.onesignal.s */
/* compiled from: GenerateNotificationOpenIntent.kt */
public final class C8598s {

    /* renamed from: a */
    private final Context f36014a;

    /* renamed from: b */
    private final Intent f36015b;

    /* renamed from: c */
    private final boolean f36016c;

    public C8598s(Context context, Intent intent, boolean z) {
        C11669k.m56787e(context, "context");
        this.f36014a = context;
        this.f36015b = intent;
        this.f36016c = z;
    }

    /* renamed from: a */
    private final Intent m47643a() {
        Intent launchIntentForPackage;
        if (!this.f36016c || (launchIntentForPackage = this.f36014a.getPackageManager().getLaunchIntentForPackage(this.f36014a.getPackageName())) == null) {
            return null;
        }
        C11669k.m56786d(launchIntentForPackage, "context.packageManager.g…           ?: return null");
        launchIntentForPackage.setPackage((String) null);
        launchIntentForPackage.setFlags(270532608);
        return launchIntentForPackage;
    }

    /* renamed from: b */
    public final Intent mo28193b() {
        Intent intent = this.f36015b;
        if (intent != null) {
            return intent;
        }
        return m47643a();
    }
}
