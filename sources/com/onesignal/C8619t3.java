package com.onesignal;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.onesignal.C8338d3;
import com.onesignal.C8605s3;

/* renamed from: com.onesignal.t3 */
/* compiled from: PushRegistratorADM */
public class C8619t3 implements C8605s3 {

    /* renamed from: a */
    private static C8605s3.C8606a f36055a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f36056b = false;

    /* renamed from: com.onesignal.t3$a */
    /* compiled from: PushRegistratorADM */
    class C8620a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f36057a;

        /* renamed from: b */
        final /* synthetic */ C8605s3.C8606a f36058b;

        C8620a(Context context, C8605s3.C8606a aVar) {
            this.f36057a = context;
            this.f36058b = aVar;
        }

        public void run() {
            ADM adm = new ADM(this.f36057a);
            String registrationId = adm.getRegistrationId();
            if (registrationId == null) {
                adm.startRegister();
            } else {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
                C8338d3.m46492a(r0Var, "ADM Already registered with ID:" + registrationId);
                this.f36058b.mo27711a(registrationId, 1);
            }
            try {
                Thread.sleep(30000);
            } catch (InterruptedException unused) {
            }
            if (!C8619t3.f36056b) {
                C8338d3.m46492a(C8338d3.C8384r0.ERROR, "com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.");
                C8619t3.m47733c((String) null);
            }
        }
    }

    /* renamed from: c */
    public static void m47733c(String str) {
        C8605s3.C8606a aVar = f36055a;
        if (aVar != null) {
            f36056b = true;
            aVar.mo27711a(str, 1);
        }
    }

    /* renamed from: a */
    public void mo28203a(Context context, String str, C8605s3.C8606a aVar) {
        f36055a = aVar;
        new Thread(new C8620a(context, aVar)).start();
    }
}
