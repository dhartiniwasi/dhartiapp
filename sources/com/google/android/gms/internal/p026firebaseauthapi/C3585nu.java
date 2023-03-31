package com.google.android.gms.internal.p026firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.nu */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
final class C3585nu extends BroadcastReceiver {

    /* renamed from: a */
    private final String f22432a;

    /* renamed from: b */
    final /* synthetic */ C3651pu f22433b;

    public C3585nu(C3651pu puVar, String str) {
        this.f22433b = puVar;
        this.f22432a = str;
    }

    public final void onReceive(Context context, Intent intent) {
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).mo7950J1() == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                C3618ou ouVar = (C3618ou) this.f22433b.f22529c.get(this.f22432a);
                if (ouVar == null) {
                    C3651pu.f22526d.mo17930c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    String b = C3651pu.m26508b(str);
                    ouVar.f22486e = b;
                    if (b == null) {
                        C3651pu.f22526d.mo17930c("Unable to extract verification code.", new Object[0]);
                    } else if (!C3296f5.m25552d(ouVar.f22485d)) {
                        C3651pu.m26510e(this.f22433b, this.f22432a);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
