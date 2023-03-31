package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.l0 */
/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
public final class C7050l0 extends C7241x {
    /* renamed from: a */
    public final C7129q mo22991a(String str, C7262y4 y4Var, List list) {
        if (str == null || str.isEmpty() || !y4Var.mo24013h(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        C7129q d = y4Var.mo24009d(str);
        if (d instanceof C7017j) {
            return ((C7017j) d).mo23023a(y4Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}
