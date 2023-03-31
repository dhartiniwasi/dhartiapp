package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.v1 */
/* compiled from: UnknownFieldSchema */
abstract class C8245v1<T, B> {
    C8245v1() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo27325a(B b, int i, int i2);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo27326b(B b, int i, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo27327c(B b, int i, T t);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo27328d(B b, int i, C8153i iVar);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo27329e(B b, int i, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract B mo27330f(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract T mo27331g(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public abstract int mo27332h(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract int mo27333i(T t);

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract void mo27334j(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract T mo27335k(T t, T t2);

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000d, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27336l(B r3, com.google.protobuf.C8190l1 r4) throws java.io.IOException {
        /*
            r2 = this;
        L_0x0000:
            int r0 = r4.mo27040A()
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == r1) goto L_0x000f
            boolean r0 = r2.mo27337m(r3, r4)
            if (r0 != 0) goto L_0x0000
        L_0x000f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C8245v1.mo27336l(java.lang.Object, com.google.protobuf.l1):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final boolean mo27337m(B b, C8190l1 l1Var) throws IOException {
        int v0 = l1Var.mo27080v0();
        int a = C8105b2.m44580a(v0);
        int b2 = C8105b2.m44581b(v0);
        if (b2 == 0) {
            mo27329e(b, a, l1Var.mo27052M());
            return true;
        } else if (b2 == 1) {
            mo27326b(b, a, l1Var.mo27058c());
            return true;
        } else if (b2 == 2) {
            mo27328d(b, a, l1Var.mo27045F());
            return true;
        } else if (b2 == 3) {
            Object n = mo27338n();
            int c = C8105b2.m44582c(a, 4);
            mo27336l(n, l1Var);
            if (c == l1Var.mo27080v0()) {
                mo27327c(b, a, mo27342r(n));
                return true;
            }
            throw C8135e0.m44683b();
        } else if (b2 == 4) {
            return false;
        } else {
            if (b2 == 5) {
                mo27325a(b, a, l1Var.mo27065j());
                return true;
            }
            throw C8135e0.m44686e();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public abstract B mo27338n();

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public abstract void mo27339o(Object obj, B b);

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public abstract void mo27340p(Object obj, T t);

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public abstract boolean mo27341q(C8190l1 l1Var);

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public abstract T mo27342r(B b);

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public abstract void mo27343s(T t, C8116c2 c2Var) throws IOException;

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public abstract void mo27344t(T t, C8116c2 c2Var) throws IOException;
}
