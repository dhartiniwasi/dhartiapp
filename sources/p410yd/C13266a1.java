package p410yd;

import kotlinx.coroutines.internal.C11680a;

/* renamed from: yd.a1 */
/* compiled from: EventLoop.common.kt */
public abstract class C13266a1 extends C13282d0 {

    /* renamed from: b */
    private long f47596b;

    /* renamed from: c */
    private boolean f47597c;

    /* renamed from: d */
    private C11680a<C13353u0<?>> f47598d;

    /* renamed from: Q */
    private final long m62133Q(boolean z) {
        return z ? 4294967296L : 1;
    }

    /* renamed from: Y */
    public static /* synthetic */ void m62134Y(C13266a1 a1Var, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            a1Var.mo38385X(z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
    }

    /* renamed from: L */
    public final void mo38382L(boolean z) {
        long Q = this.f47596b - m62133Q(z);
        this.f47596b = Q;
        if (Q <= 0) {
            if (C13330n0.m62281a()) {
                if (!(this.f47596b == 0)) {
                    throw new AssertionError();
                }
            }
            if (this.f47597c) {
                shutdown();
            }
        }
    }

    /* renamed from: S */
    public final void mo38383S(C13353u0<?> u0Var) {
        C11680a<C13353u0<?>> aVar = this.f47598d;
        if (aVar == null) {
            aVar = new C11680a<>();
            this.f47598d = aVar;
        }
        aVar.mo35870a(u0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public long mo38384U() {
        C11680a<C13353u0<?>> aVar = this.f47598d;
        if (aVar != null && !aVar.mo35871c()) {
            return 0;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: X */
    public final void mo38385X(boolean z) {
        this.f47596b += m62133Q(z);
        if (!z) {
            this.f47597c = true;
        }
    }

    /* renamed from: c0 */
    public final boolean mo38386c0() {
        return this.f47596b >= m62133Q(true);
    }

    /* renamed from: d0 */
    public final boolean mo38387d0() {
        C11680a<C13353u0<?>> aVar = this.f47598d;
        if (aVar == null) {
            return true;
        }
        return aVar.mo35871c();
    }

    /* renamed from: f0 */
    public final boolean mo38388f0() {
        C13353u0 d;
        C11680a<C13353u0<?>> aVar = this.f47598d;
        if (aVar == null || (d = aVar.mo35872d()) == null) {
            return false;
        }
        d.run();
        return true;
    }

    public void shutdown() {
    }
}
