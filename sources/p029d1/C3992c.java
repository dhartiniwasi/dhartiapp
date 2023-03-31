package p029d1;

import java.util.ArrayList;
import java.util.List;
import p020c1.C1836a;
import p036e1.C4176d;
import p050g1.C4329p;

/* renamed from: d1.c */
/* compiled from: ConstraintController */
public abstract class C3992c<T> implements C1836a<T> {

    /* renamed from: a */
    private final List<String> f23010a = new ArrayList();

    /* renamed from: b */
    private T f23011b;

    /* renamed from: c */
    private C4176d<T> f23012c;

    /* renamed from: d */
    private C3993a f23013d;

    /* renamed from: d1.c$a */
    /* compiled from: ConstraintController */
    public interface C3993a {
        /* renamed from: a */
        void mo7023a(List<String> list);

        /* renamed from: b */
        void mo7024b(List<String> list);
    }

    C3992c(C4176d<T> dVar) {
        this.f23012c = dVar;
    }

    /* renamed from: h */
    private void m27611h(C3993a aVar, T t) {
        if (!this.f23010a.isEmpty() && aVar != null) {
            if (t == null || mo17150c(t)) {
                aVar.mo7024b(this.f23010a);
            } else {
                aVar.mo7023a(this.f23010a);
            }
        }
    }

    /* renamed from: a */
    public void mo7015a(T t) {
        this.f23011b = t;
        m27611h(this.f23013d, t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo17149b(C4329p pVar);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo17150c(T t);

    /* renamed from: d */
    public boolean mo17153d(String str) {
        T t = this.f23011b;
        return t != null && mo17150c(t) && this.f23010a.contains(str);
    }

    /* renamed from: e */
    public void mo17154e(Iterable<C4329p> iterable) {
        this.f23010a.clear();
        for (C4329p next : iterable) {
            if (mo17149b(next)) {
                this.f23010a.add(next.f24215a);
            }
        }
        if (this.f23010a.isEmpty()) {
            this.f23012c.mo17511c(this);
        } else {
            this.f23012c.mo17510a(this);
        }
        m27611h(this.f23013d, this.f23011b);
    }

    /* renamed from: f */
    public void mo17155f() {
        if (!this.f23010a.isEmpty()) {
            this.f23010a.clear();
            this.f23012c.mo17511c(this);
        }
    }

    /* renamed from: g */
    public void mo17156g(C3993a aVar) {
        if (this.f23013d != aVar) {
            this.f23013d = aVar;
            m27611h(aVar, this.f23011b);
        }
    }
}
