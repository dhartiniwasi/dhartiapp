package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.c0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
final class C6901c0 implements Comparator {

    /* renamed from: a */
    final /* synthetic */ C7017j f31599a;

    /* renamed from: b */
    final /* synthetic */ C7262y4 f31600b;

    C6901c0(C7017j jVar, C7262y4 y4Var) {
        this.f31599a = jVar;
        this.f31600b = y4Var;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        C7129q qVar = (C7129q) obj;
        C7129q qVar2 = (C7129q) obj2;
        C7017j jVar = this.f31599a;
        C7262y4 y4Var = this.f31600b;
        if (qVar instanceof C7209v) {
            return !(qVar2 instanceof C7209v) ? 1 : 0;
        }
        if (qVar2 instanceof C7209v) {
            return -1;
        }
        if (jVar == null) {
            return qVar.mo23369V().compareTo(qVar2.mo23369V());
        }
        return (int) C7279z5.m41175a(jVar.mo23023a(y4Var, Arrays.asList(new C7129q[]{qVar, qVar2})).mo23368U().doubleValue());
    }
}
