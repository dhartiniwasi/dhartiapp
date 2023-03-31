package p049g0;

import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p049g0.C4298a;

/* renamed from: g0.d */
/* compiled from: CreationExtras.kt */
public final class C4303d extends C4298a {
    public C4303d() {
        this((C4298a) null, 1, (C11665g) null);
    }

    public C4303d(C4298a aVar) {
        C11669k.m56787e(aVar, "initialExtras");
        mo17711b().putAll(aVar.mo17711b());
    }

    /* renamed from: a */
    public <T> T mo17710a(C4298a.C4300b<T> bVar) {
        C11669k.m56787e(bVar, "key");
        return mo17711b().get(bVar);
    }

    /* renamed from: c */
    public final <T> void mo17714c(C4298a.C4300b<T> bVar, T t) {
        C11669k.m56787e(bVar, "key");
        mo17711b().put(bVar, t);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4303d(C4298a aVar, int i, C11665g gVar) {
        this((i & 1) != 0 ? C4298a.C4299a.f24176b : aVar);
    }
}
