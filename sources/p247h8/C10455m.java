package p247h8;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* renamed from: h8.m */
/* compiled from: BackgroundQueue */
public class C10455m implements Executor {

    /* renamed from: a */
    private Semaphore f41420a = new Semaphore(0);

    /* renamed from: b */
    private int f41421b = 0;

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m52728d(Runnable runnable) {
        runnable.run();
        this.f41420a.release();
    }

    /* renamed from: c */
    public void mo33539c() {
        try {
            this.f41420a.acquire(this.f41421b);
            this.f41421b = 0;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C10432b.m52645a("Interrupted while waiting for background task", e);
        }
    }

    public void execute(Runnable runnable) {
        this.f41421b++;
        C10460p.f41439c.execute(new C10454l(this, runnable));
    }
}
