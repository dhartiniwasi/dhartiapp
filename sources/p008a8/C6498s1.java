package p008a8;

import java.util.List;
import p211d8.C9888l;
import p211d8.C9902t;
import p220e8.C10007d;
import p220e8.C10008e;
import p220e8.C10009f;
import p220e8.C10015l;
import p220e8.C10016m;
import p220e8.C10018o;

/* renamed from: a8.s1 */
/* compiled from: UserData */
public class C6498s1 {

    /* renamed from: a */
    private final C9902t f30863a;

    /* renamed from: b */
    private final C10007d f30864b;

    /* renamed from: c */
    private final List<C10008e> f30865c;

    C6498s1(C9902t tVar, C10007d dVar, List<C10008e> list) {
        this.f30863a = tVar;
        this.f30864b = dVar;
        this.f30865c = list;
    }

    /* renamed from: a */
    public C10009f mo22064a(C9888l lVar, C10016m mVar) {
        C10007d dVar = this.f30864b;
        if (dVar == null) {
            return new C10018o(lVar, this.f30863a, mVar, this.f30865c);
        }
        return new C10015l(lVar, this.f30863a, dVar, mVar, this.f30865c);
    }
}
