package p020c1;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import p029d1.C3990a;
import p029d1.C3991b;
import p029d1.C3992c;
import p029d1.C3994d;
import p029d1.C3995e;
import p029d1.C3996f;
import p029d1.C3997g;
import p029d1.C3998h;
import p050g1.C4329p;
import p064i1.C4647a;
import p170y0.C6094j;

/* renamed from: c1.d */
/* compiled from: WorkConstraintsTracker */
public class C1839d implements C3992c.C3993a {

    /* renamed from: d */
    private static final String f5400d = C6094j.m35719f("WorkConstraintsTracker");

    /* renamed from: a */
    private final C1838c f5401a;

    /* renamed from: b */
    private final C3992c<?>[] f5402b;

    /* renamed from: c */
    private final Object f5403c = new Object();

    public C1839d(Context context, C4647a aVar, C1838c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5401a = cVar;
        this.f5402b = new C3992c[]{new C3990a(applicationContext, aVar), new C3991b(applicationContext, aVar), new C3998h(applicationContext, aVar), new C3994d(applicationContext, aVar), new C3997g(applicationContext, aVar), new C3996f(applicationContext, aVar), new C3995e(applicationContext, aVar)};
    }

    /* renamed from: a */
    public void mo7023a(List<String> list) {
        synchronized (this.f5403c) {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                if (mo7025c(next)) {
                    C6094j.m35717c().mo20921a(f5400d, String.format("Constraints met for %s", new Object[]{next}), new Throwable[0]);
                    arrayList.add(next);
                }
            }
            C1838c cVar = this.f5401a;
            if (cVar != null) {
                cVar.mo33f(arrayList);
            }
        }
    }

    /* renamed from: b */
    public void mo7024b(List<String> list) {
        synchronized (this.f5403c) {
            C1838c cVar = this.f5401a;
            if (cVar != null) {
                cVar.mo29b(list);
            }
        }
    }

    /* renamed from: c */
    public boolean mo7025c(String str) {
        synchronized (this.f5403c) {
            for (C3992c<?> cVar : this.f5402b) {
                if (cVar.mo17153d(str)) {
                    C6094j.m35717c().mo20921a(f5400d, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: d */
    public void mo7026d(Iterable<C4329p> iterable) {
        synchronized (this.f5403c) {
            for (C3992c<?> g : this.f5402b) {
                g.mo17156g((C3992c.C3993a) null);
            }
            for (C3992c<?> e : this.f5402b) {
                e.mo17154e(iterable);
            }
            for (C3992c<?> g2 : this.f5402b) {
                g2.mo17156g(this);
            }
        }
    }

    /* renamed from: e */
    public void mo7027e() {
        synchronized (this.f5403c) {
            for (C3992c<?> f : this.f5402b) {
                f.mo17155f();
            }
        }
    }
}
