package p008a8;

import com.google.firebase.firestore.C7926n;
import com.google.firebase.firestore.C7959y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p008a8.C6465f1;
import p247h8.C10432b;
import p247h8.C10449g0;
import p343rc.C12335j1;

/* renamed from: a8.p */
/* compiled from: EventManager */
public final class C6484p implements C6465f1.C6468c {

    /* renamed from: a */
    private final C6465f1 f30815a;

    /* renamed from: b */
    private final Map<C6452b1, C6486b> f30816b;

    /* renamed from: c */
    private final Set<C7926n<Void>> f30817c = new HashSet();

    /* renamed from: d */
    private C6516z0 f30818d = C6516z0.UNKNOWN;

    /* renamed from: a8.p$a */
    /* compiled from: EventManager */
    public static class C6485a {

        /* renamed from: a */
        public boolean f30819a;

        /* renamed from: b */
        public boolean f30820b;

        /* renamed from: c */
        public boolean f30821c;
    }

    /* renamed from: a8.p$b */
    /* compiled from: EventManager */
    private static class C6486b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<C6455c1> f30822a = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public C6514y1 f30823b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f30824c;

        C6486b() {
        }
    }

    public C6484p(C6465f1 f1Var) {
        this.f30815a = f1Var;
        this.f30816b = new HashMap();
        f1Var.mo21927x(this);
    }

    /* renamed from: f */
    private void m37816f() {
        for (C7926n<Void> a : this.f30817c) {
            a.mo21951a(null, (C7959y) null);
        }
    }

    /* renamed from: a */
    public void mo21929a(C6516z0 z0Var) {
        this.f30818d = z0Var;
        boolean z = false;
        for (C6486b a : this.f30816b.values()) {
            for (C6455c1 c : a.f30822a) {
                if (c.mo21902c(z0Var)) {
                    z = true;
                }
            }
        }
        if (z) {
            m37816f();
        }
    }

    /* renamed from: b */
    public void mo21930b(List<C6514y1> list) {
        boolean z = false;
        for (C6514y1 next : list) {
            C6486b bVar = this.f30816b.get(next.mo22090h());
            if (bVar != null) {
                for (C6455c1 d : bVar.f30822a) {
                    if (d.mo21903d(next)) {
                        z = true;
                    }
                }
                C6514y1 unused = bVar.f30823b = next;
            }
        }
        if (z) {
            m37816f();
        }
    }

    /* renamed from: c */
    public void mo21931c(C6452b1 b1Var, C12335j1 j1Var) {
        C6486b bVar = this.f30816b.get(b1Var);
        if (bVar != null) {
            for (C6455c1 b : bVar.f30822a) {
                b.mo21901b(C10449g0.m52720t(j1Var));
            }
        }
        this.f30816b.remove(b1Var);
    }

    /* renamed from: d */
    public int mo22015d(C6455c1 c1Var) {
        C6452b1 a = c1Var.mo21900a();
        C6486b bVar = this.f30816b.get(a);
        boolean z = bVar == null;
        if (z) {
            bVar = new C6486b();
            this.f30816b.put(a, bVar);
        }
        bVar.f30822a.add(c1Var);
        C10432b.m52648d(true ^ c1Var.mo21902c(this.f30818d), "onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", new Object[0]);
        if (bVar.f30823b != null && c1Var.mo21903d(bVar.f30823b)) {
            m37816f();
        }
        if (z) {
            int unused = bVar.f30824c = this.f30815a.mo21923n(a);
        }
        return bVar.f30824c;
    }

    /* renamed from: e */
    public void mo22016e(C7926n<Void> nVar) {
        this.f30817c.add(nVar);
        nVar.mo21951a(null, (C7959y) null);
    }

    /* renamed from: g */
    public void mo22017g(C6455c1 c1Var) {
        boolean z;
        C6452b1 a = c1Var.mo21900a();
        C6486b bVar = this.f30816b.get(a);
        if (bVar != null) {
            bVar.f30822a.remove(c1Var);
            z = bVar.f30822a.isEmpty();
        } else {
            z = false;
        }
        if (z) {
            this.f30816b.remove(a);
            this.f30815a.mo21928y(a);
        }
    }

    /* renamed from: h */
    public void mo22018h(C7926n<Void> nVar) {
        this.f30817c.remove(nVar);
    }
}
