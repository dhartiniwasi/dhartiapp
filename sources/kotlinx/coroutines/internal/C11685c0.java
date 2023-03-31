package kotlinx.coroutines.internal;

import kotlin.coroutines.jvm.internal.C11649e;
import p272jd.C11565d;
import p344rd.C12439l;
import p410yd.C13264a;
import p410yd.C13337p1;
import p410yd.C13340q;
import p410yd.C13370z;

/* renamed from: kotlinx.coroutines.internal.c0 */
/* compiled from: Scopes.kt */
public class C11685c0<T> extends C13264a<T> implements C11649e {

    /* renamed from: c */
    public final C11565d<T> f44251c;

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final boolean mo35882V() {
        return true;
    }

    public final C11649e getCallerFrame() {
        C11565d<T> dVar = this.f44251c;
        if (dVar instanceof C11649e) {
            return (C11649e) dVar;
        }
        return null;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo35883u(Object obj) {
        C11697i.m56880c(C11629c.m56710b(this.f44251c), C13370z.m62444a(obj, this.f44251c), (C12439l) null, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo35884u0(Object obj) {
        C11565d<T> dVar = this.f44251c;
        dVar.resumeWith(C13370z.m62444a(obj, dVar));
    }

    /* renamed from: y0 */
    public final C13337p1 mo35885y0() {
        C13340q P = mo38501P();
        if (P == null) {
            return null;
        }
        return P.getParent();
    }
}
