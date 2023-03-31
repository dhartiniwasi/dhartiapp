package p218e6;

import java.util.concurrent.Executor;

/* renamed from: e6.x */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9992x implements C9968e0 {

    /* renamed from: a */
    private final Executor f39944a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f39945b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C9965d f39946c;

    public C9992x(Executor executor, C9965d dVar) {
        this.f39944a = executor;
        this.f39946c = dVar;
    }

    /* renamed from: b */
    public final void mo32530b(C9975i iVar) {
        synchronized (this.f39945b) {
            if (this.f39946c != null) {
                this.f39944a.execute(new C9991w(this, iVar));
            }
        }
    }
}
