package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import p050g1.C4314g;
import p050g1.C4315h;
import p057h1.C4418c;
import p170y0.C6094j;
import p176z0.C6191i;

/* renamed from: androidx.work.impl.background.systemalarm.a */
/* compiled from: Alarms */
class C1552a {

    /* renamed from: a */
    private static final String f4455a = C6094j.m35719f("Alarms");

    /* renamed from: a */
    public static void m7196a(Context context, C6191i iVar, String str) {
        C4315h y = iVar.mo21130q().mo6322y();
        C4314g c = y.mo17733c(str);
        if (c != null) {
            m7197b(context, str, c.f24193b);
            C6094j.m35717c().mo20921a(f4455a, String.format("Removing SystemIdInfo for workSpecId (%s)", new Object[]{str}), new Throwable[0]);
            y.mo17734d(str);
        }
    }

    /* renamed from: b */
    private static void m7197b(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1553b.m7201b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service != null && alarmManager != null) {
            C6094j.m35717c().mo20921a(f4455a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    /* renamed from: c */
    public static void m7198c(Context context, C6191i iVar, String str, long j) {
        WorkDatabase q = iVar.mo21130q();
        C4315h y = q.mo6322y();
        C4314g c = y.mo17733c(str);
        if (c != null) {
            m7197b(context, str, c.f24193b);
            m7199d(context, str, c.f24193b, j);
            return;
        }
        int b = new C4418c(q).mo17947b();
        y.mo17732b(new C4314g(str, b));
        m7199d(context, str, b, j);
    }

    /* renamed from: d */
    private static void m7199d(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = Build.VERSION.SDK_INT;
        PendingIntent service = PendingIntent.getService(context, i, C1553b.m7201b(context, str), i2 >= 23 ? 201326592 : 134217728);
        if (alarmManager == null) {
            return;
        }
        if (i2 >= 19) {
            alarmManager.setExact(0, j, service);
        } else {
            alarmManager.set(0, j, service);
        }
    }
}
