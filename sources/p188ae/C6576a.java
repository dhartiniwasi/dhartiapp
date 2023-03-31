package p188ae;

import kotlin.coroutines.jvm.internal.C11646b;
import kotlin.coroutines.jvm.internal.C11652h;
import kotlin.jvm.internal.C11669k;
import kotlinx.coroutines.internal.C11688d0;
import kotlinx.coroutines.internal.C11690e0;
import kotlinx.coroutines.internal.C11719p;
import kotlinx.coroutines.internal.C11720q;
import kotlinx.coroutines.internal.C11721r;
import kotlinx.coroutines.internal.C11733y;
import p243gd.C10341m;
import p243gd.C10344n;
import p243gd.C10349s;
import p272jd.C11565d;
import p344rd.C12439l;
import p410yd.C13287e;
import p410yd.C13316k;
import p410yd.C13322l;
import p410yd.C13326m;
import p410yd.C13329n;
import p410yd.C13330n0;
import p410yd.C13333o0;

/* renamed from: ae.a */
/* compiled from: AbstractChannel.kt */
public abstract class C6576a<E> extends C6582c<E> implements C6587f<E> {

    /* renamed from: ae.a$a */
    /* compiled from: AbstractChannel.kt */
    private static final class C6577a<E> implements C6589g<E> {

        /* renamed from: a */
        public final C6576a<E> f31024a;

        /* renamed from: b */
        private Object f31025b = C6581b.f31035d;

        public C6577a(C6576a<E> aVar) {
            this.f31024a = aVar;
        }

        /* renamed from: c */
        private final boolean m38155c(Object obj) {
            if (!(obj instanceof C6595j)) {
                return true;
            }
            C6595j jVar = (C6595j) obj;
            if (jVar.f31058d == null) {
                return false;
            }
            throw C11688d0.m56847k(jVar.mo22231D());
        }

        /* renamed from: d */
        private final Object m38156d(C11565d<? super Boolean> dVar) {
            C13322l a = C13329n.m62280a(C11629c.m56710b(dVar));
            C6578b bVar = new C6578b(this, a);
            while (true) {
                if (this.f31024a.m38146p(bVar)) {
                    this.f31024a.m38147w(a, bVar);
                    break;
                }
                Object v = this.f31024a.mo22196v();
                mo22199e(v);
                if (v instanceof C6595j) {
                    C6595j jVar = (C6595j) v;
                    if (jVar.f31058d == null) {
                        C10341m.C10342a aVar = C10341m.f40958a;
                        a.resumeWith(C10341m.m52240a(C11646b.m56759a(false)));
                    } else {
                        C10341m.C10342a aVar2 = C10341m.f40958a;
                        a.resumeWith(C10341m.m52240a(C10344n.m52244a(jVar.mo22231D())));
                    }
                } else if (v != C6581b.f31035d) {
                    Boolean a2 = C11646b.m56759a(true);
                    C12439l<E, C10349s> lVar = this.f31024a.f31039b;
                    a.mo38445i(a2, lVar == null ? null : C11733y.m56984a(lVar, v, a.getContext()));
                }
            }
            Object w = a.mo38459w();
            if (w == C11632d.m56711c()) {
                C11652h.m56771c(dVar);
            }
            return w;
        }

        /* renamed from: a */
        public Object mo22197a(C11565d<? super Boolean> dVar) {
            Object b = mo22198b();
            C11690e0 e0Var = C6581b.f31035d;
            if (b != e0Var) {
                return C11646b.m56759a(m38155c(mo22198b()));
            }
            mo22199e(this.f31024a.mo22196v());
            if (mo22198b() != e0Var) {
                return C11646b.m56759a(m38155c(mo22198b()));
            }
            return m38156d(dVar);
        }

        /* renamed from: b */
        public final Object mo22198b() {
            return this.f31025b;
        }

        /* renamed from: e */
        public final void mo22199e(Object obj) {
            this.f31025b = obj;
        }

        public E next() {
            E e = this.f31025b;
            if (!(e instanceof C6595j)) {
                E e2 = C6581b.f31035d;
                if (e != e2) {
                    this.f31025b = e2;
                    return e;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw C11688d0.m56847k(((C6595j) e).mo22231D());
        }
    }

    /* renamed from: ae.a$b */
    /* compiled from: AbstractChannel.kt */
    private static class C6578b<E> extends C6600o<E> {

        /* renamed from: d */
        public final C6577a<E> f31026d;

        /* renamed from: e */
        public final C13316k<Boolean> f31027e;

        public C6578b(C6577a<E> aVar, C13316k<? super Boolean> kVar) {
            this.f31026d = aVar;
            this.f31027e = kVar;
        }

        /* renamed from: f */
        public void mo22201f(E e) {
            this.f31026d.mo22199e(e);
            this.f31027e.mo38447k(C13326m.f47647a);
        }

        /* renamed from: g */
        public C11690e0 mo22202g(E e, C11721r.C11723b bVar) {
            Object c = this.f31027e.mo38443c(Boolean.TRUE, (Object) null, mo22205z(e));
            if (c == null) {
                return null;
            }
            if (C13330n0.m62281a()) {
                if (!(c == C13326m.f47647a)) {
                    throw new AssertionError();
                }
            }
            return C13326m.f47647a;
        }

        public String toString() {
            return C11669k.m56792j("ReceiveHasNext@", C13333o0.m62288b(this));
        }

        /* renamed from: y */
        public void mo22204y(C6595j<?> jVar) {
            Object obj;
            if (jVar.f31058d == null) {
                obj = C13316k.C13317a.m62234a(this.f31027e, Boolean.FALSE, (Object) null, 2, (Object) null);
            } else {
                obj = this.f31027e.mo38444e(jVar.mo22231D());
            }
            if (obj != null) {
                this.f31026d.mo22199e(jVar);
                this.f31027e.mo38447k(obj);
            }
        }

        /* renamed from: z */
        public C12439l<Throwable, C10349s> mo22205z(E e) {
            C12439l<E, C10349s> lVar = this.f31026d.f31024a.f31039b;
            if (lVar == null) {
                return null;
            }
            return C11733y.m56984a(lVar, e, this.f31027e.getContext());
        }
    }

    /* renamed from: ae.a$c */
    /* compiled from: AbstractChannel.kt */
    private final class C6579c extends C13287e {

        /* renamed from: a */
        private final C6600o<?> f31028a;

        public C6579c(C6600o<?> oVar) {
            this.f31028a = oVar;
        }

        /* renamed from: a */
        public void mo22206a(Throwable th) {
            if (this.f31028a.mo35935t()) {
                C6576a.this.mo22194t();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo22206a((Throwable) obj);
            return C10349s.f40964a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f31028a + ']';
        }
    }

    /* renamed from: ae.a$d */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C6580d extends C11721r.C11722a {

        /* renamed from: d */
        final /* synthetic */ C11721r f31030d;

        /* renamed from: e */
        final /* synthetic */ C6576a f31031e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6580d(C11721r rVar, C6576a aVar) {
            super(rVar);
            this.f31030d = rVar;
            this.f31031e = aVar;
        }

        /* renamed from: i */
        public Object mo22208g(C11721r rVar) {
            if (this.f31031e.mo22193s()) {
                return null;
            }
            return C11720q.m56934a();
        }
    }

    public C6576a(C12439l<? super E, C10349s> lVar) {
        super(lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public final boolean m38146p(C6600o<? super E> oVar) {
        boolean q = mo22191q(oVar);
        if (q) {
            mo22195u();
        }
        return q;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m38147w(C13316k<?> kVar, C6600o<?> oVar) {
        kVar.mo38446j(new C6579c(oVar));
    }

    public final C6589g<E> iterator() {
        return new C6577a(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C6602q<E> mo22190l() {
        C6602q<E> l = super.mo22190l();
        if (l != null && !(l instanceof C6595j)) {
            mo22194t();
        }
        return l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo22191q(C6600o<? super E> oVar) {
        int w;
        C11721r p;
        if (mo22192r()) {
            C11719p e = mo22213e();
            do {
                p = e.mo35932p();
                if (!(!(p instanceof C6604s))) {
                    return false;
                }
            } while (!p.mo35928i(oVar, e));
        } else {
            C11719p e2 = mo22213e();
            C6580d dVar = new C6580d(oVar, this);
            do {
                C11721r p2 = e2.mo35932p();
                if (!(!(p2 instanceof C6604s))) {
                    return false;
                }
                w = p2.mo35937w(oVar, e2, dVar);
                if (w != 1) {
                }
            } while (w != 2);
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract boolean mo22192r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract boolean mo22193s();

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo22194t() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo22195u() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Object mo22196v() {
        while (true) {
            C6604s m = mo22217m();
            if (m == null) {
                return C6581b.f31035d;
            }
            C11690e0 z = m.mo22221z((C11721r.C11723b) null);
            if (z != null) {
                if (C13330n0.m62281a()) {
                    if (!(z == C13326m.f47647a)) {
                        throw new AssertionError();
                    }
                }
                m.mo22219x();
                return m.mo22220y();
            }
            m.mo22235A();
        }
    }
}
