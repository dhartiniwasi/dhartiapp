package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C1556e;
import java.util.HashMap;
import java.util.Map;
import p050g1.C4329p;
import p170y0.C6094j;
import p176z0.C6183b;

/* renamed from: androidx.work.impl.background.systemalarm.b */
/* compiled from: CommandHandler */
public class C1553b implements C6183b {

    /* renamed from: d */
    private static final String f4456d = C6094j.m35719f("CommandHandler");

    /* renamed from: a */
    private final Context f4457a;

    /* renamed from: b */
    private final Map<String, C6183b> f4458b = new HashMap();

    /* renamed from: c */
    private final Object f4459c = new Object();

    C1553b(Context context) {
        this.f4457a = context;
    }

    /* renamed from: a */
    static Intent m7200a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: b */
    static Intent m7201b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: c */
    static Intent m7202c(Context context, String str, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        return intent;
    }

    /* renamed from: e */
    static Intent m7203e(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    /* renamed from: f */
    static Intent m7204f(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: g */
    static Intent m7205g(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* renamed from: h */
    private void m7206h(Intent intent, int i, C1556e eVar) {
        C6094j.m35717c().mo20921a(f4456d, String.format("Handling constraints changed %s", new Object[]{intent}), new Throwable[0]);
        new C1554c(this.f4457a, i, eVar).mo6332a();
    }

    /* renamed from: i */
    private void m7207i(Intent intent, int i, C1556e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f4459c) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            C6094j c = C6094j.m35717c();
            String str = f4456d;
            c.mo20921a(str, String.format("Handing delay met for %s", new Object[]{string}), new Throwable[0]);
            if (!this.f4458b.containsKey(string)) {
                C1555d dVar = new C1555d(this.f4457a, i, string, eVar);
                this.f4458b.put(string, dVar);
                dVar.mo6334e();
            } else {
                C6094j.m35717c().mo20921a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", new Object[]{string}), new Throwable[0]);
            }
        }
    }

    /* renamed from: j */
    private void m7208j(Intent intent, int i) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        C6094j.m35717c().mo20921a(f4456d, String.format("Handling onExecutionCompleted %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        mo31d(string, z);
    }

    /* renamed from: k */
    private void m7209k(Intent intent, int i, C1556e eVar) {
        C6094j.m35717c().mo20921a(f4456d, String.format("Handling reschedule %s, %s", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        eVar.mo6339g().mo21133u();
    }

    /* renamed from: l */
    private void m7210l(Intent intent, int i, C1556e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        C6094j c = C6094j.m35717c();
        String str = f4456d;
        c.mo20921a(str, String.format("Handling schedule work for %s", new Object[]{string}), new Throwable[0]);
        WorkDatabase q = eVar.mo6339g().mo21130q();
        q.mo5592c();
        try {
            C4329p n = q.mo6318B().mo17766n(string);
            if (n == null) {
                C6094j c2 = C6094j.m35717c();
                c2.mo20925h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (n.f24216b.mo20936a()) {
                C6094j c3 = C6094j.m35717c();
                c3.mo20925h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                q.mo5596g();
            } else {
                long a = n.mo17743a();
                if (!n.mo17744b()) {
                    C6094j.m35717c().mo20921a(str, String.format("Setting up Alarms for %s at %s", new Object[]{string, Long.valueOf(a)}), new Throwable[0]);
                    C1552a.m7198c(this.f4457a, eVar.mo6339g(), string, a);
                } else {
                    C6094j.m35717c().mo20921a(str, String.format("Opportunistically setting an alarm for %s at %s", new Object[]{string, Long.valueOf(a)}), new Throwable[0]);
                    C1552a.m7198c(this.f4457a, eVar.mo6339g(), string, a);
                    eVar.mo6342k(new C1556e.C1558b(eVar, m7200a(this.f4457a), i));
                }
                q.mo5606r();
                q.mo5596g();
            }
        } finally {
            q.mo5596g();
        }
    }

    /* renamed from: m */
    private void m7211m(Intent intent, C1556e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        C6094j.m35717c().mo20921a(f4456d, String.format("Handing stopWork work for %s", new Object[]{string}), new Throwable[0]);
        eVar.mo6339g().mo21138z(string);
        C1552a.m7196a(this.f4457a, eVar.mo6339g(), string);
        eVar.mo31d(string, false);
    }

    /* renamed from: n */
    private static boolean m7212n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public void mo31d(String str, boolean z) {
        synchronized (this.f4459c) {
            C6183b remove = this.f4458b.remove(str);
            if (remove != null) {
                remove.mo31d(str, z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo6330o() {
        boolean z;
        synchronized (this.f4459c) {
            z = !this.f4458b.isEmpty();
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo6331p(Intent intent, int i, C1556e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m7206h(intent, i, eVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            m7209k(intent, i, eVar);
        } else if (!m7212n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            C6094j.m35717c().mo20922b(f4456d, String.format("Invalid request for %s, requires %s.", new Object[]{action, "KEY_WORKSPEC_ID"}), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            m7210l(intent, i, eVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            m7207i(intent, i, eVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m7211m(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            m7208j(intent, i);
        } else {
            C6094j.m35717c().mo20925h(f4456d, String.format("Ignoring intent %s", new Object[]{intent}), new Throwable[0]);
        }
    }
}
