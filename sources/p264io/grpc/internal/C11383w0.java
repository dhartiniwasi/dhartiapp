package p264io.grpc.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: io.grpc.internal.w0 */
/* compiled from: InUseStateAggregator */
public abstract class C11383w0<T> {

    /* renamed from: a */
    private final Set<T> f43655a = Collections.newSetFromMap(new IdentityHashMap());

    /* renamed from: a */
    public final boolean mo35375a(Object... objArr) {
        for (Object contains : objArr) {
            if (this.f43655a.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo35118b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo35119c();

    /* renamed from: d */
    public final boolean mo35376d() {
        return !this.f43655a.isEmpty();
    }

    /* renamed from: e */
    public final void mo35377e(T t, boolean z) {
        int size = this.f43655a.size();
        if (z) {
            this.f43655a.add(t);
            if (size == 0) {
                mo35118b();
            }
        } else if (this.f43655a.remove(t) && size == 1) {
            mo35119c();
        }
    }
}
