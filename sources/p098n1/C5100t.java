package p098n1;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p084l1.C4902b;
import p084l1.C4907g;
import p084l1.C4908h;
import p140t1.C5502e;
import p147u1.C5704s;
import p147u1.C5706w;
import p165x1.C6034a;

/* renamed from: n1.t */
/* compiled from: TransportRuntime */
public class C5100t implements C5099s {

    /* renamed from: e */
    private static volatile C5101u f26550e;

    /* renamed from: a */
    private final C6034a f26551a;

    /* renamed from: b */
    private final C6034a f26552b;

    /* renamed from: c */
    private final C5502e f26553c;

    /* renamed from: d */
    private final C5704s f26554d;

    C5100t(C6034a aVar, C6034a aVar2, C5502e eVar, C5704s sVar, C5706w wVar) {
        this.f26551a = aVar;
        this.f26552b = aVar2;
        this.f26553c = eVar;
        this.f26554d = sVar;
        wVar.mo20102c();
    }

    /* renamed from: b */
    private C5085i m31905b(C5093n nVar) {
        return C5085i.m31846a().mo19007i(this.f26551a.mo20745a()).mo19009k(this.f26552b.mo20745a()).mo19008j(nVar.mo19015g()).mo19006h(new C5084h(nVar.mo19010b(), nVar.mo19056d())).mo19005g(nVar.mo19011c().mo18721a()).mo19002d();
    }

    /* renamed from: c */
    public static C5100t m31906c() {
        C5101u uVar = f26550e;
        if (uVar != null) {
            return uVar.mo19034b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set<C4902b> m31907d(C5082f fVar) {
        if (fVar instanceof C5083g) {
            return Collections.unmodifiableSet(((C5083g) fVar).mo7710a());
        }
        return Collections.singleton(C4902b.m31123b("proto"));
    }

    /* renamed from: f */
    public static void m31908f(Context context) {
        if (f26550e == null) {
            synchronized (C5100t.class) {
                if (f26550e == null) {
                    f26550e = C5079e.m31835f().mo19035a(context).build();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo19061a(C5093n nVar, C4908h hVar) {
        this.f26553c.mo19777a(nVar.mo19014f().mo19058f(nVar.mo19011c().mo18723c()), m31905b(nVar), hVar);
    }

    /* renamed from: e */
    public C5704s mo19062e() {
        return this.f26554d;
    }

    /* renamed from: g */
    public C4907g mo19063g(C5082f fVar) {
        return new C5097p(m31907d(fVar), C5095o.m31889a().mo19030b(fVar.mo7711b()).mo19031c(fVar.mo7709M0()).mo19029a(), this);
    }
}
