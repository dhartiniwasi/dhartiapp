package p410yd;

import kotlin.coroutines.jvm.internal.C11649e;
import kotlin.jvm.internal.C11670l;
import kotlin.jvm.internal.C11676r;
import p272jd.C11565d;
import p272jd.C11566e;
import p272jd.C11570g;
import p272jd.C11576h;
import p344rd.C12443p;

/* renamed from: yd.c0 */
/* compiled from: CoroutineContext.kt */
public final class C13275c0 {

    /* renamed from: yd.c0$a */
    /* compiled from: CoroutineContext.kt */
    static final class C13276a extends C11670l implements C12443p<C11570g, C11570g.C11573b, C11570g> {

        /* renamed from: a */
        public static final C13276a f47607a = new C13276a();

        C13276a() {
            super(2);
        }

        /* renamed from: a */
        public final C11570g invoke(C11570g gVar, C11570g.C11573b bVar) {
            if (bVar instanceof C13265a0) {
                return gVar.plus(((C13265a0) bVar).mo38381q());
            }
            return gVar.plus(bVar);
        }
    }

    /* renamed from: yd.c0$b */
    /* compiled from: CoroutineContext.kt */
    static final class C13277b extends C11670l implements C12443p<C11570g, C11570g.C11573b, C11570g> {

        /* renamed from: a */
        final /* synthetic */ C11676r<C11570g> f47608a;

        /* renamed from: b */
        final /* synthetic */ boolean f47609b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13277b(C11676r<C11570g> rVar, boolean z) {
            super(2);
            this.f47608a = rVar;
            this.f47609b = z;
        }

        /* renamed from: a */
        public final C11570g invoke(C11570g gVar, C11570g.C11573b bVar) {
            if (!(bVar instanceof C13265a0)) {
                return gVar.plus(bVar);
            }
            C11570g.C11573b bVar2 = ((C11570g) this.f47608a.f44241a).get(bVar.getKey());
            if (bVar2 == null) {
                C13265a0 a0Var = (C13265a0) bVar;
                if (this.f47609b) {
                    a0Var = a0Var.mo38381q();
                }
                return gVar.plus(a0Var);
            }
            C11676r<C11570g> rVar = this.f47608a;
            rVar.f44241a = ((C11570g) rVar.f44241a).minusKey(bVar.getKey());
            return gVar.plus(((C13265a0) bVar).mo38380n(bVar2));
        }
    }

    /* renamed from: yd.c0$c */
    /* compiled from: CoroutineContext.kt */
    static final class C13278c extends C11670l implements C12443p<Boolean, C11570g.C11573b, Boolean> {

        /* renamed from: a */
        public static final C13278c f47610a = new C13278c();

        C13278c() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo38410a(boolean z, C11570g.C11573b bVar) {
            return Boolean.valueOf(z || (bVar instanceof C13265a0));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo38410a(((Boolean) obj).booleanValue(), (C11570g.C11573b) obj2);
        }
    }

    /* renamed from: a */
    private static final C11570g m62171a(C11570g gVar, C11570g gVar2, boolean z) {
        boolean c = m62173c(gVar);
        boolean c2 = m62173c(gVar2);
        if (!c && !c2) {
            return gVar.plus(gVar2);
        }
        C11676r rVar = new C11676r();
        rVar.f44241a = gVar2;
        C11576h hVar = C11576h.f44049a;
        C11570g gVar3 = (C11570g) gVar.fold(hVar, new C13277b(rVar, z));
        if (c2) {
            rVar.f44241a = ((C11570g) rVar.f44241a).fold(hVar, C13276a.f47607a);
        }
        return gVar3.plus((C11570g) rVar.f44241a);
    }

    /* renamed from: b */
    public static final String m62172b(C11570g gVar) {
        C13303h0 h0Var;
        String H;
        if (!C13330n0.m62283c() || (h0Var = (C13303h0) gVar.get(C13303h0.f47624b)) == null) {
            return null;
        }
        C13308i0 i0Var = (C13308i0) gVar.get(C13308i0.f47628b);
        String str = "coroutine";
        if (!(i0Var == null || (H = i0Var.mo38435H()) == null)) {
            str = H;
        }
        return str + '#' + h0Var.mo38425H();
    }

    /* renamed from: c */
    private static final boolean m62173c(C11570g gVar) {
        return ((Boolean) gVar.fold(Boolean.FALSE, C13278c.f47610a)).booleanValue();
    }

    /* renamed from: d */
    public static final C11570g m62174d(C13313j0 j0Var, C11570g gVar) {
        C11570g a = m62171a(j0Var.mo35888d(), gVar, true);
        C11570g plus = C13330n0.m62283c() ? a.plus(new C13303h0(C13330n0.m62282b().incrementAndGet())) : a;
        return (a == C13365x0.m62433a() || a.get(C11566e.f44046X) != null) ? plus : plus.plus(C13365x0.m62433a());
    }

    /* renamed from: e */
    public static final C13311i2<?> m62175e(C11649e eVar) {
        while (!(eVar instanceof C13350t0) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof C13311i2) {
                return (C13311i2) eVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static final C13311i2<?> m62176f(C11565d<?> dVar, C11570g gVar, Object obj) {
        if (!(dVar instanceof C11649e)) {
            return null;
        }
        if (!(gVar.get(C13315j2.f47632a) != null)) {
            return null;
        }
        C13311i2<?> e = m62175e((C11649e) dVar);
        if (e != null) {
            e.mo38439A0(gVar, obj);
        }
        return e;
    }
}
