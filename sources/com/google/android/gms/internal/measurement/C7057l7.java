package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.l7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7057l7 implements C7025j7 {

    /* renamed from: a */
    volatile C7025j7 f31805a;

    /* renamed from: b */
    volatile boolean f31806b;

    /* renamed from: c */
    Object f31807c;

    C7057l7(C7025j7 j7Var) {
        Objects.requireNonNull(j7Var);
        this.f31805a = j7Var;
    }

    public final String toString() {
        Object obj = this.f31805a;
        StringBuilder sb = new StringBuilder();
        sb.append("Suppliers.memoize(");
        if (obj == null) {
            obj = "<supplier that returned " + this.f31807c + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final Object zza() {
        if (!this.f31806b) {
            synchronized (this) {
                if (!this.f31806b) {
                    C7025j7 j7Var = this.f31805a;
                    j7Var.getClass();
                    Object zza = j7Var.zza();
                    this.f31807c = zza;
                    this.f31806b = true;
                    this.f31805a = null;
                    return zza;
                }
            }
        }
        return this.f31807c;
    }
}
