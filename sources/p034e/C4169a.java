package p034e;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: e.a */
/* compiled from: ContextAwareHelper */
public final class C4169a {

    /* renamed from: a */
    private final Set<C4170b> f23427a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private volatile Context f23428b;

    /* renamed from: a */
    public void mo17497a(C4170b bVar) {
        if (this.f23428b != null) {
            bVar.mo761a(this.f23428b);
        }
        this.f23427a.add(bVar);
    }

    /* renamed from: b */
    public void mo17498b() {
        this.f23428b = null;
    }

    /* renamed from: c */
    public void mo17499c(Context context) {
        this.f23428b = context;
        for (C4170b a : this.f23427a) {
            a.mo761a(context);
        }
    }

    /* renamed from: d */
    public Context mo17500d() {
        return this.f23428b;
    }

    /* renamed from: e */
    public void mo17501e(C4170b bVar) {
        this.f23427a.remove(bVar);
    }
}
