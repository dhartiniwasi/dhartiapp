package com.onesignal;

import android.content.Context;
import androidx.work.C1536b;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.onesignal.C8338d3;
import com.onesignal.C8524o3;
import java.util.concurrent.TimeUnit;
import p170y0.C6083b;
import p170y0.C6087d;
import p170y0.C6096k;
import p170y0.C6097l;
import p170y0.C6111t;

class OSReceiveReceiptController {

    /* renamed from: d */
    private static OSReceiveReceiptController f35273d;

    /* renamed from: a */
    private int f35274a = 0;

    /* renamed from: b */
    private int f35275b = 25;

    /* renamed from: c */
    private final C8461i2 f35276c = C8338d3.m46593z0();

    public static class ReceiveReceiptWorker extends Worker {

        /* renamed from: com.onesignal.OSReceiveReceiptController$ReceiveReceiptWorker$a */
        class C8283a extends C8524o3.C8531g {

            /* renamed from: a */
            final /* synthetic */ String f35277a;

            C8283a(String str) {
                this.f35277a = str;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public void mo27538a(int i, String str, Throwable th) {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.ERROR;
                C8338d3.m46492a(r0Var, "Receive receipt failed with statusCode: " + i + " response: " + str);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo27539b(String str) {
                C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
                C8338d3.m46492a(r0Var, "Receive receipt sent for notificationID: " + this.f35277a);
            }
        }

        public ReceiveReceiptWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo27537a(String str) {
            String str2 = C8338d3.f35442h;
            String E0 = (str2 == null || str2.isEmpty()) ? C8338d3.m46416E0() : C8338d3.f35442h;
            String Q0 = C8338d3.m46463Q0();
            Integer num = null;
            C8455h2 h2Var = new C8455h2();
            try {
                num = Integer.valueOf(new OSUtils().mo27559e());
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            Integer num2 = num;
            C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
            C8338d3.m46492a(r0Var, "ReceiveReceiptWorker: Device Type is: " + num2);
            h2Var.mo27837a(E0, Q0, num2, str, new C8283a(str));
        }

        public ListenableWorker.C1526a doWork() {
            mo27537a(getInputData().mo6306l("os_notification_id"));
            return ListenableWorker.C1526a.m7085c();
        }
    }

    private OSReceiveReceiptController() {
    }

    /* renamed from: c */
    public static synchronized OSReceiveReceiptController m46149c() {
        OSReceiveReceiptController oSReceiveReceiptController;
        synchronized (OSReceiveReceiptController.class) {
            if (f35273d == null) {
                f35273d = new OSReceiveReceiptController();
            }
            oSReceiveReceiptController = f35273d;
        }
        return oSReceiveReceiptController;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo27535a(Context context, String str) {
        if (!this.f35276c.mo27852k()) {
            C8338d3.m46492a(C8338d3.C8384r0.DEBUG, "sendReceiveReceipt disabled");
            return;
        }
        int j = OSUtils.m46199j(this.f35274a, this.f35275b);
        C1536b a = new C1536b.C1537a().mo6316h("os_notification_id", str).mo6309a();
        C6083b b = mo27536b();
        C8338d3.C8384r0 r0Var = C8338d3.C8384r0.DEBUG;
        C8338d3.m46492a(r0Var, "OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + str + " and delay: " + j + " seconds");
        C6111t g = C6111t.m35740g(context);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_receive_receipt");
        g.mo20942f(sb.toString(), C6087d.KEEP, (C6097l) ((C6097l.C6098a) ((C6097l.C6098a) ((C6097l.C6098a) new C6097l.C6098a(ReceiveReceiptWorker.class).mo20950f(b)).mo20951g((long) j, TimeUnit.SECONDS)).mo20952h(a)).mo20948b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6083b mo27536b() {
        return new C6083b.C6084a().mo20901b(C6096k.CONNECTED).mo20900a();
    }
}
