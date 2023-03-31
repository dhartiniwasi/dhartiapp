package p410yd;

import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11670l;
import kotlinx.coroutines.internal.C11695h;
import kotlinx.coroutines.internal.C11716n;
import kotlinx.coroutines.internal.C11718o;
import p272jd.C11561a;
import p272jd.C11562b;
import p272jd.C11565d;
import p272jd.C11566e;
import p272jd.C11570g;
import p344rd.C12439l;

/* renamed from: yd.d0 */
/* compiled from: CoroutineDispatcher.kt */
public abstract class C13282d0 extends C11561a implements C11566e {

    /* renamed from: a */
    public static final C13283a f47612a = new C13283a((C11665g) null);

    /* renamed from: yd.d0$a */
    /* compiled from: CoroutineDispatcher.kt */
    public static final class C13283a extends C11562b<C11566e, C13282d0> {

        /* renamed from: yd.d0$a$a */
        /* compiled from: CoroutineDispatcher.kt */
        static final class C13284a extends C11670l implements C12439l<C11570g.C11573b, C13282d0> {

            /* renamed from: a */
            public static final C13284a f47613a = new C13284a();

            C13284a() {
                super(1);
            }

            /* renamed from: a */
            public final C13282d0 invoke(C11570g.C11573b bVar) {
                if (bVar instanceof C13282d0) {
                    return (C13282d0) bVar;
                }
                return null;
            }
        }

        private C13283a() {
            super(C11566e.f44046X, C13284a.f47613a);
        }

        public /* synthetic */ C13283a(C11665g gVar) {
            this();
        }
    }

    public C13282d0() {
        super(C11566e.f44046X);
    }

    /* renamed from: H */
    public abstract void mo35925H(C11570g gVar, Runnable runnable);

    /* renamed from: I */
    public boolean mo35954I(C11570g gVar) {
        return true;
    }

    /* renamed from: K */
    public C13282d0 mo38415K(int i) {
        C11718o.m56932a(i);
        return new C11716n(this, i);
    }

    public <E extends C11570g.C11573b> E get(C11570g.C11575c<E> cVar) {
        return C11566e.C11567a.m56503a(this, cVar);
    }

    public C11570g minusKey(C11570g.C11575c<?> cVar) {
        return C11566e.C11567a.m56504b(this, cVar);
    }

    /* renamed from: p */
    public final void mo35669p(C11565d<?> dVar) {
        ((C11695h) dVar).mo35897r();
    }

    public String toString() {
        return C13333o0.m62287a(this) + '@' + C13333o0.m62288b(this);
    }

    /* renamed from: w */
    public final <T> C11565d<T> mo35670w(C11565d<? super T> dVar) {
        return new C11695h(this, dVar);
    }
}
