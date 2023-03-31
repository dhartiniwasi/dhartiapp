package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class NotificationOpenedActivityHMS extends Activity {
    /* renamed from: a */
    private void m46120a() {
        m46121b(getIntent());
        finish();
    }

    /* renamed from: b */
    private void m46121b(Intent intent) {
        C8472k0.m46937b(this, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m46120a();
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m46120a();
    }
}
