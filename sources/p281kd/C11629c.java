package p281kd;

import kotlin.coroutines.jvm.internal.C11645a;
import kotlin.coroutines.jvm.internal.C11648d;
import kotlin.coroutines.jvm.internal.C11652h;
import kotlin.coroutines.jvm.internal.C11655j;
import kotlin.jvm.internal.C11669k;
import kotlin.jvm.internal.C11679u;
import p243gd.C10344n;
import p243gd.C10349s;
import p272jd.C11565d;
import p272jd.C11570g;
import p272jd.C11576h;
import p344rd.C12443p;

/* renamed from: kd.c */
/* compiled from: IntrinsicsJvm.kt */
class C11629c {

    /* renamed from: kd.c$a */
    /* compiled from: IntrinsicsJvm.kt */
    public static final class C11630a extends C11655j {

        /* renamed from: a */
        private int f44190a;

        /* renamed from: b */
        final /* synthetic */ C12443p f44191b;

        /* renamed from: c */
        final /* synthetic */ Object f44192c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11630a(C11565d dVar, C12443p pVar, Object obj) {
            super(dVar);
            this.f44191b = pVar;
            this.f44192c = obj;
            C11669k.m56785c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i = this.f44190a;
            if (i == 0) {
                this.f44190a = 1;
                C10344n.m52245b(obj);
                C11669k.m56785c(this.f44191b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((C12443p) C11679u.m56812a(this.f44191b, 2)).invoke(this.f44192c, this);
            } else if (i == 1) {
                this.f44190a = 2;
                C10344n.m52245b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: kd.c$b */
    /* compiled from: IntrinsicsJvm.kt */
    public static final class C11631b extends C11648d {

        /* renamed from: a */
        private int f44193a;

        /* renamed from: b */
        final /* synthetic */ C12443p f44194b;

        /* renamed from: c */
        final /* synthetic */ Object f44195c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11631b(C11565d dVar, C11570g gVar, C12443p pVar, Object obj) {
            super(dVar, gVar);
            this.f44194b = pVar;
            this.f44195c = obj;
            C11669k.m56785c(dVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        /* access modifiers changed from: protected */
        public Object invokeSuspend(Object obj) {
            int i = this.f44193a;
            if (i == 0) {
                this.f44193a = 1;
                C10344n.m52245b(obj);
                C11669k.m56785c(this.f44194b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                return ((C12443p) C11679u.m56812a(this.f44194b, 2)).invoke(this.f44195c, this);
            } else if (i == 1) {
                this.f44193a = 2;
                C10344n.m52245b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* renamed from: a */
    public static <R, T> C11565d<C10349s> m56709a(C12443p<? super R, ? super C11565d<? super T>, ? extends Object> pVar, R r, C11565d<? super T> dVar) {
        C11669k.m56787e(pVar, "<this>");
        C11669k.m56787e(dVar, "completion");
        C11565d<? super T> a = C11652h.m56769a(dVar);
        if (pVar instanceof C11645a) {
            return ((C11645a) pVar).create(r, a);
        }
        C11570g context = a.getContext();
        if (context == C11576h.f44049a) {
            return new C11630a(a, pVar, r);
        }
        return new C11631b(a, context, pVar, r);
    }

    /* renamed from: b */
    public static <T> C11565d<T> m56710b(C11565d<? super T> dVar) {
        C11565d<Object> intercepted;
        C11669k.m56787e(dVar, "<this>");
        C11648d dVar2 = dVar instanceof C11648d ? (C11648d) dVar : null;
        return (dVar2 == null || (intercepted = dVar2.intercepted()) == null) ? dVar : intercepted;
    }
}
