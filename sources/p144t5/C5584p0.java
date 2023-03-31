package p144t5;

import android.app.Application;
import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: t5.p0 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5584p0 implements C5569k1<C5581o0> {

    /* renamed from: a */
    private final C5579n1<Application> f28179a;

    /* renamed from: b */
    private final C5579n1<C5568k0> f28180b;

    /* renamed from: c */
    private final C5579n1<Handler> f28181c;

    /* renamed from: d */
    private final C5579n1<Executor> f28182d;

    /* renamed from: e */
    private final C5579n1<C5594s1> f28183e;

    /* renamed from: f */
    private final C5579n1<C5571l> f28184f;

    /* renamed from: g */
    private final C5579n1<C5613z> f28185g;

    /* renamed from: h */
    private final C5579n1<C5577n> f28186h;

    public C5584p0(C5579n1<Application> n1Var, C5579n1<C5568k0> n1Var2, C5579n1<Handler> n1Var3, C5579n1<Executor> n1Var4, C5579n1<C5594s1> n1Var5, C5579n1<C5571l> n1Var6, C5579n1<C5613z> n1Var7, C5579n1<C5577n> n1Var8) {
        this.f28179a = n1Var;
        this.f28180b = n1Var2;
        this.f28181c = n1Var3;
        this.f28182d = n1Var4;
        this.f28183e = n1Var5;
        this.f28184f = n1Var6;
        this.f28185g = n1Var7;
        this.f28186h = n1Var8;
    }

    /* renamed from: a */
    public final C5581o0 mo19832d() {
        Handler handler = C5553g1.f28092a;
        C5576m1.m33649a(handler);
        Executor executor = C5553g1.f28093b;
        C5576m1.m33649a(executor);
        return new C5581o0(this.f28179a.mo19832d(), this.f28180b.mo19832d(), handler, executor, this.f28183e.mo19832d(), ((C5574m) this.f28184f).mo19832d(), this.f28185g.mo19832d(), this.f28186h.mo19832d());
    }
}
