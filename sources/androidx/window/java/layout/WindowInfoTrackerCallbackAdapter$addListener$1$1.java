package androidx.window.java.layout;

import androidx.core.util.C0823a;
import kotlin.coroutines.jvm.internal.C11650f;
import kotlin.coroutines.jvm.internal.C11656k;
import p197be.C6746b;
import p243gd.C10344n;
import p243gd.C10349s;
import p272jd.C11565d;
import p344rd.C12443p;
import p410yd.C13313j0;

@C11650f(mo35809c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", mo35810f = "WindowInfoTrackerCallbackAdapter.kt", mo35811l = {96}, mo35812m = "invokeSuspend")
/* compiled from: WindowInfoTrackerCallbackAdapter.kt */
final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends C11656k implements C12443p<C13313j0, C11565d<? super C10349s>, Object> {
    final /* synthetic */ C0823a<T> $consumer;
    final /* synthetic */ C6746b<T> $flow;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WindowInfoTrackerCallbackAdapter$addListener$1$1(C6746b<? extends T> bVar, C0823a<T> aVar, C11565d<? super WindowInfoTrackerCallbackAdapter$addListener$1$1> dVar) {
        super(2, dVar);
        this.$flow = bVar;
        this.$consumer = aVar;
    }

    public final C11565d<C10349s> create(Object obj, C11565d<?> dVar) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, dVar);
    }

    public final Object invoke(C13313j0 j0Var, C11565d<? super C10349s> dVar) {
        return ((WindowInfoTrackerCallbackAdapter$addListener$1$1) create(j0Var, dVar)).invokeSuspend(C10349s.f40964a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c = C11632d.m56711c();
        int i = this.label;
        if (i == 0) {
            C10344n.m52245b(obj);
            C6746b<T> bVar = this.$flow;
            C1519x3e71c403 windowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 = new C1519x3e71c403(this.$consumer);
            this.label = 1;
            if (bVar.mo22667a(windowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1, this) == c) {
                return c;
            }
        } else if (i == 1) {
            C10344n.m52245b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C10349s.f40964a;
    }
}
