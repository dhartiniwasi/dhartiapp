package p218e6;

import java.util.concurrent.Executor;

/* renamed from: e6.d0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9966d0<TResult, TContinuationResult> implements C9969f<TContinuationResult>, C9967e, C9963c, C9968e0 {

    /* renamed from: a */
    private final Executor f39901a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C9973h f39902b;

    /* renamed from: c */
    private final C9976i0 f39903c;

    public C9966d0(Executor executor, C9973h hVar, C9976i0 i0Var) {
        this.f39901a = executor;
        this.f39902b = hVar;
        this.f39903c = i0Var;
    }

    /* renamed from: a */
    public final void mo277a(TContinuationResult tcontinuationresult) {
        this.f39903c.mo32538u(tcontinuationresult);
    }

    /* renamed from: b */
    public final void mo32530b(C9975i iVar) {
        this.f39901a.execute(new C9964c0(this, iVar));
    }

    /* renamed from: c */
    public final void mo32531c() {
        this.f39903c.mo32539v();
    }

    /* renamed from: d */
    public final void mo272d(Exception exc) {
        this.f39903c.mo32537t(exc);
    }
}
