package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.onesignal.C8338d3;
import com.onesignal.C8411f0;
import kotlin.jvm.internal.C11669k;
import org.json.JSONObject;

/* compiled from: ADMMessageHandlerJob.kt */
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {

    /* renamed from: com.onesignal.ADMMessageHandlerJob$a */
    /* compiled from: ADMMessageHandlerJob.kt */
    public static final class C8276a implements C8411f0.C8416e {

        /* renamed from: a */
        final /* synthetic */ Bundle f35245a;

        /* renamed from: b */
        final /* synthetic */ Context f35246b;

        C8276a(Bundle bundle, Context context) {
            this.f35245a = bundle;
            this.f35246b = context;
        }

        /* renamed from: a */
        public void mo27486a(C8411f0.C8417f fVar) {
            if (fVar == null || !fVar.mo27772c()) {
                JSONObject a = C8411f0.m46660a(this.f35245a);
                C11669k.m56786d(a, "NotificationBundleProces…undleAsJSONObject(bundle)");
                C8575q1 q1Var = new C8575q1(a);
                C8632v1 v1Var = new C8632v1(this.f35246b);
                v1Var.mo28263q(a);
                v1Var.mo28261o(this.f35246b);
                v1Var.mo28264r(q1Var);
                C8411f0.m46672m(v1Var, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMessage(Context context, Intent intent) {
        Bundle extras = intent != null ? intent.getExtras() : null;
        C8411f0.m46667h(context, extras, new C8276a(extras, context));
    }

    /* access modifiers changed from: protected */
    public void onRegistered(Context context, String str) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.INFO;
        C8338d3.m46492a(r0Var, "ADM registration ID: " + str);
        C8619t3.m47733c(str);
    }

    /* access modifiers changed from: protected */
    public void onRegistrationError(Context context, String str) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.ERROR;
        C8338d3.m46492a(r0Var, "ADM:onRegistrationError: " + str);
        if (C11669k.m56783a("INVALID_SENDER", str)) {
            C8338d3.m46492a(r0Var, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        C8619t3.m47733c((String) null);
    }

    /* access modifiers changed from: protected */
    public void onUnregistered(Context context, String str) {
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.INFO;
        C8338d3.m46492a(r0Var, "ADM:onUnregistered: " + str);
    }
}
