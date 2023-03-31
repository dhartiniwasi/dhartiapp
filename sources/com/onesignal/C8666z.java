package com.onesignal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import kotlin.jvm.internal.C11669k;

/* renamed from: com.onesignal.z */
/* compiled from: IntentGeneratorForAttachingToNotifications.kt */
public final class C8666z {

    /* renamed from: a */
    private final Class<?> f36178a = NotificationOpenedReceiver.class;

    /* renamed from: b */
    private final Class<?> f36179b = NotificationOpenedReceiverAndroid22AndOlder.class;

    /* renamed from: c */
    private final Context f36180c;

    public C8666z(Context context) {
        C11669k.m56787e(context, "context");
        this.f36180c = context;
    }

    /* renamed from: c */
    private final Intent m47911c() {
        Intent intent = new Intent(this.f36180c, this.f36179b);
        intent.addFlags(403177472);
        return intent;
    }

    /* renamed from: d */
    private final Intent m47912d() {
        return new Intent(this.f36180c, this.f36178a);
    }

    /* renamed from: a */
    public final PendingIntent mo28338a(int i, Intent intent) {
        C11669k.m56787e(intent, "oneSignalIntent");
        return PendingIntent.getActivity(this.f36180c, i, intent, 201326592);
    }

    /* renamed from: b */
    public final Intent mo28339b(int i) {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 23) {
            intent = m47912d();
        } else {
            intent = m47911c();
        }
        Intent addFlags = intent.putExtra("androidNotificationId", i).addFlags(603979776);
        C11669k.m56786d(addFlags, "intent\n            .putE…Y_CLEAR_TOP\n            )");
        return addFlags;
    }
}
