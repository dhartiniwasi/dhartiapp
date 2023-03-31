package p057h1;

import android.content.Context;
import androidx.core.p010os.C0759a;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C1580c;
import p050g1.C4329p;
import p064i1.C4647a;
import p170y0.C6088e;
import p170y0.C6089f;
import p170y0.C6094j;
import p228f7.C10139c;

/* renamed from: h1.k */
/* compiled from: WorkForegroundRunnable */
public class C4427k implements Runnable {

    /* renamed from: g */
    static final String f24609g = C6094j.m35719f("WorkForegroundRunnable");

    /* renamed from: a */
    final C1580c<Void> f24610a = C1580c.m7309u();

    /* renamed from: b */
    final Context f24611b;

    /* renamed from: c */
    final C4329p f24612c;

    /* renamed from: d */
    final ListenableWorker f24613d;

    /* renamed from: e */
    final C6089f f24614e;

    /* renamed from: f */
    final C4647a f24615f;

    /* renamed from: h1.k$a */
    /* compiled from: WorkForegroundRunnable */
    class C4428a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1580c f24616a;

        C4428a(C1580c cVar) {
            this.f24616a = cVar;
        }

        public void run() {
            this.f24616a.mo6382s(C4427k.this.f24613d.getForegroundInfoAsync());
        }
    }

    /* renamed from: h1.k$b */
    /* compiled from: WorkForegroundRunnable */
    class C4429b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1580c f24618a;

        C4429b(C1580c cVar) {
            this.f24618a = cVar;
        }

        public void run() {
            try {
                C6088e eVar = (C6088e) this.f24618a.get();
                if (eVar != null) {
                    C6094j.m35717c().mo20921a(C4427k.f24609g, String.format("Updating notification for %s", new Object[]{C4427k.this.f24612c.f24217c}), new Throwable[0]);
                    C4427k.this.f24613d.setRunInForeground(true);
                    C4427k kVar = C4427k.this;
                    kVar.f24610a.mo6382s(kVar.f24614e.mo17961a(kVar.f24611b, kVar.f24613d.getId(), eVar));
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", new Object[]{C4427k.this.f24612c.f24217c}));
            } catch (Throwable th) {
                C4427k.this.f24610a.mo6381r(th);
            }
        }
    }

    public C4427k(Context context, C4329p pVar, ListenableWorker listenableWorker, C6089f fVar, C4647a aVar) {
        this.f24611b = context;
        this.f24612c = pVar;
        this.f24613d = listenableWorker;
        this.f24614e = fVar;
        this.f24615f = aVar;
    }

    /* renamed from: a */
    public C10139c<Void> mo17957a() {
        return this.f24610a;
    }

    public void run() {
        if (!this.f24612c.f24231q || C0759a.m3506c()) {
            this.f24610a.mo6380q(null);
            return;
        }
        C1580c u = C1580c.m7309u();
        this.f24615f.mo18321a().execute(new C4428a(u));
        u.mo2706c(new C4429b(u), this.f24615f.mo18321a());
    }
}
