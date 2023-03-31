package p025c8;

import java.util.HashMap;
import java.util.Map;
import p247h8.C10432b;
import p247h8.C10473y;
import p404y7.C13073j;

/* renamed from: c8.w0 */
/* compiled from: MemoryPersistence */
public final class C6828w0 extends C6778c1 {

    /* renamed from: c */
    private final Map<C13073j, C6825u0> f31443c = new HashMap();

    /* renamed from: d */
    private final Map<C13073j, C6820r0> f31444d = new HashMap();

    /* renamed from: e */
    private final C6823t0 f31445e = new C6823t0();

    /* renamed from: f */
    private final C6836y0 f31446f = new C6836y0(this);

    /* renamed from: g */
    private final C6817q0 f31447g = new C6817q0();

    /* renamed from: h */
    private final C6830x0 f31448h = new C6830x0();

    /* renamed from: i */
    private C6793g1 f31449i;

    /* renamed from: j */
    private boolean f31450j;

    private C6828w0() {
    }

    /* renamed from: n */
    public static C6828w0 m39223n() {
        C6828w0 w0Var = new C6828w0();
        w0Var.m39224s(new C6821s0(w0Var));
        return w0Var;
    }

    /* renamed from: s */
    private void m39224s(C6793g1 g1Var) {
        this.f31449i = g1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C6773a mo22740a() {
        return this.f31447g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C6775b mo22741b(C13073j jVar) {
        C6820r0 r0Var = this.f31444d.get(jVar);
        if (r0Var != null) {
            return r0Var;
        }
        C6820r0 r0Var2 = new C6820r0();
        this.f31444d.put(jVar, r0Var2);
        return r0Var2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C6837z0 mo22743d(C13073j jVar, C6805l lVar) {
        C6825u0 u0Var = this.f31443c.get(jVar);
        if (u0Var != null) {
            return u0Var;
        }
        C6825u0 u0Var2 = new C6825u0(this, jVar);
        this.f31443c.put(jVar, u0Var2);
        return u0Var2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C6774a1 mo22744e() {
        return new C6827v0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C6793g1 mo22745f() {
        return this.f31449i;
    }

    /* renamed from: i */
    public boolean mo22748i() {
        return this.f31450j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public <T> T mo22749j(String str, C10473y<T> yVar) {
        this.f31449i.mo22786d();
        try {
            return yVar.get();
        } finally {
            this.f31449i.mo22784b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo22750k(String str, Runnable runnable) {
        this.f31449i.mo22786d();
        try {
            runnable.run();
        } finally {
            this.f31449i.mo22784b();
        }
    }

    /* renamed from: l */
    public void mo22751l() {
        C10432b.m52648d(this.f31450j, "MemoryPersistence shutdown without start", new Object[0]);
        this.f31450j = false;
    }

    /* renamed from: m */
    public void mo22752m() {
        C10432b.m52648d(!this.f31450j, "MemoryPersistence double-started!", new Object[0]);
        this.f31450j = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public C6823t0 mo22742c(C13073j jVar) {
        return this.f31445e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public Iterable<C6825u0> mo22904p() {
        return this.f31443c.values();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C6830x0 mo22746g() {
        return this.f31448h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public C6836y0 mo22747h() {
        return this.f31446f;
    }
}
