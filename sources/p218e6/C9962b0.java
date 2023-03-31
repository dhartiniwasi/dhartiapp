package p218e6;

import java.util.concurrent.Executor;

/* renamed from: e6.b0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9962b0 implements C9968e0 {

    /* renamed from: a */
    private final Executor f39896a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f39897b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C9969f f39898c;

    public C9962b0(Executor executor, C9969f fVar) {
        this.f39896a = executor;
        this.f39898c = fVar;
    }

    /* renamed from: b */
    public final void mo32530b(C9975i iVar) {
        if (iVar.mo26362q()) {
            synchronized (this.f39897b) {
                if (this.f39898c != null) {
                    this.f39896a.execute(new C9960a0(this, iVar));
                }
            }
        }
    }
}
