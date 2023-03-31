package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.activity.g */
/* compiled from: OnBackPressedCallback */
public abstract class C0245g {

    /* renamed from: a */
    private boolean f581a;

    /* renamed from: b */
    private CopyOnWriteArrayList<C0239a> f582b = new CopyOnWriteArrayList<>();

    public C0245g(boolean z) {
        this.f581a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo769a(C0239a aVar) {
        this.f582b.add(aVar);
    }

    /* renamed from: b */
    public abstract void mo770b();

    /* renamed from: c */
    public final boolean mo771c() {
        return this.f581a;
    }

    /* renamed from: d */
    public final void mo772d() {
        Iterator<C0239a> it = this.f582b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo773e(C0239a aVar) {
        this.f582b.remove(aVar);
    }

    /* renamed from: f */
    public final void mo774f(boolean z) {
        this.f581a = z;
    }
}
