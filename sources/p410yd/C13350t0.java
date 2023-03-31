package p410yd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.C11685c0;
import kotlinx.coroutines.internal.C11697i;
import p344rd.C12439l;

/* renamed from: yd.t0 */
/* compiled from: Builders.common.kt */
public final class C13350t0<T> extends C11685c0<T> {

    /* renamed from: d */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f47668d = AtomicIntegerFieldUpdater.newUpdater(C13350t0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    /* renamed from: z0 */
    private final boolean m62323z0() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f47668d.compareAndSet(this, 0, 2));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo35883u(Object obj) {
        mo35884u0(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo35884u0(Object obj) {
        if (!m62323z0()) {
            C11697i.m56880c(C11629c.m56710b(this.f44251c), C13370z.m62444a(obj, this.f44251c), (C12439l) null, 2, (Object) null);
        }
    }
}
