package p211d8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p008a8.C6450a1;
import p008a8.C6469g1;
import p008a8.C6489q;
import p008a8.C6494r;
import p211d8.C9893q;
import p247h8.C10432b;

/* renamed from: d8.x */
/* compiled from: TargetIndexMatcher */
public class C9906x {

    /* renamed from: a */
    private final String f39753a;

    /* renamed from: b */
    private C6489q f39754b;

    /* renamed from: c */
    private final List<C6489q> f39755c;

    /* renamed from: d */
    private final List<C6450a1> f39756d;

    public C9906x(C6469g1 g1Var) {
        String str;
        if (g1Var.mo21934d() != null) {
            str = g1Var.mo21934d();
        } else {
            str = g1Var.mo21944n().mo32354n();
        }
        this.f39753a = str;
        this.f39756d = g1Var.mo21943m();
        this.f39754b = null;
        this.f39755c = new ArrayList();
        Iterator<C6494r> it = g1Var.mo21937h().iterator();
        while (it.hasNext()) {
            C6489q qVar = (C6489q) it.next();
            if (qVar.mo22041j()) {
                C6489q qVar2 = this.f39754b;
                C10432b.m52648d(qVar2 == null || qVar2.mo22037g().equals(qVar.mo22037g()), "Only a single inequality is supported", new Object[0]);
                this.f39754b = qVar;
            } else {
                this.f39755c.add(qVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m50794a(C9893q.C9896c cVar) {
        for (C6489q b : this.f39755c) {
            if (m50795b(b, cVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m50795b(C6489q qVar, C9893q.C9896c cVar) {
        if (qVar == null || !qVar.mo22037g().equals(cVar.mo32341c())) {
            return false;
        }
        if (cVar.mo32344j().equals(C9893q.C9896c.C9897a.CONTAINS) == (qVar.mo22038h().equals(C6489q.C6491b.ARRAY_CONTAINS) || qVar.mo22038h().equals(C6489q.C6491b.ARRAY_CONTAINS_ANY))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m50796c(C6450a1 a1Var, C9893q.C9896c cVar) {
        if (!a1Var.mo21865c().equals(cVar.mo32341c())) {
            return false;
        }
        if ((!cVar.mo32344j().equals(C9893q.C9896c.C9897a.ASCENDING) || !a1Var.mo21864b().equals(C6450a1.C6451a.ASCENDING)) && (!cVar.mo32344j().equals(C9893q.C9896c.C9897a.DESCENDING) || !a1Var.mo21864b().equals(C6450a1.C6451a.DESCENDING))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo32444d(p211d8.C9893q r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.mo32323d()
            java.lang.String r1 = r6.f39753a
            boolean r0 = r0.equals(r1)
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r3 = "Collection IDs do not match"
            p247h8.C10432b.m52648d(r0, r3, r2)
            d8.q$c r0 = r7.mo32408c()
            if (r0 == 0) goto L_0x001f
            boolean r0 = r6.m50794a(r0)
            if (r0 != 0) goto L_0x001f
            return r1
        L_0x001f:
            java.util.List<a8.a1> r0 = r6.f39756d
            java.util.Iterator r0 = r0.iterator()
            java.util.List r7 = r7.mo32409e()
            r2 = 0
        L_0x002a:
            int r3 = r7.size()
            if (r2 >= r3) goto L_0x0040
            java.lang.Object r3 = r7.get(r2)
            d8.q$c r3 = (p211d8.C9893q.C9896c) r3
            boolean r3 = r6.m50794a(r3)
            if (r3 != 0) goto L_0x003d
            goto L_0x0040
        L_0x003d:
            int r2 = r2 + 1
            goto L_0x002a
        L_0x0040:
            int r3 = r7.size()
            r4 = 1
            if (r2 != r3) goto L_0x0048
            return r4
        L_0x0048:
            a8.q r3 = r6.f39754b
            if (r3 == 0) goto L_0x006b
            java.lang.Object r3 = r7.get(r2)
            d8.q$c r3 = (p211d8.C9893q.C9896c) r3
            a8.q r5 = r6.f39754b
            boolean r5 = r6.m50795b(r5, r3)
            if (r5 == 0) goto L_0x006a
            java.lang.Object r5 = r0.next()
            a8.a1 r5 = (p008a8.C6450a1) r5
            boolean r3 = r6.m50796c(r5, r3)
            if (r3 != 0) goto L_0x0067
            goto L_0x006a
        L_0x0067:
            int r2 = r2 + 1
            goto L_0x006b
        L_0x006a:
            return r1
        L_0x006b:
            int r3 = r7.size()
            if (r2 >= r3) goto L_0x008a
            java.lang.Object r3 = r7.get(r2)
            d8.q$c r3 = (p211d8.C9893q.C9896c) r3
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0089
            java.lang.Object r5 = r0.next()
            a8.a1 r5 = (p008a8.C6450a1) r5
            boolean r3 = r6.m50796c(r5, r3)
            if (r3 != 0) goto L_0x0067
        L_0x0089:
            return r1
        L_0x008a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p211d8.C9906x.mo32444d(d8.q):boolean");
    }
}
