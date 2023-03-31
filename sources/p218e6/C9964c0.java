package p218e6;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: e6.c0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9964c0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C9975i f39899a;

    /* renamed from: b */
    final /* synthetic */ C9966d0 f39900b;

    C9964c0(C9966d0 d0Var, C9975i iVar) {
        this.f39900b = d0Var;
        this.f39899a = iVar;
    }

    public final void run() {
        try {
            C9975i a = this.f39900b.f39902b.mo21004a(this.f39899a.mo26358m());
            if (a == null) {
                this.f39900b.mo272d(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = C9979k.f39918b;
            a.mo26352g(executor, this.f39900b);
            a.mo26350e(executor, this.f39900b);
            a.mo26346a(executor, this.f39900b);
        } catch (C9971g e) {
            if (e.getCause() instanceof Exception) {
                this.f39900b.mo272d((Exception) e.getCause());
            } else {
                this.f39900b.mo272d(e);
            }
        } catch (CancellationException unused) {
            this.f39900b.mo32531c();
        } catch (Exception e2) {
            this.f39900b.mo272d(e2);
        }
    }
}
