package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i7 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class C7009i7 extends C6993h7 {

    /* renamed from: a */
    private final Object f31750a;

    C7009i7(Object obj) {
        this.f31750a = obj;
    }

    /* renamed from: a */
    public final Object mo23413a() {
        return this.f31750a;
    }

    /* renamed from: b */
    public final boolean mo23414b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7009i7) {
            return this.f31750a.equals(((C7009i7) obj).f31750a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f31750a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f31750a + ")";
    }
}
