package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p098n1.C5095o;
import p098n1.C5100t;
import p147u1.C12649b;
import p171y1.C6116a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m8738b() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C5100t.m31908f(context);
        C5095o.C5096a d = C5095o.m31889a().mo19030b(queryParameter).mo19032d(C6116a.m35765b(intValue));
        if (queryParameter2 != null) {
            d.mo19031c(Base64.decode(queryParameter2, 0));
        }
        C5100t.m31906c().mo19062e().mo20100v(d.mo19029a(), i, C12649b.f46399a);
    }
}
