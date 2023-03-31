package p017b5;

import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: b5.q0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class C1818q0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LifecycleCallback f5361a;

    /* renamed from: b */
    final /* synthetic */ String f5362b;

    /* renamed from: c */
    final /* synthetic */ C1820r0 f5363c;

    C1818q0(C1820r0 r0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f5363c = r0Var;
        this.f5361a = lifecycleCallback;
        this.f5362b = str;
    }

    public final void run() {
        C1820r0 r0Var = this.f5363c;
        if (r0Var.f5366r0 > 0) {
            this.f5361a.mo8003f(r0Var.f5367s0 != null ? r0Var.f5367s0.getBundle(this.f5362b) : null);
        }
        if (this.f5363c.f5366r0 >= 2) {
            this.f5361a.mo8007j();
        }
        if (this.f5363c.f5366r0 >= 3) {
            this.f5361a.mo8005h();
        }
        if (this.f5363c.f5366r0 >= 4) {
            this.f5361a.mo8008k();
        }
        if (this.f5363c.f5366r0 >= 5) {
            this.f5361a.mo8004g();
        }
    }
}
