package p049g0;

import androidx.lifecycle.C1194g0;
import androidx.lifecycle.C1196h0;
import androidx.lifecycle.C1207i0;
import kotlin.jvm.internal.C11669k;

/* renamed from: g0.b */
/* compiled from: InitializerViewModelFactory.kt */
public final class C4301b implements C1196h0.C1200b {

    /* renamed from: b */
    private final C4305f<?>[] f24177b;

    public C4301b(C4305f<?>... fVarArr) {
        C11669k.m56787e(fVarArr, "initializers");
        this.f24177b = fVarArr;
    }

    /* renamed from: a */
    public /* synthetic */ C1194g0 mo4232a(Class cls) {
        return C1207i0.m5419a(this, cls);
    }

    /* renamed from: b */
    public <T extends C1194g0> T mo4233b(Class<T> cls, C4298a aVar) {
        C11669k.m56787e(cls, "modelClass");
        C11669k.m56787e(aVar, "extras");
        T t = null;
        for (C4305f<?> fVar : this.f24177b) {
            if (C11669k.m56783a(fVar.mo17715a(), cls)) {
                T invoke = fVar.mo17716b().invoke(aVar);
                t = invoke instanceof C1194g0 ? (C1194g0) invoke : null;
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
