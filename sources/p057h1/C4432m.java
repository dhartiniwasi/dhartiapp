package p057h1;

import android.content.Context;
import androidx.work.C1536b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.C1580c;
import java.util.UUID;
import p050g1.C4323m;
import p050g1.C4329p;
import p064i1.C4647a;
import p170y0.C6094j;
import p170y0.C6106o;
import p170y0.C6110s;
import p228f7.C10139c;

/* renamed from: h1.m */
/* compiled from: WorkProgressUpdater */
public class C4432m implements C6106o {

    /* renamed from: c */
    static final String f24629c = C6094j.m35719f("WorkProgressUpdater");

    /* renamed from: a */
    final WorkDatabase f24630a;

    /* renamed from: b */
    final C4647a f24631b;

    /* renamed from: h1.m$a */
    /* compiled from: WorkProgressUpdater */
    class C4433a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UUID f24632a;

        /* renamed from: b */
        final /* synthetic */ C1536b f24633b;

        /* renamed from: c */
        final /* synthetic */ C1580c f24634c;

        C4433a(UUID uuid, C1536b bVar, C1580c cVar) {
            this.f24632a = uuid;
            this.f24633b = bVar;
            this.f24634c = cVar;
        }

        public void run() {
            String uuid = this.f24632a.toString();
            C6094j c = C6094j.m35717c();
            String str = C4432m.f24629c;
            c.mo20921a(str, String.format("Updating progress for %s (%s)", new Object[]{this.f24632a, this.f24633b}), new Throwable[0]);
            C4432m.this.f24630a.mo5592c();
            try {
                C4329p n = C4432m.this.f24630a.mo6318B().mo17766n(uuid);
                if (n != null) {
                    if (n.f24216b == C6110s.RUNNING) {
                        C4432m.this.f24630a.mo6317A().mo17740b(new C4323m(uuid, this.f24633b));
                    } else {
                        C6094j.m35717c().mo20925h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", new Object[]{uuid}), new Throwable[0]);
                    }
                    this.f24634c.mo6380q(null);
                    C4432m.this.f24630a.mo5606r();
                    C4432m.this.f24630a.mo5596g();
                    return;
                }
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            } catch (Throwable th) {
                C4432m.this.f24630a.mo5596g();
                throw th;
            }
        }
    }

    public C4432m(WorkDatabase workDatabase, C4647a aVar) {
        this.f24630a = workDatabase;
        this.f24631b = aVar;
    }

    /* renamed from: a */
    public C10139c<Void> mo17963a(Context context, UUID uuid, C1536b bVar) {
        C1580c u = C1580c.m7309u();
        this.f24631b.mo18322b(new C4433a(uuid, bVar, u));
        return u;
    }
}
