package androidx.window.java.layout;

import androidx.core.util.C0823a;
import p197be.C6747c;
import p243gd.C10349s;
import p272jd.C11565d;

/* renamed from: androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 */
/* compiled from: Collect.kt */
public final class C1519x3e71c403 implements C6747c<T> {
    final /* synthetic */ C0823a $consumer$inlined;

    public C1519x3e71c403(C0823a aVar) {
        this.$consumer$inlined = aVar;
    }

    public Object emit(T t, C11565d<? super C10349s> dVar) {
        this.$consumer$inlined.accept(t);
        return C10349s.f40964a;
    }
}
