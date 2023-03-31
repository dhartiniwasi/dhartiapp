package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.futures.C1580c;
import java.util.Collections;
import java.util.List;
import p020c1.C1838c;
import p020c1.C1839d;
import p050g1.C4329p;
import p064i1.C4647a;
import p170y0.C6094j;
import p176z0.C6191i;
import p228f7.C10139c;

public class ConstraintTrackingWorker extends ListenableWorker implements C1838c {

    /* renamed from: s */
    private static final String f4561s = C6094j.m35719f("ConstraintTrkngWrkr");

    /* renamed from: f */
    private WorkerParameters f4562f;

    /* renamed from: g */
    final Object f4563g = new Object();

    /* renamed from: h */
    volatile boolean f4564h = false;

    /* renamed from: i */
    C1580c<ListenableWorker.C1526a> f4565i = C1580c.m7309u();

    /* renamed from: r */
    private ListenableWorker f4566r;

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    class C1581a implements Runnable {
        C1581a() {
        }

        public void run() {
            ConstraintTrackingWorker.this.mo6398e();
        }
    }

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$b */
    class C1582b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C10139c f4568a;

        C1582b(C10139c cVar) {
            this.f4568a = cVar;
        }

        public void run() {
            synchronized (ConstraintTrackingWorker.this.f4563g) {
                if (ConstraintTrackingWorker.this.f4564h) {
                    ConstraintTrackingWorker.this.mo6397d();
                } else {
                    ConstraintTrackingWorker.this.f4565i.mo6382s(this.f4568a);
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f4562f = workerParameters;
    }

    /* renamed from: a */
    public WorkDatabase mo6395a() {
        return C6191i.m36023m(getApplicationContext()).mo21130q();
    }

    /* renamed from: b */
    public void mo29b(List<String> list) {
        C6094j.m35717c().mo20921a(f4561s, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.f4563g) {
            this.f4564h = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6396c() {
        this.f4565i.mo6380q(ListenableWorker.C1526a.m7083a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo6397d() {
        this.f4565i.mo6380q(ListenableWorker.C1526a.m7084b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo6398e() {
        String l = getInputData().mo6306l("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(l)) {
            C6094j.m35717c().mo20922b(f4561s, "No worker to delegate to.", new Throwable[0]);
            mo6396c();
            return;
        }
        ListenableWorker b = getWorkerFactory().mo20954b(getApplicationContext(), l, this.f4562f);
        this.f4566r = b;
        if (b == null) {
            C6094j.m35717c().mo20921a(f4561s, "No worker to delegate to.", new Throwable[0]);
            mo6396c();
            return;
        }
        C4329p n = mo6395a().mo6318B().mo17766n(getId().toString());
        if (n == null) {
            mo6396c();
            return;
        }
        C1839d dVar = new C1839d(getApplicationContext(), getTaskExecutor(), this);
        dVar.mo7026d(Collections.singletonList(n));
        if (dVar.mo7025c(getId().toString())) {
            C6094j.m35717c().mo20921a(f4561s, String.format("Constraints met for delegate %s", new Object[]{l}), new Throwable[0]);
            try {
                C10139c<ListenableWorker.C1526a> startWork = this.f4566r.startWork();
                startWork.mo2706c(new C1582b(startWork), getBackgroundExecutor());
            } catch (Throwable th) {
                C6094j c = C6094j.m35717c();
                String str = f4561s;
                c.mo20921a(str, String.format("Delegated worker %s threw exception in startWork.", new Object[]{l}), th);
                synchronized (this.f4563g) {
                    if (this.f4564h) {
                        C6094j.m35717c().mo20921a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        mo6397d();
                    } else {
                        mo6396c();
                    }
                }
            }
        } else {
            C6094j.m35717c().mo20921a(f4561s, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{l}), new Throwable[0]);
            mo6397d();
        }
    }

    /* renamed from: f */
    public void mo33f(List<String> list) {
    }

    public C4647a getTaskExecutor() {
        return C6191i.m36023m(getApplicationContext()).mo21131r();
    }

    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f4566r;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f4566r;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.f4566r.stop();
        }
    }

    public C10139c<ListenableWorker.C1526a> startWork() {
        getBackgroundExecutor().execute(new C1581a());
        return this.f4565i;
    }
}
