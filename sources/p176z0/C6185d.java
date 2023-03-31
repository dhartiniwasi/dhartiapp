package p176z0;

import android.content.Context;
import android.os.PowerManager;
import androidx.core.content.C0681a;
import androidx.work.C1532a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1565a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p043f1.C4253a;
import p057h1.C4426j;
import p064i1.C4647a;
import p170y0.C6088e;
import p170y0.C6094j;
import p176z0.C6192j;
import p228f7.C10139c;

/* renamed from: z0.d */
/* compiled from: Processor */
public class C6185d implements C6183b, C4253a {

    /* renamed from: t */
    private static final String f29676t = C6094j.m35719f("Processor");

    /* renamed from: a */
    private PowerManager.WakeLock f29677a;

    /* renamed from: b */
    private Context f29678b;

    /* renamed from: c */
    private C1532a f29679c;

    /* renamed from: d */
    private C4647a f29680d;

    /* renamed from: e */
    private WorkDatabase f29681e;

    /* renamed from: f */
    private Map<String, C6192j> f29682f = new HashMap();

    /* renamed from: g */
    private Map<String, C6192j> f29683g = new HashMap();

    /* renamed from: h */
    private List<C6187e> f29684h;

    /* renamed from: i */
    private Set<String> f29685i;

    /* renamed from: r */
    private final List<C6183b> f29686r;

    /* renamed from: s */
    private final Object f29687s;

    /* renamed from: z0.d$a */
    /* compiled from: Processor */
    private static class C6186a implements Runnable {

        /* renamed from: a */
        private C6183b f29688a;

        /* renamed from: b */
        private String f29689b;

        /* renamed from: c */
        private C10139c<Boolean> f29690c;

        C6186a(C6183b bVar, String str, C10139c<Boolean> cVar) {
            this.f29688a = bVar;
            this.f29689b = str;
            this.f29690c = cVar;
        }

        public void run() {
            boolean z;
            try {
                z = this.f29690c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f29688a.mo31d(this.f29689b, z);
        }
    }

    public C6185d(Context context, C1532a aVar, C4647a aVar2, WorkDatabase workDatabase, List<C6187e> list) {
        this.f29678b = context;
        this.f29679c = aVar;
        this.f29680d = aVar2;
        this.f29681e = workDatabase;
        this.f29684h = list;
        this.f29685i = new HashSet();
        this.f29686r = new ArrayList();
        this.f29677a = null;
        this.f29687s = new Object();
    }

    /* renamed from: e */
    private static boolean m35982e(String str, C6192j jVar) {
        if (jVar != null) {
            jVar.mo21140d();
            C6094j.m35717c().mo20921a(f29676t, String.format("WorkerWrapper interrupted for %s", new Object[]{str}), new Throwable[0]);
            return true;
        }
        C6094j.m35717c().mo20921a(f29676t, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
        return false;
    }

    /* renamed from: m */
    private void m35983m() {
        synchronized (this.f29687s) {
            if (!(!this.f29682f.isEmpty())) {
                try {
                    this.f29678b.startService(C1565a.m7250e(this.f29678b));
                } catch (Throwable th) {
                    C6094j.m35717c().mo20922b(f29676t, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f29677a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f29677a = null;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo17619a(String str, C6088e eVar) {
        synchronized (this.f29687s) {
            C6094j.m35717c().mo20923d(f29676t, String.format("Moving WorkSpec (%s) to the foreground", new Object[]{str}), new Throwable[0]);
            C6192j remove = this.f29683g.remove(str);
            if (remove != null) {
                if (this.f29677a == null) {
                    PowerManager.WakeLock b = C4426j.m29380b(this.f29678b, "ProcessorForegroundLck");
                    this.f29677a = b;
                    b.acquire();
                }
                this.f29682f.put(str, remove);
                C0681a.m3158n(this.f29678b, C1565a.m7249c(this.f29678b, str, eVar));
            }
        }
    }

    /* renamed from: b */
    public void mo17620b(String str) {
        synchronized (this.f29687s) {
            this.f29682f.remove(str);
            m35983m();
        }
    }

    /* renamed from: c */
    public void mo21103c(C6183b bVar) {
        synchronized (this.f29687s) {
            this.f29686r.add(bVar);
        }
    }

    /* renamed from: d */
    public void mo31d(String str, boolean z) {
        synchronized (this.f29687s) {
            this.f29683g.remove(str);
            C6094j.m35717c().mo20921a(f29676t, String.format("%s %s executed; reschedule = %s", new Object[]{getClass().getSimpleName(), str, Boolean.valueOf(z)}), new Throwable[0]);
            for (C6183b d : this.f29686r) {
                d.mo31d(str, z);
            }
        }
    }

    /* renamed from: f */
    public boolean mo21104f(String str) {
        boolean contains;
        synchronized (this.f29687s) {
            contains = this.f29685i.contains(str);
        }
        return contains;
    }

    /* renamed from: g */
    public boolean mo21105g(String str) {
        boolean z;
        synchronized (this.f29687s) {
            if (!this.f29683g.containsKey(str)) {
                if (!this.f29682f.containsKey(str)) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public boolean mo21106h(String str) {
        boolean containsKey;
        synchronized (this.f29687s) {
            containsKey = this.f29682f.containsKey(str);
        }
        return containsKey;
    }

    /* renamed from: i */
    public void mo21107i(C6183b bVar) {
        synchronized (this.f29687s) {
            this.f29686r.remove(bVar);
        }
    }

    /* renamed from: j */
    public boolean mo21108j(String str) {
        return mo21109k(str, (WorkerParameters.C1531a) null);
    }

    /* renamed from: k */
    public boolean mo21109k(String str, WorkerParameters.C1531a aVar) {
        synchronized (this.f29687s) {
            if (mo21105g(str)) {
                C6094j.m35717c().mo20921a(f29676t, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            C6192j a = new C6192j.C6195c(this.f29678b, this.f29679c, this.f29680d, this, this.f29681e, str).mo21148c(this.f29684h).mo21147b(aVar).mo21146a();
            C10139c<Boolean> b = a.mo21139b();
            b.mo2706c(new C6186a(this, str, b), this.f29680d.mo18321a());
            this.f29683g.put(str, a);
            this.f29680d.mo18323c().execute(a);
            C6094j.m35717c().mo20921a(f29676t, String.format("%s: processing %s", new Object[]{getClass().getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    /* renamed from: l */
    public boolean mo21110l(String str) {
        boolean e;
        synchronized (this.f29687s) {
            boolean z = true;
            C6094j.m35717c().mo20921a(f29676t, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            this.f29685i.add(str);
            C6192j remove = this.f29682f.remove(str);
            if (remove == null) {
                z = false;
            }
            if (remove == null) {
                remove = this.f29683g.remove(str);
            }
            e = m35982e(str, remove);
            if (z) {
                m35983m();
            }
        }
        return e;
    }

    /* renamed from: n */
    public boolean mo21111n(String str) {
        boolean e;
        synchronized (this.f29687s) {
            C6094j.m35717c().mo20921a(f29676t, String.format("Processor stopping foreground work %s", new Object[]{str}), new Throwable[0]);
            e = m35982e(str, this.f29682f.remove(str));
        }
        return e;
    }

    /* renamed from: o */
    public boolean mo21112o(String str) {
        boolean e;
        synchronized (this.f29687s) {
            C6094j.m35717c().mo20921a(f29676t, String.format("Processor stopping background work %s", new Object[]{str}), new Throwable[0]);
            e = m35982e(str, this.f29683g.remove(str));
        }
        return e;
    }
}
