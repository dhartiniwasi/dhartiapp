package p410yd;

import p243gd.C10349s;
import p272jd.C11565d;
import p272jd.C11570g;
import p272jd.C11576h;
import p344rd.C12443p;

/* renamed from: yd.h */
/* compiled from: Builders.common.kt */
final /* synthetic */ class C13302h {
    /* renamed from: a */
    public static final C13337p1 m62207a(C13313j0 j0Var, C11570g gVar, C13323l0 l0Var, C12443p<? super C13313j0, ? super C11565d<? super C10349s>, ? extends Object> pVar) {
        C13264a aVar;
        C11570g d = C13275c0.m62174d(j0Var, gVar);
        if (l0Var.mo38462c()) {
            aVar = new C13369y1(d, pVar);
        } else {
            aVar = new C13291e2(d, true);
        }
        aVar.mo38379x0(l0Var, aVar, pVar);
        return aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C13337p1 m62208b(C13313j0 j0Var, C11570g gVar, C13323l0 l0Var, C12443p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            gVar = C11576h.f44049a;
        }
        if ((i & 2) != 0) {
            l0Var = C13323l0.DEFAULT;
        }
        return C13296g.m62199a(j0Var, gVar, l0Var, pVar);
    }
}
