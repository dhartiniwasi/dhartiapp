package p205ce;

import kotlin.coroutines.jvm.internal.C11648d;
import kotlin.coroutines.jvm.internal.C11649e;
import kotlin.coroutines.jvm.internal.C11652h;
import kotlin.jvm.internal.C11669k;
import kotlin.jvm.internal.C11670l;
import p197be.C6747c;
import p243gd.C10341m;
import p243gd.C10349s;
import p272jd.C11565d;
import p272jd.C11570g;
import p272jd.C11576h;
import p344rd.C12443p;
import p410yd.C13351t1;

/* renamed from: ce.c */
/* compiled from: SafeCollector.kt */
public final class C6860c<T> extends C11648d implements C6747c<T> {

    /* renamed from: a */
    public final C6747c<T> f31530a;

    /* renamed from: b */
    public final C11570g f31531b;

    /* renamed from: c */
    public final int f31532c;

    /* renamed from: d */
    private C11570g f31533d;

    /* renamed from: e */
    private C11565d<? super C10349s> f31534e;

    /* renamed from: ce.c$a */
    /* compiled from: SafeCollector.kt */
    static final class C6861a extends C11670l implements C12443p<Integer, C11570g.C11573b, Integer> {

        /* renamed from: a */
        public static final C6861a f31535a = new C6861a();

        C6861a() {
            super(2);
        }

        /* renamed from: a */
        public final Integer mo22986a(int i, C11570g.C11573b bVar) {
            return Integer.valueOf(i + 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo22986a(((Number) obj).intValue(), (C11570g.C11573b) obj2);
        }
    }

    public C6860c(C6747c<? super T> cVar, C11570g gVar) {
        super(C6859b.f31528a, C11576h.f44049a);
        this.f31530a = cVar;
        this.f31531b = gVar;
        this.f31532c = ((Number) gVar.fold(0, C6861a.f31535a)).intValue();
    }

    /* renamed from: b */
    private final void m39438b(C11570g gVar, C11570g gVar2, T t) {
        if (gVar2 instanceof C6858a) {
            m39440g((C6858a) gVar2, t);
        }
        C6864e.m39445a(this, gVar);
    }

    /* renamed from: f */
    private final Object m39439f(C11565d<? super C10349s> dVar, T t) {
        C11570g context = dVar.getContext();
        C13351t1.m62329d(context);
        C11570g gVar = this.f31533d;
        if (gVar != context) {
            m39438b(context, gVar, t);
            this.f31533d = context;
        }
        this.f31534e = dVar;
        Object d = C6862d.f31536a.mo22988d(this.f31530a, t, this);
        if (!C11669k.m56783a(d, C11632d.m56711c())) {
            this.f31534e = null;
        }
        return d;
    }

    /* renamed from: g */
    private final void m39440g(C6858a aVar, Object obj) {
        throw new IllegalStateException(C13001g.m61249e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + aVar.f31526a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    public Object emit(T t, C11565d<? super C10349s> dVar) {
        try {
            Object f = m39439f(dVar, t);
            if (f == C11632d.m56711c()) {
                C11652h.m56771c(dVar);
            }
            return f == C11632d.m56711c() ? f : C10349s.f40964a;
        } catch (Throwable th) {
            this.f31533d = new C6858a(th, dVar.getContext());
            throw th;
        }
    }

    public C11649e getCallerFrame() {
        C11565d<? super C10349s> dVar = this.f31534e;
        if (dVar instanceof C11649e) {
            return (C11649e) dVar;
        }
        return null;
    }

    public C11570g getContext() {
        C11570g gVar = this.f31533d;
        return gVar == null ? C11576h.f44049a : gVar;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object invokeSuspend(Object obj) {
        Throwable b = C10341m.m52241b(obj);
        if (b != null) {
            this.f31533d = new C6858a(b, getContext());
        }
        C11565d<? super C10349s> dVar = this.f31534e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        return C11632d.m56711c();
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
