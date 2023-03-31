package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.C1532a;
import androidx.work.C1536b;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.pm0;
import p073j4.C4808s0;
import p088l5.C4954a;
import p088l5.C4956b;
import p170y0.C6083b;
import p170y0.C6096k;
import p170y0.C6097l;
import p170y0.C6111t;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public class WorkManagerUtil extends C4808s0 {
    /* renamed from: I6 */
    private static void m9010I6(Context context) {
        try {
            C6111t.m35741h(context.getApplicationContext(), new C1532a.C1534b().mo6297a());
        } catch (IllegalStateException unused) {
        }
    }

    public final void zze(C4954a aVar) {
        Context context = (Context) C4956b.m31384P0(aVar);
        m9010I6(context);
        try {
            C6111t g = C6111t.m35740g(context);
            g.mo20937a("offline_ping_sender_work");
            g.mo20940d((C6097l) ((C6097l.C6098a) ((C6097l.C6098a) new C6097l.C6098a(OfflinePingSender.class).mo20950f(new C6083b.C6084a().mo20901b(C6096k.CONNECTED).mo20900a())).mo20947a("offline_ping_sender_work")).mo20948b());
        } catch (IllegalStateException e) {
            pm0.m18668h("Failed to instantiate WorkManager.", e);
        }
    }

    public final boolean zzf(C4954a aVar, String str, String str2) {
        Context context = (Context) C4956b.m31384P0(aVar);
        m9010I6(context);
        C6083b a = new C6083b.C6084a().mo20901b(C6096k.CONNECTED).mo20900a();
        try {
            C6111t.m35740g(context).mo20940d((C6097l) ((C6097l.C6098a) ((C6097l.C6098a) ((C6097l.C6098a) new C6097l.C6098a(OfflineNotificationPoster.class).mo20950f(a)).mo20952h(new C1536b.C1537a().mo6316h("uri", str).mo6316h("gws_query_id", str2).mo6309a())).mo20947a("offline_notification_work")).mo20948b());
            return true;
        } catch (IllegalStateException e) {
            pm0.m18668h("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
