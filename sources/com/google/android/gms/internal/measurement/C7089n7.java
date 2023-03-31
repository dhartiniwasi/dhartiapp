package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* renamed from: com.google.android.gms.internal.measurement.n7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
public final class C7089n7 {
    /* renamed from: a */
    public static C7025j7 m40449a(C7025j7 j7Var) {
        if ((j7Var instanceof C7057l7) || (j7Var instanceof C7041k7)) {
            return j7Var;
        }
        if (j7Var instanceof Serializable) {
            return new C7041k7(j7Var);
        }
        return new C7057l7(j7Var);
    }

    /* renamed from: b */
    public static C7025j7 m40450b(Object obj) {
        return new C7073m7(obj);
    }
}
