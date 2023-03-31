package p220e8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p211d8.C9888l;
import p211d8.C9898r;
import p211d8.C9899s;
import p211d8.C9902t;
import p246h7.C10428q;
import p405y8.C13088b0;

/* renamed from: e8.o */
/* compiled from: SetMutation */
public final class C10018o extends C10009f {

    /* renamed from: d */
    private final C9902t f39983d;

    public C10018o(C9888l lVar, C9902t tVar, C10016m mVar) {
        this(lVar, tVar, mVar, new ArrayList());
    }

    /* renamed from: a */
    public C10007d mo32581a(C9899s sVar, C10007d dVar, C10428q qVar) {
        mo32605n(sVar);
        if (!mo32599h().mo32633e(sVar)) {
            return dVar;
        }
        Map<C9898r, C13088b0> l = mo32603l(qVar, sVar);
        C9902t c = this.f39983d.clone();
        c.mo32435l(l);
        sVar.mo32418k(sVar.mo32381j(), c).mo32423t();
        return null;
    }

    /* renamed from: b */
    public void mo32582b(C9899s sVar, C10012i iVar) {
        mo32605n(sVar);
        C9902t c = this.f39983d.clone();
        c.mo32435l(mo32604m(sVar, iVar.mo32622a()));
        sVar.mo32418k(iVar.mo32623b(), c).mo32422s();
    }

    /* renamed from: e */
    public C10007d mo32583e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10018o.class != obj.getClass()) {
            return false;
        }
        C10018o oVar = (C10018o) obj;
        if (!mo32600i(oVar) || !this.f39983d.equals(oVar.f39983d) || !mo32597f().equals(oVar.mo32597f())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (mo32601j() * 31) + this.f39983d.hashCode();
    }

    /* renamed from: o */
    public C9902t mo32639o() {
        return this.f39983d;
    }

    public String toString() {
        return "SetMutation{" + mo32602k() + ", value=" + this.f39983d + "}";
    }

    public C10018o(C9888l lVar, C9902t tVar, C10016m mVar, List<C10008e> list) {
        super(lVar, mVar, list);
        this.f39983d = tVar;
    }
}
