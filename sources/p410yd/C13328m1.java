package p410yd;

import p243gd.C10349s;
import p344rd.C12439l;

/* renamed from: yd.m1 */
/* compiled from: CancellableContinuationImpl.kt */
final class C13328m1 extends C13307i {

    /* renamed from: a */
    private final C12439l<Throwable, C10349s> f47648a;

    public C13328m1(C12439l<? super Throwable, C10349s> lVar) {
        this.f47648a = lVar;
    }

    /* renamed from: a */
    public void mo22206a(Throwable th) {
        this.f47648a.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo22206a((Throwable) obj);
        return C10349s.f40964a;
    }

    public String toString() {
        return "InvokeOnCancel[" + C13333o0.m62287a(this.f47648a) + '@' + C13333o0.m62288b(this) + ']';
    }
}
