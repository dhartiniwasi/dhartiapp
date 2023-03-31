package androidx.work.impl;

import android.content.Context;
import androidx.room.C1449g;
import androidx.room.C1450h;
import androidx.work.impl.C1541a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p050g1.C4307b;
import p050g1.C4311e;
import p050g1.C4315h;
import p050g1.C4320k;
import p050g1.C4324n;
import p050g1.C4332q;
import p050g1.C4344t;
import p111p0.C5249b;
import p111p0.C5250c;
import p118q0.C5349c;
import p176z0.C6190h;

public abstract class WorkDatabase extends C1450h {

    /* renamed from: l */
    private static final long f4426l = TimeUnit.DAYS.toMillis(1);

    /* renamed from: androidx.work.impl.WorkDatabase$a */
    class C1538a implements C5250c.C5254c {

        /* renamed from: a */
        final /* synthetic */ Context f4427a;

        C1538a(Context context) {
            this.f4427a = context;
        }

        /* renamed from: a */
        public C5250c mo5637a(C5250c.C5252b bVar) {
            C5250c.C5252b.C5253a a = C5250c.C5252b.m32458a(this.f4427a);
            a.mo19245c(bVar.f27119b).mo19244b(bVar.f27120c).mo19246d(true);
            return new C5349c().mo5637a(a.mo19243a());
        }
    }

    /* renamed from: androidx.work.impl.WorkDatabase$b */
    class C1539b extends C1450h.C1452b {
        C1539b() {
        }

        /* renamed from: c */
        public void mo5616c(C5249b bVar) {
            super.mo5616c(bVar);
            bVar.mo19240u();
            try {
                bVar.mo19231C(WorkDatabase.m7146w());
                bVar.mo19237n0();
            } finally {
                bVar.mo19232D0();
            }
        }
    }

    /* renamed from: s */
    public static WorkDatabase m7143s(Context context, Executor executor, boolean z) {
        C1450h.C1451a<WorkDatabase> aVar;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z) {
            aVar = C1449g.m6772c(context, cls).mo5609c();
        } else {
            aVar = C1449g.m6770a(context, cls, C6190h.m36018d());
            aVar.mo5612f(new C1538a(context));
        }
        return aVar.mo5613g(executor).mo5607a(m7144u()).mo5608b(C1541a.f4436a).mo5608b(new C1541a.C1549h(context, 2, 3)).mo5608b(C1541a.f4437b).mo5608b(C1541a.f4438c).mo5608b(new C1541a.C1549h(context, 5, 6)).mo5608b(C1541a.f4439d).mo5608b(C1541a.f4440e).mo5608b(C1541a.f4441f).mo5608b(new C1541a.C1550i(context)).mo5608b(new C1541a.C1549h(context, 10, 11)).mo5608b(C1541a.f4442g).mo5611e().mo5610d();
    }

    /* renamed from: u */
    static C1450h.C1452b m7144u() {
        return new C1539b();
    }

    /* renamed from: v */
    static long m7145v() {
        return System.currentTimeMillis() - f4426l;
    }

    /* renamed from: w */
    static String m7146w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + m7145v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    /* renamed from: A */
    public abstract C4324n mo6317A();

    /* renamed from: B */
    public abstract C4332q mo6318B();

    /* renamed from: C */
    public abstract C4344t mo6319C();

    /* renamed from: t */
    public abstract C4307b mo6320t();

    /* renamed from: x */
    public abstract C4311e mo6321x();

    /* renamed from: y */
    public abstract C4315h mo6322y();

    /* renamed from: z */
    public abstract C4320k mo6323z();
}
