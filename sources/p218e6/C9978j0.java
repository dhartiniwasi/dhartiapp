package p218e6;

import java.util.concurrent.Callable;

/* renamed from: e6.j0 */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9978j0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C9976i0 f39915a;

    /* renamed from: b */
    final /* synthetic */ Callable f39916b;

    C9978j0(C9976i0 i0Var, Callable callable) {
        this.f39915a = i0Var;
        this.f39916b = callable;
    }

    public final void run() {
        try {
            this.f39915a.mo32538u(this.f39916b.call());
        } catch (Exception e) {
            this.f39915a.mo32537t(e);
        } catch (Throwable th) {
            this.f39915a.mo32537t(new RuntimeException(th));
        }
    }
}
