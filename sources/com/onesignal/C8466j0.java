package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.jvm.internal.C11669k;

/* renamed from: com.onesignal.j0 */
/* compiled from: NotificationOpenedReceiverBase.kt */
public abstract class C8466j0 extends Activity {
    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C8459i0.m46873g(this, getIntent());
        finish();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        C11669k.m56787e(intent, "intent");
        super.onNewIntent(intent);
        C8459i0.m46873g(this, getIntent());
        finish();
    }
}
