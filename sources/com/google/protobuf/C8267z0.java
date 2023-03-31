package com.google.protobuf;

import com.google.protobuf.C8105b2;
import com.google.protobuf.C8148h0;
import com.google.protobuf.C8240v;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.protobuf.z0 */
/* compiled from: MessageSetSchema */
final class C8267z0<T> implements C8202n1<T> {

    /* renamed from: a */
    private final C8243v0 f35213a;

    /* renamed from: b */
    private final C8245v1<?, ?> f35214b;

    /* renamed from: c */
    private final boolean f35215c;

    /* renamed from: d */
    private final C8223r<?> f35216d;

    private C8267z0(C8245v1<?, ?> v1Var, C8223r<?> rVar, C8243v0 v0Var) {
        this.f35214b = v1Var;
        this.f35215c = rVar.mo27280e(v0Var);
        this.f35216d = rVar;
        this.f35213a = v0Var;
    }

    /* renamed from: k */
    private <UT, UB> int m45963k(C8245v1<UT, UB> v1Var, T t) {
        return v1Var.mo27333i(v1Var.mo27331g(t));
    }

    /* renamed from: l */
    private <UT, UB, ET extends C8240v.C8242b<ET>> void m45964l(C8245v1<UT, UB> v1Var, C8223r<ET> rVar, T t, C8190l1 l1Var, C8210q qVar) throws IOException {
        UB f = v1Var.mo27330f(t);
        C8240v<ET> d = rVar.mo27279d(t);
        do {
            try {
                if (l1Var.mo27040A() == Integer.MAX_VALUE) {
                    v1Var.mo27339o(t, f);
                    return;
                }
            } finally {
                v1Var.mo27339o(t, f);
            }
        } while (m45966n(l1Var, qVar, rVar, d, v1Var, f));
    }

    /* renamed from: m */
    static <T> C8267z0<T> m45965m(C8245v1<?, ?> v1Var, C8223r<?> rVar, C8243v0 v0Var) {
        return new C8267z0<>(v1Var, rVar, v0Var);
    }

    /* renamed from: n */
    private <UT, UB, ET extends C8240v.C8242b<ET>> boolean m45966n(C8190l1 l1Var, C8210q qVar, C8223r<ET> rVar, C8240v<ET> vVar, C8245v1<UT, UB> v1Var, UB ub) throws IOException {
        int v0 = l1Var.mo27080v0();
        if (v0 == C8105b2.f34806a) {
            int i = 0;
            Object obj = null;
            C8153i iVar = null;
            while (l1Var.mo27040A() != Integer.MAX_VALUE) {
                int v02 = l1Var.mo27080v0();
                if (v02 == C8105b2.f34808c) {
                    i = l1Var.mo27070o();
                    obj = rVar.mo27277b(qVar, this.f35213a, i);
                } else if (v02 == C8105b2.f34809d) {
                    if (obj != null) {
                        rVar.mo27283h(l1Var, obj, qVar, vVar);
                    } else {
                        iVar = l1Var.mo27045F();
                    }
                } else if (!l1Var.mo27048I()) {
                    break;
                }
            }
            if (l1Var.mo27080v0() == C8105b2.f34807b) {
                if (iVar != null) {
                    if (obj != null) {
                        rVar.mo27284i(iVar, obj, qVar, vVar);
                    } else {
                        v1Var.mo27328d(ub, i, iVar);
                    }
                }
                return true;
            }
            throw C8135e0.m44683b();
        } else if (C8105b2.m44581b(v0) != 2) {
            return l1Var.mo27048I();
        } else {
            Object b = rVar.mo27277b(qVar, this.f35213a, C8105b2.m44580a(v0));
            if (b == null) {
                return v1Var.mo27337m(ub, l1Var);
            }
            rVar.mo27283h(l1Var, b, qVar, vVar);
            return true;
        }
    }

    /* renamed from: o */
    private <UT, UB> void m45967o(C8245v1<UT, UB> v1Var, T t, C8116c2 c2Var) throws IOException {
        v1Var.mo27343s(v1Var.mo27331g(t), c2Var);
    }

    /* renamed from: a */
    public void mo27197a(T t, T t2) {
        C8209p1.m45495G(this.f35214b, t, t2);
        if (this.f35215c) {
            C8209p1.m45493E(this.f35216d, t, t2);
        }
    }

    /* renamed from: b */
    public void mo27198b(T t, C8116c2 c2Var) throws IOException {
        Iterator<Map.Entry<?, Object>> t2 = this.f35216d.mo27278c(t).mo27307t();
        while (t2.hasNext()) {
            Map.Entry next = t2.next();
            C8240v.C8242b bVar = (C8240v.C8242b) next.getKey();
            if (bVar.mo27315l() != C8105b2.C8112c.MESSAGE || bVar.mo27312g() || bVar.mo27316m()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            } else if (next instanceof C8148h0.C8150b) {
                c2Var.mo26850e(bVar.mo27311f(), ((C8148h0.C8150b) next).mo26922a().mo26959e());
            } else {
                c2Var.mo26850e(bVar.mo27311f(), next.getValue());
            }
        }
        m45967o(this.f35214b, t, c2Var);
    }

    /* renamed from: c */
    public void mo27199c(T t) {
        this.f35214b.mo27334j(t);
        this.f35216d.mo27281f(t);
    }

    /* renamed from: d */
    public final boolean mo27200d(T t) {
        return this.f35216d.mo27278c(t).mo27306p();
    }

    /* renamed from: e */
    public void mo27201e(T t, C8190l1 l1Var, C8210q qVar) throws IOException {
        m45964l(this.f35214b, this.f35216d, t, l1Var, qVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.google.protobuf.z$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo27202f(T r11, byte[] r12, int r13, int r14, com.google.protobuf.C8139f.C8141b r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            com.google.protobuf.z r0 = (com.google.protobuf.C8260z) r0
            com.google.protobuf.w1 r1 = r0.unknownFields
            com.google.protobuf.w1 r2 = com.google.protobuf.C8250w1.m45718c()
            if (r1 != r2) goto L_0x0011
            com.google.protobuf.w1 r1 = com.google.protobuf.C8250w1.m45722k()
            r0.unknownFields = r1
        L_0x0011:
            com.google.protobuf.z$c r11 = (com.google.protobuf.C8260z.C8263c) r11
            com.google.protobuf.v r11 = r11.mo27446a0()
            r0 = 0
            r2 = r0
        L_0x0019:
            if (r13 >= r14) goto L_0x00d7
            int r4 = com.google.protobuf.C8139f.m44708I(r12, r13, r15)
            int r13 = r15.f34872a
            int r3 = com.google.protobuf.C8105b2.f34806a
            r5 = 2
            if (r13 == r3) goto L_0x006b
            int r3 = com.google.protobuf.C8105b2.m44581b(r13)
            if (r3 != r5) goto L_0x0066
            com.google.protobuf.r<?> r2 = r10.f35216d
            com.google.protobuf.q r3 = r15.f34875d
            com.google.protobuf.v0 r5 = r10.f35213a
            int r6 = com.google.protobuf.C8105b2.m44580a(r13)
            java.lang.Object r2 = r2.mo27277b(r3, r5, r6)
            r8 = r2
            com.google.protobuf.z$e r8 = (com.google.protobuf.C8260z.C8265e) r8
            if (r8 == 0) goto L_0x005b
            com.google.protobuf.i1 r13 = com.google.protobuf.C8166i1.m44835a()
            com.google.protobuf.v0 r2 = r8.mo27451b()
            java.lang.Class r2 = r2.getClass()
            com.google.protobuf.n1 r13 = r13.mo26961c(r2)
            int r13 = com.google.protobuf.C8139f.m44731p(r13, r12, r4, r14, r15)
            com.google.protobuf.z$d r2 = r8.f35204b
            java.lang.Object r3 = r15.f34874c
            r11.mo27310y(r2, r3)
            goto L_0x0064
        L_0x005b:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = com.google.protobuf.C8139f.m44706G(r2, r3, r4, r5, r6, r7)
        L_0x0064:
            r2 = r8
            goto L_0x0019
        L_0x0066:
            int r13 = com.google.protobuf.C8139f.m44715P(r13, r12, r4, r14, r15)
            goto L_0x0019
        L_0x006b:
            r13 = 0
            r3 = r0
        L_0x006d:
            if (r4 >= r14) goto L_0x00cb
            int r4 = com.google.protobuf.C8139f.m44708I(r12, r4, r15)
            int r6 = r15.f34872a
            int r7 = com.google.protobuf.C8105b2.m44580a(r6)
            int r8 = com.google.protobuf.C8105b2.m44581b(r6)
            if (r7 == r5) goto L_0x00ac
            r9 = 3
            if (r7 == r9) goto L_0x0083
            goto L_0x00c1
        L_0x0083:
            if (r2 == 0) goto L_0x00a1
            com.google.protobuf.i1 r6 = com.google.protobuf.C8166i1.m44835a()
            com.google.protobuf.v0 r7 = r2.mo27451b()
            java.lang.Class r7 = r7.getClass()
            com.google.protobuf.n1 r6 = r6.mo26961c(r7)
            int r4 = com.google.protobuf.C8139f.m44731p(r6, r12, r4, r14, r15)
            com.google.protobuf.z$d r6 = r2.f35204b
            java.lang.Object r7 = r15.f34874c
            r11.mo27310y(r6, r7)
            goto L_0x006d
        L_0x00a1:
            if (r8 != r5) goto L_0x00c1
            int r4 = com.google.protobuf.C8139f.m44717b(r12, r4, r15)
            java.lang.Object r3 = r15.f34874c
            com.google.protobuf.i r3 = (com.google.protobuf.C8153i) r3
            goto L_0x006d
        L_0x00ac:
            if (r8 != 0) goto L_0x00c1
            int r4 = com.google.protobuf.C8139f.m44708I(r12, r4, r15)
            int r13 = r15.f34872a
            com.google.protobuf.r<?> r2 = r10.f35216d
            com.google.protobuf.q r6 = r15.f34875d
            com.google.protobuf.v0 r7 = r10.f35213a
            java.lang.Object r2 = r2.mo27277b(r6, r7, r13)
            com.google.protobuf.z$e r2 = (com.google.protobuf.C8260z.C8265e) r2
            goto L_0x006d
        L_0x00c1:
            int r7 = com.google.protobuf.C8105b2.f34807b
            if (r6 != r7) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r4 = com.google.protobuf.C8139f.m44715P(r6, r12, r4, r14, r15)
            goto L_0x006d
        L_0x00cb:
            if (r3 == 0) goto L_0x00d4
            int r13 = com.google.protobuf.C8105b2.m44582c(r13, r5)
            r1.mo27356n(r13, r3)
        L_0x00d4:
            r13 = r4
            goto L_0x0019
        L_0x00d7:
            if (r13 != r14) goto L_0x00da
            return
        L_0x00da:
            com.google.protobuf.e0 r11 = com.google.protobuf.C8135e0.m44689h()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8267z0.mo27202f(java.lang.Object, byte[], int, int, com.google.protobuf.f$b):void");
    }

    /* renamed from: g */
    public boolean mo27203g(T t, T t2) {
        if (!this.f35214b.mo27331g(t).equals(this.f35214b.mo27331g(t2))) {
            return false;
        }
        if (this.f35215c) {
            return this.f35216d.mo27278c(t).equals(this.f35216d.mo27278c(t2));
        }
        return true;
    }

    /* renamed from: h */
    public int mo27204h(T t) {
        int k = m45963k(this.f35214b, t) + 0;
        return this.f35215c ? k + this.f35216d.mo27278c(t).mo27302j() : k;
    }

    /* renamed from: i */
    public T mo27205i() {
        C8243v0 v0Var = this.f35213a;
        if (v0Var instanceof C8260z) {
            return ((C8260z) v0Var).mo27421Q();
        }
        return v0Var.mo27320i().mo27323U0();
    }

    /* renamed from: j */
    public int mo27206j(T t) {
        int hashCode = this.f35214b.mo27331g(t).hashCode();
        return this.f35215c ? (hashCode * 53) + this.f35216d.mo27278c(t).hashCode() : hashCode;
    }
}
