package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.x3 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7245x3 {

    /* renamed from: a */
    final C7257y f32179a;

    /* renamed from: b */
    final C7262y4 f32180b;

    /* renamed from: c */
    final C7262y4 f32181c;

    /* renamed from: d */
    final C6892b8 f32182d;

    public C7245x3() {
        C7257y yVar = new C7257y();
        this.f32179a = yVar;
        C7262y4 y4Var = new C7262y4((C7262y4) null, yVar);
        this.f32181c = y4Var;
        this.f32180b = y4Var.mo24006a();
        C6892b8 b8Var = new C6892b8();
        this.f32182d = b8Var;
        y4Var.mo24012g("require", new C6933df(b8Var));
        b8Var.mo23126a("internal.platform", C7228w2.f32161a);
        y4Var.mo24012g("runtime.counter", new C7001i(Double.valueOf(0.0d)));
    }

    /* renamed from: a */
    public final C7129q mo23978a(C7262y4 y4Var, C7247x5... x5VarArr) {
        C7129q qVar = C7129q.f31955m;
        for (C7247x5 a : x5VarArr) {
            qVar = C6874a7.m39469a(a);
            C7279z5.m41177c(this.f32181c);
            if ((qVar instanceof C7145r) || (qVar instanceof C7113p)) {
                qVar = this.f32179a.mo24004a(y4Var, qVar);
            }
        }
        return qVar;
    }
}
