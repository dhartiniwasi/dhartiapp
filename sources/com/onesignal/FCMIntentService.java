package com.onesignal;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.C8411f0;
import p035e0.C4171a;

public class FCMIntentService extends IntentService {

    /* renamed from: com.onesignal.FCMIntentService$a */
    class C8280a implements C8411f0.C8416e {

        /* renamed from: a */
        final /* synthetic */ Intent f35252a;

        C8280a(Intent intent) {
            this.f35252a = intent;
        }

        /* renamed from: a */
        public void mo27486a(C8411f0.C8417f fVar) {
            C4171a.m28287b(this.f35252a);
        }
    }

    public FCMIntentService() {
        super("FCMIntentService");
        setIntentRedelivery(true);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            C8338d3.m46506d1(this);
            C8411f0.m46667h(this, extras, new C8280a(intent));
        }
    }
}
