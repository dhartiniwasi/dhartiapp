package p176z0;

import android.content.Context;
import android.os.Build;
import androidx.work.C1532a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C1561f;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
import p013b1.C1608b;
import p050g1.C4329p;
import p050g1.C4332q;
import p057h1.C4419d;
import p170y0.C6094j;

/* renamed from: z0.f */
/* compiled from: Schedulers */
public class C6188f {

    /* renamed from: a */
    private static final String f29691a = C6094j.m35719f("Schedulers");

    /* renamed from: a */
    static C6187e m36000a(Context context, C6191i iVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            C1608b bVar = new C1608b(context, iVar);
            C4419d.m29371a(context, SystemJobService.class, true);
            C6094j.m35717c().mo20921a(f29691a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        C6187e c = m36002c(context);
        if (c != null) {
            return c;
        }
        C1561f fVar = new C1561f(context);
        C4419d.m29371a(context, SystemAlarmService.class, true);
        C6094j.m35717c().mo20921a(f29691a, "Created SystemAlarmScheduler", new Throwable[0]);
        return fVar;
    }

    /* renamed from: b */
    public static void m36001b(C1532a aVar, WorkDatabase workDatabase, List<C6187e> list) {
        if (list != null && list.size() != 0) {
            C4332q B = workDatabase.mo6318B();
            workDatabase.mo5592c();
            try {
                List<C4329p> f = B.mo17758f(aVar.mo6290h());
                List<C4329p> t = B.mo17772t(200);
                if (f != null && f.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (C4329p pVar : f) {
                        B.mo17755c(pVar.f24215a, currentTimeMillis);
                    }
                }
                workDatabase.mo5606r();
                if (f != null && f.size() > 0) {
                    C4329p[] pVarArr = (C4329p[]) f.toArray(new C4329p[f.size()]);
                    for (C6187e next : list) {
                        if (next.mo30c()) {
                            next.mo28a(pVarArr);
                        }
                    }
                }
                if (t != null && t.size() > 0) {
                    C4329p[] pVarArr2 = (C4329p[]) t.toArray(new C4329p[t.size()]);
                    for (C6187e next2 : list) {
                        if (!next2.mo30c()) {
                            next2.mo28a(pVarArr2);
                        }
                    }
                }
            } finally {
                workDatabase.mo5596g();
            }
        }
    }

    /* renamed from: c */
    private static C6187e m36002c(Context context) {
        try {
            C6187e eVar = (C6187e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            C6094j.m35717c().mo20921a(f29691a, String.format("Created %s", new Object[]{"androidx.work.impl.background.gcm.GcmScheduler"}), new Throwable[0]);
            return eVar;
        } catch (Throwable th) {
            C6094j.m35717c().mo20921a(f29691a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
