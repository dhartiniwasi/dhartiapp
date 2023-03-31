package androidx.lifecycle;

import androidx.lifecycle.C1196h0;
import kotlin.jvm.internal.C11669k;
import p049g0.C4298a;

/* renamed from: androidx.lifecycle.i0 */
/* compiled from: ViewModelProvider.kt */
public final /* synthetic */ class C1207i0 {
    static {
        C1196h0.C1200b.C1201a aVar = C1196h0.C1200b.f3322a;
    }

    /* renamed from: a */
    public static C1194g0 m5419a(C1196h0.C1200b bVar, Class cls) {
        C11669k.m56787e(cls, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    /* renamed from: b */
    public static C1194g0 m5420b(C1196h0.C1200b bVar, Class cls, C4298a aVar) {
        C11669k.m56787e(cls, "modelClass");
        C11669k.m56787e(aVar, "extras");
        return bVar.mo4232a(cls);
    }
}
