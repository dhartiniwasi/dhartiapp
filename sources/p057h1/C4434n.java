package p057h1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p170y0.C6094j;

/* renamed from: h1.n */
/* compiled from: WorkTimer */
public class C4434n {

    /* renamed from: f */
    private static final String f24636f = C6094j.m35719f("WorkTimer");

    /* renamed from: a */
    private final ThreadFactory f24637a;

    /* renamed from: b */
    private final ScheduledExecutorService f24638b;

    /* renamed from: c */
    final Map<String, C4437c> f24639c = new HashMap();

    /* renamed from: d */
    final Map<String, C4436b> f24640d = new HashMap();

    /* renamed from: e */
    final Object f24641e = new Object();

    /* renamed from: h1.n$a */
    /* compiled from: WorkTimer */
    class C4435a implements ThreadFactory {

        /* renamed from: a */
        private int f24642a = 0;

        C4435a() {
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName("WorkManager-WorkTimer-thread-" + this.f24642a);
            this.f24642a = this.f24642a + 1;
            return newThread;
        }
    }

    /* renamed from: h1.n$b */
    /* compiled from: WorkTimer */
    public interface C4436b {
        /* renamed from: a */
        void mo6333a(String str);
    }

    /* renamed from: h1.n$c */
    /* compiled from: WorkTimer */
    public static class C4437c implements Runnable {

        /* renamed from: a */
        private final C4434n f24644a;

        /* renamed from: b */
        private final String f24645b;

        C4437c(C4434n nVar, String str) {
            this.f24644a = nVar;
            this.f24645b = str;
        }

        public void run() {
            synchronized (this.f24644a.f24641e) {
                if (this.f24644a.f24639c.remove(this.f24645b) != null) {
                    C4436b remove = this.f24644a.f24640d.remove(this.f24645b);
                    if (remove != null) {
                        remove.mo6333a(this.f24645b);
                    }
                } else {
                    C6094j.m35717c().mo20921a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f24645b}), new Throwable[0]);
                }
            }
        }
    }

    public C4434n() {
        C4435a aVar = new C4435a();
        this.f24637a = aVar;
        this.f24638b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    /* renamed from: a */
    public void mo17965a() {
        if (!this.f24638b.isShutdown()) {
            this.f24638b.shutdownNow();
        }
    }

    /* renamed from: b */
    public void mo17966b(String str, long j, C4436b bVar) {
        synchronized (this.f24641e) {
            C6094j.m35717c().mo20921a(f24636f, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            mo17967c(str);
            C4437c cVar = new C4437c(this, str);
            this.f24639c.put(str, cVar);
            this.f24640d.put(str, bVar);
            this.f24638b.schedule(cVar, j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: c */
    public void mo17967c(String str) {
        synchronized (this.f24641e) {
            if (this.f24639c.remove(str) != null) {
                C6094j.m35717c().mo20921a(f24636f, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.f24640d.remove(str);
            }
        }
    }
}
