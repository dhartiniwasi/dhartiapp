package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.onesignal.C8338d3;
import com.onesignal.C8411f0;
import org.json.JSONObject;

public class ADMMessageHandler extends ADMMessageHandlerBase {
    private static final int JOB_ID = 123891;

    /* renamed from: com.onesignal.ADMMessageHandler$a */
    class C8275a implements C8411f0.C8416e {

        /* renamed from: a */
        final /* synthetic */ Bundle f35242a;

        /* renamed from: b */
        final /* synthetic */ Context f35243b;

        C8275a(Bundle bundle, Context context) {
            this.f35242a = bundle;
            this.f35243b = context;
        }

        /* renamed from: a */
        public void mo27486a(C8411f0.C8417f fVar) {
            if (!fVar.mo27772c()) {
                JSONObject a = C8411f0.m46660a(this.f35242a);
                C8575q1 q1Var = new C8575q1(a);
                C8632v1 v1Var = new C8632v1(this.f35243b);
                v1Var.mo28263q(a);
                v1Var.mo28261o(this.f35243b);
                v1Var.mo28264r(q1Var);
                C8411f0.m46672m(v1Var, true);
            }
        }
    }

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    /* access modifiers changed from: protected */
    public void onMessage(Intent intent) {
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        C8411f0.m46667h(applicationContext, extras, new C8275a(extras, applicationContext));
    }

    /* access modifiers changed from: protected */
    public void onRegistered(String str) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.INFO;
        C8338d3.m46492a(r0Var, "ADM registration ID: " + str);
        C8619t3.m47733c(str);
    }

    /* access modifiers changed from: protected */
    public void onRegistrationError(String str) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.ERROR;
        C8338d3.m46492a(r0Var, "ADM:onRegistrationError: " + str);
        if ("INVALID_SENDER".equals(str)) {
            C8338d3.m46492a(r0Var, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        C8619t3.m47733c((String) null);
    }

    /* access modifiers changed from: protected */
    public void onUnregistered(String str) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.INFO;
        C8338d3.m46492a(r0Var, "ADM:onUnregistered: " + str);
    }
}
