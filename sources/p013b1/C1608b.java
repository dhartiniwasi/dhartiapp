package p013b1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p050g1.C4314g;
import p050g1.C4329p;
import p050g1.C4332q;
import p057h1.C4418c;
import p170y0.C6094j;
import p170y0.C6105n;
import p170y0.C6110s;
import p176z0.C6187e;
import p176z0.C6191i;

/* renamed from: b1.b */
/* compiled from: SystemJobScheduler */
public class C1608b implements C6187e {

    /* renamed from: e */
    private static final String f4607e = C6094j.m35719f("SystemJobScheduler");

    /* renamed from: a */
    private final Context f4608a;

    /* renamed from: b */
    private final JobScheduler f4609b;

    /* renamed from: c */
    private final C6191i f4610c;

    /* renamed from: d */
    private final C1606a f4611d;

    public C1608b(Context context, C6191i iVar) {
        this(context, iVar, (JobScheduler) context.getSystemService("jobscheduler"), new C1606a(context));
    }

    /* renamed from: b */
    public static void m7391b(Context context) {
        List<JobInfo> g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (g = m7394g(context, jobScheduler)) != null && !g.isEmpty()) {
            for (JobInfo id : g) {
                m7392d(jobScheduler, id.getId());
            }
        }
    }

    /* renamed from: d */
    private static void m7392d(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C6094j.m35717c().mo20922b(f4607e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    /* renamed from: f */
    private static List<Integer> m7393f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g = m7394g(context, jobScheduler);
        if (g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo next : g) {
            if (str.equals(m7395h(next))) {
                arrayList.add(Integer.valueOf(next.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private static List<JobInfo> m7394g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C6094j.m35717c().mo20922b(f4607e, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo next : list) {
            if (componentName.equals(next.getService())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private static String m7395h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m7396i(Context context, C6191i iVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g = m7394g(context, jobScheduler);
        List<String> a = iVar.mo21130q().mo6322y().mo17731a();
        boolean z = false;
        HashSet hashSet = new HashSet(g != null ? g.size() : 0);
        if (g != null && !g.isEmpty()) {
            for (JobInfo next : g) {
                String h = m7395h(next);
                if (!TextUtils.isEmpty(h)) {
                    hashSet.add(h);
                } else {
                    m7392d(jobScheduler, next.getId());
                }
            }
        }
        Iterator<String> it = a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    C6094j.m35717c().mo20921a(f4607e, "Reconciling jobs", new Throwable[0]);
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            WorkDatabase q = iVar.mo21130q();
            q.mo5592c();
            try {
                C4332q B = q.mo6318B();
                for (String c : a) {
                    B.mo17755c(c, -1);
                }
                q.mo5606r();
            } finally {
                q.mo5596g();
            }
        }
        return z;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public void mo28a(C4329p... pVarArr) {
        int i;
        List<Integer> f;
        int i2;
        WorkDatabase q = this.f4610c.mo21130q();
        C4418c cVar = new C4418c(q);
        int length = pVarArr.length;
        int i3 = 0;
        while (i3 < length) {
            C4329p pVar = pVarArr[i3];
            q.mo5592c();
            try {
                C4329p n = q.mo6318B().mo17766n(pVar.f24215a);
                if (n == null) {
                    C6094j c = C6094j.m35717c();
                    String str = f4607e;
                    c.mo20925h(str, "Skipping scheduling " + pVar.f24215a + " because it's no longer in the DB", new Throwable[0]);
                    q.mo5606r();
                } else if (n.f24216b != C6110s.ENQUEUED) {
                    C6094j c2 = C6094j.m35717c();
                    String str2 = f4607e;
                    c2.mo20925h(str2, "Skipping scheduling " + pVar.f24215a + " because it is no longer enqueued", new Throwable[0]);
                    q.mo5606r();
                } else {
                    C4314g c3 = q.mo6322y().mo17733c(pVar.f24215a);
                    if (c3 != null) {
                        i = c3.f24193b;
                    } else {
                        i = cVar.mo17948d(this.f4610c.mo21126k().mo6291i(), this.f4610c.mo21126k().mo6289g());
                    }
                    if (c3 == null) {
                        this.f4610c.mo21130q().mo6322y().mo17732b(new C4314g(pVar.f24215a, i));
                    }
                    mo6446j(pVar, i);
                    if (Build.VERSION.SDK_INT == 23 && (f = m7393f(this.f4608a, this.f4609b, pVar.f24215a)) != null) {
                        int indexOf = f.indexOf(Integer.valueOf(i));
                        if (indexOf >= 0) {
                            f.remove(indexOf);
                        }
                        if (!f.isEmpty()) {
                            i2 = f.get(0).intValue();
                        } else {
                            i2 = cVar.mo17948d(this.f4610c.mo21126k().mo6291i(), this.f4610c.mo21126k().mo6289g());
                        }
                        mo6446j(pVar, i2);
                    }
                    q.mo5606r();
                }
                q.mo5596g();
                i3++;
            } catch (Throwable th) {
                q.mo5596g();
                throw th;
            }
        }
    }

    /* renamed from: c */
    public boolean mo30c() {
        return true;
    }

    /* renamed from: e */
    public void mo32e(String str) {
        List<Integer> f = m7393f(this.f4608a, this.f4609b, str);
        if (f != null && !f.isEmpty()) {
            for (Integer intValue : f) {
                m7392d(this.f4609b, intValue.intValue());
            }
            this.f4610c.mo21130q().mo6322y().mo17734d(str);
        }
    }

    /* renamed from: j */
    public void mo6446j(C4329p pVar, int i) {
        JobInfo a = this.f4611d.mo6445a(pVar, i);
        C6094j c = C6094j.m35717c();
        String str = f4607e;
        c.mo20921a(str, String.format("Scheduling work ID %s Job ID %s", new Object[]{pVar.f24215a, Integer.valueOf(i)}), new Throwable[0]);
        try {
            if (this.f4609b.schedule(a) == 0) {
                C6094j.m35717c().mo20925h(str, String.format("Unable to schedule work ID %s", new Object[]{pVar.f24215a}), new Throwable[0]);
                if (pVar.f24231q && pVar.f24232r == C6105n.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f24231q = false;
                    C6094j.m35717c().mo20921a(str, String.format("Scheduling a non-expedited job (work ID %s)", new Object[]{pVar.f24215a}), new Throwable[0]);
                    mo6446j(pVar, i);
                }
            }
        } catch (IllegalStateException e) {
            List<JobInfo> g = m7394g(this.f4608a, this.f4609b);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(g != null ? g.size() : 0), Integer.valueOf(this.f4610c.mo21130q().mo6318B().mo17759g().size()), Integer.valueOf(this.f4610c.mo21126k().mo6290h())});
            C6094j.m35717c().mo20922b(f4607e, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            C6094j.m35717c().mo20922b(f4607e, String.format("Unable to schedule %s", new Object[]{pVar}), th);
        }
    }

    public C1608b(Context context, C6191i iVar, JobScheduler jobScheduler, C1606a aVar) {
        this.f4608a = context;
        this.f4610c = iVar;
        this.f4609b = jobScheduler;
        this.f4611d = aVar;
    }
}
