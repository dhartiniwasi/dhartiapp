package p205ce;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C11670l;
import kotlinx.coroutines.internal.C11685c0;
import p272jd.C11570g;
import p344rd.C12443p;
import p410yd.C13337p1;

/* renamed from: ce.e */
/* compiled from: SafeCollector.common.kt */
public final class C6864e {

    /* renamed from: ce.e$a */
    /* compiled from: SafeCollector.common.kt */
    static final class C6865a extends C11670l implements C12443p<Integer, C11570g.C11573b, Integer> {

        /* renamed from: a */
        final /* synthetic */ C6860c<?> f31538a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C6865a(C6860c<?> cVar) {
            super(2);
            this.f31538a = cVar;
        }

        /* renamed from: a */
        public final Integer mo22989a(int i, C11570g.C11573b bVar) {
            C11570g.C11575c key = bVar.getKey();
            C11570g.C11573b bVar2 = this.f31538a.f31531b.get(key);
            if (key != C13337p1.f47660Z) {
                return Integer.valueOf(bVar != bVar2 ? RecyclerView.UNDEFINED_DURATION : i + 1);
            }
            C13337p1 p1Var = (C13337p1) bVar2;
            C13337p1 b = C6864e.m39446b((C13337p1) bVar, p1Var);
            if (b == p1Var) {
                if (p1Var != null) {
                    i++;
                }
                return Integer.valueOf(i);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b + ", expected child of " + p1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo22989a(((Number) obj).intValue(), (C11570g.C11573b) obj2);
        }
    }

    /* renamed from: a */
    public static final void m39445a(C6860c<?> cVar, C11570g gVar) {
        if (((Number) gVar.fold(0, new C6865a(cVar))).intValue() != cVar.f31532c) {
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + cVar.f31531b + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
        }
    }

    /* renamed from: b */
    public static final C13337p1 m39446b(C13337p1 p1Var, C13337p1 p1Var2) {
        while (p1Var != null) {
            if (p1Var == p1Var2 || !(p1Var instanceof C11685c0)) {
                return p1Var;
            }
            p1Var = ((C11685c0) p1Var).mo35885y0();
        }
        return null;
    }
}
