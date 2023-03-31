package p008a8;

import p008a8.C6489q;
import p211d8.C9885i;
import p211d8.C9888l;
import p211d8.C9898r;
import p211d8.C9907y;
import p247h8.C10432b;
import p405y8.C13088b0;

/* renamed from: a8.r0 */
/* compiled from: KeyFieldFilter */
public class C6495r0 extends C6489q {

    /* renamed from: d */
    private final C9888l f30858d = C9888l.m50696k(mo22040i().mo38119u0());

    C6495r0(C9898r rVar, C6489q.C6491b bVar, C13088b0 b0Var) {
        super(rVar, bVar, b0Var);
        C10432b.m52648d(C9907y.m50799B(b0Var), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
    }

    /* renamed from: e */
    public boolean mo21910e(C9885i iVar) {
        return mo22042k(iVar.getKey().compareTo(this.f30858d));
    }
}
