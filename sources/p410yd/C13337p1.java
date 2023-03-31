package p410yd;

import java.util.concurrent.CancellationException;
import p243gd.C10349s;
import p272jd.C11570g;
import p344rd.C12439l;
import p344rd.C12443p;

/* renamed from: yd.p1 */
/* compiled from: Job.kt */
public interface C13337p1 extends C11570g.C11573b {

    /* renamed from: Z */
    public static final C13339b f47660Z = C13339b.f47661a;

    /* renamed from: yd.p1$a */
    /* compiled from: Job.kt */
    public static final class C13338a {
        /* renamed from: a */
        public static /* synthetic */ void m62306a(C13337p1 p1Var, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                p1Var.mo38468F(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static <R> R m62307b(C13337p1 p1Var, R r, C12443p<? super R, ? super C11570g.C11573b, ? extends R> pVar) {
            return C11570g.C11573b.C11574a.m56508a(p1Var, r, pVar);
        }

        /* renamed from: c */
        public static <E extends C11570g.C11573b> E m62308c(C13337p1 p1Var, C11570g.C11575c<E> cVar) {
            return C11570g.C11573b.C11574a.m56509b(p1Var, cVar);
        }

        /* renamed from: d */
        public static /* synthetic */ C13368y0 m62309d(C13337p1 p1Var, boolean z, boolean z2, C12439l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return p1Var.mo38467D(z, z2, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        /* renamed from: e */
        public static C11570g m62310e(C13337p1 p1Var, C11570g.C11575c<?> cVar) {
            return C11570g.C11573b.C11574a.m56510c(p1Var, cVar);
        }

        /* renamed from: f */
        public static C11570g m62311f(C13337p1 p1Var, C11570g gVar) {
            return C11570g.C11573b.C11574a.m56511d(p1Var, gVar);
        }
    }

    /* renamed from: yd.p1$b */
    /* compiled from: Job.kt */
    public static final class C13339b implements C11570g.C11575c<C13337p1> {

        /* renamed from: a */
        static final /* synthetic */ C13339b f47661a = new C13339b();

        private C13339b() {
        }
    }

    /* renamed from: D */
    C13368y0 mo38467D(boolean z, boolean z2, C12439l<? super Throwable, C10349s> lVar);

    /* renamed from: F */
    void mo38468F(CancellationException cancellationException);

    /* renamed from: b */
    boolean mo38375b();

    /* renamed from: f */
    C13340q mo38469f(C13346s sVar);

    /* renamed from: h */
    CancellationException mo38470h();

    boolean start();
}
