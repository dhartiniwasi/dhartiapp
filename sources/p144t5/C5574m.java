package p144t5;

import android.app.Application;
import java.util.concurrent.Executor;

/* renamed from: t5.m */
/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class C5574m implements C5569k1<C5571l> {

    /* renamed from: a */
    private final C5579n1<Application> f28160a;

    /* renamed from: b */
    private final C5579n1<C5577n> f28161b;

    /* renamed from: c */
    private final C5579n1<Executor> f28162c;

    public C5574m(C5579n1<Application> n1Var, C5579n1<C5577n> n1Var2, C5579n1<Executor> n1Var3) {
        this.f28160a = n1Var;
        this.f28161b = n1Var2;
        this.f28162c = n1Var3;
    }

    /* renamed from: a */
    public final C5571l mo19832d() {
        Executor executor = C5553g1.f28093b;
        C5576m1.m33649a(executor);
        return new C5571l(this.f28160a.mo19832d(), this.f28161b.mo19832d(), executor);
    }
}
