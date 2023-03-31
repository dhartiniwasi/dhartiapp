package com.google.android.gms.internal.measurement;

import com.pichillilorenzo.flutter_inappwebview.C8710R;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.k0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7034k0 extends C7241x {
    protected C7034k0() {
        this.f32175a.add(C7082n0.ADD);
        this.f32175a.add(C7082n0.DIVIDE);
        this.f32175a.add(C7082n0.MODULUS);
        this.f32175a.add(C7082n0.MULTIPLY);
        this.f32175a.add(C7082n0.NEGATE);
        this.f32175a.add(C7082n0.POST_DECREMENT);
        this.f32175a.add(C7082n0.POST_INCREMENT);
        this.f32175a.add(C7082n0.PRE_DECREMENT);
        this.f32175a.add(C7082n0.PRE_INCREMENT);
        this.f32175a.add(C7082n0.SUBTRACT);
    }

    /* renamed from: a */
    public final C7129q mo22991a(String str, C7262y4 y4Var, List list) {
        C7082n0 n0Var = C7082n0.ADD;
        int ordinal = C7279z5.m41179e(str).ordinal();
        if (ordinal == 0) {
            C7279z5.m41182h(n0Var.name(), 2, list);
            C7129q b = y4Var.mo24007b((C7129q) list.get(0));
            C7129q b2 = y4Var.mo24007b((C7129q) list.get(1));
            if ((b instanceof C7065m) || (b instanceof C7193u) || (b2 instanceof C7065m) || (b2 instanceof C7193u)) {
                return new C7193u(String.valueOf(b.mo23369V()).concat(String.valueOf(b2.mo23369V())));
            }
            return new C7001i(Double.valueOf(b.mo23368U().doubleValue() + b2.mo23368U().doubleValue()));
        } else if (ordinal == 21) {
            C7279z5.m41182h(C7082n0.DIVIDE.name(), 2, list);
            return new C7001i(Double.valueOf(y4Var.mo24007b((C7129q) list.get(0)).mo23368U().doubleValue() / y4Var.mo24007b((C7129q) list.get(1)).mo23368U().doubleValue()));
        } else if (ordinal == 59) {
            C7279z5.m41182h(C7082n0.SUBTRACT.name(), 2, list);
            return new C7001i(Double.valueOf(y4Var.mo24007b((C7129q) list.get(0)).mo23368U().doubleValue() + new C7001i(Double.valueOf(-y4Var.mo24007b((C7129q) list.get(1)).mo23368U().doubleValue())).mo23368U().doubleValue()));
        } else if (ordinal == 52 || ordinal == 53) {
            C7279z5.m41182h(str, 2, list);
            C7129q b3 = y4Var.mo24007b((C7129q) list.get(0));
            y4Var.mo24007b((C7129q) list.get(1));
            return b3;
        } else if (ordinal == 55 || ordinal == 56) {
            C7279z5.m41182h(str, 1, list);
            return y4Var.mo24007b((C7129q) list.get(0));
        } else {
            switch (ordinal) {
                case C8710R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /*44*/:
                    C7279z5.m41182h(C7082n0.MODULUS.name(), 2, list);
                    return new C7001i(Double.valueOf(y4Var.mo24007b((C7129q) list.get(0)).mo23368U().doubleValue() % y4Var.mo24007b((C7129q) list.get(1)).mo23368U().doubleValue()));
                case 45:
                    C7279z5.m41182h(C7082n0.MULTIPLY.name(), 2, list);
                    return new C7001i(Double.valueOf(y4Var.mo24007b((C7129q) list.get(0)).mo23368U().doubleValue() * y4Var.mo24007b((C7129q) list.get(1)).mo23368U().doubleValue()));
                case 46:
                    C7279z5.m41182h(C7082n0.NEGATE.name(), 1, list);
                    return new C7001i(Double.valueOf(-y4Var.mo24007b((C7129q) list.get(0)).mo23368U().doubleValue()));
                default:
                    return super.mo23977b(str);
            }
        }
    }
}
