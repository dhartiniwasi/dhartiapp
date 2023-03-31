package com.onesignal;

import android.content.Context;
import com.huawei.hms.common.ApiException;
import com.onesignal.C8338d3;
import com.onesignal.C8605s3;

/* renamed from: com.onesignal.w3 */
/* compiled from: PushRegistratorHMS */
class C8643w3 implements C8605s3 {

    /* renamed from: a */
    private static boolean f36101a;

    /* renamed from: b */
    private static C8605s3.C8606a f36102b;

    /* renamed from: com.onesignal.w3$a */
    /* compiled from: PushRegistratorHMS */
    class C8644a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f36103a;

        /* renamed from: b */
        final /* synthetic */ C8605s3.C8606a f36104b;

        C8644a(Context context, C8605s3.C8606a aVar) {
            this.f36103a = context;
            this.f36104b = aVar;
        }

        public void run() {
            try {
                C8643w3.this.m47812d(this.f36103a, this.f36104b);
            } catch (ApiException e) {
                C8338d3.m46496b(C8338d3.C8384r0.ERROR, "HMS ApiException getting Huawei push token!", e);
                this.f36104b.mo27711a((String) null, e.getStatusCode() == 907135000 ? -26 : -27);
            }
        }
    }

    C8643w3() {
    }

    /* renamed from: c */
    private static void m47811c() {
        try {
            Thread.sleep(30000);
        } catch (InterruptedException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m47812d(android.content.Context r4, com.onesignal.C8605s3.C8606a r5) throws com.huawei.hms.common.ApiException {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = com.onesignal.OSUtils.m46205p()     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x000f
            r4 = 0
            r0 = -28
            r5.mo27711a(r4, r0)     // Catch:{ all -> 0x0049 }
            monitor-exit(r3)
            return
        L_0x000f:
            com.huawei.agconnect.config.AGConnectServicesConfig r0 = com.huawei.agconnect.config.AGConnectServicesConfig.fromContext(r4)     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "client/app_id"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x0049 }
            com.huawei.hms.aaid.HmsInstanceId r4 = com.huawei.hms.aaid.HmsInstanceId.getInstance(r4)     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = "HCM"
            java.lang.String r4 = r4.getToken(r0, r1)     // Catch:{ all -> 0x0049 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0049 }
            if (r0 != 0) goto L_0x0044
            com.onesignal.d3$r0 r0 = com.onesignal.C8338d3.C8384r0.INFO     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r1.<init>()     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = "Device registered for HMS, push token = "
            r1.append(r2)     // Catch:{ all -> 0x0049 }
            r1.append(r4)     // Catch:{ all -> 0x0049 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0049 }
            com.onesignal.C8338d3.m46492a(r0, r1)     // Catch:{ all -> 0x0049 }
            r0 = 1
            r5.mo27711a(r4, r0)     // Catch:{ all -> 0x0049 }
            goto L_0x0047
        L_0x0044:
            r3.m47813e(r5)     // Catch:{ all -> 0x0049 }
        L_0x0047:
            monitor-exit(r3)
            return
        L_0x0049:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C8643w3.m47812d(android.content.Context, com.onesignal.s3$a):void");
    }

    /* renamed from: e */
    private void m47813e(C8605s3.C8606a aVar) {
        m47811c();
        if (!f36101a) {
            C8338d3.m46492a(C8338d3.C8384r0.ERROR, "HmsMessageServiceOneSignal.onNewToken timed out.");
            aVar.mo27711a((String) null, -25);
        }
    }

    /* renamed from: a */
    public void mo28203a(Context context, String str, C8605s3.C8606a aVar) {
        f36102b = aVar;
        new Thread(new C8644a(context, aVar), "OS_HMS_GET_TOKEN").start();
    }
}
