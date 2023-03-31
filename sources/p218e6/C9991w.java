package p218e6;

/* renamed from: e6.w */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9991w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C9975i f39942a;

    /* renamed from: b */
    final /* synthetic */ C9992x f39943b;

    C9991w(C9992x xVar, C9975i iVar) {
        this.f39943b = xVar;
        this.f39942a = iVar;
    }

    public final void run() {
        synchronized (this.f39943b.f39945b) {
            C9992x xVar = this.f39943b;
            if (xVar.f39946c != null) {
                xVar.f39946c.mo283a(this.f39942a);
            }
        }
    }
}
