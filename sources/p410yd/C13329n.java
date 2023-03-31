package p410yd;

import kotlinx.coroutines.internal.C11695h;
import p272jd.C11565d;

/* renamed from: yd.n */
/* compiled from: CancellableContinuation.kt */
public final class C13329n {
    /* renamed from: a */
    public static final <T> C13322l<T> m62280a(C11565d<? super T> dVar) {
        if (!(dVar instanceof C11695h)) {
            return new C13322l<>(dVar, 1);
        }
        C13322l<T> n = ((C11695h) dVar).mo35894n();
        if (n == null || !n.mo38450G()) {
            n = null;
        }
        return n == null ? new C13322l<>(dVar, 2) : n;
    }
}
