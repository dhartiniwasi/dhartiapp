package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.C1208j;

/* renamed from: androidx.lifecycle.f0 */
/* compiled from: ServiceLifecycleDispatcher */
public class C1191f0 {

    /* renamed from: a */
    private final C1222o f3305a;

    /* renamed from: b */
    private final Handler f3306b = new Handler();

    /* renamed from: c */
    private C1192a f3307c;

    /* renamed from: androidx.lifecycle.f0$a */
    /* compiled from: ServiceLifecycleDispatcher */
    static class C1192a implements Runnable {

        /* renamed from: a */
        private final C1222o f3308a;

        /* renamed from: b */
        final C1208j.C1210b f3309b;

        /* renamed from: c */
        private boolean f3310c = false;

        C1192a(C1222o oVar, C1208j.C1210b bVar) {
            this.f3308a = oVar;
            this.f3309b = bVar;
        }

        public void run() {
            if (!this.f3310c) {
                this.f3308a.mo4408h(this.f3309b);
                this.f3310c = true;
            }
        }
    }

    public C1191f0(C1220n nVar) {
        this.f3305a = new C1222o(nVar);
    }

    /* renamed from: f */
    private void m5390f(C1208j.C1210b bVar) {
        C1192a aVar = this.f3307c;
        if (aVar != null) {
            aVar.run();
        }
        C1192a aVar2 = new C1192a(this.f3305a, bVar);
        this.f3307c = aVar2;
        this.f3306b.postAtFrontOfQueue(aVar2);
    }

    /* renamed from: a */
    public C1208j mo4385a() {
        return this.f3305a;
    }

    /* renamed from: b */
    public void mo4386b() {
        m5390f(C1208j.C1210b.ON_START);
    }

    /* renamed from: c */
    public void mo4387c() {
        m5390f(C1208j.C1210b.ON_CREATE);
    }

    /* renamed from: d */
    public void mo4388d() {
        m5390f(C1208j.C1210b.ON_STOP);
        m5390f(C1208j.C1210b.ON_DESTROY);
    }

    /* renamed from: e */
    public void mo4389e() {
        m5390f(C1208j.C1210b.ON_START);
    }
}
