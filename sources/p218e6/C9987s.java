package p218e6;

import java.util.concurrent.Executor;

/* renamed from: e6.s */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9987s implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C9975i f39933a;

    /* renamed from: b */
    final /* synthetic */ C9988t f39934b;

    C9987s(C9988t tVar, C9975i iVar) {
        this.f39934b = tVar;
        this.f39933a = iVar;
    }

    public final void run() {
        try {
            C9975i iVar = (C9975i) this.f39934b.f39936b.mo279a(this.f39933a);
            if (iVar == null) {
                this.f39934b.mo272d(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C9979k.f39918b;
            iVar.mo26352g(executor, this.f39934b);
            iVar.mo26350e(executor, this.f39934b);
            iVar.mo26346a(executor, this.f39934b);
        } catch (C9971g e) {
            if (e.getCause() instanceof Exception) {
                this.f39934b.f39937c.mo32537t((Exception) e.getCause());
            } else {
                this.f39934b.f39937c.mo32537t(e);
            }
        } catch (Exception e2) {
            this.f39934b.f39937c.mo32537t(e2);
        }
    }
}
