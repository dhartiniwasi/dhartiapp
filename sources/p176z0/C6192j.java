package p176z0;

import android.content.Context;
import androidx.work.C1532a;
import androidx.work.C1536b;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.futures.C1580c;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import p043f1.C4253a;
import p050g1.C4307b;
import p050g1.C4329p;
import p050g1.C4332q;
import p050g1.C4344t;
import p057h1.C4419d;
import p057h1.C4427k;
import p057h1.C4430l;
import p057h1.C4432m;
import p064i1.C4647a;
import p170y0.C6091h;
import p170y0.C6094j;
import p170y0.C6110s;
import p228f7.C10139c;

/* renamed from: z0.j */
/* compiled from: WorkerWrapper */
public class C6192j implements Runnable {

    /* renamed from: B */
    static final String f29717B = C6094j.m35719f("WorkerWrapper");

    /* renamed from: A */
    private volatile boolean f29718A;

    /* renamed from: a */
    Context f29719a;

    /* renamed from: b */
    private String f29720b;

    /* renamed from: c */
    private List<C6187e> f29721c;

    /* renamed from: d */
    private WorkerParameters.C1531a f29722d;

    /* renamed from: e */
    C4329p f29723e;

    /* renamed from: f */
    ListenableWorker f29724f;

    /* renamed from: g */
    C4647a f29725g;

    /* renamed from: h */
    ListenableWorker.C1526a f29726h = ListenableWorker.C1526a.m7083a();

    /* renamed from: i */
    private C1532a f29727i;

    /* renamed from: r */
    private C4253a f29728r;

    /* renamed from: s */
    private WorkDatabase f29729s;

    /* renamed from: t */
    private C4332q f29730t;

    /* renamed from: u */
    private C4307b f29731u;

    /* renamed from: v */
    private C4344t f29732v;

    /* renamed from: w */
    private List<String> f29733w;

    /* renamed from: x */
    private String f29734x;

    /* renamed from: y */
    C1580c<Boolean> f29735y = C1580c.m7309u();

    /* renamed from: z */
    C10139c<ListenableWorker.C1526a> f29736z = null;

    /* renamed from: z0.j$a */
    /* compiled from: WorkerWrapper */
    class C6193a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10139c f29737a;

        /* renamed from: b */
        final /* synthetic */ C1580c f29738b;

        C6193a(C10139c cVar, C1580c cVar2) {
            this.f29737a = cVar;
            this.f29738b = cVar2;
        }

        public void run() {
            try {
                this.f29737a.get();
                C6094j.m35717c().mo20921a(C6192j.f29717B, String.format("Starting work for %s", new Object[]{C6192j.this.f29723e.f24217c}), new Throwable[0]);
                C6192j jVar = C6192j.this;
                jVar.f29736z = jVar.f29724f.startWork();
                this.f29738b.mo6382s(C6192j.this.f29736z);
            } catch (Throwable th) {
                this.f29738b.mo6381r(th);
            }
        }
    }

    /* renamed from: z0.j$b */
    /* compiled from: WorkerWrapper */
    class C6194b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C1580c f29740a;

        /* renamed from: b */
        final /* synthetic */ String f29741b;

        C6194b(C1580c cVar, String str) {
            this.f29740a = cVar;
            this.f29741b = str;
        }

        public void run() {
            try {
                ListenableWorker.C1526a aVar = (ListenableWorker.C1526a) this.f29740a.get();
                if (aVar == null) {
                    C6094j.m35717c().mo20922b(C6192j.f29717B, String.format("%s returned a null result. Treating it as a failure.", new Object[]{C6192j.this.f29723e.f24217c}), new Throwable[0]);
                } else {
                    C6094j.m35717c().mo20921a(C6192j.f29717B, String.format("%s returned a %s result.", new Object[]{C6192j.this.f29723e.f24217c, aVar}), new Throwable[0]);
                    C6192j.this.f29726h = aVar;
                }
            } catch (CancellationException e) {
                C6094j.m35717c().mo20923d(C6192j.f29717B, String.format("%s was cancelled", new Object[]{this.f29741b}), e);
            } catch (InterruptedException | ExecutionException e2) {
                C6094j.m35717c().mo20922b(C6192j.f29717B, String.format("%s failed because it threw an exception/error", new Object[]{this.f29741b}), e2);
            } catch (Throwable th) {
                C6192j.this.mo21141f();
                throw th;
            }
            C6192j.this.mo21141f();
        }
    }

    /* renamed from: z0.j$c */
    /* compiled from: WorkerWrapper */
    public static class C6195c {

        /* renamed from: a */
        Context f29743a;

        /* renamed from: b */
        ListenableWorker f29744b;

        /* renamed from: c */
        C4253a f29745c;

        /* renamed from: d */
        C4647a f29746d;

        /* renamed from: e */
        C1532a f29747e;

        /* renamed from: f */
        WorkDatabase f29748f;

        /* renamed from: g */
        String f29749g;

        /* renamed from: h */
        List<C6187e> f29750h;

        /* renamed from: i */
        WorkerParameters.C1531a f29751i = new WorkerParameters.C1531a();

        public C6195c(Context context, C1532a aVar, C4647a aVar2, C4253a aVar3, WorkDatabase workDatabase, String str) {
            this.f29743a = context.getApplicationContext();
            this.f29746d = aVar2;
            this.f29745c = aVar3;
            this.f29747e = aVar;
            this.f29748f = workDatabase;
            this.f29749g = str;
        }

        /* renamed from: a */
        public C6192j mo21146a() {
            return new C6192j(this);
        }

        /* renamed from: b */
        public C6195c mo21147b(WorkerParameters.C1531a aVar) {
            if (aVar != null) {
                this.f29751i = aVar;
            }
            return this;
        }

        /* renamed from: c */
        public C6195c mo21148c(List<C6187e> list) {
            this.f29750h = list;
            return this;
        }
    }

    C6192j(C6195c cVar) {
        this.f29719a = cVar.f29743a;
        this.f29725g = cVar.f29746d;
        this.f29728r = cVar.f29745c;
        this.f29720b = cVar.f29749g;
        this.f29721c = cVar.f29750h;
        this.f29722d = cVar.f29751i;
        this.f29724f = cVar.f29744b;
        this.f29727i = cVar.f29747e;
        WorkDatabase workDatabase = cVar.f29748f;
        this.f29729s = workDatabase;
        this.f29730t = workDatabase.mo6318B();
        this.f29731u = this.f29729s.mo6320t();
        this.f29732v = this.f29729s.mo6319C();
    }

    /* renamed from: a */
    private String m36044a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f29720b);
        sb.append(", tags={ ");
        boolean z = true;
        for (String next : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    /* renamed from: c */
    private void m36045c(ListenableWorker.C1526a aVar) {
        if (aVar instanceof ListenableWorker.C1526a.C1529c) {
            C6094j.m35717c().mo20923d(f29717B, String.format("Worker result SUCCESS for %s", new Object[]{this.f29734x}), new Throwable[0]);
            if (this.f29723e.mo17746d()) {
                m36048h();
            } else {
                m36052m();
            }
        } else if (aVar instanceof ListenableWorker.C1526a.C1528b) {
            C6094j.m35717c().mo20923d(f29717B, String.format("Worker result RETRY for %s", new Object[]{this.f29734x}), new Throwable[0]);
            m36047g();
        } else {
            C6094j.m35717c().mo20923d(f29717B, String.format("Worker result FAILURE for %s", new Object[]{this.f29734x}), new Throwable[0]);
            if (this.f29723e.mo17746d()) {
                m36048h();
            } else {
                mo21142l();
            }
        }
    }

    /* renamed from: e */
    private void m36046e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f29730t.mo17765m(str2) != C6110s.CANCELLED) {
                this.f29730t.mo17754b(C6110s.FAILED, str2);
            }
            linkedList.addAll(this.f29731u.mo17717a(str2));
        }
    }

    /* renamed from: g */
    private void m36047g() {
        this.f29729s.mo5592c();
        try {
            this.f29730t.mo17754b(C6110s.ENQUEUED, this.f29720b);
            this.f29730t.mo17771s(this.f29720b, System.currentTimeMillis());
            this.f29730t.mo17755c(this.f29720b, -1);
            this.f29729s.mo5606r();
        } finally {
            this.f29729s.mo5596g();
            m36049i(true);
        }
    }

    /* renamed from: h */
    private void m36048h() {
        this.f29729s.mo5592c();
        try {
            this.f29730t.mo17771s(this.f29720b, System.currentTimeMillis());
            this.f29730t.mo17754b(C6110s.ENQUEUED, this.f29720b);
            this.f29730t.mo17767o(this.f29720b);
            this.f29730t.mo17755c(this.f29720b, -1);
            this.f29729s.mo5606r();
        } finally {
            this.f29729s.mo5596g();
            m36049i(false);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    private void m36049i(boolean z) {
        ListenableWorker listenableWorker;
        this.f29729s.mo5592c();
        try {
            if (!this.f29729s.mo6318B().mo17763k()) {
                C4419d.m29371a(this.f29719a, RescheduleReceiver.class, false);
            }
            if (z) {
                this.f29730t.mo17754b(C6110s.ENQUEUED, this.f29720b);
                this.f29730t.mo17755c(this.f29720b, -1);
            }
            if (!(this.f29723e == null || (listenableWorker = this.f29724f) == null || !listenableWorker.isRunInForeground())) {
                this.f29728r.mo17620b(this.f29720b);
            }
            this.f29729s.mo5606r();
            this.f29729s.mo5596g();
            this.f29735y.mo6380q(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f29729s.mo5596g();
            throw th;
        }
    }

    /* renamed from: j */
    private void m36050j() {
        C6110s m = this.f29730t.mo17765m(this.f29720b);
        if (m == C6110s.RUNNING) {
            C6094j.m35717c().mo20921a(f29717B, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f29720b}), new Throwable[0]);
            m36049i(true);
            return;
        }
        C6094j.m35717c().mo20921a(f29717B, String.format("Status for %s is %s; not doing any work", new Object[]{this.f29720b, m}), new Throwable[0]);
        m36049i(false);
    }

    /* renamed from: k */
    private void m36051k() {
        C1536b b;
        if (!m36053n()) {
            this.f29729s.mo5592c();
            try {
                C4329p n = this.f29730t.mo17766n(this.f29720b);
                this.f29723e = n;
                if (n == null) {
                    C6094j.m35717c().mo20922b(f29717B, String.format("Didn't find WorkSpec for id %s", new Object[]{this.f29720b}), new Throwable[0]);
                    m36049i(false);
                    this.f29729s.mo5606r();
                } else if (n.f24216b != C6110s.ENQUEUED) {
                    m36050j();
                    this.f29729s.mo5606r();
                    C6094j.m35717c().mo20921a(f29717B, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.f29723e.f24217c}), new Throwable[0]);
                    this.f29729s.mo5596g();
                } else {
                    if (n.mo17746d() || this.f29723e.mo17745c()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        C4329p pVar = this.f29723e;
                        if (!(pVar.f24228n == 0) && currentTimeMillis < pVar.mo17743a()) {
                            C6094j.m35717c().mo20921a(f29717B, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f29723e.f24217c}), new Throwable[0]);
                            m36049i(true);
                            this.f29729s.mo5606r();
                            this.f29729s.mo5596g();
                            return;
                        }
                    }
                    this.f29729s.mo5606r();
                    this.f29729s.mo5596g();
                    if (this.f29723e.mo17746d()) {
                        b = this.f29723e.f24219e;
                    } else {
                        C6091h b2 = this.f29727i.mo6288f().mo20920b(this.f29723e.f24218d);
                        if (b2 == null) {
                            C6094j.m35717c().mo20922b(f29717B, String.format("Could not create Input Merger %s", new Object[]{this.f29723e.f24218d}), new Throwable[0]);
                            mo21142l();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f29723e.f24219e);
                        arrayList.addAll(this.f29730t.mo17769q(this.f29720b));
                        b = b2.mo6236b(arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f29720b), b, this.f29733w, this.f29722d, this.f29723e.f24225k, this.f29727i.mo6287e(), this.f29725g, this.f29727i.mo6295m(), new C4432m(this.f29729s, this.f29725g), new C4430l(this.f29729s, this.f29728r, this.f29725g));
                    if (this.f29724f == null) {
                        this.f29724f = this.f29727i.mo6295m().mo20954b(this.f29719a, this.f29723e.f24217c, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.f29724f;
                    if (listenableWorker == null) {
                        C6094j.m35717c().mo20922b(f29717B, String.format("Could not create Worker %s", new Object[]{this.f29723e.f24217c}), new Throwable[0]);
                        mo21142l();
                    } else if (listenableWorker.isUsed()) {
                        C6094j.m35717c().mo20922b(f29717B, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f29723e.f24217c}), new Throwable[0]);
                        mo21142l();
                    } else {
                        this.f29724f.setUsed();
                        if (!m36054o()) {
                            m36050j();
                        } else if (!m36053n()) {
                            C1580c u = C1580c.m7309u();
                            C4427k kVar = new C4427k(this.f29719a, this.f29723e, this.f29724f, workerParameters.mo6274b(), this.f29725g);
                            this.f29725g.mo18321a().execute(kVar);
                            C10139c<Void> a = kVar.mo17957a();
                            a.mo2706c(new C6193a(a, u), this.f29725g.mo18321a());
                            u.mo2706c(new C6194b(u, this.f29734x), this.f29725g.mo18323c());
                        }
                    }
                }
            } finally {
                this.f29729s.mo5596g();
            }
        }
    }

    /* renamed from: m */
    private void m36052m() {
        this.f29729s.mo5592c();
        try {
            this.f29730t.mo17754b(C6110s.SUCCEEDED, this.f29720b);
            this.f29730t.mo17760h(this.f29720b, ((ListenableWorker.C1526a.C1529c) this.f29726h).mo6266e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String next : this.f29731u.mo17717a(this.f29720b)) {
                if (this.f29730t.mo17765m(next) == C6110s.BLOCKED && this.f29731u.mo17718b(next)) {
                    C6094j.m35717c().mo20923d(f29717B, String.format("Setting status to enqueued for %s", new Object[]{next}), new Throwable[0]);
                    this.f29730t.mo17754b(C6110s.ENQUEUED, next);
                    this.f29730t.mo17771s(next, currentTimeMillis);
                }
            }
            this.f29729s.mo5606r();
        } finally {
            this.f29729s.mo5596g();
            m36049i(false);
        }
    }

    /* renamed from: n */
    private boolean m36053n() {
        if (!this.f29718A) {
            return false;
        }
        C6094j.m35717c().mo20921a(f29717B, String.format("Work interrupted for %s", new Object[]{this.f29734x}), new Throwable[0]);
        C6110s m = this.f29730t.mo17765m(this.f29720b);
        if (m == null) {
            m36049i(false);
        } else {
            m36049i(!m.mo20936a());
        }
        return true;
    }

    /* renamed from: o */
    private boolean m36054o() {
        this.f29729s.mo5592c();
        try {
            boolean z = true;
            if (this.f29730t.mo17765m(this.f29720b) == C6110s.ENQUEUED) {
                this.f29730t.mo17754b(C6110s.RUNNING, this.f29720b);
                this.f29730t.mo17770r(this.f29720b);
            } else {
                z = false;
            }
            this.f29729s.mo5606r();
            return z;
        } finally {
            this.f29729s.mo5596g();
        }
    }

    /* renamed from: b */
    public C10139c<Boolean> mo21139b() {
        return this.f29735y;
    }

    /* renamed from: d */
    public void mo21140d() {
        boolean z;
        this.f29718A = true;
        m36053n();
        C10139c<ListenableWorker.C1526a> cVar = this.f29736z;
        if (cVar != null) {
            z = cVar.isDone();
            this.f29736z.cancel(true);
        } else {
            z = false;
        }
        ListenableWorker listenableWorker = this.f29724f;
        if (listenableWorker == null || z) {
            C6094j.m35717c().mo20921a(f29717B, String.format("WorkSpec %s is already done. Not interrupting.", new Object[]{this.f29723e}), new Throwable[0]);
            return;
        }
        listenableWorker.stop();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo21141f() {
        if (!m36053n()) {
            this.f29729s.mo5592c();
            try {
                C6110s m = this.f29730t.mo17765m(this.f29720b);
                this.f29729s.mo6317A().mo17739a(this.f29720b);
                if (m == null) {
                    m36049i(false);
                } else if (m == C6110s.RUNNING) {
                    m36045c(this.f29726h);
                } else if (!m.mo20936a()) {
                    m36047g();
                }
                this.f29729s.mo5606r();
            } finally {
                this.f29729s.mo5596g();
            }
        }
        List<C6187e> list = this.f29721c;
        if (list != null) {
            for (C6187e e : list) {
                e.mo32e(this.f29720b);
            }
            C6188f.m36001b(this.f29727i, this.f29729s, this.f29721c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo21142l() {
        this.f29729s.mo5592c();
        try {
            m36046e(this.f29720b);
            this.f29730t.mo17760h(this.f29720b, ((ListenableWorker.C1526a.C1527a) this.f29726h).mo6259e());
            this.f29729s.mo5606r();
        } finally {
            this.f29729s.mo5596g();
            m36049i(false);
        }
    }

    public void run() {
        List<String> a = this.f29732v.mo17775a(this.f29720b);
        this.f29733w = a;
        this.f29734x = m36044a(a);
        m36051k();
    }
}
