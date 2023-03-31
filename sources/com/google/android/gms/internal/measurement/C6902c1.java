package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.c1 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6902c1 {

    /* renamed from: a */
    final C7245x3 f31601a;

    /* renamed from: b */
    C7262y4 f31602b;

    /* renamed from: c */
    final C6900c f31603c = new C6900c();

    /* renamed from: d */
    private final C6984gf f31604d = new C6984gf();

    public C6902c1() {
        C7245x3 x3Var = new C7245x3();
        this.f31601a = x3Var;
        this.f31602b = x3Var.f32180b.mo24006a();
        x3Var.f32182d.mo23126a("internal.registerCallback", new C6866a(this));
        x3Var.f32182d.mo23126a("internal.eventLogger", new C6884b0(this));
    }

    /* renamed from: a */
    public final C6900c mo23140a() {
        return this.f31603c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ C7017j mo23141b() throws Exception {
        return new C6916cf(this.f31604d);
    }

    /* renamed from: c */
    public final void mo23142c(C7167s5 s5Var) throws C6903c2 {
        C7017j jVar;
        try {
            this.f31602b = this.f31601a.f32180b.mo24006a();
            if (!(this.f31601a.mo23978a(this.f31602b, (C7247x5[]) s5Var.mo23872E().toArray(new C7247x5[0])) instanceof C6985h)) {
                for (C7135q5 q5Var : s5Var.mo23871C().mo23724F()) {
                    List E = q5Var.mo23766E();
                    String D = q5Var.mo23765D();
                    Iterator it = E.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C7129q a = this.f31601a.mo23978a(this.f31602b, (C7247x5) it.next());
                            if (a instanceof C7081n) {
                                C7262y4 y4Var = this.f31602b;
                                if (!y4Var.mo24013h(D)) {
                                    jVar = null;
                                } else {
                                    C7129q d = y4Var.mo24009d(D);
                                    if (d instanceof C7017j) {
                                        jVar = (C7017j) d;
                                    } else {
                                        throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(D)));
                                    }
                                }
                                if (jVar != null) {
                                    jVar.mo23023a(this.f31602b, Collections.singletonList(a));
                                } else {
                                    throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(D)));
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new C6903c2(th);
        }
    }

    /* renamed from: d */
    public final void mo23143d(String str, Callable callable) {
        this.f31601a.f32182d.mo23126a(str, callable);
    }

    /* renamed from: e */
    public final boolean mo23144e(C6883b bVar) throws C6903c2 {
        try {
            this.f31603c.mo23136d(bVar);
            this.f31601a.f32181c.mo24012g("runtime.counter", new C7001i(Double.valueOf(0.0d)));
            this.f31604d.mo23456b(this.f31602b.mo24006a(), this.f31603c);
            return mo23146g() || mo23145f();
        } catch (Throwable th) {
            throw new C6903c2(th);
        }
    }

    /* renamed from: f */
    public final boolean mo23145f() {
        return !this.f31603c.mo23134c().isEmpty();
    }

    /* renamed from: g */
    public final boolean mo23146g() {
        C6900c cVar = this.f31603c;
        return !cVar.mo23133b().equals(cVar.mo23132a());
    }
}
