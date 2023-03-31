package p218e6;

/* renamed from: e6.q */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9985q implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C9975i f39928a;

    /* renamed from: b */
    final /* synthetic */ C9986r f39929b;

    C9985q(C9986r rVar, C9975i iVar) {
        this.f39929b = rVar;
        this.f39928a = iVar;
    }

    public final void run() {
        if (this.f39928a.mo26360o()) {
            this.f39929b.f39932c.mo32539v();
            return;
        }
        try {
            this.f39929b.f39932c.mo32538u(this.f39929b.f39931b.mo279a(this.f39928a));
        } catch (C9971g e) {
            if (e.getCause() instanceof Exception) {
                this.f39929b.f39932c.mo32537t((Exception) e.getCause());
            } else {
                this.f39929b.f39932c.mo32537t(e);
            }
        } catch (Exception e2) {
            this.f39929b.f39932c.mo32537t(e2);
        }
    }
}
