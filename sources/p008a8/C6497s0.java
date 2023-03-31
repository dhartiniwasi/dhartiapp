package p008a8;

import java.util.ArrayList;
import java.util.List;
import p008a8.C6489q;
import p211d8.C9885i;
import p211d8.C9888l;
import p211d8.C9907y;
import p247h8.C10432b;
import p405y8.C13088b0;

/* renamed from: a8.s0 */
/* compiled from: KeyFieldInFilter */
public class C6497s0 extends C6489q {

    /* renamed from: d */
    private final List<C9888l> f30862d;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C6497s0(p211d8.C9898r r2, p405y8.C13088b0 r3) {
        /*
            r1 = this;
            a8.q$b r0 = p008a8.C6489q.C6491b.IN
            r1.<init>(r2, r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f30862d = r2
            java.util.List r3 = m37934l(r0, r3)
            r2.addAll(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p008a8.C6497s0.<init>(d8.r, y8.b0):void");
    }

    /* renamed from: l */
    static List<C9888l> m37934l(C6489q.C6491b bVar, C13088b0 b0Var) {
        C10432b.m52648d(bVar == C6489q.C6491b.IN || bVar == C6489q.C6491b.NOT_IN, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        C10432b.m52648d(C9907y.m50825t(b0Var), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (C13088b0 next : b0Var.mo38112m0().mo38104g()) {
            boolean B = C9907y.m50799B(next);
            C10432b.m52648d(B, "Comparing on key with " + bVar.toString() + ", but an array value was not a ReferenceValue", new Object[0]);
            arrayList.add(C9888l.m50696k(next.mo38119u0()));
        }
        return arrayList;
    }

    /* renamed from: e */
    public boolean mo21910e(C9885i iVar) {
        return this.f30862d.contains(iVar.getKey());
    }
}
