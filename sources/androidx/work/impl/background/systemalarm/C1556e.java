package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p057h1.C4422g;
import p057h1.C4426j;
import p057h1.C4434n;
import p064i1.C4647a;
import p170y0.C6094j;
import p176z0.C6183b;
import p176z0.C6185d;
import p176z0.C6191i;

/* renamed from: androidx.work.impl.background.systemalarm.e */
/* compiled from: SystemAlarmDispatcher */
public class C1556e implements C6183b {

    /* renamed from: s */
    static final String f4475s = C6094j.m35719f("SystemAlarmDispatcher");

    /* renamed from: a */
    final Context f4476a;

    /* renamed from: b */
    private final C4647a f4477b;

    /* renamed from: c */
    private final C4434n f4478c;

    /* renamed from: d */
    private final C6185d f4479d;

    /* renamed from: e */
    private final C6191i f4480e;

    /* renamed from: f */
    final C1553b f4481f;

    /* renamed from: g */
    private final Handler f4482g;

    /* renamed from: h */
    final List<Intent> f4483h;

    /* renamed from: i */
    Intent f4484i;

    /* renamed from: r */
    private C1559c f4485r;

    /* renamed from: androidx.work.impl.background.systemalarm.e$a */
    /* compiled from: SystemAlarmDispatcher */
    class C1557a implements Runnable {
        C1557a() {
        }

        public void run() {
            C1560d dVar;
            C1556e eVar;
            synchronized (C1556e.this.f4483h) {
                C1556e eVar2 = C1556e.this;
                eVar2.f4484i = eVar2.f4483h.get(0);
            }
            Intent intent = C1556e.this.f4484i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C1556e.this.f4484i.getIntExtra("KEY_START_ID", 0);
                C6094j c = C6094j.m35717c();
                String str = C1556e.f4475s;
                c.mo20921a(str, String.format("Processing command %s, %s", new Object[]{C1556e.this.f4484i, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock b = C4426j.m29380b(C1556e.this.f4476a, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    C6094j.m35717c().mo20921a(str, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.acquire();
                    C1556e eVar3 = C1556e.this;
                    eVar3.f4481f.mo6331p(eVar3.f4484i, intExtra, eVar3);
                    C6094j.m35717c().mo20921a(str, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.release();
                    eVar = C1556e.this;
                    dVar = new C1560d(eVar);
                } catch (Throwable th) {
                    C6094j.m35717c().mo20921a(C1556e.f4475s, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.release();
                    C1556e eVar4 = C1556e.this;
                    eVar4.mo6342k(new C1560d(eVar4));
                    throw th;
                }
                eVar.mo6342k(dVar);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$b */
    /* compiled from: SystemAlarmDispatcher */
    static class C1558b implements Runnable {

        /* renamed from: a */
        private final C1556e f4487a;

        /* renamed from: b */
        private final Intent f4488b;

        /* renamed from: c */
        private final int f4489c;

        C1558b(C1556e eVar, Intent intent, int i) {
            this.f4487a = eVar;
            this.f4488b = intent;
            this.f4489c = i;
        }

        public void run() {
            this.f4487a.mo6335a(this.f4488b, this.f4489c);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$c */
    /* compiled from: SystemAlarmDispatcher */
    interface C1559c {
        /* renamed from: a */
        void mo6329a();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$d */
    /* compiled from: SystemAlarmDispatcher */
    static class C1560d implements Runnable {

        /* renamed from: a */
        private final C1556e f4490a;

        C1560d(C1556e eVar) {
            this.f4490a = eVar;
        }

        public void run() {
            this.f4490a.mo6336c();
        }
    }

    C1556e(Context context) {
        this(context, (C6185d) null, (C6191i) null);
    }

    /* renamed from: b */
    private void m7224b() {
        if (this.f4482g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: i */
    private boolean m7225i(String str) {
        m7224b();
        synchronized (this.f4483h) {
            for (Intent action : this.f4483h) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: l */
    private void m7226l() {
        m7224b();
        PowerManager.WakeLock b = C4426j.m29380b(this.f4476a, "ProcessCommand");
        try {
            b.acquire();
            this.f4480e.mo21131r().mo18322b(new C1557a());
        } finally {
            b.release();
        }
    }

    /* renamed from: a */
    public boolean mo6335a(Intent intent, int i) {
        C6094j c = C6094j.m35717c();
        String str = f4475s;
        boolean z = false;
        c.mo20921a(str, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        m7224b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C6094j.m35717c().mo20925h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m7225i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.f4483h) {
                if (!this.f4483h.isEmpty()) {
                    z = true;
                }
                this.f4483h.add(intent);
                if (!z) {
                    m7226l();
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6336c() {
        C6094j c = C6094j.m35717c();
        String str = f4475s;
        c.mo20921a(str, "Checking if commands are complete.", new Throwable[0]);
        m7224b();
        synchronized (this.f4483h) {
            if (this.f4484i != null) {
                C6094j.m35717c().mo20921a(str, String.format("Removing command %s", new Object[]{this.f4484i}), new Throwable[0]);
                if (this.f4483h.remove(0).equals(this.f4484i)) {
                    this.f4484i = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            C4422g c2 = this.f4477b.mo18323c();
            if (!this.f4481f.mo6330o() && this.f4483h.isEmpty() && !c2.mo17951b()) {
                C6094j.m35717c().mo20921a(str, "No more commands & intents.", new Throwable[0]);
                C1559c cVar = this.f4485r;
                if (cVar != null) {
                    cVar.mo6329a();
                }
            } else if (!this.f4483h.isEmpty()) {
                m7226l();
            }
        }
    }

    /* renamed from: d */
    public void mo31d(String str, boolean z) {
        mo6342k(new C1558b(this, C1553b.m7202c(this.f4476a, str, z), 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C6185d mo6337e() {
        return this.f4479d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C4647a mo6338f() {
        return this.f4477b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C6191i mo6339g() {
        return this.f4480e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C4434n mo6340h() {
        return this.f4478c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo6341j() {
        C6094j.m35717c().mo20921a(f4475s, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f4479d.mo21107i(this);
        this.f4478c.mo17965a();
        this.f4485r = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo6342k(Runnable runnable) {
        this.f4482g.post(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6343m(C1559c cVar) {
        if (this.f4485r != null) {
            C6094j.m35717c().mo20922b(f4475s, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f4485r = cVar;
        }
    }

    C1556e(Context context, C6185d dVar, C6191i iVar) {
        Context applicationContext = context.getApplicationContext();
        this.f4476a = applicationContext;
        this.f4481f = new C1553b(applicationContext);
        this.f4478c = new C4434n();
        iVar = iVar == null ? C6191i.m36023m(context) : iVar;
        this.f4480e = iVar;
        dVar = dVar == null ? iVar.mo21128o() : dVar;
        this.f4479d = dVar;
        this.f4477b = iVar.mo21131r();
        dVar.mo21103c(this);
        this.f4483h = new ArrayList();
        this.f4484i = null;
        this.f4482g = new Handler(Looper.getMainLooper());
    }
}
