package p144t5;

import android.app.Application;
import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: t5.h2 */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5558h2 implements C5569k1<C5554g2> {

    /* renamed from: a */
    private final C5579n1<Application> f28106a;

    /* renamed from: b */
    private final C5579n1<C5539d> f28107b;

    /* renamed from: c */
    private final C5579n1<Handler> f28108c;

    /* renamed from: d */
    private final C5579n1<Executor> f28109d;

    /* renamed from: e */
    private final C5579n1<C5577n> f28110e;

    /* renamed from: f */
    private final C5579n1<C5536c0> f28111f;

    /* renamed from: g */
    private final C5579n1<C5612y1> f28112g;

    /* renamed from: h */
    private final C5579n1<C5570k2> f28113h;

    /* renamed from: i */
    private final C5579n1<C5594s1> f28114i;

    public C5558h2(C5579n1<Application> n1Var, C5579n1<C5539d> n1Var2, C5579n1<Handler> n1Var3, C5579n1<Executor> n1Var4, C5579n1<C5577n> n1Var5, C5579n1<C5536c0> n1Var6, C5579n1<C5612y1> n1Var7, C5579n1<C5570k2> n1Var8, C5579n1<C5594s1> n1Var9) {
        this.f28106a = n1Var;
        this.f28107b = n1Var2;
        this.f28108c = n1Var3;
        this.f28109d = n1Var4;
        this.f28110e = n1Var5;
        this.f28111f = n1Var6;
        this.f28112g = n1Var7;
        this.f28113h = n1Var8;
        this.f28114i = n1Var9;
    }

    /* renamed from: a */
    public final C5554g2 mo19832d() {
        Handler handler = C5553g1.f28092a;
        C5576m1.m33649a(handler);
        Executor executor = C5553g1.f28093b;
        C5576m1.m33649a(executor);
        return new C5554g2(this.f28106a.mo19832d(), this.f28107b.mo19832d(), handler, executor, this.f28110e.mo19832d(), this.f28111f.mo19832d(), ((C5530a2) this.f28112g).mo19832d(), ((C5535c) this.f28113h).mo19832d(), this.f28114i.mo19832d());
    }
}
