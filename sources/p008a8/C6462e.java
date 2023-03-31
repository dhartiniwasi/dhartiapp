package p008a8;

import p008a8.C6489q;
import p211d8.C9885i;
import p211d8.C9898r;
import p211d8.C9907y;
import p247h8.C10432b;
import p405y8.C13088b0;

/* renamed from: a8.e */
/* compiled from: ArrayContainsAnyFilter */
public class C6462e extends C6489q {
    C6462e(C9898r rVar, C13088b0 b0Var) {
        super(rVar, C6489q.C6491b.ARRAY_CONTAINS_ANY, b0Var);
        C10432b.m52648d(C9907y.m50825t(b0Var), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
    }

    /* renamed from: e */
    public boolean mo21910e(C9885i iVar) {
        C13088b0 g = iVar.mo32376g(mo22037g());
        if (!C9907y.m50825t(g)) {
            return false;
        }
        for (C13088b0 p : g.mo38112m0().mo38104g()) {
            if (C9907y.m50821p(mo22040i().mo38112m0(), p)) {
                return true;
            }
        }
        return false;
    }
}
