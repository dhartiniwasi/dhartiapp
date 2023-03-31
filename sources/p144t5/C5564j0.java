package p144t5;

import android.os.Handler;

/* renamed from: t5.j0 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5564j0 implements C5569k1<C5560i0> {

    /* renamed from: a */
    private final C5579n1<C5568k0> f28128a;

    /* renamed from: b */
    private final C5579n1<Handler> f28129b;

    /* renamed from: c */
    private final C5579n1<C5581o0> f28130c;

    public C5564j0(C5579n1<C5568k0> n1Var, C5579n1<Handler> n1Var2, C5579n1<C5581o0> n1Var3) {
        this.f28128a = n1Var;
        this.f28129b = n1Var2;
        this.f28130c = n1Var3;
    }

    /* renamed from: a */
    public final C5560i0 mo19832d() {
        Handler handler = C5553g1.f28092a;
        C5576m1.m33649a(handler);
        return new C5560i0(this.f28128a.mo19832d(), handler, ((C5584p0) this.f28130c).mo19832d());
    }
}
