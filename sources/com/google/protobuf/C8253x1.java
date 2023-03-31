package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.x1 */
/* compiled from: UnknownFieldSetLiteSchema */
class C8253x1 extends C8245v1<C8250w1, C8250w1> {
    C8253x1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public C8250w1 mo27331g(Object obj) {
        return ((C8260z) obj).unknownFields;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public int mo27332h(C8250w1 w1Var) {
        return w1Var.mo27349d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public int mo27333i(C8250w1 w1Var) {
        return w1Var.mo27350e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public C8250w1 mo27335k(C8250w1 w1Var, C8250w1 w1Var2) {
        if (C8250w1.m45718c().equals(w1Var2)) {
            return w1Var;
        }
        if (C8250w1.m45718c().equals(w1Var)) {
            return C8250w1.m45721j(w1Var, w1Var2);
        }
        return w1Var.mo27354i(w1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public C8250w1 mo27338n() {
        return C8250w1.m45722k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo27339o(Object obj, C8250w1 w1Var) {
        mo27340p(obj, w1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo27340p(Object obj, C8250w1 w1Var) {
        ((C8260z) obj).unknownFields = w1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public C8250w1 mo27342r(C8250w1 w1Var) {
        w1Var.mo27352h();
        return w1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo27343s(C8250w1 w1Var, C8116c2 c2Var) throws IOException {
        w1Var.mo27357p(c2Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo27344t(C8250w1 w1Var, C8116c2 c2Var) throws IOException {
        w1Var.mo27358r(c2Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo27334j(Object obj) {
        mo27331g(obj).mo27352h();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo27341q(C8190l1 l1Var) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo27325a(C8250w1 w1Var, int i, int i2) {
        w1Var.mo27356n(C8105b2.m44582c(i, 5), Integer.valueOf(i2));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo27326b(C8250w1 w1Var, int i, long j) {
        w1Var.mo27356n(C8105b2.m44582c(i, 1), Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo27327c(C8250w1 w1Var, int i, C8250w1 w1Var2) {
        w1Var.mo27356n(C8105b2.m44582c(i, 3), w1Var2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo27328d(C8250w1 w1Var, int i, C8153i iVar) {
        w1Var.mo27356n(C8105b2.m44582c(i, 2), iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo27329e(C8250w1 w1Var, int i, long j) {
        w1Var.mo27356n(C8105b2.m44582c(i, 0), Long.valueOf(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public C8250w1 mo27330f(Object obj) {
        C8250w1 A = mo27331g(obj);
        if (A != C8250w1.m45718c()) {
            return A;
        }
        C8250w1 k = C8250w1.m45722k();
        mo27340p(obj, k);
        return k;
    }
}
