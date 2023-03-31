package p057h1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.C1565a;
import androidx.work.impl.utils.futures.C1580c;
import java.util.UUID;
import p043f1.C4253a;
import p050g1.C4332q;
import p064i1.C4647a;
import p170y0.C6088e;
import p170y0.C6089f;
import p170y0.C6094j;
import p170y0.C6110s;
import p228f7.C10139c;

/* renamed from: h1.l */
/* compiled from: WorkForegroundUpdater */
public class C4430l implements C6089f {

    /* renamed from: d */
    private static final String f24620d = C6094j.m35719f("WMFgUpdater");

    /* renamed from: a */
    private final C4647a f24621a;

    /* renamed from: b */
    final C4253a f24622b;

    /* renamed from: c */
    final C4332q f24623c;

    /* renamed from: h1.l$a */
    /* compiled from: WorkForegroundUpdater */
    class C4431a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1580c f24624a;

        /* renamed from: b */
        final /* synthetic */ UUID f24625b;

        /* renamed from: c */
        final /* synthetic */ C6088e f24626c;

        /* renamed from: d */
        final /* synthetic */ Context f24627d;

        C4431a(C1580c cVar, UUID uuid, C6088e eVar, Context context) {
            this.f24624a = cVar;
            this.f24625b = uuid;
            this.f24626c = eVar;
            this.f24627d = context;
        }

        public void run() {
            try {
                if (!this.f24624a.isCancelled()) {
                    String uuid = this.f24625b.toString();
                    C6110s m = C4430l.this.f24623c.mo17765m(uuid);
                    if (m == null || m.mo20936a()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    C4430l.this.f24622b.mo17619a(uuid, this.f24626c);
                    this.f24627d.startService(C1565a.m7248a(this.f24627d, uuid, this.f24626c));
                }
                this.f24624a.mo6380q(null);
            } catch (Throwable th) {
                this.f24624a.mo6381r(th);
            }
        }
    }

    public C4430l(WorkDatabase workDatabase, C4253a aVar, C4647a aVar2) {
        this.f24622b = aVar;
        this.f24621a = aVar2;
        this.f24623c = workDatabase.mo6318B();
    }

    /* renamed from: a */
    public C10139c<Void> mo17961a(Context context, UUID uuid, C6088e eVar) {
        C1580c u = C1580c.m7309u();
        this.f24621a.mo18322b(new C4431a(u, uuid, eVar, context));
        return u;
    }
}
