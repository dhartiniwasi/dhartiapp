package p273je;

import java.util.LinkedHashSet;
import java.util.Set;
import p244ge.C10375h0;

/* renamed from: je.h */
/* compiled from: RouteDatabase */
final class C11586h {

    /* renamed from: a */
    private final Set<C10375h0> f44105a = new LinkedHashSet();

    C11586h() {
    }

    /* renamed from: a */
    public synchronized void mo35722a(C10375h0 h0Var) {
        this.f44105a.remove(h0Var);
    }

    /* renamed from: b */
    public synchronized void mo35723b(C10375h0 h0Var) {
        this.f44105a.add(h0Var);
    }

    /* renamed from: c */
    public synchronized boolean mo35724c(C10375h0 h0Var) {
        return this.f44105a.contains(h0Var);
    }
}
