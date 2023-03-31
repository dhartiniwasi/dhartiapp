package androidx.work.impl.background.systemalarm;

import android.content.Context;
import p050g1.C4329p;
import p170y0.C6094j;
import p176z0.C6187e;

/* renamed from: androidx.work.impl.background.systemalarm.f */
/* compiled from: SystemAlarmScheduler */
public class C1561f implements C6187e {

    /* renamed from: b */
    private static final String f4491b = C6094j.m35719f("SystemAlarmScheduler");

    /* renamed from: a */
    private final Context f4492a;

    public C1561f(Context context) {
        this.f4492a = context.getApplicationContext();
    }

    /* renamed from: b */
    private void m7238b(C4329p pVar) {
        C6094j.m35717c().mo20921a(f4491b, String.format("Scheduling work with workSpecId %s", new Object[]{pVar.f24215a}), new Throwable[0]);
        this.f4492a.startService(C1553b.m7204f(this.f4492a, pVar.f24215a));
    }

    /* renamed from: a */
    public void mo28a(C4329p... pVarArr) {
        for (C4329p b : pVarArr) {
            m7238b(b);
        }
    }

    /* renamed from: c */
    public boolean mo30c() {
        return true;
    }

    /* renamed from: e */
    public void mo32e(String str) {
        this.f4492a.startService(C1553b.m7205g(this.f4492a, str));
    }
}
