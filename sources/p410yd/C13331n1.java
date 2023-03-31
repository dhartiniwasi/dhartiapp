package p410yd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p243gd.C10349s;
import p344rd.C12439l;

/* renamed from: yd.n1 */
/* compiled from: JobSupport.kt */
final class C13331n1 extends C13345r1 {

    /* renamed from: f */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f47653f = AtomicIntegerFieldUpdater.newUpdater(C13331n1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: e */
    private final C12439l<Throwable, C10349s> f47654e;

    public C13331n1(C12439l<? super Throwable, C10349s> lVar) {
        this.f47654e = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo38464x((Throwable) obj);
        return C10349s.f40964a;
    }

    /* renamed from: x */
    public void mo38464x(Throwable th) {
        if (f47653f.compareAndSet(this, 0, 1)) {
            this.f47654e.invoke(th);
        }
    }
}
