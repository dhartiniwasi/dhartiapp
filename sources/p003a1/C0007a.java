package p003a1;

import java.util.HashMap;
import java.util.Map;
import p050g1.C4329p;
import p170y0.C6094j;
import p170y0.C6108q;

/* renamed from: a1.a */
/* compiled from: DelayedWorkTracker */
public class C0007a {

    /* renamed from: d */
    static final String f13d = C6094j.m35719f("DelayedWorkTracker");

    /* renamed from: a */
    final C0009b f14a;

    /* renamed from: b */
    private final C6108q f15b;

    /* renamed from: c */
    private final Map<String, Runnable> f16c = new HashMap();

    /* renamed from: a1.a$a */
    /* compiled from: DelayedWorkTracker */
    class C0008a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C4329p f17a;

        C0008a(C4329p pVar) {
            this.f17a = pVar;
        }

        public void run() {
            C6094j.m35717c().mo20921a(C0007a.f13d, String.format("Scheduling work %s", new Object[]{this.f17a.f24215a}), new Throwable[0]);
            C0007a.this.f14a.mo28a(this.f17a);
        }
    }

    public C0007a(C0009b bVar, C6108q qVar) {
        this.f14a = bVar;
        this.f15b = qVar;
    }

    /* renamed from: a */
    public void mo25a(C4329p pVar) {
        Runnable remove = this.f16c.remove(pVar.f24215a);
        if (remove != null) {
            this.f15b.mo20935b(remove);
        }
        C0008a aVar = new C0008a(pVar);
        this.f16c.put(pVar.f24215a, aVar);
        long currentTimeMillis = System.currentTimeMillis();
        this.f15b.mo20934a(pVar.mo17743a() - currentTimeMillis, aVar);
    }

    /* renamed from: b */
    public void mo26b(String str) {
        Runnable remove = this.f16c.remove(str);
        if (remove != null) {
            this.f15b.mo20935b(remove);
        }
    }
}
