package p032d4;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: d4.c */
/* compiled from: com.google.android.gms:play-services-ads-identifier@@17.1.0 */
final class C4079c extends Thread {

    /* renamed from: a */
    private final WeakReference<C4076a> f23229a;

    /* renamed from: b */
    private final long f23230b;

    /* renamed from: c */
    final CountDownLatch f23231c = new CountDownLatch(1);

    /* renamed from: d */
    boolean f23232d = false;

    public C4079c(C4076a aVar, long j) {
        this.f23229a = new WeakReference<>(aVar);
        this.f23230b = j;
        start();
    }

    /* renamed from: a */
    private final void m28021a() {
        C4076a aVar = (C4076a) this.f23229a.get();
        if (aVar != null) {
            aVar.mo17304f();
            this.f23232d = true;
        }
    }

    public final void run() {
        try {
            if (!this.f23231c.await(this.f23230b, TimeUnit.MILLISECONDS)) {
                m28021a();
            }
        } catch (InterruptedException unused) {
            m28021a();
        }
    }
}
