package p176z0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.C1532a;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import p003a1.C0009b;
import p013b1.C1608b;
import p057h1.C4413a;
import p057h1.C4420e;
import p057h1.C4424h;
import p057h1.C4425i;
import p064i1.C4647a;
import p064i1.C4648b;
import p170y0.C6087d;
import p170y0.C6094j;
import p170y0.C6097l;
import p170y0.C6099m;
import p170y0.C6107p;
import p170y0.C6111t;
import p170y0.C6112u;

/* renamed from: z0.i */
/* compiled from: WorkManagerImpl */
public class C6191i extends C6111t {

    /* renamed from: j */
    private static final String f29704j = C6094j.m35719f("WorkManagerImpl");

    /* renamed from: k */
    private static C6191i f29705k = null;

    /* renamed from: l */
    private static C6191i f29706l = null;

    /* renamed from: m */
    private static final Object f29707m = new Object();

    /* renamed from: a */
    private Context f29708a;

    /* renamed from: b */
    private C1532a f29709b;

    /* renamed from: c */
    private WorkDatabase f29710c;

    /* renamed from: d */
    private C4647a f29711d;

    /* renamed from: e */
    private List<C6187e> f29712e;

    /* renamed from: f */
    private C6185d f29713f;

    /* renamed from: g */
    private C4420e f29714g;

    /* renamed from: h */
    private boolean f29715h;

    /* renamed from: i */
    private BroadcastReceiver.PendingResult f29716i;

    public C6191i(Context context, C1532a aVar, C4647a aVar2) {
        this(context, aVar, aVar2, context.getResources().getBoolean(C6107p.f29499a));
    }

    /* renamed from: h */
    public static void m36021h(Context context, C1532a aVar) {
        synchronized (f29707m) {
            C6191i iVar = f29705k;
            if (iVar != null) {
                if (f29706l != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (iVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (f29706l == null) {
                    f29706l = new C6191i(applicationContext, aVar, new C4648b(aVar.mo6294l()));
                }
                f29705k = f29706l;
            }
        }
    }

    @Deprecated
    /* renamed from: l */
    public static C6191i m36022l() {
        synchronized (f29707m) {
            C6191i iVar = f29705k;
            if (iVar != null) {
                return iVar;
            }
            C6191i iVar2 = f29706l;
            return iVar2;
        }
    }

    /* renamed from: m */
    public static C6191i m36023m(Context context) {
        C6191i l;
        synchronized (f29707m) {
            l = m36022l();
            if (l == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof C1532a.C1535c) {
                    m36021h(applicationContext, ((C1532a.C1535c) applicationContext).mo6299a());
                    l = m36023m(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return l;
    }

    /* renamed from: s */
    private void m36024s(Context context, C1532a aVar, C4647a aVar2, WorkDatabase workDatabase, List<C6187e> list, C6185d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f29708a = applicationContext;
        this.f29709b = aVar;
        this.f29711d = aVar2;
        this.f29710c = workDatabase;
        this.f29712e = list;
        this.f29713f = dVar;
        this.f29714g = new C4420e(workDatabase);
        this.f29715h = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext.isDeviceProtectedStorage()) {
            this.f29711d.mo18322b(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /* renamed from: a */
    public C6099m mo20937a(String str) {
        C4413a d = C4413a.m29349d(str, this);
        this.f29711d.mo18322b(d);
        return d.mo17939e();
    }

    /* renamed from: b */
    public C6099m mo20938b(UUID uuid) {
        C4413a b = C4413a.m29347b(uuid, this);
        this.f29711d.mo18322b(b);
        return b.mo17939e();
    }

    /* renamed from: c */
    public C6099m mo20939c(List<? extends C6112u> list) {
        if (!list.isEmpty()) {
            return new C6189g(this, list).mo21114a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    /* renamed from: e */
    public C6099m mo20941e(String str, C6087d dVar, List<C6097l> list) {
        return new C6189g(this, str, dVar, list).mo21114a();
    }

    /* renamed from: i */
    public List<C6187e> mo21124i(Context context, C1532a aVar, C4647a aVar2) {
        return Arrays.asList(new C6187e[]{C6188f.m36000a(context, this), new C0009b(context, aVar, aVar2, this)});
    }

    /* renamed from: j */
    public Context mo21125j() {
        return this.f29708a;
    }

    /* renamed from: k */
    public C1532a mo21126k() {
        return this.f29709b;
    }

    /* renamed from: n */
    public C4420e mo21127n() {
        return this.f29714g;
    }

    /* renamed from: o */
    public C6185d mo21128o() {
        return this.f29713f;
    }

    /* renamed from: p */
    public List<C6187e> mo21129p() {
        return this.f29712e;
    }

    /* renamed from: q */
    public WorkDatabase mo21130q() {
        return this.f29710c;
    }

    /* renamed from: r */
    public C4647a mo21131r() {
        return this.f29711d;
    }

    /* renamed from: t */
    public void mo21132t() {
        synchronized (f29707m) {
            this.f29715h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f29716i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f29716i = null;
            }
        }
    }

    /* renamed from: u */
    public void mo21133u() {
        if (Build.VERSION.SDK_INT >= 23) {
            C1608b.m7391b(mo21125j());
        }
        mo21130q().mo6318B().mo17773u();
        C6188f.m36001b(mo21126k(), mo21130q(), mo21129p());
    }

    /* renamed from: v */
    public void mo21134v(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f29707m) {
            this.f29716i = pendingResult;
            if (this.f29715h) {
                pendingResult.finish();
                this.f29716i = null;
            }
        }
    }

    /* renamed from: w */
    public void mo21135w(String str) {
        mo21136x(str, (WorkerParameters.C1531a) null);
    }

    /* renamed from: x */
    public void mo21136x(String str, WorkerParameters.C1531a aVar) {
        this.f29711d.mo18322b(new C4424h(this, str, aVar));
    }

    /* renamed from: y */
    public void mo21137y(String str) {
        this.f29711d.mo18322b(new C4425i(this, str, true));
    }

    /* renamed from: z */
    public void mo21138z(String str) {
        this.f29711d.mo18322b(new C4425i(this, str, false));
    }

    public C6191i(Context context, C1532a aVar, C4647a aVar2, boolean z) {
        this(context, aVar, aVar2, WorkDatabase.m7143s(context.getApplicationContext(), aVar2.mo18323c(), z));
    }

    public C6191i(Context context, C1532a aVar, C4647a aVar2, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        C6094j.m35718e(new C6094j.C6095a(aVar.mo6292j()));
        Context context2 = context;
        C1532a aVar3 = aVar;
        C4647a aVar4 = aVar2;
        WorkDatabase workDatabase2 = workDatabase;
        List<C6187e> i = mo21124i(applicationContext, aVar, aVar2);
        m36024s(context2, aVar3, aVar4, workDatabase2, i, new C6185d(context2, aVar3, aVar4, workDatabase2, i));
    }
}
