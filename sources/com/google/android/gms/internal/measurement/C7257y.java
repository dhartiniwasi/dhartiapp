package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.y */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7257y {

    /* renamed from: a */
    final Map f32192a = new HashMap();

    /* renamed from: b */
    final C7050l0 f32193b = new C7050l0();

    public C7257y() {
        mo24005b(new C7225w());
        mo24005b(new C7273z());
        mo24005b(new C6867a0());
        mo24005b(new C6935e0());
        mo24005b(new C7018j0());
        mo24005b(new C7034k0());
        mo24005b(new C7066m0());
    }

    /* renamed from: a */
    public final C7129q mo24004a(C7262y4 y4Var, C7129q qVar) {
        C7241x xVar;
        C7279z5.m41177c(y4Var);
        if (!(qVar instanceof C7145r)) {
            return qVar;
        }
        C7145r rVar = (C7145r) qVar;
        ArrayList d = rVar.mo23803d();
        String a = rVar.mo23802a();
        if (this.f32192a.containsKey(a)) {
            xVar = (C7241x) this.f32192a.get(a);
        } else {
            xVar = this.f32193b;
        }
        return xVar.mo22991a(a, y4Var, d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo24005b(C7241x xVar) {
        for (C7082n0 b : xVar.f32175a) {
            this.f32192a.put(b.mo23685b().toString(), xVar);
        }
    }
}
