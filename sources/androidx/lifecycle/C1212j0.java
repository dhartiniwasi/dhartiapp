package androidx.lifecycle;

import kotlin.jvm.internal.C11669k;
import p049g0.C4298a;

/* renamed from: androidx.lifecycle.j0 */
/* compiled from: ViewModelProvider.kt */
public final class C1212j0 {
    /* renamed from: a */
    public static final C4298a m5429a(C1217l0 l0Var) {
        C11669k.m56787e(l0Var, "owner");
        if (!(l0Var instanceof C1206i)) {
            return C4298a.C4299a.f24176b;
        }
        C4298a defaultViewModelCreationExtras = ((C1206i) l0Var).getDefaultViewModelCreationExtras();
        C11669k.m56786d(defaultViewModelCreationExtras, "{\n        owner.defaultV…ModelCreationExtras\n    }");
        return defaultViewModelCreationExtras;
    }
}
