package p106o2;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import p106o2.C5183i0;
import p161w3.C5918a0;
import p161w3.C5929e;
import p177z1.C6272r1;
import p190b7.C6685q;

/* renamed from: o2.j */
/* compiled from: DefaultTsPayloadReaderFactory */
public final class C5188j implements C5183i0.C5186c {

    /* renamed from: a */
    private final int f26847a;

    /* renamed from: b */
    private final List<C6272r1> f26848b;

    public C5188j(int i) {
        this(i, C6685q.m38445x());
    }

    /* renamed from: c */
    private C5172d0 m32228c(C5183i0.C5185b bVar) {
        return new C5172d0(m32230e(bVar));
    }

    /* renamed from: d */
    private C5191k0 m32229d(C5183i0.C5185b bVar) {
        return new C5191k0(m32230e(bVar));
    }

    /* renamed from: e */
    private List<C6272r1> m32230e(C5183i0.C5185b bVar) {
        String str;
        int i;
        if (m32231f(32)) {
            return this.f26848b;
        }
        C5918a0 a0Var = new C5918a0(bVar.f26841d);
        List<C6272r1> list = this.f26848b;
        while (a0Var.mo20548a() > 0) {
            int C = a0Var.mo20534C();
            int e = a0Var.mo20552e() + a0Var.mo20534C();
            if (C == 134) {
                list = new ArrayList<>();
                int C2 = a0Var.mo20534C() & 31;
                for (int i2 = 0; i2 < C2; i2++) {
                    String z = a0Var.mo20573z(3);
                    int C3 = a0Var.mo20534C();
                    boolean z2 = true;
                    boolean z3 = (C3 & 128) != 0;
                    if (z3) {
                        i = C3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte C4 = (byte) a0Var.mo20534C();
                    a0Var.mo20547P(1);
                    List<byte[]> list2 = null;
                    if (z3) {
                        if ((C4 & 64) == 0) {
                            z2 = false;
                        }
                        list2 = C5929e.m34965b(z2);
                    }
                    list.add(new C6272r1.C6274b().mo21517e0(str).mo21508V(z).mo21492F(i).mo21506T(list2).mo21491E());
                }
            }
            a0Var.mo20546O(e);
        }
        return list;
    }

    /* renamed from: f */
    private boolean m32231f(int i) {
        return (i & this.f26847a) != 0;
    }

    /* renamed from: a */
    public C5183i0 mo19162a(int i, C5183i0.C5185b bVar) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new C5210w(new C5207t(bVar.f26839b));
            }
            if (i == 21) {
                return new C5210w(new C5205r());
            }
            if (i != 27) {
                if (i == 36) {
                    return new C5210w(new C5203q(m32228c(bVar)));
                }
                if (i == 89) {
                    return new C5210w(new C5192l(bVar.f26840c));
                }
                if (i != 138) {
                    if (i == 172) {
                        return new C5210w(new C5176f(bVar.f26839b));
                    }
                    if (i == 257) {
                        return new C5171c0(new C5209v("application/vnd.dvb.ait"));
                    }
                    if (i != 134) {
                        if (i != 135) {
                            switch (i) {
                                case 15:
                                    if (m32231f(2)) {
                                        return null;
                                    }
                                    return new C5210w(new C5182i(false, bVar.f26839b));
                                case 16:
                                    return new C5210w(new C5196o(m32229d(bVar)));
                                case 17:
                                    if (m32231f(2)) {
                                        return null;
                                    }
                                    return new C5210w(new C5206s(bVar.f26839b));
                                default:
                                    switch (i) {
                                        case 128:
                                            break;
                                        case 129:
                                            break;
                                        case 130:
                                            if (!m32231f(64)) {
                                                return null;
                                            }
                                            break;
                                        default:
                                            return null;
                                    }
                            }
                        }
                        return new C5210w(new C5170c(bVar.f26839b));
                    } else if (m32231f(16)) {
                        return null;
                    } else {
                        return new C5171c0(new C5209v("application/x-scte35"));
                    }
                }
                return new C5210w(new C5190k(bVar.f26839b));
            } else if (m32231f(4)) {
                return null;
            } else {
                return new C5210w(new C5199p(m32228c(bVar), m32231f(1), m32231f(8)));
            }
        }
        return new C5210w(new C5194n(m32229d(bVar)));
    }

    /* renamed from: b */
    public SparseArray<C5183i0> mo19163b() {
        return new SparseArray<>();
    }

    public C5188j(int i, List<C6272r1> list) {
        this.f26847a = i;
        this.f26848b = list;
    }
}
