package p218e6;

import java.util.concurrent.Executor;

/* renamed from: e6.z */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9994z implements C9968e0 {

    /* renamed from: a */
    private final Executor f39949a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Object f39950b = new Object();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C9967e f39951c;

    public C9994z(Executor executor, C9967e eVar) {
        this.f39949a = executor;
        this.f39951c = eVar;
    }

    /* renamed from: b */
    public final void mo32530b(C9975i iVar) {
        if (!iVar.mo26362q() && !iVar.mo26360o()) {
            synchronized (this.f39950b) {
                if (this.f39951c != null) {
                    this.f39949a.execute(new C9993y(this, iVar));
                }
            }
        }
    }
}
