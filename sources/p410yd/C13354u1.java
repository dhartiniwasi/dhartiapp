package p410yd;

import java.util.concurrent.CancellationException;
import p272jd.C11570g;

/* renamed from: yd.u1 */
/* compiled from: Job.kt */
final /* synthetic */ class C13354u1 {
    /* renamed from: a */
    public static final C13349t m62341a(C13337p1 p1Var) {
        return new C13348s1(p1Var);
    }

    /* renamed from: b */
    public static /* synthetic */ C13349t m62342b(C13337p1 p1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            p1Var = null;
        }
        return C13351t1.m62326a(p1Var);
    }

    /* renamed from: c */
    public static final void m62343c(C11570g gVar, CancellationException cancellationException) {
        C13337p1 p1Var = (C13337p1) gVar.get(C13337p1.f47660Z);
        if (p1Var != null) {
            p1Var.mo38468F(cancellationException);
        }
    }

    /* renamed from: d */
    public static final void m62344d(C11570g gVar) {
        C13337p1 p1Var = (C13337p1) gVar.get(C13337p1.f47660Z);
        if (p1Var != null) {
            C13351t1.m62330e(p1Var);
        }
    }

    /* renamed from: e */
    public static final void m62345e(C13337p1 p1Var) {
        if (!p1Var.mo38375b()) {
            throw p1Var.mo38470h();
        }
    }
}
