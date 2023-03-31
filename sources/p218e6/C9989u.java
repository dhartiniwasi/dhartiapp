package p218e6;

/* renamed from: e6.u */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9989u implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C9990v f39938a;

    C9989u(C9990v vVar) {
        this.f39938a = vVar;
    }

    public final void run() {
        synchronized (this.f39938a.f39940b) {
            C9990v vVar = this.f39938a;
            if (vVar.f39941c != null) {
                vVar.f39941c.mo32531c();
            }
        }
    }
}
