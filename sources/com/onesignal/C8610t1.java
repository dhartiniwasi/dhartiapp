package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.onesignal.t1 */
/* compiled from: OSNotificationDataController */
class C8610t1 extends C8505n0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8475k3 f36036a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C8547p1 f36037b;

    /* renamed from: com.onesignal.t1$a */
    /* compiled from: OSNotificationDataController */
    class C8611a extends C8452h {
        C8611a() {
        }

        public void run() {
            super.run();
            C8610t1.this.f36036a.mo27886g("notification", "created_time < ?", new String[]{String.valueOf((C8338d3.m46448M0().mo28281b() / 1000) - 604800)});
        }
    }

    /* renamed from: com.onesignal.t1$b */
    /* compiled from: OSNotificationDataController */
    class C8612b extends C8452h {

        /* renamed from: a */
        final /* synthetic */ WeakReference f36039a;

        C8612b(WeakReference weakReference) {
            this.f36039a = weakReference;
        }

        public void run() {
            super.run();
            Context context = (Context) this.f36039a.get();
            if (context != null) {
                NotificationManager i = C8483l3.m47025i(context);
                Cursor f = C8610t1.this.f36036a.mo27885f("notification", new String[]{"android_notification_id"}, "dismissed = 0 AND opened = 0", (String[]) null, (String) null, (String) null, (String) null);
                if (f.moveToFirst()) {
                    do {
                        i.cancel(f.getInt(f.getColumnIndex("android_notification_id")));
                    } while (f.moveToNext());
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", 1);
                C8610t1.this.f36036a.mo27883a("notification", contentValues, "opened = 0", (String[]) null);
                C8458i.m46864d(0, context);
                f.close();
            }
        }
    }

    /* renamed from: com.onesignal.t1$c */
    /* compiled from: OSNotificationDataController */
    class C8613c extends C8452h {

        /* renamed from: a */
        final /* synthetic */ WeakReference f36041a;

        /* renamed from: b */
        final /* synthetic */ int f36042b;

        C8613c(WeakReference weakReference, int i) {
            this.f36041a = weakReference;
            this.f36042b = i;
        }

        public void run() {
            super.run();
            Context context = (Context) this.f36041a.get();
            if (context != null) {
                String str = "android_notification_id = " + this.f36042b + " AND " + "opened" + " = 0 AND " + "dismissed" + " = 0";
                ContentValues contentValues = new ContentValues();
                contentValues.put("dismissed", 1);
                if (C8610t1.this.f36036a.mo27883a("notification", contentValues, str, (String[]) null) > 0) {
                    C8486m0.m47039e(context, C8610t1.this.f36036a, this.f36042b);
                }
                C8458i.m46863c(C8610t1.this.f36036a, context);
                C8483l3.m47025i(context).cancel(this.f36042b);
            }
        }
    }

    /* renamed from: com.onesignal.t1$d */
    /* compiled from: OSNotificationDataController */
    class C8614d extends C8452h {

        /* renamed from: a */
        final /* synthetic */ String f36044a;

        /* renamed from: b */
        final /* synthetic */ C8615e f36045b;

        C8614d(String str, C8615e eVar) {
            this.f36044a = str;
            this.f36045b = eVar;
        }

        public void run() {
            super.run();
            boolean z = true;
            String[] strArr = {this.f36044a};
            Cursor f = C8610t1.this.f36036a.mo27885f("notification", new String[]{"notification_id"}, "notification_id = ?", strArr, (String) null, (String) null, (String) null);
            boolean moveToFirst = f.moveToFirst();
            f.close();
            if (moveToFirst) {
                C8547p1 f2 = C8610t1.this.f36037b;
                f2.mo28016d("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + this.f36044a);
            } else {
                z = false;
            }
            this.f36045b.mo27768a(z);
        }
    }

    /* renamed from: com.onesignal.t1$e */
    /* compiled from: OSNotificationDataController */
    interface C8615e {
        /* renamed from: a */
        void mo27768a(boolean z);
    }

    public C8610t1(C8475k3 k3Var, C8547p1 p1Var) {
        this.f36036a = k3Var;
        this.f36037b = p1Var;
    }

    /* renamed from: g */
    private void m47717g() {
        mo27972d(new C8611a(), "OS_NOTIFICATIONS_THREAD");
    }

    /* renamed from: j */
    private void m47718j(String str, C8615e eVar) {
        if (str == null || "".equals(str)) {
            eVar.mo27768a(false);
        } else if (!OSNotificationWorkManager.m46143a(str)) {
            this.f36037b.mo28016d("Notification notValidOrDuplicated with id duplicated");
            eVar.mo27768a(true);
        } else {
            mo27972d(new C8614d(str, eVar), "OS_NOTIFICATIONS_THREAD");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo28220h() {
        m47717g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo28221i(WeakReference<Context> weakReference) {
        mo27972d(new C8612b(weakReference), "OS_NOTIFICATIONS_THREAD");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo28222k(JSONObject jSONObject, C8615e eVar) {
        String b = C8623u1.m47742b(jSONObject);
        if (b == null) {
            this.f36037b.mo28016d("Notification notValidOrDuplicated with id null");
            eVar.mo27768a(true);
            return;
        }
        m47718j(b, eVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo28223l(int i, WeakReference<Context> weakReference) {
        mo27972d(new C8613c(weakReference, i), "OS_NOTIFICATIONS_THREAD");
    }
}
