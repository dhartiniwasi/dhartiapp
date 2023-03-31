package p218e6;

import java.util.concurrent.Executor;

/* renamed from: e6.v */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9990v implements C9968e0 {

    /* renamed from: a */
    private final Executor f39939a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f39940b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C9963c f39941c;

    public C9990v(Executor executor, C9963c cVar) {
        this.f39939a = executor;
        this.f39941c = cVar;
    }

    /* renamed from: b */
    public final void mo32530b(C9975i iVar) {
        if (iVar.mo26360o()) {
            synchronized (this.f39940b) {
                if (this.f39941c != null) {
                    this.f39939a.execute(new C9989u(this));
                }
            }
        }
    }
}
