package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.j0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7018j0 extends C7241x {
    protected C7018j0() {
        this.f32175a.add(C7082n0.FOR_IN);
        this.f32175a.add(C7082n0.FOR_IN_CONST);
        this.f32175a.add(C7082n0.FOR_IN_LET);
        this.f32175a.add(C7082n0.FOR_LET);
        this.f32175a.add(C7082n0.FOR_OF);
        this.f32175a.add(C7082n0.FOR_OF_CONST);
        this.f32175a.add(C7082n0.FOR_OF_LET);
        this.f32175a.add(C7082n0.WHILE);
    }

    /* renamed from: c */
    private static C7129q m40231c(C6986h0 h0Var, Iterator it, C7129q qVar) {
        if (it != null) {
            while (it.hasNext()) {
                C7129q c = h0Var.mo23391a((C7129q) it.next()).mo24008c((C6951f) qVar);
                if (c instanceof C6985h) {
                    C6985h hVar = (C6985h) c;
                    if ("break".equals(hVar.mo23458d())) {
                        return C7129q.f31955m;
                    }
                    if ("return".equals(hVar.mo23458d())) {
                        return hVar;
                    }
                }
            }
        }
        return C7129q.f31955m;
    }

    /* renamed from: d */
    private static C7129q m40232d(C6986h0 h0Var, C7129q qVar, C7129q qVar2) {
        return m40231c(h0Var, qVar.mo23370Z(), qVar2);
    }

    /* renamed from: e */
    private static C7129q m40233e(C6986h0 h0Var, C7129q qVar, C7129q qVar2) {
        if (qVar instanceof Iterable) {
            return m40231c(h0Var, ((Iterable) qVar).iterator(), qVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* renamed from: a */
    public final C7129q mo22991a(String str, C7262y4 y4Var, List list) {
        C7082n0 n0Var = C7082n0.ADD;
        int ordinal = C7279z5.m41179e(str).ordinal();
        if (ordinal != 65) {
            switch (ordinal) {
                case 26:
                    C7279z5.m41182h(C7082n0.FOR_IN.name(), 3, list);
                    if (list.get(0) instanceof C7193u) {
                        String V = ((C7129q) list.get(0)).mo23369V();
                        return m40232d(new C7002i0(y4Var, V), y4Var.mo24007b((C7129q) list.get(1)), y4Var.mo24007b((C7129q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                case 27:
                    C7279z5.m41182h(C7082n0.FOR_IN_CONST.name(), 3, list);
                    if (list.get(0) instanceof C7193u) {
                        String V2 = ((C7129q) list.get(0)).mo23369V();
                        return m40232d(new C6952f0(y4Var, V2), y4Var.mo24007b((C7129q) list.get(1)), y4Var.mo24007b((C7129q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                case 28:
                    C7279z5.m41182h(C7082n0.FOR_IN_LET.name(), 3, list);
                    if (list.get(0) instanceof C7193u) {
                        String V3 = ((C7129q) list.get(0)).mo23369V();
                        return m40232d(new C6969g0(y4Var, V3), y4Var.mo24007b((C7129q) list.get(1)), y4Var.mo24007b((C7129q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                case 29:
                    C7279z5.m41182h(C7082n0.FOR_LET.name(), 4, list);
                    C7129q b = y4Var.mo24007b((C7129q) list.get(0));
                    if (b instanceof C6951f) {
                        C6951f fVar = (C6951f) b;
                        C7129q qVar = (C7129q) list.get(1);
                        C7129q qVar2 = (C7129q) list.get(2);
                        C7129q b2 = y4Var.mo24007b((C7129q) list.get(3));
                        C7262y4 a = y4Var.mo24006a();
                        for (int i = 0; i < fVar.mo23379l(); i++) {
                            String V4 = fVar.mo23380o(i).mo23369V();
                            a.mo24012g(V4, y4Var.mo24009d(V4));
                        }
                        while (y4Var.mo24007b(qVar).mo23372c().booleanValue()) {
                            C7129q c = y4Var.mo24008c((C6951f) b2);
                            if (c instanceof C6985h) {
                                C6985h hVar = (C6985h) c;
                                if ("break".equals(hVar.mo23458d())) {
                                    return C7129q.f31955m;
                                }
                                if ("return".equals(hVar.mo23458d())) {
                                    return hVar;
                                }
                            }
                            C7262y4 a2 = y4Var.mo24006a();
                            for (int i2 = 0; i2 < fVar.mo23379l(); i2++) {
                                String V5 = fVar.mo23380o(i2).mo23369V();
                                a2.mo24012g(V5, a.mo24009d(V5));
                            }
                            a2.mo24007b(qVar2);
                            a = a2;
                        }
                        return C7129q.f31955m;
                    }
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                case 30:
                    C7279z5.m41182h(C7082n0.FOR_OF.name(), 3, list);
                    if (list.get(0) instanceof C7193u) {
                        String V6 = ((C7129q) list.get(0)).mo23369V();
                        return m40233e(new C7002i0(y4Var, V6), y4Var.mo24007b((C7129q) list.get(1)), y4Var.mo24007b((C7129q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                case 31:
                    C7279z5.m41182h(C7082n0.FOR_OF_CONST.name(), 3, list);
                    if (list.get(0) instanceof C7193u) {
                        String V7 = ((C7129q) list.get(0)).mo23369V();
                        return m40233e(new C6952f0(y4Var, V7), y4Var.mo24007b((C7129q) list.get(1)), y4Var.mo24007b((C7129q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                case 32:
                    C7279z5.m41182h(C7082n0.FOR_OF_LET.name(), 3, list);
                    if (list.get(0) instanceof C7193u) {
                        String V8 = ((C7129q) list.get(0)).mo23369V();
                        return m40233e(new C6969g0(y4Var, V8), y4Var.mo24007b((C7129q) list.get(1)), y4Var.mo24007b((C7129q) list.get(2)));
                    }
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                default:
                    return super.mo23977b(str);
            }
        } else {
            C7279z5.m41182h(C7082n0.WHILE.name(), 4, list);
            C7129q qVar3 = (C7129q) list.get(0);
            C7129q qVar4 = (C7129q) list.get(1);
            C7129q b3 = y4Var.mo24007b((C7129q) list.get(3));
            if (y4Var.mo24007b((C7129q) list.get(2)).mo23372c().booleanValue()) {
                C7129q c2 = y4Var.mo24008c((C6951f) b3);
                if (c2 instanceof C6985h) {
                    C6985h hVar2 = (C6985h) c2;
                    if ("break".equals(hVar2.mo23458d())) {
                        return C7129q.f31955m;
                    }
                    if ("return".equals(hVar2.mo23458d())) {
                        return hVar2;
                    }
                }
            }
            while (y4Var.mo24007b(qVar3).mo23372c().booleanValue()) {
                C7129q c3 = y4Var.mo24008c((C6951f) b3);
                if (c3 instanceof C6985h) {
                    C6985h hVar3 = (C6985h) c3;
                    if ("break".equals(hVar3.mo23458d())) {
                        return C7129q.f31955m;
                    }
                    if ("return".equals(hVar3.mo23458d())) {
                        return hVar3;
                    }
                }
                y4Var.mo24007b(qVar4);
            }
            return C7129q.f31955m;
        }
    }
}
