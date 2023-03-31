package p218e6;

import java.util.concurrent.Executor;

/* renamed from: e6.t */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9988t<TResult, TContinuationResult> implements C9969f<TContinuationResult>, C9967e, C9963c, C9968e0 {

    /* renamed from: a */
    private final Executor f39935a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9959a f39936b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C9976i0 f39937c;

    public C9988t(Executor executor, C9959a aVar, C9976i0 i0Var) {
        this.f39935a = executor;
        this.f39936b = aVar;
        this.f39937c = i0Var;
    }

    /* renamed from: a */
    public final void mo277a(TContinuationResult tcontinuationresult) {
        this.f39937c.mo32538u(tcontinuationresult);
    }

    /* renamed from: b */
    public final void mo32530b(C9975i iVar) {
        this.f39935a.execute(new C9987s(this, iVar));
    }

    /* renamed from: c */
    public final void mo32531c() {
        this.f39937c.mo32539v();
    }

    /* renamed from: d */
    public final void mo272d(Exception exc) {
        this.f39937c.mo32537t(exc);
    }
}
