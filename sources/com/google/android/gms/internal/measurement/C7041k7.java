package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.k7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7041k7 implements Serializable, C7025j7 {

    /* renamed from: a */
    final C7025j7 f31789a;

    /* renamed from: b */
    volatile transient boolean f31790b;

    /* renamed from: c */
    transient Object f31791c;

    C7041k7(C7025j7 j7Var) {
        Objects.requireNonNull(j7Var);
        this.f31789a = j7Var;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (this.f31790b) {
            obj = "<supplier that returned " + this.f31791c + ">";
        } else {
            obj = this.f31789a;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final Object zza() {
        if (!this.f31790b) {
            synchronized (this) {
                if (!this.f31790b) {
                    Object zza = this.f31789a.zza();
                    this.f31791c = zza;
                    this.f31790b = true;
                    return zza;
                }
            }
        }
        return this.f31791c;
    }
}
