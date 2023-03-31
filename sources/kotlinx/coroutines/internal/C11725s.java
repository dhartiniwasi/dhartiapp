package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0600b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: kotlinx.coroutines.internal.s */
/* compiled from: LockFreeTaskQueue.kt */
public class C11725s<E> {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f44303a = AtomicReferenceFieldUpdater.newUpdater(C11725s.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public C11725s(boolean z) {
        this._cur = new C11726t(8, z);
    }

    /* renamed from: a */
    public final boolean mo35940a(E e) {
        while (true) {
            C11726t tVar = (C11726t) this._cur;
            int a = tVar.mo35944a(e);
            if (a == 0) {
                return true;
            }
            if (a == 1) {
                C0600b.m2800a(f44303a, this, tVar, tVar.mo35948i());
            } else if (a == 2) {
                return false;
            }
        }
    }

    /* renamed from: b */
    public final void mo35941b() {
        while (true) {
            C11726t tVar = (C11726t) this._cur;
            if (!tVar.mo35945d()) {
                C0600b.m2800a(f44303a, this, tVar, tVar.mo35948i());
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final int mo35942c() {
        return ((C11726t) this._cur).mo35946f();
    }

    /* renamed from: d */
    public final E mo35943d() {
        while (true) {
            C11726t tVar = (C11726t) this._cur;
            E j = tVar.mo35949j();
            if (j != C11726t.f44307h) {
                return j;
            }
            C0600b.m2800a(f44303a, this, tVar, tVar.mo35948i());
        }
    }
}
