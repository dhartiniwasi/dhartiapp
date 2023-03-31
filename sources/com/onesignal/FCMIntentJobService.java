package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.onesignal.C8411f0;

public class FCMIntentJobService extends JobIntentService {

    /* renamed from: com.onesignal.FCMIntentJobService$a */
    class C8279a implements C8411f0.C8416e {
        C8279a() {
        }

        /* renamed from: a */
        public void mo27486a(C8411f0.C8417f fVar) {
        }
    }

    /* renamed from: j */
    public static void m46106j(Context context, Intent intent) {
        JobIntentService.m46112d(context, FCMIntentJobService.class, 123890, intent, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo27493g(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            C8338d3.m46506d1(this);
            C8411f0.m46667h(this, extras, new C8279a());
        }
    }

    /* renamed from: h */
    public /* bridge */ /* synthetic */ boolean mo27494h() {
        return super.mo27494h();
    }

    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
