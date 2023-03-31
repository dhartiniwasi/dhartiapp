package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.s8 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class C7170s8 {

    /* renamed from: a */
    private final Object f32053a;

    /* renamed from: b */
    private final int f32054b;

    C7170s8(Object obj, int i) {
        this.f32053a = obj;
        this.f32054b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7170s8)) {
            return false;
        }
        C7170s8 s8Var = (C7170s8) obj;
        if (this.f32053a == s8Var.f32053a && this.f32054b == s8Var.f32054b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f32053a) * 65535) + this.f32054b;
    }
}
