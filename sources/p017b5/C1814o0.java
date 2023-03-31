package p017b5;

import com.google.android.gms.common.api.internal.LifecycleCallback;

/* renamed from: b5.o0 */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class C1814o0 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LifecycleCallback f5352a;

    /* renamed from: b */
    final /* synthetic */ String f5353b;

    /* renamed from: c */
    final /* synthetic */ C1816p0 f5354c;

    C1814o0(C1816p0 p0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f5354c = p0Var;
        this.f5352a = lifecycleCallback;
        this.f5353b = str;
    }

    public final void run() {
        C1816p0 p0Var = this.f5354c;
        if (p0Var.f5358b > 0) {
            this.f5352a.mo8003f(p0Var.f5359c != null ? p0Var.f5359c.getBundle(this.f5353b) : null);
        }
        if (this.f5354c.f5358b >= 2) {
            this.f5352a.mo8007j();
        }
        if (this.f5354c.f5358b >= 3) {
            this.f5352a.mo8005h();
        }
        if (this.f5354c.f5358b >= 4) {
            this.f5352a.mo8008k();
        }
        if (this.f5354c.f5358b >= 5) {
            this.f5352a.mo8004g();
        }
    }
}
