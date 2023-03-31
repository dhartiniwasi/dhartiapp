package p147u1;

import java.util.concurrent.Executor;
import p098n1.C5095o;
import p153v1.C5761d;
import p159w1.C5889b;

/* renamed from: u1.w */
/* compiled from: WorkInitializer */
public class C5706w {

    /* renamed from: a */
    private final Executor f28488a;

    /* renamed from: b */
    private final C5761d f28489b;

    /* renamed from: c */
    private final C5708y f28490c;

    /* renamed from: d */
    private final C5889b f28491d;

    C5706w(Executor executor, C5761d dVar, C5708y yVar, C5889b bVar) {
        this.f28488a = executor;
        this.f28489b = dVar;
        this.f28490c = yVar;
        this.f28491d = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Object m34034d() {
        for (C5095o b : this.f28489b.mo20266e0()) {
            this.f28490c.mo20074b(b, 1);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m34035e() {
        this.f28491d.mo20278f(new C12663v(this));
    }

    /* renamed from: c */
    public void mo20102c() {
        this.f28488a.execute(new C12662u(this));
    }
}
