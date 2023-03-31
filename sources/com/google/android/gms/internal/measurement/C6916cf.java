package com.google.android.gms.internal.measurement;

import com.facebook.ads.AdError;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.cf */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C6916cf extends C7017j {

    /* renamed from: c */
    private final C6984gf f31636c;

    public C6916cf(C6984gf gfVar) {
        super("internal.registerCallback");
        this.f31636c = gfVar;
    }

    /* renamed from: a */
    public final C7129q mo23023a(C7262y4 y4Var, List list) {
        C7279z5.m41182h(this.f31776a, 3, list);
        String V = y4Var.mo24007b((C7129q) list.get(0)).mo23369V();
        C7129q b = y4Var.mo24007b((C7129q) list.get(1));
        if (b instanceof C7113p) {
            C7129q b2 = y4Var.mo24007b((C7129q) list.get(2));
            if (b2 instanceof C7081n) {
                C7081n nVar = (C7081n) b2;
                if (nVar.mo23374f("type")) {
                    this.f31636c.mo23455a(V, nVar.mo23374f("priority") ? C7279z5.m41176b(nVar.mo23387v("priority").mo23368U().doubleValue()) : AdError.NETWORK_ERROR_CODE, (C7113p) b, nVar.mo23387v("type").mo23369V());
                    return C7129q.f31955m;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
