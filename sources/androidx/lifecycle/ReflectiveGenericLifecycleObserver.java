package androidx.lifecycle;

import androidx.lifecycle.C1179b;
import androidx.lifecycle.C1208j;

@Deprecated
class ReflectiveGenericLifecycleObserver implements C1216l {

    /* renamed from: a */
    private final Object f3274a;

    /* renamed from: b */
    private final C1179b.C1180a f3275b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f3274a = obj;
        this.f3275b = C1179b.f3285c.mo4365c(obj.getClass());
    }

    /* renamed from: c */
    public void mo752c(C1220n nVar, C1208j.C1210b bVar) {
        this.f3275b.mo4367a(nVar, bVar, this.f3274a);
    }
}
