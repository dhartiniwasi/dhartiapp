package kotlinx.coroutines.internal;

import java.util.Objects;
import kotlin.jvm.internal.C11669k;
import kotlin.jvm.internal.C11670l;
import p272jd.C11570g;
import p344rd.C12443p;
import p410yd.C13295f2;

/* renamed from: kotlinx.coroutines.internal.i0 */
/* compiled from: ThreadContext.kt */
public final class C11698i0 {

    /* renamed from: a */
    public static final C11690e0 f44267a = new C11690e0("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final C12443p<Object, C11570g.C11573b, Object> f44268b = C11699a.f44271a;

    /* renamed from: c */
    private static final C12443p<C13295f2<?>, C11570g.C11573b, C13295f2<?>> f44269c = C11700b.f44272a;

    /* renamed from: d */
    private static final C12443p<C11713l0, C11570g.C11573b, C11713l0> f44270d = C11701c.f44273a;

    /* renamed from: kotlinx.coroutines.internal.i0$a */
    /* compiled from: ThreadContext.kt */
    static final class C11699a extends C11670l implements C12443p<Object, C11570g.C11573b, Object> {

        /* renamed from: a */
        public static final C11699a f44271a = new C11699a();

        C11699a() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(Object obj, C11570g.C11573b bVar) {
            if (!(bVar instanceof C13295f2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.i0$b */
    /* compiled from: ThreadContext.kt */
    static final class C11700b extends C11670l implements C12443p<C13295f2<?>, C11570g.C11573b, C13295f2<?>> {

        /* renamed from: a */
        public static final C11700b f44272a = new C11700b();

        C11700b() {
            super(2);
        }

        /* renamed from: a */
        public final C13295f2<?> invoke(C13295f2<?> f2Var, C11570g.C11573b bVar) {
            if (f2Var != null) {
                return f2Var;
            }
            if (bVar instanceof C13295f2) {
                return (C13295f2) bVar;
            }
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.i0$c */
    /* compiled from: ThreadContext.kt */
    static final class C11701c extends C11670l implements C12443p<C11713l0, C11570g.C11573b, C11713l0> {

        /* renamed from: a */
        public static final C11701c f44273a = new C11701c();

        C11701c() {
            super(2);
        }

        /* renamed from: a */
        public final C11713l0 invoke(C11713l0 l0Var, C11570g.C11573b bVar) {
            if (bVar instanceof C13295f2) {
                C13295f2 f2Var = (C13295f2) bVar;
                l0Var.mo35923a(f2Var, f2Var.mo38420t(l0Var.f44284a));
            }
            return l0Var;
        }
    }

    /* renamed from: a */
    public static final void m56881a(C11570g gVar, Object obj) {
        if (obj != f44267a) {
            if (obj instanceof C11713l0) {
                ((C11713l0) obj).mo35924b(gVar);
                return;
            }
            Object fold = gVar.fold(null, f44269c);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((C13295f2) fold).mo38419g(gVar, obj);
        }
    }

    /* renamed from: b */
    public static final Object m56882b(C11570g gVar) {
        Object fold = gVar.fold(0, f44268b);
        C11669k.m56784b(fold);
        return fold;
    }

    /* renamed from: c */
    public static final Object m56883c(C11570g gVar, Object obj) {
        if (obj == null) {
            obj = m56882b(gVar);
        }
        if (obj == 0) {
            return f44267a;
        }
        if (obj instanceof Integer) {
            return gVar.fold(new C11713l0(gVar, ((Number) obj).intValue()), f44270d);
        }
        return ((C13295f2) obj).mo38420t(gVar);
    }
}
