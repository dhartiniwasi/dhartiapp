package p188ae;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import kotlinx.coroutines.internal.C11690e0;
import kotlinx.coroutines.internal.C11714m;
import kotlinx.coroutines.internal.C11719p;
import kotlinx.coroutines.internal.C11721r;
import p243gd.C10349s;
import p344rd.C12439l;
import p410yd.C13326m;
import p410yd.C13330n0;
import p410yd.C13333o0;

/* renamed from: ae.c */
/* compiled from: AbstractChannel.kt */
public abstract class C6582c<E> implements C6605t<E> {

    /* renamed from: d */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f31038d = AtomicReferenceFieldUpdater.newUpdater(C6582c.class, Object.class, "onCloseHandler");

    /* renamed from: b */
    protected final C12439l<E, C10349s> f31039b;

    /* renamed from: c */
    private final C11719p f31040c = new C11719p();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* renamed from: ae.c$a */
    /* compiled from: AbstractChannel.kt */
    public static final class C6583a<E> extends C6604s {

        /* renamed from: d */
        public final E f31041d;

        public C6583a(E e) {
            this.f31041d = e;
        }

        public String toString() {
            return "SendBuffered@" + C13333o0.m62288b(this) + '(' + this.f31041d + ')';
        }

        /* renamed from: x */
        public void mo22219x() {
        }

        /* renamed from: y */
        public Object mo22220y() {
            return this.f31041d;
        }

        /* renamed from: z */
        public C11690e0 mo22221z(C11721r.C11723b bVar) {
            return C13326m.f47647a;
        }
    }

    public C6582c(C12439l<? super E, C10349s> lVar) {
        this.f31039b = lVar;
    }

    /* renamed from: b */
    private final int m38167b() {
        C11719p pVar = this.f31040c;
        int i = 0;
        for (C11721r rVar = (C11721r) pVar.mo35930n(); !C11669k.m56783a(rVar, pVar); rVar = rVar.mo35931o()) {
            if (rVar instanceof C11721r) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: f */
    private final String m38168f() {
        String str;
        C11721r o = this.f31040c.mo35931o();
        if (o == this.f31040c) {
            return "EmptyQueue";
        }
        if (o instanceof C6595j) {
            str = o.toString();
        } else if (o instanceof C6600o) {
            str = "ReceiveQueued";
        } else if (o instanceof C6604s) {
            str = "SendQueued";
        } else {
            str = C11669k.m56792j("UNEXPECTED:", o);
        }
        C11721r p = this.f31040c.mo35932p();
        if (p == o) {
            return str;
        }
        String str2 = str + ",queueSize=" + m38167b();
        if (!(p instanceof C6595j)) {
            return str2;
        }
        return str2 + ",closedForSend=" + p;
    }

    /* renamed from: g */
    private final void m38169g(C6595j<?> jVar) {
        Object b = C11714m.m56926b((Object) null, 1, (C11665g) null);
        while (true) {
            C11721r p = jVar.mo35932p();
            C6600o oVar = p instanceof C6600o ? (C6600o) p : null;
            if (oVar == null) {
                break;
            } else if (!oVar.mo35935t()) {
                oVar.mo35933q();
            } else {
                b = C11714m.m56927c(b, oVar);
            }
        }
        if (b != null) {
            if (!(b instanceof ArrayList)) {
                ((C6600o) b).mo22204y(jVar);
            } else {
                ArrayList arrayList = (ArrayList) b;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i = size - 1;
                        ((C6600o) arrayList.get(size)).mo22204y(jVar);
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    }
                }
            }
        }
        mo22215j(jVar);
    }

    /* renamed from: h */
    private final Throwable m38170h(C6595j<?> jVar) {
        m38169g(jVar);
        return jVar.mo22232E();
    }

    /* renamed from: a */
    public final Object mo22210a(E e) {
        Object i = mo22214i(e);
        if (i == C6581b.f31033b) {
            return C6591i.f31055a.mo22228c(C10349s.f40964a);
        }
        if (i == C6581b.f31034c) {
            C6595j<?> d = mo22212d();
            if (d == null) {
                return C6591i.f31055a.mo22227b();
            }
            return C6591i.f31055a.mo22226a(m38170h(d));
        } else if (i instanceof C6595j) {
            return C6591i.f31055a.mo22226a(m38170h((C6595j) i));
        } else {
            throw new IllegalStateException(C11669k.m56792j("trySend returned ", i).toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo22211c() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C6595j<?> mo22212d() {
        C11721r p = this.f31040c.mo35932p();
        C6595j<?> jVar = p instanceof C6595j ? (C6595j) p : null;
        if (jVar == null) {
            return null;
        }
        m38169g(jVar);
        return jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C11719p mo22213e() {
        return this.f31040c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public Object mo22214i(E e) {
        C6602q l;
        C11690e0 g;
        do {
            l = mo22190l();
            if (l == null) {
                return C6581b.f31034c;
            }
            g = l.mo22202g(e, (C11721r.C11723b) null);
        } while (g == null);
        if (C13330n0.m62281a()) {
            if (!(g == C13326m.f47647a)) {
                throw new AssertionError();
            }
        }
        l.mo22201f(e);
        return l.mo22233a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo22215j(C11721r rVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C6602q<?> mo22216k(E e) {
        C11721r p;
        C11719p pVar = this.f31040c;
        C6583a aVar = new C6583a(e);
        do {
            p = pVar.mo35932p();
            if (p instanceof C6602q) {
                return (C6602q) p;
            }
        } while (!p.mo35928i(aVar, pVar));
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C6602q<E> mo22190l() {
        C11721r rVar;
        C11721r u;
        C11719p pVar = this.f31040c;
        while (true) {
            rVar = (C11721r) pVar.mo35930n();
            if (rVar != pVar && (rVar instanceof C6602q)) {
                if (((((C6602q) rVar) instanceof C6595j) && !rVar.mo35927s()) || (u = rVar.mo35936u()) == null) {
                    break;
                }
                u.mo35934r();
            }
        }
        rVar = null;
        return (C6602q) rVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final C6604s mo22217m() {
        C11721r rVar;
        C11721r u;
        C11719p pVar = this.f31040c;
        while (true) {
            rVar = (C11721r) pVar.mo35930n();
            if (rVar != pVar && (rVar instanceof C6604s)) {
                if (((((C6604s) rVar) instanceof C6595j) && !rVar.mo35927s()) || (u = rVar.mo35936u()) == null) {
                    break;
                }
                u.mo35934r();
            }
        }
        rVar = null;
        return (C6604s) rVar;
    }

    public String toString() {
        return C13333o0.m62287a(this) + '@' + C13333o0.m62288b(this) + '{' + m38168f() + '}' + mo22211c();
    }
}
