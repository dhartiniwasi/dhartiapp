package androidx.activity;

import androidx.lifecycle.C1208j;
import androidx.lifecycle.C1216l;
import androidx.lifecycle.C1220n;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f567a;

    /* renamed from: b */
    final ArrayDeque<C0245g> f568b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements C1216l, C0239a {

        /* renamed from: a */
        private final C1208j f569a;

        /* renamed from: b */
        private final C0245g f570b;

        /* renamed from: c */
        private C0239a f571c;

        LifecycleOnBackPressedCancellable(C1208j jVar, C0245g gVar) {
            this.f569a = jVar;
            this.f570b = gVar;
            jVar.mo4399a(this);
        }

        /* renamed from: c */
        public void mo752c(C1220n nVar, C1208j.C1210b bVar) {
            if (bVar == C1208j.C1210b.ON_START) {
                this.f571c = OnBackPressedDispatcher.this.mo758b(this.f570b);
            } else if (bVar == C1208j.C1210b.ON_STOP) {
                C0239a aVar = this.f571c;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (bVar == C1208j.C1210b.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            this.f569a.mo4401c(this);
            this.f570b.mo773e(this);
            C0239a aVar = this.f571c;
            if (aVar != null) {
                aVar.cancel();
                this.f571c = null;
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    private class C0238a implements C0239a {

        /* renamed from: a */
        private final C0245g f573a;

        C0238a(C0245g gVar) {
            this.f573a = gVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f568b.remove(this.f573a);
            this.f573a.mo773e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f567a = runnable;
    }

    /* renamed from: a */
    public void mo757a(C1220n nVar, C0245g gVar) {
        C1208j lifecycle = nVar.getLifecycle();
        if (lifecycle.mo4400b() != C1208j.C1211c.DESTROYED) {
            gVar.mo769a(new LifecycleOnBackPressedCancellable(lifecycle, gVar));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0239a mo758b(C0245g gVar) {
        this.f568b.add(gVar);
        C0238a aVar = new C0238a(gVar);
        gVar.mo769a(aVar);
        return aVar;
    }

    /* renamed from: c */
    public void mo759c() {
        Iterator<C0245g> descendingIterator = this.f568b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0245g next = descendingIterator.next();
            if (next.mo771c()) {
                next.mo770b();
                return;
            }
        }
        Runnable runnable = this.f567a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
