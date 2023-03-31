package p218e6;

/* renamed from: e6.a0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9960a0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C9975i f39894a;

    /* renamed from: b */
    final /* synthetic */ C9962b0 f39895b;

    C9960a0(C9962b0 b0Var, C9975i iVar) {
        this.f39895b = b0Var;
        this.f39894a = iVar;
    }

    public final void run() {
        synchronized (this.f39895b.f39897b) {
            C9962b0 b0Var = this.f39895b;
            if (b0Var.f39898c != null) {
                b0Var.f39898c.mo277a(this.f39894a.mo26358m());
            }
        }
    }
}
