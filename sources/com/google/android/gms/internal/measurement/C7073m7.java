package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.m7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7073m7 implements Serializable, C7025j7 {

    /* renamed from: a */
    final Object f31820a;

    C7073m7(Object obj) {
        this.f31820a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7073m7)) {
            return false;
        }
        Object obj2 = this.f31820a;
        Object obj3 = ((C7073m7) obj).f31820a;
        if (obj2 == obj3 || obj2.equals(obj3)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f31820a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.f31820a + ")";
    }

    public final Object zza() {
        return this.f31820a;
    }
}
