package p025c8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p008a8.C6469g1;
import p211d8.C9888l;
import p211d8.C9905w;
import p320p7.C12130e;

/* renamed from: c8.y0 */
/* compiled from: MemoryTargetCache */
final class C6836y0 implements C6788e4 {

    /* renamed from: a */
    private final Map<C6469g1, C6792f4> f31476a = new HashMap();

    /* renamed from: b */
    private final C6794h1 f31477b = new C6794h1();

    /* renamed from: c */
    private int f31478c;

    /* renamed from: d */
    private C9905w f31479d = C9905w.f39751b;

    /* renamed from: e */
    private long f31480e = 0;

    /* renamed from: f */
    private final C6828w0 f31481f;

    C6836y0(C6828w0 w0Var) {
        this.f31481f = w0Var;
    }

    /* renamed from: a */
    public void mo22754a(C6792f4 f4Var) {
        mo22757d(f4Var);
    }

    /* renamed from: b */
    public void mo22755b(C12130e<C9888l> eVar, int i) {
        this.f31477b.mo22818g(eVar, i);
        C6793g1 f = this.f31481f.mo22745f();
        Iterator<C9888l> it = eVar.iterator();
        while (it.hasNext()) {
            f.mo22795m(it.next());
        }
    }

    /* renamed from: c */
    public int mo22756c() {
        return this.f31478c;
    }

    /* renamed from: d */
    public void mo22757d(C6792f4 f4Var) {
        this.f31476a.put(f4Var.mo22806f(), f4Var);
        int g = f4Var.mo22807g();
        if (g > this.f31478c) {
            this.f31478c = g;
        }
        if (f4Var.mo22803d() > this.f31480e) {
            this.f31480e = f4Var.mo22803d();
        }
    }

    /* renamed from: e */
    public C12130e<C9888l> mo22758e(int i) {
        return this.f31477b.mo22816d(i);
    }

    /* renamed from: f */
    public C9905w mo22759f() {
        return this.f31479d;
    }

    /* renamed from: g */
    public void mo22760g(int i) {
        this.f31477b.mo22819h(i);
    }

    /* renamed from: h */
    public C6792f4 mo22761h(C6469g1 g1Var) {
        return this.f31476a.get(g1Var);
    }

    /* renamed from: i */
    public void mo22762i(C9905w wVar) {
        this.f31479d = wVar;
    }

    /* renamed from: j */
    public void mo22763j(C12130e<C9888l> eVar, int i) {
        this.f31477b.mo22814b(eVar, i);
        C6793g1 f = this.f31481f.mo22745f();
        Iterator<C9888l> it = eVar.iterator();
        while (it.hasNext()) {
            f.mo22794l(it.next());
        }
    }

    /* renamed from: k */
    public boolean mo22934k(C9888l lVar) {
        return this.f31477b.mo22815c(lVar);
    }

    /* renamed from: l */
    public void mo22935l(C6792f4 f4Var) {
        this.f31476a.remove(f4Var.mo22806f());
        this.f31477b.mo22819h(f4Var.mo22807g());
    }
}
