package p008a8;

import com.google.firebase.firestore.C7926n;
import com.google.firebase.firestore.C7959y;
import java.util.ArrayList;
import p008a8.C6480n;
import p008a8.C6484p;
import p247h8.C10432b;

/* renamed from: a8.c1 */
/* compiled from: QueryListener */
public class C6455c1 {

    /* renamed from: a */
    private final C6452b1 f30722a;

    /* renamed from: b */
    private final C6484p.C6485a f30723b;

    /* renamed from: c */
    private final C7926n<C6514y1> f30724c;

    /* renamed from: d */
    private boolean f30725d = false;

    /* renamed from: e */
    private C6516z0 f30726e = C6516z0.UNKNOWN;

    /* renamed from: f */
    private C6514y1 f30727f;

    public C6455c1(C6452b1 b1Var, C6484p.C6485a aVar, C7926n<C6514y1> nVar) {
        this.f30722a = b1Var;
        this.f30724c = nVar;
        this.f30723b = aVar;
    }

    /* renamed from: e */
    private void m37649e(C6514y1 y1Var) {
        C10432b.m52648d(!this.f30725d, "Trying to raise initial event for second time", new Object[0]);
        C6514y1 c = C6514y1.m37976c(y1Var.mo22090h(), y1Var.mo22086e(), y1Var.mo22088f(), y1Var.mo22094k(), y1Var.mo22084b(), y1Var.mo22092i());
        this.f30725d = true;
        this.f30724c.mo21951a(c, (C7959y) null);
    }

    /* renamed from: f */
    private boolean m37650f(C6514y1 y1Var) {
        boolean z = true;
        if (!y1Var.mo22085d().isEmpty()) {
            return true;
        }
        C6514y1 y1Var2 = this.f30727f;
        if (y1Var2 == null || y1Var2.mo22093j() == y1Var.mo22093j()) {
            z = false;
        }
        if (y1Var.mo22083a() || z) {
            return this.f30723b.f30820b;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m37651g(C6514y1 y1Var, C6516z0 z0Var) {
        C10432b.m52648d(!this.f30725d, "Determining whether to raise first event but already had first event.", new Object[0]);
        if (!y1Var.mo22094k()) {
            return true;
        }
        C6516z0 z0Var2 = C6516z0.OFFLINE;
        boolean z = !z0Var.equals(z0Var2);
        if (this.f30723b.f30821c && z) {
            C10432b.m52648d(y1Var.mo22094k(), "Waiting for sync, but snapshot is not from cache", new Object[0]);
            return false;
        } else if (!y1Var.mo22086e().isEmpty() || y1Var.mo22092i() || z0Var.equals(z0Var2)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public C6452b1 mo21900a() {
        return this.f30722a;
    }

    /* renamed from: b */
    public void mo21901b(C7959y yVar) {
        this.f30724c.mo21951a(null, yVar);
    }

    /* renamed from: c */
    public boolean mo21902c(C6516z0 z0Var) {
        this.f30726e = z0Var;
        C6514y1 y1Var = this.f30727f;
        if (y1Var == null || this.f30725d || !m37651g(y1Var, z0Var)) {
            return false;
        }
        m37649e(this.f30727f);
        return true;
    }

    /* renamed from: d */
    public boolean mo21903d(C6514y1 y1Var) {
        boolean z = false;
        C10432b.m52648d(!y1Var.mo22085d().isEmpty() || y1Var.mo22083a(), "We got a new snapshot with no changes?", new Object[0]);
        if (!this.f30723b.f30819a) {
            ArrayList arrayList = new ArrayList();
            for (C6480n next : y1Var.mo22085d()) {
                if (next.mo22008c() != C6480n.C6481a.METADATA) {
                    arrayList.add(next);
                }
            }
            y1Var = new C6514y1(y1Var.mo22090h(), y1Var.mo22086e(), y1Var.mo22089g(), arrayList, y1Var.mo22094k(), y1Var.mo22088f(), y1Var.mo22083a(), true, y1Var.mo22092i());
        }
        if (!this.f30725d) {
            if (m37651g(y1Var, this.f30726e)) {
                m37649e(y1Var);
            }
            this.f30727f = y1Var;
            return z;
        }
        if (m37650f(y1Var)) {
            this.f30724c.mo21951a(y1Var, (C7959y) null);
        }
        this.f30727f = y1Var;
        return z;
        z = true;
        this.f30727f = y1Var;
        return z;
    }
}
