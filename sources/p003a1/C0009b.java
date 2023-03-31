package p003a1;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C1532a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p020c1.C1838c;
import p020c1.C1839d;
import p050g1.C4329p;
import p057h1.C4421f;
import p064i1.C4647a;
import p170y0.C6094j;
import p170y0.C6110s;
import p176z0.C6183b;
import p176z0.C6187e;
import p176z0.C6191i;

/* renamed from: a1.b */
/* compiled from: GreedyScheduler */
public class C0009b implements C6187e, C1838c, C6183b {

    /* renamed from: i */
    private static final String f19i = C6094j.m35719f("GreedyScheduler");

    /* renamed from: a */
    private final Context f20a;

    /* renamed from: b */
    private final C6191i f21b;

    /* renamed from: c */
    private final C1839d f22c;

    /* renamed from: d */
    private final Set<C4329p> f23d = new HashSet();

    /* renamed from: e */
    private C0007a f24e;

    /* renamed from: f */
    private boolean f25f;

    /* renamed from: g */
    private final Object f26g;

    /* renamed from: h */
    Boolean f27h;

    public C0009b(Context context, C1532a aVar, C4647a aVar2, C6191i iVar) {
        this.f20a = context;
        this.f21b = iVar;
        this.f22c = new C1839d(context, aVar2, this);
        this.f24e = new C0007a(this, aVar.mo6293k());
        this.f26g = new Object();
    }

    /* renamed from: g */
    private void m29g() {
        this.f27h = Boolean.valueOf(C4421f.m29376b(this.f20a, this.f21b.mo21126k()));
    }

    /* renamed from: h */
    private void m30h() {
        if (!this.f25f) {
            this.f21b.mo21128o().mo21103c(this);
            this.f25f = true;
        }
    }

    /* renamed from: i */
    private void m31i(String str) {
        synchronized (this.f26g) {
            Iterator<C4329p> it = this.f23d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C4329p next = it.next();
                if (next.f24215a.equals(str)) {
                    C6094j.m35717c().mo20921a(f19i, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    this.f23d.remove(next);
                    this.f22c.mo7026d(this.f23d);
                    break;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo28a(C4329p... pVarArr) {
        if (this.f27h == null) {
            m29g();
        }
        if (!this.f27h.booleanValue()) {
            C6094j.m35717c().mo20923d(f19i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        m30h();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C4329p pVar : pVarArr) {
            long a = pVar.mo17743a();
            long currentTimeMillis = System.currentTimeMillis();
            if (pVar.f24216b == C6110s.ENQUEUED) {
                if (currentTimeMillis < a) {
                    C0007a aVar = this.f24e;
                    if (aVar != null) {
                        aVar.mo25a(pVar);
                    }
                } else if (pVar.mo17744b()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23 && pVar.f24224j.mo20889h()) {
                        C6094j.m35717c().mo20921a(f19i, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[]{pVar}), new Throwable[0]);
                    } else if (i < 24 || !pVar.f24224j.mo20885e()) {
                        hashSet.add(pVar);
                        hashSet2.add(pVar.f24215a);
                    } else {
                        C6094j.m35717c().mo20921a(f19i, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{pVar}), new Throwable[0]);
                    }
                } else {
                    C6094j.m35717c().mo20921a(f19i, String.format("Starting work for %s", new Object[]{pVar.f24215a}), new Throwable[0]);
                    this.f21b.mo21135w(pVar.f24215a);
                }
            }
        }
        synchronized (this.f26g) {
            if (!hashSet.isEmpty()) {
                C6094j.m35717c().mo20921a(f19i, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", hashSet2)}), new Throwable[0]);
                this.f23d.addAll(hashSet);
                this.f22c.mo7026d(this.f23d);
            }
        }
    }

    /* renamed from: b */
    public void mo29b(List<String> list) {
        for (String next : list) {
            C6094j.m35717c().mo20921a(f19i, String.format("Constraints not met: Cancelling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f21b.mo21138z(next);
        }
    }

    /* renamed from: c */
    public boolean mo30c() {
        return false;
    }

    /* renamed from: d */
    public void mo31d(String str, boolean z) {
        m31i(str);
    }

    /* renamed from: e */
    public void mo32e(String str) {
        if (this.f27h == null) {
            m29g();
        }
        if (!this.f27h.booleanValue()) {
            C6094j.m35717c().mo20923d(f19i, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        m30h();
        C6094j.m35717c().mo20921a(f19i, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        C0007a aVar = this.f24e;
        if (aVar != null) {
            aVar.mo26b(str);
        }
        this.f21b.mo21138z(str);
    }

    /* renamed from: f */
    public void mo33f(List<String> list) {
        for (String next : list) {
            C6094j.m35717c().mo20921a(f19i, String.format("Constraints met: Scheduling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f21b.mo21135w(next);
        }
    }
}
