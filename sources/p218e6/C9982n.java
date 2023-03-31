package p218e6;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: e6.n */
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
final class C9982n<T> implements C9983o<T> {

    /* renamed from: a */
    private final CountDownLatch f39919a = new CountDownLatch(1);

    /* synthetic */ C9982n(C9981m mVar) {
    }

    /* renamed from: a */
    public final void mo277a(T t) {
        this.f39919a.countDown();
    }

    /* renamed from: b */
    public final void mo32548b() throws InterruptedException {
        this.f39919a.await();
    }

    /* renamed from: c */
    public final void mo32531c() {
        this.f39919a.countDown();
    }

    /* renamed from: d */
    public final void mo272d(Exception exc) {
        this.f39919a.countDown();
    }

    /* renamed from: e */
    public final boolean mo32549e(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f39919a.await(j, timeUnit);
    }
}
