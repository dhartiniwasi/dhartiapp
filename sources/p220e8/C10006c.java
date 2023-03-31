package p220e8;

import p211d8.C9888l;
import p211d8.C9899s;
import p246h7.C10428q;
import p247h8.C10432b;

/* renamed from: e8.c */
/* compiled from: DeleteMutation */
public final class C10006c extends C10009f {
    public C10006c(C9888l lVar, C10016m mVar) {
        super(lVar, mVar);
    }

    /* renamed from: a */
    public C10007d mo32581a(C9899s sVar, C10007d dVar, C10428q qVar) {
        mo32605n(sVar);
        if (!mo32599h().mo32633e(sVar)) {
            return dVar;
        }
        sVar.mo32419l(sVar.mo32381j()).mo32423t();
        return null;
    }

    /* renamed from: b */
    public void mo32582b(C9899s sVar, C10012i iVar) {
        mo32605n(sVar);
        C10432b.m52648d(iVar.mo32622a().isEmpty(), "Transform results received by DeleteMutation.", new Object[0]);
        sVar.mo32419l(iVar.mo32623b()).mo32422s();
    }

    /* renamed from: e */
    public C10007d mo32583e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10006c.class != obj.getClass()) {
            return false;
        }
        return mo32600i((C10006c) obj);
    }

    public int hashCode() {
        return mo32601j();
    }

    public String toString() {
        return "DeleteMutation{" + mo32602k() + "}";
    }
}
