package com.google.android.gms.internal.measurement;

import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.m0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7066m0 extends C7241x {
    protected C7066m0() {
        this.f32175a.add(C7082n0.ASSIGN);
        this.f32175a.add(C7082n0.CONST);
        this.f32175a.add(C7082n0.CREATE_ARRAY);
        this.f32175a.add(C7082n0.CREATE_OBJECT);
        this.f32175a.add(C7082n0.EXPRESSION_LIST);
        this.f32175a.add(C7082n0.GET);
        this.f32175a.add(C7082n0.GET_INDEX);
        this.f32175a.add(C7082n0.GET_PROPERTY);
        this.f32175a.add(C7082n0.NULL);
        this.f32175a.add(C7082n0.SET_PROPERTY);
        this.f32175a.add(C7082n0.TYPEOF);
        this.f32175a.add(C7082n0.UNDEFINED);
        this.f32175a.add(C7082n0.VAR);
    }

    /* renamed from: a */
    public final C7129q mo22991a(String str, C7262y4 y4Var, List list) {
        String str2;
        C7082n0 n0Var = C7082n0.ADD;
        int ordinal = C7279z5.m41179e(str).ordinal();
        int i = 0;
        if (ordinal == 3) {
            C7279z5.m41182h(C7082n0.ASSIGN.name(), 2, list);
            C7129q b = y4Var.mo24007b((C7129q) list.get(0));
            if (!(b instanceof C7193u)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{b.getClass().getCanonicalName()}));
            } else if (y4Var.mo24013h(b.mo23369V())) {
                C7129q b2 = y4Var.mo24007b((C7129q) list.get(1));
                y4Var.mo24012g(b.mo23369V(), b2);
                return b2;
            } else {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{b.mo23369V()}));
            }
        } else if (ordinal == 14) {
            C7279z5.m41183i(C7082n0.CONST.name(), 2, list);
            if (list.size() % 2 == 0) {
                int i2 = 0;
                while (i2 < list.size() - 1) {
                    C7129q b3 = y4Var.mo24007b((C7129q) list.get(i2));
                    if (b3 instanceof C7193u) {
                        y4Var.mo24011f(b3.mo23369V(), y4Var.mo24007b((C7129q) list.get(i2 + 1)));
                        i2 += 2;
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{b3.getClass().getCanonicalName()}));
                    }
                }
                return C7129q.f31955m;
            }
            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
        } else if (ordinal == 24) {
            C7279z5.m41183i(C7082n0.EXPRESSION_LIST.name(), 1, list);
            C7129q qVar = C7129q.f31955m;
            while (i < list.size()) {
                qVar = y4Var.mo24007b((C7129q) list.get(i));
                if (!(qVar instanceof C6985h)) {
                    i++;
                } else {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
            }
            return qVar;
        } else if (ordinal == 33) {
            C7279z5.m41182h(C7082n0.GET.name(), 1, list);
            C7129q b4 = y4Var.mo24007b((C7129q) list.get(0));
            if (b4 instanceof C7193u) {
                return y4Var.mo24009d(b4.mo23369V());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{b4.getClass().getCanonicalName()}));
        } else if (ordinal == 49) {
            C7279z5.m41182h(C7082n0.NULL.name(), 0, list);
            return C7129q.f31956n;
        } else if (ordinal == 58) {
            C7279z5.m41182h(C7082n0.SET_PROPERTY.name(), 3, list);
            C7129q b5 = y4Var.mo24007b((C7129q) list.get(0));
            C7129q b6 = y4Var.mo24007b((C7129q) list.get(1));
            C7129q b7 = y4Var.mo24007b((C7129q) list.get(2));
            if (b5 == C7129q.f31955m || b5 == C7129q.f31956n) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{b6.mo23369V(), b5.mo23369V()}));
            }
            if ((b5 instanceof C6951f) && (b6 instanceof C7001i)) {
                ((C6951f) b5).mo23389x(b6.mo23368U().intValue(), b7);
            } else if (b5 instanceof C7065m) {
                ((C7065m) b5).mo23376i(b6.mo23369V(), b7);
            }
            return b7;
        } else if (ordinal != 17) {
            if (ordinal != 18) {
                if (ordinal == 35 || ordinal == 36) {
                    C7279z5.m41182h(C7082n0.GET_PROPERTY.name(), 2, list);
                    C7129q b8 = y4Var.mo24007b((C7129q) list.get(0));
                    C7129q b9 = y4Var.mo24007b((C7129q) list.get(1));
                    if ((b8 instanceof C6951f) && C7279z5.m41185k(b9)) {
                        return ((C6951f) b8).mo23380o(b9.mo23368U().intValue());
                    }
                    if (b8 instanceof C7065m) {
                        return ((C7065m) b8).mo23387v(b9.mo23369V());
                    }
                    if (b8 instanceof C7193u) {
                        if ("length".equals(b9.mo23369V())) {
                            return new C7001i(Double.valueOf((double) b8.mo23369V().length()));
                        }
                        if (C7279z5.m41185k(b9) && b9.mo23368U().doubleValue() < ((double) b8.mo23369V().length())) {
                            return new C7193u(String.valueOf(b8.mo23369V().charAt(b9.mo23368U().intValue())));
                        }
                    }
                    return C7129q.f31955m;
                }
                switch (ordinal) {
                    case C8710R.styleable.AppCompatTheme_dialogPreferredPadding /*62*/:
                        C7279z5.m41182h(C7082n0.TYPEOF.name(), 1, list);
                        C7129q b10 = y4Var.mo24007b((C7129q) list.get(0));
                        if (b10 instanceof C7209v) {
                            str2 = "undefined";
                        } else if (b10 instanceof C6968g) {
                            str2 = "boolean";
                        } else if (b10 instanceof C7001i) {
                            str2 = "number";
                        } else if (b10 instanceof C7193u) {
                            str2 = "string";
                        } else if (b10 instanceof C7113p) {
                            str2 = "function";
                        } else if ((b10 instanceof C7145r) || (b10 instanceof C6985h)) {
                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{b10}));
                        } else {
                            str2 = "object";
                        }
                        return new C7193u(str2);
                    case C8710R.styleable.AppCompatTheme_dialogTheme /*63*/:
                        C7279z5.m41182h(C7082n0.UNDEFINED.name(), 0, list);
                        return C7129q.f31955m;
                    case C8710R.styleable.AppCompatTheme_dividerHorizontal /*64*/:
                        C7279z5.m41183i(C7082n0.VAR.name(), 1, list);
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            C7129q b11 = y4Var.mo24007b((C7129q) it.next());
                            if (b11 instanceof C7193u) {
                                y4Var.mo24010e(b11.mo23369V(), C7129q.f31955m);
                            } else {
                                throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{b11.getClass().getCanonicalName()}));
                            }
                        }
                        return C7129q.f31955m;
                    default:
                        return super.mo23977b(str);
                }
            } else if (list.isEmpty()) {
                return new C7081n();
            } else {
                if (list.size() % 2 == 0) {
                    C7081n nVar = new C7081n();
                    while (i < list.size() - 1) {
                        C7129q b12 = y4Var.mo24007b((C7129q) list.get(i));
                        C7129q b13 = y4Var.mo24007b((C7129q) list.get(i + 1));
                        if ((b12 instanceof C6985h) || (b13 instanceof C6985h)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        nVar.mo23376i(b12.mo23369V(), b13);
                        i += 2;
                    }
                    return nVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            }
        } else if (list.isEmpty()) {
            return new C6951f();
        } else {
            C6951f fVar = new C6951f();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C7129q b14 = y4Var.mo24007b((C7129q) it2.next());
                if (!(b14 instanceof C6985h)) {
                    fVar.mo23389x(i, b14);
                    i++;
                } else {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
            }
            return fVar;
        }
    }
}
