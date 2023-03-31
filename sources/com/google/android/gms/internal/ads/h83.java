package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
final class h83 extends x73 {

    /* renamed from: a */
    private final Object f10248a;

    h83(Object obj) {
        this.f10248a = obj;
    }

    /* renamed from: a */
    public final x73 mo10409a(q73 q73) {
        Object apply = q73.apply(this.f10248a);
        b83.m10239c(apply, "the Function passed to Optional.transform() must not return null.");
        return new h83(apply);
    }

    /* renamed from: b */
    public final Object mo10410b(Object obj) {
        return this.f10248a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h83) {
            return this.f10248a.equals(((h83) obj).f10248a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10248a.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.f10248a + ")";
    }
}
