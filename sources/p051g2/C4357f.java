package p051g2;

import p161w3.C5918a0;
import p190b7.C6685q;
import p190b7.C6695s0;

/* renamed from: g2.f */
/* compiled from: ListChunk */
final class C4357f implements C4349a {

    /* renamed from: a */
    public final C6685q<C4349a> f24304a;

    /* renamed from: b */
    private final int f24305b;

    private C4357f(int i, C6685q<C4349a> qVar) {
        this.f24305b = i;
        this.f24304a = qVar;
    }

    /* renamed from: a */
    private static C4349a m28999a(int i, int i2, C5918a0 a0Var) {
        switch (i) {
            case 1718776947:
                return C4358g.m29005d(i2, a0Var);
            case 1751742049:
                return C4354c.m28979b(a0Var);
            case 1752331379:
                return C4355d.m28981c(a0Var);
            case 1852994675:
                return C4359h.m29007a(a0Var);
            default:
                return null;
        }
    }

    /* renamed from: c */
    public static C4357f m29000c(int i, C5918a0 a0Var) {
        C4349a aVar;
        C6685q.C6686a aVar2 = new C6685q.C6686a();
        int f = a0Var.mo20553f();
        int i2 = -2;
        while (a0Var.mo20548a() > 8) {
            int p = a0Var.mo20563p();
            int e = a0Var.mo20552e() + a0Var.mo20563p();
            a0Var.mo20545N(e);
            if (p == 1414744396) {
                aVar = m29000c(a0Var.mo20563p(), a0Var);
            } else {
                aVar = m28999a(p, i2, a0Var);
            }
            if (aVar != null) {
                if (aVar.getType() == 1752331379) {
                    i2 = ((C4355d) aVar).mo17783b();
                }
                aVar2.mo22506a(aVar);
            }
            a0Var.mo20546O(e);
            a0Var.mo20545N(f);
        }
        return new C4357f(i, aVar2.mo22547h());
    }

    /* renamed from: b */
    public <T extends C4349a> T mo17796b(Class<T> cls) {
        C6695s0<C4349a> l = this.f24304a.iterator();
        while (l.hasNext()) {
            T t = (C4349a) l.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    public int getType() {
        return this.f24305b;
    }
}
