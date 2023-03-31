package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.C1556e;
import java.util.Collections;
import java.util.List;
import p020c1.C1838c;
import p020c1.C1839d;
import p050g1.C4329p;
import p057h1.C4426j;
import p057h1.C4434n;
import p170y0.C6094j;
import p176z0.C6183b;

/* renamed from: androidx.work.impl.background.systemalarm.d */
/* compiled from: DelayMetCommandHandler */
public class C1555d implements C1838c, C6183b, C4434n.C4436b {

    /* renamed from: r */
    private static final String f4465r = C6094j.m35719f("DelayMetCommandHandler");

    /* renamed from: a */
    private final Context f4466a;

    /* renamed from: b */
    private final int f4467b;

    /* renamed from: c */
    private final String f4468c;

    /* renamed from: d */
    private final C1556e f4469d;

    /* renamed from: e */
    private final C1839d f4470e;

    /* renamed from: f */
    private final Object f4471f = new Object();

    /* renamed from: g */
    private int f4472g = 0;

    /* renamed from: h */
    private PowerManager.WakeLock f4473h;

    /* renamed from: i */
    private boolean f4474i = false;

    C1555d(Context context, int i, String str, C1556e eVar) {
        this.f4466a = context;
        this.f4467b = i;
        this.f4469d = eVar;
        this.f4468c = str;
        this.f4470e = new C1839d(context, eVar.mo6338f(), this);
    }

    /* renamed from: c */
    private void m7217c() {
        synchronized (this.f4471f) {
            this.f4470e.mo7027e();
            this.f4469d.mo6340h().mo17967c(this.f4468c);
            PowerManager.WakeLock wakeLock = this.f4473h;
            if (wakeLock != null && wakeLock.isHeld()) {
                C6094j.m35717c().mo20921a(f4465r, String.format("Releasing wakelock %s for WorkSpec %s", new Object[]{this.f4473h, this.f4468c}), new Throwable[0]);
                this.f4473h.release();
            }
        }
    }

    /* renamed from: g */
    private void m7218g() {
        synchronized (this.f4471f) {
            if (this.f4472g < 2) {
                this.f4472g = 2;
                C6094j c = C6094j.m35717c();
                String str = f4465r;
                c.mo20921a(str, String.format("Stopping work for WorkSpec %s", new Object[]{this.f4468c}), new Throwable[0]);
                Intent g = C1553b.m7205g(this.f4466a, this.f4468c);
                C1556e eVar = this.f4469d;
                eVar.mo6342k(new C1556e.C1558b(eVar, g, this.f4467b));
                if (this.f4469d.mo6337e().mo21105g(this.f4468c)) {
                    C6094j.m35717c().mo20921a(str, String.format("WorkSpec %s needs to be rescheduled", new Object[]{this.f4468c}), new Throwable[0]);
                    Intent f = C1553b.m7204f(this.f4466a, this.f4468c);
                    C1556e eVar2 = this.f4469d;
                    eVar2.mo6342k(new C1556e.C1558b(eVar2, f, this.f4467b));
                } else {
                    C6094j.m35717c().mo20921a(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", new Object[]{this.f4468c}), new Throwable[0]);
                }
            } else {
                C6094j.m35717c().mo20921a(f4465r, String.format("Already stopped work for %s", new Object[]{this.f4468c}), new Throwable[0]);
            }
        }
    }

    /* renamed from: a */
    public void mo6333a(String str) {
        C6094j.m35717c().mo20921a(f4465r, String.format("Exceeded time limits on execution for %s", new Object[]{str}), new Throwable[0]);
        m7218g();
    }

    /* renamed from: b */
    public void mo29b(List<String> list) {
        m7218g();
    }

    /* renamed from: d */
    public void mo31d(String str, boolean z) {
        C6094j.m35717c().mo20921a(f4465r, String.format("onExecuted %s, %s", new Object[]{str, Boolean.valueOf(z)}), new Throwable[0]);
        m7217c();
        if (z) {
            Intent f = C1553b.m7204f(this.f4466a, this.f4468c);
            C1556e eVar = this.f4469d;
            eVar.mo6342k(new C1556e.C1558b(eVar, f, this.f4467b));
        }
        if (this.f4474i) {
            Intent a = C1553b.m7200a(this.f4466a);
            C1556e eVar2 = this.f4469d;
            eVar2.mo6342k(new C1556e.C1558b(eVar2, a, this.f4467b));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo6334e() {
        this.f4473h = C4426j.m29380b(this.f4466a, String.format("%s (%s)", new Object[]{this.f4468c, Integer.valueOf(this.f4467b)}));
        C6094j c = C6094j.m35717c();
        String str = f4465r;
        c.mo20921a(str, String.format("Acquiring wakelock %s for WorkSpec %s", new Object[]{this.f4473h, this.f4468c}), new Throwable[0]);
        this.f4473h.acquire();
        C4329p n = this.f4469d.mo6339g().mo21130q().mo6318B().mo17766n(this.f4468c);
        if (n == null) {
            m7218g();
            return;
        }
        boolean b = n.mo17744b();
        this.f4474i = b;
        if (!b) {
            C6094j.m35717c().mo20921a(str, String.format("No constraints for %s", new Object[]{this.f4468c}), new Throwable[0]);
            mo33f(Collections.singletonList(this.f4468c));
            return;
        }
        this.f4470e.mo7026d(Collections.singletonList(n));
    }

    /* renamed from: f */
    public void mo33f(List<String> list) {
        if (list.contains(this.f4468c)) {
            synchronized (this.f4471f) {
                if (this.f4472g == 0) {
                    this.f4472g = 1;
                    C6094j.m35717c().mo20921a(f4465r, String.format("onAllConstraintsMet for %s", new Object[]{this.f4468c}), new Throwable[0]);
                    if (this.f4469d.mo6337e().mo21108j(this.f4468c)) {
                        this.f4469d.mo6340h().mo17966b(this.f4468c, 600000, this);
                    } else {
                        m7217c();
                    }
                } else {
                    C6094j.m35717c().mo20921a(f4465r, String.format("Already started work for %s", new Object[]{this.f4468c}), new Throwable[0]);
                }
            }
        }
    }
}
