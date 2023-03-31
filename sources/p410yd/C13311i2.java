package p410yd;

import kotlinx.coroutines.internal.C11685c0;
import kotlinx.coroutines.internal.C11698i0;
import p243gd.C10340l;
import p243gd.C10346p;
import p243gd.C10349s;
import p272jd.C11565d;
import p272jd.C11570g;

/* renamed from: yd.i2 */
/* compiled from: CoroutineContext.kt */
public final class C13311i2<T> extends C11685c0<T> {

    /* renamed from: d */
    private ThreadLocal<C10340l<C11570g, Object>> f47630d;

    /* renamed from: A0 */
    public final void mo38439A0(C11570g gVar, Object obj) {
        this.f47630d.set(C10346p.m52247a(gVar, obj));
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo35884u0(Object obj) {
        C10340l lVar = this.f47630d.get();
        C13311i2<?> i2Var = null;
        if (lVar != null) {
            C11698i0.m56881a((C11570g) lVar.mo33173a(), lVar.mo33174b());
            this.f47630d.set(i2Var);
        }
        Object a = C13370z.m62444a(obj, this.f44251c);
        C11565d<T> dVar = this.f44251c;
        C11570g context = dVar.getContext();
        Object c = C11698i0.m56883c(context, i2Var);
        if (c != C11698i0.f44267a) {
            i2Var = C13275c0.m62176f(dVar, context, c);
        }
        try {
            this.f44251c.resumeWith(a);
            C10349s sVar = C10349s.f40964a;
        } finally {
            if (i2Var == null || i2Var.mo38440z0()) {
                C11698i0.m56881a(context, c);
            }
        }
    }

    /* renamed from: z0 */
    public final boolean mo38440z0() {
        if (this.f47630d.get() == null) {
            return false;
        }
        this.f47630d.set((Object) null);
        return true;
    }
}
