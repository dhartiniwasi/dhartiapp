package p098n1;

import java.util.Set;
import p084l1.C4902b;
import p084l1.C4905e;
import p084l1.C4906f;
import p084l1.C4907g;

/* renamed from: n1.p */
/* compiled from: TransportFactoryImpl */
final class C5097p implements C4907g {

    /* renamed from: a */
    private final Set<C4902b> f26542a;

    /* renamed from: b */
    private final C5095o f26543b;

    /* renamed from: c */
    private final C5099s f26544c;

    C5097p(Set<C4902b> set, C5095o oVar, C5099s sVar) {
        this.f26542a = set;
        this.f26543b = oVar;
        this.f26544c = sVar;
    }

    /* renamed from: a */
    public <T> C4906f<T> mo18733a(String str, Class<T> cls, C4902b bVar, C4905e<T, byte[]> eVar) {
        if (this.f26542a.contains(bVar)) {
            return new C5098r(this.f26543b, str, bVar, eVar, this.f26544c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f26542a}));
    }
}
